/**
 */
package org.palladiosimulator.metricspec.util;

import javax.measure.quantity.Quantity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecPackage
 * @generated
 */
public class MetricSpecSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static MetricSpecPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricSpecSwitch() {
        if (modelPackage == null) {
            modelPackage = MetricSpecPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case MetricSpecPackage.IDENTIFIER: {
            Identifier identifier = (Identifier) theEObject;
            T result = caseIdentifier(identifier);
            if (result == null)
                result = caseIdentifier_Identifier(identifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION: {
            TextualBaseMetricDescription textualBaseMetricDescription = (TextualBaseMetricDescription) theEObject;
            T result = caseTextualBaseMetricDescription(textualBaseMetricDescription);
            if (result == null)
                result = caseBaseMetricDescription(textualBaseMetricDescription);
            if (result == null)
                result = caseMetricDescription(textualBaseMetricDescription);
            if (result == null)
                result = caseDescription(textualBaseMetricDescription);
            if (result == null)
                result = caseIdentifier_Identifier(textualBaseMetricDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION: {
            BaseMetricDescription baseMetricDescription = (BaseMetricDescription) theEObject;
            T result = caseBaseMetricDescription(baseMetricDescription);
            if (result == null)
                result = caseMetricDescription(baseMetricDescription);
            if (result == null)
                result = caseDescription(baseMetricDescription);
            if (result == null)
                result = caseIdentifier_Identifier(baseMetricDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.METRIC_DESCRIPTION: {
            MetricDescription metricDescription = (MetricDescription) theEObject;
            T result = caseMetricDescription(metricDescription);
            if (result == null)
                result = caseDescription(metricDescription);
            if (result == null)
                result = caseIdentifier_Identifier(metricDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.DESCRIPTION: {
            Description description = (Description) theEObject;
            T result = caseDescription(description);
            if (result == null)
                result = caseIdentifier_Identifier(description);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.AGGREGATION_FUNCTION_DESCRIPTION: {
            AggregationFunctionDescription aggregationFunctionDescription = (AggregationFunctionDescription) theEObject;
            T result = caseAggregationFunctionDescription(aggregationFunctionDescription);
            if (result == null)
                result = caseDescription(aggregationFunctionDescription);
            if (result == null)
                result = caseIdentifier_Identifier(aggregationFunctionDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.METRIC_SET_DESCRIPTION: {
            MetricSetDescription metricSetDescription = (MetricSetDescription) theEObject;
            T result = caseMetricSetDescription(metricSetDescription);
            if (result == null)
                result = caseMetricDescription(metricSetDescription);
            if (result == null)
                result = caseDescription(metricSetDescription);
            if (result == null)
                result = caseIdentifier_Identifier(metricSetDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION: {
            NumericalBaseMetricDescription numericalBaseMetricDescription = (NumericalBaseMetricDescription) theEObject;
            T result = caseNumericalBaseMetricDescription(numericalBaseMetricDescription);
            if (result == null)
                result = caseBaseMetricDescription(numericalBaseMetricDescription);
            if (result == null)
                result = caseMetricDescription(numericalBaseMetricDescription);
            if (result == null)
                result = caseDescription(numericalBaseMetricDescription);
            if (result == null)
                result = caseIdentifier_Identifier(numericalBaseMetricDescription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.IJS_QUANTITY: {
            Quantity ijsQuantity = (Quantity) theEObject;
            T result = caseIJSQuantity(ijsQuantity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY: {
            MetricDescriptionRepository metricDescriptionRepository = (MetricDescriptionRepository) theEObject;
            T result = caseMetricDescriptionRepository(metricDescriptionRepository);
            if (result == null)
                result = caseIdentifier_Identifier(metricDescriptionRepository);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Textual Base Metric Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Textual Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualBaseMetricDescription(TextualBaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Base Metric Description</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseMetricDescription(BaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metric Description</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metric Description</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricDescription(MetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescription(Description object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregation Function Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregation Function Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregationFunctionDescription(AggregationFunctionDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Metric Set Description</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Metric Set Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricSetDescription(MetricSetDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Base Metric Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalBaseMetricDescription(NumericalBaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IJS Quantity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IJS Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIJSQuantity(Quantity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Metric Description Repository</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Metric Description Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricDescriptionRepository(MetricDescriptionRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier_Identifier(de.uka.ipd.sdq.identifier.Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} // MetricSpecSwitch
