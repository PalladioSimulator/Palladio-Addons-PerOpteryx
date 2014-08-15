/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl#getDefaultUnit
 * <em>Default Unit</em>}</li>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl#getPersistenceKind
 * <em>Persistence Kind</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NumericalBaseMetricDescriptionImpl extends BaseMetricDescriptionImpl implements
        NumericalBaseMetricDescription {
    /**
     * The cached value of the '{@link #getDefaultUnit() <em>Default Unit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDefaultUnit()
     * @generated
     * @ordered
     */
    protected Unit<Quantity> defaultUnit;

    /**
     * The default value of the '{@link #getPersistenceKind() <em>Persistence Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPersistenceKind()
     * @generated
     * @ordered
     */
    protected static final PersistenceKindOptions PERSISTENCE_KIND_EDEFAULT = PersistenceKindOptions.BINARY_PREFERRED;

    /**
     * The cached value of the '{@link #getPersistenceKind() <em>Persistence Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPersistenceKind()
     * @generated
     * @ordered
     */
    protected PersistenceKindOptions persistenceKind = PERSISTENCE_KIND_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NumericalBaseMetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Unit<Quantity> getDefaultUnit() {
        return defaultUnit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDefaultUnit(Unit<Quantity> newDefaultUnit) {
        Unit<Quantity> oldDefaultUnit = defaultUnit;
        defaultUnit = newDefaultUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT, oldDefaultUnit, defaultUnit));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersistenceKindOptions getPersistenceKind() {
        return persistenceKind;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPersistenceKind(PersistenceKindOptions newPersistenceKind) {
        PersistenceKindOptions oldPersistenceKind = persistenceKind;
        persistenceKind = newPersistenceKind == null ? PERSISTENCE_KIND_EDEFAULT : newPersistenceKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND, oldPersistenceKind,
                    persistenceKind));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            return getDefaultUnit();
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            return getPersistenceKind();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            setDefaultUnit((Unit<Quantity>) newValue);
            return;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            setPersistenceKind((PersistenceKindOptions) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            setDefaultUnit((Unit<Quantity>) null);
            return;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            setPersistenceKind(PERSISTENCE_KIND_EDEFAULT);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            return defaultUnit != null;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            return persistenceKind != PERSISTENCE_KIND_EDEFAULT;
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
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (defaultUnit: ");
        result.append(defaultUnit);
        result.append(", persistenceKind: ");
        result.append(persistenceKind);
        result.append(')');
        return result.toString();
    }

} // NumericalBaseMetricDescriptionImpl
