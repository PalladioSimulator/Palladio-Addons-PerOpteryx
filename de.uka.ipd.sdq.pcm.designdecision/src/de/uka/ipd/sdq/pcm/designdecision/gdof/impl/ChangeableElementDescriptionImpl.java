/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Changeable Element Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getChangeable <em>Changeable</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getValueRule <em>Value Rule</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getSelectionRule <em>Selection Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeableElementDescriptionImpl extends NamedElementImpl implements ChangeableElementDescription {
	/**
	 * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getChangeable()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature changeable;

	/**
	 * The cached value of the '{@link #getValueRule() <em>Value Rule</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueRule()
	 * @generated
	 * @ordered
	 */
	protected ValueRule valueRule;

	/**
	 * The cached value of the '{@link #getSelectionRule() <em>Selection Rule</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelectionRule()
	 * @generated
	 * @ordered
	 */
	protected SelectionRule selectionRule;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeableElementDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.CHANGEABLE_ELEMENT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getChangeable() {
		if (changeable != null && changeable.eIsProxy()) {
			InternalEObject oldChangeable = (InternalEObject) changeable;
			changeable = (EStructuralFeature) eResolveProxy(oldChangeable);
			if (changeable != oldChangeable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, changeable));
			}
		}
		return changeable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeable(EStructuralFeature newChangeable) {
		EStructuralFeature oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueRule getValueRule() {
		return valueRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRule(ValueRule newValueRule, NotificationChain msgs) {
		ValueRule oldValueRule = valueRule;
		valueRule = newValueRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, oldValueRule, newValueRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueRule(ValueRule newValueRule) {
		if (newValueRule != valueRule) {
			NotificationChain msgs = null;
			if (valueRule != null)
				msgs = ((InternalEObject) valueRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
			if (newValueRule != null)
				msgs = ((InternalEObject) newValueRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
			msgs = basicSetValueRule(newValueRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, newValueRule, newValueRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectionRule getSelectionRule() {
		return selectionRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionRule(SelectionRule newSelectionRule, NotificationChain msgs) {
		SelectionRule oldSelectionRule = selectionRule;
		selectionRule = newSelectionRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, oldSelectionRule, newSelectionRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectionRule(SelectionRule newSelectionRule) {
		if (newSelectionRule != selectionRule) {
			NotificationChain msgs = null;
			if (selectionRule != null)
				msgs = ((InternalEObject) selectionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null, msgs);
			if (newSelectionRule != null)
				msgs = ((InternalEObject) newSelectionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null, msgs);
			msgs = basicSetSelectionRule(newSelectionRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, newSelectionRule, newSelectionRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
			return basicSetValueRule(null, msgs);
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			return basicSetSelectionRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
			if (resolve)
				return getChangeable();
			return basicGetChangeable();
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
			return getValueRule();
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			return getSelectionRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
			setChangeable((EStructuralFeature) newValue);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
			setValueRule((ValueRule) newValue);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			setSelectionRule((SelectionRule) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
			setChangeable((EStructuralFeature) null);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
			setValueRule((ValueRule) null);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			setSelectionRule((SelectionRule) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
			return changeable != null;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
			return valueRule != null;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			return selectionRule != null;
		}
		return super.eIsSet(featureID);
	}

} // ChangeableElementDescriptionImpl
