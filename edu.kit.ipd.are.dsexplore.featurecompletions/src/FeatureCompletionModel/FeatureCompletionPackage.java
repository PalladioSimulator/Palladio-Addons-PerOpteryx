/**
 */
package FeatureCompletionModel;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' featureObjective='featureObjective.ecore#/' identifier='../../de.uka.ipd.sdq.identifier/model/identifier.ecore#/' pcm='../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FeatureCompletionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FeatureCompletionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/FeatureCompletionModel/1.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FeatureCompletion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureCompletionPackage eINSTANCE = FeatureCompletionModel.impl.FeatureCompletionPackageImpl.init();

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.FeatureCompletionRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.FeatureCompletionRepositoryImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getFeatureCompletionRepository()
	 * @generated
	 */
	int FEATURE_COMPLETION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Feature Completions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.NamedElementImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.DescribedElementImpl <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.DescribedElementImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.FeatureCompletionImpl <em>Feature Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.FeatureCompletionImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getFeatureCompletion()
	 * @generated
	 */
	int FEATURE_COMPLETION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature Objectives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__FEATURE_OBJECTIVES = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Completion Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__COMPLETION_COMPONENTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complementa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__COMPLEMENTA = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Architecture Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COMPLETION_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.ConstrainableElementImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.CompletionComponentImpl <em>Completion Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.CompletionComponentImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getCompletionComponent()
	 * @generated
	 */
	int COMPLETION_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__ID = CONSTRAINABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__NAME = CONSTRAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__DESCRIPTION = CONSTRAINABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__REQUIRED_COMPONENTS = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perimeter Providing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__PERIMETER_PROVIDING = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perimeter Requiring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT__PERIMETER_REQUIRING = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Completion Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_COMPONENT_FEATURE_COUNT = CONSTRAINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.PerimeterProvidingImpl <em>Perimeter Providing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.PerimeterProvidingImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPerimeterProviding()
	 * @generated
	 */
	int PERIMETER_PROVIDING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_PROVIDING__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_PROVIDING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Feature Providing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_PROVIDING__FEATURE_PROVIDING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perimeter Providing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_PROVIDING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.ComplementumImpl <em>Complementum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.ComplementumImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getComplementum()
	 * @generated
	 */
	int COMPLEMENTUM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM__REPLICATION = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visnetum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM__VISNETUM = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complementum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.ComplementumVisnetisImpl <em>Complementum Visnetis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.ComplementumVisnetisImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getComplementumVisnetis()
	 * @generated
	 */
	int COMPLEMENTUM_VISNETIS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__ID = COMPLEMENTUM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__NAME = COMPLEMENTUM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__DESCRIPTION = COMPLEMENTUM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__REPLICATION = COMPLEMENTUM__REPLICATION;

	/**
	 * The feature id for the '<em><b>Visnetum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__VISNETUM = COMPLEMENTUM__VISNETUM;

	/**
	 * The feature id for the '<em><b>Complementary Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE = COMPLEMENTUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Complementum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS__REQUIRES_COMPLEMENTUM = COMPLEMENTUM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complementum Visnetis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTUM_VISNETIS_FEATURE_COUNT = COMPLEMENTUM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.ArchitectureConstraintsImpl <em>Architecture Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.ArchitectureConstraintsImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getArchitectureConstraints()
	 * @generated
	 */
	int ARCHITECTURE_CONSTRAINTS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS__CONSTRAINT = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Architecture Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_CONSTRAINTS_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.impl.PerimeterRequiringImpl <em>Perimeter Requiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.impl.PerimeterRequiringImpl
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPerimeterRequiring()
	 * @generated
	 */
	int PERIMETER_REQUIRING = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_REQUIRING__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_REQUIRING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Complementum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_REQUIRING__COMPLEMENTUM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perimeter Requiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIMETER_REQUIRING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.Visnetum <em>Visnetum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.Visnetum
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getVisnetum()
	 * @generated
	 */
	int VISNETUM = 11;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.Replication <em>Replication</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.Replication
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getReplication()
	 * @generated
	 */
	int REPLICATION = 12;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.Constraint <em>Constraint</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.Constraint
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The meta object id for the '{@link FeatureCompletionModel.PlacementPolicy <em>Placement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureCompletionModel.PlacementPolicy
	 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPlacementPolicy()
	 * @generated
	 */
	int PLACEMENT_POLICY = 14;


	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.FeatureCompletionRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see FeatureCompletionModel.FeatureCompletionRepository
	 * @generated
	 */
	EClass getFeatureCompletionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureCompletionModel.FeatureCompletionRepository#getFeatureCompletions <em>Feature Completions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Completions</em>'.
	 * @see FeatureCompletionModel.FeatureCompletionRepository#getFeatureCompletions()
	 * @see #getFeatureCompletionRepository()
	 * @generated
	 */
	EReference getFeatureCompletionRepository_FeatureCompletions();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.FeatureCompletion <em>Feature Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Completion</em>'.
	 * @see FeatureCompletionModel.FeatureCompletion
	 * @generated
	 */
	EClass getFeatureCompletion();

	/**
	 * Returns the meta object for the reference '{@link FeatureCompletionModel.FeatureCompletion#getFeatureObjectives <em>Feature Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Objectives</em>'.
	 * @see FeatureCompletionModel.FeatureCompletion#getFeatureObjectives()
	 * @see #getFeatureCompletion()
	 * @generated
	 */
	EReference getFeatureCompletion_FeatureObjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureCompletionModel.FeatureCompletion#getCompletionComponents <em>Completion Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Completion Components</em>'.
	 * @see FeatureCompletionModel.FeatureCompletion#getCompletionComponents()
	 * @see #getFeatureCompletion()
	 * @generated
	 */
	EReference getFeatureCompletion_CompletionComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureCompletionModel.FeatureCompletion#getComplementa <em>Complementa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complementa</em>'.
	 * @see FeatureCompletionModel.FeatureCompletion#getComplementa()
	 * @see #getFeatureCompletion()
	 * @generated
	 */
	EReference getFeatureCompletion_Complementa();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureCompletionModel.FeatureCompletion#getArchitectureConstraints <em>Architecture Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecture Constraints</em>'.
	 * @see FeatureCompletionModel.FeatureCompletion#getArchitectureConstraints()
	 * @see #getFeatureCompletion()
	 * @generated
	 */
	EReference getFeatureCompletion_ArchitectureConstraints();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.CompletionComponent <em>Completion Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Component</em>'.
	 * @see FeatureCompletionModel.CompletionComponent
	 * @generated
	 */
	EClass getCompletionComponent();

	/**
	 * Returns the meta object for the reference list '{@link FeatureCompletionModel.CompletionComponent#getRequiredComponents <em>Required Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Components</em>'.
	 * @see FeatureCompletionModel.CompletionComponent#getRequiredComponents()
	 * @see #getCompletionComponent()
	 * @generated
	 */
	EReference getCompletionComponent_RequiredComponents();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureCompletionModel.CompletionComponent#getPerimeterProviding <em>Perimeter Providing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perimeter Providing</em>'.
	 * @see FeatureCompletionModel.CompletionComponent#getPerimeterProviding()
	 * @see #getCompletionComponent()
	 * @generated
	 */
	EReference getCompletionComponent_PerimeterProviding();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureCompletionModel.CompletionComponent#getComponentConstraints <em>Component Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Constraints</em>'.
	 * @see FeatureCompletionModel.CompletionComponent#getComponentConstraints()
	 * @see #getCompletionComponent()
	 * @generated
	 */
	EReference getCompletionComponent_ComponentConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureCompletionModel.CompletionComponent#getPerimeterRequiring <em>Perimeter Requiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perimeter Requiring</em>'.
	 * @see FeatureCompletionModel.CompletionComponent#getPerimeterRequiring()
	 * @see #getCompletionComponent()
	 * @generated
	 */
	EReference getCompletionComponent_PerimeterRequiring();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see FeatureCompletionModel.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link FeatureCompletionModel.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FeatureCompletionModel.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see FeatureCompletionModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link FeatureCompletionModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FeatureCompletionModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.PerimeterProviding <em>Perimeter Providing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perimeter Providing</em>'.
	 * @see FeatureCompletionModel.PerimeterProviding
	 * @generated
	 */
	EClass getPerimeterProviding();

	/**
	 * Returns the meta object for the reference list '{@link FeatureCompletionModel.PerimeterProviding#getFeatureProviding <em>Feature Providing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Providing</em>'.
	 * @see FeatureCompletionModel.PerimeterProviding#getFeatureProviding()
	 * @see #getPerimeterProviding()
	 * @generated
	 */
	EReference getPerimeterProviding_FeatureProviding();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.ComplementumVisnetis <em>Complementum Visnetis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementum Visnetis</em>'.
	 * @see FeatureCompletionModel.ComplementumVisnetis
	 * @generated
	 */
	EClass getComplementumVisnetis();

	/**
	 * Returns the meta object for the reference '{@link FeatureCompletionModel.ComplementumVisnetis#getComplementaryFeature <em>Complementary Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complementary Feature</em>'.
	 * @see FeatureCompletionModel.ComplementumVisnetis#getComplementaryFeature()
	 * @see #getComplementumVisnetis()
	 * @generated
	 */
	EReference getComplementumVisnetis_ComplementaryFeature();

	/**
	 * Returns the meta object for the reference list '{@link FeatureCompletionModel.ComplementumVisnetis#getRequiresComplementum <em>Requires Complementum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Complementum</em>'.
	 * @see FeatureCompletionModel.ComplementumVisnetis#getRequiresComplementum()
	 * @see #getComplementumVisnetis()
	 * @generated
	 */
	EReference getComplementumVisnetis_RequiresComplementum();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.Complementum <em>Complementum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementum</em>'.
	 * @see FeatureCompletionModel.Complementum
	 * @generated
	 */
	EClass getComplementum();

	/**
	 * Returns the meta object for the attribute '{@link FeatureCompletionModel.Complementum#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see FeatureCompletionModel.Complementum#getReplication()
	 * @see #getComplementum()
	 * @generated
	 */
	EAttribute getComplementum_Replication();

	/**
	 * Returns the meta object for the attribute '{@link FeatureCompletionModel.Complementum#getVisnetum <em>Visnetum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visnetum</em>'.
	 * @see FeatureCompletionModel.Complementum#getVisnetum()
	 * @see #getComplementum()
	 * @generated
	 */
	EAttribute getComplementum_Visnetum();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.ArchitectureConstraints <em>Architecture Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Constraints</em>'.
	 * @see FeatureCompletionModel.ArchitectureConstraints
	 * @generated
	 */
	EClass getArchitectureConstraints();

	/**
	 * Returns the meta object for the attribute '{@link FeatureCompletionModel.ArchitectureConstraints#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see FeatureCompletionModel.ArchitectureConstraints#getConstraint()
	 * @see #getArchitectureConstraints()
	 * @generated
	 */
	EAttribute getArchitectureConstraints_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link FeatureCompletionModel.ArchitectureConstraints#getArchitectureElements <em>Architecture Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Architecture Elements</em>'.
	 * @see FeatureCompletionModel.ArchitectureConstraints#getArchitectureElements()
	 * @see #getArchitectureConstraints()
	 * @generated
	 */
	EReference getArchitectureConstraints_ArchitectureElements();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see FeatureCompletionModel.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for class '{@link FeatureCompletionModel.PerimeterRequiring <em>Perimeter Requiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perimeter Requiring</em>'.
	 * @see FeatureCompletionModel.PerimeterRequiring
	 * @generated
	 */
	EClass getPerimeterRequiring();

	/**
	 * Returns the meta object for the reference list '{@link FeatureCompletionModel.PerimeterRequiring#getComplementum <em>Complementum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Complementum</em>'.
	 * @see FeatureCompletionModel.PerimeterRequiring#getComplementum()
	 * @see #getPerimeterRequiring()
	 * @generated
	 */
	EReference getPerimeterRequiring_Complementum();

	/**
	 * Returns the meta object for enum '{@link FeatureCompletionModel.Visnetum <em>Visnetum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visnetum</em>'.
	 * @see FeatureCompletionModel.Visnetum
	 * @generated
	 */
	EEnum getVisnetum();

	/**
	 * Returns the meta object for enum '{@link FeatureCompletionModel.Replication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Replication</em>'.
	 * @see FeatureCompletionModel.Replication
	 * @generated
	 */
	EEnum getReplication();

	/**
	 * Returns the meta object for enum '{@link FeatureCompletionModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint</em>'.
	 * @see FeatureCompletionModel.Constraint
	 * @generated
	 */
	EEnum getConstraint();

	/**
	 * Returns the meta object for enum '{@link FeatureCompletionModel.PlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement Policy</em>'.
	 * @see FeatureCompletionModel.PlacementPolicy
	 * @generated
	 */
	EEnum getPlacementPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureCompletionFactory getFeatureCompletionFactory();

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
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.FeatureCompletionRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.FeatureCompletionRepositoryImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getFeatureCompletionRepository()
		 * @generated
		 */
		EClass FEATURE_COMPLETION_REPOSITORY = eINSTANCE.getFeatureCompletionRepository();

		/**
		 * The meta object literal for the '<em><b>Feature Completions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS = eINSTANCE.getFeatureCompletionRepository_FeatureCompletions();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.FeatureCompletionImpl <em>Feature Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.FeatureCompletionImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getFeatureCompletion()
		 * @generated
		 */
		EClass FEATURE_COMPLETION = eINSTANCE.getFeatureCompletion();

		/**
		 * The meta object literal for the '<em><b>Feature Objectives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COMPLETION__FEATURE_OBJECTIVES = eINSTANCE.getFeatureCompletion_FeatureObjectives();

		/**
		 * The meta object literal for the '<em><b>Completion Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COMPLETION__COMPLETION_COMPONENTS = eINSTANCE.getFeatureCompletion_CompletionComponents();

		/**
		 * The meta object literal for the '<em><b>Complementa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COMPLETION__COMPLEMENTA = eINSTANCE.getFeatureCompletion_Complementa();

		/**
		 * The meta object literal for the '<em><b>Architecture Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS = eINSTANCE.getFeatureCompletion_ArchitectureConstraints();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.CompletionComponentImpl <em>Completion Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.CompletionComponentImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getCompletionComponent()
		 * @generated
		 */
		EClass COMPLETION_COMPONENT = eINSTANCE.getCompletionComponent();

		/**
		 * The meta object literal for the '<em><b>Required Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_COMPONENT__REQUIRED_COMPONENTS = eINSTANCE.getCompletionComponent_RequiredComponents();

		/**
		 * The meta object literal for the '<em><b>Perimeter Providing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_COMPONENT__PERIMETER_PROVIDING = eINSTANCE.getCompletionComponent_PerimeterProviding();

		/**
		 * The meta object literal for the '<em><b>Component Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS = eINSTANCE.getCompletionComponent_ComponentConstraints();

		/**
		 * The meta object literal for the '<em><b>Perimeter Requiring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETION_COMPONENT__PERIMETER_REQUIRING = eINSTANCE.getCompletionComponent_PerimeterRequiring();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.DescribedElementImpl <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.DescribedElementImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.NamedElementImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.PerimeterProvidingImpl <em>Perimeter Providing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.PerimeterProvidingImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPerimeterProviding()
		 * @generated
		 */
		EClass PERIMETER_PROVIDING = eINSTANCE.getPerimeterProviding();

		/**
		 * The meta object literal for the '<em><b>Feature Providing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIMETER_PROVIDING__FEATURE_PROVIDING = eINSTANCE.getPerimeterProviding_FeatureProviding();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.ComplementumVisnetisImpl <em>Complementum Visnetis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.ComplementumVisnetisImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getComplementumVisnetis()
		 * @generated
		 */
		EClass COMPLEMENTUM_VISNETIS = eINSTANCE.getComplementumVisnetis();

		/**
		 * The meta object literal for the '<em><b>Complementary Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE = eINSTANCE.getComplementumVisnetis_ComplementaryFeature();

		/**
		 * The meta object literal for the '<em><b>Requires Complementum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTUM_VISNETIS__REQUIRES_COMPLEMENTUM = eINSTANCE.getComplementumVisnetis_RequiresComplementum();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.ComplementumImpl <em>Complementum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.ComplementumImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getComplementum()
		 * @generated
		 */
		EClass COMPLEMENTUM = eINSTANCE.getComplementum();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTUM__REPLICATION = eINSTANCE.getComplementum_Replication();

		/**
		 * The meta object literal for the '<em><b>Visnetum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTUM__VISNETUM = eINSTANCE.getComplementum_Visnetum();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.ArchitectureConstraintsImpl <em>Architecture Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.ArchitectureConstraintsImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getArchitectureConstraints()
		 * @generated
		 */
		EClass ARCHITECTURE_CONSTRAINTS = eINSTANCE.getArchitectureConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_CONSTRAINTS__CONSTRAINT = eINSTANCE.getArchitectureConstraints_Constraint();

		/**
		 * The meta object literal for the '<em><b>Architecture Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS = eINSTANCE.getArchitectureConstraints_ArchitectureElements();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.ConstrainableElementImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.impl.PerimeterRequiringImpl <em>Perimeter Requiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.impl.PerimeterRequiringImpl
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPerimeterRequiring()
		 * @generated
		 */
		EClass PERIMETER_REQUIRING = eINSTANCE.getPerimeterRequiring();

		/**
		 * The meta object literal for the '<em><b>Complementum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIMETER_REQUIRING__COMPLEMENTUM = eINSTANCE.getPerimeterRequiring_Complementum();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.Visnetum <em>Visnetum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.Visnetum
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getVisnetum()
		 * @generated
		 */
		EEnum VISNETUM = eINSTANCE.getVisnetum();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.Replication <em>Replication</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.Replication
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getReplication()
		 * @generated
		 */
		EEnum REPLICATION = eINSTANCE.getReplication();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.Constraint <em>Constraint</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.Constraint
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getConstraint()
		 * @generated
		 */
		EEnum CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link FeatureCompletionModel.PlacementPolicy <em>Placement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureCompletionModel.PlacementPolicy
		 * @see FeatureCompletionModel.impl.FeatureCompletionPackageImpl#getPlacementPolicy()
		 * @generated
		 */
		EEnum PLACEMENT_POLICY = eINSTANCE.getPlacementPolicy();

	}

} //FeatureCompletionPackage
