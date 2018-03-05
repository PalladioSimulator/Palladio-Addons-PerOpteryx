/**
 */
package FeatureCompletionModel.tests;

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Completion Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompletionComponentTest extends ConstrainableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompletionComponentTest.class);
	}

	/**
	 * Constructs a new Completion Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Completion Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompletionComponent getFixture() {
		return (CompletionComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureCompletionFactory.eINSTANCE.createCompletionComponent());
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

} //CompletionComponentTest
