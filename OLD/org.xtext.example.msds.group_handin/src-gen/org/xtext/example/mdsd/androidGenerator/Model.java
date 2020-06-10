/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.Model#getModellist <em>Modellist</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends ApplicationElement
{
  /**
   * Returns the value of the '<em><b>Modellist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modellist</em>' containment reference.
   * @see #setModellist(ModelList)
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getModel_Modellist()
   * @model containment="true"
   * @generated
   */
  ModelList getModellist();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.androidGenerator.Model#getModellist <em>Modellist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modellist</em>' containment reference.
   * @see #getModellist()
   * @generated
   */
  void setModellist(ModelList value);

} // Model