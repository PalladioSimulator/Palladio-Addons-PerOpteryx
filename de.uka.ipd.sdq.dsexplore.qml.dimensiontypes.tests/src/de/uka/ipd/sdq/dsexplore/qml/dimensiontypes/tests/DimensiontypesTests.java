/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dimensiontypes</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensiontypesTests extends TestSuite {

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
		TestSuite suite = new DimensiontypesTests("dimensiontypes Tests");
		suite.addTestSuite(DimensionTypeSetTest.class);
		suite.addTestSuite(OrderTest.class);
		suite.addTestSuite(DimensionTypeEnumTest.class);
		suite.addTestSuite(DimensionTypeNumericTest.class);
		suite.addTestSuite(NumericRangeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensiontypesTests(String name) {
		super(name);
	}

} //DimensiontypesTests
