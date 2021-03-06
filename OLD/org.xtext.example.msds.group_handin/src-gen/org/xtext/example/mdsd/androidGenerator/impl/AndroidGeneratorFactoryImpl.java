/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mdsd.androidGenerator.Activity;
import org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes;
import org.xtext.example.mdsd.androidGenerator.ActivityType;
import org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes;
import org.xtext.example.mdsd.androidGenerator.AndroidAppProject;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorFactory;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.Application;
import org.xtext.example.mdsd.androidGenerator.ApplicationAttribute;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;
import org.xtext.example.mdsd.androidGenerator.ApplicationElementList;
import org.xtext.example.mdsd.androidGenerator.ApplicationMainActivity;
import org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList;
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion;
import org.xtext.example.mdsd.androidGenerator.Button;
import org.xtext.example.mdsd.androidGenerator.Distance;
import org.xtext.example.mdsd.androidGenerator.Equal;
import org.xtext.example.mdsd.androidGenerator.FilterAttributes;
import org.xtext.example.mdsd.androidGenerator.FilterQuery;
import org.xtext.example.mdsd.androidGenerator.Fragment;
import org.xtext.example.mdsd.androidGenerator.GetSet;
import org.xtext.example.mdsd.androidGenerator.Imperial;
import org.xtext.example.mdsd.androidGenerator.LayoutElement;
import org.xtext.example.mdsd.androidGenerator.Less;
import org.xtext.example.mdsd.androidGenerator.Meters;
import org.xtext.example.mdsd.androidGenerator.MinSDK;
import org.xtext.example.mdsd.androidGenerator.Model;
import org.xtext.example.mdsd.androidGenerator.ModelList;
import org.xtext.example.mdsd.androidGenerator.More;
import org.xtext.example.mdsd.androidGenerator.Operator;
import org.xtext.example.mdsd.androidGenerator.Permission;
import org.xtext.example.mdsd.androidGenerator.TargetSDK;
import org.xtext.example.mdsd.androidGenerator.TextView;
import org.xtext.example.mdsd.androidGenerator.Type;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidGeneratorFactoryImpl extends EFactoryImpl implements AndroidGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidGeneratorFactory init()
  {
    try
    {
      AndroidGeneratorFactory theAndroidGeneratorFactory = (AndroidGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(AndroidGeneratorPackage.eNS_URI);
      if (theAndroidGeneratorFactory != null)
      {
        return theAndroidGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AndroidGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AndroidGeneratorPackage.ANDROID_APP_PROJECT: return createAndroidAppProject();
      case AndroidGeneratorPackage.APPLICATION: return createApplication();
      case AndroidGeneratorPackage.APPLICATION_ATTRIBUTE: return createApplicationAttribute();
      case AndroidGeneratorPackage.APPLICATION_VERSION: return createApplicationVersion();
      case AndroidGeneratorPackage.TARGET_SDK: return createTargetSDK();
      case AndroidGeneratorPackage.MIN_SDK: return createMinSDK();
      case AndroidGeneratorPackage.APPLICATION_PERMISSION_LIST: return createApplicationPermissionList();
      case AndroidGeneratorPackage.PERMISSION: return createPermission();
      case AndroidGeneratorPackage.APPLICATION_ELEMENT_LIST: return createApplicationElementList();
      case AndroidGeneratorPackage.APPLICATION_MAIN_ACTIVITY: return createApplicationMainActivity();
      case AndroidGeneratorPackage.APPLICATION_ELEMENT: return createApplicationElement();
      case AndroidGeneratorPackage.MODEL: return createModel();
      case AndroidGeneratorPackage.MODEL_LIST: return createModelList();
      case AndroidGeneratorPackage.GET_SET: return createGetSet();
      case AndroidGeneratorPackage.TYPE: return createType();
      case AndroidGeneratorPackage.FRAGMENT: return createFragment();
      case AndroidGeneratorPackage.ACTIVITY: return createActivity();
      case AndroidGeneratorPackage.ACTIVITY_TYPE_ATTRIBUTES: return createActivityTypeAttributes();
      case AndroidGeneratorPackage.ACTIVITY_TYPE: return createActivityType();
      case AndroidGeneratorPackage.ACTIVITY_LAYOUT_ATTRIBUTES: return createActivityLayoutAttributes();
      case AndroidGeneratorPackage.LAYOUT_ELEMENT: return createLayoutElement();
      case AndroidGeneratorPackage.TEXT_VIEW: return createTextView();
      case AndroidGeneratorPackage.BUTTON: return createButton();
      case AndroidGeneratorPackage.FILTER_QUERY: return createFilterQuery();
      case AndroidGeneratorPackage.FILTER_ATTRIBUTES: return createFilterAttributes();
      case AndroidGeneratorPackage.DISTANCE: return createDistance();
      case AndroidGeneratorPackage.NUMBER: return createNumber();
      case AndroidGeneratorPackage.OPERATOR: return createOperator();
      case AndroidGeneratorPackage.UNIT: return createUnit();
      case AndroidGeneratorPackage.TYPE_MAP: return createTypeMap();
      case AndroidGeneratorPackage.LESS: return createLess();
      case AndroidGeneratorPackage.MORE: return createMore();
      case AndroidGeneratorPackage.EQUAL: return createEqual();
      case AndroidGeneratorPackage.METERS: return createMeters();
      case AndroidGeneratorPackage.IMPERIAL: return createImperial();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndroidAppProject createAndroidAppProject()
  {
    AndroidAppProjectImpl androidAppProject = new AndroidAppProjectImpl();
    return androidAppProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationAttribute createApplicationAttribute()
  {
    ApplicationAttributeImpl applicationAttribute = new ApplicationAttributeImpl();
    return applicationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationVersion createApplicationVersion()
  {
    ApplicationVersionImpl applicationVersion = new ApplicationVersionImpl();
    return applicationVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetSDK createTargetSDK()
  {
    TargetSDKImpl targetSDK = new TargetSDKImpl();
    return targetSDK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MinSDK createMinSDK()
  {
    MinSDKImpl minSDK = new MinSDKImpl();
    return minSDK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationPermissionList createApplicationPermissionList()
  {
    ApplicationPermissionListImpl applicationPermissionList = new ApplicationPermissionListImpl();
    return applicationPermissionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Permission createPermission()
  {
    PermissionImpl permission = new PermissionImpl();
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationElementList createApplicationElementList()
  {
    ApplicationElementListImpl applicationElementList = new ApplicationElementListImpl();
    return applicationElementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationMainActivity createApplicationMainActivity()
  {
    ApplicationMainActivityImpl applicationMainActivity = new ApplicationMainActivityImpl();
    return applicationMainActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationElement createApplicationElement()
  {
    ApplicationElementImpl applicationElement = new ApplicationElementImpl();
    return applicationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelList createModelList()
  {
    ModelListImpl modelList = new ModelListImpl();
    return modelList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetSet createGetSet()
  {
    GetSetImpl getSet = new GetSetImpl();
    return getSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActivityTypeAttributes createActivityTypeAttributes()
  {
    ActivityTypeAttributesImpl activityTypeAttributes = new ActivityTypeAttributesImpl();
    return activityTypeAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActivityType createActivityType()
  {
    ActivityTypeImpl activityType = new ActivityTypeImpl();
    return activityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActivityLayoutAttributes createActivityLayoutAttributes()
  {
    ActivityLayoutAttributesImpl activityLayoutAttributes = new ActivityLayoutAttributesImpl();
    return activityLayoutAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LayoutElement createLayoutElement()
  {
    LayoutElementImpl layoutElement = new LayoutElementImpl();
    return layoutElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TextView createTextView()
  {
    TextViewImpl textView = new TextViewImpl();
    return textView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterQuery createFilterQuery()
  {
    FilterQueryImpl filterQuery = new FilterQueryImpl();
    return filterQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterAttributes createFilterAttributes()
  {
    FilterAttributesImpl filterAttributes = new FilterAttributesImpl();
    return filterAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Distance createDistance()
  {
    DistanceImpl distance = new DistanceImpl();
    return distance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.mdsd.androidGenerator.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeMap createTypeMap()
  {
    TypeMapImpl typeMap = new TypeMapImpl();
    return typeMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public More createMore()
  {
    MoreImpl more = new MoreImpl();
    return more;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Meters createMeters()
  {
    MetersImpl meters = new MetersImpl();
    return meters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Imperial createImperial()
  {
    ImperialImpl imperial = new ImperialImpl();
    return imperial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndroidGeneratorPackage getAndroidGeneratorPackage()
  {
    return (AndroidGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AndroidGeneratorPackage getPackage()
  {
    return AndroidGeneratorPackage.eINSTANCE;
  }

} //AndroidGeneratorFactoryImpl
