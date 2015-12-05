/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.universalDoF.UniversalDoFPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class designdecisionPackageImpl extends EPackageImpl implements designdecisionPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continousRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidatesEClass = null;

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
	private EClass metamodelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genomeToCandidateModelTransformationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private designdecisionPackageImpl() {
		super(eNS_URI, designdecisionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link designdecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static designdecisionPackage init() {
		if (isInited)
			return (designdecisionPackage) EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI);

		// Obtain or create and register package
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new designdecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();
		GenericdesigndecisionPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();
		GenericDoFPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
		qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
						: qualitypropertiesPackage.eINSTANCE);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
						: resourcerepositoryPackage.eINSTANCE);
		specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

		// Create package meta-data objects
		thedesigndecisionPackage.createPackageContents();
		thegdofPackage.createPackageContents();
		thequalitypropertiesPackage.createPackageContents();
		theresourcerepositoryPackage.createPackageContents();
		thespecificPackage.createPackageContents();

		// Initialize created meta-data
		thedesigndecisionPackage.initializePackageContents();
		thegdofPackage.initializePackageContents();
		thequalitypropertiesPackage.initializePackageContents();
		theresourcerepositoryPackage.initializePackageContents();
		thespecificPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedesigndecisionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(designdecisionPackage.eNS_URI, thedesigndecisionPackage);
		return thedesigndecisionPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteRangeChoice() {
		return discreteRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassChoice() {
		return classChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinousRangeChoice() {
		return continousRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionSpace() {
		return decisionSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCandidate() {
		return candidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidate_PcmChoices() {
		return (EReference) candidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidate_PcmQualityProperty() {
		return (EReference) candidateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCandidates() {
		return candidatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidates_PcmCandidate() {
		return (EReference) candidatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidates_PcmProblem() {
		return (EReference) candidatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSEProblem() {
		return dseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetamodelDescription() {
		return metamodelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenomeToCandidateModelTransformation() {
		return genomeToCandidateModelTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public designdecisionFactory getdesigndecisionFactory() {
		return (designdecisionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		discreteRangeChoiceEClass = createEClass(DISCRETE_RANGE_CHOICE);

		choiceEClass = createEClass(CHOICE);

		classChoiceEClass = createEClass(CLASS_CHOICE);

		continousRangeChoiceEClass = createEClass(CONTINOUS_RANGE_CHOICE);

		decisionSpaceEClass = createEClass(DECISION_SPACE);

		candidateEClass = createEClass(CANDIDATE);
		createEReference(candidateEClass, CANDIDATE__PCM_CHOICES);
		createEReference(candidateEClass, CANDIDATE__PCM_QUALITY_PROPERTY);

		candidatesEClass = createEClass(CANDIDATES);
		createEReference(candidatesEClass, CANDIDATES__PCM_CANDIDATE);
		createEReference(candidatesEClass, CANDIDATES__PCM_PROBLEM);

		dseProblemEClass = createEClass(DSE_PROBLEM);

		metamodelDescriptionEClass = createEClass(METAMODEL_DESCRIPTION);

		genomeToCandidateModelTransformationEClass = createEClass(GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		gdofPackage thegdofPackage = (gdofPackage) EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI);
		qualitypropertiesPackage thequalitypropertiesPackage = (qualitypropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI);
		resourcerepositoryPackage theresourcerepositoryPackage = (resourcerepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI);
		specificPackage thespecificPackage = (specificPackage) EPackage.Registry.INSTANCE
				.getEPackage(specificPackage.eNS_URI);
		GenericdesigndecisionPackage theGenericdesigndecisionPackage = (GenericdesigndecisionPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericdesigndecisionPackage.eNS_URI);
		featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(featuremodelPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		UniversalDoFPackage theUniversalDoFPackage = (UniversalDoFPackage) EPackage.Registry.INSTANCE
				.getEPackage(UniversalDoFPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thegdofPackage);
		getESubpackages().add(thequalitypropertiesPackage);
		getESubpackages().add(theresourcerepositoryPackage);
		getESubpackages().add(thespecificPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		discreteRangeChoiceEClass.getESuperTypes().add(this.getChoice());
		discreteRangeChoiceEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getDiscreteRangeChoice());
		choiceEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getChoice());
		classChoiceEClass.getESuperTypes().add(this.getChoice());
		classChoiceEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getClassChoice());
		continousRangeChoiceEClass.getESuperTypes().add(this.getChoice());
		continousRangeChoiceEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getContinousRangeChoice());
		decisionSpaceEClass.getESuperTypes().add(thefeaturemodelPackage.getNamedElement());
		decisionSpaceEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getDecisionSpace());
		candidateEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		candidateEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getCandidate());
		candidatesEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getCandidates());
		dseProblemEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getADSEProblem());
		metamodelDescriptionEClass.getESuperTypes().add(theUniversalDoFPackage.getAMetamodelDescription());
		genomeToCandidateModelTransformationEClass.getESuperTypes()
				.add(theGenericdesigndecisionPackage.getAGenomeToCandidateModelTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(discreteRangeChoiceEClass, DiscreteRangeChoice.class, "DiscreteRangeChoice", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classChoiceEClass, ClassChoice.class, "ClassChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(continousRangeChoiceEClass, ContinousRangeChoice.class, "ContinousRangeChoice", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionSpaceEClass, DecisionSpace.class, "DecisionSpace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(candidateEClass, Candidate.class, "Candidate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidate_PcmChoices(), this.getChoice(), null, "pcmChoices", null, 0, -1, Candidate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCandidate_PcmQualityProperty(), thequalitypropertiesPackage.getQualityProperty(), null,
				"pcmQualityProperty", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(candidatesEClass, Candidates.class, "Candidates", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidates_PcmCandidate(), this.getCandidate(), null, "pcmCandidate", null, 0, -1,
				Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCandidates_PcmProblem(), this.getDecisionSpace(), null, "pcmProblem", null, 0, 1,
				Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dseProblemEClass, DSEProblem.class, "DSEProblem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelDescriptionEClass, MetamodelDescription.class, "MetamodelDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genomeToCandidateModelTransformationEClass, GenomeToCandidateModelTransformation.class,
				"GenomeToCandidateModelTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // designdecisionPackageImpl
