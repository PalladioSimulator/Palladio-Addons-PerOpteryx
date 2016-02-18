/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance;
import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.FixedLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.LinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.ProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.ScalarFunction;
import de.uka.ipd.sdq.pcm.cost.VariableCost;
import de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.cost.costPackage
 * @generated
 */
public class costSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static costPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public costSwitch() {
        if (modelPackage == null)
        {
            modelPackage = costPackage.eINSTANCE;
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
        case costPackage.COMPONENT_COST: {
            final ComponentCost componentCost = (ComponentCost) theEObject;
            T result = this.caseComponentCost(componentCost);
            if (result == null) {
                result = this.caseCost(componentCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.COST: {
            final Cost cost = (Cost) theEObject;
            T result = this.caseCost(cost);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.FIXED_LINKING_RESOURCE_COST: {
            final FixedLinkingResourceCost fixedLinkingResourceCost = (FixedLinkingResourceCost) theEObject;
            T result = this.caseFixedLinkingResourceCost(fixedLinkingResourceCost);
            if (result == null) {
                result = this.caseLinkingResourceCost(fixedLinkingResourceCost);
            }
            if (result == null) {
                result = this.caseCost(fixedLinkingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.LINKING_RESOURCE_COST: {
            final LinkingResourceCost linkingResourceCost = (LinkingResourceCost) theEObject;
            T result = this.caseLinkingResourceCost(linkingResourceCost);
            if (result == null) {
                result = this.caseCost(linkingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.FIXED_PROCESSING_RESOURCE_COST: {
            final FixedProcessingResourceCost fixedProcessingResourceCost = (FixedProcessingResourceCost) theEObject;
            T result = this.caseFixedProcessingResourceCost(fixedProcessingResourceCost);
            if (result == null) {
                result = this.caseProcessingResourceCost(fixedProcessingResourceCost);
            }
            if (result == null) {
                result = this.caseCost(fixedProcessingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.PROCESSING_RESOURCE_COST: {
            final ProcessingResourceCost processingResourceCost = (ProcessingResourceCost) theEObject;
            T result = this.caseProcessingResourceCost(processingResourceCost);
            if (result == null) {
                result = this.caseCost(processingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.VARIABLE_COST: {
            final VariableCost variableCost = (VariableCost) theEObject;
            T result = this.caseVariableCost(variableCost);
            if (result == null) {
                result = this.caseCost(variableCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.VARIABLE_LINKING_RESOURCE_COST: {
            final VariableLinkingResourceCost variableLinkingResourceCost = (VariableLinkingResourceCost) theEObject;
            T result = this.caseVariableLinkingResourceCost(variableLinkingResourceCost);
            if (result == null) {
                result = this.caseVariableCost(variableLinkingResourceCost);
            }
            if (result == null) {
                result = this.caseLinkingResourceCost(variableLinkingResourceCost);
            }
            if (result == null) {
                result = this.caseCost(variableLinkingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST: {
            final VariableProcessingResourceCost variableProcessingResourceCost = (VariableProcessingResourceCost) theEObject;
            T result = this.caseVariableProcessingResourceCost(variableProcessingResourceCost);
            if (result == null) {
                result = this.caseVariableCost(variableProcessingResourceCost);
            }
            if (result == null) {
                result = this.caseProcessingResourceCost(variableProcessingResourceCost);
            }
            if (result == null) {
                result = this.caseCost(variableProcessingResourceCost);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.SCALAR_FUNCTION: {
            final ScalarFunction scalarFunction = (ScalarFunction) theEObject;
            T result = this.caseScalarFunction(scalarFunction);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.COST_REPOSITORY: {
            final CostRepository costRepository = (CostRepository) theEObject;
            T result = this.caseCostRepository(costRepository);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case costPackage.COMPONENT_COST_PER_INSTANCE: {
            final ComponentCostPerInstance componentCostPerInstance = (ComponentCostPerInstance) theEObject;
            T result = this.caseComponentCostPerInstance(componentCostPerInstance);
            if (result == null) {
                result = this.caseComponentCost(componentCostPerInstance);
            }
            if (result == null) {
                result = this.caseCost(componentCostPerInstance);
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
     * Returns the result of interpreting the object as an instance of '<em>Component Cost</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponentCost(final ComponentCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cost</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCost(final Cost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Fixed Linking Resource Cost</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Fixed Linking Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedLinkingResourceCost(final FixedLinkingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Linking Resource Cost</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Linking Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkingResourceCost(final LinkingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Fixed Processing Resource Cost</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Fixed Processing Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedProcessingResourceCost(final FixedProcessingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Processing Resource Cost</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Processing Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessingResourceCost(final ProcessingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Cost</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableCost(final VariableCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Variable Linking Resource Cost</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Variable Linking Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableLinkingResourceCost(final VariableLinkingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Variable Processing Resource Cost</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Variable Processing Resource Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableProcessingResourceCost(final VariableProcessingResourceCost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scalar Function</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scalar Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScalarFunction(final ScalarFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cost Repository</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cost Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCostRepository(final CostRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Component Cost Per Instance</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Component Cost Per Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponentCostPerInstance(final ComponentCostPerInstance object) {
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

} // costSwitch
