/**
 */
package genericdesigndecision.qualityproperties.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qualityproperties</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitypropertiesTests extends TestSuite {

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
		TestSuite suite = new QualitypropertiesTests("qualityproperties Tests");
		suite.addTestSuite(ElementQualityPropertyTest.class);
		suite.addTestSuite(IntegerQualityPropertyTest.class);
		suite.addTestSuite(DoubleQualityPropertyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypropertiesTests(String name) {
		super(name);
	}

} //QualitypropertiesTests
