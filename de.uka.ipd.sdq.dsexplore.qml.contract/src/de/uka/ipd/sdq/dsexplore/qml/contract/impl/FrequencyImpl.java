/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.RangeValue;

import de.uka.ipd.sdq.dsexplore.qml.contract.util.QMLContractValidator;

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
 * An implementation of the model object '<em><b>Frequency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.FrequencyImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.FrequencyImpl#getLowerLimit <em>Lower Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyImpl extends StochasticEvaluationAspectImpl implements Frequency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.FREQUENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeValue getUpperLimit() {
		return (RangeValue)eDynamicGet(QMLContractPackage.FREQUENCY__UPPER_LIMIT, QMLContractPackage.Literals.FREQUENCY__UPPER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperLimit(RangeValue newUpperLimit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUpperLimit, QMLContractPackage.FREQUENCY__UPPER_LIMIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(RangeValue newUpperLimit) {
		eDynamicSet(QMLContractPackage.FREQUENCY__UPPER_LIMIT, QMLContractPackage.Literals.FREQUENCY__UPPER_LIMIT, newUpperLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeValue getLowerLimit() {
		return (RangeValue)eDynamicGet(QMLContractPackage.FREQUENCY__LOWER_LIMIT, QMLContractPackage.Literals.FREQUENCY__LOWER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerLimit(RangeValue newLowerLimit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLowerLimit, QMLContractPackage.FREQUENCY__LOWER_LIMIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(RangeValue newLowerLimit) {
		eDynamicSet(QMLContractPackage.FREQUENCY__LOWER_LIMIT, QMLContractPackage.Literals.FREQUENCY__LOWER_LIMIT, newLowerLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QMLContractValidator.DIAGNOSTIC_SOURCE,
						 QMLContractValidator.FREQUENCY__RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT", EObjectValidator.getObjectLabel(this, context) }),
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
			case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
				return basicSetUpperLimit(null, msgs);
			case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
				return basicSetLowerLimit(null, msgs);
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
			case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
				return getUpperLimit();
			case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
				return getLowerLimit();
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
			case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
				setUpperLimit((RangeValue)newValue);
				return;
			case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
				setLowerLimit((RangeValue)newValue);
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
			case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
				setUpperLimit((RangeValue)null);
				return;
			case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
				setLowerLimit((RangeValue)null);
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
			case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
				return getUpperLimit() != null;
			case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
				return getLowerLimit() != null;
		}
		return super.eIsSet(featureID);
	}

} //FrequencyImpl
