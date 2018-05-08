/**
 */
package featureSolution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.ExtensionInclusion#getPlacement <em>Placement</em>}</li>
 *   <li>{@link featureSolution.ExtensionInclusion#getAppears <em>Appears</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion()
 * @model
 * @generated
 */
public interface ExtensionInclusion extends InclusionMechanism {

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link featureSolution.PlacementPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see featureSolution.PlacementPolicy
	 * @see #setPlacement(PlacementPolicy)
	 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion_Placement()
	 * @model default="MANDATORY" required="true"
	 * @generated
	 */
	PlacementPolicy getPlacement();

	/**
	 * Sets the value of the '{@link featureSolution.ExtensionInclusion#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see featureSolution.PlacementPolicy
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementPolicy value);

	/**
	 * Returns the value of the '<em><b>Appears</b></em>' attribute.
	 * The default value is <code>"BEFORE"</code>.
	 * The literals are from the enumeration {@link featureSolution.Appearance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appears</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appears</em>' attribute.
	 * @see featureSolution.Appearance
	 * @see #setAppears(Appearance)
	 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion_Appears()
	 * @model default="BEFORE" required="true"
	 * @generated
	 */
	Appearance getAppears();

	/**
	 * Sets the value of the '{@link featureSolution.ExtensionInclusion#getAppears <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appears</em>' attribute.
	 * @see featureSolution.Appearance
	 * @see #getAppears()
	 * @generated
	 */
	void setAppears(Appearance value);
} // ExtensionInclusion
