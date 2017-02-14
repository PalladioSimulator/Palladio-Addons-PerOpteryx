/**
 */
package strategyConfig.impl;

import concernStrategy.StrategymodelPackage;

import concernStrategy.impl.StrategymodelPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import strategyConfig.AttributeValue;
import strategyConfig.ConcernconfigFactory;
import strategyConfig.ConcernconfigPackage;
import strategyConfig.ConfigNode;
import strategyConfig.ConfigState;
import strategyConfig.Configuration;
import strategyConfig.DoubleAttributeValue;
import strategyConfig.ExternalObjectAttributeValue;
import strategyConfig.FeatureConfig;
import strategyConfig.FeatureConfigState;
import strategyConfig.IntegerAttributeValue;
import strategyConfig.StringAttributeValue;

import strategyConfig.util.ConcernconfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernconfigPackageImpl extends EPackageImpl implements ConcernconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalObjectAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureConfigStateEEnum = null;

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
	 * @see strategyConfig.ConcernconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcernconfigPackageImpl() {
		super(eNS_URI, ConcernconfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcernconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcernconfigPackage init() {
		if (isInited) return (ConcernconfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConcernconfigPackage.eNS_URI);

		// Obtain or create and register package
		ConcernconfigPackageImpl theConcernconfigPackage = (ConcernconfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcernconfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcernconfigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StrategymodelPackageImpl theStrategymodelPackage = (StrategymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StrategymodelPackage.eNS_URI) instanceof StrategymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StrategymodelPackage.eNS_URI) : StrategymodelPackage.eINSTANCE);

		// Create package meta-data objects
		theConcernconfigPackage.createPackageContents();
		theStrategymodelPackage.createPackageContents();

		// Initialize created meta-data
		theConcernconfigPackage.initializePackageContents();
		theStrategymodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConcernconfigPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConcernconfigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConcernconfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcernconfigPackage.eNS_URI, theConcernconfigPackage);
		return theConcernconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigNode() {
		return configNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigNode_Origin() {
		return (EReference)configNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigNode_ConfigState() {
		return (EAttribute)configNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigNode_Attributevalue() {
		return (EReference)configNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Value() {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValue_Confignode() {
		return (EReference)attributeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConfig() {
		return featureConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureConfig_FeatureConfigState() {
		return (EAttribute)featureConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfig_Confignode() {
		return (EReference)featureConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfig_AnnotatedElement() {
		return (EReference)featureConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfig_ConfigurationOverrides() {
		return (EReference)featureConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfig_ConfigurationDefault() {
		return (EReference)featureConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_DefaultConfig() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ConfigOverrides() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerAttributeValue() {
		return integerAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleAttributeValue() {
		return doubleAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringAttributeValue() {
		return stringAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalObjectAttributeValue() {
		return externalObjectAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalObjectAttributeValue_ReferencedObject() {
		return (EReference)externalObjectAttributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfigState() {
		return configStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureConfigState() {
		return featureConfigStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernconfigFactory getConcernconfigFactory() {
		return (ConcernconfigFactory)getEFactoryInstance();
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
		configNodeEClass = createEClass(CONFIG_NODE);
		createEReference(configNodeEClass, CONFIG_NODE__ORIGIN);
		createEAttribute(configNodeEClass, CONFIG_NODE__CONFIG_STATE);
		createEReference(configNodeEClass, CONFIG_NODE__ATTRIBUTEVALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VALUE);
		createEReference(attributeValueEClass, ATTRIBUTE_VALUE__CONFIGNODE);

		featureConfigEClass = createEClass(FEATURE_CONFIG);
		createEAttribute(featureConfigEClass, FEATURE_CONFIG__FEATURE_CONFIG_STATE);
		createEReference(featureConfigEClass, FEATURE_CONFIG__CONFIGNODE);
		createEReference(featureConfigEClass, FEATURE_CONFIG__ANNOTATED_ELEMENT);
		createEReference(featureConfigEClass, FEATURE_CONFIG__CONFIGURATION_OVERRIDES);
		createEReference(featureConfigEClass, FEATURE_CONFIG__CONFIGURATION_DEFAULT);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__DEFAULT_CONFIG);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__CONFIG_OVERRIDES);

		integerAttributeValueEClass = createEClass(INTEGER_ATTRIBUTE_VALUE);

		doubleAttributeValueEClass = createEClass(DOUBLE_ATTRIBUTE_VALUE);

		stringAttributeValueEClass = createEClass(STRING_ATTRIBUTE_VALUE);

		externalObjectAttributeValueEClass = createEClass(EXTERNAL_OBJECT_ATTRIBUTE_VALUE);
		createEReference(externalObjectAttributeValueEClass, EXTERNAL_OBJECT_ATTRIBUTE_VALUE__REFERENCED_OBJECT);

		// Create enums
		configStateEEnum = createEEnum(CONFIG_STATE);
		featureConfigStateEEnum = createEEnum(FEATURE_CONFIG_STATE);
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

		// Obtain other dependent packages
		StrategymodelPackage theStrategymodelPackage = (StrategymodelPackage)EPackage.Registry.INSTANCE.getEPackage(StrategymodelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		attributeValueEClass.getESuperTypes().add(theStrategymodelPackage.getNamedElement());
		integerAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());
		doubleAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());
		stringAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());
		externalObjectAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());

		// Initialize classes and features; add operations and parameters
		initEClass(configNodeEClass, ConfigNode.class, "ConfigNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigNode_Origin(), theStrategymodelPackage.getFeature(), null, "origin", null, 1, 1, ConfigNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigNode_ConfigState(), this.getConfigState(), "configState", "DEFAULT", 1, 1, ConfigNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigNode_Attributevalue(), this.getAttributeValue(), this.getAttributeValue_Confignode(), "attributevalue", null, 0, -1, ConfigNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(configNodeEClass, ecorePackage.getEBoolean(), "ConfigCardinalityInvalid", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		op = addEOperation(configNodeEClass, ecorePackage.getEBoolean(), "CheckMultiplicityOfFeatureGroup", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Value(), theEcorePackage.getEString(), "value", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValue_Confignode(), this.getConfigNode(), this.getConfigNode_Attributevalue(), "confignode", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureConfigEClass, FeatureConfig.class, "FeatureConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureConfig_FeatureConfigState(), this.getFeatureConfigState(), "featureConfigState", "NOT_SET", 1, 1, FeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureConfig_Confignode(), this.getConfigNode(), null, "confignode", null, 0, -1, FeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureConfig_AnnotatedElement(), theStrategymodelPackage.getFeatureDiagram(), null, "annotatedElement", null, 0, 1, FeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureConfig_ConfigurationOverrides(), this.getConfiguration(), this.getConfiguration_ConfigOverrides(), "configurationOverrides", null, 0, 1, FeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureConfig_ConfigurationDefault(), this.getConfiguration(), this.getConfiguration_DefaultConfig(), "configurationDefault", null, 0, 1, FeatureConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(featureConfigEClass, this.getFeatureConfigState(), "showFeatureConfigState", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_DefaultConfig(), this.getFeatureConfig(), this.getFeatureConfig_ConfigurationDefault(), "defaultConfig", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_ConfigOverrides(), this.getFeatureConfig(), this.getFeatureConfig_ConfigurationOverrides(), "configOverrides", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerAttributeValueEClass, IntegerAttributeValue.class, "IntegerAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(integerAttributeValueEClass, ecorePackage.getEBoolean(), "AttributeValueIsDefinedInFeatureAndEqualsTypeInteger", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(doubleAttributeValueEClass, DoubleAttributeValue.class, "DoubleAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(doubleAttributeValueEClass, ecorePackage.getEBoolean(), "AttributeValueIsDefinedInFeatureAndEqualsTypeDouble", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(stringAttributeValueEClass, StringAttributeValue.class, "StringAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringAttributeValueEClass, ecorePackage.getEBoolean(), "AttributeValueIsDefinedInFeatureAndEqualsTypeString", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		initEClass(externalObjectAttributeValueEClass, ExternalObjectAttributeValue.class, "ExternalObjectAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalObjectAttributeValue_ReferencedObject(), theEcorePackage.getEObject(), null, "referencedObject", null, 1, 1, ExternalObjectAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(externalObjectAttributeValueEClass, ecorePackage.getEBoolean(), "AttributeValueIsDefinedInFeatureAndEqualsTypeExternalObject", 0, 1);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1);

		// Initialize enums and add enum literals
		initEEnum(configStateEEnum, ConfigState.class, "ConfigState");
		addEEnumLiteral(configStateEEnum, ConfigState.SELECTED_LITERAL);
		addEEnumLiteral(configStateEEnum, ConfigState.ELIMINATED_LITERAL);
		addEEnumLiteral(configStateEEnum, ConfigState.DEFAULT_LITERAL);

		initEEnum(featureConfigStateEEnum, FeatureConfigState.class, "FeatureConfigState");
		addEEnumLiteral(featureConfigStateEEnum, FeatureConfigState.NOT_SET_LITERAL);
		addEEnumLiteral(featureConfigStateEEnum, FeatureConfigState.OVERRIDE_LITERAL);
		addEEnumLiteral(featureConfigStateEEnum, FeatureConfigState.DEFAULT_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  ((EOperation)configNodeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "true \r\n--let childSelectedCount : Integer = self.children->select(c|c.configState = ConfigState::USER_SELECTED or c.configState = ConfigState::MASCHINE_SELECTED)->size() \r\n--in \r\n--\t if self.origin.oclIsTypeOf(featuremodel::FeatureGroup) then\r\n--\t \tchildSelectedCount >= self.origin.min and (childSelectedCount <= self.origin.max or self.origin.max = -1)\r\n--\t else\r\n--\t \tself.origin.min  >= 1 implies (self.configState = ConfigState::USER_SELECTED or self.configState = ConfigState::MASCHINE_SELECTED)\r\n--\t endif"
		   });	
		addAnnotation
		  ((EOperation)configNodeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "true\r\n--not self.origin.featuregroup->isEmpty() implies (self.origin.featuregroup.children->size() <=  self.origin.featuregroup.max and self.origin.featuregroup.children->size() >=  self.origin.featuregroup.min)"
		   });	
		addAnnotation
		  ((EOperation)featureConfigEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "if (configurationDefault->size() = 1 and configurationDefault.defaultConfig = self) then FeatureConfigState::DEFAULT\r\n else (\r\n if (configurationOverrides->size() = 1 and configurationOverrides.configOverrides->size() > 0 and configurationOverrides.configOverrides->includes(self)) then FeatureConfigState::OVERRIDE\r\n else FeatureConfigState::NOT_SET\r\n endif\r\n ) endif"
		   });	
		addAnnotation
		  ((EOperation)integerAttributeValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.confignode.origin.attributes->one(a | a.name = self.name)\r\n and\r\n self.confignode.origin.attributes->any(a | a.name = self.name).oclIsTypeOf(featuremodel::IntegerAttribute)\r\n"
		   });	
		addAnnotation
		  ((EOperation)doubleAttributeValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.confignode.origin.attributes->one(a | a.name = self.name)\r\n and\r\n self.confignode.origin.attributes->any(a | a.name = self.name).oclIsTypeOf(featuremodel::DoubleAttribute)\r\n"
		   });	
		addAnnotation
		  ((EOperation)stringAttributeValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.confignode.origin.attributes->one(a | a.name = self.name)\r\n and\r\n self.confignode.origin.attributes->any(a | a.name = self.name).oclIsTypeOf(featuremodel::StringAttribute)"
		   });	
		addAnnotation
		  ((EOperation)externalObjectAttributeValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.confignode.origin.attributes->one(a | a.name = self.name)\r\n and\r\n self.confignode.origin.attributes->any(a | a.name = self.name).oclIsTypeOf(featuremodel::ExternalObjectAttribute)"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
} //ConcernconfigPackageImpl
