/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoning Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getNqrs <em>Nqrs</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getReasonings <em>Reasonings</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningComponent()
 * @model
 * @generated
 */
public interface ReasoningComponent extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Nqrs</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Nqr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nqrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nqrs</em>' reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningComponent_Nqrs()
	 * @model type="org.palladiosimulator.qualitymodel.Nqr"
	 * @generated
	 */
	EList getNqrs();

	/**
	 * Returns the value of the '<em><b>Reasonings</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Reasoning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reasonings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reasonings</em>' reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningComponent_Reasonings()
	 * @model type="org.palladiosimulator.qualitymodel.Reasoning"
	 * @generated
	 */
	EList getReasonings();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(RepositoryComponent)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getReasoningComponent_Component()
	 * @model required="true"
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

} // ReasoningComponent
