/**
 */
package featureSolution;

import org.palladiosimulator.pcm.seff.InternalAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Action Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.InternalActionPlacementStrategy#getMatchingInternalAction <em>Matching Internal Action</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getInternalActionPlacementStrategy()
 * @model
 * @generated
 */
public interface InternalActionPlacementStrategy extends PlacementStrategy {
	/**
	 * Returns the value of the '<em><b>Matching Internal Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Internal Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Internal Action</em>' reference.
	 * @see #setMatchingInternalAction(InternalAction)
	 * @see featureSolution.FeatureSolutionPackage#getInternalActionPlacementStrategy_MatchingInternalAction()
	 * @model
	 * @generated
	 */
	InternalAction getMatchingInternalAction();

	/**
	 * Sets the value of the '{@link featureSolution.InternalActionPlacementStrategy#getMatchingInternalAction <em>Matching Internal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Internal Action</em>' reference.
	 * @see #getMatchingInternalAction()
	 * @generated
	 */
	void setMatchingInternalAction(InternalAction value);

} // InternalActionPlacementStrategy
