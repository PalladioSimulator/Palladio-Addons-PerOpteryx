/**
 */
package org.palladiosimulator.metricspec;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Numerical Base Metric Description</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> self.captureType <> CaptureType::Identifier <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getDefaultUnit <em>
 * Default Unit</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getPersistenceKind
 * <em>Persistence Kind</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getNumericalBaseMetricDescription()
 * @model
 * @generated
 */
public interface NumericalBaseMetricDescription extends BaseMetricDescription {
    /**
     * Returns the value of the '<em><b>Default Unit</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The default unit to use for the measurements.
     * Please note that there&nbsp;is&nbsp;no&nbsp;unit&nbsp;for&nbsp;NominalMeasurements. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Default Unit</em>' attribute.
     * @see #setDefaultUnit(Unit)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getNumericalBaseMetricDescription_DefaultUnit()
     * @model dataType=
     *        "org.palladiosimulator.metricspec.EJSUnit<org.palladiosimulator.metricspec.IJSQuantity>"
     *        ordered="false"
     * @generated
     */
    Unit<Quantity> getDefaultUnit();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getDefaultUnit
     * <em>Default Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Default Unit</em>' attribute.
     * @see #getDefaultUnit()
     * @generated
     */
    void setDefaultUnit(Unit<Quantity> value);

    /**
     * Returns the value of the '<em><b>Persistence Kind</b></em>' attribute. The literals are from
     * the enumeration {@link org.palladiosimulator.metricspec.PersistenceKindOptions}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistence Kind</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Persistence Kind</em>' attribute.
     * @see org.palladiosimulator.metricspec.PersistenceKindOptions
     * @see #setPersistenceKind(PersistenceKindOptions)
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#getNumericalBaseMetricDescription_PersistenceKind()
     * @model required="true" ordered="false"
     * @generated
     */
    PersistenceKindOptions getPersistenceKind();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getPersistenceKind
     * <em>Persistence Kind</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Persistence Kind</em>' attribute.
     * @see org.palladiosimulator.metricspec.PersistenceKindOptions
     * @see #getPersistenceKind()
     * @generated
     */
    void setPersistenceKind(PersistenceKindOptions value);

} // NumericalBaseMetricDescription
