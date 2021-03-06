/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.androidGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Permission List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.androidGenerator.ApplicationPermissionList#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getApplicationPermissionList()
 * @model
 * @generated
 */
public interface ApplicationPermissionList extends ApplicationAttribute
{
  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mdsd.androidGenerator.Permission}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see org.xtext.example.mdsd.androidGenerator.AndroidGeneratorPackage#getApplicationPermissionList_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<Permission> getPermissions();

} // ApplicationPermissionList
