/**
 */
package concernStrategy.tests;

import concernStrategy.Simple;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link concernStrategy.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Child</em>}</li>
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
	private Simple getFixture() {
		return (Simple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createSimple());
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

	/**
	 * Tests the '{@link concernStrategy.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.Simple#atLeastOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testAtLeastOneChild__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SimpleTest
