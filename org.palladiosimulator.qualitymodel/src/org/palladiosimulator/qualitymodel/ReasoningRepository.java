/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoning Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.ReasoningRepository#getReasonings <em>Reasonings</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningRepository()
 * @model
 * @generated
 */
public interface ReasoningRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Reasonings</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Reasoning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reasonings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reasonings</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningRepository_Reasonings()
	 * @model type="org.palladiosimulator.qualitymodel.Reasoning" containment="true"
	 * @generated
	 */
	EList getReasonings();

} // ReasoningRepository
