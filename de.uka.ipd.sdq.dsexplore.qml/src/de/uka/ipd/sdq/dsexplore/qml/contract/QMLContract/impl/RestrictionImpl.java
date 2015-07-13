/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumOperator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Restriction</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.RestrictionImpl#getOperator
 * <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionImpl extends AspectRequirementImpl implements Restriction {
    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final EnumOperator OPERATOR_EDEFAULT = EnumOperator.LESS;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected EnumOperator operator = OPERATOR_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RestrictionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.RESTRICTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EnumOperator getOperator() {
        return this.operator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperator(final EnumOperator newOperator) {
        final EnumOperator oldOperator = this.operator;
        this.operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractPackage.RESTRICTION__OPERATOR,
                    oldOperator, this.operator));
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
        case QMLContractPackage.RESTRICTION__OPERATOR:
            return this.getOperator();
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
        case QMLContractPackage.RESTRICTION__OPERATOR:
            this.setOperator((EnumOperator) newValue);
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
        case QMLContractPackage.RESTRICTION__OPERATOR:
            this.setOperator(OPERATOR_EDEFAULT);
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
        case QMLContractPackage.RESTRICTION__OPERATOR:
            return this.operator != OPERATOR_EDEFAULT;
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
        result.append(" (operator: ");
        result.append(this.operator);
        result.append(')');
        return result.toString();
    }

} // RestrictionImpl
