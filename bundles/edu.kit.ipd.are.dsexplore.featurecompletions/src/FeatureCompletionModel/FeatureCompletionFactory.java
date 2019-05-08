/**
 */
package FeatureCompletionModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage
 * @generated
 */
public interface FeatureCompletionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureCompletionFactory eINSTANCE = FeatureCompletionModel.impl.FeatureCompletionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	FeatureCompletionRepository createFeatureCompletionRepository();

	/**
	 * Returns a new object of class '<em>Feature Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Completion</em>'.
	 * @generated
	 */
	FeatureCompletion createFeatureCompletion();

	/**
	 * Returns a new object of class '<em>Completion Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completion Component</em>'.
	 * @generated
	 */
	CompletionComponent createCompletionComponent();

	/**
	 * Returns a new object of class '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Described Element</em>'.
	 * @generated
	 */
	DescribedElement createDescribedElement();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Perimeter Providing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perimeter Providing</em>'.
	 * @generated
	 */
	PerimeterProviding createPerimeterProviding();

	/**
	 * Returns a new object of class '<em>Complementum Visnetis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complementum Visnetis</em>'.
	 * @generated
	 */
	ComplementumVisnetis createComplementumVisnetis();

	/**
	 * Returns a new object of class '<em>Complementum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complementum</em>'.
	 * @generated
	 */
	Complementum createComplementum();

	/**
	 * Returns a new object of class '<em>Architecture Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Constraints</em>'.
	 * @generated
	 */
	ArchitectureConstraints createArchitectureConstraints();

	/**
	 * Returns a new object of class '<em>Constrainable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrainable Element</em>'.
	 * @generated
	 */
	ConstrainableElement createConstrainableElement();

	/**
	 * Returns a new object of class '<em>Perimeter Requiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perimeter Requiring</em>'.
	 * @generated
	 */
	PerimeterRequiring createPerimeterRequiring();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureCompletionPackage getFeatureCompletionPackage();

} //FeatureCompletionFactory
