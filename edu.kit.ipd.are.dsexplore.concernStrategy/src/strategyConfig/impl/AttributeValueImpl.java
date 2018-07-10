/**
 */
package strategyConfig.impl;

import concernStrategy.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import strategyConfig.AttributeValue;
import strategyConfig.ConcernconfigPackage;
import strategyConfig.ConfigNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.impl.AttributeValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link strategyConfig.impl.AttributeValueImpl#getConfignode <em>Confignode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeValueImpl extends NamedElementImpl implements AttributeValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConcernconfigPackage.Literals.ATTRIBUTE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.ATTRIBUTE_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigNode getConfignode() {
		if (eContainerFeatureID() != ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE) return null;
		return (ConfigNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfignode(ConfigNode newConfignode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfignode, ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfignode(ConfigNode newConfignode) {
		if (newConfignode != eInternalContainer() || (eContainerFeatureID() != ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE && newConfignode != null)) {
			if (EcoreUtil.isAncestor(this, newConfignode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfignode != null)
				msgs = ((InternalEObject)newConfignode).eInverseAdd(this, ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE, ConfigNode.class, msgs);
			msgs = basicSetConfignode(newConfignode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE, newConfignode, newConfignode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfignode((ConfigNode)otherEnd, msgs);
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				return basicSetConfignode(null, msgs);
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				return eInternalContainer().eInverseRemove(this, ConcernconfigPackage.CONFIG_NODE__ATTRIBUTEVALUE, ConfigNode.class, msgs);
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__VALUE:
				return getValue();
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				return getConfignode();
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				setConfignode((ConfigNode)newValue);
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				setConfignode((ConfigNode)null);
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
			case ConcernconfigPackage.ATTRIBUTE_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ConcernconfigPackage.ATTRIBUTE_VALUE__CONFIGNODE:
				return getConfignode() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeValueImpl
