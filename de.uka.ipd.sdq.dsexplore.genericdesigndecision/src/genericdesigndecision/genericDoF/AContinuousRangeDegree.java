/**
 */
package genericdesigndecision.genericDoF;

import genericdesigndecision.Choice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AContinuous Range Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents DegreeOfFreedoms that have a range of real values as their domain. The set of possile values of the degree of freedom is defined as the real interval between "from" and "to".
 * 
 * TODO OCL: from must be smaller that to. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getTo <em>To</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAContinuousRangeDegree()
 * @model abstract="true"
 * @generated
 */
public interface AContinuousRangeDegree extends ARangeDegree {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(double)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAContinuousRangeDegree_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTo();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(double)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAContinuousRangeDegree_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getFrom();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice createRandomChoice();

} // AContinuousRangeDegree
