/**
 */
package FeatureCompletionModel;

import featureObjective.Feature;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link FeatureCompletionModel.ComplementumVisnetis#getRequiresComplementum <em>Requires Complementum</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Requires Complementum</b></em>' reference list.
	 * The list contents are of type {@link FeatureCompletionModel.Complementum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Complementum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Complementum</em>' reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementumVisnetis_RequiresComplementum()
	 * @model
	 * @generated
	 */
	EList<Complementum> getRequiresComplementum();

} // ComplementumVisnetis
