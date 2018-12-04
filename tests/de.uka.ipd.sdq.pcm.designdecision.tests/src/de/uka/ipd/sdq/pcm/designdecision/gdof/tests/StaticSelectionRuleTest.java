/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.tests;

import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticSelectionRuleTest extends SelectionRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaticSelectionRuleTest.class);
	}

	/**
	 * Constructs a new Static Selection Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticSelectionRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Static Selection Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaticSelectionRule getFixture() {
		return (StaticSelectionRule) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(gdofFactory.eINSTANCE.createStaticSelectionRule());
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

} //StaticSelectionRuleTest
