/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.cost.ProcessingResourceCost;
import org.palladiosimulator.pcm.cost.ScalarFunction;
import org.palladiosimulator.pcm.cost.VariableProcessingResourceCost;
import org.palladiosimulator.pcm.cost.costPackage;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Processing Resource Cost</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.VariableProcessingResourceCostImpl#getProcessingresourcespecification
 * <em>Processingresourcespecification</em>}</li>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.VariableProcessingResourceCostImpl#getProcessingRateInitialFunction
 * <em>Processing Rate Initial Function</em>}</li>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.VariableProcessingResourceCostImpl#getProcessingRateOperatingFunction
 * <em>Processing Rate Operating Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableProcessingResourceCostImpl extends VariableCostImpl implements VariableProcessingResourceCost
{
    /**
     * The cached value of the '{@link #getProcessingresourcespecification()
     * <em>Processingresourcespecification</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProcessingresourcespecification()
     * @generated
     * @ordered
     */
    protected ProcessingResourceSpecification processingresourcespecification;

    /**
     * The cached value of the '{@link #getProcessingRateInitialFunction()
     * <em>Processing Rate Initial Function</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getProcessingRateInitialFunction()
     * @generated
     * @ordered
     */
    protected ScalarFunction processingRateInitialFunction;

    /**
     * The cached value of the '{@link #getProcessingRateOperatingFunction()
     * <em>Processing Rate Operating Function</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getProcessingRateOperatingFunction()
     * @generated
     * @ordered
     */
    protected ScalarFunction processingRateOperatingFunction;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected VariableProcessingResourceCostImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return costPackage.Literals.VARIABLE_PROCESSING_RESOURCE_COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProcessingResourceSpecification getProcessingresourcespecification()
    {
        if (this.processingresourcespecification != null && ((EObject) this.processingresourcespecification).eIsProxy())
        {
            final InternalEObject oldProcessingresourcespecification = (InternalEObject) this.processingresourcespecification;
            this.processingresourcespecification = (ProcessingResourceSpecification) this
                    .eResolveProxy(oldProcessingresourcespecification);
            if (this.processingresourcespecification != oldProcessingresourcespecification)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION,
                            oldProcessingresourcespecification, this.processingresourcespecification));
                }
            }
        }
        return this.processingresourcespecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProcessingResourceSpecification basicGetProcessingresourcespecification()
    {
        return this.processingresourcespecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setProcessingresourcespecification(
            final ProcessingResourceSpecification newProcessingresourcespecification)
    {
        final ProcessingResourceSpecification oldProcessingresourcespecification = this.processingresourcespecification;
        this.processingresourcespecification = newProcessingresourcespecification;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION,
                    oldProcessingresourcespecification, this.processingresourcespecification));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScalarFunction getProcessingRateInitialFunction()
    {
        return this.processingRateInitialFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProcessingRateInitialFunction(
            final ScalarFunction newProcessingRateInitialFunction, NotificationChain msgs)
    {
        final ScalarFunction oldProcessingRateInitialFunction = this.processingRateInitialFunction;
        this.processingRateInitialFunction = newProcessingRateInitialFunction;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION,
                    oldProcessingRateInitialFunction, newProcessingRateInitialFunction);
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
    public void setProcessingRateInitialFunction(final ScalarFunction newProcessingRateInitialFunction)
    {
        if (newProcessingRateInitialFunction != this.processingRateInitialFunction)
        {
            NotificationChain msgs = null;
            if (this.processingRateInitialFunction != null) {
                msgs = ((InternalEObject) this.processingRateInitialFunction).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION,
                        null, msgs);
            }
            if (newProcessingRateInitialFunction != null) {
                msgs = ((InternalEObject) newProcessingRateInitialFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION, null, msgs);
            }
            msgs = this.basicSetProcessingRateInitialFunction(newProcessingRateInitialFunction, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION,
                    newProcessingRateInitialFunction, newProcessingRateInitialFunction));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScalarFunction getProcessingRateOperatingFunction()
    {
        return this.processingRateOperatingFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetProcessingRateOperatingFunction(
            final ScalarFunction newProcessingRateOperatingFunction, NotificationChain msgs)
    {
        final ScalarFunction oldProcessingRateOperatingFunction = this.processingRateOperatingFunction;
        this.processingRateOperatingFunction = newProcessingRateOperatingFunction;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION,
                    oldProcessingRateOperatingFunction, newProcessingRateOperatingFunction);
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
    public void setProcessingRateOperatingFunction(final ScalarFunction newProcessingRateOperatingFunction)
    {
        if (newProcessingRateOperatingFunction != this.processingRateOperatingFunction)
        {
            NotificationChain msgs = null;
            if (this.processingRateOperatingFunction != null) {
                msgs = ((InternalEObject) this.processingRateOperatingFunction)
                        .eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                                - costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION,
                                null, msgs);
            }
            if (newProcessingRateOperatingFunction != null) {
                msgs = ((InternalEObject) newProcessingRateOperatingFunction)
                        .eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                                - costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION,
                                null, msgs);
            }
            msgs = this.basicSetProcessingRateOperatingFunction(newProcessingRateOperatingFunction, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION,
                    newProcessingRateOperatingFunction, newProcessingRateOperatingFunction));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs)
    {
        switch (featureID)
        {
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION:
            return this.basicSetProcessingRateInitialFunction(null, msgs);
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION:
            return this.basicSetProcessingRateOperatingFunction(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
    {
        switch (featureID)
        {
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            if (resolve) {
                return this.getProcessingresourcespecification();
            }
            return this.basicGetProcessingresourcespecification();
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION:
            return this.getProcessingRateInitialFunction();
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION:
            return this.getProcessingRateOperatingFunction();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue)
    {
        switch (featureID)
        {
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            this.setProcessingresourcespecification((ProcessingResourceSpecification) newValue);
            return;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION:
            this.setProcessingRateInitialFunction((ScalarFunction) newValue);
            return;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION:
            this.setProcessingRateOperatingFunction((ScalarFunction) newValue);
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
    public void eUnset(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            this.setProcessingresourcespecification((ProcessingResourceSpecification) null);
            return;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION:
            this.setProcessingRateInitialFunction((ScalarFunction) null);
            return;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION:
            this.setProcessingRateOperatingFunction((ScalarFunction) null);
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
    public boolean eIsSet(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            return this.processingresourcespecification != null;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION:
            return this.processingRateInitialFunction != null;
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION:
            return this.processingRateOperatingFunction != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass)
    {
        if (baseClass == ProcessingResourceCost.class)
        {
            switch (derivedFeatureID)
            {
            case costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
                return costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass)
    {
        if (baseClass == ProcessingResourceCost.class)
        {
            switch (baseFeatureID)
            {
            case costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
                return costPackage.VARIABLE_PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // VariableProcessingResourceCostImpl
