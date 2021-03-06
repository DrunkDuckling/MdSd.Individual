/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ApplicationElement#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ApplicationElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getApplicationElement()
 * @model
 * @generated
 */
public interface ApplicationElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Type</em>' containment reference.
   * @see #setActivityType(ActivityType)
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getApplicationElement_ActivityType()
   * @model containment="true"
   * @generated
   */
  ActivityType getActivityType();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.androidGenerator.ApplicationElement#getActivityType <em>Activity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity Type</em>' containment reference.
   * @see #getActivityType()
   * @generated
   */
  void setActivityType(ActivityType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getApplicationElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.androidGenerator.ApplicationElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ApplicationElement
