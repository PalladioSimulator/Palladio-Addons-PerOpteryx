/**
 */
package org.palladiosimulator.metricspec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Textual Base Metric Description</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> self.captureType = CaptureType::Identifier <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.TextualBaseMetricDescription#getIdentifiers <em>
 * Identifiers</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getTextualBaseMetricDescription()
 * @model
 * @generated
 */
public interface TextualBaseMetricDescription extends BaseMetricDescription {
    /**
     * Returns the value of the '<em><b>Identifiers</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.metricspec.Identifier}. It is bidirectional
     * and its opposite is '
     * {@link org.palladiosimulator.metricspec.Identifier#getTextualBaseMetricDescription
     * <em>Textual Base Metric Description</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identifiers</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Identifiers</em>' containment reference list.
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getTextualBaseMetricDescription_Identifiers()
     * @see org.palladiosimulator.metricspec.Identifier#getTextualBaseMetricDescription
     * @model opposite="textualBaseMetricDescription" containment="true" required="true"
     *        ordered="false"
     * @generated
     */
    EList<Identifier> getIdentifiers();

} // TextualBaseMetricDescription
