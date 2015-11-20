/**
 */
package genericdesigndecision.genericDoF.tests;

import genericdesigndecision.genericDoF.GenericDoFFactory;
import genericdesigndecision.genericDoF.InstanceSelectionRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceSelectionRuleTest extends SelectionRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstanceSelectionRuleTest.class);
	}

	/**
	 * Constructs a new Instance Selection Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSelectionRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Selection Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstanceSelectionRule getFixture() {
		return (InstanceSelectionRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenericDoFFactory.eINSTANCE.createInstanceSelectionRule());
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

} //InstanceSelectionRuleTest
