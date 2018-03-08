/**
 */
package TransformationModel.tests;

import TransformationModel.AdapterTransformation;
import TransformationModel.TransformationModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adapter Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterTransformationTest extends TransformationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdapterTransformationTest.class);
	}

	/**
	 * Constructs a new Adapter Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterTransformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adapter Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdapterTransformation getFixture() {
		return (AdapterTransformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TransformationModelFactory.eINSTANCE.createAdapterTransformation());
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

} //AdapterTransformationTest
