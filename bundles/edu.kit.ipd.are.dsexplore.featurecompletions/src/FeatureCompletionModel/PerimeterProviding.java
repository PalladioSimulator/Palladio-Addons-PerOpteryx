/**
 */
package FeatureCompletionModel;

import featureObjective.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perimeter Providing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.PerimeterProviding#getFeatureProviding <em>Feature Providing</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getPerimeterProviding()
 * @model
 * @generated
 */
public interface PerimeterProviding extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Feature Providing</b></em>' reference list.
	 * The list contents are of type {@link featureObjective.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Providing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Providing</em>' reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getPerimeterProviding_FeatureProviding()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFeatureProviding();

} // PerimeterProviding
