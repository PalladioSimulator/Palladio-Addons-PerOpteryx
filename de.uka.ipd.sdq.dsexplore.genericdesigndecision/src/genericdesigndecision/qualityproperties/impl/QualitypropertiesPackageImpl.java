/**
 */
package genericdesigndecision.qualityproperties.impl;

import genericdesigndecision.GenericdesigndecisionPackage;

import genericdesigndecision.genericDoF.GenericDoFPackage;

import genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl;

import genericdesigndecision.impl.GenericdesigndecisionPackageImpl;
import genericdesigndecision.qualityproperties.ConfidenceInterval;
import genericdesigndecision.qualityproperties.DoubleQualityProperty;
import genericdesigndecision.qualityproperties.ElementQualityProperty;
import genericdesigndecision.qualityproperties.IntegerQualityProperty;
import genericdesigndecision.qualityproperties.NumericQualityProperty;
import genericdesigndecision.qualityproperties.QualityPrediction;
import genericdesigndecision.qualityproperties.QualityProperty;
import genericdesigndecision.qualityproperties.QualitypropertiesFactory;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import genericdesigndecision.universalDoF.UniversalDoFPackage;

import genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitypropertiesPackageImpl extends EPackageImpl implements QualitypropertiesPackage {
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
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualitypropertiesPackageImpl() {
		super(eNS_URI, QualitypropertiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QualitypropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualitypropertiesPackage init() {
		if (isInited) return (QualitypropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI);

		// Obtain or create and register package
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualitypropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericdesigndecisionPackageImpl theGenericdesigndecisionPackage = (GenericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) instanceof GenericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) : GenericdesigndecisionPackage.eINSTANCE);
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) : GenericDoFPackage.eINSTANCE);
		UniversalDoFPackageImpl theUniversalDoFPackage = (UniversalDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) instanceof UniversalDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) : UniversalDoFPackage.eINSTANCE);

		// Create package meta-data objects
		theQualitypropertiesPackage.createPackageContents();
		theGenericdesigndecisionPackage.createPackageContents();
		theGenericDoFPackage.createPackageContents();
		theUniversalDoFPackage.createPackageContents();

		// Initialize created meta-data
		theQualitypropertiesPackage.initializePackageContents();
		theGenericdesigndecisionPackage.initializePackageContents();
		theGenericDoFPackage.initializePackageContents();
		theUniversalDoFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualitypropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualitypropertiesPackage.eNS_URI, theQualitypropertiesPackage);
		return theQualitypropertiesPackage;
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
	public EReference getNumericQualityProperty_ConfidenceInterval() {
		return (EReference)numericQualityPropertyEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)confidenceIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfidenceInterval_Mean() {
		return (EAttribute)confidenceIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfidenceInterval_UpperBound() {
		return (EAttribute)confidenceIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfidenceInterval_LowerBound() {
		return (EAttribute)confidenceIntervalEClass.getEStructuralFeatures().get(3);
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
		return (EAttribute)integerQualityPropertyEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)doubleQualityPropertyEClass.getEStructuralFeatures().get(0);
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
	public EOperation getQualityPrediction__Evaluate__EList() {
		return qualityPredictionEClass.getEOperations().get(0);
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
		return (EAttribute)qualityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypropertiesFactory getQualitypropertiesFactory() {
		return (QualitypropertiesFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		numericQualityPropertyEClass = createEClass(NUMERIC_QUALITY_PROPERTY);
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
		createEOperation(qualityPredictionEClass, QUALITY_PREDICTION___EVALUATE__ELIST);

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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		numericQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
		elementQualityPropertyEClass.getESuperTypes().add(this.getQualityProperty());
		integerQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());
		doubleQualityPropertyEClass.getESuperTypes().add(this.getNumericQualityProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(numericQualityPropertyEClass, NumericQualityProperty.class, "NumericQualityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericQualityProperty_ConfidenceInterval(), this.getConfidenceInterval(), null, "confidenceInterval", null, 0, 1, NumericQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(confidenceIntervalEClass, ConfidenceInterval.class, "ConfidenceInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfidenceInterval_ConfidenceLevel(), ecorePackage.getEDouble(), "confidenceLevel", null, 1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfidenceInterval_Mean(), ecorePackage.getEDouble(), "mean", null, 1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfidenceInterval_UpperBound(), ecorePackage.getEDouble(), "upperBound", null, 1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfidenceInterval_LowerBound(), ecorePackage.getEDouble(), "lowerBound", null, 1, 1, ConfidenceInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementQualityPropertyEClass, ElementQualityProperty.class, "ElementQualityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerQualityPropertyEClass, IntegerQualityProperty.class, "IntegerQualityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerQualityProperty_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(doubleQualityPropertyEClass, DoubleQualityProperty.class, "DoubleQualityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleQualityProperty_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleQualityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qualityPredictionEClass, QualityPrediction.class, "QualityPrediction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getQualityPrediction__Evaluate__EList(), this.getQualityProperty(), "evaluate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityProperty_QualityValue(), ecorePackage.getEJavaObject(), "qualityValue", null, 1, 1, QualityProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	}

} //QualitypropertiesPackageImpl
