/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Android App Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.AndroidAppProject#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getAndroidAppProject()
 * @model
 * @generated
 */
public interface AndroidAppProject extends EObject
{
  /**
   * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mdsd.androidGenerator.Application}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' containment reference list.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getAndroidAppProject_Applications()
   * @model containment="true"
   * @generated
   */
  EList<Application> getApplications();

} // AndroidAppProject
