/**
 */
package genericdesigndecision;

import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Problem represents the optimisation problem definition. It contains the DegreeOfFreedoms that make up this optimisation problem. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.DecisionSpace#getDofInstances <em>Dof Instances</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.GenericdesigndecisionPackage#getDecisionSpace()
 * @model
 * @generated
 */
public interface DecisionSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Dof Instances</b></em>' containment reference list.
	 * The list contents are of type {@link genericdesigndecision.genericDoF.ADegreeOfFreedom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dof Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dof Instances</em>' containment reference list.
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getDecisionSpace_DofInstances()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ADegreeOfFreedom> getDofInstances();

} // DecisionSpace
