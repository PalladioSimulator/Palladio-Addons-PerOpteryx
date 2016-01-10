/**
 */
package genericdesigndecision.genericDoF;

import genericdesigndecision.Choice;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADegree Of Freedom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getAddedElements <em>Added Elements</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElementDescriptions <em>Changeable Element Descriptions</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getInteractionConstraints <em>Interaction Constraints</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChanged <em>Primary Changed</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElements <em>Changeable Elements</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom()
 * @model abstract="true"
 * @generated
 */
public interface ADegreeOfFreedom extends EObject {
	/**
	 * Returns the value of the '<em><b>Added Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Elements</em>' reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_AddedElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EClass> getAddedElements();

	/**
	 * Returns the value of the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link genericdesigndecision.genericDoF.ChangeableElementDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Element Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Element Descriptions</em>' containment reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_ChangeableElementDescriptions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ChangeableElementDescription> getChangeableElementDescriptions();

	/**
	 * Returns the value of the '<em><b>Interaction Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Constraints</em>' reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_InteractionConstraints()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EOperation> getInteractionConstraints();

	/**
	 * Returns the value of the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Changeable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Changeable</em>' reference.
	 * @see #setPrimaryChangeable(ChangeableElementDescription)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_PrimaryChangeable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChangeableElementDescription getPrimaryChangeable();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Changeable</em>' reference.
	 * @see #getPrimaryChangeable()
	 * @generated
	 */
	void setPrimaryChangeable(ChangeableElementDescription value);

	/**
	 * Returns the value of the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Changed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Changed</em>' reference.
	 * @see #setPrimaryChanged(EObject)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_PrimaryChanged()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getPrimaryChanged();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChanged <em>Primary Changed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Changed</em>' reference.
	 * @see #getPrimaryChanged()
	 * @generated
	 */
	void setPrimaryChanged(EObject value);

	/**
	 * Returns the value of the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Elements</em>' reference.
	 * @see #setChangeableElements(EObject)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADegreeOfFreedom_ChangeableElements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getChangeableElements();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElements <em>Changeable Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Elements</em>' reference.
	 * @see #getChangeableElements()
	 * @generated
	 */
	void setChangeableElements(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice createRandomChoice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice determineInitialChoice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice createChoice();
	
	String getDegreeDescription();

} // ADegreeOfFreedom
