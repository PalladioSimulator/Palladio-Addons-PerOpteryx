/**
 */
package org.palladiosimulator.pcm.cost;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable Processing Resource Cost</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> VariableProcessingResourceCost are attached to
 * ProcessingResourceSpecification. They derive the operating cost and inital cost based on the
 * processingRate of the resource, as defined in the processing rate (operating or initial) cost
 * function. Use the variable procRate.VALUE to refer to the processing rate in the expression.
 * Additionally, the fixed initial costs as specified in VariableCost are added to the respective
 * cost.
 *
 *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.VariableProcessingResourceCost#getProcessingRateInitialFunction
 * <em>Processing Rate Initial Function</em>}</li>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.VariableProcessingResourceCost#getProcessingRateOperatingFunction
 * <em>Processing Rate Operating Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.pcm.cost.costPackage#getVariableProcessingResourceCost()
 * @model
 * @generated
 */
public interface VariableProcessingResourceCost extends VariableCost, ProcessingResourceCost
{
    /**
     * Returns the value of the '<em><b>Processing Rate Initial Function</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processing Rate Initial Function</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Processing Rate Initial Function</em>' containment reference.
     * @see #setProcessingRateInitialFunction(ScalarFunction)
     * @see org.palladiosimulator.pcm.cost.costPackage#getVariableProcessingResourceCost_ProcessingRateInitialFunction()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ScalarFunction getProcessingRateInitialFunction();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.cost.VariableProcessingResourceCost#getProcessingRateInitialFunction
     * <em>Processing Rate Initial Function</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Processing Rate Initial Function</em>' containment
     *            reference.
     * @see #getProcessingRateInitialFunction()
     * @generated
     */
    void setProcessingRateInitialFunction(ScalarFunction value);

    /**
     * Returns the value of the '<em><b>Processing Rate Operating Function</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processing Rate Operating Function</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Processing Rate Operating Function</em>' containment reference.
     * @see #setProcessingRateOperatingFunction(ScalarFunction)
     * @see org.palladiosimulator.pcm.cost.costPackage#getVariableProcessingResourceCost_ProcessingRateOperatingFunction()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ScalarFunction getProcessingRateOperatingFunction();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.cost.VariableProcessingResourceCost#getProcessingRateOperatingFunction
     * <em>Processing Rate Operating Function</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Processing Rate Operating Function</em>' containment
     *            reference.
     * @see #getProcessingRateOperatingFunction()
     * @generated
     */
    void setProcessingRateOperatingFunction(ScalarFunction value);

} // VariableProcessingResourceCost
