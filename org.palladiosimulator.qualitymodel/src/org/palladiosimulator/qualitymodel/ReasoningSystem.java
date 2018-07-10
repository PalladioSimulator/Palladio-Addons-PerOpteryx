/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoning System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.ReasoningSystem#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningSystem()
 * @model
 * @generated
 */
public interface ReasoningSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.ReasoningComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningSystem_Components()
	 * @model type="org.palladiosimulator.qualitymodel.ReasoningComponent" containment="true"
	 * @generated
	 */
	EList getComponents();

} // ReasoningSystem
