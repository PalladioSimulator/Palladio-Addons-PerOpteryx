/**
 */
package featureObjective.tests;

import FeatureCompletionModel.tests.DescribedElementTest;

import featureObjective.FeatureObjective;
import featureObjective.FeatureObjectiveFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Objective</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureObjectiveTest extends DescribedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureObjectiveTest.class);
	}

	/**
	 * Constructs a new Feature Objective test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjectiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Objective test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureObjective getFixture() {
		return (FeatureObjective)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FeatureObjectiveFactory.eINSTANCE.createFeatureObjective());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FeatureObjectiveTest
