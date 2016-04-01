/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;

import de.uka.ipd.sdq.dsexplore.qml.contract.util.QMLContractValidator;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

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
 * An implementation of the model object '<em><b>Evaluation Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.EvaluationAspectImpl#getAspectRequirement <em>Aspect Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EvaluationAspectImpl extends IdentifierImpl implements EvaluationAspect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.EVALUATION_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRequirement getAspectRequirement() {
		return (AspectRequirement)eDynamicGet(QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, QMLContractPackage.Literals.EVALUATION_ASPECT__ASPECT_REQUIREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectRequirement(AspectRequirement newAspectRequirement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAspectRequirement, QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRequirement(AspectRequirement newAspectRequirement) {
		eDynamicSet(QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, QMLContractPackage.Literals.EVALUATION_ASPECT__ASPECT_REQUIREMENT, newAspectRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean FREQUENCY_LIMIT_must_be_NUMERIC(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 QMLContractValidator.EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_NUMERIC,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FREQUENCY_LIMIT_must_be_NUMERIC", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean FREQUENCY_LIMIT_must_be_between_0_and_100(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 QMLContractValidator.EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FREQUENCY_LIMIT_must_be_between_0_and_100", EObjectValidator.getObjectLabel(this, context) }),
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
			case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
				return basicSetAspectRequirement(null, msgs);
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
			case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
				return getAspectRequirement();
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
			case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
				setAspectRequirement((AspectRequirement)newValue);
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
			case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
				setAspectRequirement((AspectRequirement)null);
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
			case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
				return getAspectRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

} //EvaluationAspectImpl
