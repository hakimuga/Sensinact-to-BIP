/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Resource Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getActiontype <em>Actiontype</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getListParam <em>List Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ResourceAction()
 * @model
 * @generated
 */
public interface DSL_ResourceAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ResourceAction_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(DSL_REF)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ResourceAction_Ref()
   * @model
   * @generated
   */
  DSL_REF getRef();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(DSL_REF value);

  /**
   * Returns the value of the '<em><b>Actiontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actiontype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actiontype</em>' attribute.
   * @see #setActiontype(String)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ResourceAction_Actiontype()
   * @model
   * @generated
   */
  String getActiontype();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getActiontype <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actiontype</em>' attribute.
   * @see #getActiontype()
   * @generated
   */
  void setActiontype(String value);

  /**
   * Returns the value of the '<em><b>List Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Param</em>' containment reference.
   * @see #setListParam(DSL_ListParam)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ResourceAction_ListParam()
   * @model containment="true"
   * @generated
   */
  DSL_ListParam getListParam();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getListParam <em>List Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Param</em>' containment reference.
   * @see #getListParam()
   * @generated
   */
  void setListParam(DSL_ListParam value);

} // DSL_ResourceAction
