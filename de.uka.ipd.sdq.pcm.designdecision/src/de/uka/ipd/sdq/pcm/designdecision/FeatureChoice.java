/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FeatureChoice represents a choice for a FeatureDegree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice#isPresent <em>Present</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getFeatureChoice()
 * @model
 * @generated
 */
public interface FeatureChoice extends Choice {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Feature shall be active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getFeatureChoice_Selected()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Feature is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Present</em>' attribute.
	 * @see #setPresent(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getFeatureChoice_Present()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isPresent();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.FeatureChoice#isPresent <em>Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Present</em>' attribute.
	 * @see #isPresent()
	 * @generated
	 */
	void setPresent(boolean value);

} // FeatureChoice
