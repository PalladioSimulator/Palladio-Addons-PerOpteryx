/**
 */
package featureSolution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.BehaviourInclusion#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.BehaviourInclusion#getAdvice <em>Advice</em>}</li>
 *   <li>{@link featureSolution.BehaviourInclusion#getImports <em>Imports</em>}</li>
 *   <li>{@link featureSolution.BehaviourInclusion#getFeatureCompletion <em>Feature Completion</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getBehaviourInclusion()
 * @model
 * @generated
 */
public interface BehaviourInclusion extends InclusionMechanism {
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
	 * @see featureSolution.FeatureSolutionPackage#getBehaviourInclusion_PointCut()
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
	 * @see featureSolution.FeatureSolutionPackage#getBehaviourInclusion_Advice()
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
	 * @see featureSolution.FeatureSolutionPackage#getBehaviourInclusion_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Feature Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Completion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Completion</em>' containment reference.
	 * @see #setFeatureCompletion(FeatureSelection)
	 * @see featureSolution.FeatureSolutionPackage#getBehaviourInclusion_FeatureCompletion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureSelection getFeatureCompletion();

	/**
	 * Sets the value of the '{@link featureSolution.BehaviourInclusion#getFeatureCompletion <em>Feature Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Completion</em>' containment reference.
	 * @see #getFeatureCompletion()
	 * @generated
	 */
	void setFeatureCompletion(FeatureSelection value);

} // BehaviourInclusion
