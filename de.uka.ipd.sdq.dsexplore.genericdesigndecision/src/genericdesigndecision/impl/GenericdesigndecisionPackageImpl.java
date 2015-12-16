/**
 */
package genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.AGenomeToCandidateModelTransformation;
import genericdesigndecision.Candidate;
import genericdesigndecision.Candidates;
import genericdesigndecision.Choice;
import genericdesigndecision.ClassChoice;
import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.GenericdesigndecisionPackage;

import genericdesigndecision.genericDoF.GenericDoFPackage;

import genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import genericdesigndecision.qualityproperties.impl.QualitypropertiesPackageImpl;

import genericdesigndecision.universalDoF.UniversalDoFPackage;

import genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl;

import genericdesigndecision.util.GenericdesigndecisionValidator;

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
public class GenericdesigndecisionPackageImpl extends EPackageImpl implements GenericdesigndecisionPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adseProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseDecoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genomeToCandidateModelTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aGenomeToCandidateModelTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseEvaluatorEClass = null;

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
	 * @see genericdesigndecision.GenericdesigndecisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericdesigndecisionPackageImpl() {
		super(eNS_URI, GenericdesigndecisionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericdesigndecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericdesigndecisionPackage init() {
		if (isInited) return (GenericdesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI);

		// Obtain or create and register package
		GenericdesigndecisionPackageImpl theGenericdesigndecisionPackage = (GenericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenericdesigndecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) : GenericDoFPackage.eINSTANCE);
		UniversalDoFPackageImpl theUniversalDoFPackage = (UniversalDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) instanceof UniversalDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) : UniversalDoFPackage.eINSTANCE);
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) : QualitypropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericdesigndecisionPackage.createPackageContents();
		theGenericDoFPackage.createPackageContents();
		theUniversalDoFPackage.createPackageContents();
		theQualitypropertiesPackage.createPackageContents();

		// Initialize created meta-data
		theGenericdesigndecisionPackage.initializePackageContents();
		theGenericDoFPackage.initializePackageContents();
		theUniversalDoFPackage.initializePackageContents();
		theQualitypropertiesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGenericdesigndecisionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GenericdesigndecisionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGenericdesigndecisionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericdesigndecisionPackage.eNS_URI, theGenericdesigndecisionPackage);
		return theGenericdesigndecisionPackage;
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
	public EAttribute getChoice_Active() {
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
	public EReference getChoice_DofInstance() {
		return (EReference)choiceEClass.getEStructuralFeatures().get(2);
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
	public EReference getDecisionSpace_DofInstances() {
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
	public EClass getADSEProblem() {
		return adseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADSEProblem_Problem() {
		return (EReference)adseProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADSEProblem_EmfInstance() {
		return (EReference)adseProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADSEProblem_AssociatedMetamodel() {
		return (EReference)adseProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEDecoder() {
		return dseDecoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEProblem() {
		return dseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenomeToCandidateModelTransformation() {
		return genomeToCandidateModelTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGenomeToCandidateModelTransformation() {
		return aGenomeToCandidateModelTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEEvaluator() {
		return dseEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericdesigndecisionFactory getGenericdesigndecisionFactory() {
		return (GenericdesigndecisionFactory)getEFactoryInstance();
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
		createEAttribute(choiceEClass, CHOICE__ACTIVE);
		createEAttribute(choiceEClass, CHOICE__VALUE);
		createEReference(choiceEClass, CHOICE__DOF_INSTANCE);

		classChoiceEClass = createEClass(CLASS_CHOICE);
		createEReference(classChoiceEClass, CLASS_CHOICE__CHOSEN_VALUE);

		continousRangeChoiceEClass = createEClass(CONTINOUS_RANGE_CHOICE);
		createEAttribute(continousRangeChoiceEClass, CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE);

		decisionSpaceEClass = createEClass(DECISION_SPACE);
		createEReference(decisionSpaceEClass, DECISION_SPACE__DOF_INSTANCES);

		candidateEClass = createEClass(CANDIDATE);
		createEReference(candidateEClass, CANDIDATE__CHOICES);
		createEReference(candidateEClass, CANDIDATE__QUALITY_PROPERTY);

		candidatesEClass = createEClass(CANDIDATES);
		createEReference(candidatesEClass, CANDIDATES__CANDIDATE);
		createEReference(candidatesEClass, CANDIDATES__PROBLEM);
		createEOperation(candidatesEClass, CANDIDATES___NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS__DIAGNOSTICCHAIN_MAP);

		adseProblemEClass = createEClass(ADSE_PROBLEM);
		createEReference(adseProblemEClass, ADSE_PROBLEM__PROBLEM);
		createEReference(adseProblemEClass, ADSE_PROBLEM__EMF_INSTANCE);
		createEReference(adseProblemEClass, ADSE_PROBLEM__ASSOCIATED_METAMODEL);

		dseDecoderEClass = createEClass(DSE_DECODER);

		dseProblemEClass = createEClass(DSE_PROBLEM);

		genomeToCandidateModelTransformationEClass = createEClass(GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION);

		aGenomeToCandidateModelTransformationEClass = createEClass(AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION);

		dseEvaluatorEClass = createEClass(DSE_EVALUATOR);
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
		adseProblemEClass.getESuperTypes().add(this.getDSEProblem());
		adseProblemEClass.getESuperTypes().add(this.getDSEDecoder());
		aGenomeToCandidateModelTransformationEClass.getESuperTypes().add(this.getGenomeToCandidateModelTransformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(discreteRangeChoiceEClass, DiscreteRangeChoice.class, "DiscreteRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteRangeChoice_ChosenValue(), ecorePackage.getEInt(), "chosenValue", null, 1, 1, DiscreteRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Active(), ecorePackage.getEBoolean(), "Active", "true", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChoice_DofInstance(), theGenericDoFPackage.getADegreeOfFreedom(), null, "dofInstance", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classChoiceEClass, ClassChoice.class, "ClassChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassChoice_ChosenValue(), ecorePackage.getEObject(), null, "chosenValue", null, 1, 1, ClassChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(continousRangeChoiceEClass, ContinousRangeChoice.class, "ContinousRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinousRangeChoice_ChosenValue(), ecorePackage.getEDouble(), "chosenValue", null, 1, 1, ContinousRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(decisionSpaceEClass, DecisionSpace.class, "DecisionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionSpace_DofInstances(), theGenericDoFPackage.getADegreeOfFreedom(), null, "dofInstances", null, 1, -1, DecisionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

		initEClass(adseProblemEClass, ADSEProblem.class, "ADSEProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADSEProblem_Problem(), this.getDecisionSpace(), null, "problem", null, 1, 1, ADSEProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADSEProblem_EmfInstance(), theEcorePackage.getEObject(), null, "emfInstance", null, 1, 1, ADSEProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADSEProblem_AssociatedMetamodel(), theUniversalDoFPackage.getAMetamodelDescription(), null, "associatedMetamodel", null, 1, 1, ADSEProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dseDecoderEClass, DSEDecoder.class, "DSEDecoder", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseProblemEClass, DSEProblem.class, "DSEProblem", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(genomeToCandidateModelTransformationEClass, GenomeToCandidateModelTransformation.class, "GenomeToCandidateModelTransformation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(aGenomeToCandidateModelTransformationEClass, AGenomeToCandidateModelTransformation.class, "AGenomeToCandidateModelTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseEvaluatorEClass, DSEEvaluator.class, "DSEEvaluator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericdesigndecisionPackageImpl
