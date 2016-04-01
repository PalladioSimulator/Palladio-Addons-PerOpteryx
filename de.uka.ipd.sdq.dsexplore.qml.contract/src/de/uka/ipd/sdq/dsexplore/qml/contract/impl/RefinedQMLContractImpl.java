/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.RefinedQMLContract;

import de.uka.ipd.sdq.dsexplore.qml.contract.util.QMLContractValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined QML Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.RefinedQMLContractImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.RefinedQMLContractImpl#getBaseContract <em>Base Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedQMLContractImpl extends GenericQMLContractImpl implements RefinedQMLContract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedQMLContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.REFINED_QML_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Criterion> getRefinedBy() {
		return (EList<Criterion>)eDynamicGet(QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY, QMLContractPackage.Literals.REFINED_QML_CONTRACT__REFINED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericQMLContract getBaseContract() {
		return (GenericQMLContract)eDynamicGet(QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT, QMLContractPackage.Literals.REFINED_QML_CONTRACT__BASE_CONTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericQMLContract basicGetBaseContract() {
		return (GenericQMLContract)eDynamicGet(QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT, QMLContractPackage.Literals.REFINED_QML_CONTRACT__BASE_CONTRACT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseContract(GenericQMLContract newBaseContract) {
		eDynamicSet(QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT, QMLContractPackage.Literals.REFINED_QML_CONTRACT__BASE_CONTRACT, newBaseContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean contract_cannot_refine_itself(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 QMLContractValidator.REFINED_QML_CONTRACT__CONTRACT_CANNOT_REFINE_ITSELF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "contract_cannot_refine_itself", EObjectValidator.getObjectLabel(this, context) }),
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
			case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
				return ((InternalEList<?>)getRefinedBy()).basicRemove(otherEnd, msgs);
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
			case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
				return getRefinedBy();
			case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
				if (resolve) return getBaseContract();
				return basicGetBaseContract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends Criterion>)newValue);
				return;
			case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
				setBaseContract((GenericQMLContract)newValue);
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
			case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
				getRefinedBy().clear();
				return;
			case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
				setBaseContract((GenericQMLContract)null);
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
			case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
				return !getRefinedBy().isEmpty();
			case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
				return basicGetBaseContract() != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinedQMLContractImpl
