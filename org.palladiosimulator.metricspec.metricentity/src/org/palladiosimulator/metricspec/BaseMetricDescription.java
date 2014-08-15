/**
 */
package org.palladiosimulator.metricspec;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Base Metric Description</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> A one-dimensional metric description. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.BaseMetricDescription#getCaptureType <em>Capture Type
 * </em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.BaseMetricDescription#getDataType <em>Data Type</em>}
 * </li>
 * <li>{@link org.palladiosimulator.metricspec.BaseMetricDescription#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getBaseMetricDescription()
 * @model abstract="true"
 * @generated
 */
public interface BaseMetricDescription extends MetricDescription {
    /**
     * Returns the value of the '<em><b>Capture Type</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.metricspec.CaptureType}. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc -->
     * <p>
     * Determines the observable and capturable type for his metric.
     * </p>
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Capture Type</em>' attribute.
     * @see org.palladiosimulator.metricspec.CaptureType
     * @see #setCaptureType(CaptureType)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getBaseMetricDescription_CaptureType()
     * @model required="true" ordered="false"
     * @generated
     */
    CaptureType getCaptureType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getCaptureType
     * <em>Capture Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Capture Type</em>' attribute.
     * @see org.palladiosimulator.metricspec.CaptureType
     * @see #getCaptureType()
     * @generated
     */
    void setCaptureType(CaptureType value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.metricspec.DataType}. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Determines the kind of observable data for this
     * metric. E.g. if it contains quantitative or qualitative data. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see org.palladiosimulator.metricspec.DataType
     * @see #setDataType(DataType)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getBaseMetricDescription_DataType()
     * @model required="true" ordered="false"
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getDataType <em>Data Type</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Data Type</em>' attribute.
     * @see org.palladiosimulator.metricspec.DataType
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Scale</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.metricspec.Scale}. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Determines the mathematical scale of the metric.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Scale</em>' attribute.
     * @see org.palladiosimulator.metricspec.Scale
     * @see #setScale(Scale)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getBaseMetricDescription_Scale()
     * @model required="true" ordered="false"
     * @generated
     */
    Scale getScale();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getScale <em>Scale</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Scale</em>' attribute.
     * @see org.palladiosimulator.metricspec.Scale
     * @see #getScale()
     * @generated
     */
    void setScale(Scale value);

} // BaseMetricDescription
