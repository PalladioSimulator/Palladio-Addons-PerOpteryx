/**
 */
package ConcernModel.impl;

import ConcernModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernModelFactoryImpl extends EFactoryImpl implements ConcernModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcernModelFactory init() {
		try {
			ConcernModelFactory theConcernModelFactory = (ConcernModelFactory)EPackage.Registry.INSTANCE.getEFactory(ConcernModelPackage.eNS_URI);
			if (theConcernModelFactory != null) {
				return theConcernModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcernModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcernModelPackage.CONCERN_REPOSITORY: return createConcernRepository();
			case ConcernModelPackage.CONCERN: return createConcern();
			case ConcernModelPackage.CONCERN_STRATEGY: return createConcernStrategy();
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT: return createElementaryConcernComponent();
			case ConcernModelPackage.ANNOTATION_TARGET: return createAnnotationTarget();
			case ConcernModelPackage.ANNOTATION_ENRICH: return createAnnotationEnrich();
			case ConcernModelPackage.DEPLOYMENT_CONSTRAINT: return createDeploymentConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConcernModelPackage.ASSOCIATION:
				return createAssociationFromString(eDataType, initialValue);
			case ConcernModelPackage.JOIN_POINT:
				return createJoinPointFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConcernModelPackage.ASSOCIATION:
				return convertAssociationToString(eDataType, instanceValue);
			case ConcernModelPackage.JOIN_POINT:
				return convertJoinPointToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernRepository createConcernRepository() {
		ConcernRepositoryImpl concernRepository = new ConcernRepositoryImpl();
		return concernRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concern createConcern() {
		ConcernImpl concern = new ConcernImpl();
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernStrategy createConcernStrategy() {
		ConcernStrategyImpl concernStrategy = new ConcernStrategyImpl();
		return concernStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryConcernComponent createElementaryConcernComponent() {
		ElementaryConcernComponentImpl elementaryConcernComponent = new ElementaryConcernComponentImpl();
		return elementaryConcernComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTarget createAnnotationTarget() {
		AnnotationTargetImpl annotationTarget = new AnnotationTargetImpl();
		return annotationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationEnrich createAnnotationEnrich() {
		AnnotationEnrichImpl annotationEnrich = new AnnotationEnrichImpl();
		return annotationEnrich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConstraint createDeploymentConstraint() {
		DeploymentConstraintImpl deploymentConstraint = new DeploymentConstraintImpl();
		return deploymentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociationFromString(EDataType eDataType, String initialValue) {
		Association result = Association.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPoint createJoinPointFromString(EDataType eDataType, String initialValue) {
		JoinPoint result = JoinPoint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoinPointToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelPackage getConcernModelPackage() {
		return (ConcernModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcernModelPackage getPackage() {
		return ConcernModelPackage.eINSTANCE;
	}

} //ConcernModelFactoryImpl
