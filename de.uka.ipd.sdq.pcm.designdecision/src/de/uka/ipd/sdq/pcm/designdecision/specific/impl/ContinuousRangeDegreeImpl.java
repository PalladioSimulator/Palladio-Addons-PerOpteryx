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

import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Continuous Range Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl#getTo <em>To
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousRangeDegreeImpl#getFrom <em>
 * From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousRangeDegreeImpl extends RangeDegreeImpl implements ContinuousRangeDegree {
    /**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected static final double TO_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected double to = TO_EDEFAULT;

    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final double FROM_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected double from = FROM_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ContinuousRangeDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.CONTINUOUS_RANGE_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getTo() {
        return this.to;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTo(final double newTo) {
        final double oldTo = this.to;
        this.to = newTo;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.CONTINUOUS_RANGE_DEGREE__TO,
                    oldTo,
                    this.to));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getFrom() {
        return this.from;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFrom(final double newFrom) {
        final double oldFrom = this.from;
        this.from = newFrom;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.CONTINUOUS_RANGE_DEGREE__FROM,
                    oldFrom, this.from));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case specificPackage.CONTINUOUS_RANGE_DEGREE__TO:
            return this.getTo();
        case specificPackage.CONTINUOUS_RANGE_DEGREE__FROM:
            return this.getFrom();
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
        switch (featureID)
        {
        case specificPackage.CONTINUOUS_RANGE_DEGREE__TO:
            this.setTo((Double) newValue);
            return;
        case specificPackage.CONTINUOUS_RANGE_DEGREE__FROM:
            this.setFrom((Double) newValue);
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
        switch (featureID)
        {
        case specificPackage.CONTINUOUS_RANGE_DEGREE__TO:
            this.setTo(TO_EDEFAULT);
            return;
        case specificPackage.CONTINUOUS_RANGE_DEGREE__FROM:
            this.setFrom(FROM_EDEFAULT);
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
        switch (featureID)
        {
        case specificPackage.CONTINUOUS_RANGE_DEGREE__TO:
            return this.to != TO_EDEFAULT;
        case specificPackage.CONTINUOUS_RANGE_DEGREE__FROM:
            return this.from != FROM_EDEFAULT;
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
        result.append(" (to: ");
        result.append(this.to);
        result.append(", from: ");
        result.append(this.from);
        result.append(')');
        return result.toString();
    }

} // ContinuousRangeDegreeImpl
