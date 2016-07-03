/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl;

import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Model Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl#getAvailableDiffModels_DiffRepository <em>Available Diff Models Diff Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffModelRepositoryImpl extends NamedElementImpl implements DiffModelRepository {
	/**
	 * The cached value of the '{@link #getAvailableDiffModels_DiffRepository() <em>Available Diff Models Diff Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDiffModels_DiffRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffModel> availableDiffModels_DiffRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffModelRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrepositoryPackage.Literals.DIFF_MODEL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffModel> getAvailableDiffModels_DiffRepository() {
		if (availableDiffModels_DiffRepository == null) {
			availableDiffModels_DiffRepository = new EObjectContainmentEList<DiffModel>(DiffModel.class, this,
					DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY);
		}
		return availableDiffModels_DiffRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY:
			return ((InternalEList<?>) getAvailableDiffModels_DiffRepository()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY:
			return getAvailableDiffModels_DiffRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY:
			getAvailableDiffModels_DiffRepository().clear();
			getAvailableDiffModels_DiffRepository().addAll((Collection<? extends DiffModel>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY:
			getAvailableDiffModels_DiffRepository().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY:
			return availableDiffModels_DiffRepository != null && !availableDiffModels_DiffRepository.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiffModelRepositoryImpl
