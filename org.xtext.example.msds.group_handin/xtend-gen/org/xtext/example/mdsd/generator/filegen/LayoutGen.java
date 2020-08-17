package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.EditText;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.LayoutElement;
import org.xtext.example.mdsd.androidGenerator.Spinner;
import org.xtext.example.mdsd.androidGenerator.TextView;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen;

@SuppressWarnings("all")
public class LayoutGen extends AbstractGen {
  @Override
  public void generate(final List<Application> applications, final IFileSystemAccess2 filesystem) {
    for (final Application app : applications) {
      {
        final String projectName = this.getProjectName(applications, app);
        final ApplicationElementList appElements = this.<ApplicationElementList>getFieldData(app.getAttributes(), ApplicationElementList.class);
        boolean _notEquals = (!Objects.equal(appElements, null));
        if (_notEquals) {
          final Function1<ApplicationElement, Boolean> _function = (ApplicationElement element) -> {
            return Boolean.valueOf((element instanceof Fragment));
          };
          final Consumer<ApplicationElement> _function_1 = (ApplicationElement curr) -> {
            Fragment fragment = ((Fragment) curr);
            filesystem.generateFile(String.format("%s/src/main/res/layout/%s.xml", projectName, 
              this.javaToAndroidIdentifier(fragment.getName())), 
              this.generateLayout(fragment));
          };
          IterableExtensions.<ApplicationElement>filter(appElements.getElements(), _function).forEach(_function_1);
        }
      }
    }
  }
  
