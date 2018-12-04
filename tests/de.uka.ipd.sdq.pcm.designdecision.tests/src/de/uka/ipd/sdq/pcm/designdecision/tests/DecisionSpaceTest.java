/**
 */
package de.uka.ipd.sdq.pcm.designdecision.tests;

import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision Space</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionSpaceTest extends TestCase {

	/**
	 * The fixture for this Decision Space test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSpace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecisionSpaceTest.class);
	}

	/**
	 * Constructs a new Decision Space test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Decision Space test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DecisionSpace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Decision Space test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSpace getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(designdecisionFactory.eINSTANCE.createDecisionSpace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DecisionSpaceTest
