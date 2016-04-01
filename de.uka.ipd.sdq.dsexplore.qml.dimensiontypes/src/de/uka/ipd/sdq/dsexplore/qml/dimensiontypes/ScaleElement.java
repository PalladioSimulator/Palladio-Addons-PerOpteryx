/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Element</b></em>'.
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
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getScaleElement()
 * @model TBounds="de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ENumber"
 * @generated
 */
public interface ScaleElement<T extends Number> extends Element {
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
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getScaleElement_Value()
	 * @model
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
	 * @see #setScale(EScaleOfMeasure)
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getScaleElement_Scale()
	 * @model required="true"
	 * @generated
	 */
	EScaleOfMeasure getScale();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
	 * @see #getScale()
	 * @generated
	 */
	void setScale(EScaleOfMeasure value);

} // ScaleElement
