/**
 */
package org.eclipse.sensinact.studio.language.sensinact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Object Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_Object_Ref()
 * @model
 * @generated
 */
public interface DSL_Object_Ref extends DSL_Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(DSL_REF)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_Object_Ref_Value()
   * @model
   * @generated
   */
  DSL_REF getValue();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DSL_REF value);

} // DSL_Object_Ref
