/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.genericDoF.ARangeDegree;
import genericdesigndecision.genericDoF.GenericDoFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARange Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.ARangeDegreeImpl#isUpperBoundIncluded <em>Upper Bound Included</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.impl.ARangeDegreeImpl#isLowerBoundIncluded <em>Lower Bound Included</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.impl.ARangeDegreeImpl#getNumberOfSteps <em>Number Of Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ARangeDegreeImpl extends AOrderedDataTypeDegreeImpl implements ARangeDegree {
	/**
	 * The default value of the '{@link #isUpperBoundIncluded() <em>Upper Bound Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperBoundIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPPER_BOUND_INCLUDED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpperBoundIncluded() <em>Upper Bound Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperBoundIncluded()
	 * @generated
	 * @ordered
	 */
	protected boolean upperBoundIncluded = UPPER_BOUND_INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isLowerBoundIncluded() <em>Lower Bound Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowerBoundIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOWER_BOUND_INCLUDED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLowerBoundIncluded() <em>Lower Bound Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowerBoundIncluded()
	 * @generated
	 * @ordered
	 */
	protected boolean lowerBoundIncluded = LOWER_BOUND_INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSteps()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_STEPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSteps()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSteps = NUMBER_OF_STEPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARangeDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.ARANGE_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpperBoundIncluded() {
		return upperBoundIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundIncluded(boolean newUpperBoundIncluded) {
		boolean oldUpperBoundIncluded = upperBoundIncluded;
		upperBoundIncluded = newUpperBoundIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDoFPackage.ARANGE_DEGREE__UPPER_BOUND_INCLUDED, oldUpperBoundIncluded, upperBoundIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLowerBoundIncluded() {
		return lowerBoundIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundIncluded(boolean newLowerBoundIncluded) {
		boolean oldLowerBoundIncluded = lowerBoundIncluded;
		lowerBoundIncluded = newLowerBoundIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDoFPackage.ARANGE_DEGREE__LOWER_BOUND_INCLUDED, oldLowerBoundIncluded, lowerBoundIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSteps() {
		return numberOfSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSteps(int newNumberOfSteps) {
		int oldNumberOfSteps = numberOfSteps;
		numberOfSteps = newNumberOfSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDoFPackage.ARANGE_DEGREE__NUMBER_OF_STEPS, oldNumberOfSteps, numberOfSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDoFPackage.ARANGE_DEGREE__UPPER_BOUND_INCLUDED:
				return isUpperBoundIncluded();
			case GenericDoFPackage.ARANGE_DEGREE__LOWER_BOUND_INCLUDED:
				return isLowerBoundIncluded();
			case GenericDoFPackage.ARANGE_DEGREE__NUMBER_OF_STEPS:
				return getNumberOfSteps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericDoFPackage.ARANGE_DEGREE__UPPER_BOUND_INCLUDED:
				setUpperBoundIncluded((Boolean)newValue);
				return;
			case GenericDoFPackage.ARANGE_DEGREE__LOWER_BOUND_INCLUDED:
				setLowerBoundIncluded((Boolean)newValue);
				return;
			case GenericDoFPackage.ARANGE_DEGREE__NUMBER_OF_STEPS:
				setNumberOfSteps((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericDoFPackage.ARANGE_DEGREE__UPPER_BOUND_INCLUDED:
				setUpperBoundIncluded(UPPER_BOUND_INCLUDED_EDEFAULT);
				return;
			case GenericDoFPackage.ARANGE_DEGREE__LOWER_BOUND_INCLUDED:
				setLowerBoundIncluded(LOWER_BOUND_INCLUDED_EDEFAULT);
				return;
			case GenericDoFPackage.ARANGE_DEGREE__NUMBER_OF_STEPS:
				setNumberOfSteps(NUMBER_OF_STEPS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericDoFPackage.ARANGE_DEGREE__UPPER_BOUND_INCLUDED:
				return upperBoundIncluded != UPPER_BOUND_INCLUDED_EDEFAULT;
			case GenericDoFPackage.ARANGE_DEGREE__LOWER_BOUND_INCLUDED:
				return lowerBoundIncluded != LOWER_BOUND_INCLUDED_EDEFAULT;
			case GenericDoFPackage.ARANGE_DEGREE__NUMBER_OF_STEPS:
				return numberOfSteps != NUMBER_OF_STEPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (upperBoundIncluded: ");
		result.append(upperBoundIncluded);
		result.append(", lowerBoundIncluded: ");
		result.append(lowerBoundIncluded);
		result.append(", numberOfSteps: ");
		result.append(numberOfSteps);
		result.append(')');
		return result.toString();
	}

} //ARangeDegreeImpl
