/**
 */
package org.palladiosimulator.metricspec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Metric Description Repository</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.MetricDescriptionRepository#getMetricDescriptions
 * <em>Metric Descriptions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getMetricDescriptionRepository()
 * @model
 * @generated
 */
public interface MetricDescriptionRepository extends EObject, Identifier {
    /**
     * Returns the value of the '<em><b>Metric Descriptions</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.metricspec.MetricDescription}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.metricspec.MetricDescription#getRepository <em>Repository</em>}
     * '. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metric Descriptions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Metric Descriptions</em>' containment reference list.
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getMetricDescriptionRepository_MetricDescriptions()
     * @see org.palladiosimulator.metricspec.MetricDescription#getRepository
     * @model opposite="repository" containment="true"
     * @generated
     */
    EList<MetricDescription> getMetricDescriptions();

} // MetricDescriptionRepository
