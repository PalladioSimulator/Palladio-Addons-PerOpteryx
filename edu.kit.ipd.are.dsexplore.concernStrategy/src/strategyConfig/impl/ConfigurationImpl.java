/**
 */
package strategyConfig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import strategyConfig.ConcernconfigPackage;
import strategyConfig.Configuration;
import strategyConfig.FeatureConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.impl.ConfigurationImpl#getDefaultConfig <em>Default Config</em>}</li>
 *   <li>{@link strategyConfig.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link strategyConfig.impl.ConfigurationImpl#getConfigOverrides <em>Config Overrides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getDefaultConfig() <em>Default Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfig()
	 * @generated
	 * @ordered
	 */
	protected FeatureConfig defaultConfig;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigOverrides() <em>Config Overrides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOverrides()
	 * @generated
	 * @ordered
	 */
	protected EList configOverrides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConcernconfigPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfig getDefaultConfig() {
		return defaultConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConfig(FeatureConfig newDefaultConfig, NotificationChain msgs) {
		FeatureConfig oldDefaultConfig = defaultConfig;
		defaultConfig = newDefaultConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG, oldDefaultConfig, newDefaultConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultConfig(FeatureConfig newDefaultConfig) {
		if (newDefaultConfig != defaultConfig) {
			NotificationChain msgs = null;
			if (defaultConfig != null)
				msgs = ((InternalEObject)defaultConfig).eInverseRemove(this, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT, FeatureConfig.class, msgs);
			if (newDefaultConfig != null)
				msgs = ((InternalEObject)newDefaultConfig).eInverseAdd(this, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT, FeatureConfig.class, msgs);
			msgs = basicSetDefaultConfig(newDefaultConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG, newDefaultConfig, newDefaultConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfigOverrides() {
		if (configOverrides == null) {
			configOverrides = new EObjectContainmentWithInverseEList(FeatureConfig.class, this, ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES);
		}
		return configOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				if (defaultConfig != null)
					msgs = ((InternalEObject)defaultConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG, null, msgs);
				return basicSetDefaultConfig((FeatureConfig)otherEnd, msgs);
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				return ((InternalEList)getConfigOverrides()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				return basicSetDefaultConfig(null, msgs);
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				return ((InternalEList)getConfigOverrides()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				return getDefaultConfig();
			case ConcernconfigPackage.CONFIGURATION__NAME:
				return getName();
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				return getConfigOverrides();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				setDefaultConfig((FeatureConfig)newValue);
				return;
			case ConcernconfigPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				getConfigOverrides().clear();
				getConfigOverrides().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				setDefaultConfig((FeatureConfig)null);
				return;
			case ConcernconfigPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				getConfigOverrides().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG:
				return defaultConfig != null;
			case ConcernconfigPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES:
				return configOverrides != null && !configOverrides.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
