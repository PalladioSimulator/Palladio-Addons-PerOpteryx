/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Unit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dimension</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionImpl#getUnit
 * <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends EntityImpl implements Dimension {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DimensionType type;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected Unit unit;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DimensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.DIMENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DimensionType getType() {
        return this.type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetType(final DimensionType newType, NotificationChain msgs) {
        final DimensionType oldType = this.type;
        this.type = newType;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.DIMENSION__TYPE, oldType, newType);
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
    public void setType(final DimensionType newType) {
        if (newType != this.type)
        {
            NotificationChain msgs = null;
            if (this.type != null) {
                msgs = ((InternalEObject) this.type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION__TYPE, null, msgs);
            }
            if (newType != null) {
                msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION__TYPE, null, msgs);
            }
            msgs = this.basicSetType(newType, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.DIMENSION__TYPE, newType,
                    newType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit getUnit() {
        return this.unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUnit(final Unit newUnit, NotificationChain msgs) {
        final Unit oldUnit = this.unit;
        this.unit = newUnit;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.DIMENSION__UNIT, oldUnit, newUnit);
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
    public void setUnit(final Unit newUnit) {
        if (newUnit != this.unit)
        {
            NotificationChain msgs = null;
            if (this.unit != null) {
                msgs = ((InternalEObject) this.unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION__UNIT, null, msgs);
            }
            if (newUnit != null) {
                msgs = ((InternalEObject) newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION__UNIT, null, msgs);
            }
            msgs = this.basicSetUnit(newUnit, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.DIMENSION__UNIT, newUnit,
                    newUnit));
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
        case QMLContractTypePackage.DIMENSION__TYPE:
            return this.basicSetType(null, msgs);
        case QMLContractTypePackage.DIMENSION__UNIT:
            return this.basicSetUnit(null, msgs);
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
        case QMLContractTypePackage.DIMENSION__TYPE:
            return this.getType();
        case QMLContractTypePackage.DIMENSION__UNIT:
            return this.getUnit();
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
        case QMLContractTypePackage.DIMENSION__TYPE:
            this.setType((DimensionType) newValue);
            return;
        case QMLContractTypePackage.DIMENSION__UNIT:
            this.setUnit((Unit) newValue);
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
        case QMLContractTypePackage.DIMENSION__TYPE:
            this.setType((DimensionType) null);
            return;
        case QMLContractTypePackage.DIMENSION__UNIT:
            this.setUnit((Unit) null);
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
        case QMLContractTypePackage.DIMENSION__TYPE:
            return this.type != null;
        case QMLContractTypePackage.DIMENSION__UNIT:
            return this.unit != null;
        }
        return super.eIsSet(featureID);
    }

} // DimensionImpl
