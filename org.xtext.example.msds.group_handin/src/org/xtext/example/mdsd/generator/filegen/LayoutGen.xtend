package org.xtext.example.mdsd.generator.filegen
 
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import org.xtext.example.mdsd.androidGenerator.Button
import java.util.concurrent.atomic.AtomicInteger
import org.xtext.example.mdsd.androidGenerator.Fragment
import org.xtext.example.mdsd.androidGenerator.TypeMap
import org.xtext.example.mdsd.androidGenerator.TypeSetting
import org.xtext.example.mdsd.androidGenerator.EditText
import org.xtext.example.mdsd.androidGenerator.Spinner
import org.xtext.example.mdsd.androidGenerator.TextView
import org.xtext.example.mdsd.androidGenerator.FragmentLayoutAttributes

class LayoutGen extends AbstractGen{
   
    override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
        for (app : applications){
            val projectName = getProjectName(applications, app);
            val appElements = getFieldData(app.attributes, typeof(ApplicationElementList));
           
            if (appElements != null) { 
                    appElements.elements.filter[element | element instanceof Fragment].forEach[curr |
                    var fragment = curr as Fragment;
                   
                    filesystem.generateFile(String.format("%s/src/main/res/layout/%s.xml", projectName,
                        javaToAndroidIdentifier(fragment.name)
                    ),
                        generateLayout(fragment)
                    );
                ];
            }
        }
    }
   
   
    private def String generateLayout(Fragment fragment){
        // is needed later for implementing buttons and so on.
        var FragmentLayoutAttributes layout = getFieldData(fragment.fragmentAttributes, typeof(FragmentLayoutAttributes));
        var isMap = false;
        var isSetting = false;
        if(layout != null){
        	for (check: layout.layoutElements){
        		if (check instanceof TypeMap){
        			isMap = true
        		}else if (check instanceof TypeSetting){
        			isSetting = true
        		}
        	}
        }
        
        val string = new StringBuilder();
       
       
        if (isMap) {
            string.append( '''
        <?xml version="1.0" encoding="utf-8"?>
        <fragment xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:map="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/map"
            android:name="com.google.android.gms.maps.SupportMapFragment"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«fragment.name»" />
        ''');
        }else if(isSetting){
        	string.append( '''
        <?xml version="1.0" encoding="utf-8"?>
        <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«fragment.name»">
        
        
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">
        
                <Button
                    android:id="@+id/button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/button"/>
        
                <EditText
                    android:id="@+id/editTextNumber"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:autofillHints=""
                    android:ems="10"
                    android:hint="@string/set_search_radius"
                    android:inputType="number"
                    android:text="500"
                    tools:ignore="LabelFor" />
        
                <Spinner
                    android:id="@+id/spinner"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content" />
            </LinearLayout>
        </FrameLayout>
        ''');
        }else {
            string.append('''
        <?xml version="1.0" encoding="utf-8"?>
        <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«fragment.name»">
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">
        ''');
        }
       
        if(layout != null){
            layout.layoutElements.forEach[element |
                if (element instanceof Button) {
                    var buttonTitleRes = javaToAndroidIdentifier(fragment.name) + "_"
                        + javaToAndroidIdentifier(element.name) + "_btn";
                   
                    string.append('''
                        <Button
                            android:id="@+id/«javaToAndroidIdentifier(element.name)»"
                            android:text="@string/«buttonTitleRes»"
                            android:layout_height="wrap_content"
                            android:layout_width="match_parent" />
                    ''');
                }else if (element instanceof EditText) {                   
                    string.append('''
                        <EditText
                            android:id="@+id/«javaToAndroidIdentifier(element.name)»"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:autofillHints=""
                            android:ems="10"
                            android:hint="Set Search Radius"
                            android:inputType="number"
                            tools:ignore="LabelFor" />
                    ''');
                }else if (element instanceof Spinner) {                   
                    string.append('''
                         <Spinner
                            android:id="@+id/«javaToAndroidIdentifier(element.name)»"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content" />
                    ''');
                }else if (element instanceof TextView) {
                	string.append('''
                         <TextView
                             android:id="@+id/«javaToAndroidIdentifier(element.name)»"
                             android:layout_height="wrap_content"
                             android:layout_width="match_parent"
                             android:text="Place holder for new text" />
                    ''');
                }
            ];
        }
 		string.append('''
 		    </LinearLayout>
 		</FrameLayout>''');
        return string.toString;
    }
   
   
}