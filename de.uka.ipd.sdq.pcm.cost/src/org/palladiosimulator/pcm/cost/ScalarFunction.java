/**
 */
package org.palladiosimulator.pcm.cost;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.stoex.Term;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Scalar Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.ScalarFunction#getSpecification <em>Specification</em>}
 * </li>
 * <li>{@link org.palladiosimulator.pcm.cost.ScalarFunction#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.pcm.cost.costPackage#getScalarFunction()
 * @model
 * @generated
 */
public interface ScalarFunction extends EObject
{
    /**
     * Returns the value of the '<em><b>Specification</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Specification</em>' attribute.
     * @see #setSpecification(String)
     * @see org.palladiosimulator.pcm.cost.costPackage#getScalarFunction_Specification()
     * @model required="true" ordered="false"
     * @generated
     */
    String getSpecification();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.cost.ScalarFunction#getSpecification
     * <em>Specification</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Specification</em>' attribute.
     * @see #getSpecification()
     * @generated
     */
    void setSpecification(String value);

    /**
     * Returns the value of the '<em><b>Term</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Term</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Term</em>' reference.
     * @see org.palladiosimulator.pcm.cost.costPackage#getScalarFunction_Term()
     * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true"
     *        derived="true" ordered="false" suppressedIsSetVisibility="true"
     *        extendedMetaData="namespace=''"
     * @generated
     */
    Term getTerm();

} // ScalarFunction
