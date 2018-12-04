/**
 */
package FeatureCompletionModel.tests;

import FeatureCompletionModel.FeatureCompletionFactory;
import FeatureCompletionModel.PerimeterRequiring;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Perimeter Requiring</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerimeterRequiringTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PerimeterRequiringTest.class);
	}

	/**
	 * Constructs a new Perimeter Requiring test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerimeterRequiringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Perimeter Requiring test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PerimeterRequiring getFixture() {
		return (PerimeterRequiring)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureCompletionFactory.eINSTANCE.createPerimeterRequiring());
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

} //PerimeterRequiringTest
