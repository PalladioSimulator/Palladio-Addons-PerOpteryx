/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.DeterministicEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.PointEstimator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.StochasticEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage
 * @generated
 */
public class QMLContractSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLContractPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractSwitch() {
        if (modelPackage == null)
        {
            modelPackage = QMLContractPackage.eINSTANCE;
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
        case QMLContractPackage.SIMPLE_QML_CONTRACT: {
            final SimpleQMLContract simpleQMLContract = (SimpleQMLContract) theEObject;
            T result = this.caseSimpleQMLContract(simpleQMLContract);
            if (result == null) {
                result = this.caseGenericQMLContract(simpleQMLContract);
            }
            if (result == null) {
                result = this.caseQMLDeclaration(simpleQMLContract);
            }
            if (result == null) {
                result = this.caseEntity(simpleQMLContract);
            }
            if (result == null) {
                result = this.caseIdentifier(simpleQMLContract);
            }
            if (result == null) {
                result = this.caseNamedElement(simpleQMLContract);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.CRITERION: {
            final Criterion criterion = (Criterion) theEObject;
            T result = this.caseCriterion(criterion);
            if (result == null) {
                result = this.caseIdentifier(criterion);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.EVALUATION_ASPECT: {
            final EvaluationAspect evaluationAspect = (EvaluationAspect) theEObject;
            T result = this.caseEvaluationAspect(evaluationAspect);
            if (result == null) {
                result = this.caseIdentifier(evaluationAspect);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.ASPECT_REQUIREMENT: {
            final AspectRequirement aspectRequirement = (AspectRequirement) theEObject;
            T result = this.caseAspectRequirement(aspectRequirement);
            if (result == null) {
                result = this.caseIdentifier(aspectRequirement);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.VALUE_LITERAL: {
            final ValueLiteral valueLiteral = (ValueLiteral) theEObject;
            T result = this.caseValueLiteral(valueLiteral);
            if (result == null) {
                result = this.caseIdentifier(valueLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.PERCENTILE: {
            final Percentile percentile = (Percentile) theEObject;
            T result = this.casePercentile(percentile);
            if (result == null) {
                result = this.casePointEstimator(percentile);
            }
            if (result == null) {
                result = this.caseStochasticEvaluationAspect(percentile);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(percentile);
            }
            if (result == null) {
                result = this.caseIdentifier(percentile);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.POINT_ESTIMATOR: {
            final PointEstimator pointEstimator = (PointEstimator) theEObject;
            T result = this.casePointEstimator(pointEstimator);
            if (result == null) {
                result = this.caseStochasticEvaluationAspect(pointEstimator);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(pointEstimator);
            }
            if (result == null) {
                result = this.caseIdentifier(pointEstimator);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.STOCHASTIC_EVALUATION_ASPECT: {
            final StochasticEvaluationAspect stochasticEvaluationAspect = (StochasticEvaluationAspect) theEObject;
            T result = this.caseStochasticEvaluationAspect(stochasticEvaluationAspect);
            if (result == null) {
                result = this.caseEvaluationAspect(stochasticEvaluationAspect);
            }
            if (result == null) {
                result = this.caseIdentifier(stochasticEvaluationAspect);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.FREQUENCY: {
            final Frequency frequency = (Frequency) theEObject;
            T result = this.caseFrequency(frequency);
            if (result == null) {
                result = this.caseStochasticEvaluationAspect(frequency);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(frequency);
            }
            if (result == null) {
                result = this.caseIdentifier(frequency);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.RANGE_VALUE: {
            final RangeValue rangeValue = (RangeValue) theEObject;
            T result = this.caseRangeValue(rangeValue);
            if (result == null) {
                result = this.caseIdentifier(rangeValue);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.MEAN: {
            final Mean mean = (Mean) theEObject;
            T result = this.caseMean(mean);
            if (result == null) {
                result = this.casePointEstimator(mean);
            }
            if (result == null) {
                result = this.caseStochasticEvaluationAspect(mean);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(mean);
            }
            if (result == null) {
                result = this.caseIdentifier(mean);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.VARIANCE: {
            final Variance variance = (Variance) theEObject;
            T result = this.caseVariance(variance);
            if (result == null) {
                result = this.casePointEstimator(variance);
            }
            if (result == null) {
                result = this.caseStochasticEvaluationAspect(variance);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(variance);
            }
            if (result == null) {
                result = this.caseIdentifier(variance);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.NUMERIC_LITERAL: {
            final NumericLiteral numericLiteral = (NumericLiteral) theEObject;
            T result = this.caseNumericLiteral(numericLiteral);
            if (result == null) {
                result = this.caseValueLiteral(numericLiteral);
            }
            if (result == null) {
                result = this.caseIdentifier(numericLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.ENUM_LITERAL: {
            final EnumLiteral enumLiteral = (EnumLiteral) theEObject;
            T result = this.caseEnumLiteral(enumLiteral);
            if (result == null) {
                result = this.caseValueLiteral(enumLiteral);
            }
            if (result == null) {
                result = this.caseIdentifier(enumLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.SET_LITERAL: {
            final SetLiteral setLiteral = (SetLiteral) theEObject;
            T result = this.caseSetLiteral(setLiteral);
            if (result == null) {
                result = this.caseValueLiteral(setLiteral);
            }
            if (result == null) {
                result = this.caseIdentifier(setLiteral);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.REFINED_QML_CONTRACT: {
            final RefinedQMLContract refinedQMLContract = (RefinedQMLContract) theEObject;
            T result = this.caseRefinedQMLContract(refinedQMLContract);
            if (result == null) {
                result = this.caseGenericQMLContract(refinedQMLContract);
            }
            if (result == null) {
                result = this.caseQMLDeclaration(refinedQMLContract);
            }
            if (result == null) {
                result = this.caseEntity(refinedQMLContract);
            }
            if (result == null) {
                result = this.caseIdentifier(refinedQMLContract);
            }
            if (result == null) {
                result = this.caseNamedElement(refinedQMLContract);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.VALUE: {
            final Value value = (Value) theEObject;
            T result = this.caseValue(value);
            if (result == null) {
                result = this.caseDeterministicEvaluationAspect(value);
            }
            if (result == null) {
                result = this.caseEvaluationAspect(value);
            }
            if (result == null) {
                result = this.caseIdentifier(value);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.DETERMINISTIC_EVALUATION_ASPECT: {
            final DeterministicEvaluationAspect deterministicEvaluationAspect = (DeterministicEvaluationAspect) theEObject;
            T result = this.caseDeterministicEvaluationAspect(deterministicEvaluationAspect);
            if (result == null) {
                result = this.caseEvaluationAspect(deterministicEvaluationAspect);
            }
            if (result == null) {
                result = this.caseIdentifier(deterministicEvaluationAspect);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.OBJECTIVE: {
            final Objective objective = (Objective) theEObject;
            T result = this.caseObjective(objective);
            if (result == null) {
                result = this.caseCriterion(objective);
            }
            if (result == null) {
                result = this.caseIdentifier(objective);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.CONSTRAINT: {
            final Constraint constraint = (Constraint) theEObject;
            T result = this.caseConstraint(constraint);
            if (result == null) {
                result = this.caseCriterion(constraint);
            }
            if (result == null) {
                result = this.caseIdentifier(constraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.RESTRICTION: {
            final Restriction restriction = (Restriction) theEObject;
            T result = this.caseRestriction(restriction);
            if (result == null) {
                result = this.caseAspectRequirement(restriction);
            }
            if (result == null) {
                result = this.caseIdentifier(restriction);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.GOAL: {
            final Goal goal = (Goal) theEObject;
            T result = this.caseGoal(goal);
            if (result == null) {
                result = this.caseAspectRequirement(goal);
            }
            if (result == null) {
                result = this.caseIdentifier(goal);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractPackage.GENERIC_QML_CONTRACT: {
            final GenericQMLContract genericQMLContract = (GenericQMLContract) theEObject;
            T result = this.caseGenericQMLContract(genericQMLContract);
            if (result == null) {
                result = this.caseQMLDeclaration(genericQMLContract);
            }
            if (result == null) {
                result = this.caseEntity(genericQMLContract);
            }
            if (result == null) {
                result = this.caseIdentifier(genericQMLContract);
            }
            if (result == null) {
                result = this.caseNamedElement(genericQMLContract);
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
     * Returns the result of interpreting the object as an instance of '<em>Simple QML Contract</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple QML Contract</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleQMLContract(final SimpleQMLContract object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCriterion(final Criterion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Evaluation Aspect</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Evaluation Aspect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEvaluationAspect(final EvaluationAspect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aspect Requirement</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aspect Requirement</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAspectRequirement(final AspectRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueLiteral(final ValueLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Percentile</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Percentile</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePercentile(final Percentile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point Estimator</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point Estimator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePointEstimator(final PointEstimator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Stochastic Evaluation Aspect</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Stochastic Evaluation Aspect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStochasticEvaluationAspect(final StochasticEvaluationAspect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Frequency</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Frequency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFrequency(final Frequency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Value</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRangeValue(final RangeValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mean</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMean(final Mean object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variance</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariance(final Variance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericLiteral(final NumericLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumLiteral(final EnumLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetLiteral(final SetLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Refined QML Contract</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Refined QML Contract</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRefinedQMLContract(final RefinedQMLContract object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValue(final Value object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Deterministic Evaluation Aspect</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Deterministic Evaluation Aspect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeterministicEvaluationAspect(final DeterministicEvaluationAspect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Objective</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjective(final Objective object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstraint(final Constraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestriction(final Restriction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Goal</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGoal(final Goal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Generic QML Contract</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Generic QML Contract</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericQMLContract(final GenericQMLContract object) {
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

} // QMLContractSwitch
