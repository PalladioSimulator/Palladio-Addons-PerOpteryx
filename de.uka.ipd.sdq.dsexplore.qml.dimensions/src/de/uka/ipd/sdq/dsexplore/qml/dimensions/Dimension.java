/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;

import de.uka.ipd.sdq.dsexplore.qml.units.Unit;

import de.uka.ipd.sdq.identifier.Identifier;

import namedelement.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dimensions characterize atomic QoS&nbsp;aspects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getType <em>Type</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends Identifier, NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DimensionType)
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#getDimension_Type()
	 * @model required="true"
	 * @generated
	 */
	DimensionType getType();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DimensionType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#getDimension_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Dimension
