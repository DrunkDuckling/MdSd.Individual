package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.LayoutElement;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen;

@SuppressWarnings("all")
public class MainActivityGen extends AbstractGen {
  private ArrayList<ArrayList<Object>> activityArrayList = CollectionLiterals.<ArrayList<Object>>newArrayList();
  
  @Override
  public void generate(final List<Application> applications, final IFileSystemAccess2 filesystem) {
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        this.constructActivityArray(app);
        String _name = app.getName();
        String _plus = ("%s/src/main/java/" + _name);
        String _plus_1 = (_plus + "/");
        String _name_1 = app.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ".java");
        filesystem.generateFile(String.format(_plus_3, projectName), 
          this.retrieveMainActivity(app));
        String _lowerCase = app.getName().toLowerCase();
        String _plus_4 = ("%s/src/main/res/layout/" + _lowerCase);
        String _plus_5 = (_plus_4 + ".xml");
        filesystem.generateFile(String.format(_plus_5, projectName), 
          this.retrieveMainXML(app));
        filesystem.generateFile(String.format("%s/src/main/res/menu/item_menu.xml", projectName), 
          this.retrieveItemMenu(app));
        filesystem.generateFile(String.format("%s/src/main/res/drawable/ic_maps.xml", projectName), 
          this.retrieveIcons(app));
      }
    }
  }
  
  public String retrieveItemMenu(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">");
    _builder.newLine();
    _builder.newLine();
    {
      for(final ArrayList<Object> activity : this.activityArrayList) {
        _builder.append("     ");
        _builder.append("<item");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("    ");
        _builder.append("android:id=\"@+id/Nav_");
        Object _get = activity.get(0);
        _builder.append(_get, "         ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("    ");
        _builder.append("android:icon=\"@drawable/ic_");
        Object _get_1 = activity.get(3);
        _builder.append(_get_1, "         ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("    ");
        _builder.append("android:title=\"");
        Object _get_2 = activity.get(0);
        _builder.append(_get_2, "         ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("</menu>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String retrieveIcons(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:width=\"24dp\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:height=\"24dp\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:viewportWidth=\"26.086956\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:viewportHeight=\"26.086956\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:tint=\"#FFFFFF\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<group android:translateX=\"1.0434783\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("android:translateY=\"1.0434783\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<path");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("android:fillColor=\"#FF000000\"");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("android:pathData=\"M20.5,3l-0.16,0.03L15,5.1 9,3 3.36,4.9c-0.21,0.07 -0.36,0.25 -0.36,0.48V20.5c0,0.28 0.22,0.5 0.5,0.5l0.16,-0.03L9,18.9l6,2.1 5.64,-1.9c0.21,-0.07 0.36,-0.25 0.36,-0.48V3.5c0,-0.28 -0.22,-0.5 -0.5,-0.5zM15,19l-6,-2.11V5l6,2.11V19z\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</group>");
    _builder.newLine();
    _builder.append("</vector>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String retrieveMainActivity(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = application.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.content.pm.PackageManager;");
    _builder.newLine();
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    _builder.append("import android.view.MenuItem;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import androidx.annotation.NonNull;");
    _builder.newLine();
    _builder.append("import androidx.core.app.ActivityCompat;");
    _builder.newLine();
    _builder.append("import androidx.core.content.ContextCompat;");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.Fragment;");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.FragmentActivity;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.example.mdsdproject.fragments.MapsFragment;");
    _builder.newLine();
    _builder.append("import com.example.mdsdproject.fragments.SettingsFragment;");
    _builder.newLine();
    _builder.append("import com.google.android.material.bottomnavigation.BottomNavigationView;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = application.getName();
    _builder.append(_name_1);
    _builder.append(" extends FragmentActivity {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final int REQUEST_ID_MULTIPLE_PERMISSIONS = 1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setContentView(R.layout.activity_main);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("BottomNavigationView navigationView = findViewById(R.id.buttom_navigation);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("navigationView.setOnNavigationItemSelectedListener(navItemSelectedListener);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Checks if any permissions are in use");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("checkAndRequestPermissions();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("new SettingsFragment()).commit();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private BottomNavigationView.OnNavigationItemSelectedListener navItemSelectedListener =");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("new BottomNavigationView.OnNavigationItemSelectedListener() {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("public boolean onNavigationItemSelected(@NonNull MenuItem item) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("Fragment selectedFragment = null;");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("switch (item.getItemId()) {");
    _builder.newLine();
    {
      for(final ArrayList<Object> activity : this.activityArrayList) {
        _builder.append("                    \t");
        _builder.append("case R.id.Nav_");
        Object _get = activity.get(0);
        _builder.append(_get, "                    \t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("                    \t");
        _builder.append("     ");
        _builder.append("selectedFragment = new ");
        Object _get_1 = activity.get(0);
        _builder.append(_get_1, "                    \t     ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("                    \t");
        _builder.append("     ");
        _builder.append("break;");
        _builder.newLine();
      }
    }
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("selectedFragment).commit();");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("private  boolean checkAndRequestPermissions() {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("int camera = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("int storage = ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("int loc = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("int loc2 = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("List<String> listPermissionsNeeded = new ArrayList<>();");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if (camera != PackageManager.PERMISSION_GRANTED) {");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("listPermissionsNeeded.add(android.Manifest.permission.CAMERA);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if (storage != PackageManager.PERMISSION_GRANTED) {");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("listPermissionsNeeded.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if (loc2 != PackageManager.PERMISSION_GRANTED) {");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("listPermissionsNeeded.add(android.Manifest.permission.ACCESS_FINE_LOCATION);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if (loc != PackageManager.PERMISSION_GRANTED) {");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("listPermissionsNeeded.add(android.Manifest.permission.ACCESS_COARSE_LOCATION);");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if (!listPermissionsNeeded.isEmpty())");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("ActivityCompat.requestPermissions(this,listPermissionsNeeded.toArray");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("(new String[listPermissionsNeeded.size()]),REQUEST_ID_MULTIPLE_PERMISSIONS);");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String retrieveMainXML(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:app=\"http://schemas.android.com/apk/res-auto\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:tools=\"http://schemas.android.com/tools\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:layout_height=\"match_parent\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("tools:context=\".");
    String _name = application.getName();
    _builder.append(_name, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<FrameLayout");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/container_frame_layout\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_above=\"@+id/buttom_navigation\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<com.google.android.material.bottomnavigation.BottomNavigationView");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/buttom_navigation\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"wrap_content\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:background=\"@color/colorPrimary\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_alignParentBottom=\"true\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("app:itemIconTint=\"#ffff\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("app:itemTextColor=\"#ffff\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("app:menu=\"@menu/item_menu\"/>");
    _builder.newLine();
    _builder.append("</RelativeLayout>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void constructActivityArray(final Application application) {
    ApplicationElementList elements = this.<ApplicationElementList>getFieldData(application.getAttributes(), ApplicationElementList.class);
    EList<EObject> activityList = elements.eContents();
    this.activityArrayList = CollectionLiterals.<ArrayList<Object>>newArrayList();
    for (int i = 0; (i < activityList.size()); i++) {
      EObject _get = activityList.get(i);
      if ((_get instanceof Fragment)) {
        ArrayList<Object> activityItem = CollectionLiterals.<Object>newArrayList();
        EObject _get_1 = activityList.get(i);
        ActivityLayoutAttributes layout = this.<ActivityLayoutAttributes>getFieldData(
          ((Fragment) _get_1).getActivityAttributes(), 
          ActivityLayoutAttributes.class);
        EObject _get_2 = activityList.get(i);
        activityItem.add(((Fragment) _get_2).getName());
        activityItem.add(Integer.valueOf(i));
        boolean _notEquals = (!Objects.equal(layout, null));
        if (_notEquals) {
          EList<LayoutElement> _layoutElements = layout.getLayoutElements();
          for (final LayoutElement type : _layoutElements) {
            {
              if ((type instanceof TypeMap)) {
                activityItem.add("MapsFragment");
                activityItem.add("maps");
              }
              if ((type instanceof TypeSetting)) {
                activityItem.add("SetFragment");
                activityItem.add("Setting");
              }
              if (((!(type instanceof TypeMap)) && (!(type instanceof TypeSetting)))) {
                activityItem.add("LayoutFragment");
                activityItem.add("Layout");
              }
            }
          }
        } else {
          activityItem.add("StandardFragment");
          activityItem.add("standard");
        }
        int _size = activityItem.size();
        boolean _equals = (_size == 4);
        if (_equals) {
          this.activityArrayList.add(activityItem);
        }
      }
    }
  }
}
