/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl#getGatewayID <em>Gateway ID</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl#getResourceID <em>Resource ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_ResourceImpl extends DSL_REFImpl implements DSL_Resource
{
  /**
   * The default value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGatewayID()
   * @generated
   * @ordered
   */
  protected static final String GATEWAY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGatewayID()
   * @generated
   * @ordered
   */
  protected String gatewayID = GATEWAY_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceID()
   * @generated
   * @ordered
   */
  protected static final String DEVICE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceID()
   * @generated
   * @ordered
   */
  protected String deviceID = DEVICE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceID()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceID()
   * @generated
   * @ordered
   */
  protected String serviceID = SERVICE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getResourceID() <em>Resource ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceID()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResourceID() <em>Resource ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceID()
   * @generated
   * @ordered
   */
  protected String resourceID = RESOURCE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_ResourceImpl()
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
    return SensinactPackage.Literals.DSL_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGatewayID()
  {
    return gatewayID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGatewayID(String newGatewayID)
  {
    String oldGatewayID = gatewayID;
    gatewayID = newGatewayID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE__GATEWAY_ID, oldGatewayID, gatewayID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeviceID()
  {
    return deviceID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeviceID(String newDeviceID)
  {
    String oldDeviceID = deviceID;
    deviceID = newDeviceID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE__DEVICE_ID, oldDeviceID, deviceID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceID()
  {
    return serviceID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceID(String newServiceID)
  {
    String oldServiceID = serviceID;
    serviceID = newServiceID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE__SERVICE_ID, oldServiceID, serviceID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResourceID()
  {
    return resourceID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceID(String newResourceID)
  {
    String oldResourceID = resourceID;
    resourceID = newResourceID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE__RESOURCE_ID, oldResourceID, resourceID));
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
      case SensinactPackage.DSL_RESOURCE__GATEWAY_ID:
        return getGatewayID();
      case SensinactPackage.DSL_RESOURCE__DEVICE_ID:
        return getDeviceID();
      case SensinactPackage.DSL_RESOURCE__SERVICE_ID:
        return getServiceID();
      case SensinactPackage.DSL_RESOURCE__RESOURCE_ID:
        return getResourceID();
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
      case SensinactPackage.DSL_RESOURCE__GATEWAY_ID:
        setGatewayID((String)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE__DEVICE_ID:
        setDeviceID((String)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE__SERVICE_ID:
        setServiceID((String)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE__RESOURCE_ID:
        setResourceID((String)newValue);
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
      case SensinactPackage.DSL_RESOURCE__GATEWAY_ID:
        setGatewayID(GATEWAY_ID_EDEFAULT);
        return;
      case SensinactPackage.DSL_RESOURCE__DEVICE_ID:
        setDeviceID(DEVICE_ID_EDEFAULT);
        return;
      case SensinactPackage.DSL_RESOURCE__SERVICE_ID:
        setServiceID(SERVICE_ID_EDEFAULT);
        return;
      case SensinactPackage.DSL_RESOURCE__RESOURCE_ID:
        setResourceID(RESOURCE_ID_EDEFAULT);
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
      case SensinactPackage.DSL_RESOURCE__GATEWAY_ID:
        return GATEWAY_ID_EDEFAULT == null ? gatewayID != null : !GATEWAY_ID_EDEFAULT.equals(gatewayID);
      case SensinactPackage.DSL_RESOURCE__DEVICE_ID:
        return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
      case SensinactPackage.DSL_RESOURCE__SERVICE_ID:
        return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
      case SensinactPackage.DSL_RESOURCE__RESOURCE_ID:
        return RESOURCE_ID_EDEFAULT == null ? resourceID != null : !RESOURCE_ID_EDEFAULT.equals(resourceID);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (gatewayID: ");
    result.append(gatewayID);
    result.append(", deviceID: ");
    result.append(deviceID);
    result.append(", serviceID: ");
    result.append(serviceID);
    result.append(", resourceID: ");
    result.append(resourceID);
    result.append(')');
    return result.toString();
  }

} //DSL_ResourceImpl
