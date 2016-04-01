/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl#getScaleElements <em>Scale Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeScaleImpl<T extends Number> extends DimensionTypeImpl implements DimensionTypeScale<T> {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final EScaleOfMeasure SCALE_EDEFAULT = EScaleOfMeasure.ORDINAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<T> getScaleElements() {
		return (EList<T>)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScaleOfMeasure getScale() {
		return (EScaleOfMeasure)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE, DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(EScaleOfMeasure newScale) {
		eDynamicSet(DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE, DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
				return ((InternalEList<?>)getScaleElements()).basicRemove(otherEnd, msgs);
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
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
				return getScaleElements();
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE:
				return getScale();
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
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
				getScaleElements().clear();
				getScaleElements().addAll((Collection<? extends T>)newValue);
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE:
				setScale((EScaleOfMeasure)newValue);
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
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
				getScaleElements().clear();
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE:
				setScale(SCALE_EDEFAULT);
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
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
				return !getScaleElements().isEmpty();
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE:
				return getScale() != SCALE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeScaleImpl
