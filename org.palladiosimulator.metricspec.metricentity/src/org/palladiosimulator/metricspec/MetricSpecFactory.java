/**
 */
package org.palladiosimulator.metricspec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage
 * @generated
 */
public interface MetricSpecFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MetricSpecFactory eINSTANCE = org.palladiosimulator.metricspec.impl.MetricSpecFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Identifier</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Identifier</em>'.
     * @generated
     */
    Identifier createIdentifier();

    /**
     * Returns a new object of class '<em>Textual Base Metric Description</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Textual Base Metric Description</em>'.
     * @generated
     */
    TextualBaseMetricDescription createTextualBaseMetricDescription();

    /**
     * Returns a new object of class '<em>Aggregation Function Description</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Aggregation Function Description</em>'.
     * @generated
     */
    AggregationFunctionDescription createAggregationFunctionDescription();

    /**
     * Returns a new object of class '<em>Metric Set Description</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Metric Set Description</em>'.
     * @generated
     */
    MetricSetDescription createMetricSetDescription();

    /**
     * Returns a new object of class '<em>Numerical Base Metric Description</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Numerical Base Metric Description</em>'.
     * @generated
     */
    NumericalBaseMetricDescription createNumericalBaseMetricDescription();

    /**
     * Returns a new object of class '<em>Metric Description Repository</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Metric Description Repository</em>'.
     * @generated
     */
    MetricDescriptionRepository createMetricDescriptionRepository();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    MetricSpecPackage getMetricSpecPackage();

} // MetricSpecFactory
