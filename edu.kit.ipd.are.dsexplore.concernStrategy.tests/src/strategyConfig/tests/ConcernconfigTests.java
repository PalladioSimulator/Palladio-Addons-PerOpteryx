/**
 */
package strategyConfig.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>strategyConfig</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernconfigTests extends TestSuite {

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
		TestSuite suite = new ConcernconfigTests("strategyConfig Tests");
		suite.addTestSuite(ConfigNodeTest.class);
		suite.addTestSuite(FeatureConfigTest.class);
		suite.addTestSuite(IntegerAttributeValueTest.class);
		suite.addTestSuite(DoubleAttributeValueTest.class);
		suite.addTestSuite(StringAttributeValueTest.class);
		suite.addTestSuite(ExternalObjectAttributeValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernconfigTests(String name) {
		super(name);
	}

} //ConcernconfigTests
