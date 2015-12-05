/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;
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
		GenericdesigndecisionPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();
		GenericDoFPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI)
						: designdecisionPackage.eINSTANCE);
		gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
						: resourcerepositoryPackage.eINSTANCE);
		specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericQualityProperty() {
		return numericQualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericQualityProperty_ResultDecoratorRepository() {
		return (EReference) numericQualityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericQualityProperty_PcmConfidenceInterval() {
		return (EReference) numericQualityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidenceInterval() {
		return confidenceIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementQualityProperty() {
		return elementQualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerQualityProperty() {
		return integerQualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleQualityProperty() {
		return doubleQualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityPrediction() {
		return qualityPredictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityProperty() {
		return qualityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEReference(numericQualityPropertyEClass, NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL);

		confidenceIntervalEClass = createEClass(CONFIDENCE_INTERVAL);

		elementQualityPropertyEClass = createEClass(ELEMENT_QUALITY_PROPERTY);

		integerQualityPropertyEClass = createEClass(INTEGER_QUALITY_PROPERTY);

		doubleQualityPropertyEClass = createEClass(DOUBLE_QUALITY_PROPERTY);

		qualityPredictionEClass = createEClass(QUALITY_PREDICTION);

		qualityPropertyEClass = createEClass(QUALITY_PROPERTY);
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
		QualitypropertiesPackage theQualitypropertiesPackage = (QualitypropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(QualitypropertiesPackage.eNS_URI);
		ResultdecoratorPackage theResultdecoratorPackage = (ResultdecoratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ResultdecoratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		numericQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
		numericQualityPropertyEClass.getESuperTypes().add(theQualitypropertiesPackage.getNumericQualityProperty());
		confidenceIntervalEClass.getESuperTypes().add(theQualitypropertiesPackage.getConfidenceInterval());
		elementQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
		elementQualityPropertyEClass.getESuperTypes().add(theQualitypropertiesPackage.getElementQualityProperty());
		integerQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());
		integerQualityPropertyEClass.getESuperTypes().add(theQualitypropertiesPackage.getIntegerQualityProperty());
		doubleQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());
		doubleQualityPropertyEClass.getESuperTypes().add(theQualitypropertiesPackage.getDoubleQualityProperty());
		qualityPredictionEClass.getESuperTypes().add(theQualitypropertiesPackage.getQualityPrediction());
		qualityPropertyEClass.getESuperTypes().add(theQualitypropertiesPackage.getQualityProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(numericQualityPropertyEClass, NumericQualityProperty.class, "NumericQualityProperty", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericQualityProperty_ResultDecoratorRepository(),
				theResultdecoratorPackage.getResultDecoratorRepository(), null, "resultDecoratorRepository", null, 0, 1,
				NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNumericQualityProperty_PcmConfidenceInterval(), this.getConfidenceInterval(), null,
				"pcmConfidenceInterval", null, 0, 1, NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(confidenceIntervalEClass, ConfidenceInterval.class, "ConfidenceInterval", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementQualityPropertyEClass, ElementQualityProperty.class, "ElementQualityProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerQualityPropertyEClass, IntegerQualityProperty.class, "IntegerQualityProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleQualityPropertyEClass, DoubleQualityProperty.class, "DoubleQualityProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityPredictionEClass, QualityPrediction.class, "QualityPrediction", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //qualitypropertiesPackageImpl
