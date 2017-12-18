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
	 * Returns a new object of class '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple</em>'.
	 * @generated
	 */
	Simple createSimple();

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
	 * Returns a new object of class '<em>Integer Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Interval Range</em>'.
	 * @generated
	 */
	IntegerIntervalRange createIntegerIntervalRange();

	/**
	 * Returns a new object of class '<em>Integer Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Attribute</em>'.
	 * @generated
	 */
	IntegerAttribute createIntegerAttribute();

	/**
	 * Returns a new object of class '<em>Double Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Attribute</em>'.
	 * @generated
	 */
	DoubleAttribute createDoubleAttribute();

	/**
	 * Returns a new object of class '<em>String Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Attribute</em>'.
	 * @generated
	 */
	StringAttribute createStringAttribute();

	/**
	 * Returns a new object of class '<em>External Object Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Object Attribute</em>'.
	 * @generated
	 */
	ExternalObjectAttribute createExternalObjectAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureObjectivePackage getFeatureObjectivePackage();

} //FeatureObjectiveFactory
