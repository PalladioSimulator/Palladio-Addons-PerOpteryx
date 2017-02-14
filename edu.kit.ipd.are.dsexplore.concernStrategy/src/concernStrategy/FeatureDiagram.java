/**
 */
package concernStrategy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.FeatureDiagram#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link concernStrategy.FeatureDiagram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link concernStrategy.FeatureDiagram#getAnnotatableElement <em>Annotatable Element</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getFeatureDiagram()
 * @model
 * @generated
 */
public interface FeatureDiagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(Feature)
	 * @see concernStrategy.StrategymodelPackage#getFeatureDiagram_RootFeature()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link concernStrategy.FeatureDiagram#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link concernStrategy.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see concernStrategy.StrategymodelPackage#getFeatureDiagram_Constraints()
	 * @model type="concernStrategy.Constraint" containment="true" ordered="false"
	 * @generated
	 */
	EList getConstraints();

	/**
	 * Returns the value of the '<em><b>Annotatable Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotatable Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotatable Element</em>' reference list.
	 * @see concernStrategy.StrategymodelPackage#getFeatureDiagram_AnnotatableElement()
	 * @model type="org.eclipse.emf.ecore.EObject" ordered="false"
	 * @generated
	 */
	EList getAnnotatableElement();

} // FeatureDiagram
