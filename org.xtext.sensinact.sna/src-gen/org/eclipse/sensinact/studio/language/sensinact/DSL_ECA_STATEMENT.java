/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL ECA STATEMENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getIfdo <em>Ifdo</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElseIfdo <em>Else Ifdo</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElsedo <em>Elsedo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ECA_STATEMENT()
 * @model
 * @generated
 */
public interface DSL_ECA_STATEMENT extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifdo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifdo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifdo</em>' containment reference.
   * @see #setIfdo(DSL_IfDo)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ECA_STATEMENT_Ifdo()
   * @model containment="true"
   * @generated
   */
  DSL_IfDo getIfdo();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getIfdo <em>Ifdo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifdo</em>' containment reference.
   * @see #getIfdo()
   * @generated
   */
  void setIfdo(DSL_IfDo value);

  /**
   * Returns the value of the '<em><b>Else Ifdo</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Ifdo</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Ifdo</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ECA_STATEMENT_ElseIfdo()
   * @model containment="true"
   * @generated
   */
  EList<DSL_ElseIfDo> getElseIfdo();

  /**
   * Returns the value of the '<em><b>Elsedo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsedo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsedo</em>' containment reference.
   * @see #setElsedo(DSL_ElseDo)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_ECA_STATEMENT_Elsedo()
   * @model containment="true"
   * @generated
   */
  DSL_ElseDo getElsedo();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElsedo <em>Elsedo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsedo</em>' containment reference.
   * @see #getElsedo()
   * @generated
   */
  void setElsedo(DSL_ElseDo value);

} // DSL_ECA_STATEMENT
