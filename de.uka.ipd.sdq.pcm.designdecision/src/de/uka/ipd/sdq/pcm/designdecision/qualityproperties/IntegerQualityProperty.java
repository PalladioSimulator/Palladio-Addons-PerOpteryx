/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage#getIntegerQualityProperty()
 * @model
 * @generated
 */
public interface IntegerQualityProperty extends NumericQualityProperty {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage#getIntegerQualityProperty_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // IntegerQualityProperty
