/**
 */
package org.palladiosimulator.metricspec;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Description</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.Description#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.Description#getTextualDescription <em>Textual
 * Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getDescription()
 * @model abstract="true"
 * @generated
 */
public interface Description extends EObject, Identifier {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getDescription_Name()
     * @model required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.metricspec.Description#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Textual Description</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Textual Description</em>' attribute.
     * @see #setTextualDescription(String)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getDescription_TextualDescription()
     * @model required="true" ordered="false"
     * @generated
     */
    String getTextualDescription();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.Description#getTextualDescription
     * <em>Textual Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Textual Description</em>' attribute.
     * @see #getTextualDescription()
     * @generated
     */
    void setTextualDescription(String value);

} // Description
