package org.xtext.example.mdsd.generator.filegen

import java.util.List
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
import org.xtext.example.mdsd.androidGenerator.ApplicationMainActivity
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import org.xtext.example.mdsd.androidGenerator.Activity
import org.eclipse.xtext.generator.IFileSystemAccess2

class ManifestGen extends AbstractGen {
	
	override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			filesystem.generateFile(String.format("%s/src/main/AndroidManifest.xml", projectName),
				retrieveAndroidManifest(app)
			);
		}
	}
	
	
	private def String retrieveAndroidManifest(Application application) {
		// TODO maybe build xml directly (Nope, we fucking code it brah!)
		
		var ApplicationPermissionList permissions = getFieldData(application.attributes, typeof(ApplicationPermissionList));
		var ApplicationMainActivity mainActivity = getFieldData(application.attributes, typeof(ApplicationMainActivity));
		var ApplicationElementList elements = getFieldData(application.attributes, typeof(ApplicationElementList));
		
		return '''
		<?xml version="1.0" encoding="utf-8"?>
		<manifest xmlns:android="http://schemas.android.com/apk/res/android"
		    package=«application.name»" >
		    
		    «generatePermissions(permissions)» 
		    
		    <application
				android:allowBackup="true"
				android:icon="@mipmap/ic_launcher"
				android:label="@string/app_name"
				android:roundIcon="@mipmap/ic_launcher_round"
				android:supportsRtl="true"
				android:theme="@style/AppTheme">
				
		     «generateMetaData(elements, mainActivity)»
		     
		    </application>
		
		</manifest>
		''';
	}
	
	// Creates a for loop that generates the permissions needed/specified in the grammar
	private def String generatePermissions(ApplicationPermissionList permissions) {
		return  '''
		«FOR permission : permissions.permissions»
			<uses-permission android:name="«permission.name»" />
		«ENDFOR» 
		''';
	}
	
	// Method used to sort out in the elements, such as main activity or fragments and so on. 
	private def String generateMetaData(ApplicationElementList elements, ApplicationMainActivity mainActivity){
		var result = "";
		
		for (element : elements.elements) {
			if (element instanceof Activity) {
				result += generateActivity(element as Activity,
					mainActivity != null && element.equals(mainActivity.launcherActivity)
				);
			}
		}
		return result;
	}
	
	// Method used to generate metadata for the main activity in manifest file
	private def String generateActivity(Activity activity, boolean launchable) {
		return '''
		<meta-data
			android:name="com.google.android.geo.API_KEY"
		    android:value="PLACE OR REF TO GOOGLE KEY HERE" />
		     
		<activity
			android:name=".activity.«activity.name»"
		    android:label="@string/«javaToAndroidIdentifier(activity.name)»_title">
		    <intent-filter>
		    	<action android:name="android.intent.action.MAIN" />
		        <category android:name="android.intent.category.LAUNCHER" />
			</intent-filter>
		</activity>
		''';
	}
	
}