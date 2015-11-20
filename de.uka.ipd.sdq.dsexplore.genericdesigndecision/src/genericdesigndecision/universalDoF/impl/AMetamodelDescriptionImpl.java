/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.genericDoF.DoFRepository;

import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMetamodel Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getDofrepository <em>Dofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getGddof_to_dof <em>Gddof to dof</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AMetamodelDescriptionImpl extends MinimalEObjectImpl.Container implements AMetamodelDescription {
	/**
	 * The cached value of the '{@link #getDofrepository() <em>Dofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDofrepository()
	 * @generated
	 * @ordered
	 */
	protected DoFRepository dofrepository;

	/**
	 * The cached value of the '{@link #getGddof_to_dof() <em>Gddof to dof</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGddof_to_dof()
	 * @generated
	 * @ordered
	 */
	protected EMap<GenericDoF, DegreeOfFreedom> gddof_to_dof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMetamodelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalDoFPackage.Literals.AMETAMODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepository getDofrepository() {
		if (dofrepository != null && dofrepository.eIsProxy()) {
			InternalEObject oldDofrepository = (InternalEObject)dofrepository;
			dofrepository = (DoFRepository)eResolveProxy(oldDofrepository);
			if (dofrepository != oldDofrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY, oldDofrepository, dofrepository));
			}
		}
		return dofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepository basicGetDofrepository() {
		return dofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDofrepository(DoFRepository newDofrepository) {
		DoFRepository oldDofrepository = dofrepository;
		dofrepository = newDofrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY, oldDofrepository, dofrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<GenericDoF, DegreeOfFreedom> getGddof_to_dof() {
		if (gddof_to_dof == null) {
			gddof_to_dof = new EcoreEMap<GenericDoF,DegreeOfFreedom>(UniversalDoFPackage.Literals.GENERIC_DO_FTO_DEGREE_OF_FREEDOM, GenericDoFToDegreeOfFreedomImpl.class, this, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF);
		}
		return gddof_to_dof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluateMetamodel(EObject model) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedom returnCorrespondingDoF(GenericDoF gdof) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF:
				return ((InternalEList<?>)getGddof_to_dof()).basicRemove(otherEnd, msgs);
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				if (resolve) return getDofrepository();
				return basicGetDofrepository();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF:
				if (coreType) return getGddof_to_dof();
				else return getGddof_to_dof().map();
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				setDofrepository((DoFRepository)newValue);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF:
				((EStructuralFeature.Setting)getGddof_to_dof()).set(newValue);
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				setDofrepository((DoFRepository)null);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF:
				getGddof_to_dof().clear();
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				return dofrepository != null;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDDOF_TO_DOF:
				return gddof_to_dof != null && !gddof_to_dof.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT:
				evaluateMetamodel((EObject)arguments.get(0));
				return null;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF:
				return returnCorrespondingDoF((GenericDoF)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AMetamodelDescriptionImpl
