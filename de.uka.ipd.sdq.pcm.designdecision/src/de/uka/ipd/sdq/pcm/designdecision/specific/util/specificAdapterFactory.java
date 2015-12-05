/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.util;

import de.uka.ipd.sdq.pcm.designdecision.specific.*;
import genericdesigndecision.genericDoF.AClassAsReferenceDegree;
import genericdesigndecision.genericDoF.AClassDegree;
import genericdesigndecision.genericDoF.AClassWithCopyDegree;
import genericdesigndecision.genericDoF.AContinuousRangeDegree;
import genericdesigndecision.genericDoF.ADataTypeDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.genericDoF.ADiscreteDegree;
import genericdesigndecision.genericDoF.ADiscreteRangeDegree;
import genericdesigndecision.genericDoF.AOrderedDataTypeDegree;
import genericdesigndecision.genericDoF.AOrderedIntegerDegree;
import genericdesigndecision.genericDoF.ARangeDegree;
import genericdesigndecision.genericDoF.AStringSetDegree;
import genericdesigndecision.genericDoF.AUnorderedDegree;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
 * @generated
 */
public class specificAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static specificPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = specificPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected specificSwitch<Adapter> modelSwitch = new specificSwitch<Adapter>() {
		@Override
		public Adapter caseExchangeComponentRule(ExchangeComponentRule object) {
			return createExchangeComponentRuleAdapter();
		}

		@Override
		public Adapter caseUnorderedPrimitiveDegree(UnorderedPrimitiveDegree object) {
			return createUnorderedPrimitiveDegreeAdapter();
		}

