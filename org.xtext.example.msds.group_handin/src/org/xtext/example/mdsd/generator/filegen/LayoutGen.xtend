package org.xtext.example.mdsd.generator.filegen
 
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.example.mdsd.androidGenerator.Activity
import org.xtext.example.mdsd.androidGenerator.Application
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes
import org.xtext.example.mdsd.androidGenerator.Button
import org.xtext.example.mdsd.androidGenerator.TextView
import java.util.concurrent.atomic.AtomicInteger
 
class LayoutGen extends AbstractGen{
   
    override generate(List<Application> applications, IFileSystemAccess2 filesystem) {
        for (app : applications){
            val projectName = getProjectName(applications, app);
            val appElements = getFieldData(app.attributes, typeof(ApplicationElementList));
           
            if (appElements != null) { 
                    appElements.elements.filter[element | element instanceof Activity].forEach[curr |
                    var activity = curr as Activity;
                   
                    filesystem.generateFile(String.format("%s/src/main/res/layout/%s.xml", projectName,
                        javaToAndroidIdentifier(activity.name)
                    ),
                        generateLayout(activity)
                    );
                ];
            }
        }
    }
   
   
    private def String generateLayout(Activity activity){
        // is needed later for implementing buttons and so on.
        var layout = getFieldData(activity.activityAttributes, typeof(ActivityLayoutAttributes));
       
        var map = activity.activityType;
        var isMapActivity = map != null;
       
       
        val string = new StringBuilder();
       
       
        if (isMapActivity) {
            string.append( '''
        <?xml version="1.0" encoding="utf-8"?>
        <fragment xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:map="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/map"
            android:name="com.google.android.gms.maps.SupportMapFragment"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«activity.name»" />
        ''');
        } else {
            string.append('''
        <?xml version="1.0" encoding="utf-8"?>
        <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".«activity.name»">
        ''');
        }
       
        if(layout != null){
            val AtomicInteger textIndex = new AtomicInteger(0);
            layout.layoutElements.forEach[element |
                if (element instanceof Button) {
                    var buttonTitleRes = javaToAndroidIdentifier(activity.name) + "_"
                        + javaToAndroidIdentifier(element.name) + "_title";
                   
                    string.append('''
                   
                        <Button
                            android:id="@+id/«javaToAndroidIdentifier(element.name)»"
                            android:text="@string/«buttonTitleRes»"
                            android:layout_height="wrap_content"
                            android:layout_width="match_parent" />
                    ''');
                }else if (element instanceof TextView) {
                    var textTitleRes = javaToAndroidIdentifier(activity.name) + "_text" + textIndex;
                    textIndex.addAndGet(1);
                   
                    string.append('''
                   
                        <TextView android:text="@string/«textTitleRes»"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content" />
                    ''');
                }
            ];
        }
       
        if (isMapActivity) {
            string.append('''
            />
        ''');
        } else {
            string.append('''
            </FrameLayout>
        ''');
        }
       
       
       
        return string.toString;
    }
   
   
}