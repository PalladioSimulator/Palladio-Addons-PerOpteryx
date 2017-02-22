/**
 */
package SolutionModel.impl;

import SolutionModel.Solution;
import SolutionModel.SolutionModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SolutionModel.impl.SolutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link SolutionModel.impl.SolutionImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link SolutionModel.impl.SolutionImpl#getCostRepository <em>Cost Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends MinimalEObjectImpl.Container implements Solution {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getCostRepository() <em>Cost Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostRepository()
	 * @generated
	 * @ordered
	 */
	protected EObject costRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionModelPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionModelPackage.SOLUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (repository != null && ((EObject)repository).eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (Repository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolutionModelPackage.SOLUTION__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionModelPackage.SOLUTION__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCostRepository() {
		if (costRepository != null && costRepository.eIsProxy()) {
			InternalEObject oldCostRepository = (InternalEObject)costRepository;
			costRepository = eResolveProxy(oldCostRepository);
			if (costRepository != oldCostRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolutionModelPackage.SOLUTION__COST_REPOSITORY, oldCostRepository, costRepository));
			}
		}
		return costRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetCostRepository() {
		return costRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostRepository(EObject newCostRepository) {
		EObject oldCostRepository = costRepository;
		costRepository = newCostRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionModelPackage.SOLUTION__COST_REPOSITORY, oldCostRepository, costRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolutionModelPackage.SOLUTION__NAME:
				return getName();
			case SolutionModelPackage.SOLUTION__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case SolutionModelPackage.SOLUTION__COST_REPOSITORY:
				if (resolve) return getCostRepository();
				return basicGetCostRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolutionModelPackage.SOLUTION__NAME:
				setName((String)newValue);
				return;
			case SolutionModelPackage.SOLUTION__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case SolutionModelPackage.SOLUTION__COST_REPOSITORY:
				setCostRepository((EObject)newValue);
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
			case SolutionModelPackage.SOLUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolutionModelPackage.SOLUTION__REPOSITORY:
				setRepository((Repository)null);
				return;
			case SolutionModelPackage.SOLUTION__COST_REPOSITORY:
				setCostRepository((EObject)null);
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
			case SolutionModelPackage.SOLUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolutionModelPackage.SOLUTION__REPOSITORY:
				return repository != null;
			case SolutionModelPackage.SOLUTION__COST_REPOSITORY:
				return costRepository != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
