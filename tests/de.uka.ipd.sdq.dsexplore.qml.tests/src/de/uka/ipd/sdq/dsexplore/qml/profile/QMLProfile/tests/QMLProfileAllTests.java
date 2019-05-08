/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.tests.QMLContractTests;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.tests.QMLContractTypeTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QMLProfile</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QMLProfileAllTests extends TestSuite {

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
		TestSuite suite = new QMLProfileAllTests("QMLProfile Tests");
		suite.addTest(QMLProfileTests.suite());
		suite.addTest(QMLContractTests.suite());
		suite.addTest(QMLContractTypeTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLProfileAllTests(String name) {
		super(name);
	}

} //QMLProfileAllTests
