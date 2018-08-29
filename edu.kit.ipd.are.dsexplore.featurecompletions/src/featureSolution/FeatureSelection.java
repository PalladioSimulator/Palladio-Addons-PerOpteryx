/**
 */
package featureSolution;

import FeatureCompletionModel.FeatureCompletion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.FeatureSelection#getCompletion <em>Completion</em>}</li>
 *   <li>{@link featureSolution.FeatureSelection#getFeatureLists <em>Feature Lists</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getFeatureSelection()
 * @model
 * @generated
 */
public interface FeatureSelection extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Completion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' reference.
	 * @see #setCompletion(FeatureCompletion)
	 * @see featureSolution.FeatureSolutionPackage#getFeatureSelection_Completion()
	 * @model required="true"
	 * @generated
	 */
	FeatureCompletion getCompletion();

	/**
	 * Sets the value of the '{@link featureSolution.FeatureSelection#getCompletion <em>Completion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' reference.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(FeatureCompletion value);

	/**
	 * Returns the value of the '<em><b>Feature Lists</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.FeatureList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Lists</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getFeatureSelection_FeatureLists()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FeatureList> getFeatureLists();

} // FeatureSelection
