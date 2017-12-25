/**
 */
package FeatureCompletionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.CompletionComponent#getRequiredComponents <em>Required Components</em>}</li>
 *   <li>{@link FeatureCompletionModel.CompletionComponent#getPerimeterProviding <em>Perimeter Providing</em>}</li>
 *   <li>{@link FeatureCompletionModel.CompletionComponent#getComponentConstraints <em>Component Constraints</em>}</li>
 *   <li>{@link FeatureCompletionModel.CompletionComponent#getPerimeterRequiring <em>Perimeter Requiring</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getCompletionComponent()
 * @model
 * @generated
 */
public interface CompletionComponent extends ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Required Components</b></em>' reference list.
	 * The list contents are of type {@link FeatureCompletionModel.CompletionComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Components</em>' reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getCompletionComponent_RequiredComponents()
	 * @model type="FeatureCompletionModel.CompletionComponent"
	 * @generated
	 */
	EList getRequiredComponents();

	/**
	 * Returns the value of the '<em><b>Perimeter Providing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perimeter Providing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter Providing</em>' containment reference.
	 * @see #setPerimeterProviding(PerimeterProviding)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getCompletionComponent_PerimeterProviding()
	 * @model containment="true"
	 * @generated
	 */
	PerimeterProviding getPerimeterProviding();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.CompletionComponent#getPerimeterProviding <em>Perimeter Providing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter Providing</em>' containment reference.
	 * @see #getPerimeterProviding()
	 * @generated
	 */
	void setPerimeterProviding(PerimeterProviding value);

	/**
	 * Returns the value of the '<em><b>Component Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureCompletionModel.ArchitectureConstraints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Constraints</em>' containment reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getCompletionComponent_ComponentConstraints()
	 * @model type="FeatureCompletionModel.ArchitectureConstraints" containment="true"
	 * @generated
	 */
	EList getComponentConstraints();

	/**
	 * Returns the value of the '<em><b>Perimeter Requiring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perimeter Requiring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter Requiring</em>' containment reference.
	 * @see #setPerimeterRequiring(PerimeterRequiring)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getCompletionComponent_PerimeterRequiring()
	 * @model containment="true"
	 * @generated
	 */
	PerimeterRequiring getPerimeterRequiring();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.CompletionComponent#getPerimeterRequiring <em>Perimeter Requiring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter Requiring</em>' containment reference.
	 * @see #getPerimeterRequiring()
	 * @generated
	 */
	void setPerimeterRequiring(PerimeterRequiring value);

} // CompletionComponent
