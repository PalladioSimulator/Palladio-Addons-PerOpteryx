/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.util.DimensiontypesValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type Numeric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeNumericImpl extends DimensionTypeImpl implements DimensionTypeNumeric {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNumericDomain DOMAIN_EDEFAULT = EnumNumericDomain.REAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeNumericImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.DIMENSION_TYPE_NUMERIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericRange getRange() {
		return (NumericRange)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE, DimensiontypesPackage.Literals.DIMENSION_TYPE_NUMERIC__RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(NumericRange newRange, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRange, DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(NumericRange newRange) {
		eDynamicSet(DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE, DimensiontypesPackage.Literals.DIMENSION_TYPE_NUMERIC__RANGE, newRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNumericDomain getDomain() {
		return (EnumNumericDomain)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN, DimensiontypesPackage.Literals.DIMENSION_TYPE_NUMERIC__DOMAIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EnumNumericDomain newDomain) {
		eDynamicSet(DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN, DimensiontypesPackage.Literals.DIMENSION_TYPE_NUMERIC__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 DimensiontypesValidator.DIMENSION_TYPE_NUMERIC__NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE:
				return getRange();
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
				return getDomain();
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
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE:
				setRange((NumericRange)newValue);
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
				setDomain((EnumNumericDomain)newValue);
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
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE:
				setRange((NumericRange)null);
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
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
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__RANGE:
				return getRange() != null;
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
				return getDomain() != DOMAIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeNumericImpl
