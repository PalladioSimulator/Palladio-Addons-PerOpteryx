/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.impl;

import de.uka.ipd.sdq.dsexplore.qml.profile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileFactoryImpl extends EFactoryImpl implements ProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfileFactory init() {
		try {
			ProfileFactory theProfileFactory = (ProfileFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilePackage.eNS_URI);
			if (theProfileFactory != null) {
				return theProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProfilePackage.SIMPLE_QML_PROFILE: return (EObject)createSimpleQMLProfile();
			case ProfilePackage.REFINED_QML_PROFILE: return (EObject)createRefinedQMLProfile();
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT: return (EObject)createUsageScenarioRequirement();
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT: return (EObject)createEntryLevelSystemCallRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQMLProfile createSimpleQMLProfile() {
		SimpleQMLProfileImpl simpleQMLProfile = new SimpleQMLProfileImpl();
		return simpleQMLProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedQMLProfile createRefinedQMLProfile() {
		RefinedQMLProfileImpl refinedQMLProfile = new RefinedQMLProfileImpl();
		return refinedQMLProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenarioRequirement createUsageScenarioRequirement() {
		UsageScenarioRequirementImpl usageScenarioRequirement = new UsageScenarioRequirementImpl();
		return usageScenarioRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCallRequirement createEntryLevelSystemCallRequirement() {
		EntryLevelSystemCallRequirementImpl entryLevelSystemCallRequirement = new EntryLevelSystemCallRequirementImpl();
		return entryLevelSystemCallRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilePackage getProfilePackage() {
		return (ProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilePackage getPackage() {
		return ProfilePackage.eINSTANCE;
	}

} //ProfileFactoryImpl
