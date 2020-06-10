package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mdsd.androidGenerator.Activity;
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.ActivityType;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.LayoutElement;
import org.xtext.example.mdsd.androidGenerator.TextView;
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
            return Boolean.valueOf((element instanceof Activity));
          };
          final Consumer<ApplicationElement> _function_1 = (ApplicationElement curr) -> {
            Activity activity = ((Activity) curr);
            filesystem.generateFile(String.format("%s/src/main/res/layout/%s.xml", projectName, 
              this.javaToAndroidIdentifier(activity.getName())), 
              this.generateLayout(activity));
          };
          IterableExtensions.<ApplicationElement>filter(appElements.getElements(), _function).forEach(_function_1);
        }
      }
    }
  }
  
  private String generateLayout(final Activity activity) {
    ActivityLayoutAttributes layout = this.<ActivityLayoutAttributes>getFieldData(activity.getActivityAttributes(), ActivityLayoutAttributes.class);
    ActivityType map = activity.getActivityType();
    boolean isMapActivity = (!Objects.equal(map, null));
    final StringBuilder string = new StringBuilder();
    if (isMapActivity) {
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
      String _name = activity.getName();
      _builder.append(_name, "    ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      string.append(_builder);
    } else {
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
      String _name_1 = activity.getName();
      _builder_1.append(_name_1, "    ");
      _builder_1.append("\">");
      _builder_1.newLineIfNotEmpty();
      string.append(_builder_1);
    }
    boolean _notEquals = (!Objects.equal(layout, null));
    if (_notEquals) {
      final AtomicInteger textIndex = new AtomicInteger(0);
      final Consumer<LayoutElement> _function = (LayoutElement element) -> {
        if ((element instanceof Button)) {
          String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(activity.getName());
          String _plus = (_javaToAndroidIdentifier + "_");
          String _javaToAndroidIdentifier_1 = this.javaToAndroidIdentifier(((Button)element).getName());
          String _plus_1 = (_plus + _javaToAndroidIdentifier_1);
          String buttonTitleRes = (_plus_1 + "_title");
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.newLine();
          _builder_2.append("     ");
          _builder_2.append("<Button");
          _builder_2.newLine();
          _builder_2.append("         ");
          _builder_2.append("android:id=\"@+id/");
          String _javaToAndroidIdentifier_2 = this.javaToAndroidIdentifier(((Button)element).getName());
          _builder_2.append(_javaToAndroidIdentifier_2, "         ");
          _builder_2.append("\"");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("         ");
          _builder_2.append("android:text=\"@string/");
          _builder_2.append(buttonTitleRes, "         ");
          _builder_2.append("\"");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("         ");
          _builder_2.append("android:layout_height=\"wrap_content\"");
          _builder_2.newLine();
          _builder_2.append("         ");
          _builder_2.append("android:layout_width=\"match_parent\" />");
          _builder_2.newLine();
          string.append(_builder_2);
        } else {
          if ((element instanceof TextView)) {
            String _javaToAndroidIdentifier_3 = this.javaToAndroidIdentifier(activity.getName());
            String _plus_2 = (_javaToAndroidIdentifier_3 + "_text");
            String textTitleRes = (_plus_2 + textIndex);
            textIndex.addAndGet(1);
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.newLine();
            _builder_3.append("     ");
            _builder_3.append("<TextView android:text=\"@string/");
            _builder_3.append(textTitleRes, "     ");
            _builder_3.append("\"");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("         ");
            _builder_3.append("android:layout_width=\"wrap_content\"");
            _builder_3.newLine();
            _builder_3.append("         ");
            _builder_3.append("android:layout_height=\"wrap_content\" />");
            _builder_3.newLine();
            string.append(_builder_3);
          }
        }
      };
      layout.getLayoutElements().forEach(_function);
    }
    if (isMapActivity) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/>");
      _builder_2.newLine();
      string.append(_builder_2);
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("</FrameLayout>");
      _builder_3.newLine();
      string.append(_builder_3);
    }
    return string.toString();
  }
}
