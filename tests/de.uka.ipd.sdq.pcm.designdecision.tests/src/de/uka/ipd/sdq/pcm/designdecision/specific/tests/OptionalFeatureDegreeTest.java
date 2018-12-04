/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Optional Feature Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionalFeatureDegreeTest extends FeatureConfigDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionalFeatureDegreeTest.class);
	}

	/**
	 * Constructs a new Optional Feature Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeatureDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Optional Feature Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OptionalFeatureDegree getFixture() {
		return (OptionalFeatureDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createOptionalFeatureDegree());
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

} //OptionalFeatureDegreeTest
