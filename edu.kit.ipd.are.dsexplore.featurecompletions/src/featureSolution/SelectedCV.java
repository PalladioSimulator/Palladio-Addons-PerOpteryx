/**
 */
package featureSolution;

import FeatureCompletionModel.ComplementumVisnetis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected CV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.SelectedCV#isOptional <em>Optional</em>}</li>
 *   <li>{@link featureSolution.SelectedCV#getComplementumVisnetis <em>Complementum Visnetis</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getSelectedCV()
 * @model
 * @generated
 */
public interface SelectedCV extends EObject {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see featureSolution.FeatureSolutionPackage#getSelectedCV_Optional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link featureSolution.SelectedCV#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Complementum Visnetis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementum Visnetis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementum Visnetis</em>' reference.
	 * @see #setComplementumVisnetis(ComplementumVisnetis)
	 * @see featureSolution.FeatureSolutionPackage#getSelectedCV_ComplementumVisnetis()
	 * @model required="true"
	 * @generated
	 */
	ComplementumVisnetis getComplementumVisnetis();

	/**
	 * Sets the value of the '{@link featureSolution.SelectedCV#getComplementumVisnetis <em>Complementum Visnetis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complementum Visnetis</em>' reference.
	 * @see #getComplementumVisnetis()
	 * @generated
	 */
	void setComplementumVisnetis(ComplementumVisnetis value);

} // SelectedCV
