/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.usagemodel.UsageModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple QML Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleQMLProfileImpl extends GenericQMLProfileImpl implements SimpleQMLProfile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQMLProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.SIMPLE_QML_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel getUsageModel() {
		return (UsageModel)eDynamicGet(ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL, ProfilePackage.Literals.SIMPLE_QML_PROFILE__USAGE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel basicGetUsageModel() {
		return (UsageModel)eDynamicGet(ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL, ProfilePackage.Literals.SIMPLE_QML_PROFILE__USAGE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageModel(UsageModel newUsageModel) {
		eDynamicSet(ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL, ProfilePackage.Literals.SIMPLE_QML_PROFILE__USAGE_MODEL, newUsageModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Requirement> getRequirements() {
		return (EList<Requirement>)eDynamicGet(ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS, ProfilePackage.Literals.SIMPLE_QML_PROFILE__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
			case ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
				if (resolve) return getUsageModel();
				return basicGetUsageModel();
			case ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
				return getRequirements();
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
			case ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
				setUsageModel((UsageModel)newValue);
				return;
			case ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
				setUsageModel((UsageModel)null);
				return;
			case ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
				getRequirements().clear();
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
			case ProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
				return basicGetUsageModel() != null;
			case ProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
				return !getRequirements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleQMLProfileImpl
