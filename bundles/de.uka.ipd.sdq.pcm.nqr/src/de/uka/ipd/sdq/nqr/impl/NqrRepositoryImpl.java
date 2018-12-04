/**
 */
package de.uka.ipd.sdq.nqr.impl;

import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.nqr.NqrPackage;
import de.uka.ipd.sdq.nqr.NqrRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.nqr.impl.NqrRepositoryImpl#getNqr <em>Nqr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NqrRepositoryImpl extends MinimalEObjectImpl.Container implements NqrRepository {
	/**
	 * The cached value of the '{@link #getNqr() <em>Nqr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNqr()
	 * @generated
	 * @ordered
	 */
	protected EList<Nqr> nqr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NqrRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NqrPackage.Literals.NQR_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nqr> getNqr() {
		if (nqr == null) {
			nqr = new EObjectContainmentEList<Nqr>(Nqr.class, this, NqrPackage.NQR_REPOSITORY__NQR);
		}
		return nqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NqrPackage.NQR_REPOSITORY__NQR:
				return ((InternalEList<?>)getNqr()).basicRemove(otherEnd, msgs);
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
			case NqrPackage.NQR_REPOSITORY__NQR:
				return getNqr();
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
			case NqrPackage.NQR_REPOSITORY__NQR:
				getNqr().clear();
				getNqr().addAll((Collection<? extends Nqr>)newValue);
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
			case NqrPackage.NQR_REPOSITORY__NQR:
				getNqr().clear();
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
			case NqrPackage.NQR_REPOSITORY__NQR:
				return nqr != null && !nqr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NqrRepositoryImpl
