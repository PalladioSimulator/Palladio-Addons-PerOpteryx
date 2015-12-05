/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.Choice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.AOrderedIntegerDegree;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.impl.GenericdesigndecisionFactoryImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AOrdered Integer Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.AOrderedIntegerDegreeImpl#getListOfIntegers <em>List Of Integers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AOrderedIntegerDegreeImpl extends ADiscreteDegreeImpl implements AOrderedIntegerDegree {
	/**
	 * The cached value of the '{@link #getListOfIntegers() <em>List Of Integers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfIntegers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> listOfIntegers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AOrderedIntegerDegreeImpl() {
		super();
	}
	
	@Override
	public Choice createRandomChoice() {
		GenericdesigndecisionFactory factory = GenericdesigndecisionFactoryImpl.init();
		DiscreteRangeChoice choice = factory.createDiscreteRangeChoice();
		
		int randomIndex = this.random.nextInt(this.getListOfIntegers().size());
		int value = this.getListOfIntegers().get(randomIndex);
		
		choice.setChosenValue(value);
		choice.setDofInstance(this);
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.AORDERED_INTEGER_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getListOfIntegers() {
		if (listOfIntegers == null) {
			listOfIntegers = new EDataTypeUniqueEList<Integer>(Integer.class, this, GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS);
		}
		return listOfIntegers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
				return getListOfIntegers();
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
			case GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
				getListOfIntegers().clear();
				getListOfIntegers().addAll((Collection<? extends Integer>)newValue);
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
			case GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
				getListOfIntegers().clear();
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
			case GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
				return listOfIntegers != null && !listOfIntegers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (listOfIntegers: ");
		result.append(listOfIntegers);
		result.append(')');
		return result.toString();
	}

} //AOrderedIntegerDegreeImpl
