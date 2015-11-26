/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import genericdesigndecision.GenericdesigndecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discrete Range Choice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteRangeChoiceImpl extends ChoiceImpl implements DiscreteRangeChoice {
	/**
	 * The default value of the '{@link #getChosenValue() <em>Chosen Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getChosenValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHOSEN_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteRangeChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.DISCRETE_RANGE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	@Override
	public int getChosenValue() {
		return ((Integer) this.getValue()).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	@Override
	public void setChosenValue(final int newChosenValue) {
		this.setValue(new Integer(newChosenValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
			return getChosenValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
			setChosenValue((Integer) newValue);
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
		case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
			setChosenValue(CHOSEN_VALUE_EDEFAULT);
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
		case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
			return getChosenValue() != CHOSEN_VALUE_EDEFAULT;
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
		if (baseClass == genericdesigndecision.DiscreteRangeChoice.class) {
			switch (derivedFeatureID) {
			case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
				return GenericdesigndecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE;
			default:
				return -1;
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
		if (baseClass == genericdesigndecision.DiscreteRangeChoice.class) {
			switch (baseFeatureID) {
			case GenericdesigndecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
				return designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // DiscreteRangeChoiceImpl
