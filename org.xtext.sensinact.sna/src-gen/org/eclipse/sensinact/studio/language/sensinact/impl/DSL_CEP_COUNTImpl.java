/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL CEP COUNT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_CEP_COUNTImpl extends MinimalEObjectImpl.Container implements DSL_CEP_COUNT
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected DSL_REF_CONDITION ref;

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
  protected DSL_CEP_COUNTImpl()
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
    return SensinactPackage.Literals.DSL_CEP_COUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(DSL_REF_CONDITION newRef, NotificationChain msgs)
  {
    DSL_REF_CONDITION oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COUNT__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(DSL_REF_CONDITION newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COUNT__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COUNT__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COUNT__REF, newRef, newRef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COUNT__WINDOW, oldWindow, newWindow);
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
        msgs = ((InternalEObject)window).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COUNT__WINDOW, null, msgs);
      if (newWindow != null)
        msgs = ((InternalEObject)newWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_COUNT__WINDOW, null, msgs);
      msgs = basicSetWindow(newWindow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_COUNT__WINDOW, newWindow, newWindow));
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
      case SensinactPackage.DSL_CEP_COUNT__REF:
        return basicSetRef(null, msgs);
      case SensinactPackage.DSL_CEP_COUNT__WINDOW:
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
      case SensinactPackage.DSL_CEP_COUNT__REF:
        return getRef();
      case SensinactPackage.DSL_CEP_COUNT__WINDOW:
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
      case SensinactPackage.DSL_CEP_COUNT__REF:
        setRef((DSL_REF_CONDITION)newValue);
        return;
      case SensinactPackage.DSL_CEP_COUNT__WINDOW:
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
      case SensinactPackage.DSL_CEP_COUNT__REF:
        setRef((DSL_REF_CONDITION)null);
        return;
      case SensinactPackage.DSL_CEP_COUNT__WINDOW:
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
      case SensinactPackage.DSL_CEP_COUNT__REF:
        return ref != null;
      case SensinactPackage.DSL_CEP_COUNT__WINDOW:
        return window != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_CEP_COUNTImpl
