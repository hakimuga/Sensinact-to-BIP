/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL FLAG AUTOSTART</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART#isActivated <em>Activated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_FLAG_AUTOSTART()
 * @model
 * @generated
 */
public interface DSL_FLAG_AUTOSTART extends EObject
{
  /**
   * Returns the value of the '<em><b>Activated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activated</em>' attribute.
   * @see #setActivated(boolean)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_FLAG_AUTOSTART_Activated()
   * @model
   * @generated
   */
  boolean isActivated();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART#isActivated <em>Activated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activated</em>' attribute.
   * @see #isActivated()
   * @generated
   */
  void setActivated(boolean value);

} // DSL_FLAG_AUTOSTART
