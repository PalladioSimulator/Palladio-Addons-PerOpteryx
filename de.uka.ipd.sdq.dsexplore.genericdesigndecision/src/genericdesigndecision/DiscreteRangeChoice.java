/**
 */
package genericdesigndecision;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Range Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DiscreteRangeChoice represents a choice for a DegreeOfFreedom with an integer range. 
 * 
 * TODO constraint:  The degreeOfFreedom of this Choice must be an DiscreteRangeDegree
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.DiscreteRangeChoice#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.GenericdesigndecisionPackage#getDiscreteRangeChoice()
 * @model
 * @generated
 */
public interface DiscreteRangeChoice extends Choice {
	/**
	 * Returns the value of the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value chosen from the DegreeOfFreedom. 
	 * 
	 * TODO: constraint: chosenValue must be within the defined range. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chosen Value</em>' attribute.
	 * @see #setChosenValue(int)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getDiscreteRangeChoice_ChosenValue()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getChosenValue();

	/**
	 * Sets the value of the '{@link genericdesigndecision.DiscreteRangeChoice#getChosenValue <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen Value</em>' attribute.
	 * @see #getChosenValue()
	 * @generated
	 */
	void setChosenValue(int value);

} // DiscreteRangeChoice
