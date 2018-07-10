/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BoolChoice represents a choice for a DegreeOfFreedom with an bool range. So it is an indicator choice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.BoolChoice#isChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getBoolChoice()
 * @model
 * @generated
 */
public interface BoolChoice extends Choice {
	/**
	 * Returns the value of the '<em><b>Chosen Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chosen Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Value</em>' attribute.
	 * @see #setChosenValue(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getBoolChoice_ChosenValue()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isChosenValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.BoolChoice#isChosenValue <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen Value</em>' attribute.
	 * @see #isChosenValue()
	 * @generated
	 */
	void setChosenValue(boolean value);

} // BoolChoice
