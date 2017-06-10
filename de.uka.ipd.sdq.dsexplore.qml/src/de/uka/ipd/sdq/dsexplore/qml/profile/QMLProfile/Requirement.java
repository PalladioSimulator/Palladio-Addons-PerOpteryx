/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A&nbsp;requirement&nbsp;refers&nbsp;to&nbsp;an usage model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement#getRequireContract <em>Require Contract</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Require Contract</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Contract</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Contract</em>' reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage#getRequirement_RequireContract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<GenericQMLContract> getRequireContract();

} // Requirement