  private String generateLayout(final Fragment fragment) {
    ActivityLayoutAttributes layout = this.<ActivityLayoutAttributes>getFieldData(fragment.getActivityAttributes(), ActivityLayoutAttributes.class);
    boolean isMap = false;
    boolean isSetting = false;
    boolean _notEquals = (!Objects.equal(layout, null));
    if (_notEquals) {
      EList<LayoutElement> _layoutElements = layout.getLayoutElements();
      for (final LayoutElement check : _layoutElements) {
        if ((check instanceof TypeMap)) {
          isMap = true;
        } else {
          if ((check instanceof TypeSetting)) {
            isSetting = true;
          }
        }
      }
    }
    final StringBuilder string = new StringBuilder();
    if (isMap) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      _builder.newLine();
      _builder.append("<fragment xmlns:android=\"http://schemas.android.com/apk/res/android\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("xmlns:map=\"http://schemas.android.com/apk/res-auto\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("xmlns:tools=\"http://schemas.android.com/tools\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:id=\"@+id/map\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:name=\"com.google.android.gms.maps.SupportMapFragment\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:layout_width=\"match_parent\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:layout_height=\"match_parent\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("tools:context=\".");
      String _name = fragment.getName();
      _builder.append(_name, "    ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      string.append(_builder);
    } else {
      if (isSetting) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_1.newLine();
        _builder_1.append("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("xmlns:tools=\"http://schemas.android.com/tools\"");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("android:layout_width=\"match_parent\"");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("android:layout_height=\"match_parent\"");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("tools:context=\".");
        String _name_1 = fragment.getName();
        _builder_1.append(_name_1, "    ");
        _builder_1.append("\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("<LinearLayout");
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("android:layout_width=\"match_parent\"");
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("android:layout_height=\"match_parent\"");
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("android:orientation=\"vertical\">");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("<Button");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:id=\"@+id/button\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_width=\"wrap_content\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_height=\"wrap_content\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:text=\"@string/button\"/>");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("<EditText");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:id=\"@+id/editTextNumber\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_width=\"wrap_content\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_height=\"wrap_content\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:autofillHints=\"\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:ems=\"10\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:hint=\"@string/set_search_radius\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:inputType=\"number\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:text=\"500\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("tools:ignore=\"LabelFor\" />");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("<Spinner");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:id=\"@+id/spinner\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_width=\"match_parent\"");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("android:layout_height=\"wrap_content\" />");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("</LinearLayout>");
        _builder_1.newLine();
        _builder_1.append("</FrameLayout>");
        _builder_1.newLine();
        string.append(_builder_1);
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        _builder_2.newLine();
        _builder_2.append("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        _builder_2.newLine();
        _builder_2.append("    ");
        _builder_2.append("xmlns:tools=\"http://schemas.android.com/tools\"");
        _builder_2.newLine();
        _builder_2.append("    ");
        _builder_2.append("android:layout_width=\"match_parent\"");
        _builder_2.newLine();
        _builder_2.append("    ");
        _builder_2.append("android:layout_height=\"match_parent\"");
        _builder_2.newLine();
        _builder_2.append("    ");
        _builder_2.append("tools:context=\".");
        String _name_2 = fragment.getName();
        _builder_2.append(_name_2, "    ");
        _builder_2.append("\">");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("    ");
        _builder_2.append("<LinearLayout");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("android:layout_width=\"match_parent\"");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("android:layout_height=\"match_parent\"");
        _builder_2.newLine();
        _builder_2.append("        ");
        _builder_2.append("android:orientation=\"vertical\">");
        _builder_2.newLine();
        string.append(_builder_2);
      }
    }
    boolean _notEquals_1 = (!Objects.equal(layout, null));
    if (_notEquals_1) {
      final Consumer<LayoutElement> _function = (LayoutElement element) -> {
        if ((element instanceof Button)) {
          String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(fragment.getName());
          String _plus = (_javaToAndroidIdentifier + "_");
          String _javaToAndroidIdentifier_1 = this.javaToAndroidIdentifier(((Button)element).getName());
          String _plus_1 = (_plus + _javaToAndroidIdentifier_1);
          String buttonTitleRes = (_plus_1 + "_btn");
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("<Button");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("android:id=\"@+id/");
          String _javaToAndroidIdentifier_2 = this.javaToAndroidIdentifier(((Button)element).getName());
          _builder_3.append(_javaToAndroidIdentifier_2, "    ");
          _builder_3.append("\"");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("    ");
          _builder_3.append("android:text=\"@string/");
          _builder_3.append(buttonTitleRes, "    ");
          _builder_3.append("\"");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("    ");
          _builder_3.append("android:layout_height=\"wrap_content\"");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("android:layout_width=\"match_parent\" />");
          _builder_3.newLine();
          string.append(_builder_3);
        } else {
          if ((element instanceof EditText)) {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("<EditText");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:id=\"@+id/");
            String _javaToAndroidIdentifier_3 = this.javaToAndroidIdentifier(((EditText)element).getName());
            _builder_4.append(_javaToAndroidIdentifier_3, "    ");
            _builder_4.append("\"");
            _builder_4.newLineIfNotEmpty();
            _builder_4.append("    ");
            _builder_4.append("android:layout_width=\"wrap_content\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:layout_height=\"wrap_content\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:autofillHints=\"\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:ems=\"10\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:hint=\"Set Search Radius\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("android:inputType=\"number\"");
            _builder_4.newLine();
            _builder_4.append("    ");
            _builder_4.append("tools:ignore=\"LabelFor\" />");
            _builder_4.newLine();
            string.append(_builder_4);
          } else {
            if ((element instanceof Spinner)) {
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.append("<Spinner");
              _builder_5.newLine();
              _builder_5.append("   ");
              _builder_5.append("android:id=\"@+id/");
              String _javaToAndroidIdentifier_4 = this.javaToAndroidIdentifier(((Spinner)element).getName());
              _builder_5.append(_javaToAndroidIdentifier_4, "   ");
              _builder_5.append("\"");
              _builder_5.newLineIfNotEmpty();
              _builder_5.append("   ");
              _builder_5.append("android:layout_width=\"match_parent\"");
              _builder_5.newLine();
              _builder_5.append("   ");
              _builder_5.append("android:layout_height=\"wrap_content\" />");
              _builder_5.newLine();
              string.append(_builder_5);
            } else {
              if ((element instanceof TextView)) {
                StringConcatenation _builder_6 = new StringConcatenation();
                _builder_6.append("<TextView");
                _builder_6.newLine();
                _builder_6.append("    ");
                _builder_6.append("android:id=\"@+id/");
                String _javaToAndroidIdentifier_5 = this.javaToAndroidIdentifier(((TextView)element).getName());
                _builder_6.append(_javaToAndroidIdentifier_5, "    ");
                _builder_6.append("\"");
                _builder_6.newLineIfNotEmpty();
                _builder_6.append("    ");
                _builder_6.append("android:layout_height=\"wrap_content\"");
                _builder_6.newLine();
                _builder_6.append("    ");
                _builder_6.append("android:layout_width=\"match_parent\"");
                _builder_6.newLine();
                _builder_6.append("    ");
                _builder_6.append("android:text=\"Place holder for new text\" />");
                _builder_6.newLine();
                string.append(_builder_6);
              }
            }
          }
        }
      };
      layout.getLayoutElements().forEach(_function);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("    ");
    _builder_3.append("</LinearLayout>");
    _builder_3.newLine();
    _builder_3.append("</FrameLayout>");
    string.append(_builder_3);
    return string.toString();
  }
}
