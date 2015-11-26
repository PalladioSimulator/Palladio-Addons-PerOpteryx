/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import genericdesigndecision.GenericdesigndecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassChoiceImpl extends ChoiceImpl implements ClassChoice {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.CLASS_CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getChosenValue() {
		EObject chosenValue = basicGetChosenValue();
		return chosenValue != null && chosenValue.eIsProxy() ? eResolveProxy((InternalEObject) chosenValue)
				: chosenValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	public EObject basicGetChosenValue() {
		return ((EObject) this.getValue());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	@Override
	public void setChosenValue(final EObject newChosenValue) {
		this.setValue(newChosenValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
			if (resolve)
				return getChosenValue();
			return basicGetChosenValue();
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
		case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
			setChosenValue((EObject) newValue);
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
		case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
			setChosenValue((EObject) null);
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
		case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
			return basicGetChosenValue() != null;
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
		if (baseClass == genericdesigndecision.ClassChoice.class) {
			switch (derivedFeatureID) {
			case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				return GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE;
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
		if (baseClass == genericdesigndecision.ClassChoice.class) {
			switch (baseFeatureID) {
			case GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				return designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // ClassChoiceImpl
