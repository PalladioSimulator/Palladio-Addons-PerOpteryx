/**
 */
package featureObjective;

import FeatureCompletionModel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.Attribute#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see featureObjective.FeatureObjectivePackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(IntervalRange)
	 * @see featureObjective.FeatureObjectivePackage#getAttribute_Range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntervalRange getRange();

	/**
	 * Sets the value of the '{@link featureObjective.Attribute#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(IntervalRange value);

} // Attribute
