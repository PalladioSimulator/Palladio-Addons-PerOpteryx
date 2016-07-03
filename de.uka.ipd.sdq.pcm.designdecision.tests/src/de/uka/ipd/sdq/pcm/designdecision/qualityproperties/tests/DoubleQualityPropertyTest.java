/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.tests;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Quality Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleQualityPropertyTest extends NumericQualityPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleQualityPropertyTest.class);
	}

	/**
	 * Constructs a new Double Quality Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleQualityPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double Quality Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DoubleQualityProperty getFixture() {
		return (DoubleQualityProperty) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(qualitypropertiesFactory.eINSTANCE.createDoubleQualityProperty());
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

} //DoubleQualityPropertyTest
