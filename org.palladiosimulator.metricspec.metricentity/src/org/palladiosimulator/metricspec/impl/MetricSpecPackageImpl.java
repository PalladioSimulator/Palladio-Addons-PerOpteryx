/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;
import org.palladiosimulator.metricspec.Scale;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MetricSpecPackageImpl extends EPackageImpl implements MetricSpecPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass identifierEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass textualBaseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass baseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass metricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass descriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass aggregationFunctionDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass metricSetDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalBaseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass ijsQuantityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass metricDescriptionRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum captureTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum scaleEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum persistenceKindOptionsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum dataTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType ejsUnitEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MetricSpecPackageImpl() {
        super(eNS_URI, MetricSpecFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link MetricSpecPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MetricSpecPackage init() {
        if (isInited)
            return (MetricSpecPackage) EPackage.Registry.INSTANCE.getEPackage(MetricSpecPackage.eNS_URI);

        // Obtain or create and register package
        MetricSpecPackageImpl theMetricSpecPackage = (MetricSpecPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricSpecPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new MetricSpecPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMetricSpecPackage.createPackageContents();

        // Initialize created meta-data
        theMetricSpecPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMetricSpecPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MetricSpecPackage.eNS_URI, theMetricSpecPackage);
        return theMetricSpecPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getIdentifier() {
        return identifierEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getIdentifier_Literal() {
        return (EAttribute) identifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getIdentifier_TextualBaseMetricDescription() {
        return (EReference) identifierEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getTextualBaseMetricDescription() {
        return textualBaseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getTextualBaseMetricDescription_Identifiers() {
        return (EReference) textualBaseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getBaseMetricDescription() {
        return baseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getBaseMetricDescription_CaptureType() {
        return (EAttribute) baseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getBaseMetricDescription_DataType() {
        return (EAttribute) baseMetricDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getBaseMetricDescription_Scale() {
        return (EAttribute) baseMetricDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getMetricDescription() {
        return metricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getMetricDescription_Repository() {
        return (EReference) metricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getDescription() {
        return descriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getDescription_Name() {
        return (EAttribute) descriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getDescription_TextualDescription() {
        return (EAttribute) descriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getAggregationFunctionDescription() {
        return aggregationFunctionDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getMetricSetDescription() {
        return metricSetDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getMetricSetDescription_SubsumedMetrics() {
        return (EReference) metricSetDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getNumericalBaseMetricDescription() {
        return numericalBaseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getNumericalBaseMetricDescription_DefaultUnit() {
        return (EAttribute) numericalBaseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getNumericalBaseMetricDescription_PersistenceKind() {
        return (EAttribute) numericalBaseMetricDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getIJSQuantity() {
        return ijsQuantityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getMetricDescriptionRepository() {
        return metricDescriptionRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getMetricDescriptionRepository_MetricDescriptions() {
        return (EReference) metricDescriptionRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EEnum getCaptureType() {
        return captureTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EEnum getScale() {
        return scaleEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EEnum getPersistenceKindOptions() {
        return persistenceKindOptionsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EEnum getDataType() {
        return dataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EDataType getEJSUnit() {
        return ejsUnitEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricSpecFactory getMetricSpecFactory() {
        return (MetricSpecFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        identifierEClass = createEClass(IDENTIFIER);
        createEAttribute(identifierEClass, IDENTIFIER__LITERAL);
        createEReference(identifierEClass, IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION);

        textualBaseMetricDescriptionEClass = createEClass(TEXTUAL_BASE_METRIC_DESCRIPTION);
        createEReference(textualBaseMetricDescriptionEClass, TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS);

        baseMetricDescriptionEClass = createEClass(BASE_METRIC_DESCRIPTION);
        createEAttribute(baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__CAPTURE_TYPE);
        createEAttribute(baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__DATA_TYPE);
        createEAttribute(baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__SCALE);

        metricDescriptionEClass = createEClass(METRIC_DESCRIPTION);
        createEReference(metricDescriptionEClass, METRIC_DESCRIPTION__REPOSITORY);

        descriptionEClass = createEClass(DESCRIPTION);
        createEAttribute(descriptionEClass, DESCRIPTION__NAME);
        createEAttribute(descriptionEClass, DESCRIPTION__TEXTUAL_DESCRIPTION);

        aggregationFunctionDescriptionEClass = createEClass(AGGREGATION_FUNCTION_DESCRIPTION);

        metricSetDescriptionEClass = createEClass(METRIC_SET_DESCRIPTION);
        createEReference(metricSetDescriptionEClass, METRIC_SET_DESCRIPTION__SUBSUMED_METRICS);

        numericalBaseMetricDescriptionEClass = createEClass(NUMERICAL_BASE_METRIC_DESCRIPTION);
        createEAttribute(numericalBaseMetricDescriptionEClass, NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT);
        createEAttribute(numericalBaseMetricDescriptionEClass, NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND);

        ijsQuantityEClass = createEClass(IJS_QUANTITY);

        metricDescriptionRepositoryEClass = createEClass(METRIC_DESCRIPTION_REPOSITORY);
        createEReference(metricDescriptionRepositoryEClass, METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS);

        // Create enums
        captureTypeEEnum = createEEnum(CAPTURE_TYPE);
        scaleEEnum = createEEnum(SCALE);
        persistenceKindOptionsEEnum = createEEnum(PERSISTENCE_KIND_OPTIONS);
        dataTypeEEnum = createEEnum(DATA_TYPE);

        // Create data types
        ejsUnitEDataType = createEDataType(EJS_UNIT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);

        // Create type parameters
        ETypeParameter ejsUnitEDataType_Q = addETypeParameter(ejsUnitEDataType, "Q");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(this.getIJSQuantity());
        ejsUnitEDataType_Q.getEBounds().add(g1);

        // Add supertypes to classes
        identifierEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        textualBaseMetricDescriptionEClass.getESuperTypes().add(this.getBaseMetricDescription());
        baseMetricDescriptionEClass.getESuperTypes().add(this.getMetricDescription());
        metricDescriptionEClass.getESuperTypes().add(this.getDescription());
        descriptionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        aggregationFunctionDescriptionEClass.getESuperTypes().add(this.getDescription());
        metricSetDescriptionEClass.getESuperTypes().add(this.getMetricDescription());
        numericalBaseMetricDescriptionEClass.getESuperTypes().add(this.getBaseMetricDescription());
        metricDescriptionRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

        // Initialize classes, features, and operations; add parameters
        initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentifier_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, Identifier.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getIdentifier_TextualBaseMetricDescription(), this.getTextualBaseMetricDescription(),
                this.getTextualBaseMetricDescription_Identifiers(), "textualBaseMetricDescription", null, 1, 1,
                Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(textualBaseMetricDescriptionEClass, TextualBaseMetricDescription.class,
                "TextualBaseMetricDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTextualBaseMetricDescription_Identifiers(), this.getIdentifier(),
                this.getIdentifier_TextualBaseMetricDescription(), "identifiers", null, 1, -1,
                TextualBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(baseMetricDescriptionEClass, BaseMetricDescription.class, "BaseMetricDescription", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBaseMetricDescription_CaptureType(), this.getCaptureType(), "captureType", null, 1, 1,
                BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBaseMetricDescription_DataType(), this.getDataType(), "dataType", null, 1, 1,
                BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBaseMetricDescription_Scale(), this.getScale(), "scale", null, 1, 1,
                BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(metricDescriptionEClass, MetricDescription.class, "MetricDescription", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetricDescription_Repository(), this.getMetricDescriptionRepository(),
                this.getMetricDescriptionRepository_MetricDescriptions(), "repository", null, 1, 1,
                MetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, Description.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getDescription_TextualDescription(), ecorePackage.getEString(), "textualDescription", null, 1,
                1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        initEClass(aggregationFunctionDescriptionEClass, AggregationFunctionDescription.class,
                "AggregationFunctionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(metricSetDescriptionEClass, MetricSetDescription.class, "MetricSetDescription", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetricSetDescription_SubsumedMetrics(), this.getMetricDescription(), null, "subsumedMetrics",
                null, 1, -1, MetricSetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericalBaseMetricDescriptionEClass, NumericalBaseMetricDescription.class,
                "NumericalBaseMetricDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getEJSUnit());
        EGenericType g2 = createEGenericType(this.getIJSQuantity());
        g1.getETypeArguments().add(g2);
        initEAttribute(getNumericalBaseMetricDescription_DefaultUnit(), g1, "defaultUnit", null, 0, 1,
                NumericalBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getNumericalBaseMetricDescription_PersistenceKind(), this.getPersistenceKindOptions(),
                "persistenceKind", null, 1, 1, NumericalBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(ijsQuantityEClass, Quantity.class, "IJSQuantity", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        initEClass(metricDescriptionRepositoryEClass, MetricDescriptionRepository.class, "MetricDescriptionRepository",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetricDescriptionRepository_MetricDescriptions(), this.getMetricDescription(),
                this.getMetricDescription_Repository(), "metricDescriptions", null, 0, -1,
                MetricDescriptionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(captureTypeEEnum, CaptureType.class, "CaptureType");
        addEEnumLiteral(captureTypeEEnum, CaptureType.IDENTIFIER);
        addEEnumLiteral(captureTypeEEnum, CaptureType.INTEGER_NUMBER);
        addEEnumLiteral(captureTypeEEnum, CaptureType.REAL_NUMBER);

        initEEnum(scaleEEnum, Scale.class, "Scale");
        addEEnumLiteral(scaleEEnum, Scale.NOMINAL);
        addEEnumLiteral(scaleEEnum, Scale.ORDINAL);
        addEEnumLiteral(scaleEEnum, Scale.INTERVAL);
        addEEnumLiteral(scaleEEnum, Scale.RATIO);

        initEEnum(persistenceKindOptionsEEnum, PersistenceKindOptions.class, "PersistenceKindOptions");
        addEEnumLiteral(persistenceKindOptionsEEnum, PersistenceKindOptions.BINARY_PREFERRED);
        addEEnumLiteral(persistenceKindOptionsEEnum, PersistenceKindOptions.JS_XML_PREFERRED);

        initEEnum(dataTypeEEnum, DataType.class, "DataType");
        addEEnumLiteral(dataTypeEEnum, DataType.QUANTITATIVE);
        addEEnumLiteral(dataTypeEEnum, DataType.QUALITATIVE);

        // Initialize data types
        initEDataType(ejsUnitEDataType, Unit.class, "EJSUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} // MetricSpecPackageImpl
