package org.xtext.example.mdsd.generator.filegen;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.example.mdsd.androidGenerator.Activity;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.ApplicationMainActivity;
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList;
import org.xtext.example.mdsd.androidGenerator.Permission;
import org.xtext.example.mdsd.generator.abstractfiles.AbstractGen;

@SuppressWarnings("all")
public class ManifestGen extends AbstractGen {
  @Override
  public void generate(final List<Application> applications, final IFileSystemAccess2 filesystem) {
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        filesystem.generateFile(String.format("%s/src/main/AndroidManifest.xml", projectName), 
          this.retrieveAndroidManifest(app));
      }
    }
  }
  
  private String retrieveAndroidManifest(final Application application) {
    ApplicationPermissionList permissions = this.<ApplicationPermissionList>getFieldData(application.getAttributes(), ApplicationPermissionList.class);
    ApplicationMainActivity mainActivity = this.<ApplicationMainActivity>getFieldData(application.getAttributes(), ApplicationMainActivity.class);
    ApplicationElementList elements = this.<ApplicationElementList>getFieldData(application.getAttributes(), ApplicationElementList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("package=");
    String _name = application.getName();
    _builder.append(_name, "    ");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    String _generatePermissions = this.generatePermissions(permissions);
    _builder.append(_generatePermissions, "    ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<application");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:allowBackup=\"true\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:icon=\"@mipmap/ic_launcher\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:label=\"@string/app_name\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:roundIcon=\"@mipmap/ic_launcher_round\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:supportsRtl=\"true\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("android:theme=\"@style/AppTheme\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("     ");
    String _generateMetaData = this.generateMetaData(elements, mainActivity);
    _builder.append(_generateMetaData, "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</application>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</manifest>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generatePermissions(final ApplicationPermissionList permissions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Permission> _permissions = permissions.getPermissions();
      for(final Permission permission : _permissions) {
        _builder.append("<uses-permission android:name=\"");
        String _name = permission.getName();
        _builder.append(_name);
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String generateMetaData(final ApplicationElementList elements, final ApplicationMainActivity mainActivity) {
    String result = "";
    EList<ApplicationElement> _elements = elements.getElements();
    for (final ApplicationElement element : _elements) {
      if ((element instanceof Activity)) {
        String _result = result;
        String _generateActivity = this.generateActivity(((Activity) element), 
          ((!Objects.equal(mainActivity, null)) && ((Activity)element).equals(mainActivity.getLauncherActivity())));
        result = (_result + _generateActivity);
      }
    }
    return result;
  }
  
  private String generateActivity(final Activity activity, final boolean launchable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<meta-data");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:name=\"com.google.android.geo.API_KEY\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("android:value=\"PLACE OR REF TO GOOGLE KEY HERE\" />");
    _builder.newLine();
    _builder.append("     ");
    _builder.newLine();
    _builder.append("<activity");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:name=\".activity.");
    String _name = activity.getName();
    _builder.append(_name, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("android:label=\"@string/");
    String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(activity.getName());
    _builder.append(_javaToAndroidIdentifier, "    ");
    _builder.append("_title\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<intent-filter>");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("<action android:name=\"android.intent.action.MAIN\" />");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<category android:name=\"android.intent.category.LAUNCHER\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</intent-filter>");
    _builder.newLine();
    _builder.append("</activity>");
    _builder.newLine();
    return _builder.toString();
  }
}
