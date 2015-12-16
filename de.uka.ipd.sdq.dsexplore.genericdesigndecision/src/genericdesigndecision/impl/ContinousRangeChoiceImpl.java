/**
 */
package genericdesigndecision.impl;

import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.AContinuousRangeDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

import org.eclipse.emf.ecore.EClass;
import org.opt4j.operator.mutate.MutateDouble;

import de.uka.ipd.sdq.dsexplore.exception.InvalidChoiceForDegreeException;
import de.uka.ipd.sdq.dsexplore.opt4j.operator.MutateDesignDecisionGenotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continous Range Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.impl.ContinousRangeChoiceImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinousRangeChoiceImpl extends ChoiceImpl implements ContinousRangeChoice {
	/**
	 * The default value of the '{@link #getChosenValue() <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenValue()
	 * @generated
	 * @ordered
	 */
	protected static final double CHOSEN_VALUE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinousRangeChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericdesigndecisionPackage.Literals.CONTINOUS_RANGE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getChosenValue() {
		return ((Double) this.getValue()).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setChosenValue(double newChosenValue) {
		this.setValue(new Double(newChosenValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE:
				return getChosenValue();
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
			case GenericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE:
				setChosenValue((Double)newValue);
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
			case GenericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE:
				setChosenValue(CHOSEN_VALUE_EDEFAULT);
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
			case GenericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE:
				return getChosenValue() != CHOSEN_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Calls {@link MutateDouble} on the given mutator.
	 * @param mutator
	 */
	public void mutate(MutateDesignDecisionGenotype mutator) {
		ADegreeOfFreedom degree = this.getDofInstance();
		if (degree instanceof AContinuousRangeDegree){
			AContinuousRangeDegree contDegree = (AContinuousRangeDegree)degree;
			double newValue = mutator.mutateDouble(this.getChosenValue(), contDegree.getFrom(), contDegree.getTo());
			this.setChosenValue(newValue);
		} else throw new InvalidChoiceForDegreeException(this);
	}

} //ContinousRangeChoiceImpl
