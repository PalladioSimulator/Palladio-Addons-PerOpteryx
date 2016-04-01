/**
 */
package de.uka.ipd.sdq.dsexplore.qml.declarations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage
 * @generated
 */
public interface QMLDeclarationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMLDeclarationsFactory eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QML Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QML Declarations</em>'.
	 * @generated
	 */
	QMLDeclarations createQMLDeclarations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QMLDeclarationsPackage getQMLDeclarationsPackage();

} //QMLDeclarationsFactory
