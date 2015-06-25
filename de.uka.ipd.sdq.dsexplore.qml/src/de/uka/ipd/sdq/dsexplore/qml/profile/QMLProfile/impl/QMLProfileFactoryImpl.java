/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfileFactory;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class QMLProfileFactoryImpl extends EFactoryImpl implements QMLProfileFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static QMLProfileFactory init() {
        try
        {
            final QMLProfileFactory theQMLProfileFactory = (QMLProfileFactory) EPackage.Registry.INSTANCE
                    .getEFactory(QMLProfilePackage.eNS_URI);
            if (theQMLProfileFactory != null)
            {
                return theQMLProfileFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QMLProfileFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLProfileFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case QMLProfilePackage.SIMPLE_QML_PROFILE:
            return this.createSimpleQMLProfile();
        case QMLProfilePackage.REFINED_QML_PROFILE:
            return this.createRefinedQMLProfile();
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT:
            return this.createUsageScenarioRequirement();
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT:
            return this.createEntryLevelSystemCallRequirement();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimpleQMLProfile createSimpleQMLProfile() {
        final SimpleQMLProfileImpl simpleQMLProfile = new SimpleQMLProfileImpl();
        return simpleQMLProfile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RefinedQMLProfile createRefinedQMLProfile() {
        final RefinedQMLProfileImpl refinedQMLProfile = new RefinedQMLProfileImpl();
        return refinedQMLProfile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageScenarioRequirement createUsageScenarioRequirement() {
        final UsageScenarioRequirementImpl usageScenarioRequirement = new UsageScenarioRequirementImpl();
        return usageScenarioRequirement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryLevelSystemCallRequirement createEntryLevelSystemCallRequirement() {
        final EntryLevelSystemCallRequirementImpl entryLevelSystemCallRequirement = new EntryLevelSystemCallRequirementImpl();
        return entryLevelSystemCallRequirement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLProfilePackage getQMLProfilePackage() {
        return (QMLProfilePackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QMLProfilePackage getPackage() {
        return QMLProfilePackage.eINSTANCE;
    }

} // QMLProfileFactoryImpl
