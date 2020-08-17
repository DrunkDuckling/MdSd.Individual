/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.Spinner#getSpinnercon <em>Spinnercon</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends Dataholders
{
  /**
   * Returns the value of the '<em><b>Spinnercon</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mdsd.androidGenerator.SpinnerCon}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spinnercon</em>' containment reference list.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getSpinner_Spinnercon()
   * @model containment="true"
   * @generated
   */
  EList<SpinnerCon> getSpinnercon();

} // Spinner
