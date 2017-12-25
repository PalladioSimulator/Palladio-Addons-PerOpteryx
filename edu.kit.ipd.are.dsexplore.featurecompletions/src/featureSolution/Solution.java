/**
 */
package featureSolution;

import FeatureCompletionModel.DescribedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.Solution#getInclusionInstructions <em>Inclusion Instructions</em>}</li>
 *   <li>{@link featureSolution.Solution#getSolutionComponents <em>Solution Components</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Inclusion Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion Instructions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion Instructions</em>' containment reference.
	 * @see #setInclusionInstructions(InclusionMechanism)
	 * @see featureSolution.FeatureSolutionPackage#getSolution_InclusionInstructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InclusionMechanism getInclusionInstructions();

	/**
	 * Sets the value of the '{@link featureSolution.Solution#getInclusionInstructions <em>Inclusion Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion Instructions</em>' containment reference.
	 * @see #getInclusionInstructions()
	 * @generated
	 */
	void setInclusionInstructions(InclusionMechanism value);

	/**
	 * Returns the value of the '<em><b>Solution Components</b></em>' reference list.
	 * The list contents are of type {@link featureSolution.SolutionComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Components</em>' reference list.
	 * @see featureSolution.FeatureSolutionPackage#getSolution_SolutionComponents()
	 * @model type="featureSolution.SolutionComponent" required="true"
	 * @generated
	 */
	EList getSolutionComponents();

} // Solution
