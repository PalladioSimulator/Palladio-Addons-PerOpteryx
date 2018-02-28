/**
 */
package featureSolution.tests;

import featureSolution.ExtensionInclusion;
import featureSolution.FeatureSolutionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extension Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionInclusionTest extends InclusionMechanismTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtensionInclusionTest.class);
	}

	/**
	 * Constructs a new Extension Inclusion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionInclusionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extension Inclusion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExtensionInclusion getFixture() {
		return (ExtensionInclusion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureSolutionFactory.eINSTANCE.createExtensionInclusion());
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

} //ExtensionInclusionTest
