/**
 */
package placementDescription;

import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.ExternalCallPlacementStrategy#getMatchingSignature <em>Matching Signature</em>}</li>
 * </ul>
 *
 * @see placementDescription.PlacementDescriptionPackage#getExternalCallPlacementStrategy()
 * @model
 * @generated
 */
public interface ExternalCallPlacementStrategy extends PlacementStrategy {
	/**
	 * Returns the value of the '<em><b>Matching Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Signature</em>' reference.
	 * @see #setMatchingSignature(Signature)
	 * @see placementDescription.PlacementDescriptionPackage#getExternalCallPlacementStrategy_MatchingSignature()
	 * @model
	 * @generated
	 */
	Signature getMatchingSignature();

	/**
	 * Sets the value of the '{@link placementDescription.ExternalCallPlacementStrategy#getMatchingSignature <em>Matching Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Signature</em>' reference.
	 * @see #getMatchingSignature()
	 * @generated
	 */
	void setMatchingSignature(Signature value);

} // ExternalCallPlacementStrategy
