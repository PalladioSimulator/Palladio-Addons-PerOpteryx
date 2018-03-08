/**
 */
package ConcernModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ConcernModel.ConcernModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' pcm='../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ConcernModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConcernModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/ConcernModel/1.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Concern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcernModelPackage eINSTANCE = ConcernModel.impl.ConcernModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConcernModel.impl.ConcernRepositoryImpl <em>Concern Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.ConcernRepositoryImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcernRepository()
	 * @generated
	 */
	int CONCERN_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REPOSITORY__CONCERNS = 0;

	/**
	 * The number of structural features of the '<em>Concern Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Concern Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.ConcernImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__STRATEGIES = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Annotationtarget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ANNOTATIONTARGET = 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__CONSTRAINTS = 5;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.ConcernStrategyImpl <em>Concern Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.ConcernStrategyImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcernStrategy()
	 * @generated
	 */
	int CONCERN_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_STRATEGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_STRATEGY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Concern Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_STRATEGY__CONCERN_SOLUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Concern Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_STRATEGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Concern Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.ElementaryConcernComponentImpl <em>Elementary Concern Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.ElementaryConcernComponentImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getElementaryConcernComponent()
	 * @generated
	 */
	int ELEMENTARY_CONCERN_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT__REQUIRES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Annotationenrich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH = 3;

	/**
	 * The number of structural features of the '<em>Elementary Concern Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Elementary Concern Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CONCERN_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.AnnotationImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MAX_AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.AnnotationTargetImpl <em>Annotation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.AnnotationTargetImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotationTarget()
	 * @generated
	 */
	int ANNOTATION_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET__MAX_AMOUNT = ANNOTATION__MAX_AMOUNT;

	/**
	 * The feature id for the '<em><b>Join Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET__JOIN_POINT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TARGET_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.AnnotationEnrichImpl <em>Annotation Enrich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.AnnotationEnrichImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotationEnrich()
	 * @generated
	 */
	int ANNOTATION_ENRICH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENRICH__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENRICH__DESCRIPTION = ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENRICH__MAX_AMOUNT = ANNOTATION__MAX_AMOUNT;

	/**
	 * The number of structural features of the '<em>Annotation Enrich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENRICH_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation Enrich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENRICH_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConcernModel.impl.DeploymentConstraintImpl <em>Deployment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.impl.DeploymentConstraintImpl
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getDeploymentConstraint()
	 * @generated
	 */
	int DEPLOYMENT_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINT__ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINT__ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>Deployment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConcernModel.Association <em>Association</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.Association
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 8;

	/**
	 * The meta object id for the '{@link ConcernModel.JoinPoint <em>Join Point</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConcernModel.JoinPoint
	 * @see ConcernModel.impl.ConcernModelPackageImpl#getJoinPoint()
	 * @generated
	 */
	int JOIN_POINT = 9;


	/**
	 * Returns the meta object for class '{@link ConcernModel.ConcernRepository <em>Concern Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Repository</em>'.
	 * @see ConcernModel.ConcernRepository
	 * @generated
	 */
	EClass getConcernRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.ConcernRepository#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see ConcernModel.ConcernRepository#getConcerns()
	 * @see #getConcernRepository()
	 * @generated
	 */
	EReference getConcernRepository_Concerns();

	/**
	 * Returns the meta object for class '{@link ConcernModel.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see ConcernModel.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.Concern#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see ConcernModel.Concern#getStrategies()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.Concern#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see ConcernModel.Concern#getComponents()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Components();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.Concern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConcernModel.Concern#getName()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.Concern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ConcernModel.Concern#getDescription()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.Concern#getAnnotationtarget <em>Annotationtarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotationtarget</em>'.
	 * @see ConcernModel.Concern#getAnnotationtarget()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Annotationtarget();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.Concern#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ConcernModel.Concern#getConstraints()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Constraints();

	/**
	 * Returns the meta object for class '{@link ConcernModel.ConcernStrategy <em>Concern Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Strategy</em>'.
	 * @see ConcernModel.ConcernStrategy
	 * @generated
	 */
	EClass getConcernStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.ConcernStrategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConcernModel.ConcernStrategy#getName()
	 * @see #getConcernStrategy()
	 * @generated
	 */
	EAttribute getConcernStrategy_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.ConcernStrategy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ConcernModel.ConcernStrategy#getDescription()
	 * @see #getConcernStrategy()
	 * @generated
	 */
	EAttribute getConcernStrategy_Description();

	/**
	 * Returns the meta object for the reference list '{@link ConcernModel.ConcernStrategy#getConcernSolutions <em>Concern Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concern Solutions</em>'.
	 * @see ConcernModel.ConcernStrategy#getConcernSolutions()
	 * @see #getConcernStrategy()
	 * @generated
	 */
	EReference getConcernStrategy_ConcernSolutions();

	/**
	 * Returns the meta object for class '{@link ConcernModel.ElementaryConcernComponent <em>Elementary Concern Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Concern Component</em>'.
	 * @see ConcernModel.ElementaryConcernComponent
	 * @generated
	 */
	EClass getElementaryConcernComponent();

	/**
	 * Returns the meta object for the reference list '{@link ConcernModel.ElementaryConcernComponent#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see ConcernModel.ElementaryConcernComponent#getRequires()
	 * @see #getElementaryConcernComponent()
	 * @generated
	 */
	EReference getElementaryConcernComponent_Requires();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.ElementaryConcernComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConcernModel.ElementaryConcernComponent#getName()
	 * @see #getElementaryConcernComponent()
	 * @generated
	 */
	EAttribute getElementaryConcernComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.ElementaryConcernComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ConcernModel.ElementaryConcernComponent#getDescription()
	 * @see #getElementaryConcernComponent()
	 * @generated
	 */
	EAttribute getElementaryConcernComponent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ConcernModel.ElementaryConcernComponent#getAnnotationenrich <em>Annotationenrich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotationenrich</em>'.
	 * @see ConcernModel.ElementaryConcernComponent#getAnnotationenrich()
	 * @see #getElementaryConcernComponent()
	 * @generated
	 */
	EReference getElementaryConcernComponent_Annotationenrich();

	/**
	 * Returns the meta object for class '{@link ConcernModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ConcernModel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConcernModel.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.Annotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ConcernModel.Annotation#getDescription()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Description();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.Annotation#getMaxAmount <em>Max Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Amount</em>'.
	 * @see ConcernModel.Annotation#getMaxAmount()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_MaxAmount();

	/**
	 * Returns the meta object for class '{@link ConcernModel.AnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Target</em>'.
	 * @see ConcernModel.AnnotationTarget
	 * @generated
	 */
	EClass getAnnotationTarget();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.AnnotationTarget#getJoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Point</em>'.
	 * @see ConcernModel.AnnotationTarget#getJoinPoint()
	 * @see #getAnnotationTarget()
	 * @generated
	 */
	EAttribute getAnnotationTarget_JoinPoint();

	/**
	 * Returns the meta object for class '{@link ConcernModel.AnnotationEnrich <em>Annotation Enrich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Enrich</em>'.
	 * @see ConcernModel.AnnotationEnrich
	 * @generated
	 */
	EClass getAnnotationEnrich();

	/**
	 * Returns the meta object for class '{@link ConcernModel.DeploymentConstraint <em>Deployment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Constraint</em>'.
	 * @see ConcernModel.DeploymentConstraint
	 * @generated
	 */
	EClass getDeploymentConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ConcernModel.DeploymentConstraint#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association</em>'.
	 * @see ConcernModel.DeploymentConstraint#getAssociation()
	 * @see #getDeploymentConstraint()
	 * @generated
	 */
	EAttribute getDeploymentConstraint_Association();

	/**
	 * Returns the meta object for the reference list '{@link ConcernModel.DeploymentConstraint#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see ConcernModel.DeploymentConstraint#getAnnotations()
	 * @see #getDeploymentConstraint()
	 * @generated
	 */
	EReference getDeploymentConstraint_Annotations();

	/**
	 * Returns the meta object for enum '{@link ConcernModel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association</em>'.
	 * @see ConcernModel.Association
	 * @generated
	 */
	EEnum getAssociation();

	/**
	 * Returns the meta object for enum '{@link ConcernModel.JoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Point</em>'.
	 * @see ConcernModel.JoinPoint
	 * @generated
	 */
	EEnum getJoinPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConcernModelFactory getConcernModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ConcernModel.impl.ConcernRepositoryImpl <em>Concern Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.ConcernRepositoryImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcernRepository()
		 * @generated
		 */
		EClass CONCERN_REPOSITORY = eINSTANCE.getConcernRepository();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN_REPOSITORY__CONCERNS = eINSTANCE.getConcernRepository_Concerns();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.ConcernImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__STRATEGIES = eINSTANCE.getConcern_Strategies();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__COMPONENTS = eINSTANCE.getConcern_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN__NAME = eINSTANCE.getConcern_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN__DESCRIPTION = eINSTANCE.getConcern_Description();

		/**
		 * The meta object literal for the '<em><b>Annotationtarget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__ANNOTATIONTARGET = eINSTANCE.getConcern_Annotationtarget();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__CONSTRAINTS = eINSTANCE.getConcern_Constraints();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.ConcernStrategyImpl <em>Concern Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.ConcernStrategyImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getConcernStrategy()
		 * @generated
		 */
		EClass CONCERN_STRATEGY = eINSTANCE.getConcernStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_STRATEGY__NAME = eINSTANCE.getConcernStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_STRATEGY__DESCRIPTION = eINSTANCE.getConcernStrategy_Description();

		/**
		 * The meta object literal for the '<em><b>Concern Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN_STRATEGY__CONCERN_SOLUTIONS = eINSTANCE.getConcernStrategy_ConcernSolutions();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.ElementaryConcernComponentImpl <em>Elementary Concern Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.ElementaryConcernComponentImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getElementaryConcernComponent()
		 * @generated
		 */
		EClass ELEMENTARY_CONCERN_COMPONENT = eINSTANCE.getElementaryConcernComponent();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CONCERN_COMPONENT__REQUIRES = eINSTANCE.getElementaryConcernComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_CONCERN_COMPONENT__NAME = eINSTANCE.getElementaryConcernComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION = eINSTANCE.getElementaryConcernComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Annotationenrich</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH = eINSTANCE.getElementaryConcernComponent_Annotationenrich();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.AnnotationImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DESCRIPTION = eINSTANCE.getAnnotation_Description();

		/**
		 * The meta object literal for the '<em><b>Max Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__MAX_AMOUNT = eINSTANCE.getAnnotation_MaxAmount();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.AnnotationTargetImpl <em>Annotation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.AnnotationTargetImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotationTarget()
		 * @generated
		 */
		EClass ANNOTATION_TARGET = eINSTANCE.getAnnotationTarget();

		/**
		 * The meta object literal for the '<em><b>Join Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TARGET__JOIN_POINT = eINSTANCE.getAnnotationTarget_JoinPoint();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.AnnotationEnrichImpl <em>Annotation Enrich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.AnnotationEnrichImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getAnnotationEnrich()
		 * @generated
		 */
		EClass ANNOTATION_ENRICH = eINSTANCE.getAnnotationEnrich();

		/**
		 * The meta object literal for the '{@link ConcernModel.impl.DeploymentConstraintImpl <em>Deployment Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.impl.DeploymentConstraintImpl
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getDeploymentConstraint()
		 * @generated
		 */
		EClass DEPLOYMENT_CONSTRAINT = eINSTANCE.getDeploymentConstraint();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINT__ASSOCIATION = eINSTANCE.getDeploymentConstraint_Association();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_CONSTRAINT__ANNOTATIONS = eINSTANCE.getDeploymentConstraint_Annotations();

		/**
		 * The meta object literal for the '{@link ConcernModel.Association <em>Association</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.Association
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getAssociation()
		 * @generated
		 */
		EEnum ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link ConcernModel.JoinPoint <em>Join Point</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConcernModel.JoinPoint
		 * @see ConcernModel.impl.ConcernModelPackageImpl#getJoinPoint()
		 * @generated
		 */
		EEnum JOIN_POINT = eINSTANCE.getJoinPoint();

	}

} //ConcernModelPackage
