/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.cost.ProcessingResourceCost;
import org.palladiosimulator.pcm.cost.costPackage;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Processing Resource Cost</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.ProcessingResourceCostImpl#getProcessingresourcespecification
 * <em>Processingresourcespecification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessingResourceCostImpl extends CostImpl implements ProcessingResourceCost
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ProcessingResourceCostImpl()
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
        return costPackage.Literals.PROCESSING_RESOURCE_COST;
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
                            costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION,
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
                    costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION,
                    oldProcessingresourcespecification, this.processingresourcespecification));
        }
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
        case costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            if (resolve) {
                return this.getProcessingresourcespecification();
            }
            return this.basicGetProcessingresourcespecification();
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
        case costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            this.setProcessingresourcespecification((ProcessingResourceSpecification) newValue);
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
        case costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            this.setProcessingresourcespecification((ProcessingResourceSpecification) null);
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
        case costPackage.PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION:
            return this.processingresourcespecification != null;
        }
        return super.eIsSet(featureID);
    }

} // ProcessingResourceCostImpl
