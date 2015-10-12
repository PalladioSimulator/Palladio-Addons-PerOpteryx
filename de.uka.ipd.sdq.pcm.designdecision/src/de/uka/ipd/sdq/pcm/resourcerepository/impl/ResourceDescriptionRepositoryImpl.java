/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Description Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionRepositoryImpl#getAvailableProcessingResources_ResourceRepository
 * <em>Available Processing Resources Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDescriptionRepositoryImpl extends EObjectImpl implements ResourceDescriptionRepository {
    /**
     * The cached value of the '{@link #getAvailableProcessingResources_ResourceRepository()
     * <em>Available Processing Resources Resource Repository</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAvailableProcessingResources_ResourceRepository()
     * @generated
     * @ordered
     */
    protected EList<ResourceDescription> availableProcessingResources_ResourceRepository;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResourceDescriptionRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ResourceDescription> getAvailableProcessingResources_ResourceRepository() {
        if (this.availableProcessingResources_ResourceRepository == null)
        {
            this.availableProcessingResources_ResourceRepository = new EObjectContainmentEList<ResourceDescription>(
                    ResourceDescription.class,
                    this,
                    resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY);
        }
        return this.availableProcessingResources_ResourceRepository;
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
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY:
            return ((InternalEList<?>) this.getAvailableProcessingResources_ResourceRepository())
                    .basicRemove(otherEnd, msgs);
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
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY:
            return this.getAvailableProcessingResources_ResourceRepository();
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
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY:
            this.getAvailableProcessingResources_ResourceRepository().clear();
            this.getAvailableProcessingResources_ResourceRepository().addAll(
                    (Collection<? extends ResourceDescription>) newValue);
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
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY:
            this.getAvailableProcessingResources_ResourceRepository().clear();
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
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY:
            return this.availableProcessingResources_ResourceRepository != null
            && !this.availableProcessingResources_ResourceRepository.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ResourceDescriptionRepositoryImpl
