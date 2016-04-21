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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class qualitypropertiesPackageImpl extends EPackageImpl implements qualitypropertiesPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numericQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass confidenceIntervalEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass elementQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass integerQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass doubleQualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass qualityPredictionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass qualityPropertyEClass = null;

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
     * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private qualitypropertiesPackageImpl() {
        super(eNS_URI, qualitypropertiesFactory.eINSTANCE);
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
     * This method is used to initialize {@link qualitypropertiesPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static qualitypropertiesPackage init() {
        if (isInited) {
            return (qualitypropertiesPackage) EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI);
        }

        // Obtain or create and register package
        final qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof qualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new qualitypropertiesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        costPackage.eINSTANCE.eClass();
        featuremodelPackage.eINSTANCE.eClass();
        ResultdecoratorPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI)
                        : designdecisionPackage.eINSTANCE);
        final gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
        final resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
                        : resourcerepositoryPackage.eINSTANCE);
        final specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumericQualityProperty() {
        return this.numericQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getNumericQualityProperty_ResultDecoratorRepository() {
        return (EReference) this.numericQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getNumericQualityProperty_ConfidenceInterval() {
        return (EReference) this.numericQualityPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getConfidenceInterval() {
        return this.confidenceIntervalEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConfidenceInterval_ConfidenceLevel() {
        return (EAttribute) this.confidenceIntervalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConfidenceInterval_Mean() {
        return (EAttribute) this.confidenceIntervalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConfidenceInterval_UpperBound() {
        return (EAttribute) this.confidenceIntervalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConfidenceInterval_LowerBound() {
        return (EAttribute) this.confidenceIntervalEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getElementQualityProperty() {
        return this.elementQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getIntegerQualityProperty() {
        return this.integerQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getIntegerQualityProperty_Value() {
        return (EAttribute) this.integerQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDoubleQualityProperty() {
        return this.doubleQualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDoubleQualityProperty_Value() {
        return (EAttribute) this.doubleQualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQualityPrediction() {
        return this.qualityPredictionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQualityProperty() {
        return this.qualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getQualityProperty_QualityValue() {
        return (EAttribute) this.qualityPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public qualitypropertiesFactory getqualitypropertiesFactory() {
        return (qualitypropertiesFactory) this.getEFactoryInstance();
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
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.numericQualityPropertyEClass = this.createEClass(NUMERIC_QUALITY_PROPERTY);
        this.createEReference(this.numericQualityPropertyEClass, NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY);
        this.createEReference(this.numericQualityPropertyEClass, NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL);

        this.confidenceIntervalEClass = this.createEClass(CONFIDENCE_INTERVAL);
        this.createEAttribute(this.confidenceIntervalEClass, CONFIDENCE_INTERVAL__CONFIDENCE_LEVEL);
        this.createEAttribute(this.confidenceIntervalEClass, CONFIDENCE_INTERVAL__MEAN);
        this.createEAttribute(this.confidenceIntervalEClass, CONFIDENCE_INTERVAL__UPPER_BOUND);
        this.createEAttribute(this.confidenceIntervalEClass, CONFIDENCE_INTERVAL__LOWER_BOUND);

        this.elementQualityPropertyEClass = this.createEClass(ELEMENT_QUALITY_PROPERTY);

        this.integerQualityPropertyEClass = this.createEClass(INTEGER_QUALITY_PROPERTY);
        this.createEAttribute(this.integerQualityPropertyEClass, INTEGER_QUALITY_PROPERTY__VALUE);

        this.doubleQualityPropertyEClass = this.createEClass(DOUBLE_QUALITY_PROPERTY);
        this.createEAttribute(this.doubleQualityPropertyEClass, DOUBLE_QUALITY_PROPERTY__VALUE);

        this.qualityPredictionEClass = this.createEClass(QUALITY_PREDICTION);

        this.qualityPropertyEClass = this.createEClass(QUALITY_PROPERTY);
        this.createEAttribute(this.qualityPropertyEClass, QUALITY_PROPERTY__QUALITY_VALUE);
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
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final ResultdecoratorPackage theResultdecoratorPackage = (ResultdecoratorPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResultdecoratorPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.numericQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
        this.elementQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
        this.integerQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());
        this.doubleQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.numericQualityPropertyEClass, NumericQualityProperty.class, "NumericQualityProperty",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getNumericQualityProperty_ResultDecoratorRepository(),
                theResultdecoratorPackage.getResultDecoratorRepository(), null, "resultDecoratorRepository", null, 0, 1,
                NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericQualityProperty_ConfidenceInterval(), this.getConfidenceInterval(), null,
                "confidenceInterval", null, 0, 1, NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.confidenceIntervalEClass, ConfidenceInterval.class, "ConfidenceInterval", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getConfidenceInterval_ConfidenceLevel(), theEcorePackage.getEDouble(),
                "confidenceLevel", null, 1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getConfidenceInterval_Mean(), theEcorePackage.getEDouble(), "mean", null, 1, 1,
                ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getConfidenceInterval_UpperBound(), theEcorePackage.getEDouble(), "upperBound", null,
                1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getConfidenceInterval_LowerBound(), theEcorePackage.getEDouble(), "lowerBound", null,
                1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.elementQualityPropertyEClass, ElementQualityProperty.class, "ElementQualityProperty",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.integerQualityPropertyEClass, IntegerQualityProperty.class, "IntegerQualityProperty",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getIntegerQualityProperty_Value(), theEcorePackage.getEIntegerObject(), "value", null,
                1, 1, IntegerQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.doubleQualityPropertyEClass, DoubleQualityProperty.class, "DoubleQualityProperty",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDoubleQualityProperty_Value(), theEcorePackage.getEDouble(), "value", null, 1, 1,
                DoubleQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.qualityPredictionEClass, QualityPrediction.class, "QualityPrediction", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        final EOperation op = this.addEOperation(this.qualityPredictionEClass, this.getQualityProperty(), "evaluate", 1,
                1, IS_UNIQUE, !IS_ORDERED);
        this.addEParameter(op, theEcorePackage.getEObject(), "model", 1, -1, IS_UNIQUE, !IS_ORDERED);

        this.initEClass(this.qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getQualityProperty_QualityValue(), theEcorePackage.getEJavaObject(), "qualityValue",
                null, 1, 1, QualityProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    }

} // qualitypropertiesPackageImpl
