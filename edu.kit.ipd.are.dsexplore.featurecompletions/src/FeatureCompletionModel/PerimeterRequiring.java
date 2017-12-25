/**
 */
package FeatureCompletionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perimeter Requiring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.PerimeterRequiring#getComplementum <em>Complementum</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getPerimeterRequiring()
 * @model
 * @generated
 */
public interface PerimeterRequiring extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Complementum</b></em>' reference list.
	 * The list contents are of type {@link FeatureCompletionModel.Complementum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementum</em>' reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getPerimeterRequiring_Complementum()
	 * @model type="FeatureCompletionModel.Complementum"
	 * @generated
	 */
	EList getComplementum();

} // PerimeterRequiring
