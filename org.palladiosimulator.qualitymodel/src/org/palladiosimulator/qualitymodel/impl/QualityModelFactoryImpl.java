/**
 */
package org.palladiosimulator.qualitymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.qualitymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelFactoryImpl extends EFactoryImpl implements QualityModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityModelFactory init() {
		try {
			QualityModelFactory theQualityModelFactory = (QualityModelFactory)EPackage.Registry.INSTANCE.getEFactory(QualityModelPackage.eNS_URI);
			if (theQualityModelFactory != null) {
				return theQualityModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QualityModelPackage.NQR: return createNqr();
			case QualityModelPackage.MAPPING: return createMapping();
			case QualityModelPackage.TRANSFORMATION: return createTransformation();
			case QualityModelPackage.REASONING: return createReasoning();
			case QualityModelPackage.QUANTITY_REDUCTION: return createQuantityReduction();
			case QualityModelPackage.STATISTIC_REDUCTION: return createStatisticReduction();
			case QualityModelPackage.MAPPING_REPOSITORY: return createMappingRepository();
			case QualityModelPackage.MAPPING_ENTRY: return createMappingEntry();
			case QualityModelPackage.TRANSFORMATION_REPOSITORY: return createTransformationRepository();
			case QualityModelPackage.REASONING_REPOSITORY: return createReasoningRepository();
			case QualityModelPackage.NQR_REPOSITORY: return createNqrRepository();
			case QualityModelPackage.REASONING_COMPONENT: return createReasoningComponent();
			case QualityModelPackage.REASONING_SYSTEM: return createReasoningSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nqr createNqr() {
		NqrImpl nqr = new NqrImpl();
		return nqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reasoning createReasoning() {
		ReasoningImpl reasoning = new ReasoningImpl();
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityReduction createQuantityReduction() {
		QuantityReductionImpl quantityReduction = new QuantityReductionImpl();
		return quantityReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticReduction createStatisticReduction() {
		StatisticReductionImpl statisticReduction = new StatisticReductionImpl();
		return statisticReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRepository createMappingRepository() {
		MappingRepositoryImpl mappingRepository = new MappingRepositoryImpl();
		return mappingRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry createMappingEntry() {
		MappingEntryImpl mappingEntry = new MappingEntryImpl();
		return mappingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRepository createTransformationRepository() {
		TransformationRepositoryImpl transformationRepository = new TransformationRepositoryImpl();
		return transformationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningRepository createReasoningRepository() {
		ReasoningRepositoryImpl reasoningRepository = new ReasoningRepositoryImpl();
		return reasoningRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrRepository createNqrRepository() {
		NqrRepositoryImpl nqrRepository = new NqrRepositoryImpl();
		return nqrRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningComponent createReasoningComponent() {
		ReasoningComponentImpl reasoningComponent = new ReasoningComponentImpl();
		return reasoningComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningSystem createReasoningSystem() {
		ReasoningSystemImpl reasoningSystem = new ReasoningSystemImpl();
		return reasoningSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelPackage getQualityModelPackage() {
		return (QualityModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static QualityModelPackage getPackage() {
		return QualityModelPackage.eINSTANCE;
	}

} //QualityModelFactoryImpl
