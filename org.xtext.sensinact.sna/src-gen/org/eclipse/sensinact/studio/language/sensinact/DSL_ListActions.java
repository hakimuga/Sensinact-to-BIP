/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL List Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions#getActionList <em>Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ListActions()
 * @model
 * @generated
 */
public interface DSL_ListActions extends EObject
{
  /**
   * Returns the value of the '<em><b>Action List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action List</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ListActions_ActionList()
   * @model containment="true"
   * @generated
   */
  EList<DSL_ResourceAction> getActionList();

} // DSL_ListActions
