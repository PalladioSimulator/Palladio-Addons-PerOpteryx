/**
 */
package featureSolution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.AdapterInclusion#getAppears <em>Appears</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getAdapterInclusion()
 * @model
 * @generated
 */
public interface AdapterInclusion extends InclusionMechanism {
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
	 * @see featureSolution.FeatureSolutionPackage#getAdapterInclusion_Appears()
	 * @model default="BEFORE" required="true"
	 * @generated
	 */
	Appearance getAppears();

	/**
	 * Sets the value of the '{@link featureSolution.AdapterInclusion#getAppears <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appears</em>' attribute.
	 * @see featureSolution.Appearance
	 * @see #getAppears()
	 * @generated
	 */
	void setAppears(Appearance value);

} // AdapterInclusion
