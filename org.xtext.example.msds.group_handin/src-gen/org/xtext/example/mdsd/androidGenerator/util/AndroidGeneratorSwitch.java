/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes;
import org.xtext.example.mdsd.androidGenerator.AndroidAppProject;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationAttribute;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList;
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion;
import org.xtext.example.mdsd.androidGenerator.Bundle;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.ButtonActions;
import org.xtext.example.mdsd.androidGenerator.Dataholders;
import org.xtext.example.mdsd.androidGenerator.Distance;
import org.xtext.example.mdsd.androidGenerator.EditText;
import org.xtext.example.mdsd.androidGenerator.Equal;
import org.xtext.example.mdsd.androidGenerator.FilterAttributes;
import org.xtext.example.mdsd.androidGenerator.FilterQuery;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.Holder;
import org.xtext.example.mdsd.androidGenerator.Imperial;
import org.xtext.example.mdsd.androidGenerator.LayoutElement;
import org.xtext.example.mdsd.androidGenerator.Less;
import org.xtext.example.mdsd.androidGenerator.Meters;
import org.xtext.example.mdsd.androidGenerator.MinSDK;
import org.xtext.example.mdsd.androidGenerator.Model;
import org.xtext.example.mdsd.androidGenerator.More;
import org.xtext.example.mdsd.androidGenerator.Operator;
import org.xtext.example.mdsd.androidGenerator.Permission;
import org.xtext.example.mdsd.androidGenerator.Spinner;
import org.xtext.example.mdsd.androidGenerator.SpinnerCon;
import org.xtext.example.mdsd.androidGenerator.TargetSDK;
import org.xtext.example.mdsd.androidGenerator.TextView;
import org.xtext.example.mdsd.androidGenerator.Toast;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.androidGenerator.Unit;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage
 * @generated
 */
