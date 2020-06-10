package org.xtext.example.mdsd.generator.filegen

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion

class GradleGen extends AbstractGen {
	

	override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			filesystem.generateFile(String.format("%s/build.gradle", projectName),
				retrieveGradle(app)
			);
		}
	}
	
	def String retrieveGradle(Application app) {
		if(getFieldData(app.attributes, typeof(ApplicationVersion)) !=null){
			val ApplicationVersion = getFieldData(app.attributes, typeof(ApplicationVersion))
			return '''
				apply plugin: 'com.android.application'
				
				android{
					compileSdkVersion"«ApplicationVersion.result.value»"
					    buildToolsVersion "29.0.3"
					    defaultConfig {
					        applicationId "«app.name»"
					        minSdkVersion "«ApplicationVersion.targetsdk.minsdk.result.value»"
					        targetSdkVersion "«ApplicationVersion.targetsdk.result.value»"
					        versionCode 1
					        versionName "1.0"
					        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
					    }
					    buildTypes {
					        release {
					            minifyEnabled false
					            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
					        }
					    }
					}
					
					dependencies {
					    implementation fileTree(dir: 'libs', include: ['*.jar'])
					    implementation 'androidx.appcompat:appcompat:1.0.2'
					    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
					    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
					    testImplementation 'junit:junit:4.12'
					    androidTestImplementation 'androidx.test.ext:junit:1.1.0'
					    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
					    implementation 'com.android.support:design:28.0.0'
					    implementation 'com.google.android.gms:play-services-maps:16.1.0'
				}
			''';
		} else {
		
		return
		'''
			apply plugin: 'com.android.application'
			
			android{
				compileSdkVersion"29"
				    buildToolsVersion "29.0.3"
				    defaultConfig {
				        applicationId "«app.name»"
				        minSdkVersion "21"
				        targetSdkVersion "29"
				        versionCode 1
				        versionName "1.0"
				        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
				    }
				    buildTypes {
				        release {
				            minifyEnabled false
				            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
				        }
				    }
				}
				
				dependencies {
				    implementation fileTree(dir: 'libs', include: ['*.jar'])
				    implementation 'androidx.appcompat:appcompat:1.0.2'
				    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
				    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
				    testImplementation 'junit:junit:4.12'
				    androidTestImplementation 'androidx.test.ext:junit:1.1.0'
				    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
				    implementation 'com.android.support:design:28.0.0'
				    implementation 'com.google.android.gms:play-services-maps:16.1.0'
			}
		''';
		}
	}
}
	
