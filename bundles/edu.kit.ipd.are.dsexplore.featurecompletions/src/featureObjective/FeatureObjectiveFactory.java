/**
 */
package featureObjective;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see featureObjective.FeatureObjectivePackage
 * @generated
 */
public interface FeatureObjectiveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureObjectiveFactory eINSTANCE = featureObjective.impl.FeatureObjectiveFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Objective</em>'.
	 * @generated
	 */
	FeatureObjective createFeatureObjective();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Group</em>'.
	 * @generated
	 */
	FeatureGroup createFeatureGroup();

	/**
	 * Returns a new object of class '<em>Required Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Constraint</em>'.
	 * @generated
	 */
	RequiredConstraint createRequiredConstraint();

	/**
	 * Returns a new object of class '<em>Prohibits Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prohibits Constraint</em>'.
	 * @generated
	 */
	ProhibitsConstraint createProhibitsConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureObjectivePackage getFeatureObjectivePackage();

} //FeatureObjectiveFactory
