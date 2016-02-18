/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ScaleLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage#getScaleLiteral()
 * @model TBounds="de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.ENumber"
 * @generated
 */
public interface ScaleLiteral<T extends Number> extends ValueLiteral, ENamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Number)
	 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage#getScaleLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ScaleLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

} // ScaleLiteral
