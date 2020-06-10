package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mdsd.androidGenerator.Activity;
import org.xtext.example.mdsd.androidGenerator.ActivityType;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
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
        String _plus_1 = (_plus + "/activity/");
        String _name_1 = app.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ".java");
        filesystem.generateFile(String.format(_plus_3, projectName), 
          this.retrieveMainActivity(app));
        String _name_2 = app.getName();
        String _plus_4 = ("%s/src/main/java/" + _name_2);
        String _plus_5 = (_plus_4 + "/activity/ViewPagerAdapter.java");
        filesystem.generateFile(String.format(_plus_5, projectName), 
          this.retrieveViewPagerAdapter(app));
        String _lowerCase = app.getName().toLowerCase();
        String _plus_6 = ("%s/src/main/res/layout/" + _lowerCase);
        String _plus_7 = (_plus_6 + ".xml");
        filesystem.generateFile(String.format(_plus_7, projectName), 
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
        _builder.append("android:id=\"@+id/\"");
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
  
  public String retrieveViewPagerAdapter(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("package ");
    String _name = application.getName();
    _builder.append(_name, " ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("import androidx.fragment.app.Fragment;");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("import androidx.fragment.app.FragmentManager;");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("import androidx.fragment.app.FragmentStatePagerAdapter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public class ViewPagerAdapter extends FragmentStatePagerAdapter {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public ViewPagerAdapter(FragmentManager fm) {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("super(fm);");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public Fragment getItem(int position) {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("switch (position) {");
    _builder.newLine();
    {
      for(final ArrayList<Object> activity : this.activityArrayList) {
        _builder.append("             ");
        _builder.append("case ");
        Object _get = activity.get(1);
        _builder.append(_get, "             ");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("             ");
        _builder.append("    ");
        _builder.append("return new ");
        Object _get_1 = activity.get(2);
        _builder.append(_get_1, "                 ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public int getCount() {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return ");
    int _size = this.activityArrayList.size();
    _builder.append(_size, "         ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
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
    _builder.append("       ");
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("import android.location.LocationManager;");
    _builder.newLine();
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    _builder.append("import android.view.MenuItem;");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("import androidx.annotation.NonNull;");
    _builder.newLine();
    _builder.append("import androidx.appcompat.app.AppCompatActivity;");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.Fragment;");
    _builder.newLine();
    _builder.append("import androidx.fragment.app.FragmentTransaction;");
    _builder.newLine();
    _builder.append("import androidx.viewpager.widget.ViewPager;");
    _builder.newLine();
    _builder.append("import com.google.android.material.bottomnavigation.BottomNavigationView;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = application.getName();
    _builder.append(_name_1);
    _builder.append(" extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private BottomNavigationView mBottomNavigation;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ViewPager viewPager;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ViewPagerAdapter mViewPagerAdapter;");
    _builder.newLine();
    _builder.append("       ");
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
    _builder.append("       ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mBottomNavigation = findViewById(R.id.buttom_navigation);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mBottomNavigation.setOnNavigationItemSelectedListener(this);");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("viewPager = findViewById(R.id.view_pager);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("viewPager.setAdapter(mViewPagerAdapter);");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Permission Check");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!Permissions.Check_FINE_LOCATION(this)) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Permissions.Request_FINE_LOCATION(this, 1234);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (menuItem.getItemId()) {");
    _builder.newLine();
    {
      for(final ArrayList<Object> activity : this.activityArrayList) {
        _builder.append("            ");
        _builder.append("case R.id.");
        Object _get = activity.get(0);
        _builder.append(_get, "            ");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append("viewPager.setCurrentItem(");
        Object _get_1 = activity.get(1);
        _builder.append(_get_1, "                ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append("break;");
        _builder.newLine();
      }
    }
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
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
    _builder.append("       ");
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
    _builder.append("android:layout_height=\"match_parent\"/>");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<androidx.viewpager.widget.ViewPager");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:id=\"@+id/view_pager\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_width=\"match_parent\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:layout_height=\"match_parent\"/>");
    _builder.newLine();
    _builder.append("       ");
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
      if ((_get instanceof Activity)) {
        ArrayList<Object> activityItem = CollectionLiterals.<Object>newArrayList();
        EObject _get_1 = activityList.get(i);
        activityItem.add(((Activity) _get_1).getName());
        activityItem.add(Integer.valueOf(i));
        EObject _get_2 = activityList.get(i);
        ActivityType _activityType = ((Activity) _get_2).getActivityType();
        EObject _get_3 = activityList.get(i);
        ActivityType _activityType_1 = ((Activity) _get_3).getActivityType();
        boolean _equals = Objects.equal(_activityType, ((TypeMap) ((ActivityType) _activityType_1)));
        if (_equals) {
          activityItem.add("MapsFragment");
          activityItem.add("maps");
        } else {
          activityItem.add("StandardFragment");
          activityItem.add("standard");
        }
        int _size = activityItem.size();
        boolean _equals_1 = (_size == 4);
        if (_equals_1) {
          this.activityArrayList.add(activityItem);
        }
      }
    }
  }
}
