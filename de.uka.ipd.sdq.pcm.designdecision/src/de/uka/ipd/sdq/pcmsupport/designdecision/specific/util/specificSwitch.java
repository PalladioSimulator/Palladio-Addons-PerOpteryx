/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific.util;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage
 * @generated
 */
public class specificSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static specificPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificSwitch() {
		if (modelPackage == null) {
			modelPackage = specificPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case specificPackage.EXCHANGE_COMPONENT_RULE: {
			ExchangeComponentRule exchangeComponentRule = (ExchangeComponentRule) theEObject;
			T result = caseExchangeComponentRule(exchangeComponentRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.UNORDERED_PRIMITIVE_DEGREE: {
			UnorderedPrimitiveDegree unorderedPrimitiveDegree = (UnorderedPrimitiveDegree) theEObject;
			T result = caseUnorderedPrimitiveDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseAUnorderedDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseADataTypeDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseADegreeOfFreedom(unorderedPrimitiveDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE: {
			ContinuousComponentParamDegree continuousComponentParamDegree = (ContinuousComponentParamDegree) theEObject;
			T result = caseContinuousComponentParamDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseAContinuousRangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseARangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseADataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseADegreeOfFreedom(continuousComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE: {
			ContinuousProcessingRateDegree continuousProcessingRateDegree = (ContinuousProcessingRateDegree) theEObject;
			T result = caseContinuousProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseAContinuousRangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseARangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseADataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseADegreeOfFreedom(continuousProcessingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.PROCESSING_RATE_DEGREE: {
			ProcessingRateDegree processingRateDegree = (ProcessingRateDegree) theEObject;
			T result = caseProcessingRateDegree(processingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(processingRateDegree);
			if (result == null)
				result = caseADegreeOfFreedom(processingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.PROCESSING_RESOURCE_DEGREE: {
			ProcessingResourceDegree processingResourceDegree = (ProcessingResourceDegree) theEObject;
			T result = caseProcessingResourceDegree(processingResourceDegree);
			if (result == null)
				result = caseADegreeOfFreedom(processingResourceDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE: {
			DiscreteComponentParamDegree discreteComponentParamDegree = (DiscreteComponentParamDegree) theEObject;
			T result = caseDiscreteComponentParamDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseADiscreteRangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseARangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseADiscreteDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseADataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseADegreeOfFreedom(discreteComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE: {
			DiscreteProcessingRateDegree discreteProcessingRateDegree = (DiscreteProcessingRateDegree) theEObject;
			T result = caseDiscreteProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseADiscreteRangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseARangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseADiscreteDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseADataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseADegreeOfFreedom(discreteProcessingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_CONFIG_DEGREE: {
			FeatureConfigDegree featureConfigDegree = (FeatureConfigDegree) theEObject;
			T result = caseFeatureConfigDegree(featureConfigDegree);
			if (result == null)
				result = caseADegreeOfFreedom(featureConfigDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_GROUP_DEGREE: {
			FeatureGroupDegree featureGroupDegree = (FeatureGroupDegree) theEObject;
			T result = caseFeatureGroupDegree(featureGroupDegree);
			if (result == null)
				result = caseFeatureConfigDegree(featureGroupDegree);
			if (result == null)
				result = caseADegreeOfFreedom(featureGroupDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_SUBSET: {
			FeatureSubset featureSubset = (FeatureSubset) theEObject;
			T result = caseFeatureSubset(featureSubset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE: {
			NumberOfCoresAsListDegree numberOfCoresAsListDegree = (NumberOfCoresAsListDegree) theEObject;
			T result = caseNumberOfCoresAsListDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseAOrderedIntegerDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseNumberOfCoresDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseADiscreteDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseADataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseADegreeOfFreedom(numberOfCoresAsListDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_DEGREE: {
			NumberOfCoresDegree numberOfCoresDegree = (NumberOfCoresDegree) theEObject;
			T result = caseNumberOfCoresDegree(numberOfCoresDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresDegree);
			if (result == null)
				result = caseADegreeOfFreedom(numberOfCoresDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE: {
			NumberOfCoresAsRangeDegree numberOfCoresAsRangeDegree = (NumberOfCoresAsRangeDegree) theEObject;
			T result = caseNumberOfCoresAsRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseADiscreteRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseNumberOfCoresDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseARangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseADiscreteDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseADataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseADegreeOfFreedom(numberOfCoresAsRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.OPTIONAL_FEATURE_DEGREE: {
			OptionalFeatureDegree optionalFeatureDegree = (OptionalFeatureDegree) theEObject;
			T result = caseOptionalFeatureDegree(optionalFeatureDegree);
			if (result == null)
				result = caseFeatureConfigDegree(optionalFeatureDegree);
			if (result == null)
				result = caseADegreeOfFreedom(optionalFeatureDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE: {
			ResourceContainerReplicationDegree resourceContainerReplicationDegree = (ResourceContainerReplicationDegree) theEObject;
			T result = caseResourceContainerReplicationDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseADiscreteRangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseARangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseADiscreteDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseADataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseADegreeOfFreedom(resourceContainerReplicationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE: {
			ResourceContainerReplicationDegreeWithComponentChange resourceContainerReplicationDegreeWithComponentChange = (ResourceContainerReplicationDegreeWithComponentChange) theEObject;
			T result = caseResourceContainerReplicationDegreeWithComponentChange(
					resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseResourceContainerReplicationDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseADiscreteRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseARangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseADiscreteDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseAOrderedDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseADataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseADegreeOfFreedom(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_SELECTION_DEGREE: {
			ResourceSelectionDegree resourceSelectionDegree = (ResourceSelectionDegree) theEObject;
			T result = caseResourceSelectionDegree(resourceSelectionDegree);
			if (result == null)
				result = caseAClassWithCopyDegree(resourceSelectionDegree);
			if (result == null)
				result = caseProcessingResourceDegree(resourceSelectionDegree);
			if (result == null)
				result = caseAClassDegree(resourceSelectionDegree);
			if (result == null)
				result = caseADegreeOfFreedom(resourceSelectionDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.SCHEDULING_POLICY_DEGREE: {
			SchedulingPolicyDegree schedulingPolicyDegree = (SchedulingPolicyDegree) theEObject;
			T result = caseSchedulingPolicyDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseAClassAsReferenceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseProcessingResourceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseAClassDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseADegreeOfFreedom(schedulingPolicyDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STRING_COMPONENT_PARAM_DEGREE: {
			StringComponentParamDegree stringComponentParamDegree = (StringComponentParamDegree) theEObject;
			T result = caseStringComponentParamDegree(stringComponentParamDegree);
			if (result == null)
				result = caseAStringSetDegree(stringComponentParamDegree);
			if (result == null)
				result = caseAUnorderedDegree(stringComponentParamDegree);
			if (result == null)
				result = caseADataTypeDegree(stringComponentParamDegree);
			if (result == null)
				result = caseADegreeOfFreedom(stringComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ALLOCATION_DEGREE: {
			AllocationDegree allocationDegree = (AllocationDegree) theEObject;
			T result = caseAllocationDegree(allocationDegree);
			if (result == null)
				result = caseAClassAsReferenceDegree(allocationDegree);
			if (result == null)
				result = caseAClassDegree(allocationDegree);
			if (result == null)
				result = caseADegreeOfFreedom(allocationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ASSEMBLED_COMPONENT_DEGREE: {
			AssembledComponentDegree assembledComponentDegree = (AssembledComponentDegree) theEObject;
			T result = caseAssembledComponentDegree(assembledComponentDegree);
			if (result == null)
				result = caseAClassAsReferenceDegree(assembledComponentDegree);
			if (result == null)
				result = caseAClassDegree(assembledComponentDegree);
			if (result == null)
				result = caseADegreeOfFreedom(assembledComponentDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CAPACITY_DEGREE: {
			CapacityDegree capacityDegree = (CapacityDegree) theEObject;
			T result = caseCapacityDegree(capacityDegree);
			if (result == null)
				result = caseADiscreteRangeDegree(capacityDegree);
			if (result == null)
				result = caseARangeDegree(capacityDegree);
			if (result == null)
				result = caseADiscreteDegree(capacityDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(capacityDegree);
			if (result == null)
				result = caseADataTypeDegree(capacityDegree);
			if (result == null)
				result = caseADegreeOfFreedom(capacityDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.MONITORING_DEGREE: {
			MonitoringDegree monitoringDegree = (MonitoringDegree) theEObject;
			T result = caseMonitoringDegree(monitoringDegree);
			if (result == null)
				result = caseAContinuousRangeDegree(monitoringDegree);
			if (result == null)
				result = caseARangeDegree(monitoringDegree);
			if (result == null)
				result = caseAOrderedDataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseADataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseADegreeOfFreedom(monitoringDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Component Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Component Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeComponentRule(ExchangeComponentRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered Primitive Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered Primitive Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedPrimitiveDegree(UnorderedPrimitiveDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousComponentParamDegree(ContinuousComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousProcessingRateDegree(ContinuousProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingRateDegree(ProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceDegree(ProcessingResourceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteComponentParamDegree(DiscreteComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Processing Rate Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Processing Rate Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteProcessingRateDegree(DiscreteProcessingRateDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Config Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Config Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConfigDegree(FeatureConfigDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureGroupDegree(FeatureGroupDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSubset(FeatureSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores As List Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores As List Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresAsListDegree(NumberOfCoresAsListDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresDegree(NumberOfCoresDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Cores As Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Cores As Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfCoresAsRangeDegree(NumberOfCoresAsRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Feature Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Feature Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalFeatureDegree(OptionalFeatureDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container Replication Degree</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container Replication Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainerReplicationDegree(ResourceContainerReplicationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container Replication Degree With Component Change</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container Replication Degree With Component Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainerReplicationDegreeWithComponentChange(
			ResourceContainerReplicationDegreeWithComponentChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Selection Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Selection Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSelectionDegree(ResourceSelectionDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Policy Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Policy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingPolicyDegree(SchedulingPolicyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Component Param Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Component Param Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringComponentParamDegree(StringComponentParamDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationDegree(AllocationDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembled Component Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembled Component Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembledComponentDegree(AssembledComponentDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityDegree(CapacityDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringDegree(MonitoringDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADegree Of Freedom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADegree Of Freedom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADegreeOfFreedom(ADegreeOfFreedom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AData Type Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AData Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADataTypeDegree(ADataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AUnordered Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AUnordered Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAUnorderedDegree(AUnorderedDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOrdered Data Type Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOrdered Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOrderedDataTypeDegree(AOrderedDataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARange Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARange Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARangeDegree(ARangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AContinuous Range Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AContinuous Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAContinuousRangeDegree(AContinuousRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADiscrete Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADiscrete Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADiscreteDegree(ADiscreteDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADiscrete Range Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADiscrete Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADiscreteRangeDegree(ADiscreteRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOrdered Integer Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOrdered Integer Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOrderedIntegerDegree(AOrderedIntegerDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassDegree(AClassDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass With Copy Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass With Copy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassWithCopyDegree(AClassWithCopyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass As Reference Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass As Reference Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassAsReferenceDegree(AClassAsReferenceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AString Set Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AString Set Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAStringSetDegree(AStringSetDegree object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} // specificSwitch
