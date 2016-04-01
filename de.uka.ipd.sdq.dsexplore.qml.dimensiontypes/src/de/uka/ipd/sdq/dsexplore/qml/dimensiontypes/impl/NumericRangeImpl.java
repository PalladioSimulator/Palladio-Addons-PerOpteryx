/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.util.DimensiontypesValidator;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl#getUpperLimit <em>Upper Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericRangeImpl extends IdentifierImpl implements NumericRange {
	/**
	 * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_LIMIT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_LIMIT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.NUMERIC_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowerLimit() {
		return (Double)eDynamicGet(DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT, DimensiontypesPackage.Literals.NUMERIC_RANGE__LOWER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(double newLowerLimit) {
		eDynamicSet(DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT, DimensiontypesPackage.Literals.NUMERIC_RANGE__LOWER_LIMIT, newLowerLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpperLimit() {
		return (Double)eDynamicGet(DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT, DimensiontypesPackage.Literals.NUMERIC_RANGE__UPPER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(double newUpperLimit) {
		eDynamicSet(DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT, DimensiontypesPackage.Literals.NUMERIC_RANGE__UPPER_LIMIT, newUpperLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UPPERLIMIT_must_be_greater_than_LOWERLIMIT(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DimensiontypesValidator.DIAGNOSTIC_SOURCE,
						 DimensiontypesValidator.NUMERIC_RANGE__UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "UPPERLIMIT_must_be_greater_than_LOWERLIMIT", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT:
				return getLowerLimit();
			case DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT:
				return getUpperLimit();
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
			case DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT:
				setLowerLimit((Double)newValue);
				return;
			case DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT:
				setUpperLimit((Double)newValue);
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
			case DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT:
				setLowerLimit(LOWER_LIMIT_EDEFAULT);
				return;
			case DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT:
				setUpperLimit(UPPER_LIMIT_EDEFAULT);
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
			case DimensiontypesPackage.NUMERIC_RANGE__LOWER_LIMIT:
				return getLowerLimit() != LOWER_LIMIT_EDEFAULT;
			case DimensiontypesPackage.NUMERIC_RANGE__UPPER_LIMIT:
				return getUpperLimit() != UPPER_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //NumericRangeImpl
