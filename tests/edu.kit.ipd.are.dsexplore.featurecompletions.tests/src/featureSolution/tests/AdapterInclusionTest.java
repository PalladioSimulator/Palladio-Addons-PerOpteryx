/**
 */
package featureSolution.tests;

import featureSolution.AdapterInclusion;
import featureSolution.FeatureSolutionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adapter Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterInclusionTest extends InclusionMechanismTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdapterInclusionTest.class);
	}

	/**
	 * Constructs a new Adapter Inclusion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterInclusionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Adapter Inclusion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdapterInclusion getFixture() {
		return (AdapterInclusion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureSolutionFactory.eINSTANCE.createAdapterInclusion());
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

} //AdapterInclusionTest
