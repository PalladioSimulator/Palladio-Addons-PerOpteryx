/**
 */
package FeatureCompletionModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.FeatureCompletionRepository#getFeatureCompletions <em>Feature Completions</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletionRepository()
 * @model
 * @generated
 */
public interface FeatureCompletionRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Completions</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureCompletionModel.FeatureCompletion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Completions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Completions</em>' containment reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getFeatureCompletionRepository_FeatureCompletions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureCompletion> getFeatureCompletions();

} // FeatureCompletionRepository
