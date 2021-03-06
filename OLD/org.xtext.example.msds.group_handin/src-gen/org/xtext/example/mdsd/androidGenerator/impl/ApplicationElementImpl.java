/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mdsd.androidGenerator.ActivityType;
import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.ApplicationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.impl.ApplicationElementImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.impl.ApplicationElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationElementImpl extends MinimalEObjectImpl.Container implements ApplicationElement
{
  /**
   * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityType()
   * @generated
   * @ordered
   */
  protected ActivityType activityType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AndroidGeneratorPackage.Literals.APPLICATION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActivityType getActivityType()
  {
    return activityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActivityType(ActivityType newActivityType, NotificationChain msgs)
  {
    ActivityType oldActivityType = activityType;
    activityType = newActivityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE, oldActivityType, newActivityType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActivityType(ActivityType newActivityType)
  {
    if (newActivityType != activityType)
    {
      NotificationChain msgs = null;
      if (activityType != null)
        msgs = ((InternalEObject)activityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE, null, msgs);
      if (newActivityType != null)
        msgs = ((InternalEObject)newActivityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE, null, msgs);
      msgs = basicSetActivityType(newActivityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE, newActivityType, newActivityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE:
        return basicSetActivityType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE:
        return getActivityType();
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE:
        setActivityType((ActivityType)newValue);
        return;
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE:
        setActivityType((ActivityType)null);
        return;
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__ACTIVITY_TYPE:
        return activityType != null;
      case AndroidGeneratorPackage.APPLICATION_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationElementImpl
