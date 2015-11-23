/**
 */
package genericdesigndecision;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;

import genericdesigndecision.universalDoF.AMetamodelDescription;
import org.eclipse.emf.ecore.EModelElement;
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
 *   <li>{@link genericdesigndecision.ADSEProblem#getProblem <em>Problem</em>}</li>
 *   <li>{@link genericdesigndecision.ADSEProblem#getEmfInstance <em>Emf Instance</em>}</li>
 *   <li>{@link genericdesigndecision.ADSEProblem#getAssociatedMetamodel <em>Associated Metamodel</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem()
 * @model abstract="true" superTypes="genericdesigndecision.DSEProblem"
 * @generated
 */
public interface ADSEProblem extends EObject, DSEProblem {
	/**
	 * Returns the value of the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' reference.
	 * @see #setProblem(DecisionSpace)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem_Problem()
	 * @model required="true"
	 * @generated
	 */
	DecisionSpace getProblem();

	/**
	 * Sets the value of the '{@link genericdesigndecision.ADSEProblem#getProblem <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' reference.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(DecisionSpace value);

	/**
	 * Returns the value of the '<em><b>Emf Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Instance</em>' reference.
	 * @see #setEmfInstance(EModelElement)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getADSEProblem_EmfInstance()
	 * @model required="true"
	 * @generated
	 */
	EModelElement getEmfInstance();

	/**
	 * Sets the value of the '{@link genericdesigndecision.ADSEProblem#getEmfInstance <em>Emf Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emf Instance</em>' reference.
	 * @see #getEmfInstance()
	 * @generated
	 */
	void setEmfInstance(EModelElement value);

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

} // ADSEProblem
