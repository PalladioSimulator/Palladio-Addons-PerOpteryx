/**
 */
package concernStrategy.tests;

import concernStrategy.FeatureDiagram;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureDiagramTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureDiagramTest.class);
	}

	/**
	 * Constructs a new Feature Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureDiagram getFixture() {
		return (FeatureDiagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createFeatureDiagram());
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

} //FeatureDiagramTest
