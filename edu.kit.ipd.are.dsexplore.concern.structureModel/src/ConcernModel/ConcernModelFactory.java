/**
 */
package ConcernModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ConcernModel.ConcernModelPackage
 * @generated
 */
public interface ConcernModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcernModelFactory eINSTANCE = ConcernModel.impl.ConcernModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concern Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Repository</em>'.
	 * @generated
	 */
	ConcernRepository createConcernRepository();

	/**
	 * Returns a new object of class '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern</em>'.
	 * @generated
	 */
	Concern createConcern();

	/**
	 * Returns a new object of class '<em>Concern Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Strategy</em>'.
	 * @generated
	 */
	ConcernStrategy createConcernStrategy();

	/**
	 * Returns a new object of class '<em>Elementary Concern Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Concern Component</em>'.
	 * @generated
	 */
	ElementaryConcernComponent createElementaryConcernComponent();

	/**
	 * Returns a new object of class '<em>Annotation Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Target</em>'.
	 * @generated
	 */
	AnnotationTarget createAnnotationTarget();

	/**
	 * Returns a new object of class '<em>Annotation Enrich</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Enrich</em>'.
	 * @generated
	 */
	AnnotationEnrich createAnnotationEnrich();

	/**
	 * Returns a new object of class '<em>Deployment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Constraint</em>'.
	 * @generated
	 */
	DeploymentConstraint createDeploymentConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConcernModelPackage getConcernModelPackage();

} //ConcernModelFactory
