/**
 */
package featureSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.FeatureList#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getFeatureList()
 * @model
 * @generated
 */
public interface FeatureList extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.SelectedCV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getFeatureList_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SelectedCV> getFeatures();

} // FeatureList
