/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage
 * @generated
 */
public class QMLProfileSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLProfilePackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLProfileSwitch() {
        if (modelPackage == null)
        {
            modelPackage = QMLProfilePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID)
        {
        case QMLProfilePackage.SIMPLE_QML_PROFILE: {
            final SimpleQMLProfile simpleQMLProfile = (SimpleQMLProfile) theEObject;
            T result = this.caseSimpleQMLProfile(simpleQMLProfile);
            if (result == null) {
                result = this.caseGenericQMLProfile(simpleQMLProfile);
            }
            if (result == null) {
                result = this.caseQMLDeclaration(simpleQMLProfile);
            }
            if (result == null) {
                result = this.caseEntity(simpleQMLProfile);
            }
            if (result == null) {
                result = this.caseIdentifier(simpleQMLProfile);
            }
            if (result == null) {
                result = this.caseNamedElement(simpleQMLProfile);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLProfilePackage.GENERIC_QML_PROFILE: {
            final GenericQMLProfile genericQMLProfile = (GenericQMLProfile) theEObject;
            T result = this.caseGenericQMLProfile(genericQMLProfile);
            if (result == null) {
                result = this.caseQMLDeclaration(genericQMLProfile);
            }
            if (result == null) {
                result = this.caseEntity(genericQMLProfile);
            }
            if (result == null) {
                result = this.caseIdentifier(genericQMLProfile);
            }
            if (result == null) {
                result = this.caseNamedElement(genericQMLProfile);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLProfilePackage.REQUIREMENT: {
            final Requirement requirement = (Requirement) theEObject;
            T result = this.caseRequirement(requirement);
            if (result == null) {
                result = this.caseIdentifier(requirement);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLProfilePackage.REFINED_QML_PROFILE: {
            final RefinedQMLProfile refinedQMLProfile = (RefinedQMLProfile) theEObject;
            T result = this.caseRefinedQMLProfile(refinedQMLProfile);
            if (result == null) {
                result = this.caseGenericQMLProfile(refinedQMLProfile);
            }
            if (result == null) {
                result = this.caseQMLDeclaration(refinedQMLProfile);
            }
            if (result == null) {
                result = this.caseEntity(refinedQMLProfile);
            }
            if (result == null) {
                result = this.caseIdentifier(refinedQMLProfile);
            }
            if (result == null) {
                result = this.caseNamedElement(refinedQMLProfile);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT: {
            final UsageScenarioRequirement usageScenarioRequirement = (UsageScenarioRequirement) theEObject;
            T result = this.caseUsageScenarioRequirement(usageScenarioRequirement);
            if (result == null) {
                result = this.caseRequirement(usageScenarioRequirement);
            }
            if (result == null) {
                result = this.caseIdentifier(usageScenarioRequirement);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT: {
            final EntryLevelSystemCallRequirement entryLevelSystemCallRequirement = (EntryLevelSystemCallRequirement) theEObject;
            T result = this.caseEntryLevelSystemCallRequirement(entryLevelSystemCallRequirement);
            if (result == null) {
                result = this.caseRequirement(entryLevelSystemCallRequirement);
            }
            if (result == null) {
                result = this.caseIdentifier(entryLevelSystemCallRequirement);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple QML Profile</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple QML Profile</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleQMLProfile(final SimpleQMLProfile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic QML Profile</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic QML Profile</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericQMLProfile(final GenericQMLProfile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequirement(final Requirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Refined QML Profile</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Refined QML Profile</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRefinedQMLProfile(final RefinedQMLProfile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Usage Scenario Requirement</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Usage Scenario Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsageScenarioRequirement(final UsageScenarioRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Entry Level System Call Requirement</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Entry Level System Call Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryLevelSystemCallRequirement(final EntryLevelSystemCallRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQMLDeclaration(final QMLDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // QMLProfileSwitch
