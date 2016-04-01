/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.profile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Level System Call Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.EntryLevelSystemCallRequirementImpl#getEntryLevelSystemCall <em>Entry Level System Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryLevelSystemCallRequirementImpl extends RequirementImpl implements EntryLevelSystemCallRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryLevelSystemCallRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCall getEntryLevelSystemCall() {
		return (EntryLevelSystemCall)eDynamicGet(ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, ProfilePackage.Literals.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCall basicGetEntryLevelSystemCall() {
		return (EntryLevelSystemCall)eDynamicGet(ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, ProfilePackage.Literals.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryLevelSystemCall(EntryLevelSystemCall newEntryLevelSystemCall) {
		eDynamicSet(ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, ProfilePackage.Literals.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL, newEntryLevelSystemCall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
				if (resolve) return getEntryLevelSystemCall();
				return basicGetEntryLevelSystemCall();
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
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
				setEntryLevelSystemCall((EntryLevelSystemCall)newValue);
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
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
				setEntryLevelSystemCall((EntryLevelSystemCall)null);
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
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
				return basicGetEntryLevelSystemCall() != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryLevelSystemCallRequirementImpl
