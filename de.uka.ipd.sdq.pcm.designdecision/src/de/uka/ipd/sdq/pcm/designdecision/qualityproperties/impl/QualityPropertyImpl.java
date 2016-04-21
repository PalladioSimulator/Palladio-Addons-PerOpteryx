/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Quality Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.QualityPropertyImpl#getQualityValue
 * <em>Quality Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QualityPropertyImpl extends EObjectImpl implements QualityProperty {
    /**
     * The default value of the '{@link #getQualityValue() <em>Quality Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQualityValue()
     * @generated
     * @ordered
     */
    protected static final Object QUALITY_VALUE_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QualityPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return qualitypropertiesPackage.Literals.QUALITY_PROPERTY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getQualityValue() {
        // TODO: implement this method to return the 'Quality Value' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setQualityValue(final Object newQualityValue) {
        // TODO: implement this method to set the 'Quality Value' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case qualitypropertiesPackage.QUALITY_PROPERTY__QUALITY_VALUE:
            return this.getQualityValue();
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
        case qualitypropertiesPackage.QUALITY_PROPERTY__QUALITY_VALUE:
            this.setQualityValue(newValue);
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
        case qualitypropertiesPackage.QUALITY_PROPERTY__QUALITY_VALUE:
            this.setQualityValue(QUALITY_VALUE_EDEFAULT);
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
        case qualitypropertiesPackage.QUALITY_PROPERTY__QUALITY_VALUE:
            return QUALITY_VALUE_EDEFAULT == null ? this.getQualityValue() != null
                    : !QUALITY_VALUE_EDEFAULT.equals(this.getQualityValue());
        }
        return super.eIsSet(featureID);
    }

} // QualityPropertyImpl
