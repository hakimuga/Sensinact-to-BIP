/**
 */
package org.eclipse.sensinact.studio.language.sensinact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Expression Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_Expression_Multiplication()
 * @model
 * @generated
 */
public interface DSL_Expression_Multiplication extends DSL_Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(DSL_Expression)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_Expression_Multiplication_Left()
   * @model containment="true"
   * @generated
   */
  DSL_Expression getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DSL_Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(DSL_Expression)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_Expression_Multiplication_Right()
   * @model containment="true"
   * @generated
   */
  DSL_Expression getRight();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(DSL_Expression value);

} // DSL_Expression_Multiplication
