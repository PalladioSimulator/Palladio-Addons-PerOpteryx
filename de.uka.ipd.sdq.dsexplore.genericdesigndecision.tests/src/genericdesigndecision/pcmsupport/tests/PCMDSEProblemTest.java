/**
 */
package genericdesigndecision.pcmsupport.tests;

import genericdesigndecision.pcmsupport.PCMDSEProblem;
import genericdesigndecision.pcmsupport.PcmsupportFactory;

import genericdesigndecision.tests.ADSEProblemTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCMDSE Problem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMDSEProblemTest extends ADSEProblemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMDSEProblemTest.class);
	}

	/**
	 * Constructs a new PCMDSE Problem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMDSEProblemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCMDSE Problem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCMDSEProblem getFixture() {
		return (PCMDSEProblem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmsupportFactory.eINSTANCE.createPCMDSEProblem());
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

} //PCMDSEProblemTest
