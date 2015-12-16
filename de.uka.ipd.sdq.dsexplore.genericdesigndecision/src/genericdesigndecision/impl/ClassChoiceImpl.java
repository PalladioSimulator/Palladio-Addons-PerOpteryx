/**
 */
package genericdesigndecision.impl;

import genericdesigndecision.ClassChoice;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.AClassDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.exception.InvalidChoiceForDegreeException;
import de.uka.ipd.sdq.dsexplore.opt4j.operator.MutateDesignDecisionGenotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.impl.ClassChoiceImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassChoiceImpl extends ChoiceImpl implements ClassChoice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericdesigndecisionPackage.Literals.CLASS_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getChosenValue() {
		EObject chosenValue = basicGetChosenValue();
		return chosenValue != null && chosenValue.eIsProxy() ? eResolveProxy((InternalEObject)chosenValue) : chosenValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject basicGetChosenValue() {
		return ((EObject) this.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setChosenValue(EObject newChosenValue) {
		this.setValue(newChosenValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				if (resolve) return getChosenValue();
				return basicGetChosenValue();
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
			case GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				setChosenValue((EObject)newValue);
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
			case GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				setChosenValue((EObject)null);
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
			case GenericdesigndecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
				return basicGetChosenValue() != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Mutates an enumeration design decision (i.e. without order) by randomly choosing a 
	 * new (!= old) value from the design decision options using the given mutator
	 * 
	 * @param mutator
	 */
	@Override
	public void mutate(MutateDesignDecisionGenotype mutator) {
		ADegreeOfFreedom degree = this.getDofInstance();
		if (degree instanceof AClassDegree){
			AClassDegree enumDegree = (AClassDegree) degree;
			int oldIndex = enumDegree.getClassDesignOptions().indexOf(this.getChosenValue());
			if (oldIndex == -1){
				throw new ChoiceOutOfBoundsException(this, "Error when mutating individual, old choice was invalid");
			}
			
			List<EObject> domain = enumDegree.getClassDesignOptions();
			
			int newIndex = mutator.mutateInteger(oldIndex, 0, domain.size()-1);
			if (newIndex < 0 || newIndex >= domain.size()){
				throw new RuntimeException("Error when mutating integer index value: Value is out of bounds!");
			}			
			this.setChosenValue(enumDegree.getClassDesignOptions().get(newIndex));
			
		} else {
			throw new InvalidChoiceForDegreeException(this);
		}
	}

} //ClassChoiceImpl
