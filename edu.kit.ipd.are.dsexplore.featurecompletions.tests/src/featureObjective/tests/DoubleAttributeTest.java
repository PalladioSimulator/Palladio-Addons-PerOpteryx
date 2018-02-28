/**
 */
package featureObjective.tests;

import featureObjective.DoubleAttribute;
import featureObjective.FeatureObjectiveFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleAttributeTest.class);
	}

	/**
	 * Constructs a new Double Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DoubleAttribute getFixture() {
		return (DoubleAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureObjectiveFactory.eINSTANCE.createDoubleAttribute());
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

} //DoubleAttributeTest