public class AndroidGeneratorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroidGeneratorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidGeneratorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroidGeneratorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AndroidGeneratorPackage.ANDROID_APP_PROJECT:
      {
        AndroidAppProject androidAppProject = (AndroidAppProject)theEObject;
        T result = caseAndroidAppProject(androidAppProject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION_ATTRIBUTE:
      {
        ApplicationAttribute applicationAttribute = (ApplicationAttribute)theEObject;
        T result = caseApplicationAttribute(applicationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION_VERSION:
      {
        ApplicationVersion applicationVersion = (ApplicationVersion)theEObject;
        T result = caseApplicationVersion(applicationVersion);
        if (result == null) result = caseApplicationAttribute(applicationVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.TARGET_SDK:
      {
        TargetSDK targetSDK = (TargetSDK)theEObject;
        T result = caseTargetSDK(targetSDK);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.MIN_SDK:
      {
        MinSDK minSDK = (MinSDK)theEObject;
        T result = caseMinSDK(minSDK);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION_PERMISSION_LIST:
      {
        ApplicationPermissionList applicationPermissionList = (ApplicationPermissionList)theEObject;
        T result = caseApplicationPermissionList(applicationPermissionList);
        if (result == null) result = caseApplicationAttribute(applicationPermissionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.PERMISSION:
      {
        Permission permission = (Permission)theEObject;
        T result = casePermission(permission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION_ELEMENT_LIST:
      {
        ApplicationElementList applicationElementList = (ApplicationElementList)theEObject;
        T result = caseApplicationElementList(applicationElementList);
        if (result == null) result = caseApplicationAttribute(applicationElementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.APPLICATION_ELEMENT:
      {
        ApplicationElement applicationElement = (ApplicationElement)theEObject;
        T result = caseApplicationElement(applicationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = caseApplicationElement(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.FRAGMENT:
      {
        Fragment fragment = (Fragment)theEObject;
        T result = caseFragment(fragment);
        if (result == null) result = caseApplicationElement(fragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.ACTIVITY_LAYOUT_ATTRIBUTES:
      {
        ActivityLayoutAttributes activityLayoutAttributes = (ActivityLayoutAttributes)theEObject;
        T result = caseActivityLayoutAttributes(activityLayoutAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.LAYOUT_ELEMENT:
      {
        LayoutElement layoutElement = (LayoutElement)theEObject;
        T result = caseLayoutElement(layoutElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.DATAHOLDERS:
      {
        Dataholders dataholders = (Dataholders)theEObject;
        T result = caseDataholders(dataholders);
        if (result == null) result = caseLayoutElement(dataholders);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.TYPE_MAP:
      {
        TypeMap typeMap = (TypeMap)theEObject;
        T result = caseTypeMap(typeMap);
        if (result == null) result = caseLayoutElement(typeMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.TYPE_SETTING:
      {
        TypeSetting typeSetting = (TypeSetting)theEObject;
        T result = caseTypeSetting(typeSetting);
        if (result == null) result = caseLayoutElement(typeSetting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.ACTIVITY_TYPE_ATTRIBUTES:
      {
        ActivityTypeAttributes activityTypeAttributes = (ActivityTypeAttributes)theEObject;
        T result = caseActivityTypeAttributes(activityTypeAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.EDIT_TEXT:
      {
        EditText editText = (EditText)theEObject;
        T result = caseEditText(editText);
        if (result == null) result = caseDataholders(editText);
        if (result == null) result = caseLayoutElement(editText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T result = caseSpinner(spinner);
        if (result == null) result = caseDataholders(spinner);
        if (result == null) result = caseLayoutElement(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.SPINNER_CON:
      {
        SpinnerCon spinnerCon = (SpinnerCon)theEObject;
        T result = caseSpinnerCon(spinnerCon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.TEXT_VIEW:
      {
        TextView textView = (TextView)theEObject;
        T result = caseTextView(textView);
        if (result == null) result = caseDataholders(textView);
        if (result == null) result = caseLayoutElement(textView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseLayoutElement(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.BUTTON_ACTIONS:
      {
        ButtonActions buttonActions = (ButtonActions)theEObject;
        T result = caseButtonActions(buttonActions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.TOAST:
      {
        Toast toast = (Toast)theEObject;
        T result = caseToast(toast);
        if (result == null) result = caseButtonActions(toast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.BUNDLE:
      {
        Bundle bundle = (Bundle)theEObject;
        T result = caseBundle(bundle);
        if (result == null) result = caseButtonActions(bundle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.HOLDER:
      {
        Holder holder = (Holder)theEObject;
        T result = caseHolder(holder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.FILTER_QUERY:
      {
        FilterQuery filterQuery = (FilterQuery)theEObject;
        T result = caseFilterQuery(filterQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.FILTER_ATTRIBUTES:
      {
        FilterAttributes filterAttributes = (FilterAttributes)theEObject;
        T result = caseFilterAttributes(filterAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.DISTANCE:
      {
        Distance distance = (Distance)theEObject;
        T result = caseDistance(distance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.NUMBER:
      {
        org.xtext.example.mdsd.androidGenerator.Number number = (org.xtext.example.mdsd.androidGenerator.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.LESS:
      {
        Less less = (Less)theEObject;
        T result = caseLess(less);
        if (result == null) result = caseOperator(less);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.MORE:
      {
        More more = (More)theEObject;
        T result = caseMore(more);
        if (result == null) result = caseOperator(more);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.EQUAL:
      {
        Equal equal = (Equal)theEObject;
        T result = caseEqual(equal);
        if (result == null) result = caseOperator(equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.METERS:
      {
        Meters meters = (Meters)theEObject;
        T result = caseMeters(meters);
        if (result == null) result = caseUnit(meters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidGeneratorPackage.IMPERIAL:
      {
        Imperial imperial = (Imperial)theEObject;
        T result = caseImperial(imperial);
        if (result == null) result = caseUnit(imperial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Android App Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Android App Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroidAppProject(AndroidAppProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationAttribute(ApplicationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationVersion(ApplicationVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target SDK</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target SDK</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetSDK(TargetSDK object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min SDK</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min SDK</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinSDK(MinSDK object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Permission List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Permission List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationPermissionList(ApplicationPermissionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermission(Permission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationElementList(ApplicationElementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationElement(ApplicationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFragment(Fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Layout Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Layout Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityLayoutAttributes(ActivityLayoutAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutElement(LayoutElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataholders</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataholders</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataholders(Dataholders object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeMap(TypeMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Setting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Setting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSetting(TypeSetting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Type Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Type Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityTypeAttributes(ActivityTypeAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditText(EditText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpinner(Spinner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spinner Con</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spinner Con</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpinnerCon(SpinnerCon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextView(TextView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonActions(ButtonActions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Toast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Toast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToast(Toast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundle(Bundle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHolder(Holder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterQuery(FilterQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterAttributes(FilterAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistance(Distance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.xtext.example.mdsd.androidGenerator.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLess(Less object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMore(More object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqual(Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeters(Meters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imperial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imperial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImperial(Imperial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AndroidGeneratorSwitch
