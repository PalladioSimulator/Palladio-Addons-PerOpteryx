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
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.HelperOCLDefinitionImpl#getContextClass
 * <em>Context Class</em>}</li>
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
     *
     * @generated
     */
    protected HelperOCLDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return gdofPackage.Literals.HELPER_OCL_DEFINITION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getContextClass() {
        if (this.contextClass != null && this.contextClass.eIsProxy()) {
            final InternalEObject oldContextClass = (InternalEObject) this.contextClass;
            this.contextClass = (EClass) this.eResolveProxy(oldContextClass);
            if (this.contextClass != oldContextClass) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS, oldContextClass, this.contextClass));
                }
            }
        }
        return this.contextClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EClass basicGetContextClass() {
        return this.contextClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setContextClass(final EClass newContextClass) {
        final EClass oldContextClass = this.contextClass;
        this.contextClass = newContextClass;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS,
                    oldContextClass, this.contextClass));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
            if (resolve) {
                return this.getContextClass();
            }
            return this.basicGetContextClass();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
            this.setContextClass((EClass) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
            this.setContextClass((EClass) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case gdofPackage.HELPER_OCL_DEFINITION__CONTEXT_CLASS:
            return this.contextClass != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
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
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
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
