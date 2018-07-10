/**
 */
package featureObjective.tests;

import featureObjective.FeatureObjectiveFactory;
import featureObjective.Simple;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link featureObjective.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Child</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SimpleTest extends ChildRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleTest.class);
	}

	/**
	 * Constructs a new Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Simple getFixture() {
		return (Simple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureObjectiveFactory.eINSTANCE.createSimple());
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

	/**
	 * Tests the '{@link featureObjective.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testAtLeastOneChild__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SimpleTest
