/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.profile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;

import de.uka.ipd.sdq.dsexplore.qml.profile.util.ProfileValidator;

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
 * An implementation of the model object '<em><b>Refined QML Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl#getBaseProfile <em>Base Profile</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedQMLProfileImpl extends GenericQMLProfileImpl implements RefinedQMLProfile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedQMLProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilePackage.Literals.REFINED_QML_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericQMLProfile getBaseProfile() {
		return (GenericQMLProfile)eDynamicGet(ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE, ProfilePackage.Literals.REFINED_QML_PROFILE__BASE_PROFILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericQMLProfile basicGetBaseProfile() {
		return (GenericQMLProfile)eDynamicGet(ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE, ProfilePackage.Literals.REFINED_QML_PROFILE__BASE_PROFILE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseProfile(GenericQMLProfile newBaseProfile) {
		eDynamicSet(ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE, ProfilePackage.Literals.REFINED_QML_PROFILE__BASE_PROFILE, newBaseProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Requirement> getRefinedBy() {
		return (EList<Requirement>)eDynamicGet(ProfilePackage.REFINED_QML_PROFILE__REFINED_BY, ProfilePackage.Literals.REFINED_QML_PROFILE__REFINED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean profile_cannot_refine_itself(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ProfileValidator.DIAGNOSTIC_SOURCE,
						 ProfileValidator.REFINED_QML_PROFILE__PROFILE_CANNOT_REFINE_ITSELF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "profile_cannot_refine_itself", EObjectValidator.getObjectLabel(this, context) }),
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
			case ProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
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
			case ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
				if (resolve) return getBaseProfile();
				return basicGetBaseProfile();
			case ProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
				return getRefinedBy();
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
			case ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
				setBaseProfile((GenericQMLProfile)newValue);
				return;
			case ProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends Requirement>)newValue);
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
			case ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
				setBaseProfile((GenericQMLProfile)null);
				return;
			case ProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
				getRefinedBy().clear();
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
			case ProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
				return basicGetBaseProfile() != null;
			case ProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
				return !getRefinedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefinedQMLProfileImpl
