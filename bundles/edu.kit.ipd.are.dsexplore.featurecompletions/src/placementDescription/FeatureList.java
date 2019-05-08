/**
 */
package placementDescription;

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
 *   <li>{@link placementDescription.FeatureList#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see placementDescription.PlacementDescriptionPackage#getFeatureList()
 * @model
 * @generated
 */
public interface FeatureList extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link placementDescription.SelectedCV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see placementDescription.PlacementDescriptionPackage#getFeatureList_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SelectedCV> getFeatures();

} // FeatureList
