/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.UsageScenarioRequirement;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Scenario Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.UsageScenarioRequirementImpl#getUsageScenario <em>Usage Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageScenarioRequirementImpl extends RequirementImpl implements UsageScenarioRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageScenarioRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.USAGE_SCENARIO_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario getUsageScenario() {
		return (UsageScenario)eDynamicGet(ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, ProfilePackage.Literals.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario basicGetUsageScenario() {
		return (UsageScenario)eDynamicGet(ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, ProfilePackage.Literals.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageScenario(UsageScenario newUsageScenario) {
		eDynamicSet(ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, ProfilePackage.Literals.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, newUsageScenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
				if (resolve) return getUsageScenario();
				return basicGetUsageScenario();
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
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
				setUsageScenario((UsageScenario)newValue);
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
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
				setUsageScenario((UsageScenario)null);
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
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
				return basicGetUsageScenario() != null;
		}
		return super.eIsSet(featureID);
	}

} //UsageScenarioRequirementImpl
