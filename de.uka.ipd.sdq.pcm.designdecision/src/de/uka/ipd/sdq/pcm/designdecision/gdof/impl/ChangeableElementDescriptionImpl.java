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
import genericdesigndecision.genericDoF.GenericDoFPackage;

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
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getPcmValueRule <em>Pcm Value Rule</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getPcmSelectionRule <em>Pcm Selection Rule</em>}</li>
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
	protected genericdesigndecision.genericDoF.ValueRule valueRule;

	/**
	 * The cached value of the '{@link #getSelectionRule() <em>Selection Rule</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelectionRule()
	 * @generated
	 * @ordered
	 */
	protected genericdesigndecision.genericDoF.SelectionRule selectionRule;

	/**
	 * The cached value of the '{@link #getPcmValueRule() <em>Pcm Value Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmValueRule()
	 * @generated
	 * @ordered
	 */
	protected ValueRule pcmValueRule;

	/**
	 * The cached value of the '{@link #getPcmSelectionRule() <em>Pcm Selection Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmSelectionRule()
	 * @generated
	 * @ordered
	 */
	protected SelectionRule pcmSelectionRule;

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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, changeable));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public genericdesigndecision.genericDoF.ValueRule getValueRule() {
		return valueRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRule(genericdesigndecision.genericDoF.ValueRule newValueRule,
			NotificationChain msgs) {
		genericdesigndecision.genericDoF.ValueRule oldValueRule = valueRule;
		valueRule = newValueRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, oldValueRule, newValueRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueRule(genericdesigndecision.genericDoF.ValueRule newValueRule) {
		if (newValueRule != valueRule) {
			NotificationChain msgs = null;
			if (valueRule != null)
				msgs = ((InternalEObject) valueRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
			if (newValueRule != null)
				msgs = ((InternalEObject) newValueRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
			msgs = basicSetValueRule(newValueRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, newValueRule, newValueRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public genericdesigndecision.genericDoF.SelectionRule getSelectionRule() {
		return selectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionRule(genericdesigndecision.genericDoF.SelectionRule newSelectionRule,
			NotificationChain msgs) {
		genericdesigndecision.genericDoF.SelectionRule oldSelectionRule = selectionRule;
		selectionRule = newSelectionRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, oldSelectionRule, newSelectionRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectionRule(genericdesigndecision.genericDoF.SelectionRule newSelectionRule) {
		if (newSelectionRule != selectionRule) {
			NotificationChain msgs = null;
			if (selectionRule != null)
				msgs = ((InternalEObject) selectionRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null,
						msgs);
			if (newSelectionRule != null)
				msgs = ((InternalEObject) newSelectionRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null,
						msgs);
			msgs = basicSetSelectionRule(newSelectionRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, newSelectionRule, newSelectionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueRule getPcmValueRule() {
		return pcmValueRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmValueRule(ValueRule newPcmValueRule, NotificationChain msgs) {
		ValueRule oldPcmValueRule = pcmValueRule;
		pcmValueRule = newPcmValueRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE, oldPcmValueRule, newPcmValueRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmValueRule(ValueRule newPcmValueRule) {
		if (newPcmValueRule != pcmValueRule) {
			NotificationChain msgs = null;
			if (pcmValueRule != null)
				msgs = ((InternalEObject) pcmValueRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE, null,
						msgs);
			if (newPcmValueRule != null)
				msgs = ((InternalEObject) newPcmValueRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE, null,
						msgs);
			msgs = basicSetPcmValueRule(newPcmValueRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE, newPcmValueRule, newPcmValueRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectionRule getPcmSelectionRule() {
		return pcmSelectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPcmSelectionRule(SelectionRule newPcmSelectionRule, NotificationChain msgs) {
		SelectionRule oldPcmSelectionRule = pcmSelectionRule;
		pcmSelectionRule = newPcmSelectionRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE, oldPcmSelectionRule,
					newPcmSelectionRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmSelectionRule(SelectionRule newPcmSelectionRule) {
		if (newPcmSelectionRule != pcmSelectionRule) {
			NotificationChain msgs = null;
			if (pcmSelectionRule != null)
				msgs = ((InternalEObject) pcmSelectionRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE, null,
						msgs);
			if (newPcmSelectionRule != null)
				msgs = ((InternalEObject) newPcmSelectionRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE, null,
						msgs);
			msgs = basicSetPcmSelectionRule(newPcmSelectionRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE, newPcmSelectionRule,
					newPcmSelectionRule));
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
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE:
			return basicSetPcmValueRule(null, msgs);
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE:
			return basicSetPcmSelectionRule(null, msgs);
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
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE:
			return getPcmValueRule();
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE:
			return getPcmSelectionRule();
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
			setValueRule((genericdesigndecision.genericDoF.ValueRule) newValue);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			setSelectionRule((genericdesigndecision.genericDoF.SelectionRule) newValue);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE:
			setPcmValueRule((ValueRule) newValue);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE:
			setPcmSelectionRule((SelectionRule) newValue);
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
			setValueRule((genericdesigndecision.genericDoF.ValueRule) null);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
			setSelectionRule((genericdesigndecision.genericDoF.SelectionRule) null);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE:
			setPcmValueRule((ValueRule) null);
			return;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE:
			setPcmSelectionRule((SelectionRule) null);
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
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_VALUE_RULE:
			return pcmValueRule != null;
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__PCM_SELECTION_RULE:
			return pcmSelectionRule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.genericDoF.ChangeableElementDescription.class) {
			switch (derivedFeatureID) {
			case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
				return GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE;
			case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
				return GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE;
			case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
				return GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.genericDoF.ChangeableElementDescription.class) {
			switch (baseFeatureID) {
			case GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
				return gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE;
			case GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
				return gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE;
			case GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
				return gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // ChangeableElementDescriptionImpl
