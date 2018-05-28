/**
 */
package featureSolution;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.PointCut#getPlacementStrategy <em>Placement Strategy</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getPointCut()
 * @model
 * @generated
 */
public interface PointCut extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Placement Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Strategy</em>' containment reference.
	 * @see #setPlacementStrategy(PlacementStrategy)
	 * @see featureSolution.FeatureSolutionPackage#getPointCut_PlacementStrategy()
	 * @model containment="true"
	 * @generated
	 */
	PlacementStrategy getPlacementStrategy();

	/**
	 * Sets the value of the '{@link featureSolution.PointCut#getPlacementStrategy <em>Placement Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Strategy</em>' containment reference.
	 * @see #getPlacementStrategy()
	 * @generated
	 */
	void setPlacementStrategy(PlacementStrategy value);

} // PointCut
