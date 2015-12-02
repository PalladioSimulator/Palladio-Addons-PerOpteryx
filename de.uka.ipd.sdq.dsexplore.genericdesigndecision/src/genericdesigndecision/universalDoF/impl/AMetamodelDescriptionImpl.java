/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.genericDoF.DoFRepository;

import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
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
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getGdof_to_dof <em>Gdof to dof</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getGdof_to_dof() <em>Gdof to dof</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdof_to_dof()
	 * @generated
	 * @ordered
	 */
	protected EMap<GenericDoF, DegreeOfFreedom> gdof_to_dof;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Metamodel NAME_EDEFAULT = Metamodel.PCM;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Metamodel name = NAME_EDEFAULT;
	
	protected static AMetamodelDescription metamodelDescriptionSingleton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	public EMap<GenericDoF, DegreeOfFreedom> getGdof_to_dof() {
		if (gdof_to_dof == null) {
			gdof_to_dof = new EcoreEMap<GenericDoF,DegreeOfFreedom>(UniversalDoFPackage.Literals.GENERIC_DO_FTO_DEGREE_OF_FREEDOM, GenericDoFToDegreeOfFreedomImpl.class, this, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF);
		}
		return gdof_to_dof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Metamodel newName) {
		Metamodel oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Metamodel evaluateMetamodel(EModelElement model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedom getCorrespondingDoF(GenericDoF gdof) {
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF:
				return ((InternalEList<?>)getGdof_to_dof()).basicRemove(otherEnd, msgs);
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF:
				if (coreType) return getGdof_to_dof();
				else return getGdof_to_dof().map();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				return getName();
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF:
				((EStructuralFeature.Setting)getGdof_to_dof()).set(newValue);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				setName((Metamodel)newValue);
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF:
				getGdof_to_dof().clear();
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF:
				return gdof_to_dof != null && !gdof_to_dof.isEmpty();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				return name != NAME_EDEFAULT;
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
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EMODELELEMENT:
				return evaluateMetamodel((EModelElement)arguments.get(0));
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___GET_CORRESPONDING_DO_F__GENERICDOF:
				return getCorrespondingDoF((GenericDoF)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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

} //AMetamodelDescriptionImpl
