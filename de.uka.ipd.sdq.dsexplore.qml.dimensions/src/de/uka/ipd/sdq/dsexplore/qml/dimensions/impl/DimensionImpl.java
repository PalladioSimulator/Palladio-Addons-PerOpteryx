/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;

import de.uka.ipd.sdq.dsexplore.qml.units.Unit;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import namedelement.NamedElement;
import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends IdentifierImpl implements Dimension {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensionsPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(DimensionsPackage.DIMENSION__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(DimensionsPackage.DIMENSION__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType getType() {
		return (DimensionType)eDynamicGet(DimensionsPackage.DIMENSION__TYPE, DimensionsPackage.Literals.DIMENSION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType basicGetType() {
		return (DimensionType)eDynamicGet(DimensionsPackage.DIMENSION__TYPE, DimensionsPackage.Literals.DIMENSION__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DimensionType newType) {
		eDynamicSet(DimensionsPackage.DIMENSION__TYPE, DimensionsPackage.Literals.DIMENSION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		return (Unit)eDynamicGet(DimensionsPackage.DIMENSION__UNIT, DimensionsPackage.Literals.DIMENSION__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return (Unit)eDynamicGet(DimensionsPackage.DIMENSION__UNIT, DimensionsPackage.Literals.DIMENSION__UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		eDynamicSet(DimensionsPackage.DIMENSION__UNIT, DimensionsPackage.Literals.DIMENSION__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensionsPackage.DIMENSION__NAME:
				return getName();
			case DimensionsPackage.DIMENSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DimensionsPackage.DIMENSION__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
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
			case DimensionsPackage.DIMENSION__NAME:
				setName((String)newValue);
				return;
			case DimensionsPackage.DIMENSION__TYPE:
				setType((DimensionType)newValue);
				return;
			case DimensionsPackage.DIMENSION__UNIT:
				setUnit((Unit)newValue);
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
			case DimensionsPackage.DIMENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DimensionsPackage.DIMENSION__TYPE:
				setType((DimensionType)null);
				return;
			case DimensionsPackage.DIMENSION__UNIT:
				setUnit((Unit)null);
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
			case DimensionsPackage.DIMENSION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DimensionsPackage.DIMENSION__TYPE:
				return basicGetType() != null;
			case DimensionsPackage.DIMENSION__UNIT:
				return basicGetUnit() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DimensionsPackage.DIMENSION__NAME: return NamedelementPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NamedelementPackage.NAMED_ELEMENT__NAME: return DimensionsPackage.DIMENSION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DimensionImpl
