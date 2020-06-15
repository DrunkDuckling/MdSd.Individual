/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import org.xtext.example.mdsd.androidGenerator.Distance;
import org.xtext.example.mdsd.androidGenerator.EditText;
import org.xtext.example.mdsd.androidGenerator.Equal;
import org.xtext.example.mdsd.androidGenerator.FilterAttributes;
import org.xtext.example.mdsd.androidGenerator.FilterQuery;
import org.xtext.example.mdsd.androidGenerator.Fragment;
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
import org.xtext.example.mdsd.androidGenerator.TargetSDK;
import org.xtext.example.mdsd.androidGenerator.Toast;
import org.xtext.example.mdsd.androidGenerator.TypeMap;
import org.xtext.example.mdsd.androidGenerator.TypeSetting;
import org.xtext.example.mdsd.androidGenerator.Unit;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage
 * @generated
 */
public class AndroidGeneratorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroidGeneratorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidGeneratorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroidGeneratorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroidGeneratorSwitch<Adapter> modelSwitch =
    new AndroidGeneratorSwitch<Adapter>()
    {
      @Override
      public Adapter caseAndroidAppProject(AndroidAppProject object)
      {
        return createAndroidAppProjectAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseApplicationAttribute(ApplicationAttribute object)
      {
        return createApplicationAttributeAdapter();
      }
      @Override
      public Adapter caseApplicationVersion(ApplicationVersion object)
      {
        return createApplicationVersionAdapter();
      }
      @Override
      public Adapter caseTargetSDK(TargetSDK object)
      {
        return createTargetSDKAdapter();
      }
      @Override
      public Adapter caseMinSDK(MinSDK object)
      {
        return createMinSDKAdapter();
      }
      @Override
      public Adapter caseApplicationPermissionList(ApplicationPermissionList object)
      {
        return createApplicationPermissionListAdapter();
      }
      @Override
      public Adapter casePermission(Permission object)
      {
        return createPermissionAdapter();
      }
      @Override
      public Adapter caseApplicationElementList(ApplicationElementList object)
      {
        return createApplicationElementListAdapter();
      }
      @Override
      public Adapter caseApplicationElement(ApplicationElement object)
      {
        return createApplicationElementAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFragment(Fragment object)
      {
        return createFragmentAdapter();
      }
      @Override
      public Adapter caseActivityLayoutAttributes(ActivityLayoutAttributes object)
      {
        return createActivityLayoutAttributesAdapter();
      }
      @Override
      public Adapter caseLayoutElement(LayoutElement object)
      {
        return createLayoutElementAdapter();
      }
      @Override
      public Adapter caseTypeMap(TypeMap object)
      {
        return createTypeMapAdapter();
      }
      @Override
      public Adapter caseTypeSetting(TypeSetting object)
      {
        return createTypeSettingAdapter();
      }
      @Override
      public Adapter caseActivityTypeAttributes(ActivityTypeAttributes object)
      {
        return createActivityTypeAttributesAdapter();
      }
      @Override
      public Adapter caseEditText(EditText object)
      {
        return createEditTextAdapter();
      }
      @Override
      public Adapter caseSpinner(Spinner object)
      {
        return createSpinnerAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseButtonActions(ButtonActions object)
      {
        return createButtonActionsAdapter();
      }
      @Override
      public Adapter caseToast(Toast object)
      {
        return createToastAdapter();
      }
      @Override
      public Adapter caseBundle(Bundle object)
      {
        return createBundleAdapter();
      }
      @Override
      public Adapter caseFilterQuery(FilterQuery object)
      {
        return createFilterQueryAdapter();
      }
      @Override
      public Adapter caseFilterAttributes(FilterAttributes object)
      {
        return createFilterAttributesAdapter();
      }
      @Override
      public Adapter caseDistance(Distance object)
      {
        return createDistanceAdapter();
      }
      @Override
      public Adapter caseNumber(org.xtext.example.mdsd.androidGenerator.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object)
      {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseLess(Less object)
      {
        return createLessAdapter();
      }
      @Override
      public Adapter caseMore(More object)
      {
        return createMoreAdapter();
      }
      @Override
      public Adapter caseEqual(Equal object)
      {
        return createEqualAdapter();
      }
      @Override
      public Adapter caseMeters(Meters object)
      {
        return createMetersAdapter();
      }
      @Override
      public Adapter caseImperial(Imperial object)
      {
        return createImperialAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.AndroidAppProject <em>Android App Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidAppProject
   * @generated
   */
  public Adapter createAndroidAppProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ApplicationAttribute <em>Application Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ApplicationAttribute
   * @generated
   */
  public Adapter createApplicationAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ApplicationVersion <em>Application Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ApplicationVersion
   * @generated
   */
  public Adapter createApplicationVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.TargetSDK <em>Target SDK</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.TargetSDK
   * @generated
   */
  public Adapter createTargetSDKAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.MinSDK <em>Min SDK</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.MinSDK
   * @generated
   */
  public Adapter createMinSDKAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList <em>Application Permission List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList
   * @generated
   */
  public Adapter createApplicationPermissionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Permission
   * @generated
   */
  public Adapter createPermissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ApplicationElementList <em>Application Element List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ApplicationElementList
   * @generated
   */
  public Adapter createApplicationElementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ApplicationElement <em>Application Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ApplicationElement
   * @generated
   */
  public Adapter createApplicationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Fragment
   * @generated
   */
  public Adapter createFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes <em>Activity Layout Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ActivityLayoutAttributes
   * @generated
   */
  public Adapter createActivityLayoutAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.LayoutElement <em>Layout Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.LayoutElement
   * @generated
   */
  public Adapter createLayoutElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.TypeMap <em>Type Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.TypeMap
   * @generated
   */
  public Adapter createTypeMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.TypeSetting <em>Type Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.TypeSetting
   * @generated
   */
  public Adapter createTypeSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes <em>Activity Type Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes
   * @generated
   */
  public Adapter createActivityTypeAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.EditText <em>Edit Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.EditText
   * @generated
   */
  public Adapter createEditTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Spinner <em>Spinner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Spinner
   * @generated
   */
  public Adapter createSpinnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.ButtonActions <em>Button Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.ButtonActions
   * @generated
   */
  public Adapter createButtonActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Toast <em>Toast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Toast
   * @generated
   */
  public Adapter createToastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Bundle
   * @generated
   */
  public Adapter createBundleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.FilterQuery <em>Filter Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.FilterQuery
   * @generated
   */
  public Adapter createFilterQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.FilterAttributes <em>Filter Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.FilterAttributes
   * @generated
   */
  public Adapter createFilterAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Distance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Distance
   * @generated
   */
  public Adapter createDistanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Unit
   * @generated
   */
  public Adapter createUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Less
   * @generated
   */
  public Adapter createLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.More <em>More</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.More
   * @generated
   */
  public Adapter createMoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Equal
   * @generated
   */
  public Adapter createEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Meters <em>Meters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Meters
   * @generated
   */
  public Adapter createMetersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mdsd.androidGenerator.Imperial <em>Imperial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mdsd.androidGenerator.Imperial
   * @generated
   */
  public Adapter createImperialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AndroidGeneratorAdapterFactory
