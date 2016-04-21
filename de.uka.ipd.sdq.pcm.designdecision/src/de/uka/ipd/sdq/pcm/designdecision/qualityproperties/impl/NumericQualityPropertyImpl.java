/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numeric Quality Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getResultDecoratorRepository
 * <em>Result Decorator Repository</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getConfidenceInterval
 * <em>Confidence Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumericQualityPropertyImpl extends QualityPropertyImpl implements NumericQualityProperty {
    /**
     * The cached value of the '{@link #getResultDecoratorRepository()
     * <em>Result Decorator Repository</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getResultDecoratorRepository()
     * @generated
     * @ordered
     */
    protected ResultDecoratorRepository resultDecoratorRepository;

    /**
     * The cached value of the '{@link #getConfidenceInterval() <em>Confidence Interval</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConfidenceInterval()
     * @generated
     * @ordered
     */
    protected ConfidenceInterval confidenceInterval;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericQualityPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return qualitypropertiesPackage.Literals.NUMERIC_QUALITY_PROPERTY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResultDecoratorRepository getResultDecoratorRepository() {
        if (this.resultDecoratorRepository != null && this.resultDecoratorRepository.eIsProxy()) {
            final InternalEObject oldResultDecoratorRepository = (InternalEObject) this.resultDecoratorRepository;
            this.resultDecoratorRepository = (ResultDecoratorRepository) this
                    .eResolveProxy(oldResultDecoratorRepository);
            if (this.resultDecoratorRepository != oldResultDecoratorRepository) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY,
                            oldResultDecoratorRepository, this.resultDecoratorRepository));
                }
            }
        }
        return this.resultDecoratorRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ResultDecoratorRepository basicGetResultDecoratorRepository() {
        return this.resultDecoratorRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResultDecoratorRepository(final ResultDecoratorRepository newResultDecoratorRepository) {
        final ResultDecoratorRepository oldResultDecoratorRepository = this.resultDecoratorRepository;
        this.resultDecoratorRepository = newResultDecoratorRepository;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY,
                    oldResultDecoratorRepository, this.resultDecoratorRepository));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ConfidenceInterval getConfidenceInterval() {
        if (this.confidenceInterval != null && this.confidenceInterval.eIsProxy()) {
            final InternalEObject oldConfidenceInterval = (InternalEObject) this.confidenceInterval;
            this.confidenceInterval = (ConfidenceInterval) this.eResolveProxy(oldConfidenceInterval);
            if (this.confidenceInterval != oldConfidenceInterval) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL,
                            oldConfidenceInterval, this.confidenceInterval));
                }
            }
        }
        return this.confidenceInterval;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ConfidenceInterval basicGetConfidenceInterval() {
        return this.confidenceInterval;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConfidenceInterval(final ConfidenceInterval newConfidenceInterval) {
        final ConfidenceInterval oldConfidenceInterval = this.confidenceInterval;
        this.confidenceInterval = newConfidenceInterval;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL, oldConfidenceInterval,
                    this.confidenceInterval));
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
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
            if (resolve) {
                return this.getResultDecoratorRepository();
            }
            return this.basicGetResultDecoratorRepository();
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
            if (resolve) {
                return this.getConfidenceInterval();
            }
            return this.basicGetConfidenceInterval();
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
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
            this.setResultDecoratorRepository((ResultDecoratorRepository) newValue);
            return;
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
            this.setConfidenceInterval((ConfidenceInterval) newValue);
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
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
            this.setResultDecoratorRepository((ResultDecoratorRepository) null);
            return;
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
            this.setConfidenceInterval((ConfidenceInterval) null);
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
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
            return this.resultDecoratorRepository != null;
        case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
            return this.confidenceInterval != null;
        }
        return super.eIsSet(featureID);
    }

} // NumericQualityPropertyImpl
