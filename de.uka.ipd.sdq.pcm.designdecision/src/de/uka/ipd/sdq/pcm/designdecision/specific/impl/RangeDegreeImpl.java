/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Range Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl#isUpperBoundIncluded
 * <em>Upper Bound Included</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl#isLowerBoundIncluded
 * <em>Lower Bound Included</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.RangeDegreeImpl#getNumberOfSteps
 * <em>Number Of Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RangeDegreeImpl extends OrderedDataTypeDegreeImpl implements RangeDegree {
    /**
     * The default value of the '{@link #isUpperBoundIncluded() <em>Upper Bound Included</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isUpperBoundIncluded()
     * @generated
     * @ordered
     */
    protected static final boolean UPPER_BOUND_INCLUDED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isUpperBoundIncluded() <em>Upper Bound Included</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isUpperBoundIncluded()
     * @generated
     * @ordered
     */
    protected boolean upperBoundIncluded = UPPER_BOUND_INCLUDED_EDEFAULT;

    /**
     * The default value of the '{@link #isLowerBoundIncluded() <em>Lower Bound Included</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isLowerBoundIncluded()
     * @generated
     * @ordered
     */
    protected static final boolean LOWER_BOUND_INCLUDED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLowerBoundIncluded() <em>Lower Bound Included</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isLowerBoundIncluded()
     * @generated
     * @ordered
     */
    protected boolean lowerBoundIncluded = LOWER_BOUND_INCLUDED_EDEFAULT;

    /**
     * The default value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberOfSteps()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_STEPS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberOfSteps()
     * @generated
     * @ordered
     */
    protected int numberOfSteps = NUMBER_OF_STEPS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RangeDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.RANGE_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isUpperBoundIncluded() {
        return this.upperBoundIncluded;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUpperBoundIncluded(final boolean newUpperBoundIncluded) {
        final boolean oldUpperBoundIncluded = this.upperBoundIncluded;
        this.upperBoundIncluded = newUpperBoundIncluded;
        if (this.eNotificationRequired()) {
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED,
                            oldUpperBoundIncluded, this.upperBoundIncluded));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isLowerBoundIncluded() {
        return this.lowerBoundIncluded;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLowerBoundIncluded(final boolean newLowerBoundIncluded) {
        final boolean oldLowerBoundIncluded = this.lowerBoundIncluded;
        this.lowerBoundIncluded = newLowerBoundIncluded;
        if (this.eNotificationRequired()) {
            this.eNotify(
                    new ENotificationImpl(this, Notification.SET, specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED,
                            oldLowerBoundIncluded, this.lowerBoundIncluded));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getNumberOfSteps() {
        return this.numberOfSteps;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumberOfSteps(final int newNumberOfSteps) {
        final int oldNumberOfSteps = this.numberOfSteps;
        this.numberOfSteps = newNumberOfSteps;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS,
                    oldNumberOfSteps, this.numberOfSteps));
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
        case specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED:
            return this.isUpperBoundIncluded();
        case specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED:
            return this.isLowerBoundIncluded();
        case specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS:
            return this.getNumberOfSteps();
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
        case specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED:
            this.setUpperBoundIncluded((Boolean) newValue);
            return;
        case specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED:
            this.setLowerBoundIncluded((Boolean) newValue);
            return;
        case specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS:
            this.setNumberOfSteps((Integer) newValue);
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
        case specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED:
            this.setUpperBoundIncluded(UPPER_BOUND_INCLUDED_EDEFAULT);
            return;
        case specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED:
            this.setLowerBoundIncluded(LOWER_BOUND_INCLUDED_EDEFAULT);
            return;
        case specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS:
            this.setNumberOfSteps(NUMBER_OF_STEPS_EDEFAULT);
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
        case specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED:
            return this.upperBoundIncluded != UPPER_BOUND_INCLUDED_EDEFAULT;
        case specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED:
            return this.lowerBoundIncluded != LOWER_BOUND_INCLUDED_EDEFAULT;
        case specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS:
            return this.numberOfSteps != NUMBER_OF_STEPS_EDEFAULT;
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
        result.append(" (upperBoundIncluded: ");
        result.append(this.upperBoundIncluded);
        result.append(", lowerBoundIncluded: ");
        result.append(this.lowerBoundIncluded);
        result.append(", numberOfSteps: ");
        result.append(this.numberOfSteps);
        result.append(')');
        return result.toString();
    }

} // RangeDegreeImpl
