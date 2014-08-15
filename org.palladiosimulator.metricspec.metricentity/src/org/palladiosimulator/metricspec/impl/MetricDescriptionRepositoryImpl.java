/**
 */
package org.palladiosimulator.metricspec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Metric Description Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl#getMetricDescriptions
 * <em>Metric Descriptions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MetricDescriptionRepositoryImpl extends IdentifierImpl implements MetricDescriptionRepository {
    /**
     * The cached value of the '{@link #getMetricDescriptions() <em>Metric Descriptions</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMetricDescriptions()
     * @generated
     * @ordered
     */
    protected EList<MetricDescription> metricDescriptions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MetricDescriptionRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.METRIC_DESCRIPTION_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<MetricDescription> getMetricDescriptions() {
        if (metricDescriptions == null) {
            metricDescriptions = new EObjectContainmentWithInverseEList<MetricDescription>(MetricDescription.class,
                    this, MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS,
                    MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY);
        }
        return metricDescriptions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMetricDescriptions()).basicAdd(otherEnd,
                    msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return ((InternalEList<?>) getMetricDescriptions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return getMetricDescriptions();
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            getMetricDescriptions().clear();
            getMetricDescriptions().addAll((Collection<? extends MetricDescription>) newValue);
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            getMetricDescriptions().clear();
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return metricDescriptions != null && !metricDescriptions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MetricDescriptionRepositoryImpl
