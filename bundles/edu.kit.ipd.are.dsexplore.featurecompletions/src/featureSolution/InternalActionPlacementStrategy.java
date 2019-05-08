/**
 */
package featureSolution;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Action Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.InternalActionPlacementStrategy#getForAllInternalActionsIn <em>For All Internal Actions In</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getInternalActionPlacementStrategy()
 * @model
 * @generated
 */
public interface InternalActionPlacementStrategy extends PlacementStrategy {
	/**
	 * Returns the value of the '<em><b>For All Internal Actions In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For All Internal Actions In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For All Internal Actions In</em>' reference.
	 * @see #setForAllInternalActionsIn(RepositoryComponent)
	 * @see featureSolution.FeatureSolutionPackage#getInternalActionPlacementStrategy_ForAllInternalActionsIn()
	 * @model
	 * @generated
	 */
	RepositoryComponent getForAllInternalActionsIn();

	/**
	 * Sets the value of the '{@link featureSolution.InternalActionPlacementStrategy#getForAllInternalActionsIn <em>For All Internal Actions In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For All Internal Actions In</em>' reference.
	 * @see #getForAllInternalActionsIn()
	 * @generated
	 */
	void setForAllInternalActionsIn(RepositoryComponent value);

} // InternalActionPlacementStrategy
