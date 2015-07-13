/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage
 * @generated
 */
public class QMLContractAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLContractPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = QMLContractPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected QMLContractSwitch<Adapter> modelSwitch =
            new QMLContractSwitch<Adapter>()
            {
        @Override
        public Adapter caseSimpleQMLContract(final SimpleQMLContract object)
        {
            return QMLContractAdapterFactory.this.createSimpleQMLContractAdapter();
        }

        @Override
        public Adapter caseCriterion(final Criterion object)
        {
            return QMLContractAdapterFactory.this.createCriterionAdapter();
        }

        @Override
        public Adapter caseEvaluationAspect(final EvaluationAspect object)
        {
            return QMLContractAdapterFactory.this.createEvaluationAspectAdapter();
        }

        @Override
        public Adapter caseAspectRequirement(final AspectRequirement object)
        {
            return QMLContractAdapterFactory.this.createAspectRequirementAdapter();
        }

        @Override
        public Adapter caseValueLiteral(final ValueLiteral object)
        {
            return QMLContractAdapterFactory.this.createValueLiteralAdapter();
        }

        @Override
        public Adapter casePercentile(final Percentile object)
        {
            return QMLContractAdapterFactory.this.createPercentileAdapter();
        }

        @Override
        public Adapter casePointEstimator(final PointEstimator object)
        {
            return QMLContractAdapterFactory.this.createPointEstimatorAdapter();
        }

        @Override
        public Adapter caseStochasticEvaluationAspect(final StochasticEvaluationAspect object)
        {
            return QMLContractAdapterFactory.this.createStochasticEvaluationAspectAdapter();
        }

        @Override
        public Adapter caseFrequency(final Frequency object)
        {
            return QMLContractAdapterFactory.this.createFrequencyAdapter();
        }

        @Override
        public Adapter caseRangeValue(final RangeValue object)
        {
            return QMLContractAdapterFactory.this.createRangeValueAdapter();
        }

        @Override
        public Adapter caseMean(final Mean object)
        {
            return QMLContractAdapterFactory.this.createMeanAdapter();
        }

        @Override
        public Adapter caseVariance(final Variance object)
        {
            return QMLContractAdapterFactory.this.createVarianceAdapter();
        }

        @Override
        public Adapter caseNumericLiteral(final NumericLiteral object)
        {
            return QMLContractAdapterFactory.this.createNumericLiteralAdapter();
        }

        @Override
        public Adapter caseEnumLiteral(final EnumLiteral object)
        {
            return QMLContractAdapterFactory.this.createEnumLiteralAdapter();
        }

        @Override
        public Adapter caseSetLiteral(final SetLiteral object)
        {
            return QMLContractAdapterFactory.this.createSetLiteralAdapter();
        }

        @Override
        public Adapter caseRefinedQMLContract(final RefinedQMLContract object)
        {
            return QMLContractAdapterFactory.this.createRefinedQMLContractAdapter();
        }

        @Override
        public Adapter caseValue(final Value object)
        {
            return QMLContractAdapterFactory.this.createValueAdapter();
        }

        @Override
        public Adapter caseDeterministicEvaluationAspect(final DeterministicEvaluationAspect object)
        {
            return QMLContractAdapterFactory.this.createDeterministicEvaluationAspectAdapter();
        }

        @Override
        public Adapter caseObjective(final Objective object)
        {
            return QMLContractAdapterFactory.this.createObjectiveAdapter();
        }

        @Override
        public Adapter caseConstraint(final Constraint object)
        {
            return QMLContractAdapterFactory.this.createConstraintAdapter();
        }

        @Override
        public Adapter caseRestriction(final Restriction object)
        {
            return QMLContractAdapterFactory.this.createRestrictionAdapter();
        }

        @Override
        public Adapter caseGoal(final Goal object)
        {
            return QMLContractAdapterFactory.this.createGoalAdapter();
        }

        @Override
        public Adapter caseGenericQMLContract(final GenericQMLContract object)
        {
            return QMLContractAdapterFactory.this.createGenericQMLContractAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return QMLContractAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return QMLContractAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object)
        {
            return QMLContractAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter caseQMLDeclaration(final QMLDeclaration object)
        {
            return QMLContractAdapterFactory.this.createQMLDeclarationAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return QMLContractAdapterFactory.this.createEObjectAdapter();
        }
            };

            /**
             * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
             * @generated
             */
             @Override
             public Adapter createAdapter(final Notifier target) {
                 return this.modelSwitch.doSwitch((EObject) target);
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract
     * <em>Simple QML Contract</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract
              * @generated
              */
             public Adapter createSimpleQMLContractAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion <em>Criterion</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion
              * @generated
              */
             public Adapter createCriterionAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect
     * <em>Evaluation Aspect</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect
              * @generated
              */
             public Adapter createEvaluationAspectAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement
     * <em>Aspect Requirement</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement
              * @generated
              */
             public Adapter createAspectRequirementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral <em>Value Literal</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral
              * @generated
              */
             public Adapter createValueLiteralAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile <em>Percentile</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile
              * @generated
              */
             public Adapter createPercentileAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.PointEstimator
     * <em>Point Estimator</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.PointEstimator
              * @generated
              */
             public Adapter createPointEstimatorAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.StochasticEvaluationAspect
     * <em>Stochastic Evaluation Aspect</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.StochasticEvaluationAspect
              * @generated
              */
             public Adapter createStochasticEvaluationAspectAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency <em>Frequency</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency
              * @generated
              */
             public Adapter createFrequencyAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue <em>Range Value</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue
              * @generated
              */
             public Adapter createRangeValueAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean <em>Mean</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean
              * @generated
              */
             public Adapter createMeanAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance <em>Variance</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance
              * @generated
              */
             public Adapter createVarianceAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral
     * <em>Numeric Literal</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral
              * @generated
              */
             public Adapter createNumericLiteralAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral <em>Enum Literal</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral
              * @generated
              */
             public Adapter createEnumLiteralAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral <em>Set Literal</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral
              * @generated
              */
             public Adapter createSetLiteralAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract
     * <em>Refined QML Contract</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract
              * @generated
              */
             public Adapter createRefinedQMLContractAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value <em>Value</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value
              * @generated
              */
             public Adapter createValueAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.DeterministicEvaluationAspect
     * <em>Deterministic Evaluation Aspect</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.DeterministicEvaluationAspect
              * @generated
              */
             public Adapter createDeterministicEvaluationAspectAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective <em>Objective</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective
              * @generated
              */
             public Adapter createObjectiveAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint
              * @generated
              */
             public Adapter createConstraintAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction <em>Restriction</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction
              * @generated
              */
             public Adapter createRestrictionAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal <em>Goal</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal
              * @generated
              */
             public Adapter createGoalAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract
     * <em>Generic QML Contract</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract
              * @generated
              */
             public Adapter createGenericQMLContractAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.identifier.Identifier
              * @generated
              */
             public Adapter createIdentifierAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see org.palladiosimulator.pcm.core.entity.NamedElement
              * @generated
              */
             public Adapter createNamedElementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see org.palladiosimulator.pcm.core.entity.Entity
              * @generated
              */
             public Adapter createEntityAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration
     * <em>QML Declaration</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration
              * @generated
              */
             public Adapter createQMLDeclarationAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @generated
              */
             public Adapter createEObjectAdapter() {
                 return null;
             }

} // QMLContractAdapterFactory
