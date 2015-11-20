/**
 */
package genericdesigndecision.pcmsupport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericdesigndecision.pcmsupport.PcmsupportPackage
 * @generated
 */
public interface PcmsupportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmsupportFactory eINSTANCE = genericdesigndecision.pcmsupport.impl.PcmsupportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Metamodel Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Metamodel Description</em>'.
	 * @generated
	 */
	PCMMetamodelDescription createPCMMetamodelDescription();

	/**
	 * Returns a new object of class '<em>PCMDSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCMDSE Problem</em>'.
	 * @generated
	 */
	PCMDSEProblem createPCMDSEProblem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmsupportPackage getPcmsupportPackage();

} //PcmsupportFactory
