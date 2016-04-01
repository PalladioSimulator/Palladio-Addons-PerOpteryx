/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type Scale</b></em>'.
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
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScaleElements <em>Scale Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeScale()
 * @model TBounds="de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ENumber"
 * @generated
 */
public interface DimensionTypeScale<T extends Number> extends DimensionType {
	/**
	 * Returns the value of the '<em><b>Scale Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Elements</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeScale_ScaleElements()
	 * @model kind="reference" containment="true" required="true"
	 * @generated
	 */
	EList<T> getScaleElements();

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
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeScale_Scale()
	 * @model required="true"
	 * @generated
	 */
	EScaleOfMeasure getScale();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
	 * @see #getScale()
	 * @generated
	 */
	void setScale(EScaleOfMeasure value);

} // DimensionTypeScale
