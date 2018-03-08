/**
 */
package ConcernModel.util;

import ConcernModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ConcernModel.ConcernModelPackage
 * @generated
 */
public class ConcernModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConcernModelValidator INSTANCE = new ConcernModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ConcernModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ConcernModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ConcernModelPackage.CONCERN_REPOSITORY:
				return validateConcernRepository((ConcernRepository)value, diagnostics, context);
			case ConcernModelPackage.CONCERN:
				return validateConcern((Concern)value, diagnostics, context);
			case ConcernModelPackage.CONCERN_STRATEGY:
				return validateConcernStrategy((ConcernStrategy)value, diagnostics, context);
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT:
				return validateElementaryConcernComponent((ElementaryConcernComponent)value, diagnostics, context);
			case ConcernModelPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case ConcernModelPackage.ANNOTATION_TARGET:
				return validateAnnotationTarget((AnnotationTarget)value, diagnostics, context);
			case ConcernModelPackage.ANNOTATION_ENRICH:
				return validateAnnotationEnrich((AnnotationEnrich)value, diagnostics, context);
			case ConcernModelPackage.DEPLOYMENT_CONSTRAINT:
				return validateDeploymentConstraint((DeploymentConstraint)value, diagnostics, context);
			case ConcernModelPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ConcernModelPackage.JOIN_POINT:
				return validateJoinPoint((JoinPoint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernRepository(ConcernRepository concernRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concernRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcern(Concern concern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernStrategy(ConcernStrategy concernStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concernStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementaryConcernComponent(ElementaryConcernComponent elementaryConcernComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementaryConcernComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationTarget(AnnotationTarget annotationTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationEnrich(AnnotationEnrich annotationEnrich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationEnrich, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConstraint(DeploymentConstraint deploymentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentConstraint_isolation(deploymentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentConstraint_togetherSeparated(deploymentConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isolation constraint of '<em>Deployment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPLOYMENT_CONSTRAINT__ISOLATION__EEXPRESSION = "\n" +
		"\t\tself.association = 'ISOLATED' implies\n" +
		"\t\t\tself.annotations->size() = 1";

	/**
	 * Validates the isolation constraint of '<em>Deployment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConstraint_isolation(DeploymentConstraint deploymentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConcernModelPackage.Literals.DEPLOYMENT_CONSTRAINT,
				 deploymentConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isolation",
				 DEPLOYMENT_CONSTRAINT__ISOLATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the togetherSeparated constraint of '<em>Deployment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPLOYMENT_CONSTRAINT__TOGETHER_SEPARATED__EEXPRESSION = "\n" +
		"\t\tself.association = 'TOGETHER' or self.association = 'SEPARATED' implies\n" +
		"\t\t\tself.annotations->size() > 1";

	/**
	 * Validates the togetherSeparated constraint of '<em>Deployment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConstraint_togetherSeparated(DeploymentConstraint deploymentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConcernModelPackage.Literals.DEPLOYMENT_CONSTRAINT,
				 deploymentConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "togetherSeparated",
				 DEPLOYMENT_CONSTRAINT__TOGETHER_SEPARATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinPoint(JoinPoint joinPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ConcernModelValidator
