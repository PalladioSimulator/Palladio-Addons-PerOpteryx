/**
 */
package concernStrategy.tests;

import concernStrategy.ProhibitsConstraint;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prohibits Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProhibitsConstraintTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProhibitsConstraintTest.class);
	}

	/**
	 * Constructs a new Prohibits Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProhibitsConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prohibits Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProhibitsConstraint getFixture() {
		return (ProhibitsConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createProhibitsConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProhibitsConstraintTest
