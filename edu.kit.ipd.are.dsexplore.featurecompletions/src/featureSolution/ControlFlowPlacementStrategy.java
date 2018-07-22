/**
 */
package featureSolution;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.ControlFlowPlacementStrategy#getForAllControlFlowsIn <em>For All Control Flows In</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getControlFlowPlacementStrategy()
 * @model
 * @generated
 */
public interface ControlFlowPlacementStrategy extends PlacementStrategy {
	/**
	 * Returns the value of the '<em><b>For All Control Flows In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For All Control Flows In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For All Control Flows In</em>' reference.
	 * @see #setForAllControlFlowsIn(RepositoryComponent)
	 * @see featureSolution.FeatureSolutionPackage#getControlFlowPlacementStrategy_ForAllControlFlowsIn()
	 * @model
	 * @generated
	 */
	RepositoryComponent getForAllControlFlowsIn();

	/**
	 * Sets the value of the '{@link featureSolution.ControlFlowPlacementStrategy#getForAllControlFlowsIn <em>For All Control Flows In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For All Control Flows In</em>' reference.
	 * @see #getForAllControlFlowsIn()
	 * @generated
	 */
	void setForAllControlFlowsIn(RepositoryComponent value);

} // ControlFlowPlacementStrategy
