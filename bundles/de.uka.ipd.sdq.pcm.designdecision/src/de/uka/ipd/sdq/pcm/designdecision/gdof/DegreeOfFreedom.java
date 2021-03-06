/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import de.uka.ipd.sdq.featuremodel.NamedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Degree Of Freedom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getAddedElements <em>Added Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getChangeableElementDescriptions <em>Changeable Element Descriptions</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getInteractionConstraints <em>Interaction Constraints</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getRequiredDecoratorModel <em>Required Decorator Model</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom()
 * @model
 * @generated
 */
public interface DegreeOfFreedom extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Added Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Elements</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Elements</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_AddedElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EClass> getAddedElements();

	/**
	 * Returns the value of the '<em><b>Changeable Element Descriptions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Element Descriptions</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Changeable Element Descriptions</em>' containment reference
	 *         list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_ChangeableElementDescriptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ChangeableElementDescription> getChangeableElementDescriptions();

	/**
	 * Returns the value of the '<em><b>Interaction Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Constraints</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Constraints</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_InteractionConstraints()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EOperation> getInteractionConstraints();

	/**
	 * Returns the value of the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Primary Changeable</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Changeable</em>' reference.
	 * @see #setPrimaryChangeable(ChangeableElementDescription)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_PrimaryChangeable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChangeableElementDescription getPrimaryChangeable();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Changeable</em>' reference.
	 * @see #getPrimaryChangeable()
	 * @generated
	 */
	void setPrimaryChangeable(ChangeableElementDescription value);

	/**
	 * Returns the value of the '<em><b>Required Decorator Model</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Decorator Model</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Decorator Model</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_RequiredDecoratorModel()
	 * @model
	 * @generated
	 */
	EList<DecoratorModelDescription> getRequiredDecoratorModel();

} // DegreeOfFreedom
