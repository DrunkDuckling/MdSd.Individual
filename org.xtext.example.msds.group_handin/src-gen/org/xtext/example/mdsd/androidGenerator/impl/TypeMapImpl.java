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
import org.xtext.example.mdsd.androidGenerator.FragmentTypeAttributes;
import org.xtext.example.mdsd.androidGenerator.TypeMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.impl.TypeMapImpl#getFragmenttypeattribute <em>Fragmenttypeattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMapImpl extends LayoutElementImpl implements TypeMap
{
  /**
   * The cached value of the '{@link #getFragmenttypeattribute() <em>Fragmenttypeattribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragmenttypeattribute()
   * @generated
   * @ordered
   */
  protected FragmentTypeAttributes fragmenttypeattribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeMapImpl()
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
    return AndroidGeneratorPackage.Literals.TYPE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FragmentTypeAttributes getFragmenttypeattribute()
  {
    return fragmenttypeattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFragmenttypeattribute(FragmentTypeAttributes newFragmenttypeattribute, NotificationChain msgs)
  {
    FragmentTypeAttributes oldFragmenttypeattribute = fragmenttypeattribute;
    fragmenttypeattribute = newFragmenttypeattribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE, oldFragmenttypeattribute, newFragmenttypeattribute);
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
  public void setFragmenttypeattribute(FragmentTypeAttributes newFragmenttypeattribute)
  {
    if (newFragmenttypeattribute != fragmenttypeattribute)
    {
      NotificationChain msgs = null;
      if (fragmenttypeattribute != null)
        msgs = ((InternalEObject)fragmenttypeattribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE, null, msgs);
      if (newFragmenttypeattribute != null)
        msgs = ((InternalEObject)newFragmenttypeattribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE, null, msgs);
      msgs = basicSetFragmenttypeattribute(newFragmenttypeattribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE, newFragmenttypeattribute, newFragmenttypeattribute));
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
      case AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE:
        return basicSetFragmenttypeattribute(null, msgs);
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
      case AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE:
        return getFragmenttypeattribute();
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
      case AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE:
        setFragmenttypeattribute((FragmentTypeAttributes)newValue);
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
      case AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE:
        setFragmenttypeattribute((FragmentTypeAttributes)null);
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
      case AndroidGeneratorPackage.TYPE_MAP__FRAGMENTTYPEATTRIBUTE:
        return fragmenttypeattribute != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeMapImpl
