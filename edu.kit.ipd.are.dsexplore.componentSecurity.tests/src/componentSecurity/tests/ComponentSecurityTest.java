/**
 */
package componentSecurity.tests;

import componentSecurity.ComponentSecurity;
import componentSecurity.ComponentSecurityFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Security</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSecurityTest extends TestCase {

	/**
	 * The fixture for this Component Security test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSecurity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentSecurityTest.class);
	}

	/**
	 * Constructs a new Component Security test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Security test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentSecurity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Security test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSecurity getFixture() {
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
		setFixture(ComponentSecurityFactory.eINSTANCE.createComponentSecurity());
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

} //ComponentSecurityTest
