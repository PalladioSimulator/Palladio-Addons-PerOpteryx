/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeRepositoryImpl#getDimensionTypes <em>Dimension Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeRepositoryImpl extends IdentifierImpl implements DimensionTypeRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.DIMENSION_TYPE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DimensionType> getDimensionTypes() {
		return (EList<DimensionType>)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES, DimensiontypesPackage.Literals.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
				return ((InternalEList<?>)getDimensionTypes()).basicRemove(otherEnd, msgs);
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
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
				return getDimensionTypes();
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
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
				getDimensionTypes().clear();
				getDimensionTypes().addAll((Collection<? extends DimensionType>)newValue);
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
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
				getDimensionTypes().clear();
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
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
				return !getDimensionTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeRepositoryImpl
