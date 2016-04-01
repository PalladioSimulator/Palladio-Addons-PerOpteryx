/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage
 * @generated
 */
public interface ProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfileFactory eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple QML Profile</em>'.
	 * @generated
	 */
	SimpleQMLProfile createSimpleQMLProfile();

	/**
	 * Returns a new object of class '<em>Refined QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refined QML Profile</em>'.
	 * @generated
	 */
	RefinedQMLProfile createRefinedQMLProfile();

	/**
	 * Returns a new object of class '<em>Usage Scenario Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Scenario Requirement</em>'.
	 * @generated
	 */
	UsageScenarioRequirement createUsageScenarioRequirement();

	/**
	 * Returns a new object of class '<em>Entry Level System Call Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Level System Call Requirement</em>'.
	 * @generated
	 */
	EntryLevelSystemCallRequirement createEntryLevelSystemCallRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProfilePackage getProfilePackage();

} //ProfileFactory
