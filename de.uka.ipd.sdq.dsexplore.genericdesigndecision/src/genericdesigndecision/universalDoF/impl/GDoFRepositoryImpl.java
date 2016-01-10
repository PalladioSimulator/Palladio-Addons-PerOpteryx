/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.universalDoF.GDoFRepository;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.UniversalDoFFactory;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

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
 * An implementation of the model object '<em><b>GDo FRepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.impl.GDoFRepositoryImpl#getGdofs <em>Gdofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDoFRepositoryImpl extends MinimalEObjectImpl.Container implements GDoFRepository {
	
	/**
	 * The cached value of the '{@link #getGdofs() <em>Gdofs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdofs()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericDoF> gdofs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected GDoFRepositoryImpl() {
		super();
		this.addGDoF(ALLOCATION_DOF);
		this.addGDoF(ALTERNATIVE_COMPONENT_DOF);
		this.addGDoF(CAPACITY_DOF);
		this.addGDoF(PROCESSING_RATE_DOF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalDoFPackage.Literals.GDO_FREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericDoF> getGdofs() {
		if (gdofs == null) {
			gdofs = new EObjectContainmentEList<GenericDoF>(GenericDoF.class, this, UniversalDoFPackage.GDO_FREPOSITORY__GDOFS);
		}
		return gdofs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addGDoF(String gdofName) {
		return (this.getGDoF(gdofName) != null) ? true: this.gdofs.add(UniversalDoFFactory.eINSTANCE.createGenericDoF(gdofName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean deleteGDoF(GenericDoF gdof) {
		return this.gdofs.remove(gdof);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenericDoF getGDoF(String gdofName) {
		for (GenericDoF g : this.gdofs) {
			if (g.getName().equalsIgnoreCase(gdofName)) {
				return g;
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
			case UniversalDoFPackage.GDO_FREPOSITORY__GDOFS:
				return ((InternalEList<?>)getGdofs()).basicRemove(otherEnd, msgs);
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
			case UniversalDoFPackage.GDO_FREPOSITORY__GDOFS:
				return getGdofs();
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
			case UniversalDoFPackage.GDO_FREPOSITORY__GDOFS:
				getGdofs().clear();
				getGdofs().addAll((Collection<? extends GenericDoF>)newValue);
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
			case UniversalDoFPackage.GDO_FREPOSITORY__GDOFS:
				getGdofs().clear();
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
			case UniversalDoFPackage.GDO_FREPOSITORY__GDOFS:
				return gdofs != null && !gdofs.isEmpty();
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
			case UniversalDoFPackage.GDO_FREPOSITORY___ADD_GDO_F__STRING:
				return addGDoF((String)arguments.get(0));
			case UniversalDoFPackage.GDO_FREPOSITORY___DELETE_GDO_F__GENERICDOF:
				return deleteGDoF((GenericDoF)arguments.get(0));
			case UniversalDoFPackage.GDO_FREPOSITORY___GET_GDO_F__STRING:
				return getGDoF((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GDoFRepositoryImpl
