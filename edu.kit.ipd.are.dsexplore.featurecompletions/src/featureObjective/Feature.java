/**
 */
package featureObjective;

import FeatureCompletionModel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.Feature#getFeaturegroup <em>Featuregroup</em>}</li>
 * </ul>
 *
 * @see featureObjective.FeatureObjectivePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuregroup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuregroup</em>' reference.
	 * @see #setFeaturegroup(FeatureGroup)
	 * @see featureObjective.FeatureObjectivePackage#getFeature_Featuregroup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureGroup getFeaturegroup();

	/**
	 * Sets the value of the '{@link featureObjective.Feature#getFeaturegroup <em>Featuregroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuregroup</em>' reference.
	 * @see #getFeaturegroup()
	 * @generated
	 */
	void setFeaturegroup(FeatureGroup value);

} // Feature
