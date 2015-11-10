/**
 */
package genericdesigndecision.qualityproperties.tests;

import genericdesigndecision.qualityproperties.ElementQualityProperty;
import genericdesigndecision.qualityproperties.QualitypropertiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Quality Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementQualityPropertyTest extends QualityPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementQualityPropertyTest.class);
	}

	/**
	 * Constructs a new Element Quality Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementQualityPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Quality Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementQualityProperty getFixture() {
		return (ElementQualityProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitypropertiesFactory.eINSTANCE.createElementQualityProperty());
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

} //ElementQualityPropertyTest
