/**
 */
package TransformationModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TransformationModel.TransformationModelPackage
 * @generated
 */
public interface TransformationModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationModelFactory eINSTANCE = TransformationModel.impl.TransformationModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Repository</em>'.
	 * @generated
	 */
	TransformationRepository createTransformationRepository();

	/**
	 * Returns a new object of class '<em>Extension Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Transformation</em>'.
	 * @generated
	 */
	ExtensionTransformation createExtensionTransformation();

	/**
	 * Returns a new object of class '<em>Adapter Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Transformation</em>'.
	 * @generated
	 */
	AdapterTransformation createAdapterTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransformationModelPackage getTransformationModelPackage();

} //TransformationModelFactory
