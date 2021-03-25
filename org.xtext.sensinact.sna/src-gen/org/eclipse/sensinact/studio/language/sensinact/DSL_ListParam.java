/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL List Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ListParam()
 * @model
 * @generated
 */
public interface DSL_ListParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ListParam_Param()
   * @model containment="true"
   * @generated
   */
  EList<DSL_Expression> getParam();

} // DSL_ListParam