		@Override
		public Adapter caseContinuousComponentParamDegree(ContinuousComponentParamDegree object) {
			return createContinuousComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseContinuousProcessingRateDegree(ContinuousProcessingRateDegree object) {
			return createContinuousProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseProcessingRateDegree(ProcessingRateDegree object) {
			return createProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseProcessingResourceDegree(ProcessingResourceDegree object) {
			return createProcessingResourceDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteComponentParamDegree(DiscreteComponentParamDegree object) {
			return createDiscreteComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseDiscreteProcessingRateDegree(DiscreteProcessingRateDegree object) {
			return createDiscreteProcessingRateDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureConfigDegree(FeatureConfigDegree object) {
			return createFeatureConfigDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureGroupDegree(FeatureGroupDegree object) {
			return createFeatureGroupDegreeAdapter();
		}

		@Override
		public Adapter caseFeatureSubset(FeatureSubset object) {
			return createFeatureSubsetAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresAsListDegree(NumberOfCoresAsListDegree object) {
			return createNumberOfCoresAsListDegreeAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresDegree(NumberOfCoresDegree object) {
			return createNumberOfCoresDegreeAdapter();
		}

		@Override
		public Adapter caseNumberOfCoresAsRangeDegree(NumberOfCoresAsRangeDegree object) {
			return createNumberOfCoresAsRangeDegreeAdapter();
		}

		@Override
		public Adapter caseOptionalFeatureDegree(OptionalFeatureDegree object) {
			return createOptionalFeatureDegreeAdapter();
		}

		@Override
		public Adapter caseResourceContainerReplicationDegree(ResourceContainerReplicationDegree object) {
			return createResourceContainerReplicationDegreeAdapter();
		}

		@Override
		public Adapter caseResourceContainerReplicationDegreeWithComponentChange(
				ResourceContainerReplicationDegreeWithComponentChange object) {
			return createResourceContainerReplicationDegreeWithComponentChangeAdapter();
		}

		@Override
		public Adapter caseResourceSelectionDegree(ResourceSelectionDegree object) {
			return createResourceSelectionDegreeAdapter();
		}

		@Override
		public Adapter caseSchedulingPolicyDegree(SchedulingPolicyDegree object) {
			return createSchedulingPolicyDegreeAdapter();
		}

		@Override
		public Adapter caseStringComponentParamDegree(StringComponentParamDegree object) {
			return createStringComponentParamDegreeAdapter();
		}

		@Override
		public Adapter caseAllocationDegree(AllocationDegree object) {
			return createAllocationDegreeAdapter();
		}

		@Override
		public Adapter caseAssembledComponentDegree(AssembledComponentDegree object) {
			return createAssembledComponentDegreeAdapter();
		}

		@Override
		public Adapter caseCapacityDegree(CapacityDegree object) {
			return createCapacityDegreeAdapter();
		}

		@Override
		public Adapter caseMonitoringDegree(MonitoringDegree object) {
			return createMonitoringDegreeAdapter();
		}

		@Override
		public Adapter caseADegreeOfFreedom(ADegreeOfFreedom object) {
			return createADegreeOfFreedomAdapter();
		}

		@Override
		public Adapter caseADataTypeDegree(ADataTypeDegree object) {
			return createADataTypeDegreeAdapter();
		}

		@Override
		public Adapter caseAUnorderedDegree(AUnorderedDegree object) {
			return createAUnorderedDegreeAdapter();
		}

		@Override
		public Adapter caseAOrderedDataTypeDegree(AOrderedDataTypeDegree object) {
			return createAOrderedDataTypeDegreeAdapter();
		}

		@Override
		public Adapter caseARangeDegree(ARangeDegree object) {
			return createARangeDegreeAdapter();
		}

		@Override
		public Adapter caseAContinuousRangeDegree(AContinuousRangeDegree object) {
			return createAContinuousRangeDegreeAdapter();
		}

		@Override
		public Adapter caseADiscreteDegree(ADiscreteDegree object) {
			return createADiscreteDegreeAdapter();
		}

		@Override
		public Adapter caseADiscreteRangeDegree(ADiscreteRangeDegree object) {
			return createADiscreteRangeDegreeAdapter();
		}

		@Override
		public Adapter caseAOrderedIntegerDegree(AOrderedIntegerDegree object) {
			return createAOrderedIntegerDegreeAdapter();
		}

		@Override
		public Adapter caseAClassDegree(AClassDegree object) {
			return createAClassDegreeAdapter();
		}

		@Override
		public Adapter caseAClassWithCopyDegree(AClassWithCopyDegree object) {
			return createAClassWithCopyDegreeAdapter();
		}

		@Override
		public Adapter caseAClassAsReferenceDegree(AClassAsReferenceDegree object) {
			return createAClassAsReferenceDegreeAdapter();
		}

		@Override
		public Adapter caseAStringSetDegree(AStringSetDegree object) {
			return createAStringSetDegreeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
	 * @generated
	 */
	public Adapter createExchangeComponentRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree <em>Unordered Primitive Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
	 * @generated
	 */
	public Adapter createUnorderedPrimitiveDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree <em>Continuous Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
	 * @generated
	 */
	public Adapter createContinuousComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree <em>Continuous Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
	 * @generated
	 */
	public Adapter createContinuousProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree <em>Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
	 * @generated
	 */
	public Adapter createProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree <em>Processing Resource Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
	 * @generated
	 */
	public Adapter createProcessingResourceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree <em>Discrete Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
	 * @generated
	 */
	public Adapter createDiscreteComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree <em>Discrete Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
	 * @generated
	 */
	public Adapter createDiscreteProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree <em>Feature Config Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
	 * @generated
	 */
	public Adapter createFeatureConfigDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree <em>Feature Group Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
	 * @generated
	 */
	public Adapter createFeatureGroupDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset <em>Feature Subset</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	* cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	* end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset
	 * @generated
	 */
	public Adapter createFeatureSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree <em>Number Of Cores As List Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresAsListDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree <em>Number Of Cores Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree <em>Number Of Cores As Range Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
	 * @generated
	 */
	public Adapter createNumberOfCoresAsRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree <em>Optional Feature Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
	 * @generated
	 */
	public Adapter createOptionalFeatureDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree <em>Resource Container Replication Degree</em>}'.
	 * <!-- begin-user-doc --> This default
	* implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	* when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
	 * @generated
	 */
	public Adapter createResourceContainerReplicationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange <em>Resource Container Replication Degree With Component Change</em>}'.
	 * <!-- begin-user-doc
	* --> This default implementation returns null so that we can easily ignore cases; it's useful
	* to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
	 * @generated
	 */
	public Adapter createResourceContainerReplicationDegreeWithComponentChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree <em>Resource Selection Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
	 * @generated
	 */
	public Adapter createResourceSelectionDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree <em>Scheduling Policy Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
	 * @generated
	 */
	public Adapter createSchedulingPolicyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree <em>String Component Param Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
	 * @generated
	 */
	public Adapter createStringComponentParamDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree <em>Allocation Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
	 * @generated
	 */
	public Adapter createAllocationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree <em>Assembled Component Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
	 * @generated
	 */
	public Adapter createAssembledComponentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree <em>Capacity Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	* cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	* end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree
	 * @generated
	 */
	public Adapter createCapacityDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree <em>Monitoring Degree</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	* null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	* catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
	 * @generated
	 */
	public Adapter createMonitoringDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom <em>ADegree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom
	 * @generated
	 */
	public Adapter createADegreeOfFreedomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADataTypeDegree <em>AData Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADataTypeDegree
	 * @generated
	 */
	public Adapter createADataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AUnorderedDegree <em>AUnordered Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AUnorderedDegree
	 * @generated
	 */
	public Adapter createAUnorderedDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AOrderedDataTypeDegree <em>AOrdered Data Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AOrderedDataTypeDegree
	 * @generated
	 */
	public Adapter createAOrderedDataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ARangeDegree <em>ARange Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ARangeDegree
	 * @generated
	 */
	public Adapter createARangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree <em>AContinuous Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree
	 * @generated
	 */
	public Adapter createAContinuousRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADiscreteDegree <em>ADiscrete Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADiscreteDegree
	 * @generated
	 */
	public Adapter createADiscreteDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree <em>ADiscrete Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADiscreteRangeDegree
	 * @generated
	 */
	public Adapter createADiscreteRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AOrderedIntegerDegree <em>AOrdered Integer Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AOrderedIntegerDegree
	 * @generated
	 */
	public Adapter createAOrderedIntegerDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassDegree <em>AClass Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassDegree
	 * @generated
	 */
	public Adapter createAClassDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassWithCopyDegree <em>AClass With Copy Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassWithCopyDegree
	 * @generated
	 */
	public Adapter createAClassWithCopyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassAsReferenceDegree <em>AClass As Reference Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassAsReferenceDegree
	 * @generated
	 */
	public Adapter createAClassAsReferenceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AStringSetDegree <em>AString Set Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AStringSetDegree
	 * @generated
	 */
	public Adapter createAStringSetDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	* implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // specificAdapterFactory
