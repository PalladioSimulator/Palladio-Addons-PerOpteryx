/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.Choice;
import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.AContinuousRangeDegree;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.impl.GenericdesigndecisionFactoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AContinuous Range Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl#getTo <em>To</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AContinuousRangeDegreeImpl extends ARangeDegreeImpl implements AContinuousRangeDegree {
	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final double TO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected double to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected double from = FROM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AContinuousRangeDegreeImpl() {
		super();
	}
	
	@Override
	public Choice createRandomChoice() {
		GenericdesigndecisionFactory factory = GenericdesigndecisionFactoryImpl.init();
		ContinousRangeChoice choice = factory.createContinousRangeChoice();
		
		double lowerMargin = 0;
		if (this.isLowerBoundIncluded()){
			lowerMargin = Double.MIN_VALUE;
		}
		double upperMargin = 0;
		if (this.isUpperBoundIncluded()){
			upperMargin = Double.MIN_VALUE;
		}
		double factor = this.getTo() - upperMargin - this.getFrom() - lowerMargin;


		double value = this.getFrom() + lowerMargin + this.random.nextDouble()*factor;
		
		choice.setChosenValue(value);
		choice.setDofInstance(this);
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.ACONTINUOUS_RANGE_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(double newTo) {
		double oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(double newFrom) {
		double oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO:
				return getTo();
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM:
				return getFrom();
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
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO:
				setTo((Double)newValue);
				return;
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM:
				setFrom((Double)newValue);
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
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO:
				setTo(TO_EDEFAULT);
				return;
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM:
				setFrom(FROM_EDEFAULT);
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
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO:
				return to != TO_EDEFAULT;
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM:
				return from != FROM_EDEFAULT;
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
		result.append(" (to: ");
		result.append(to);
		result.append(", from: ");
		result.append(from);
		result.append(')');
		return result.toString();
	}

} //AContinuousRangeDegreeImpl
