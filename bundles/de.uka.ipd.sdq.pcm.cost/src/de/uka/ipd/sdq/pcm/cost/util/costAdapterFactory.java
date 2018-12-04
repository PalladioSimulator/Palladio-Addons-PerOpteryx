/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.cost.costPackage
 * @generated
 */
public class costAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static costPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public costAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = costPackage.eINSTANCE;
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
    protected costSwitch<Adapter> modelSwitch =
            new costSwitch<Adapter>()
            {
        @Override
        public Adapter caseComponentCost(final ComponentCost object)
        {
            return costAdapterFactory.this.createComponentCostAdapter();
        }

        @Override
        public Adapter caseCost(final Cost object)
        {
            return costAdapterFactory.this.createCostAdapter();
        }

        @Override
        public Adapter caseFixedLinkingResourceCost(final FixedLinkingResourceCost object)
        {
            return costAdapterFactory.this.createFixedLinkingResourceCostAdapter();
        }

        @Override
        public Adapter caseLinkingResourceCost(final LinkingResourceCost object)
        {
            return costAdapterFactory.this.createLinkingResourceCostAdapter();
        }

        @Override
        public Adapter caseFixedProcessingResourceCost(final FixedProcessingResourceCost object)
        {
            return costAdapterFactory.this.createFixedProcessingResourceCostAdapter();
        }

        @Override
        public Adapter caseProcessingResourceCost(final ProcessingResourceCost object)
        {
            return costAdapterFactory.this.createProcessingResourceCostAdapter();
        }

        @Override
        public Adapter caseVariableCost(final VariableCost object)
        {
            return costAdapterFactory.this.createVariableCostAdapter();
        }

        @Override
        public Adapter caseVariableLinkingResourceCost(final VariableLinkingResourceCost object)
        {
            return costAdapterFactory.this.createVariableLinkingResourceCostAdapter();
        }

        @Override
        public Adapter caseVariableProcessingResourceCost(final VariableProcessingResourceCost object)
        {
            return costAdapterFactory.this.createVariableProcessingResourceCostAdapter();
        }

        @Override
        public Adapter caseScalarFunction(final ScalarFunction object)
        {
            return costAdapterFactory.this.createScalarFunctionAdapter();
        }

        @Override
        public Adapter caseCostRepository(final CostRepository object)
        {
            return costAdapterFactory.this.createCostRepositoryAdapter();
        }

        @Override
        public Adapter caseComponentCostPerInstance(final ComponentCostPerInstance object)
        {
            return costAdapterFactory.this.createComponentCostPerInstanceAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return costAdapterFactory.this.createEObjectAdapter();
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
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.cost.ComponentCost
     * <em>Component Cost</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.ComponentCost
              * @generated
              */
             public Adapter createComponentCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.cost.Cost
     * <em>Cost</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.Cost
              * @generated
              */
             public Adapter createCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.FixedLinkingResourceCost <em>Fixed Linking Resource Cost</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.FixedLinkingResourceCost
              * @generated
              */
             public Adapter createFixedLinkingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
              * {@link de.uka.ipd.sdq.pcm.cost.LinkingResourceCost <em>Linking Resource Cost</em>}'. <!--
              * begin-user-doc --> This default implementation returns null so that we can easily ignore
              * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
              * end-user-doc -->
              *
              * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.LinkingResourceCost
              * @generated
              */
             public Adapter createLinkingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost
     * <em>Fixed Processing Resource Cost</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost
              * @generated
              */
             public Adapter createFixedProcessingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.ProcessingResourceCost <em>Processing Resource Cost</em>}'.
              * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
              * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
              * end-user-doc -->
              *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.ProcessingResourceCost
              * @generated
              */
             public Adapter createProcessingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.cost.VariableCost
     * <em>Variable Cost</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.VariableCost
              * @generated
              */
             public Adapter createVariableCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost
     * <em>Variable Linking Resource Cost</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost
              * @generated
              */
             public Adapter createVariableLinkingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost
     * <em>Variable Processing Resource Cost</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost
              * @generated
              */
             public Adapter createVariableProcessingResourceCostAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.cost.ScalarFunction
     * <em>Scalar Function</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.ScalarFunction
              * @generated
              */
             public Adapter createScalarFunctionAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.cost.CostRepository
     * <em>Cost Repository</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.CostRepository
              * @generated
              */
             public Adapter createCostRepositoryAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance <em>Component Cost Per Instance</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance
              * @generated
              */
             public Adapter createComponentCostPerInstanceAdapter() {
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

} // costAdapterFactory
