/**
 */
package de.uka.ipd.sdq.pcm.designdecision.tests;

import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Choice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolChoiceTest extends ChoiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolChoiceTest.class);
	}

	/**
	 * Constructs a new Bool Choice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolChoiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Choice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolChoice getFixture() {
		return (BoolChoice) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(designdecisionFactory.eINSTANCE.createBoolChoice());
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

} //BoolChoiceTest
