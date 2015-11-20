/**
 */
package genericdesigndecision.pcmsupport.tests;

import genericdesigndecision.pcmsupport.PCMMetamodelDescription;
import genericdesigndecision.pcmsupport.PcmsupportFactory;

import genericdesigndecision.universalDoF.tests.AMetamodelDescriptionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMMetamodelDescriptionTest extends AMetamodelDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMMetamodelDescriptionTest.class);
	}

	/**
	 * Constructs a new PCM Metamodel Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMMetamodelDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Metamodel Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCMMetamodelDescription getFixture() {
		return (PCMMetamodelDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmsupportFactory.eINSTANCE.createPCMMetamodelDescription());
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

} //PCMMetamodelDescriptionTest
