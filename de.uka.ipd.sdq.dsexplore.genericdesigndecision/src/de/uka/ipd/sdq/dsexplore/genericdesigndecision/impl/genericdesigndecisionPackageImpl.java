/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.ClassChoice;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.ContinousRangeChoice;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DiscreteRangeChoice;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.GenericDoFPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.impl.GenericDoFPackageImpl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.impl.QualitypropertiesPackageImpl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionFactory;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.util.genericdesigndecisionValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class genericdesigndecisionPackageImpl extends EPackageImpl implements genericdesigndecisionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeOfFreedomInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continousRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidatesEClass = null;

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
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private genericdesigndecisionPackageImpl() {
		super(eNS_URI, genericdesigndecisionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link genericdesigndecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static genericdesigndecisionPackage init() {
		if (isInited) return (genericdesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(genericdesigndecisionPackage.eNS_URI);

		// Obtain or create and register package
		genericdesigndecisionPackageImpl thegenericdesigndecisionPackage = (genericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof genericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new genericdesigndecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) : GenericDoFPackage.eINSTANCE);
		UniversalDoFPackageImpl theUniversalDoFPackage = (UniversalDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) instanceof UniversalDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) : UniversalDoFPackage.eINSTANCE);
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) : QualitypropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		thegenericdesigndecisionPackage.createPackageContents();
		theGenericDoFPackage.createPackageContents();
		theUniversalDoFPackage.createPackageContents();
		theQualitypropertiesPackage.createPackageContents();

		// Initialize created meta-data
		thegenericdesigndecisionPackage.initializePackageContents();
		theGenericDoFPackage.initializePackageContents();
		theUniversalDoFPackage.initializePackageContents();
		theQualitypropertiesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thegenericdesigndecisionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return genericdesigndecisionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thegenericdesigndecisionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(genericdesigndecisionPackage.eNS_URI, thegenericdesigndecisionPackage);
		return thegenericdesigndecisionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteRangeChoice() {
		return discreteRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteRangeChoice_ChosenValue() {
		return (EAttribute)discreteRangeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_IsActive() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Value() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoice_DegreeOfFreedomInstance() {
		return (EReference)choiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegreeOfFreedomInstance() {
		return degreeOfFreedomInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDegreeOfFreedomInstance_PrimaryChanged() {
		return (EReference)degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDegreeOfFreedomInstance_Dof() {
		return (EReference)degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDegreeOfFreedomInstance_ChangeableElements() {
		return (EReference)degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassChoice() {
		return classChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassChoice_ChosenValue() {
		return (EReference)classChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinousRangeChoice() {
		return continousRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinousRangeChoice_ChosenValue() {
		return (EAttribute)continousRangeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionSpace() {
		return decisionSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionSpace_DegreesOfFreedom() {
		return (EReference)decisionSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidate() {
		return candidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidate_Choices() {
		return (EReference)candidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidate_QualityProperty() {
		return (EReference)candidateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidates() {
		return candidatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidates_Candidate() {
		return (EReference)candidatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCandidates_Problem() {
		return (EReference)candidatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCandidates__NumberOfChoicesMustEqualNumberOfDecisions__DiagnosticChain_Map() {
		return candidatesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecisionFactory getgenericdesigndecisionFactory() {
		return (genericdesigndecisionFactory)getEFactoryInstance();
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
		discreteRangeChoiceEClass = createEClass(DISCRETE_RANGE_CHOICE);
		createEAttribute(discreteRangeChoiceEClass, DISCRETE_RANGE_CHOICE__CHOSEN_VALUE);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__IS_ACTIVE);
		createEAttribute(choiceEClass, CHOICE__VALUE);
		createEReference(choiceEClass, CHOICE__DEGREE_OF_FREEDOM_INSTANCE);

		degreeOfFreedomInstanceEClass = createEClass(DEGREE_OF_FREEDOM_INSTANCE);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__DOF);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS);

		classChoiceEClass = createEClass(CLASS_CHOICE);
		createEReference(classChoiceEClass, CLASS_CHOICE__CHOSEN_VALUE);

		continousRangeChoiceEClass = createEClass(CONTINOUS_RANGE_CHOICE);
		createEAttribute(continousRangeChoiceEClass, CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE);

		decisionSpaceEClass = createEClass(DECISION_SPACE);
		createEReference(decisionSpaceEClass, DECISION_SPACE__DEGREES_OF_FREEDOM);

		candidateEClass = createEClass(CANDIDATE);
		createEReference(candidateEClass, CANDIDATE__CHOICES);
		createEReference(candidateEClass, CANDIDATE__QUALITY_PROPERTY);

		candidatesEClass = createEClass(CANDIDATES);
		createEReference(candidatesEClass, CANDIDATES__CANDIDATE);
		createEReference(candidatesEClass, CANDIDATES__PROBLEM);
		createEOperation(candidatesEClass, CANDIDATES___NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS__DIAGNOSTICCHAIN_MAP);
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
		GenericDoFPackage theGenericDoFPackage = (GenericDoFPackage)EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI);
		UniversalDoFPackage theUniversalDoFPackage = (UniversalDoFPackage)EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI);
		QualitypropertiesPackage theQualitypropertiesPackage = (QualitypropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGenericDoFPackage);
		getESubpackages().add(theUniversalDoFPackage);
		getESubpackages().add(theQualitypropertiesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		discreteRangeChoiceEClass.getESuperTypes().add(this.getChoice());
		classChoiceEClass.getESuperTypes().add(this.getChoice());
		continousRangeChoiceEClass.getESuperTypes().add(this.getChoice());

		// Initialize classes, features, and operations; add parameters
		initEClass(discreteRangeChoiceEClass, DiscreteRangeChoice.class, "DiscreteRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteRangeChoice_ChosenValue(), ecorePackage.getEInt(), "chosenValue", null, 1, 1, DiscreteRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChoice_DegreeOfFreedomInstance(), this.getDegreeOfFreedomInstance(), null, "degreeOfFreedomInstance", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(degreeOfFreedomInstanceEClass, DegreeOfFreedomInstance.class, "DegreeOfFreedomInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDegreeOfFreedomInstance_PrimaryChanged(), theEcorePackage.getEObject(), null, "primaryChanged", null, 1, 1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDegreeOfFreedomInstance_Dof(), theGenericDoFPackage.getDegreeOfFreedom(), null, "dof", null, 1, 1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDegreeOfFreedomInstance_ChangeableElements(), theEcorePackage.getEObject(), null, "changeableElements", null, 1, -1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classChoiceEClass, ClassChoice.class, "ClassChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassChoice_ChosenValue(), theEcorePackage.getEObject(), null, "chosenValue", null, 1, 1, ClassChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(continousRangeChoiceEClass, ContinousRangeChoice.class, "ContinousRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinousRangeChoice_ChosenValue(), ecorePackage.getEDouble(), "chosenValue", null, 1, 1, ContinousRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(decisionSpaceEClass, DecisionSpace.class, "DecisionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionSpace_DegreesOfFreedom(), this.getDegreeOfFreedomInstance(), null, "degreesOfFreedom", null, 1, -1, DecisionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(candidateEClass, Candidate.class, "Candidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidate_Choices(), this.getChoice(), null, "choices", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCandidate_QualityProperty(), theQualitypropertiesPackage.getQualityProperty(), null, "qualityProperty", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(candidatesEClass, Candidates.class, "Candidates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidates_Candidate(), this.getCandidate(), null, "candidate", null, 0, -1, Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCandidates_Problem(), this.getDecisionSpace(), null, "problem", null, 1, 1, Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getCandidates__NumberOfChoicesMustEqualNumberOfDecisions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfChoicesMustEqualNumberOfDecisions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //genericdesigndecisionPackageImpl
