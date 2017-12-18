/**
 */
package featureSolution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see featureSolution.FeatureSolutionPackage
 * @generated
 */
public interface FeatureSolutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureSolutionFactory eINSTANCE = featureSolution.impl.FeatureSolutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solution Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Repository</em>'.
	 * @generated
	 */
	SolutionRepository createSolutionRepository();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Adapter Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Inclusion</em>'.
	 * @generated
	 */
	AdapterInclusion createAdapterInclusion();

	/**
	 * Returns a new object of class '<em>Extension Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Inclusion</em>'.
	 * @generated
	 */
	ExtensionInclusion createExtensionInclusion();

	/**
	 * Returns a new object of class '<em>Solution Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Component</em>'.
	 * @generated
	 */
	SolutionComponent createSolutionComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureSolutionPackage getFeatureSolutionPackage();

} //FeatureSolutionFactory
