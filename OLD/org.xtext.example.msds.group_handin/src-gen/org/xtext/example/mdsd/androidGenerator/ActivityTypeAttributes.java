/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Type Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getActivityTypeAttributes()
 * @model
 * @generated
 */
public interface ActivityTypeAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(FilterQuery)
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getActivityTypeAttributes_Filter()
   * @model containment="true"
   * @generated
   */
  FilterQuery getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.androidGenerator.ActivityTypeAttributes#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterQuery value);

} // ActivityTypeAttributes
