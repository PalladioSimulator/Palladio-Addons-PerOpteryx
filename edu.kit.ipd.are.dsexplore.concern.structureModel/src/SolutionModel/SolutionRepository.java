/**
 */
package SolutionModel;

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
 *   <li>{@link SolutionModel.SolutionRepository#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see SolutionModel.SolutionModelPackage#getSolutionRepository()
 * @model
 * @generated
 */
public interface SolutionRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link SolutionModel.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see SolutionModel.SolutionModelPackage#getSolutionRepository_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

} // SolutionRepository
