/**
 */
package componentSecurity.tests;

import componentSecurity.ComponentSecurityFactory;
import componentSecurity.SecurityTarget;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Target</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityTargetTest extends TestCase {

	/**
	 * The fixture for this Security Target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityTarget fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityTargetTest.class);
	}

	/**
	 * Constructs a new Security Target test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTargetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityTarget fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityTarget getFixture() {
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
		setFixture(ComponentSecurityFactory.eINSTANCE.createSecurityTarget());
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

} //SecurityTargetTest
