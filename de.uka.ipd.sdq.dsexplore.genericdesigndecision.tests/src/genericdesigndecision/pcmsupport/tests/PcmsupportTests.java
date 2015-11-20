/**
 */
package genericdesigndecision.pcmsupport.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>pcmsupport</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmsupportTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PcmsupportTests("pcmsupport Tests");
		suite.addTestSuite(PCMMetamodelDescriptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmsupportTests(String name) {
		super(name);
	}

} //PcmsupportTests
