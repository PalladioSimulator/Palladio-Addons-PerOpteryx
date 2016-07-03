/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage
 * @generated
 */
public interface DiffrepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffrepositoryFactory eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Diff Model Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Model Repository</em>'.
	 * @generated
	 */
	DiffModelRepository createDiffModelRepository();

	/**
	 * Returns a new object of class '<em>Diff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Model</em>'.
	 * @generated
	 */
	DiffModel createDiffModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiffrepositoryPackage getDiffrepositoryPackage();

} //DiffrepositoryFactory
