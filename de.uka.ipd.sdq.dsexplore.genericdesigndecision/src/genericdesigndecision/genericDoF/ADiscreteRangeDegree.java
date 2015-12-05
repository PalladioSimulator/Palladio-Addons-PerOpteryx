/**
 */
package genericdesigndecision.genericDoF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADiscrete Range Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents DegreeOfFreedoms that have a range of integer values as their domain. The set of possile values of the degree of freedom is defined as the integer interval between "from" and "to".
 * 
 * TODO OCL: from must be smaller that to. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getTo <em>To</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADiscreteRangeDegree()
 * @model abstract="true"
 * @generated
 */
public interface ADiscreteRangeDegree extends ARangeDegree, ADiscreteDegree {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADiscreteRangeDegree_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADiscreteRangeDegree_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

} // ADiscreteRangeDegree
