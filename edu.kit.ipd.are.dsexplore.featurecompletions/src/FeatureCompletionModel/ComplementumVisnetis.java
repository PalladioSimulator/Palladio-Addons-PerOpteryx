/**
 */
package FeatureCompletionModel;

import featureObjective.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementum Visnetis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.ComplementumVisnetis#getComplementaryFeature <em>Complementary Feature</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementumVisnetis()
 * @model
 * @generated
 */
public interface ComplementumVisnetis extends Complementum, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Complementary Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementary Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementary Feature</em>' reference.
	 * @see #setComplementaryFeature(Feature)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementumVisnetis_ComplementaryFeature()
	 * @model required="true"
	 * @generated
	 */
	Feature getComplementaryFeature();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.ComplementumVisnetis#getComplementaryFeature <em>Complementary Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complementary Feature</em>' reference.
	 * @see #getComplementaryFeature()
	 * @generated
	 */
	void setComplementaryFeature(Feature value);

} // ComplementumVisnetis
