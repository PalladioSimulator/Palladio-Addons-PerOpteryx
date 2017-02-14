/**
 */
package strategyConfig.impl;

import concernStrategy.Feature;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import strategyConfig.AttributeValue;
import strategyConfig.ConcernconfigPackage;
import strategyConfig.ConfigNode;
import strategyConfig.ConfigState;

import strategyConfig.util.ConcernconfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.impl.ConfigNodeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link strategyConfig.impl.ConfigNodeImpl#getConfigState <em>Config State</em>}</li>
 *   <li>{@link strategyConfig.impl.ConfigNodeImpl#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigNodeImpl extends MinimalEObjectImpl.Container implements ConfigNode {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Feature origin;

	/**
	 * The default value of the '{@link #getConfigState() <em>Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigState()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigState CONFIG_STATE_EDEFAULT = ConfigState.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getConfigState() <em>Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigState()
	 * @generated
	 * @ordered
	 */
	protected ConfigState configState = CONFIG_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributevalue() <em>Attributevalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributevalue()
	 * @generated
	 * @ordered
	 */
	protected EList attributevalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConcernconfigPackage.Literals.CONFIG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Feature)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcernconfigPackage.CONFIG_NODE__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Feature newOrigin) {
		Feature oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.CONFIG_NODE__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigState getConfigState() {
		return configState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigState(ConfigState newConfigState) {
		ConfigState oldConfigState = configState;
		configState = newConfigState == null ? CONFIG_STATE_EDEFAULT : newConfigState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.CONFIG_NODE__CONFIG_STATE, oldConfigState, configState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributevalue() {
		if (attributevalue == null) {
			attributevalue = new EObjectContainmentWithInverseEList(AttributeValue.class, this, ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE, ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE);
		}
		return attributevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConfigCardinalityInvalid(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConcernconfigValidator.DIAGNOSTIC_SOURCE,
						 ConcernconfigValidator.CONFIG_NODE__CONFIG_CARDINALITY_INVALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConfigCardinalityInvalid", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CheckMultiplicityOfFeatureGroup(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConcernconfigValidator.DIAGNOSTIC_SOURCE,
						 ConcernconfigValidator.CONFIG_NODE__CHECK_MULTIPLICITY_OF_FEATURE_GROUP,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CheckMultiplicityOfFeatureGroup", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				return ((InternalEList)getAttributevalue()).basicAdd(otherEnd, msgs);
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
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				return ((InternalEList)getAttributevalue()).basicRemove(otherEnd, msgs);
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
			case ConcernconfigPackage.CONFIG_NODE__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case ConcernconfigPackage.CONFIG_NODE__CONFIG_STATE:
				return getConfigState();
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				return getAttributevalue();
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
			case ConcernconfigPackage.CONFIG_NODE__ORIGIN:
				setOrigin((Feature)newValue);
				return;
			case ConcernconfigPackage.CONFIG_NODE__CONFIG_STATE:
				setConfigState((ConfigState)newValue);
				return;
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				getAttributevalue().clear();
				getAttributevalue().addAll((Collection)newValue);
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
			case ConcernconfigPackage.CONFIG_NODE__ORIGIN:
				setOrigin((Feature)null);
				return;
			case ConcernconfigPackage.CONFIG_NODE__CONFIG_STATE:
				setConfigState(CONFIG_STATE_EDEFAULT);
				return;
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				getAttributevalue().clear();
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
			case ConcernconfigPackage.CONFIG_NODE__ORIGIN:
				return origin != null;
			case ConcernconfigPackage.CONFIG_NODE__CONFIG_STATE:
				return configState != CONFIG_STATE_EDEFAULT;
			case ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE:
				return attributevalue != null && !attributevalue.isEmpty();
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
		result.append(" (configState: ");
		result.append(configState);
		result.append(')');
		return result.toString();
	}

} //ConfigNodeImpl
