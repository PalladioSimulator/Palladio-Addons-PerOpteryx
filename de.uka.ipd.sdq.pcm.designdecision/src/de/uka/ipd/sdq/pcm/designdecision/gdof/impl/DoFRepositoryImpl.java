/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DoFRepositoryImpl#getDofs <em>Dofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoFRepositoryImpl extends EObjectImpl implements DoFRepository {
	/**
	 * The cached value of the '{@link #getDofs() <em>Dofs</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDofs()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeOfFreedom> dofs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DoFRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.DO_FREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeOfFreedom> getDofs() {
		if (dofs == null) {
			dofs = new EObjectContainmentEList<DegreeOfFreedom>(DegreeOfFreedom.class, this, gdofPackage.DO_FREPOSITORY__DOFS);
		}
		return dofs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__DOFS:
			return ((InternalEList<?>) getDofs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__DOFS:
			return getDofs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__DOFS:
			getDofs().clear();
			getDofs().addAll((Collection<? extends DegreeOfFreedom>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__DOFS:
			getDofs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__DOFS:
			return dofs != null && !dofs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DoFRepositoryImpl
