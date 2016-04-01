/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage
 * @generated
 */
public interface QMLContractTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMLContractTypeFactory eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QML Contract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QML Contract Type</em>'.
	 * @generated
	 */
	QMLContractType createQMLContractType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QMLContractTypePackage getQMLContractTypePackage();

} //QMLContractTypeFactory
