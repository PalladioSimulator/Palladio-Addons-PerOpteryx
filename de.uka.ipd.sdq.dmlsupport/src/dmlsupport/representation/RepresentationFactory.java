/**
 */
package dmlsupport.representation;

import org.eclipse.emf.ecore.EFactory;

import de.uka.ipd.sdq.dsexplore.launch.QMLManager;
import dmlsupport.representation.impl.DMLFileNamesInputImpl;
import dmlsupport.representation.impl.DML_DSEOptionsTabImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.representation.RepresentationPackage
 * @generated
 */
public interface RepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentationFactory eINSTANCE = dmlsupport.representation.impl.RepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DML DSE Options Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DML DSE Options Tab</em>'.
	 * @generated
	 */
	DML_DSEOptionsTabImpl createDML_DSEOptionsTab();

	/**
	 * Returns a new object of class '<em>DML File Names Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param qmlManager 
	 * @return a new object of class '<em>DML File Names Input</em>'.
	 * @generated
	 */
	DMLFileNamesInputImpl createDMLFileNamesInput(QMLManager qmlManager);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepresentationPackage getRepresentationPackage();

} //RepresentationFactory
