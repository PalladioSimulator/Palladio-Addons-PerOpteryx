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

import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Continuous Processing Rate Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl#getProcessingresourcetype
 * <em>Processingresourcetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinuousProcessingRateDegreeImpl extends ContinuousRangeDegreeImpl
        implements ContinuousProcessingRateDegree {
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
    protected ContinuousProcessingRateDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.CONTINUOUS_PROCESSING_RATE_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ProcessingResourceType getProcessingresourcetype() {
        if (this.processingresourcetype != null && ((EObject) this.processingresourcetype).eIsProxy()) {
            final InternalEObject oldProcessingresourcetype = (InternalEObject) this.processingresourcetype;
            this.processingresourcetype = (ProcessingResourceType) this.eResolveProxy(oldProcessingresourcetype);
            if (this.processingresourcetype != oldProcessingresourcetype) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE,
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
                    specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE,
                    oldProcessingresourcetype, this.processingresourcetype));
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
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
        switch (featureID) {
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
        switch (featureID) {
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
        switch (featureID) {
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
            return this.processingresourcetype != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == ProcessingResourceDegree.class) {
            switch (derivedFeatureID) {
            case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
                return specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;
            default:
                return -1;
            }
        }
        if (baseClass == ProcessingRateDegree.class) {
            switch (derivedFeatureID) {
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
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == ProcessingResourceDegree.class) {
            switch (baseFeatureID) {
            case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
                return specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE;
            default:
                return -1;
            }
        }
        if (baseClass == ProcessingRateDegree.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // ContinuousProcessingRateDegreeImpl
