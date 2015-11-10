/**
 */
package genericdesigndecision.qualityproperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.qualityproperties.NumericQualityProperty#getConfidenceInterval <em>Confidence Interval</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getNumericQualityProperty()
 * @model abstract="true"
 * @generated
 */
public interface NumericQualityProperty extends QualityProperty {
	/**
	 * Returns the value of the '<em><b>Confidence Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidence Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Interval</em>' reference.
	 * @see #setConfidenceInterval(ConfidenceInterval)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getNumericQualityProperty_ConfidenceInterval()
	 * @model ordered="false"
	 * @generated
	 */
	ConfidenceInterval getConfidenceInterval();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.NumericQualityProperty#getConfidenceInterval <em>Confidence Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Interval</em>' reference.
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	void setConfidenceInterval(ConfidenceInterval value);

} // NumericQualityProperty
