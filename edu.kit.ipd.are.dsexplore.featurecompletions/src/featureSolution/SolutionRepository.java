/**
 */
package featureSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.SolutionRepository#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getSolutionRepository()
 * @model
 * @generated
 */
public interface SolutionRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getSolutionRepository_Solutions()
	 * @model type="featureSolution.Solution" containment="true"
	 * @generated
	 */
	EList getSolutions();

} // SolutionRepository
