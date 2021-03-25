/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensinact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.Sensinact#getEca <em>Eca</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getSensinact()
 * @model
 * @generated
 */
public interface Sensinact extends EObject
{
  /**
   * Returns the value of the '<em><b>Eca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eca</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eca</em>' containment reference.
   * @see #setEca(DSL_SENSINACT)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getSensinact_Eca()
   * @model containment="true"
   * @generated
   */
  DSL_SENSINACT getEca();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.Sensinact#getEca <em>Eca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eca</em>' containment reference.
   * @see #getEca()
   * @generated
   */
  void setEca(DSL_SENSINACT value);

} // Sensinact
