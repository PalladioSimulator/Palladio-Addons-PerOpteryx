/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qualitymodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelTests extends TestSuite {

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
		TestSuite suite = new QualityModelTests("qualitymodel Tests");
		suite.addTestSuite(NqrTest.class);
		suite.addTestSuite(MappingTest.class);
		suite.addTestSuite(MappingEntryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelTests(String name) {
		super(name);
	}

} //QualityModelTests
