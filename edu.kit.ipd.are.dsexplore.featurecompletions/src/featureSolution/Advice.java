/**
 */
package featureSolution;

import FeatureCompletionModel.PlacementPolicy;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.Advice#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.Advice#getAppears <em>Appears</em>}</li>
 *   <li>{@link featureSolution.Advice#getPlacementPolicy <em>Placement Policy</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getAdvice()
 * @model
 * @generated
 */
public interface Advice extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Cut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Cut</em>' reference.
	 * @see #setPointCut(PointCut)
	 * @see featureSolution.FeatureSolutionPackage#getAdvice_PointCut()
	 * @model
	 * @generated
	 */
	PointCut getPointCut();

	/**
	 * Sets the value of the '{@link featureSolution.Advice#getPointCut <em>Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Cut</em>' reference.
	 * @see #getPointCut()
	 * @generated
	 */
	void setPointCut(PointCut value);

	/**
	 * Returns the value of the '<em><b>Appears</b></em>' attribute.
	 * The default value is <code>"BEFORE"</code>.
	 * The literals are from the enumeration {@link featureSolution.Appearance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appears</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appears</em>' attribute.
	 * @see featureSolution.Appearance
	 * @see #setAppears(Appearance)
	 * @see featureSolution.FeatureSolutionPackage#getAdvice_Appears()
	 * @model default="BEFORE" required="true"
	 * @generated
	 */
	Appearance getAppears();

	/**
	 * Sets the value of the '{@link featureSolution.Advice#getAppears <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appears</em>' attribute.
	 * @see featureSolution.Appearance
	 * @see #getAppears()
	 * @generated
	 */
	void setAppears(Appearance value);

	/**
	 * Returns the value of the '<em><b>Placement Policy</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link FeatureCompletionModel.PlacementPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Policy</em>' attribute.
	 * @see FeatureCompletionModel.PlacementPolicy
	 * @see #setPlacementPolicy(PlacementPolicy)
	 * @see featureSolution.FeatureSolutionPackage#getAdvice_PlacementPolicy()
	 * @model default="MANDATORY" required="true"
	 * @generated
	 */
	PlacementPolicy getPlacementPolicy();

	/**
	 * Sets the value of the '{@link featureSolution.Advice#getPlacementPolicy <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Policy</em>' attribute.
	 * @see FeatureCompletionModel.PlacementPolicy
	 * @see #getPlacementPolicy()
	 * @generated
	 */
	void setPlacementPolicy(PlacementPolicy value);

} // Advice
