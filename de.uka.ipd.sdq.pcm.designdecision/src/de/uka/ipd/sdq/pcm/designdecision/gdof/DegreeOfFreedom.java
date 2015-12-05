/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

import org.eclipse.emf.common.util.EList;
import de.uka.ipd.sdq.featuremodel.NamedElement;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Of Freedom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getPcmChangeableElementDescriptions <em>Pcm Changeable Element Descriptions</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getPcmPrimaryChangeable <em>Pcm Primary Changeable</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom()
 * @model
 * @generated
 */
public interface DegreeOfFreedom extends NamedElement, ADegreeOfFreedom {
	/**
	 * Returns the value of the '<em><b>Pcm Changeable Element Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Changeable Element Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Changeable Element Descriptions</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_PcmChangeableElementDescriptions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ChangeableElementDescription> getPcmChangeableElementDescriptions();

	/**
	 * Returns the value of the '<em><b>Pcm Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Primary Changeable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Primary Changeable</em>' reference.
	 * @see #setPcmPrimaryChangeable(ChangeableElementDescription)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDegreeOfFreedom_PcmPrimaryChangeable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChangeableElementDescription getPcmPrimaryChangeable();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom#getPcmPrimaryChangeable <em>Pcm Primary Changeable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Primary Changeable</em>' reference.
	 * @see #getPcmPrimaryChangeable()
	 * @generated
	 */
	void setPcmPrimaryChangeable(ChangeableElementDescription value);

} // DegreeOfFreedom
