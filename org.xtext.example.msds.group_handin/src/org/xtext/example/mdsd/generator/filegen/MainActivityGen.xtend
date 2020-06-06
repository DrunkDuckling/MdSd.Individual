package org.xtext.example.mdsd.generator.filegen
 
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Activity
import org.xtext.example.mdsd.androidGenerator.ActivityType
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
import org.xtext.example.mdsd.androidGenerator.TypeMap
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import java.util.ArrayList
 
class MainActivityGen extends AbstractGen {
    ArrayList<ArrayList<Object>> activityArrayList = newArrayList();
   
    override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
        for (app: applications) {
            var projectName = getProjectName(applications, app);
           
            constructActivityArray(app);
           
            filesystem.generateFile(String.format("%s/src/main/java/" + app.name + "/activity/" + app.name + ".java", projectName),
                retrieveMainActivity(app)
            );
           
            filesystem.generateFile(String.format("%s/src/main/java/" + app.name + "/activity/ViewPagerAdapter.java", projectName),
                retrieveViewPagerAdapter(app)
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
                android:id="@+id/"«activity.get(0)»"
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
   
 
    def retrieveViewPagerAdapter(Application application) {
        return '''
        package «application.name»;
       
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentStatePagerAdapter;
       
        public class ViewPagerAdapter extends FragmentStatePagerAdapter {
       
            public ViewPagerAdapter(FragmentManager fm) {
                super(fm);
            }
       
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    «FOR activity : activityArrayList»
                    case «activity.get(1)»:
                        return new «activity.get(2)»();
                    «ENDFOR»
                }
                return null;
            }
       
            @Override
            public int getCount() {
                return «activityArrayList.size()»;
            }
        }
        '''
    }
   
    def String retrieveMainActivity(Application application) {
        return '''
        package «application.name»;
       
        import android.content.Context;
        import android.location.LocationManager;
        import android.os.Bundle;
        import android.view.MenuItem;
       
        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentTransaction;
        import androidx.viewpager.widget.ViewPager;
        import com.google.android.material.bottomnavigation.BottomNavigationView;
        
        
        public class «application.name» extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
        
            private BottomNavigationView mBottomNavigation;
            private ViewPager viewPager;
            private ViewPagerAdapter mViewPagerAdapter;
       
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
       
                mBottomNavigation = findViewById(R.id.buttom_navigation);
                mBottomNavigation.setOnNavigationItemSelectedListener(this);
       
                viewPager = findViewById(R.id.view_pager);
                mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPager.setAdapter(mViewPagerAdapter);
       
                // Permission Check
                if (!Permissions.Check_FINE_LOCATION(this)) {
                    Permissions.Request_FINE_LOCATION(this, 1234);
                }
            }
       
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    «FOR activity : activityArrayList»
                    case R.id.«activity.get(0)»:
                        viewPager.setCurrentItem(«activity.get(1)»);
                        break;
                    «ENDFOR»
                }
                return true;
            }'''
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
                android:layout_height="match_parent"/>
       
            <androidx.viewpager.widget.ViewPager
                android:id="@+id/view_pager"
                android:layout_width="match_parent"
                android:layout_height="match_parent"/>
       
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
            if (activityList.get(i) instanceof Activity) {
                // Init Array Item
                var activityItem = newArrayList();
 
                // Add Name to list
                activityItem.add((activityList.get(i) as Activity).name)
           
                // Add Index to list
                activityItem.add(i)
           
                // Check Type and add to list
                if ((activityList.get(i) as Activity).activityType == ((activityList.get(i) as Activity).activityType as ActivityType) as TypeMap) {
                    activityItem.add("MapsFragment")
                    activityItem.add("maps")
                } else {
                    activityItem.add("StandardFragment")
                    activityItem.add("standard")   
                }
               
                // Checks if all info is here
                if (activityItem.size() == 4) {
                    // Add item to list
                    activityArrayList.add(activityItem)
                }
            }
        }
    }
}