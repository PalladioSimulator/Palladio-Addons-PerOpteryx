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

import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Helper OCL Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.HelperOCLDefinitionImpl#getContextClass <em>Context Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperOCLDefinitionImpl extends OCLRuleImpl implements HelperOCLDefinition {
	/**
	 * The cached value of the '{@link #getContextClass() <em>Context Class</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getContextClass()
	 * @generated
	 * @ordered
	 */
	protected EClass contextClass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperOCLDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.HELPER_OCL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextClass() {
		if (contextClass != null && contextClass.eIsProxy()) {
			InternalEObject oldContextClass = (InternalEObject) contextClass;
			contextClass = (EClass) eResolveProxy(oldContextClass);
			if (contextClass != oldContextClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS, oldContextClass, contextClass));
			}
		}
		return contextClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetContextClass() {
		return contextClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextClass(EClass newContextClass) {
		EClass oldContextClass = contextClass;
		contextClass = newContextClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS, oldContextClass, contextClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
			if (resolve)
				return getContextClass();
			return basicGetContextClass();
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
		case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
			setContextClass((EClass) newValue);
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
		case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
			setContextClass((EClass) null);
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
		case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
			return contextClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StaticContextRule.class) {
			switch (derivedFeatureID) {
			case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
				return gdofPackage.STATIC_CONTEXT_RULE__CONTEXT_CLASS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StaticContextRule.class) {
			switch (baseFeatureID) {
			case gdofPackage.STATIC_CONTEXT_RULE__CONTEXT_CLASS:
				return gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // HelperOCLDefinitionImpl
