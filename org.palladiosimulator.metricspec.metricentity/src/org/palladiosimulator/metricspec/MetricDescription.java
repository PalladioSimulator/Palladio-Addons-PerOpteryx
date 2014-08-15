/**
 */
package org.palladiosimulator.metricspec;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Metric Description</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.MetricDescription#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getMetricDescription()
 * @model abstract="true"
 * @generated
 */
public interface MetricDescription extends Description {

    /**
     * Returns the value of the '<em><b>Repository</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.metricspec.MetricDescriptionRepository#getMetricDescriptions
     * <em>Metric Descriptions</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository</em>' container reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Repository</em>' container reference.
     * @see #setRepository(MetricDescriptionRepository)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getMetricDescription_Repository()
     * @see org.palladiosimulator.metricspec.MetricDescriptionRepository#getMetricDescriptions
     * @model opposite="metricDescriptions" required="true" transient="false"
     * @generated
     */
    MetricDescriptionRepository getRepository();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.MetricDescription#getRepository <em>Repository</em>}'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Repository</em>' container reference.
     * @see #getRepository()
     * @generated
     */
    void setRepository(MetricDescriptionRepository value);
} // MetricDescription
