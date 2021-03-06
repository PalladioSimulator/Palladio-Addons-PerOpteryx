/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Range Degree</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents DegreeOfFreedoms that have a range of numbers as their domain. The set of possile values of the degree of freedom is defined by the subclasses. In this class, the attributes upperBoundIncluded and lowerBoundIncluded define whether the endpoints defined by the subclasses are included in the domain or not (similar to mathematical intervals)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isUpperBoundIncluded <em>Upper Bound Included</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isLowerBoundIncluded <em>Lower Bound Included</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#getNumberOfSteps <em>Number Of Steps</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getRangeDegree()
 * @model abstract="true"
 * @generated
 */
public interface RangeDegree extends OrderedDataTypeDegree {
	/**
	 * Returns the value of the '<em><b>Upper Bound Included</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound Included</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Included</em>' attribute.
	 * @see #setUpperBoundIncluded(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getRangeDegree_UpperBoundIncluded()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isUpperBoundIncluded();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isUpperBoundIncluded <em>Upper Bound Included</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Included</em>' attribute.
	 * @see #isUpperBoundIncluded()
	 * @generated
	 */
	void setUpperBoundIncluded(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound Included</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound Included</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Included</em>' attribute.
	 * @see #setLowerBoundIncluded(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getRangeDegree_LowerBoundIncluded()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isLowerBoundIncluded();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#isLowerBoundIncluded <em>Lower Bound Included</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Included</em>' attribute.
	 * @see #isLowerBoundIncluded()
	 * @generated
	 */
	void setLowerBoundIncluded(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Steps</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Steps</em>' attribute.
	 * @see #setNumberOfSteps(int)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getRangeDegree_NumberOfSteps()
	 * @model ordered="false"
	 * @generated
	 */
	int getNumberOfSteps();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree#getNumberOfSteps <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Steps</em>' attribute.
	 * @see #getNumberOfSteps()
	 * @generated
	 */
	void setNumberOfSteps(int value);

} // RangeDegree
