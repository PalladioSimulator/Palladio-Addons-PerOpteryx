/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;
import org.palladiosimulator.metricspec.Scale;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MetricSpecFactoryImpl extends EFactoryImpl implements MetricSpecFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static MetricSpecFactory init() {
        try {
            MetricSpecFactory theMetricSpecFactory = (MetricSpecFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MetricSpecPackage.eNS_URI);
            if (theMetricSpecFactory != null) {
                return theMetricSpecFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MetricSpecFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricSpecFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MetricSpecPackage.IDENTIFIER:
            return createIdentifier();
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION:
            return createTextualBaseMetricDescription();
        case MetricSpecPackage.AGGREGATION_FUNCTION_DESCRIPTION:
            return createAggregationFunctionDescription();
        case MetricSpecPackage.METRIC_SET_DESCRIPTION:
            return createMetricSetDescription();
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION:
            return createNumericalBaseMetricDescription();
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY:
            return createMetricDescriptionRepository();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case MetricSpecPackage.CAPTURE_TYPE:
            return createCaptureTypeFromString(eDataType, initialValue);
        case MetricSpecPackage.SCALE:
            return createScaleFromString(eDataType, initialValue);
        case MetricSpecPackage.PERSISTENCE_KIND_OPTIONS:
            return createPersistenceKindOptionsFromString(eDataType, initialValue);
        case MetricSpecPackage.DATA_TYPE:
            return createDataTypeFromString(eDataType, initialValue);
        case MetricSpecPackage.EJS_UNIT:
            return createEJSUnitFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case MetricSpecPackage.CAPTURE_TYPE:
            return convertCaptureTypeToString(eDataType, instanceValue);
        case MetricSpecPackage.SCALE:
            return convertScaleToString(eDataType, instanceValue);
        case MetricSpecPackage.PERSISTENCE_KIND_OPTIONS:
            return convertPersistenceKindOptionsToString(eDataType, instanceValue);
        case MetricSpecPackage.DATA_TYPE:
            return convertDataTypeToString(eDataType, instanceValue);
        case MetricSpecPackage.EJS_UNIT:
            return convertEJSUnitToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Identifier createIdentifier() {
        IdentifierImpl identifier = new IdentifierImpl();
        return identifier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TextualBaseMetricDescription createTextualBaseMetricDescription() {
        TextualBaseMetricDescriptionImpl textualBaseMetricDescription = new TextualBaseMetricDescriptionImpl();
        return textualBaseMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AggregationFunctionDescription createAggregationFunctionDescription() {
        AggregationFunctionDescriptionImpl aggregationFunctionDescription = new AggregationFunctionDescriptionImpl();
        return aggregationFunctionDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricSetDescription createMetricSetDescription() {
        MetricSetDescriptionImpl metricSetDescription = new MetricSetDescriptionImpl();
        return metricSetDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NumericalBaseMetricDescription createNumericalBaseMetricDescription() {
        NumericalBaseMetricDescriptionImpl numericalBaseMetricDescription = new NumericalBaseMetricDescriptionImpl();
        return numericalBaseMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricDescriptionRepository createMetricDescriptionRepository() {
        MetricDescriptionRepositoryImpl metricDescriptionRepository = new MetricDescriptionRepositoryImpl();
        return metricDescriptionRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CaptureType createCaptureTypeFromString(EDataType eDataType, String initialValue) {
        CaptureType result = CaptureType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertCaptureTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Scale createScaleFromString(EDataType eDataType, String initialValue) {
        Scale result = Scale.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertScaleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersistenceKindOptions createPersistenceKindOptionsFromString(EDataType eDataType, String initialValue) {
        PersistenceKindOptions result = PersistenceKindOptions.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertPersistenceKindOptionsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
        DataType result = DataType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Unit<?> createEJSUnitFromString(EDataType eDataType, String initialValue) {
        return (Unit<?>) super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEJSUnitToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricSpecPackage getMetricSpecPackage() {
        return (MetricSpecPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MetricSpecPackage getPackage() {
        return MetricSpecPackage.eINSTANCE;
    }

} // MetricSpecFactoryImpl
