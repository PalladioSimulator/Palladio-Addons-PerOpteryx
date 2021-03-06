/**
 * generated by Xtext 2.10.0
 */
package org.palladiosimulator.qes.qualityEffectSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getTransformationType <em>Transformation Type</em>}</li>
 *   <li>{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getTransformationNumber <em>Transformation Number</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage#getNumericValue()
 * @model
 * @generated
 */
public interface NumericValue extends TransformationSpecification
{
  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see #setValueType(String)
   * @see org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage#getNumericValue_ValueType()
   * @model
   * @generated
   */
  String getValueType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see #getValueType()
   * @generated
   */
  void setValueType(String value);

  /**
   * Returns the value of the '<em><b>Transformation Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.palladiosimulator.qes.qualityEffectSpecification.TransformationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Type</em>' attribute.
   * @see org.palladiosimulator.qes.qualityEffectSpecification.TransformationType
   * @see #setTransformationType(TransformationType)
   * @see org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage#getNumericValue_TransformationType()
   * @model
   * @generated
   */
  TransformationType getTransformationType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getTransformationType <em>Transformation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation Type</em>' attribute.
   * @see org.palladiosimulator.qes.qualityEffectSpecification.TransformationType
   * @see #getTransformationType()
   * @generated
   */
  void setTransformationType(TransformationType value);

  /**
   * Returns the value of the '<em><b>Transformation Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Number</em>' attribute.
   * @see #setTransformationNumber(String)
   * @see org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage#getNumericValue_TransformationNumber()
   * @model
   * @generated
   */
  String getTransformationNumber();

  /**
   * Sets the value of the '{@link org.palladiosimulator.qes.qualityEffectSpecification.NumericValue#getTransformationNumber <em>Transformation Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation Number</em>' attribute.
   * @see #getTransformationNumber()
   * @generated
   */
  void setTransformationNumber(String value);

} // NumericValue
