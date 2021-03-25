/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART;
import org.eclipse.sensinact.studio.language.sensinact.DSL_On;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL SENSINACT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getAutostart <em>Autostart</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getOn <em>On</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl#getEca <em>Eca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_SENSINACTImpl extends MinimalEObjectImpl.Container implements DSL_SENSINACT
{
  /**
   * The cached value of the '{@link #getAutostart() <em>Autostart</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutostart()
   * @generated
   * @ordered
   */
  protected DSL_FLAG_AUTOSTART autostart;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<DSL_Resource> resources;

  /**
   * The cached value of the '{@link #getProb() <em>Prob</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProb()
   * @generated
   * @ordered
   */
  protected EList<DSL_CLOCK_STOCHASTIC> prob;

  /**
   * The cached value of the '{@link #getCep() <em>Cep</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCep()
   * @generated
   * @ordered
   */
  protected EList<DSL_CEP_STATEMENT> cep;

  /**
   * The cached value of the '{@link #getOn() <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected DSL_On on;

  /**
   * The cached value of the '{@link #getEca() <em>Eca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEca()
   * @generated
   * @ordered
   */
  protected DSL_ECA_STATEMENT eca;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_SENSINACTImpl()
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
    return SensinactPackage.Literals.DSL_SENSINACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_FLAG_AUTOSTART getAutostart()
  {
    return autostart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAutostart(DSL_FLAG_AUTOSTART newAutostart, NotificationChain msgs)
  {
    DSL_FLAG_AUTOSTART oldAutostart = autostart;
    autostart = newAutostart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__AUTOSTART, oldAutostart, newAutostart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutostart(DSL_FLAG_AUTOSTART newAutostart)
  {
    if (newAutostart != autostart)
    {
      NotificationChain msgs = null;
      if (autostart != null)
        msgs = ((InternalEObject)autostart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__AUTOSTART, null, msgs);
      if (newAutostart != null)
        msgs = ((InternalEObject)newAutostart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__AUTOSTART, null, msgs);
      msgs = basicSetAutostart(newAutostart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__AUTOSTART, newAutostart, newAutostart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSL_Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<DSL_Resource>(DSL_Resource.class, this, SensinactPackage.DSL_SENSINACT__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSL_CLOCK_STOCHASTIC> getProb()
  {
    if (prob == null)
    {
      prob = new EObjectContainmentEList<DSL_CLOCK_STOCHASTIC>(DSL_CLOCK_STOCHASTIC.class, this, SensinactPackage.DSL_SENSINACT__PROB);
    }
    return prob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSL_CEP_STATEMENT> getCep()
  {
    if (cep == null)
    {
      cep = new EObjectContainmentEList<DSL_CEP_STATEMENT>(DSL_CEP_STATEMENT.class, this, SensinactPackage.DSL_SENSINACT__CEP);
    }
    return cep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_On getOn()
  {
    return on;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOn(DSL_On newOn, NotificationChain msgs)
  {
    DSL_On oldOn = on;
    on = newOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__ON, oldOn, newOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOn(DSL_On newOn)
  {
    if (newOn != on)
    {
      NotificationChain msgs = null;
      if (on != null)
        msgs = ((InternalEObject)on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__ON, null, msgs);
      if (newOn != null)
        msgs = ((InternalEObject)newOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__ON, null, msgs);
      msgs = basicSetOn(newOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__ON, newOn, newOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ECA_STATEMENT getEca()
  {
    return eca;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEca(DSL_ECA_STATEMENT newEca, NotificationChain msgs)
  {
    DSL_ECA_STATEMENT oldEca = eca;
    eca = newEca;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__ECA, oldEca, newEca);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEca(DSL_ECA_STATEMENT newEca)
  {
    if (newEca != eca)
    {
      NotificationChain msgs = null;
      if (eca != null)
        msgs = ((InternalEObject)eca).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__ECA, null, msgs);
      if (newEca != null)
        msgs = ((InternalEObject)newEca).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_SENSINACT__ECA, null, msgs);
      msgs = basicSetEca(newEca, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_SENSINACT__ECA, newEca, newEca));
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
      case SensinactPackage.DSL_SENSINACT__AUTOSTART:
        return basicSetAutostart(null, msgs);
      case SensinactPackage.DSL_SENSINACT__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case SensinactPackage.DSL_SENSINACT__PROB:
        return ((InternalEList<?>)getProb()).basicRemove(otherEnd, msgs);
      case SensinactPackage.DSL_SENSINACT__CEP:
        return ((InternalEList<?>)getCep()).basicRemove(otherEnd, msgs);
      case SensinactPackage.DSL_SENSINACT__ON:
        return basicSetOn(null, msgs);
      case SensinactPackage.DSL_SENSINACT__ECA:
        return basicSetEca(null, msgs);
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
      case SensinactPackage.DSL_SENSINACT__AUTOSTART:
        return getAutostart();
      case SensinactPackage.DSL_SENSINACT__RESOURCES:
        return getResources();
      case SensinactPackage.DSL_SENSINACT__PROB:
        return getProb();
      case SensinactPackage.DSL_SENSINACT__CEP:
        return getCep();
      case SensinactPackage.DSL_SENSINACT__ON:
        return getOn();
      case SensinactPackage.DSL_SENSINACT__ECA:
        return getEca();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_SENSINACT__AUTOSTART:
        setAutostart((DSL_FLAG_AUTOSTART)newValue);
        return;
      case SensinactPackage.DSL_SENSINACT__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends DSL_Resource>)newValue);
        return;
      case SensinactPackage.DSL_SENSINACT__PROB:
        getProb().clear();
        getProb().addAll((Collection<? extends DSL_CLOCK_STOCHASTIC>)newValue);
        return;
      case SensinactPackage.DSL_SENSINACT__CEP:
        getCep().clear();
        getCep().addAll((Collection<? extends DSL_CEP_STATEMENT>)newValue);
        return;
      case SensinactPackage.DSL_SENSINACT__ON:
        setOn((DSL_On)newValue);
        return;
      case SensinactPackage.DSL_SENSINACT__ECA:
        setEca((DSL_ECA_STATEMENT)newValue);
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
      case SensinactPackage.DSL_SENSINACT__AUTOSTART:
        setAutostart((DSL_FLAG_AUTOSTART)null);
        return;
      case SensinactPackage.DSL_SENSINACT__RESOURCES:
        getResources().clear();
        return;
      case SensinactPackage.DSL_SENSINACT__PROB:
        getProb().clear();
        return;
      case SensinactPackage.DSL_SENSINACT__CEP:
        getCep().clear();
        return;
      case SensinactPackage.DSL_SENSINACT__ON:
        setOn((DSL_On)null);
        return;
      case SensinactPackage.DSL_SENSINACT__ECA:
        setEca((DSL_ECA_STATEMENT)null);
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
      case SensinactPackage.DSL_SENSINACT__AUTOSTART:
        return autostart != null;
      case SensinactPackage.DSL_SENSINACT__RESOURCES:
        return resources != null && !resources.isEmpty();
      case SensinactPackage.DSL_SENSINACT__PROB:
        return prob != null && !prob.isEmpty();
      case SensinactPackage.DSL_SENSINACT__CEP:
        return cep != null && !cep.isEmpty();
      case SensinactPackage.DSL_SENSINACT__ON:
        return on != null;
      case SensinactPackage.DSL_SENSINACT__ECA:
        return eca != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_SENSINACTImpl
