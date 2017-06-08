/**
 */
package ConcernModel.tests;

import ConcernModel.AnnotationEnrich;
import ConcernModel.ConcernModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Annotation Enrich</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationEnrichTest extends AnnotationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnnotationEnrichTest.class);
	}

	/**
	 * Constructs a new Annotation Enrich test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationEnrichTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Annotation Enrich test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnnotationEnrich getFixture() {
		return (AnnotationEnrich)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcernModelFactory.eINSTANCE.createAnnotationEnrich());
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

} //AnnotationEnrichTest
