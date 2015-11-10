/**
 */
package genericdesigndecision.qualityproperties.tests;

import genericdesigndecision.qualityproperties.IntegerQualityProperty;
import genericdesigndecision.qualityproperties.QualitypropertiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Quality Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerQualityPropertyTest extends NumericQualityPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerQualityPropertyTest.class);
	}

	/**
	 * Constructs a new Integer Quality Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerQualityPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Quality Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerQualityProperty getFixture() {
		return (IntegerQualityProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitypropertiesFactory.eINSTANCE.createIntegerQualityProperty());
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

} //IntegerQualityPropertyTest
