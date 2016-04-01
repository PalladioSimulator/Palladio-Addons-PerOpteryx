/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleElementImpl<T extends Number> extends ElementImpl implements ScaleElement<T> {
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
	protected ScaleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.SCALE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getValue() {
		return (T)eDynamicGet(DimensiontypesPackage.SCALE_ELEMENT__VALUE, DimensiontypesPackage.Literals.SCALE_ELEMENT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(T newValue) {
		eDynamicSet(DimensiontypesPackage.SCALE_ELEMENT__VALUE, DimensiontypesPackage.Literals.SCALE_ELEMENT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScaleOfMeasure getScale() {
		return (EScaleOfMeasure)eDynamicGet(DimensiontypesPackage.SCALE_ELEMENT__SCALE, DimensiontypesPackage.Literals.SCALE_ELEMENT__SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(EScaleOfMeasure newScale) {
		eDynamicSet(DimensiontypesPackage.SCALE_ELEMENT__SCALE, DimensiontypesPackage.Literals.SCALE_ELEMENT__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensiontypesPackage.SCALE_ELEMENT__VALUE:
				return getValue();
			case DimensiontypesPackage.SCALE_ELEMENT__SCALE:
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
			case DimensiontypesPackage.SCALE_ELEMENT__VALUE:
				setValue((T)newValue);
				return;
			case DimensiontypesPackage.SCALE_ELEMENT__SCALE:
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
			case DimensiontypesPackage.SCALE_ELEMENT__VALUE:
				setValue((T)null);
				return;
			case DimensiontypesPackage.SCALE_ELEMENT__SCALE:
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
			case DimensiontypesPackage.SCALE_ELEMENT__VALUE:
				return getValue() != null;
			case DimensiontypesPackage.SCALE_ELEMENT__SCALE:
				return getScale() != SCALE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ScaleElementImpl
