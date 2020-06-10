/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ModelList#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ModelList#getGetset <em>Getset</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getModelList()
 * @model
 * @generated
 */
public interface ModelList extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mdsd.androidGenerator.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getModelList_Type()
   * @model containment="true"
   * @generated
   */
  EList<Type> getType();

  /**
   * Returns the value of the '<em><b>Getset</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mdsd.androidGenerator.GetSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getset</em>' containment reference list.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getModelList_Getset()
   * @model containment="true"
   * @generated
   */
  EList<GetSet> getGetset();

} // ModelList
