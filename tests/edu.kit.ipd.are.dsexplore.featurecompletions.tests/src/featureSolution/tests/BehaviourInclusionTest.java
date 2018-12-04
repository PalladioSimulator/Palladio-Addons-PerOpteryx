/**
 */
package featureSolution.tests;

import featureSolution.BehaviourInclusion;
import featureSolution.FeatureSolutionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviour Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourInclusionTest extends InclusionMechanismTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviourInclusionTest.class);
	}

	/**
	 * Constructs a new Behaviour Inclusion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourInclusionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behaviour Inclusion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BehaviourInclusion getFixture() {
		return (BehaviourInclusion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureSolutionFactory.eINSTANCE.createBehaviourInclusion());
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

} //BehaviourInclusionTest
