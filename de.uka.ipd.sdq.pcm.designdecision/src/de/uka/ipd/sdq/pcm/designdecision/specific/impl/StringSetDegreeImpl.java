/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>String Set Degree</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringSetDegreeImpl#getStringValues
 * <em>String Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StringSetDegreeImpl extends UnorderedDegreeImpl implements StringSetDegree {
    /**
     * The cached value of the '{@link #getStringValues() <em>String Values</em>}' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStringValues()
     * @generated
     * @ordered
     */
    protected EList<String> stringValues;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected StringSetDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.STRING_SET_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<String> getStringValues() {
        if (this.stringValues == null) {
            this.stringValues = new EDataTypeUniqueEList<String>(String.class, this,
                    specificPackage.STRING_SET_DEGREE__STRING_VALUES);
        }
        return this.stringValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case specificPackage.STRING_SET_DEGREE__STRING_VALUES:
            return this.getStringValues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case specificPackage.STRING_SET_DEGREE__STRING_VALUES:
            this.getStringValues().clear();
            this.getStringValues().addAll((Collection<? extends String>) newValue);
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
        case specificPackage.STRING_SET_DEGREE__STRING_VALUES:
            this.getStringValues().clear();
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
        case specificPackage.STRING_SET_DEGREE__STRING_VALUES:
            return this.stringValues != null && !this.stringValues.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (stringValues: ");
        result.append(this.stringValues);
        result.append(')');
        return result.toString();
    }

} // StringSetDegreeImpl
