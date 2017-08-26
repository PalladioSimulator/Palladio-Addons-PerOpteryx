/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ordered Integer Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderedIntegerDegreeTest extends DiscreteDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderedIntegerDegreeTest.class);
	}

	/**
	 * Constructs a new Ordered Integer Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedIntegerDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ordered Integer Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrderedIntegerDegree getFixture() {
		return (OrderedIntegerDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createOrderedIntegerDegree());
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

} //OrderedIntegerDegreeTest
