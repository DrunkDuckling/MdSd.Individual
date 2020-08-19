package org.xtext.example.mdsd.generator.filegen

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen

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
		
		var ApplicationPermissionList permissions = getFieldData(application.attributes, typeof(ApplicationPermissionList));
		
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
				
		     <meta-data
		     	android:name="com.google.android.geo.API_KEY"
		     	android:value="PLACE OR REF TO GOOGLE KEY HERE" />
		     	
		     <activity
		     	android:name=".activity.«application.name»"
		     	android:label="@string/«javaToAndroidIdentifier(application.name)»_title">
		     	<intent-filter>
		     		<action android:name="android.intent.action.MAIN" />
		     		<category android:name="android.intent.category.LAUNCHER" />
		     	</intent-filter>
		     </activity>
		     
		    </application>
		
		</manifest>
		''';
	}
	
	// Creates a for loop that generates the permissions needed/specified in the grammar
	private def String generatePermissions(ApplicationPermissionList permissions) {
		return  '''
		«IF permissions.permissions !== null»
			«FOR permission : permissions.permissions»
				<uses-permission android:name="«permission.name»" />
			«ENDFOR» 
		«ELSE»
			<!-- No permissions specified in DSL -->
		«ENDIF»
		''';
	}
	
	
}