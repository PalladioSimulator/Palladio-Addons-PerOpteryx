/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Range Value</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.RangeValueImpl#getRangeLimitLiteral
 * <em>Range Limit Literal</em>}</li>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.RangeValueImpl#getType <em>Type
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeValueImpl extends IdentifierImpl implements RangeValue {
    /**
     * The cached value of the '{@link #getRangeLimitLiteral() <em>Range Limit Literal</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRangeLimitLiteral()
     * @generated
     * @ordered
     */
    protected ValueLiteral rangeLimitLiteral;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final EnumRangeValueType TYPE_EDEFAULT = EnumRangeValueType.INCLUSIVE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EnumRangeValueType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RangeValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.RANGE_VALUE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ValueLiteral getRangeLimitLiteral() {
        return this.rangeLimitLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRangeLimitLiteral(final ValueLiteral newRangeLimitLiteral, NotificationChain msgs) {
        final ValueLiteral oldRangeLimitLiteral = this.rangeLimitLiteral;
        this.rangeLimitLiteral = newRangeLimitLiteral;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, oldRangeLimitLiteral, newRangeLimitLiteral);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRangeLimitLiteral(final ValueLiteral newRangeLimitLiteral) {
        if (newRangeLimitLiteral != this.rangeLimitLiteral)
        {
            NotificationChain msgs = null;
            if (this.rangeLimitLiteral != null) {
                msgs = ((InternalEObject) this.rangeLimitLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, null, msgs);
            }
            if (newRangeLimitLiteral != null) {
                msgs = ((InternalEObject) newRangeLimitLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, null, msgs);
            }
            msgs = this.basicSetRangeLimitLiteral(newRangeLimitLiteral, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL,
                    newRangeLimitLiteral, newRangeLimitLiteral));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EnumRangeValueType getType() {
        return this.type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setType(final EnumRangeValueType newType) {
        final EnumRangeValueType oldType = this.type;
        this.type = newType == null ? TYPE_EDEFAULT : newType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractPackage.RANGE_VALUE__TYPE, oldType,
                    this.type));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
            return this.basicSetRangeLimitLiteral(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
        case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
            return this.getRangeLimitLiteral();
        case QMLContractPackage.RANGE_VALUE__TYPE:
            return this.getType();
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
        case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
            this.setRangeLimitLiteral((ValueLiteral) newValue);
            return;
        case QMLContractPackage.RANGE_VALUE__TYPE:
            this.setType((EnumRangeValueType) newValue);
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
        case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
            this.setRangeLimitLiteral((ValueLiteral) null);
            return;
        case QMLContractPackage.RANGE_VALUE__TYPE:
            this.setType(TYPE_EDEFAULT);
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
        case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
            return this.rangeLimitLiteral != null;
        case QMLContractPackage.RANGE_VALUE__TYPE:
            return this.type != TYPE_EDEFAULT;
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
        result.append(" (type: ");
        result.append(this.type);
        result.append(')');
        return result.toString();
    }

} // RangeValueImpl
