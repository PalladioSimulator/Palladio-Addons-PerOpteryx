/**
 */
package concernStrategy.tests;

import concernStrategy.ExternalObjectAttribute;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Object Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalObjectAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalObjectAttributeTest.class);
	}

	/**
	 * Constructs a new External Object Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObjectAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Object Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExternalObjectAttribute getFixture() {
		return (ExternalObjectAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createExternalObjectAttribute());
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

} //ExternalObjectAttributeTest
