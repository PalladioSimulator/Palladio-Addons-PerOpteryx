/**
 */
package placementDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see placementDescription.PlacementDescriptionPackage
 * @generated
 */
public interface PlacementDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlacementDescriptionFactory eINSTANCE = placementDescription.impl.PlacementDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placement Strategy</em>'.
	 * @generated
	 */
	PlacementStrategy createPlacementStrategy();

	/**
	 * Returns a new object of class '<em>External Call Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Call Placement Strategy</em>'.
	 * @generated
	 */
	ExternalCallPlacementStrategy createExternalCallPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Internal Action Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Action Placement Strategy</em>'.
	 * @generated
	 */
	InternalActionPlacementStrategy createInternalActionPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Control Flow Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Placement Strategy</em>'.
	 * @generated
	 */
	ControlFlowPlacementStrategy createControlFlowPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Cut</em>'.
	 * @generated
	 */
	PointCut createPointCut();

	/**
	 * Returns a new object of class '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advice</em>'.
	 * @generated
	 */
	Advice createAdvice();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Feature Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Selection</em>'.
	 * @generated
	 */
	FeatureSelection createFeatureSelection();

	/**
	 * Returns a new object of class '<em>Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature List</em>'.
	 * @generated
	 */
	FeatureList createFeatureList();

	/**
	 * Returns a new object of class '<em>Selected CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected CV</em>'.
	 * @generated
	 */
	SelectedCV createSelectedCV();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlacementDescriptionPackage getPlacementDescriptionPackage();

} //PlacementDescriptionFactory
