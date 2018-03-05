/**
 */
package featureObjective;

import FeatureCompletionModel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.Constraint#getSource <em>Source</em>}</li>
 *   <li>{@link featureObjective.Constraint#getTarget <em>Target</em>}</li>
 *   <li>{@link featureObjective.Constraint#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see featureObjective.FeatureObjectivePackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see featureObjective.FeatureObjectivePackage#getConstraint_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link featureObjective.Constraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link featureObjective.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see featureObjective.FeatureObjectivePackage#getConstraint_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getTarget();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see featureObjective.FeatureObjectivePackage#getConstraint_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link featureObjective.Constraint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Constraint
