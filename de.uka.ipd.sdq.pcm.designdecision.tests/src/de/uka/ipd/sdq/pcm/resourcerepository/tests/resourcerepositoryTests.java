/**
 */
package de.uka.ipd.sdq.pcm.resourcerepository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>resourcerepository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class resourcerepositoryTests extends TestSuite {

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
		TestSuite suite = new resourcerepositoryTests("resourcerepository Tests");
		suite.addTestSuite(ResourceDescriptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourcerepositoryTests(String name) {
		super(name);
	}

} //resourcerepositoryTests
