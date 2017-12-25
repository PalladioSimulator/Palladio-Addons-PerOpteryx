/**
 */
package featureSolution;

import FeatureCompletionModel.DescribedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusion Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.InclusionMechanism#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getInclusionMechanism()
 * @model abstract="true"
 * @generated
 */
public interface InclusionMechanism extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see featureSolution.FeatureSolutionPackage#getInclusionMechanism_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link featureSolution.InclusionMechanism#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

} // InclusionMechanism
