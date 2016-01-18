/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.genericDoF.DoFRepository;
import genericdesigndecision.genericDoF.GenericDoFPackage;

import genericdesigndecision.universalDoF.SpecificDoF;
import genericdesigndecision.universalDoF.impl.SpecificDoFImpl;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.DoFRepositoryImpl#getSdofs <em>Sdofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoFRepositoryImpl extends MinimalEObjectImpl.Container implements DoFRepository {
	/**
	 * The cached value of the '{@link #getSdofs() <em>Sdofs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdofs()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificDoF> sdofs;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DoFRepositoryImpl() {
		super();
		this.sdofs = this.getSdofs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.DO_FREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDoF> getSdofs() {
		if (sdofs == null) {
			sdofs = new EObjectContainmentEList<SpecificDoF>(SpecificDoF.class, this, GenericDoFPackage.DO_FREPOSITORY__SDOFS);
		}
		return sdofs;
	}

	public boolean newSDoF(String name, Class<? extends ADegreeOfFreedom> degree) {
		return this.sdofs.add(new SpecificDoFImpl(name, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean deleteSDoF(SpecificDoF sdof) {
		return this.sdofs.remove(sdof);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SpecificDoF getSDoF(String name) {
		for(SpecificDoF sdof : sdofs) {
			if(sdof.getName().equalsIgnoreCase(name)) {
				return sdof;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericDoFPackage.DO_FREPOSITORY__SDOFS:
				return ((InternalEList<?>)getSdofs()).basicRemove(otherEnd, msgs);
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
			case GenericDoFPackage.DO_FREPOSITORY__SDOFS:
				return getSdofs();
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
			case GenericDoFPackage.DO_FREPOSITORY__SDOFS:
				getSdofs().clear();
				getSdofs().addAll((Collection<? extends SpecificDoF>)newValue);
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
			case GenericDoFPackage.DO_FREPOSITORY__SDOFS:
				getSdofs().clear();
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
			case GenericDoFPackage.DO_FREPOSITORY__SDOFS:
				return sdofs != null && !sdofs.isEmpty();
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
			case GenericDoFPackage.DO_FREPOSITORY___DELETE_SDO_F__SPECIFICDOF:
				return deleteSDoF((SpecificDoF)arguments.get(0));
			case GenericDoFPackage.DO_FREPOSITORY___GET_SDO_F__STRING:
				return getSDoF((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DoFRepositoryImpl
