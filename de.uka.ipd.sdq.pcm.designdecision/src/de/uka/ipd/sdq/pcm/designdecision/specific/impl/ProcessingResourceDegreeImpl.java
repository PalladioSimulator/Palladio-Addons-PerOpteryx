/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Processing Resource Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl#getProcessingresourcetype
 * <em>Processingresourcetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessingResourceDegreeImpl extends DegreeOfFreedomInstanceImpl implements
ProcessingResourceDegree {
    /**
     * The cached value of the '{@link #getProcessingresourcetype() <em>Processingresourcetype</em>}
     * ' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProcessingresourcetype()
     * @generated
     * @ordered
     */
    protected ProcessingResourceType processingresourcetype;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ProcessingResourceDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.PROCESSING_RESOURCE_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProcessingResourceType getProcessingresourcetype() {
        if (this.processingresourcetype != null && ((EObject) this.processingresourcetype).eIsProxy())
        {
            final InternalEObject oldProcessingresourcetype = (InternalEObject) this.processingresourcetype;
            this.processingresourcetype = (ProcessingResourceType) this.eResolveProxy(oldProcessingresourcetype);
            if (this.processingresourcetype != oldProcessingresourcetype)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE,
                            oldProcessingresourcetype, this.processingresourcetype));
                }
            }
        }
        return this.processingresourcetype;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ProcessingResourceType basicGetProcessingresourcetype() {
        return this.processingresourcetype;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProcessingresourcetype(final ProcessingResourceType newProcessingresourcetype) {
        final ProcessingResourceType oldProcessingresourcetype = this.processingresourcetype;
        this.processingresourcetype = newProcessingresourcetype;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
                    this.processingresourcetype));
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
        case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
            if (resolve) {
                return this.getProcessingresourcetype();
            }
            return this.basicGetProcessingresourcetype();
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
        case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
            this.setProcessingresourcetype((ProcessingResourceType) newValue);
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
        case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
            this.setProcessingresourcetype((ProcessingResourceType) null);
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
        case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
            return this.processingresourcetype != null;
        }
        return super.eIsSet(featureID);
    }

} // ProcessingResourceDegreeImpl
