/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL CEP COINCIDE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl#getRef2 <em>Ref2</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_CEP_COINCIDEImpl extends MinimalEObjectImpl.Container implements DSL_CEP_COINCIDE
{
  /**
   * The cached value of the '{@link #getRef1() <em>Ref1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef1()
   * @generated
   * @ordered
   */
  protected DSL_REF_CONDITION ref1;

  /**
   * The cached value of the '{@link #getRef2() <em>Ref2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef2()
   * @generated
   * @ordered
   */
  protected DSL_REF_CONDITION ref2;

  /**
   * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected DSL_CEP_DURATION window;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_CEP_COINCIDEImpl()
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
    return SensinactPackage.Literals.DSL_CEP_COINCIDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION getRef1()
  {
    return ref1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef1(DSL_REF_CONDITION newRef1, NotificationChain msgs)
  {
    DSL_REF_CONDITION oldRef1 = ref1;
    ref1 = newRef1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__REF1, oldRef1, newRef1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef1(DSL_REF_CONDITION newRef1)
  {
    if (newRef1 != ref1)
    {
      NotificationChain msgs = null;
      if (ref1 != null)
        msgs = ((InternalEObject)ref1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__REF1, null, msgs);
      if (newRef1 != null)
        msgs = ((InternalEObject)newRef1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__REF1, null, msgs);
      msgs = basicSetRef1(newRef1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__REF1, newRef1, newRef1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION getRef2()
  {
    return ref2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef2(DSL_REF_CONDITION newRef2, NotificationChain msgs)
  {
    DSL_REF_CONDITION oldRef2 = ref2;
    ref2 = newRef2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__REF2, oldRef2, newRef2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef2(DSL_REF_CONDITION newRef2)
  {
    if (newRef2 != ref2)
    {
      NotificationChain msgs = null;
      if (ref2 != null)
        msgs = ((InternalEObject)ref2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__REF2, null, msgs);
      if (newRef2 != null)
        msgs = ((InternalEObject)newRef2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__REF2, null, msgs);
      msgs = basicSetRef2(newRef2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__REF2, newRef2, newRef2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION getWindow()
  {
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindow(DSL_CEP_DURATION newWindow, NotificationChain msgs)
  {
    DSL_CEP_DURATION oldWindow = window;
    window = newWindow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__WINDOW, oldWindow, newWindow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindow(DSL_CEP_DURATION newWindow)
  {
    if (newWindow != window)
    {
      NotificationChain msgs = null;
      if (window != null)
        msgs = ((InternalEObject)window).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__WINDOW, null, msgs);
      if (newWindow != null)
        msgs = ((InternalEObject)newWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COINCIDE__WINDOW, null, msgs);
      msgs = basicSetWindow(newWindow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COINCIDE__WINDOW, newWindow, newWindow));
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
      case SensinactPackage.DSL_CEP_COINCIDE__REF1:
        return basicSetRef1(null, msgs);
      case SensinactPackage.DSL_CEP_COINCIDE__REF2:
        return basicSetRef2(null, msgs);
      case SensinactPackage.DSL_CEP_COINCIDE__WINDOW:
        return basicSetWindow(null, msgs);
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
      case SensinactPackage.DSL_CEP_COINCIDE__REF1:
        return getRef1();
      case SensinactPackage.DSL_CEP_COINCIDE__REF2:
        return getRef2();
      case SensinactPackage.DSL_CEP_COINCIDE__WINDOW:
        return getWindow();
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
      case SensinactPackage.DSL_CEP_COINCIDE__REF1:
        setRef1((DSL_REF_CONDITION)newValue);
        return;
      case SensinactPackage.DSL_CEP_COINCIDE__REF2:
        setRef2((DSL_REF_CONDITION)newValue);
        return;
      case SensinactPackage.DSL_CEP_COINCIDE__WINDOW:
        setWindow((DSL_CEP_DURATION)newValue);
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
      case SensinactPackage.DSL_CEP_COINCIDE__REF1:
        setRef1((DSL_REF_CONDITION)null);
        return;
      case SensinactPackage.DSL_CEP_COINCIDE__REF2:
        setRef2((DSL_REF_CONDITION)null);
        return;
      case SensinactPackage.DSL_CEP_COINCIDE__WINDOW:
        setWindow((DSL_CEP_DURATION)null);
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
      case SensinactPackage.DSL_CEP_COINCIDE__REF1:
        return ref1 != null;
      case SensinactPackage.DSL_CEP_COINCIDE__REF2:
        return ref2 != null;
      case SensinactPackage.DSL_CEP_COINCIDE__WINDOW:
        return window != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_CEP_COINCIDEImpl
