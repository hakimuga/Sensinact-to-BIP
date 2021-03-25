/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL SENSINACT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getAutostart <em>Autostart</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getProb <em>Prob</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getCep <em>Cep</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getOn <em>On</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getEca <em>Eca</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT()
 * @model
 * @generated
 */
public interface DSL_SENSINACT extends EObject
{
  /**
   * Returns the value of the '<em><b>Autostart</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autostart</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autostart</em>' containment reference.
   * @see #setAutostart(DSL_FLAG_AUTOSTART)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_Autostart()
   * @model containment="true"
   * @generated
   */
  DSL_FLAG_AUTOSTART getAutostart();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getAutostart <em>Autostart</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autostart</em>' containment reference.
   * @see #getAutostart()
   * @generated
   */
  void setAutostart(DSL_FLAG_AUTOSTART value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_Resources()
   * @model containment="true"
   * @generated
   */
  EList<DSL_Resource> getResources();

  /**
   * Returns the value of the '<em><b>Prob</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prob</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prob</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_Prob()
   * @model containment="true"
   * @generated
   */
  EList<DSL_CLOCK_STOCHASTIC> getProb();

  /**
   * Returns the value of the '<em><b>Cep</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cep</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cep</em>' containment reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_Cep()
   * @model containment="true"
   * @generated
   */
  EList<DSL_CEP_STATEMENT> getCep();

  /**
   * Returns the value of the '<em><b>On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On</em>' containment reference.
   * @see #setOn(DSL_On)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_On()
   * @model containment="true"
   * @generated
   */
  DSL_On getOn();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getOn <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On</em>' containment reference.
   * @see #getOn()
   * @generated
   */
  void setOn(DSL_On value);

  /**
   * Returns the value of the '<em><b>Eca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eca</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eca</em>' containment reference.
   * @see #setEca(DSL_ECA_STATEMENT)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_SENSINACT_Eca()
   * @model containment="true"
   * @generated
   */
  DSL_ECA_STATEMENT getEca();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getEca <em>Eca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eca</em>' containment reference.
   * @see #getEca()
   * @generated
   */
  void setEca(DSL_ECA_STATEMENT value);

} // DSL_SENSINACT
