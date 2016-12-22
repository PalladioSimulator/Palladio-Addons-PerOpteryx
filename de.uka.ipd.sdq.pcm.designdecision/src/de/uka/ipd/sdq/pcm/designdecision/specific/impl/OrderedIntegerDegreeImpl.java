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

import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ordered Integer Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OrderedIntegerDegreeImpl#getListOfIntegers
 * <em>List Of Integers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderedIntegerDegreeImpl extends DiscreteDegreeImpl implements OrderedIntegerDegree {
    /**
     * The cached value of the '{@link #getListOfIntegers() <em>List Of Integers</em>}' attribute
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getListOfIntegers()
     * @generated
     * @ordered
     */
    protected EList<Integer> listOfIntegers;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OrderedIntegerDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.ORDERED_INTEGER_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Integer> getListOfIntegers() {
        if (this.listOfIntegers == null) {
            this.listOfIntegers = new EDataTypeUniqueEList<Integer>(Integer.class, this,
                    specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS);
        }
        return this.listOfIntegers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
            return this.getListOfIntegers();
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
        case specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
            this.getListOfIntegers().clear();
            this.getListOfIntegers().addAll((Collection<? extends Integer>) newValue);
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
        case specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
            this.getListOfIntegers().clear();
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
        case specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
            return this.listOfIntegers != null && !this.listOfIntegers.isEmpty();
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
        result.append(" (listOfIntegers: ");
        result.append(this.listOfIntegers);
        result.append(')');
        return result.toString();
    }

} // OrderedIntegerDegreeImpl
