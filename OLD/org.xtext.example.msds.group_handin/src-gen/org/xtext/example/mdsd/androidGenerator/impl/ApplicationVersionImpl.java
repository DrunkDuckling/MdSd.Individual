/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage;
import org.xtext.example.mdsd.androidGenerator.ApplicationVersion;
import org.xtext.example.mdsd.androidGenerator.TargetSDK;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.impl.ApplicationVersionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.impl.ApplicationVersionImpl#getTargetsdk <em>Targetsdk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationVersionImpl extends ApplicationAttributeImpl implements ApplicationVersion
{
  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mdsd.androidGenerator.Number result;

  /**
   * The cached value of the '{@link #getTargetsdk() <em>Targetsdk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetsdk()
   * @generated
   * @ordered
   */
  protected TargetSDK targetsdk;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationVersionImpl()
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
    return AndroidGeneratorPackage.Literals.APPLICATION_VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.mdsd.androidGenerator.Number getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(org.xtext.example.mdsd.androidGenerator.Number newResult, NotificationChain msgs)
  {
    org.xtext.example.mdsd.androidGenerator.Number oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_VERSION__RESULT, oldResult, newResult);
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
  public void setResult(org.xtext.example.mdsd.androidGenerator.Number newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_VERSION__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_VERSION__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_VERSION__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetSDK getTargetsdk()
  {
    return targetsdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetsdk(TargetSDK newTargetsdk, NotificationChain msgs)
  {
    TargetSDK oldTargetsdk = targetsdk;
    targetsdk = newTargetsdk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK, oldTargetsdk, newTargetsdk);
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
  public void setTargetsdk(TargetSDK newTargetsdk)
  {
    if (newTargetsdk != targetsdk)
    {
      NotificationChain msgs = null;
      if (targetsdk != null)
        msgs = ((InternalEObject)targetsdk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK, null, msgs);
      if (newTargetsdk != null)
        msgs = ((InternalEObject)newTargetsdk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK, null, msgs);
      msgs = basicSetTargetsdk(newTargetsdk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK, newTargetsdk, newTargetsdk));
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
      case AndroidGeneratorPackage.APPLICATION_VERSION__RESULT:
        return basicSetResult(null, msgs);
      case AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK:
        return basicSetTargetsdk(null, msgs);
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
      case AndroidGeneratorPackage.APPLICATION_VERSION__RESULT:
        return getResult();
      case AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK:
        return getTargetsdk();
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
      case AndroidGeneratorPackage.APPLICATION_VERSION__RESULT:
        setResult((org.xtext.example.mdsd.androidGenerator.Number)newValue);
        return;
      case AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK:
        setTargetsdk((TargetSDK)newValue);
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
      case AndroidGeneratorPackage.APPLICATION_VERSION__RESULT:
        setResult((org.xtext.example.mdsd.androidGenerator.Number)null);
        return;
      case AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK:
        setTargetsdk((TargetSDK)null);
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
      case AndroidGeneratorPackage.APPLICATION_VERSION__RESULT:
        return result != null;
      case AndroidGeneratorPackage.APPLICATION_VERSION__TARGETSDK:
        return targetsdk != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationVersionImpl
