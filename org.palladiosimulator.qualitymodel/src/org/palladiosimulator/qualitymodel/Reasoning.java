/**
 */
package org.palladiosimulator.qualitymodel;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.Reasoning#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.Reasoning#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoning()
 * @model
 * @generated
 */
public interface Reasoning extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoning_Transformations()
	 * @model type="org.palladiosimulator.qualitymodel.Transformation" required="true"
	 * @generated
	 */
	EList getTransformations();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Dimension)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoning_Output()
	 * @model required="true"
	 * @generated
	 */
	Dimension getOutput();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.Reasoning#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Dimension value);

} // Reasoning
