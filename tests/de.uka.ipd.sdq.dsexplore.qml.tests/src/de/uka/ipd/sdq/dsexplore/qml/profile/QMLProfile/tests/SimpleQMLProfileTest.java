/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.tests;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfileFactory;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple QML Profile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleQMLProfileTest extends GenericQMLProfileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleQMLProfileTest.class);
	}

	/**
	 * Constructs a new Simple QML Profile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQMLProfileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple QML Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleQMLProfile getFixture() {
		return (SimpleQMLProfile) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLProfileFactory.eINSTANCE.createSimpleQMLProfile());
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

} //SimpleQMLProfileTest
