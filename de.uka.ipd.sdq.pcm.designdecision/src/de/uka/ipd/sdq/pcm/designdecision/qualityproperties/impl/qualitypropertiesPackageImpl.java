/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class qualitypropertiesPackageImpl extends EPackageImpl implements qualitypropertiesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confidenceIntervalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doubleQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityPredictionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityPropertyEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private qualitypropertiesPackageImpl() {
        super(eNS_URI, qualitypropertiesFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link qualitypropertiesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static qualitypropertiesPackage init() {
        if (isInited)
            return (qualitypropertiesPackage) EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI);

        // Obtain or create and register package
        qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof qualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                : new qualitypropertiesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        costPackage.eINSTANCE.eClass();
        featuremodelPackage.eINSTANCE.eClass();
        ResultdecoratorPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI) : designdecisionPackage.eINSTANCE);
        gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
        resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) : resourcerepositoryPackage.eINSTANCE);
        specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

        // Create package meta-data objects
        thequalitypropertiesPackage.createPackageContents();
        thedesigndecisionPackage.createPackageContents();
        thegdofPackage.createPackageContents();
        theresourcerepositoryPackage.createPackageContents();
        thespecificPackage.createPackageContents();

        // Initialize created meta-data
        thequalitypropertiesPackage.initializePackageContents();
        thedesigndecisionPackage.initializePackageContents();
        thegdofPackage.initializePackageContents();
        theresourcerepositoryPackage.initializePackageContents();
        thespecificPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thequalitypropertiesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(qualitypropertiesPackage.eNS_URI, thequalitypropertiesPackage);
        return thequalitypropertiesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericQualityProperty() {
        return numericQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNumericQualityProperty_ResultDecoratorRepository() {
        return (EReference) numericQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNumericQualityProperty_ConfidenceInterval() {
        return (EReference) numericQualityPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConfidenceInterval() {
        return confidenceIntervalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfidenceInterval_ConfidenceLevel() {
        return (EAttribute) confidenceIntervalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfidenceInterval_Mean() {
        return (EAttribute) confidenceIntervalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfidenceInterval_UpperBound() {
        return (EAttribute) confidenceIntervalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConfidenceInterval_LowerBound() {
        return (EAttribute) confidenceIntervalEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElementQualityProperty() {
        return elementQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerQualityProperty() {
        return integerQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntegerQualityProperty_Value() {
        return (EAttribute) integerQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDoubleQualityProperty() {
        return doubleQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDoubleQualityProperty_Value() {
        return (EAttribute) doubleQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityPrediction() {
        return qualityPredictionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityProperty() {
        return qualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityProperty_QualityValue() {
        return (EAttribute) qualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public qualitypropertiesFactory getqualitypropertiesFactory() {
        return (qualitypropertiesFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        numericQualityPropertyEClass = createEClass(NUMERIC_QUALITY_PROPERTY);
        createEReference(numericQualityPropertyEClass, NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY);
        createEReference(numericQualityPropertyEClass, NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL);

        confidenceIntervalEClass = createEClass(CONFIDENCE_INTERVAL);
        createEAttribute(confidenceIntervalEClass, CONFIDENCE_INTERVAL__CONFIDENCE_LEVEL);
        createEAttribute(confidenceIntervalEClass, CONFIDENCE_INTERVAL__MEAN);
        createEAttribute(confidenceIntervalEClass, CONFIDENCE_INTERVAL__UPPER_BOUND);
        createEAttribute(confidenceIntervalEClass, CONFIDENCE_INTERVAL__LOWER_BOUND);

        elementQualityPropertyEClass = createEClass(ELEMENT_QUALITY_PROPERTY);

        integerQualityPropertyEClass = createEClass(INTEGER_QUALITY_PROPERTY);
        createEAttribute(integerQualityPropertyEClass, INTEGER_QUALITY_PROPERTY__VALUE);

        doubleQualityPropertyEClass = createEClass(DOUBLE_QUALITY_PROPERTY);
        createEAttribute(doubleQualityPropertyEClass, DOUBLE_QUALITY_PROPERTY__VALUE);

        qualityPredictionEClass = createEClass(QUALITY_PREDICTION);

        qualityPropertyEClass = createEClass(QUALITY_PROPERTY);
        createEAttribute(qualityPropertyEClass, QUALITY_PROPERTY__QUALITY_VALUE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
        ResultdecoratorPackage theResultdecoratorPackage = (ResultdecoratorPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResultdecoratorPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        numericQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
        elementQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
        integerQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());
        doubleQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());

        // Initialize classes and features; add operations and parameters
        initEClass(numericQualityPropertyEClass, NumericQualityProperty.class, "NumericQualityProperty", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNumericQualityProperty_ResultDecoratorRepository(),
                theResultdecoratorPackage.getResultDecoratorRepository(), null, "resultDecoratorRepository", null, 0,
                1, NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getNumericQualityProperty_ConfidenceInterval(), this.getConfidenceInterval(), null,
                "confidenceInterval", null, 0, 1, NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(confidenceIntervalEClass, ConfidenceInterval.class, "ConfidenceInterval", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConfidenceInterval_ConfidenceLevel(), theEcorePackage.getEDouble(), "confidenceLevel", null,
                1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getConfidenceInterval_Mean(), theEcorePackage.getEDouble(), "mean", null, 1, 1,
                ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getConfidenceInterval_UpperBound(), theEcorePackage.getEDouble(), "upperBound", null, 1, 1,
                ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getConfidenceInterval_LowerBound(), theEcorePackage.getEDouble(), "lowerBound", null, 1, 1,
                ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(elementQualityPropertyEClass, ElementQualityProperty.class, "ElementQualityProperty", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(integerQualityPropertyEClass, IntegerQualityProperty.class, "IntegerQualityProperty", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntegerQualityProperty_Value(), theEcorePackage.getEIntegerObject(), "value", null, 1, 1,
                IntegerQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(doubleQualityPropertyEClass, DoubleQualityProperty.class, "DoubleQualityProperty", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDoubleQualityProperty_Value(), theEcorePackage.getEDouble(), "value", null, 1, 1,
                DoubleQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(qualityPredictionEClass, QualityPrediction.class, "QualityPrediction", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(qualityPredictionEClass, this.getQualityProperty(), "evaluate", 1, 1, IS_UNIQUE,
                !IS_ORDERED);
        addEParameter(op, theEcorePackage.getEObject(), "model", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getQualityProperty_QualityValue(), theEcorePackage.getEJavaObject(), "qualityValue", null, 1, 1,
                QualityProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                IS_DERIVED, !IS_ORDERED);
    }

} //qualitypropertiesPackageImpl
