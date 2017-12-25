/**
 */
package featureSolution;

import FeatureCompletionModel.CompletionComponent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.SolutionComponent#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getSolutionComponent()
 * @model
 * @generated
 */
public interface SolutionComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(CompletionComponent)
	 * @see featureSolution.FeatureSolutionPackage#getSolutionComponent_Realizes()
	 * @model required="true"
	 * @generated
	 */
	CompletionComponent getRealizes();

	/**
	 * Sets the value of the '{@link featureSolution.SolutionComponent#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(CompletionComponent value);

} // SolutionComponent
