/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.NumericQualityProperty#getConfidenceInterval <em>Confidence Interval</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.QualitypropertiesPackage#getNumericQualityProperty()
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
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.QualitypropertiesPackage#getNumericQualityProperty_ConfidenceInterval()
	 * @model ordered="false"
	 * @generated
	 */
	ConfidenceInterval getConfidenceInterval();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.NumericQualityProperty#getConfidenceInterval <em>Confidence Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Interval</em>' reference.
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	void setConfidenceInterval(ConfidenceInterval value);

} // NumericQualityProperty
