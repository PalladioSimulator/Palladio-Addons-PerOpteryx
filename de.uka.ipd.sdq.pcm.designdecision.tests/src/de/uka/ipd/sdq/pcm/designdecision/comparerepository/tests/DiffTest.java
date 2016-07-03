/**
 */
package de.uka.ipd.sdq.pcm.designdecision.comparerepository.tests;

import de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff;
import de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffTest extends TestCase {

	/**
	 * The fixture for this Diff test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diff fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiffTest.class);
	}

	/**
	 * Constructs a new Diff test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Diff test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Diff fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Diff test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diff getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(comparerepositoryFactory.eINSTANCE.createDiff());
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

} //DiffTest
