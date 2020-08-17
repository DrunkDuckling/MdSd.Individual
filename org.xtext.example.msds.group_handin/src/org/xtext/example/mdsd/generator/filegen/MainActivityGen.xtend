package org.xtext.example.mdsd.generator.filegen

import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
import org.xtext.example.mdsd.androidGenerator.Fragment
import org.xtext.example.mdsd.androidGenerator.TypeMap
import org.xtext.example.mdsd.androidGenerator.TypeSetting
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes

class MainActivityGen extends AbstractGen {
    ArrayList<ArrayList<Object>> activityArrayList = newArrayList();
   
    override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
        for (app: applications) {
            var projectName = getProjectName(applications, app);
           
            constructActivityArray(app);
           	
        	filesystem.generateFile(String.format("%s/src/main/java/" + app.name + "/" + app.name + ".java", projectName),
                retrieveMainActivity(app)
            );
           
            filesystem.generateFile(String.format("%s/src/main/res/layout/" + app.name.toLowerCase + ".xml", projectName),
                retrieveMainXML(app)
            );
           
            filesystem.generateFile(String.format("%s/src/main/res/menu/item_menu.xml", projectName),
                retrieveItemMenu(app)
            );
           
            //TODO Make for loop to figure out which activities to make logoes for
            filesystem.generateFile(String.format("%s/src/main/res/drawable/ic_maps.xml", projectName),
                retrieveIcons(app)
            );
        }
    }
   
    def retrieveItemMenu(Application application) {
        return '''
        <?xml version="1.0" encoding="utf-8"?>
        <menu xmlns:android="http://schemas.android.com/apk/res/android">
       
            «FOR activity : activityArrayList»
            <item
                android:id="@+id/Nav_«activity.get(0)»"
                android:icon="@drawable/ic_«activity.get(3)»"
                android:title="«activity.get(0)»"/>
            «ENDFOR»
        </menu>
        '''
    }
   
    def retrieveIcons(Application application) {
        return '''
        <vector xmlns:android="http://schemas.android.com/apk/res/android"
            android:width="24dp"
            android:height="24dp"
            android:viewportWidth="26.086956"
            android:viewportHeight="26.086956"
            android:tint="#FFFFFF">
          <group android:translateX="1.0434783"
              android:translateY="1.0434783">
              <path
                  android:fillColor="#FF000000"
                  android:pathData="M20.5,3l-0.16,0.03L15,5.1 9,3 3.36,4.9c-0.21,0.07 -0.36,0.25 -0.36,0.48V20.5c0,0.28 0.22,0.5 0.5,0.5l0.16,-0.03L9,18.9l6,2.1 5.64,-1.9c0.21,-0.07 0.36,-0.25 0.36,-0.48V3.5c0,-0.28 -0.22,-0.5 -0.5,-0.5zM15,19l-6,-2.11V5l6,2.11V19z"/>
          </group>
        </vector>
        '''
    }
   
    def String retrieveMainActivity(Application application) {
        return '''
        package «application.name»;
        
        import android.content.pm.PackageManager;
        import android.os.Bundle;
        import android.view.MenuItem;
        
        import androidx.annotation.NonNull;
        import androidx.core.app.ActivityCompat;
        import androidx.core.content.ContextCompat;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentActivity;
        
        import com.example.mdsdproject.fragments.MapsFragment;
        import com.example.mdsdproject.fragments.SettingsFragment;
        import com.google.android.material.bottomnavigation.BottomNavigationView;
        
        import java.util.ArrayList;
        import java.util.List;
        
        
        public class «application.name» extends FragmentActivity {
        	
        	public static final int REQUEST_ID_MULTIPLE_PERMISSIONS = 1;
        	
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        
                BottomNavigationView navigationView = findViewById(R.id.buttom_navigation);
                navigationView.setOnNavigationItemSelectedListener(navItemSelectedListener);
                // Checks if any permissions are in use
                checkAndRequestPermissions();
                getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,
                        new SettingsFragment()).commit();
            }
            
            private BottomNavigationView.OnNavigationItemSelectedListener navItemSelectedListener =
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            Fragment selectedFragment = null;
                            switch (item.getItemId()) {
                            	«FOR activity : activityArrayList»
                            	case R.id.Nav_«activity.get(0)»:
                            	     selectedFragment = new «activity.get(0)»();
                            	     break;
                            	«ENDFOR»
                            }
                            getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,
                                    selectedFragment).commit();
                            return true;
                        }
                    };
                    
                    
             private  boolean checkAndRequestPermissions() {
                 int camera = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA);
                 int storage = ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
                 int loc = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION);
                 int loc2 = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION);
                 List<String> listPermissionsNeeded = new ArrayList<>();
         
                 if (camera != PackageManager.PERMISSION_GRANTED) {
                     listPermissionsNeeded.add(android.Manifest.permission.CAMERA);
                 }
                 if (storage != PackageManager.PERMISSION_GRANTED) {
                     listPermissionsNeeded.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
                 }
                 if (loc2 != PackageManager.PERMISSION_GRANTED) {
                     listPermissionsNeeded.add(android.Manifest.permission.ACCESS_FINE_LOCATION);
                 }
                 if (loc != PackageManager.PERMISSION_GRANTED) {
                     listPermissionsNeeded.add(android.Manifest.permission.ACCESS_COARSE_LOCATION);
                 }
                 if (!listPermissionsNeeded.isEmpty())
                 {
                     ActivityCompat.requestPermissions(this,listPermissionsNeeded.toArray
                             (new String[listPermissionsNeeded.size()]),REQUEST_ID_MULTIPLE_PERMISSIONS);
                     return false;
                 }
                 return true;
             }
                    '''
    }
   
    def String retrieveMainXML(Application application) {
        return '''
        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«application.name»">
            
            <FrameLayout
                android:id="@+id/container_frame_layout"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_above="@+id/buttom_navigation"/>
                
            <com.google.android.material.bottomnavigation.BottomNavigationView
                android:id="@+id/buttom_navigation"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@color/colorPrimary"
                android:layout_alignParentBottom="true"
                app:itemIconTint="#ffff"
                app:itemTextColor="#ffff"
                app:menu="@menu/item_menu"/>
        </RelativeLayout>
        '''
    }
   
    def constructActivityArray(Application application) {
        var ApplicationElementList elements = getFieldData(application.attributes, typeof(ApplicationElementList));
        var activityList = elements.eContents();
       
        // Init Array
        activityArrayList = newArrayList();
       
        for (var i = 0; i < activityList.size(); i++) {
            if (activityList.get(i) instanceof Fragment) {
                // Init Array Item
                var activityItem = newArrayList();
                var ActivityLayoutAttributes layout = getFieldData(
                	(activityList.get(i) as Fragment).activityAttributes,
                	typeof(ActivityLayoutAttributes)
                );
 
                // Add Name to list
                activityItem.add((activityList.get(i) as Fragment).name)
           
                // Add Index to list
                activityItem.add(i)
           
                // Check Type and add to list
                if(layout != null){
		        	for(type : layout.layoutElements){
		        		if( type instanceof TypeMap){
		        			activityItem.add("MapsFragment")
                    		activityItem.add("maps")
		        		}if(type instanceof TypeSetting){
		        			activityItem.add("SetFragment")
                			activityItem.add("Setting")
		        		}if(!(type instanceof TypeMap) && !(type instanceof TypeSetting)){
        					activityItem.add("LayoutFragment")
                    		activityItem.add("Layout")
        				}
		       		}
		        }else {
		        	activityItem.add("StandardFragment")
                    activityItem.add("standard") 
		        }
                print(activityItem.toString)
                // Checks if all info is here
                if (activityItem.size() >= 4) {
                    // Add item to list
                    activityArrayList.add(activityItem)
                }
            }
        }
    }
}