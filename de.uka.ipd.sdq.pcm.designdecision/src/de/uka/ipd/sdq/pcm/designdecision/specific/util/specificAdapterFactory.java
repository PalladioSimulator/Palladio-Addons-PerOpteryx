/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
 * @generated
 */
public class specificAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static specificPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public specificAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = specificPackage.eINSTANCE;
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
    protected specificSwitch<Adapter> modelSwitch =
            new specificSwitch<Adapter>()
            {
        @Override
        public Adapter caseExchangeComponentRule(final ExchangeComponentRule object)
        {
            return specificAdapterFactory.this.createExchangeComponentRuleAdapter();
        }

        @Override
        public Adapter caseClassAsReferenceDegree(final ClassAsReferenceDegree object)
        {
            return specificAdapterFactory.this.createClassAsReferenceDegreeAdapter();
        }

        @Override
        public Adapter caseClassDegree(final ClassDegree object)
        {
            return specificAdapterFactory.this.createClassDegreeAdapter();
        }

        @Override
        public Adapter caseClassWithCopyDegree(final ClassWithCopyDegree object)
        {
            return specificAdapterFactory.this.createClassWithCopyDegreeAdapter();
        }

        @Override
        public Adapter caseContinuousRangeDegree(final ContinuousRangeDegree object)
        {
            return specificAdapterFactory.this.createContinuousRangeDegreeAdapter();
        }

        @Override
        public Adapter caseRangeDegree(final RangeDegree object)
        {
            return specificAdapterFactory.this.createRangeDegreeAdapter();
        }

        @Override
        public Adapter caseDataTypeDegree(final DataTypeDegree object)
        {
            return specificAdapterFactory.this.createDataTypeDegreeAdapter();
        }

        @Override
        public Adapter caseDiscreteDegree(final DiscreteDegree object)
        {
            return specificAdapterFactory.this.createDiscreteDegreeAdapter();
        }

        @Override
        public Adapter caseDiscreteRangeDegree(final DiscreteRangeDegree object)
        {
            return specificAdapterFactory.this.createDiscreteRangeDegreeAdapter();
        }

        @Override
        public Adapter caseEnumDegree(final EnumDegree object)
        {
            return specificAdapterFactory.this.createEnumDegreeAdapter();
        }

        @Override
        public Adapter caseUnorderedDegree(final UnorderedDegree object)
        {
            return specificAdapterFactory.this.createUnorderedDegreeAdapter();
        }

        @Override
        public Adapter caseOrderedDataTypeDegree(final OrderedDataTypeDegree object)
        {
            return specificAdapterFactory.this.createOrderedDataTypeDegreeAdapter();
        }

        @Override
        public Adapter caseOrderedIntegerDegree(final OrderedIntegerDegree object)
        {
            return specificAdapterFactory.this.createOrderedIntegerDegreeAdapter();
        }

        @Override
        public Adapter caseStringSetDegree(final StringSetDegree object)
        {
            return specificAdapterFactory.this.createStringSetDegreeAdapter();
        }

        @Override
        public Adapter caseUnorderedPrimitiveDegree(final UnorderedPrimitiveDegree object)
        {
            return specificAdapterFactory.this.createUnorderedPrimitiveDegreeAdapter();
        }

        @Override
        public Adapter caseContinuousComponentParamDegree(final ContinuousComponentParamDegree object)
        {
            return specificAdapterFactory.this.createContinuousComponentParamDegreeAdapter();
        }

        @Override
        public Adapter caseContinuousProcessingRateDegree(final ContinuousProcessingRateDegree object)
        {
            return specificAdapterFactory.this.createContinuousProcessingRateDegreeAdapter();
        }

        @Override
        public Adapter caseProcessingRateDegree(final ProcessingRateDegree object)
        {
            return specificAdapterFactory.this.createProcessingRateDegreeAdapter();
        }

        @Override
        public Adapter caseProcessingResourceDegree(final ProcessingResourceDegree object)
        {
            return specificAdapterFactory.this.createProcessingResourceDegreeAdapter();
        }

        @Override
        public Adapter caseDiscreteComponentParamDegree(final DiscreteComponentParamDegree object)
        {
            return specificAdapterFactory.this.createDiscreteComponentParamDegreeAdapter();
        }

        @Override
        public Adapter caseDiscreteProcessingRateDegree(final DiscreteProcessingRateDegree object)
        {
            return specificAdapterFactory.this.createDiscreteProcessingRateDegreeAdapter();
        }

        @Override
        public Adapter caseFeatureConfigDegree(final FeatureConfigDegree object)
        {
            return specificAdapterFactory.this.createFeatureConfigDegreeAdapter();
        }

        @Override
        public Adapter caseFeatureGroupDegree(final FeatureGroupDegree object)
        {
            return specificAdapterFactory.this.createFeatureGroupDegreeAdapter();
        }

        @Override
        public Adapter caseFeatureSubset(final FeatureSubset object)
        {
            return specificAdapterFactory.this.createFeatureSubsetAdapter();
        }

        @Override
        public Adapter caseNumberOfCoresAsListDegree(final NumberOfCoresAsListDegree object)
        {
            return specificAdapterFactory.this.createNumberOfCoresAsListDegreeAdapter();
        }

        @Override
        public Adapter caseNumberOfCoresDegree(final NumberOfCoresDegree object)
        {
            return specificAdapterFactory.this.createNumberOfCoresDegreeAdapter();
        }

        @Override
        public Adapter caseNumberOfCoresAsRangeDegree(final NumberOfCoresAsRangeDegree object)
        {
            return specificAdapterFactory.this.createNumberOfCoresAsRangeDegreeAdapter();
        }

        @Override
        public Adapter caseOptionalFeatureDegree(final OptionalFeatureDegree object)
        {
            return specificAdapterFactory.this.createOptionalFeatureDegreeAdapter();
        }

        @Override
        public Adapter caseResourceContainerReplicationDegree(final ResourceContainerReplicationDegree object)
        {
            return specificAdapterFactory.this.createResourceContainerReplicationDegreeAdapter();
        }

        @Override
        public Adapter caseResourceContainerReplicationDegreeWithComponentChange(
                final ResourceContainerReplicationDegreeWithComponentChange object)
        {
            return specificAdapterFactory.this
                            .createResourceContainerReplicationDegreeWithComponentChangeAdapter();
        }

        @Override
        public Adapter caseResourceSelectionDegree(final ResourceSelectionDegree object)
        {
            return specificAdapterFactory.this.createResourceSelectionDegreeAdapter();
        }

        @Override
        public Adapter caseSchedulingPolicyDegree(final SchedulingPolicyDegree object)
        {
            return specificAdapterFactory.this.createSchedulingPolicyDegreeAdapter();
        }

        @Override
        public Adapter caseStringComponentParamDegree(final StringComponentParamDegree object)
        {
            return specificAdapterFactory.this.createStringComponentParamDegreeAdapter();
        }

        @Override
        public Adapter caseAllocationDegree(final AllocationDegree object)
        {
            return specificAdapterFactory.this.createAllocationDegreeAdapter();
        }

        @Override
        public Adapter caseAssembledComponentDegree(final AssembledComponentDegree object)
        {
            return specificAdapterFactory.this.createAssembledComponentDegreeAdapter();
        }

        @Override
        public Adapter caseCapacityDegree(final CapacityDegree object)
        {
            return specificAdapterFactory.this.createCapacityDegreeAdapter();
        }

        @Override
        public Adapter caseMonitoringDegree(final MonitoringDegree object)
        {
            return specificAdapterFactory.this.createMonitoringDegreeAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return specificAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseDegreeOfFreedomInstance(final DegreeOfFreedomInstance object)
        {
            return specificAdapterFactory.this.createDegreeOfFreedomInstanceAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return specificAdapterFactory.this.createEObjectAdapter();
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
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
     * <em>Exchange Component Rule</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
              * @generated
              */
              public Adapter createExchangeComponentRuleAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree
     * <em>Class As Reference Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree
               * @generated
               */
              public Adapter createClassAsReferenceDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree <em>Class Degree</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree
               * @generated
               */
              public Adapter createClassDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree
     * <em>Class With Copy Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree
               * @generated
               */
              public Adapter createClassWithCopyDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree
     * <em>Continuous Range Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree
               * @generated
               */
              public Adapter createContinuousRangeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree <em>Range Degree</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree
               * @generated
               */
              public Adapter createRangeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree <em>Data Type Degree</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree
               * @generated
               */
              public Adapter createDataTypeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree <em>Discrete Degree</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree
               * @generated
               */
              public Adapter createDiscreteDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree
     * <em>Discrete Range Degree</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree
               * @generated
               */
              public Adapter createDiscreteRangeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree <em>Enum Degree</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree
               * @generated
               */
              public Adapter createEnumDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree <em>Unordered Degree</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree
               * @generated
               */
              public Adapter createUnorderedDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree
     * <em>Ordered Data Type Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree
               * @generated
               */
              public Adapter createOrderedDataTypeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree
     * <em>Ordered Integer Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree
               * @generated
               */
              public Adapter createOrderedIntegerDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree <em>String Set Degree</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree
               * @generated
               */
              public Adapter createStringSetDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
     * <em>Unordered Primitive Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
               * @generated
               */
              public Adapter createUnorderedPrimitiveDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
     * <em>Continuous Component Param Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
               * @generated
               */
              public Adapter createContinuousComponentParamDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
     * <em>Continuous Processing Rate Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
               * @generated
               */
              public Adapter createContinuousProcessingRateDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
     * <em>Processing Rate Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
               * @generated
               */
              public Adapter createProcessingRateDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
     * <em>Processing Resource Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
               * @generated
               */
              public Adapter createProcessingResourceDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
     * <em>Discrete Component Param Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
               * @generated
               */
              public Adapter createDiscreteComponentParamDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
     * <em>Discrete Processing Rate Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
               * @generated
               */
              public Adapter createDiscreteProcessingRateDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
     * <em>Feature Config Degree</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
               * @generated
               */
              public Adapter createFeatureConfigDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
     * <em>Feature Group Degree</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
               * @generated
               */
              public Adapter createFeatureGroupDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset <em>Feature Subset</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset
               * @generated
               */
              public Adapter createFeatureSubsetAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
     * <em>Number Of Cores As List Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
               * @generated
               */
              public Adapter createNumberOfCoresAsListDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
     * <em>Number Of Cores Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
               * @generated
               */
              public Adapter createNumberOfCoresDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
     * <em>Number Of Cores As Range Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
               * @generated
               */
              public Adapter createNumberOfCoresAsRangeDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
     * <em>Optional Feature Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
               * @generated
               */
              public Adapter createOptionalFeatureDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
     * <em>Resource Container Replication Degree</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
               * @generated
               */
              public Adapter createResourceContainerReplicationDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
     * <em>Resource Container Replication Degree With Component Change</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
               * @generated
               */
              public Adapter createResourceContainerReplicationDegreeWithComponentChangeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
     * <em>Resource Selection Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
               * @generated
               */
              public Adapter createResourceSelectionDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
     * <em>Scheduling Policy Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
               * @generated
               */
              public Adapter createSchedulingPolicyDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
     * <em>String Component Param Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
               * @generated
               */
              public Adapter createStringComponentParamDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
     * <em>Allocation Degree</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
               * @generated
               */
              public Adapter createAllocationDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
     * <em>Assembled Component Degree</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
               * @generated
               */
              public Adapter createAssembledComponentDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree <em>Capacity Degree</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree
               * @generated
               */
              public Adapter createCapacityDegreeAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance
     * <em>Degree Of Freedom Instance</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance
               * @generated
               */
              public Adapter createDegreeOfFreedomInstanceAdapter() {
                  return null;
              }

              /**
               * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
     * <em>Monitoring Degree</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @see de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
               * @generated
               */
              public Adapter createMonitoringDegreeAdapter() {
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
               * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
               * @generated
               */
              public Adapter createEObjectAdapter() {
                  return null;
              }

} // specificAdapterFactory
