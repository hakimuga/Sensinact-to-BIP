/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL CEP DURATION MIN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_DURATION_MIN()
 * @model
 * @generated
 */
public interface DSL_CEP_DURATION_MIN extends EObject
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(BigDecimal)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_DURATION_MIN_Min()
   * @model
   * @generated
   */
  BigDecimal getMin();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(BigDecimal value);

} // DSL_CEP_DURATION_MIN
