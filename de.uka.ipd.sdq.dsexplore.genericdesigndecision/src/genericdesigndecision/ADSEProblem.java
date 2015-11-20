/**
 */
package genericdesigndecision;

import genericdesigndecision.universalDoF.AMetamodelDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADSE Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.ADSEProblem#getAssociatedMetamodel <em>Associated Metamodel</em>}</li>
 *   <li>{@link genericdesigndecision.ADSEProblem#getDecisionSpace <em>Decision Space</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem()
 * @model abstract="true"
 * @generated
 */
public interface ADSEProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Associated Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Metamodel</em>' reference.
	 * @see #setAssociatedMetamodel(AMetamodelDescription)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem_AssociatedMetamodel()
	 * @model required="true"
	 * @generated
	 */
	AMetamodelDescription getAssociatedMetamodel();

	/**
	 * Sets the value of the '{@link genericdesigndecision.ADSEProblem#getAssociatedMetamodel <em>Associated Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Metamodel</em>' reference.
	 * @see #getAssociatedMetamodel()
	 * @generated
	 */
	void setAssociatedMetamodel(AMetamodelDescription value);

	/**
	 * Returns the value of the '<em><b>Decision Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Space</em>' reference.
	 * @see #setDecisionSpace(DecisionSpace)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem_DecisionSpace()
	 * @model
	 * @generated
	 */
	DecisionSpace getDecisionSpace();

	/**
	 * Sets the value of the '{@link genericdesigndecision.ADSEProblem#getDecisionSpace <em>Decision Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Space</em>' reference.
	 * @see #getDecisionSpace()
	 * @generated
	 */
	void setDecisionSpace(DecisionSpace value);

} // ADSEProblem
