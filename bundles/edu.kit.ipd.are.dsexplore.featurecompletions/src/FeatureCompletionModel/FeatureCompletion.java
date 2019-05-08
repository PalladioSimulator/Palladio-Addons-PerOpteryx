/**
 */
package FeatureCompletionModel;

import featureObjective.FeatureObjective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.FeatureCompletion#getFeatureObjectives <em>Feature Objectives</em>}</li>
 *   <li>{@link FeatureCompletionModel.FeatureCompletion#getCompletionComponents <em>Completion Components</em>}</li>
 *   <li>{@link FeatureCompletionModel.FeatureCompletion#getComplementa <em>Complementa</em>}</li>
 *   <li>{@link FeatureCompletionModel.FeatureCompletion#getArchitectureConstraints <em>Architecture Constraints</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredComponentsHaveToBePartOfCompletion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot requiredComponentsHaveToBePartOfCompletion='\n\t\t\tcompletionComponents.requiredComponents-&gt;exists(self.completionComponents)'"
 * @generated
 */
public interface FeatureCompletion extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Feature Objectives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Objectives</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Objectives</em>' reference.
	 * @see #setFeatureObjectives(FeatureObjective)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletion_FeatureObjectives()
	 * @model required="true"
	 * @generated
	 */
	FeatureObjective getFeatureObjectives();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.FeatureCompletion#getFeatureObjectives <em>Feature Objectives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Objectives</em>' reference.
	 * @see #getFeatureObjectives()
	 * @generated
	 */
	void setFeatureObjectives(FeatureObjective value);

	/**
	 * Returns the value of the '<em><b>Completion Components</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureCompletionModel.CompletionComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Components</em>' containment reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletion_CompletionComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompletionComponent> getCompletionComponents();

	/**
	 * Returns the value of the '<em><b>Complementa</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureCompletionModel.Complementum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementa</em>' containment reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletion_Complementa()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Complementum> getComplementa();

	/**
	 * Returns the value of the '<em><b>Architecture Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureCompletionModel.ArchitectureConstraints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Constraints</em>' containment reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletion_ArchitectureConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureConstraints> getArchitectureConstraints();

} // FeatureCompletion
