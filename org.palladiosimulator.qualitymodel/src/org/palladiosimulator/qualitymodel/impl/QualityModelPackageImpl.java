/**
 */
package org.palladiosimulator.qualitymodel.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.qualitymodel.Mapping;
import org.palladiosimulator.qualitymodel.MappingEntry;
import org.palladiosimulator.qualitymodel.MappingRepository;
import org.palladiosimulator.qualitymodel.Nqr;
import org.palladiosimulator.qualitymodel.NqrRepository;
import org.palladiosimulator.qualitymodel.QualityModelFactory;
import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.QuantityReduction;
import org.palladiosimulator.qualitymodel.Reasoning;
import org.palladiosimulator.qualitymodel.ReasoningComponent;
import org.palladiosimulator.qualitymodel.ReasoningRepository;
import org.palladiosimulator.qualitymodel.ReasoningSystem;
import org.palladiosimulator.qualitymodel.Reduction;
import org.palladiosimulator.qualitymodel.StatisticReduction;
import org.palladiosimulator.qualitymodel.Transformation;
import org.palladiosimulator.qualitymodel.TransformationRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelPackageImpl extends EPackageImpl implements QualityModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nqrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityReductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticReductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nqrRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningSystemEClass = null;

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
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualityModelPackageImpl() {
		super(eNS_URI, QualityModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QualityModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualityModelPackage init() {
		if (isInited) return (QualityModelPackage)EPackage.Registry.INSTANCE.getEPackage(QualityModelPackage.eNS_URI);

		// Obtain or create and register package
		QualityModelPackageImpl theQualityModelPackage = (QualityModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualityModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualityModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QMLDeclarationsPackage.eINSTANCE.eClass();
		QMLContractPackage.eINSTANCE.eClass();
		QMLContractTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQualityModelPackage.createPackageContents();

		// Initialize created meta-data
		theQualityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualityModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualityModelPackage.eNS_URI, theQualityModelPackage);
		return theQualityModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNqr() {
		return nqrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNqr_Value() {
		return (EReference)nqrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNqr_Dimension() {
		return (EReference)nqrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_MappingEntries() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Identity() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Mapping() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Input() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoning() {
		return reasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoning_Transformations() {
		return (EReference)reasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoning_Output() {
		return (EReference)reasoningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduction() {
		return reductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityReduction() {
		return quantityReductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityReduction_Mapping() {
		return (EReference)quantityReductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatisticReduction() {
		return statisticReductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingRepository() {
		return mappingRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingRepository_Mappings() {
		return (EReference)mappingRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingEntry() {
		return mappingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_Value() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingEntry_Key() {
		return (EReference)mappingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationRepository() {
		return transformationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationRepository_Transformations() {
		return (EReference)transformationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningRepository() {
		return reasoningRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningRepository_Reasonings() {
		return (EReference)reasoningRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNqrRepository() {
		return nqrRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNqrRepository_Nqrs() {
		return (EReference)nqrRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningComponent() {
		return reasoningComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningComponent_Nqrs() {
		return (EReference)reasoningComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningComponent_Reasonings() {
		return (EReference)reasoningComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningComponent_Component() {
		return (EReference)reasoningComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningSystem() {
		return reasoningSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningSystem_Components() {
		return (EReference)reasoningSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelFactory getQualityModelFactory() {
		return (QualityModelFactory)getEFactoryInstance();
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
		nqrEClass = createEClass(NQR);
		createEReference(nqrEClass, NQR__VALUE);
		createEReference(nqrEClass, NQR__DIMENSION);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__MAPPING_ENTRIES);
		createEReference(mappingEClass, MAPPING__IDENTITY);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__MAPPING);
		createEReference(transformationEClass, TRANSFORMATION__INPUT);

		reasoningEClass = createEClass(REASONING);
		createEReference(reasoningEClass, REASONING__TRANSFORMATIONS);
		createEReference(reasoningEClass, REASONING__OUTPUT);

		reductionEClass = createEClass(REDUCTION);

		quantityReductionEClass = createEClass(QUANTITY_REDUCTION);
		createEReference(quantityReductionEClass, QUANTITY_REDUCTION__MAPPING);

		statisticReductionEClass = createEClass(STATISTIC_REDUCTION);

		mappingRepositoryEClass = createEClass(MAPPING_REPOSITORY);
		createEReference(mappingRepositoryEClass, MAPPING_REPOSITORY__MAPPINGS);

		mappingEntryEClass = createEClass(MAPPING_ENTRY);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__VALUE);
		createEReference(mappingEntryEClass, MAPPING_ENTRY__KEY);

		transformationRepositoryEClass = createEClass(TRANSFORMATION_REPOSITORY);
		createEReference(transformationRepositoryEClass, TRANSFORMATION_REPOSITORY__TRANSFORMATIONS);

		reasoningRepositoryEClass = createEClass(REASONING_REPOSITORY);
		createEReference(reasoningRepositoryEClass, REASONING_REPOSITORY__REASONINGS);

		nqrRepositoryEClass = createEClass(NQR_REPOSITORY);
		createEReference(nqrRepositoryEClass, NQR_REPOSITORY__NQRS);

		reasoningComponentEClass = createEClass(REASONING_COMPONENT);
		createEReference(reasoningComponentEClass, REASONING_COMPONENT__NQRS);
		createEReference(reasoningComponentEClass, REASONING_COMPONENT__REASONINGS);
		createEReference(reasoningComponentEClass, REASONING_COMPONENT__COMPONENT);

		reasoningSystemEClass = createEClass(REASONING_SYSTEM);
		createEReference(reasoningSystemEClass, REASONING_SYSTEM__COMPONENTS);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		QMLContractPackage theQMLContractPackage = (QMLContractPackage)EPackage.Registry.INSTANCE.getEPackage(QMLContractPackage.eNS_URI);
		QMLContractTypePackage theQMLContractTypePackage = (QMLContractTypePackage)EPackage.Registry.INSTANCE.getEPackage(QMLContractTypePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Add supertypes to classes
		nqrEClass.getESuperTypes().add(theEntityPackage.getEntity());
		mappingEClass.getESuperTypes().add(theEntityPackage.getEntity());
		transformationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		reasoningEClass.getESuperTypes().add(theEntityPackage.getEntity());
		reductionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		quantityReductionEClass.getESuperTypes().add(this.getReduction());
		statisticReductionEClass.getESuperTypes().add(this.getReduction());
		mappingEntryEClass.getESuperTypes().add(theEntityPackage.getEntity());
		reasoningComponentEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(nqrEClass, Nqr.class, "Nqr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNqr_Value(), theQMLContractPackage.getValueLiteral(), null, "value", null, 1, 1, Nqr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNqr_Dimension(), theQMLContractTypePackage.getDimension(), null, "dimension", null, 1, 1, Nqr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(nqrEClass, ecorePackage.getEString(), "toString", 0, 1);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_MappingEntries(), this.getMappingEntry(), null, "mappingEntries", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Identity(), theQMLContractPackage.getValueLiteral(), null, "identity", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mappingEClass, ecorePackage.getEString(), "toString", 0, 1);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Mapping(), this.getMapping(), null, "mapping", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Input(), theQMLContractTypePackage.getDimension(), null, "input", null, 1, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasoningEClass, Reasoning.class, "Reasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoning_Transformations(), this.getTransformation(), null, "transformations", null, 1, -1, Reasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReasoning_Output(), theQMLContractTypePackage.getDimension(), null, "output", null, 1, 1, Reasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionEClass, Reduction.class, "Reduction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityReductionEClass, QuantityReduction.class, "QuantityReduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityReduction_Mapping(), this.getMapping(), null, "mapping", null, 1, 1, QuantityReduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticReductionEClass, StatisticReduction.class, "StatisticReduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingRepositoryEClass, MappingRepository.class, "MappingRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingRepository_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, MappingRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mappingEntryEClass, MappingEntry.class, "MappingEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingEntry_Value(), theQMLContractPackage.getValueLiteral(), null, "value", null, 1, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingEntry_Key(), theQMLContractPackage.getValueLiteral(), null, "key", null, 1, -1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mappingEntryEClass, ecorePackage.getEString(), "toString", 0, 1);

		initEClass(transformationRepositoryEClass, TransformationRepository.class, "TransformationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationRepository_Transformations(), this.getTransformation(), null, "transformations", null, 0, -1, TransformationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasoningRepositoryEClass, ReasoningRepository.class, "ReasoningRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoningRepository_Reasonings(), this.getReasoning(), null, "reasonings", null, 0, -1, ReasoningRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nqrRepositoryEClass, NqrRepository.class, "NqrRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNqrRepository_Nqrs(), this.getNqr(), null, "nqrs", null, 0, -1, NqrRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasoningComponentEClass, ReasoningComponent.class, "ReasoningComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoningComponent_Nqrs(), this.getNqr(), null, "nqrs", null, 0, -1, ReasoningComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReasoningComponent_Reasonings(), this.getReasoning(), null, "reasonings", null, 0, -1, ReasoningComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReasoningComponent_Component(), theRepositoryPackage.getRepositoryComponent(), null, "component", null, 1, 1, ReasoningComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasoningSystemEClass, ReasoningSystem.class, "ReasoningSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoningSystem_Components(), this.getReasoningComponent(), null, "components", null, 0, -1, ReasoningSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getTransformation_Input(), 
		   source, 
		   new String[] {
			 "name", "input",
			 "namespace", ""
		   });
	}

} //QualityModelPackageImpl
