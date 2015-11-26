/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import genericdesigndecision.genericDoF.GenericDoFPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Selection Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.InstanceSelectionRuleImpl#getContextInstance <em>Context Instance</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.InstanceSelectionRuleImpl#getPcmContextInstance <em>Pcm Context Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceSelectionRuleImpl extends SelectionRuleImpl implements InstanceSelectionRule {
	/**
	 * The cached value of the '{@link #getContextInstance() <em>Context Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContextInstance()
	 * @generated
	 * @ordered
	 */
	protected genericdesigndecision.genericDoF.ChangeableElementDescription contextInstance;

	/**
	 * The cached value of the '{@link #getPcmContextInstance() <em>Pcm Context Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmContextInstance()
	 * @generated
	 * @ordered
	 */
	protected ChangeableElementDescription pcmContextInstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSelectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.INSTANCE_SELECTION_RULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public genericdesigndecision.genericDoF.ChangeableElementDescription getContextInstance() {
		if (contextInstance != null && contextInstance.eIsProxy()) {
			InternalEObject oldContextInstance = (InternalEObject) contextInstance;
			contextInstance = (genericdesigndecision.genericDoF.ChangeableElementDescription) eResolveProxy(
					oldContextInstance);
			if (contextInstance != oldContextInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE, oldContextInstance,
							contextInstance));
			}
		}
		return contextInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecision.genericDoF.ChangeableElementDescription basicGetContextInstance() {
		return contextInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextInstance(genericdesigndecision.genericDoF.ChangeableElementDescription newContextInstance) {
		genericdesigndecision.genericDoF.ChangeableElementDescription oldContextInstance = contextInstance;
		contextInstance = newContextInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE,
					oldContextInstance, contextInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeableElementDescription getPcmContextInstance() {
		if (pcmContextInstance != null && pcmContextInstance.eIsProxy()) {
			InternalEObject oldPcmContextInstance = (InternalEObject) pcmContextInstance;
			pcmContextInstance = (ChangeableElementDescription) eResolveProxy(oldPcmContextInstance);
			if (pcmContextInstance != oldPcmContextInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE, oldPcmContextInstance,
							pcmContextInstance));
			}
		}
		return pcmContextInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeableElementDescription basicGetPcmContextInstance() {
		return pcmContextInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmContextInstance(ChangeableElementDescription newPcmContextInstance) {
		ChangeableElementDescription oldPcmContextInstance = pcmContextInstance;
		pcmContextInstance = newPcmContextInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE, oldPcmContextInstance,
					pcmContextInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
			if (resolve)
				return getContextInstance();
			return basicGetContextInstance();
		case gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE:
			if (resolve)
				return getPcmContextInstance();
			return basicGetPcmContextInstance();
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
		case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
			setContextInstance((genericdesigndecision.genericDoF.ChangeableElementDescription) newValue);
			return;
		case gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE:
			setPcmContextInstance((ChangeableElementDescription) newValue);
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
		case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
			setContextInstance((genericdesigndecision.genericDoF.ChangeableElementDescription) null);
			return;
		case gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE:
			setPcmContextInstance((ChangeableElementDescription) null);
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
		case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
			return contextInstance != null;
		case gdofPackage.INSTANCE_SELECTION_RULE__PCM_CONTEXT_INSTANCE:
			return pcmContextInstance != null;
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
		if (baseClass == genericdesigndecision.genericDoF.InstanceSelectionRule.class) {
			switch (derivedFeatureID) {
			case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
				return GenericDoFPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE;
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
		if (baseClass == genericdesigndecision.genericDoF.InstanceSelectionRule.class) {
			switch (baseFeatureID) {
			case GenericDoFPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
				return gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // InstanceSelectionRuleImpl
