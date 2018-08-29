/**
 */
package featureObjective.impl;

import FeatureCompletionModel.FeatureCompletionPackage;

import FeatureCompletionModel.impl.FeatureCompletionPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import featureObjective.AttributeTypes;
import featureObjective.Constraint;
import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.FeatureObjective;
import featureObjective.FeatureObjectiveFactory;
import featureObjective.FeatureObjectivePackage;
import featureObjective.LogicalOperation;
import featureObjective.ProhibitsConstraint;
import featureObjective.RequiredConstraint;

import featureObjective.util.FeatureObjectiveValidator;

import featureSolution.FeatureSolutionPackage;

import featureSolution.impl.FeatureSolutionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureObjectivePackageImpl extends EPackageImpl implements FeatureObjectivePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prohibitsConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperationEEnum = null;

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
	 * @see featureObjective.FeatureObjectivePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeatureObjectivePackageImpl() {
		super(eNS_URI, FeatureObjectiveFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeatureObjectivePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeatureObjectivePackage init() {
		if (isInited) return (FeatureObjectivePackage)EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFeatureObjectivePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FeatureObjectivePackageImpl theFeatureObjectivePackage = registeredFeatureObjectivePackage instanceof FeatureObjectivePackageImpl ? (FeatureObjectivePackageImpl)registeredFeatureObjectivePackage : new FeatureObjectivePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);
		FeatureCompletionPackageImpl theFeatureCompletionPackage = (FeatureCompletionPackageImpl)(registeredPackage instanceof FeatureCompletionPackageImpl ? registeredPackage : FeatureCompletionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI);
		FeatureSolutionPackageImpl theFeatureSolutionPackage = (FeatureSolutionPackageImpl)(registeredPackage instanceof FeatureSolutionPackageImpl ? registeredPackage : FeatureSolutionPackage.eINSTANCE);

		// Create package meta-data objects
		theFeatureObjectivePackage.createPackageContents();
		theFeatureCompletionPackage.createPackageContents();
		theFeatureSolutionPackage.createPackageContents();

		// Initialize created meta-data
		theFeatureObjectivePackage.initializePackageContents();
		theFeatureCompletionPackage.initializePackageContents();
		theFeatureSolutionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFeatureObjectivePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FeatureObjectiveValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFeatureObjectivePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeatureObjectivePackage.eNS_URI, theFeatureObjectivePackage);
		return theFeatureObjectivePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureObjective() {
		return featureObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureObjective_FeatureGroups() {
		return (EReference)featureObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureObjective_Constraints() {
		return (EReference)featureObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureObjective_AnnotatableElement() {
		return (EReference)featureObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Featuregroup() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureGroup() {
		return featureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureGroup_Features() {
		return (EReference)featureGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureGroup_Operation() {
		return (EAttribute)featureGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Source() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Target() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Description() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredConstraint() {
		return requiredConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProhibitsConstraint() {
		return prohibitsConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeTypes() {
		return attributeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperation() {
		return logicalOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjectiveFactory getFeatureObjectiveFactory() {
		return (FeatureObjectiveFactory)getEFactoryInstance();
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
		featureObjectiveEClass = createEClass(FEATURE_OBJECTIVE);
		createEReference(featureObjectiveEClass, FEATURE_OBJECTIVE__FEATURE_GROUPS);
		createEReference(featureObjectiveEClass, FEATURE_OBJECTIVE__CONSTRAINTS);
		createEReference(featureObjectiveEClass, FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATUREGROUP);

		featureGroupEClass = createEClass(FEATURE_GROUP);
		createEReference(featureGroupEClass, FEATURE_GROUP__FEATURES);
		createEAttribute(featureGroupEClass, FEATURE_GROUP__OPERATION);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__SOURCE);
		createEReference(constraintEClass, CONSTRAINT__TARGET);
		createEAttribute(constraintEClass, CONSTRAINT__DESCRIPTION);

		requiredConstraintEClass = createEClass(REQUIRED_CONSTRAINT);

		prohibitsConstraintEClass = createEClass(PROHIBITS_CONSTRAINT);

		// Create enums
		attributeTypesEEnum = createEEnum(ATTRIBUTE_TYPES);
		logicalOperationEEnum = createEEnum(LOGICAL_OPERATION);
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
		FeatureCompletionPackage theFeatureCompletionPackage = (FeatureCompletionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureObjectiveEClass.getESuperTypes().add(theFeatureCompletionPackage.getDescribedElement());
		featureEClass.getESuperTypes().add(theFeatureCompletionPackage.getNamedElement());
		constraintEClass.getESuperTypes().add(theFeatureCompletionPackage.getNamedElement());
		requiredConstraintEClass.getESuperTypes().add(this.getConstraint());
		prohibitsConstraintEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(featureObjectiveEClass, FeatureObjective.class, "FeatureObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureObjective_FeatureGroups(), this.getFeatureGroup(), null, "featureGroups", null, 1, -1, FeatureObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureObjective_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, FeatureObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureObjective_AnnotatableElement(), theEcorePackage.getEObject(), null, "annotatableElement", null, 0, -1, FeatureObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Featuregroup(), this.getFeatureGroup(), null, "featuregroup", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureGroupEClass, FeatureGroup.class, "FeatureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroup_Features(), this.getFeature(), null, "features", null, 1, -1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureGroup_Operation(), this.getLogicalOperation(), "operation", "OR", 1, 1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(featureGroupEClass, ecorePackage.getEBoolean(), "XORorORImpliesChildrenAreMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(featureGroupEClass, ecorePackage.getEBoolean(), "ALLImpliesCardinalitiesToBeMinusOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(featureGroupEClass, ecorePackage.getEBoolean(), "ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(featureGroupEClass, ecorePackage.getEBoolean(), "XORImpliesCardinalitiesToBeOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Source(), this.getFeature(), null, "source", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Target(), this.getFeature(), null, "target", null, 1, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstraint_Description(), ecorePackage.getEString(), "description", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requiredConstraintEClass, RequiredConstraint.class, "RequiredConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prohibitsConstraintEClass, ProhibitsConstraint.class, "ProhibitsConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(attributeTypesEEnum, AttributeTypes.class, "AttributeTypes");
		addEEnumLiteral(attributeTypesEEnum, AttributeTypes.INT);
		addEEnumLiteral(attributeTypesEEnum, AttributeTypes.STRING);
		addEEnumLiteral(attributeTypesEEnum, AttributeTypes.REAL);

		initEEnum(logicalOperationEEnum, LogicalOperation.class, "LogicalOperation");
		addEEnumLiteral(logicalOperationEEnum, LogicalOperation.OR);
		addEEnumLiteral(logicalOperationEEnum, LogicalOperation.XOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
		addAnnotation
		  (featureGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "true \r\n--(self.groupType = GroupTypes::OR or self.groupType = GroupTypes::XOR) implies self.children->forAll(c|c.isMandatory)\r\n"
		   });
		addAnnotation
		  (featureGroupEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "true \r\n --self.groupType = GroupTypes::ALL implies (self.min = -1 and self.max = -1)\r\n"
		   });
		addAnnotation
		  (featureGroupEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "body", "true \r\n--self.groupType = GroupTypes::OR implies (self.min = 1  and self.max = -1)"
		   });
		addAnnotation
		  (featureGroupEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "body", "true \r\n --self.groupType = GroupTypes::XOR implies (self.min = 1 and self.max = 1)\r\n"
		   });
	}

} //FeatureObjectivePackageImpl
