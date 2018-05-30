/**
 */
package strategyConfig.impl;

import concernStrategy.FeatureDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import strategyConfig.ConcernconfigPackage;
import strategyConfig.ConfigNode;
import strategyConfig.Configuration;
import strategyConfig.FeatureConfig;
import strategyConfig.FeatureConfigState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.impl.FeatureConfigImpl#getFeatureConfigState <em>Feature Config State</em>}</li>
 *   <li>{@link strategyConfig.impl.FeatureConfigImpl#getConfignode <em>Confignode</em>}</li>
 *   <li>{@link strategyConfig.impl.FeatureConfigImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link strategyConfig.impl.FeatureConfigImpl#getConfigurationOverrides <em>Configuration Overrides</em>}</li>
 *   <li>{@link strategyConfig.impl.FeatureConfigImpl#getConfigurationDefault <em>Configuration Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureConfigImpl extends MinimalEObjectImpl.Container implements FeatureConfig {
	/**
	 * The default value of the '{@link #getFeatureConfigState() <em>Feature Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConfigState()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureConfigState FEATURE_CONFIG_STATE_EDEFAULT = FeatureConfigState.NOT_SET_LITERAL;

	/**
	 * The cached value of the '{@link #getFeatureConfigState() <em>Feature Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConfigState()
	 * @generated
	 * @ordered
	 */
	protected FeatureConfigState featureConfigState = FEATURE_CONFIG_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfignode() <em>Confignode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfignode()
	 * @generated
	 * @ordered
	 */
	protected EList confignode;

	/**
	 * The cached value of the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected FeatureDiagram annotatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConcernconfigPackage.Literals.FEATURE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfigState getFeatureConfigState() {
		return featureConfigState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureConfigState(FeatureConfigState newFeatureConfigState) {
		FeatureConfigState oldFeatureConfigState = featureConfigState;
		featureConfigState = newFeatureConfigState == null ? FEATURE_CONFIG_STATE_EDEFAULT : newFeatureConfigState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.FEATURE_CONFIG__FEATURE_CONFIG_STATE, oldFeatureConfigState, featureConfigState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfignode() {
		if (confignode == null) {
			confignode = new EObjectContainmentEList(ConfigNode.class, this, ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE);
		}
		return confignode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram getAnnotatedElement() {
		if (annotatedElement != null && annotatedElement.eIsProxy()) {
			InternalEObject oldAnnotatedElement = (InternalEObject)annotatedElement;
			annotatedElement = (FeatureDiagram)eResolveProxy(oldAnnotatedElement);
			if (annotatedElement != oldAnnotatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram basicGetAnnotatedElement() {
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedElement(FeatureDiagram newAnnotatedElement) {
		FeatureDiagram oldAnnotatedElement = annotatedElement;
		annotatedElement = newAnnotatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfigurationOverrides() {
		if (eContainerFeatureID() != ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES) return null;
		return (Configuration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationOverrides(Configuration newConfigurationOverrides, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfigurationOverrides, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationOverrides(Configuration newConfigurationOverrides) {
		if (newConfigurationOverrides != eInternalContainer() || (eContainerFeatureID() != ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES && newConfigurationOverrides != null)) {
			if (EcoreUtil.isAncestor(this, newConfigurationOverrides))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfigurationOverrides != null)
				msgs = ((InternalEObject)newConfigurationOverrides).eInverseAdd(this, ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES, Configuration.class, msgs);
			msgs = basicSetConfigurationOverrides(newConfigurationOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES, newConfigurationOverrides, newConfigurationOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfigurationDefault() {
		if (eContainerFeatureID() != ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT) return null;
		return (Configuration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationDefault(Configuration newConfigurationDefault, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfigurationDefault, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationDefault(Configuration newConfigurationDefault) {
		if (newConfigurationDefault != eInternalContainer() || (eContainerFeatureID() != ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT && newConfigurationDefault != null)) {
			if (EcoreUtil.isAncestor(this, newConfigurationDefault))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfigurationDefault != null)
				msgs = ((InternalEObject)newConfigurationDefault).eInverseAdd(this, ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG, Configuration.class, msgs);
			msgs = basicSetConfigurationDefault(newConfigurationDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT, newConfigurationDefault, newConfigurationDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfigState showFeatureConfigState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfigurationOverrides((Configuration)otherEnd, msgs);
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfigurationDefault((Configuration)otherEnd, msgs);
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
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE:
				return ((InternalEList)getConfignode()).basicRemove(otherEnd, msgs);
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				return basicSetConfigurationOverrides(null, msgs);
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				return basicSetConfigurationDefault(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				return eInternalContainer().eInverseRemove(this, ConcernconfigPackage.CONFIGURATION__CONFIG_OVERRIDES, Configuration.class, msgs);
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				return eInternalContainer().eInverseRemove(this, ConcernconfigPackage.CONFIGURATION__DEFAULT_CONFIG, Configuration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcernconfigPackage.FEATURE_CONFIG__FEATURE_CONFIG_STATE:
				return getFeatureConfigState();
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE:
				return getConfignode();
			case ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				return getConfigurationOverrides();
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				return getConfigurationDefault();
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
			case ConcernconfigPackage.FEATURE_CONFIG__FEATURE_CONFIG_STATE:
				setFeatureConfigState((FeatureConfigState)newValue);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE:
				getConfignode().clear();
				getConfignode().addAll((Collection)newValue);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT:
				setAnnotatedElement((FeatureDiagram)newValue);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				setConfigurationOverrides((Configuration)newValue);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				setConfigurationDefault((Configuration)newValue);
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
			case ConcernconfigPackage.FEATURE_CONFIG__FEATURE_CONFIG_STATE:
				setFeatureConfigState(FEATURE_CONFIG_STATE_EDEFAULT);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE:
				getConfignode().clear();
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT:
				setAnnotatedElement((FeatureDiagram)null);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				setConfigurationOverrides((Configuration)null);
				return;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				setConfigurationDefault((Configuration)null);
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
			case ConcernconfigPackage.FEATURE_CONFIG__FEATURE_CONFIG_STATE:
				return featureConfigState != FEATURE_CONFIG_STATE_EDEFAULT;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGNODE:
				return confignode != null && !confignode.isEmpty();
			case ConcernconfigPackage.FEATURE_CONFIG__ANNOTATED_ELEMENT:
				return annotatedElement != null;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_OVERRIDES:
				return getConfigurationOverrides() != null;
			case ConcernconfigPackage.FEATURE_CONFIG__CONFIGURATION_DEFAULT:
				return getConfigurationDefault() != null;
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
		result.append(" (featureConfigState: ");
		result.append(featureConfigState);
		result.append(')');
		return result.toString();
	}

} //FeatureConfigImpl
