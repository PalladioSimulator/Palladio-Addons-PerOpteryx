/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.SetLiteral#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage#getSetLiteral()
 * @model
 * @generated
 */
public interface SetLiteral extends ValueLiteral {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage#getSetLiteral_Values()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Element> getValues();

} // SetLiteral
