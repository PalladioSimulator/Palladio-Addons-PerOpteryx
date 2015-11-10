/**
 */
package genericdesigndecision.qualityproperties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidence Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getConfidenceLevel <em>Confidence Level</em>}</li>
 *   <li>{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getMean <em>Mean</em>}</li>
 *   <li>{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getConfidenceInterval()
 * @model
 * @generated
 */
public interface ConfidenceInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidence Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the confidence level. Use values between 0 and 1. For instance use 0.95 to estimate the 95% confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence Level</em>' attribute.
	 * @see #setConfidenceLevel(double)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getConfidenceInterval_ConfidenceLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getConfidenceLevel();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getConfidenceLevel <em>Confidence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Level</em>' attribute.
	 * @see #getConfidenceLevel()
	 * @generated
	 */
	void setConfidenceLevel(double value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the center of the confidence interval
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(double)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getConfidenceInterval_Mean()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the confidence interval's upper bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(double)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getConfidenceInterval_UpperBound()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getUpperBound();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the confidence interval's lower bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(double)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getConfidenceInterval_LowerBound()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getLowerBound();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.ConfidenceInterval#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(double value);

} // ConfidenceInterval
