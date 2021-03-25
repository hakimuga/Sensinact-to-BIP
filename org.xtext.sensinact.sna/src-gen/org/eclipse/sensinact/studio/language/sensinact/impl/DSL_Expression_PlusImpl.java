/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Expression Plus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_Expression_PlusImpl extends DSL_ExpressionImpl implements DSL_Expression_Plus
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected DSL_Expression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected DSL_Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_Expression_PlusImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SensinactPackage.Literals.DSL_EXPRESSION_PLUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(DSL_Expression newLeft, NotificationChain msgs)
  {
    DSL_Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_EXPRESSION_PLUS__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(DSL_Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_EXPRESSION_PLUS__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_EXPRESSION_PLUS__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_EXPRESSION_PLUS__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(DSL_Expression newRight, NotificationChain msgs)
  {
    DSL_Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(DSL_Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_EXPRESSION_PLUS__LEFT:
        return basicSetLeft(null, msgs);
      case SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT:
        return basicSetRight(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_EXPRESSION_PLUS__LEFT:
        return getLeft();
      case SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_EXPRESSION_PLUS__LEFT:
        setLeft((DSL_Expression)newValue);
        return;
      case SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT:
        setRight((DSL_Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_EXPRESSION_PLUS__LEFT:
        setLeft((DSL_Expression)null);
        return;
      case SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT:
        setRight((DSL_Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_EXPRESSION_PLUS__LEFT:
        return left != null;
      case SensinactPackage.DSL_EXPRESSION_PLUS__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_Expression_PlusImpl
