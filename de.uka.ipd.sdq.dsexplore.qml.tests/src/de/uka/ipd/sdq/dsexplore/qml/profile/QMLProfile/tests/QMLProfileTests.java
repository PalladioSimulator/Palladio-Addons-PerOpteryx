/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QMLProfile</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QMLProfileTests extends TestSuite {

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
		TestSuite suite = new QMLProfileTests("QMLProfile Tests");
		suite.addTestSuite(RefinedQMLProfileTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLProfileTests(String name) {
		super(name);
	}

} //QMLProfileTests
