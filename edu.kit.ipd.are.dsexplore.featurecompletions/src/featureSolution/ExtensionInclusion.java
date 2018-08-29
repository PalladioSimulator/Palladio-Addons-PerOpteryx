/**
 */
package featureSolution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.ExtensionInclusion#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.ExtensionInclusion#getAdvice <em>Advice</em>}</li>
 *   <li>{@link featureSolution.ExtensionInclusion#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion()
 * @model
 * @generated
 */
public interface ExtensionInclusion extends InclusionMechanism {
	/**
	 * Returns the value of the '<em><b>Point Cut</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.PointCut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Cut</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Cut</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion_PointCut()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointCut> getPointCut();

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.Advice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion_Advice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Advice> getAdvice();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link featureSolution.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see featureSolution.FeatureSolutionPackage#getExtensionInclusion_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // ExtensionInclusion
