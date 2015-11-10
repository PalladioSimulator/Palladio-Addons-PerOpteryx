/**
 */
package genericdesigndecision.UniversalDoF.tests;

import genericdesigndecision.GenericDoF.DegreeOfFreedom;

import genericdesigndecision.UniversalDoF.GenericDoF;
import genericdesigndecision.UniversalDoF.UniversalDoFFactory;
import genericdesigndecision.UniversalDoF.UniversalDoFPackage;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Do FTo Degree Of Freedom Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDoFToDegreeOfFreedomMapTest extends TestCase {

	/**
	 * The fixture for this Generic Do FTo Degree Of Freedom Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<GenericDoF, DegreeOfFreedom> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericDoFToDegreeOfFreedomMapTest.class);
	}

	/**
	 * Constructs a new Generic Do FTo Degree Of Freedom Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFToDegreeOfFreedomMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Generic Do FTo Degree Of Freedom Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<GenericDoF, DegreeOfFreedom> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Generic Do FTo Degree Of Freedom Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<GenericDoF, DegreeOfFreedom> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<GenericDoF, DegreeOfFreedom>)UniversalDoFFactory.eINSTANCE.create(UniversalDoFPackage.Literals.GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP));
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

} //GenericDoFToDegreeOfFreedomMapTest
