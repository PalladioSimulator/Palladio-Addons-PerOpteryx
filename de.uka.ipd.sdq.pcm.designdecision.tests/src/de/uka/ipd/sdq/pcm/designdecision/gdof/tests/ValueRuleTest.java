/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.tests;

import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueRuleTest extends OCLRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueRuleTest.class);
	}

	/**
	 * Constructs a new Value Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueRule getFixture() {
		return (ValueRule) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(gdofFactory.eINSTANCE.createValueRule());
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

} //ValueRuleTest
