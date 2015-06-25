/**
 */
package org.palladiosimulator.pcm.cost;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Variable Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.VariableCost#getFixedInitialCost <em>Fixed Initial Cost
 * </em>}</li>
 * <li>{@link org.palladiosimulator.pcm.cost.VariableCost#getFixedOperatingCost <em>Fixed Operating
 * Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.pcm.cost.costPackage#getVariableCost()
 * @model abstract="true"
 * @generated
 */
public interface VariableCost extends Cost
{
    /**
     * Returns the value of the '<em><b>Fixed Initial Cost</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Fixed Initial Cost</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Fixed Initial Cost</em>' attribute.
     * @see #setFixedInitialCost(double)
     * @see org.palladiosimulator.pcm.cost.costPackage#getVariableCost_FixedInitialCost()
     * @model required="true" ordered="false"
     * @generated
     */
    double getFixedInitialCost();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.cost.VariableCost#getFixedInitialCost
     * <em>Fixed Initial Cost</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Fixed Initial Cost</em>' attribute.
     * @see #getFixedInitialCost()
     * @generated
     */
    void setFixedInitialCost(double value);

    /**
     * Returns the value of the '<em><b>Fixed Operating Cost</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Operating Cost</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Fixed Operating Cost</em>' attribute.
     * @see #setFixedOperatingCost(double)
     * @see org.palladiosimulator.pcm.cost.costPackage#getVariableCost_FixedOperatingCost()
     * @model required="true" ordered="false"
     * @generated
     */
    double getFixedOperatingCost();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.cost.VariableCost#getFixedOperatingCost
     * <em>Fixed Operating Cost</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Fixed Operating Cost</em>' attribute.
     * @see #getFixedOperatingCost()
     * @generated
     */
    void setFixedOperatingCost(double value);

} // VariableCost
