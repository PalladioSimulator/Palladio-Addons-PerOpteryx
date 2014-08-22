/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import de.uka.ipd.sdq.pcm.core.entity.NamedElement;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Of Freedom Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each degree of freedom of the system architecture can be represented by a DegreeOfFreedom element. Each DegreeOfFreedom has two parts: It links a model element that is the changeable entity in this DegreeOfFreedom, and it specifies a domain of possible values that the model element can take. 
 * 
 * The domain is defined in subclasses, because it may be either a set of PCM Entities (in the EnumerationDegree) or integer or double ranges (in the RangeDegree and its subclasses). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance#getPrimaryChanged <em>Primary Changed</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance#getDof <em>Dof</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance#getChangeableElements <em>Changeable Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getDegreeOfFreedomInstance()
 * @model
 * @generated
 */
public interface DegreeOfFreedomInstance extends EObject, NamedElement {
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
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getDegreeOfFreedomInstance_PrimaryChanged()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getPrimaryChanged();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance#getPrimaryChanged <em>Primary Changed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Changed</em>' reference.
	 * @see #getPrimaryChanged()
	 * @generated
	 */
	void setPrimaryChanged(EObject value);

	/**
	 * Returns the value of the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dof</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dof</em>' reference.
	 * @see #setDof(DegreeOfFreedom)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getDegreeOfFreedomInstance_Dof()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DegreeOfFreedom getDof();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance#getDof <em>Dof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dof</em>' reference.
	 * @see #getDof()
	 * @generated
	 */
	void setDof(DegreeOfFreedom value);

	/**
	 * Returns the value of the '<em><b>Changeable Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Elements</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getDegreeOfFreedomInstance_ChangeableElements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getChangeableElements();

} // DegreeOfFreedomInstance
