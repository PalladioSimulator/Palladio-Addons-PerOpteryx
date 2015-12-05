/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The DesignDecisions metamodel represents degrees of freedom that can be exploited for optimisation.
 * 
 * The core idea is each degree of freedom can be represented by a DegreeOfFreedom element. Each DegreeOfFreedom has two parts: It links a model element that is the changeable entity in this DegreeOfFreedom, and it specifies a Domain of possible values that the model element can take. 
 * 
 * The actual making of a decision is represented in the Choice element. For a specific candidate architecture, one Choice for each DegreeOfFreedom in the Problem as to be made. The Choice contains a reference to the DegreeOfFreedom that it decides and a reference to a value from the DegreeOfFreedom's Domain that represent the selected value.  See the diagram "Design and Choice" for an overview of DegreeOfFreedom, Domain and Choice.
 * 
 * All of the above mentioned elements are abstract and are subclassed for the different generic degrees of freedom. For example, the degree of freedom of "component allocation" is represented in the AllocationDegree. See the documentation of each subclass of design decision for details. The diagram AssembledComponentDegree visualises the subclassing for the example degree of freedom of "component selection". 
 * 
 * 
 * <!-- end-model-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory
 * @model kind="package"
 * @generated
 */
public interface designdecisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "designdecision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "designdecision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	designdecisionPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ACTIVE = GenericdesigndecisionPackage.CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALUE = GenericdesigndecisionPackage.CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DOF_INSTANCE = GenericdesigndecisionPackage.CHOICE__DOF_INSTANCE;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = GenericdesigndecisionPackage.CHOICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDiscreteRangeChoice()
	 * @generated
	 */
	int DISCRETE_RANGE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getClassChoice()
	 * @generated
	 */
	int CLASS_CHOICE = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ContinousRangeChoiceImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getContinousRangeChoice()
	 * @generated
	 */
	int CONTINOUS_RANGE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continous Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDecisionSpace()
	 * @generated
	 */
	int DECISION_SPACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE__ID = featuremodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE__NAME = featuremodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dof Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE__DOF_INSTANCES = featuremodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE_FEATURE_COUNT = featuremodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl <em>Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getCandidate()
	 * @generated
	 */
	int CANDIDATE = 5;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__CHOICES = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__QUALITY_PROPERTY = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pcm Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__PCM_CHOICES = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pcm Quality Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__PCM_QUALITY_PROPERTY = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl <em>Candidates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getCandidates()
	 * @generated
	 */
	int CANDIDATES = 6;

	/**
	 * The feature id for the '<em><b>Candidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__CANDIDATE = GenericdesigndecisionPackage.CANDIDATES__CANDIDATE;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__PROBLEM = GenericdesigndecisionPackage.CANDIDATES__PROBLEM;

	/**
	 * The feature id for the '<em><b>Pcm Candidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__PCM_CANDIDATE = GenericdesigndecisionPackage.CANDIDATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pcm Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__PCM_PROBLEM = GenericdesigndecisionPackage.CANDIDATES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Candidates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES_FEATURE_COUNT = GenericdesigndecisionPackage.CANDIDATES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DSEProblemImpl <em>DSE Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DSEProblemImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDSEProblem()
	 * @generated
	 */
	int DSE_PROBLEM = 7;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__PROBLEM = GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM;

	/**
	 * The feature id for the '<em><b>Emf Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__EMF_INSTANCE = GenericdesigndecisionPackage.ADSE_PROBLEM__EMF_INSTANCE;

	/**
	 * The feature id for the '<em><b>Associated Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__ASSOCIATED_METAMODEL = GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL;

	/**
	 * The number of structural features of the '<em>DSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_FEATURE_COUNT = GenericdesigndecisionPackage.ADSE_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.MetamodelDescriptionImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getMetamodelDescription()
	 * @generated
	 */
	int METAMODEL_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__DOFREPOSITORY = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY;

	/**
	 * The feature id for the '<em><b>Gdof to dof</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__GDOF_TO_DOF = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__NAME = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Genome To Candidate Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION;

	/**
	 * The number of structural features of the '<em>Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION_FEATURE_COUNT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.GenomeToCandidateModelTransformationImpl <em>Genome To Candidate Model Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.GenomeToCandidateModelTransformationImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getGenomeToCandidateModelTransformation()
	 * @generated
	 */
	int GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = 9;

	/**
	 * The number of structural features of the '<em>Genome To Candidate Model Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT
			+ 0;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Range Choice</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice
	 * @generated
	 */
	EClass getDiscreteRangeChoice();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.ClassChoice <em>Class Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Choice</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ClassChoice
	 * @generated
	 */
	EClass getClassChoice();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous Range Choice</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice
	 * @generated
	 */
	EClass getContinousRangeChoice();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.DecisionSpace <em>Decision Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Space</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DecisionSpace
	 * @generated
	 */
	EClass getDecisionSpace();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidate
	 * @generated
	 */
	EClass getCandidate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.Candidate#getPcmChoices <em>Pcm Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcm Choices</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidate#getPcmChoices()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_PcmChoices();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.Candidate#getPcmQualityProperty <em>Pcm Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcm Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidate#getPcmQualityProperty()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_PcmQualityProperty();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.Candidates <em>Candidates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidates</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidates
	 * @generated
	 */
	EClass getCandidates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmCandidate <em>Pcm Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcm Candidate</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmCandidate()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_PcmCandidate();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmProblem <em>Pcm Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcm Problem</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmProblem()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_PcmProblem();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.DSEProblem <em>DSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Problem</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DSEProblem
	 * @generated
	 */
	EClass getDSEProblem();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription <em>Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription
	 * @generated
	 */
	EClass getMetamodelDescription();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genome To Candidate Model Transformation</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation
	 * @generated
	 */
	EClass getGenomeToCandidateModelTransformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	designdecisionFactory getdesigndecisionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDiscreteRangeChoice()
		 * @generated
		 */
		EClass DISCRETE_RANGE_CHOICE = eINSTANCE.getDiscreteRangeChoice();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getClassChoice()
		 * @generated
		 */
		EClass CLASS_CHOICE = eINSTANCE.getClassChoice();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.ContinousRangeChoiceImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getContinousRangeChoice()
		 * @generated
		 */
		EClass CONTINOUS_RANGE_CHOICE = eINSTANCE.getContinousRangeChoice();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDecisionSpace()
		 * @generated
		 */
		EClass DECISION_SPACE = eINSTANCE.getDecisionSpace();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl <em>Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getCandidate()
		 * @generated
		 */
		EClass CANDIDATE = eINSTANCE.getCandidate();

		/**
		 * The meta object literal for the '<em><b>Pcm Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATE__PCM_CHOICES = eINSTANCE.getCandidate_PcmChoices();

		/**
		 * The meta object literal for the '<em><b>Pcm Quality Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATE__PCM_QUALITY_PROPERTY = eINSTANCE.getCandidate_PcmQualityProperty();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl <em>Candidates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getCandidates()
		 * @generated
		 */
		EClass CANDIDATES = eINSTANCE.getCandidates();

		/**
		 * The meta object literal for the '<em><b>Pcm Candidate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATES__PCM_CANDIDATE = eINSTANCE.getCandidates_PcmCandidate();

		/**
		 * The meta object literal for the '<em><b>Pcm Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATES__PCM_PROBLEM = eINSTANCE.getCandidates_PcmProblem();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.DSEProblemImpl <em>DSE Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.DSEProblemImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getDSEProblem()
		 * @generated
		 */
		EClass DSE_PROBLEM = eINSTANCE.getDSEProblem();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.MetamodelDescriptionImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getMetamodelDescription()
		 * @generated
		 */
		EClass METAMODEL_DESCRIPTION = eINSTANCE.getMetamodelDescription();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.impl.GenomeToCandidateModelTransformationImpl <em>Genome To Candidate Model Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.GenomeToCandidateModelTransformationImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl#getGenomeToCandidateModelTransformation()
		 * @generated
		 */
		EClass GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = eINSTANCE.getGenomeToCandidateModelTransformation();

	}

} //designdecisionPackage
