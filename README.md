# MDSD-Group-Handin
 
Test.zip is the output project that we want. The files that we are interested in is:
- app/manifests/AndroidManifest.xml
- app/java/com.example.test/
- app/res/layout/activity_maps.xml
- app/res/raw/map_style.json
- app/res/values/google_maps_api.xml (Replace API key)



The files that will be generated is:
- For each activity:
 - XXXActivity.java
 - activity_XXX.xml
- Android Manifest File
- Resources (google_maps_api.xml fx)
- Gradle.build

# Xtext example 
```
Application MapsAppTest
permissions 
    "android.permission.INTERNET", 
    "android.permission.ACCESS_FINE_LOCATION", 
    "android.permission.ACCESS_COARSE_LOCATION"
Android-SDK: 29
Target-SDK: 29
Minimum-SDK: 25
main-activity MapsActivity
elements
	Activity:Maps MapsActivity
		FilterQuery
			Hotels
			Distance:m<500
	Activity TextViewActivity
		TextView HelloWorld
```
 
