/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureDegreeTest extends ClassAsReferenceDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureDegreeTest.class);
	}

	/**
	 * Constructs a new Feature Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureDegree getFixture() {
		return (FeatureDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createFeatureDegree());
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

} //FeatureDegreeTest
