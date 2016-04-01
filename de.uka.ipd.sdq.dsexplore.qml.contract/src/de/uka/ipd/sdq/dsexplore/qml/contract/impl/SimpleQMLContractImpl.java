/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.SimpleQMLContract;

import de.uka.ipd.sdq.dsexplore.qml.contract.util.QMLContractValidator;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType;

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
 * An implementation of the model object '<em><b>Simple QML Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.SimpleQMLContractImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.SimpleQMLContractImpl#getContractType <em>Contract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleQMLContractImpl extends GenericQMLContractImpl implements SimpleQMLContract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQMLContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.SIMPLE_QML_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Criterion> getCriteria() {
		return (EList<Criterion>)eDynamicGet(QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA, QMLContractPackage.Literals.SIMPLE_QML_CONTRACT__CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractType getContractType() {
		return (QMLContractType)eDynamicGet(QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, QMLContractPackage.Literals.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractType basicGetContractType() {
		return (QMLContractType)eDynamicGet(QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, QMLContractPackage.Literals.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractType(QMLContractType newContractType) {
		eDynamicSet(QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, QMLContractPackage.Literals.SIMPLE_QML_CONTRACT__CONTRACT_TYPE, newContractType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 QMLContractValidator.SIMPLE_QML_CONTRACT__ALL_DIMENSIO_NS_MUST_BE_FROM_SAME_CONTRACTTYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "all_DIMENSIONs_must_be_from_same_CONTRACTTYPE", EObjectValidator.getObjectLabel(this, context) }),
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA:
				return getCriteria();
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE:
				if (resolve) return getContractType();
				return basicGetContractType();
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criterion>)newValue);
				return;
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE:
				setContractType((QMLContractType)newValue);
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA:
				getCriteria().clear();
				return;
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE:
				setContractType((QMLContractType)null);
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CRITERIA:
				return !getCriteria().isEmpty();
			case QMLContractPackage.SIMPLE_QML_CONTRACT__CONTRACT_TYPE:
				return basicGetContractType() != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleQMLContractImpl
