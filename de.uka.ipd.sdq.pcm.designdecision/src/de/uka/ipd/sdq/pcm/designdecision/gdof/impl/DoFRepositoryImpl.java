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
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DoFRepositoryImpl#getPcmDofs <em>Pcm Dofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoFRepositoryImpl extends genericdesigndecision.genericDoF.impl.DoFRepositoryImpl
		implements DoFRepository {
	/**
	 * The cached value of the '{@link #getPcmDofs() <em>Pcm Dofs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmDofs()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeOfFreedom> pcmDofs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeOfFreedom> getPcmDofs() {
		if (pcmDofs == null) {
			pcmDofs = new EObjectContainmentEList<DegreeOfFreedom>(DegreeOfFreedom.class, this,
					gdofPackage.DO_FREPOSITORY__PCM_DOFS);
		}
		return pcmDofs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.DO_FREPOSITORY__PCM_DOFS:
			return ((InternalEList<?>) getPcmDofs()).basicRemove(otherEnd, msgs);
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
		case gdofPackage.DO_FREPOSITORY__PCM_DOFS:
			return getPcmDofs();
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
		case gdofPackage.DO_FREPOSITORY__PCM_DOFS:
			getPcmDofs().clear();
			getPcmDofs().addAll((Collection<? extends DegreeOfFreedom>) newValue);
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
		case gdofPackage.DO_FREPOSITORY__PCM_DOFS:
			getPcmDofs().clear();
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
		case gdofPackage.DO_FREPOSITORY__PCM_DOFS:
			return pcmDofs != null && !pcmDofs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DoFRepositoryImpl
