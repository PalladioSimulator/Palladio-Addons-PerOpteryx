/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.GenericQMLContract;

import de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RequirementImpl#getRequireContract <em>Require Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends IdentifierImpl implements Requirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GenericQMLContract> getRequireContract() {
		return (EList<GenericQMLContract>)eDynamicGet(ProfilePackage.REQUIREMENT__REQUIRE_CONTRACT, ProfilePackage.Literals.REQUIREMENT__REQUIRE_CONTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
				return getRequireContract();
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
			case ProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
				getRequireContract().clear();
				getRequireContract().addAll((Collection<? extends GenericQMLContract>)newValue);
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
			case ProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
				getRequireContract().clear();
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
			case ProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
				return !getRequireContract().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementImpl
