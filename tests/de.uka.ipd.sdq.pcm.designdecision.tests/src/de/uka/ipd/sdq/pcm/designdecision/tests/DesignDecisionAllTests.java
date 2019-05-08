/**
 */
package de.uka.ipd.sdq.pcm.designdecision.tests;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.tests.qualitypropertiesTests;

import de.uka.ipd.sdq.pcm.designdecision.specific.tests.specificTests;

import de.uka.ipd.sdq.pcm.resourcerepository.tests.resourcerepositoryTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DesignDecision</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignDecisionAllTests extends TestSuite {

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
		TestSuite suite = new DesignDecisionAllTests("DesignDecision Tests");
		suite.addTest(designdecisionTests.suite());
		suite.addTest(qualitypropertiesTests.suite());
		suite.addTest(resourcerepositoryTests.suite());
		suite.addTest(specificTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDecisionAllTests(String name) {
		super(name);
	}

} //DesignDecisionAllTests
