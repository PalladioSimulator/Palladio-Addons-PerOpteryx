/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.*;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
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
		case specificPackage.CLASS_AS_REFERENCE_DEGREE: {
			ClassAsReferenceDegree classAsReferenceDegree = (ClassAsReferenceDegree) theEObject;
			T result = caseClassAsReferenceDegree(classAsReferenceDegree);
			if (result == null)
				result = caseClassDegree(classAsReferenceDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classAsReferenceDegree);
			if (result == null)
				result = caseNamedElement(classAsReferenceDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CLASS_DEGREE: {
			ClassDegree classDegree = (ClassDegree) theEObject;
			T result = caseClassDegree(classDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classDegree);
			if (result == null)
				result = caseNamedElement(classDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CLASS_WITH_COPY_DEGREE: {
			ClassWithCopyDegree classWithCopyDegree = (ClassWithCopyDegree) theEObject;
			T result = caseClassWithCopyDegree(classWithCopyDegree);
			if (result == null)
				result = caseClassDegree(classWithCopyDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(classWithCopyDegree);
			if (result == null)
				result = caseNamedElement(classWithCopyDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_RANGE_DEGREE: {
			ContinuousRangeDegree continuousRangeDegree = (ContinuousRangeDegree) theEObject;
			T result = caseContinuousRangeDegree(continuousRangeDegree);
			if (result == null)
				result = caseRangeDegree(continuousRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousRangeDegree);
			if (result == null)
				result = caseNamedElement(continuousRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RANGE_DEGREE: {
			RangeDegree rangeDegree = (RangeDegree) theEObject;
			T result = caseRangeDegree(rangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(rangeDegree);
			if (result == null)
				result = caseDataTypeDegree(rangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(rangeDegree);
			if (result == null)
				result = caseNamedElement(rangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DATA_TYPE_DEGREE: {
			DataTypeDegree dataTypeDegree = (DataTypeDegree) theEObject;
			T result = caseDataTypeDegree(dataTypeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(dataTypeDegree);
			if (result == null)
				result = caseNamedElement(dataTypeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_DEGREE: {
			DiscreteDegree discreteDegree = (DiscreteDegree) theEObject;
			T result = caseDiscreteDegree(discreteDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteDegree);
			if (result == null)
				result = caseNamedElement(discreteDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_RANGE_DEGREE: {
			DiscreteRangeDegree discreteRangeDegree = (DiscreteRangeDegree) theEObject;
			T result = caseDiscreteRangeDegree(discreteRangeDegree);
			if (result == null)
				result = caseRangeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteRangeDegree);
			if (result == null)
				result = caseNamedElement(discreteRangeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ENUM_DEGREE: {
			EnumDegree enumDegree = (EnumDegree) theEObject;
			T result = caseEnumDegree(enumDegree);
			if (result == null)
				result = caseUnorderedDegree(enumDegree);
			if (result == null)
				result = caseDataTypeDegree(enumDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(enumDegree);
			if (result == null)
				result = caseNamedElement(enumDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.UNORDERED_DEGREE: {
			UnorderedDegree unorderedDegree = (UnorderedDegree) theEObject;
			T result = caseUnorderedDegree(unorderedDegree);
			if (result == null)
				result = caseDataTypeDegree(unorderedDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(unorderedDegree);
			if (result == null)
				result = caseNamedElement(unorderedDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ORDERED_DATA_TYPE_DEGREE: {
			OrderedDataTypeDegree orderedDataTypeDegree = (OrderedDataTypeDegree) theEObject;
			T result = caseOrderedDataTypeDegree(orderedDataTypeDegree);
			if (result == null)
				result = caseDataTypeDegree(orderedDataTypeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(orderedDataTypeDegree);
			if (result == null)
				result = caseNamedElement(orderedDataTypeDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ORDERED_INTEGER_DEGREE: {
			OrderedIntegerDegree orderedIntegerDegree = (OrderedIntegerDegree) theEObject;
			T result = caseOrderedIntegerDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDiscreteDegree(orderedIntegerDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDataTypeDegree(orderedIntegerDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(orderedIntegerDegree);
			if (result == null)
				result = caseNamedElement(orderedIntegerDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STRING_SET_DEGREE: {
			StringSetDegree stringSetDegree = (StringSetDegree) theEObject;
			T result = caseStringSetDegree(stringSetDegree);
			if (result == null)
				result = caseUnorderedDegree(stringSetDegree);
			if (result == null)
				result = caseDataTypeDegree(stringSetDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(stringSetDegree);
			if (result == null)
				result = caseNamedElement(stringSetDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.UNORDERED_PRIMITIVE_DEGREE: {
			UnorderedPrimitiveDegree unorderedPrimitiveDegree = (UnorderedPrimitiveDegree) theEObject;
			T result = caseUnorderedPrimitiveDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseUnorderedDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseDataTypeDegree(unorderedPrimitiveDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(unorderedPrimitiveDegree);
			if (result == null)
				result = caseNamedElement(unorderedPrimitiveDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE: {
			ContinuousComponentParamDegree continuousComponentParamDegree = (ContinuousComponentParamDegree) theEObject;
			T result = caseContinuousComponentParamDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseContinuousRangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseRangeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousComponentParamDegree);
			if (result == null)
				result = caseNamedElement(continuousComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE: {
			ContinuousProcessingRateDegree continuousProcessingRateDegree = (ContinuousProcessingRateDegree) theEObject;
			T result = caseContinuousProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseContinuousRangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseRangeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseDataTypeDegree(continuousProcessingRateDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(continuousProcessingRateDegree);
			if (result == null)
				result = caseNamedElement(continuousProcessingRateDegree);
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
				result = caseDegreeOfFreedomInstance(processingRateDegree);
			if (result == null)
				result = caseNamedElement(processingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.PROCESSING_RESOURCE_DEGREE: {
			ProcessingResourceDegree processingResourceDegree = (ProcessingResourceDegree) theEObject;
			T result = caseProcessingResourceDegree(processingResourceDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(processingResourceDegree);
			if (result == null)
				result = caseNamedElement(processingResourceDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE: {
			DiscreteComponentParamDegree discreteComponentParamDegree = (DiscreteComponentParamDegree) theEObject;
			T result = caseDiscreteComponentParamDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseRangeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteComponentParamDegree);
			if (result == null)
				result = caseNamedElement(discreteComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE: {
			DiscreteProcessingRateDegree discreteProcessingRateDegree = (DiscreteProcessingRateDegree) theEObject;
			T result = caseDiscreteProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingRateDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseRangeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDiscreteDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseProcessingResourceDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDataTypeDegree(discreteProcessingRateDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(discreteProcessingRateDegree);
			if (result == null)
				result = caseNamedElement(discreteProcessingRateDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.FEATURE_CONFIG_DEGREE: {
			FeatureConfigDegree featureConfigDegree = (FeatureConfigDegree) theEObject;
			T result = caseFeatureConfigDegree(featureConfigDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(featureConfigDegree);
			if (result == null)
				result = caseNamedElement(featureConfigDegree);
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
				result = caseDegreeOfFreedomInstance(featureGroupDegree);
			if (result == null)
				result = caseNamedElement(featureGroupDegree);
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
				result = caseNumberOfCoresDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseOrderedIntegerDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDiscreteDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDataTypeDegree(numberOfCoresAsListDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(numberOfCoresAsListDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresAsListDegree);
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
				result = caseDegreeOfFreedomInstance(numberOfCoresDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE: {
			NumberOfCoresAsRangeDegree numberOfCoresAsRangeDegree = (NumberOfCoresAsRangeDegree) theEObject;
			T result = caseNumberOfCoresAsRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseNumberOfCoresDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseRangeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDiscreteDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseProcessingResourceDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDataTypeDegree(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(numberOfCoresAsRangeDegree);
			if (result == null)
				result = caseNamedElement(numberOfCoresAsRangeDegree);
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
				result = caseDegreeOfFreedomInstance(optionalFeatureDegree);
			if (result == null)
				result = caseNamedElement(optionalFeatureDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE: {
			ResourceContainerReplicationDegree resourceContainerReplicationDegree = (ResourceContainerReplicationDegree) theEObject;
			T result = caseResourceContainerReplicationDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseRangeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDiscreteDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDataTypeDegree(resourceContainerReplicationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceContainerReplicationDegree);
			if (result == null)
				result = caseNamedElement(resourceContainerReplicationDegree);
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
				result = caseDiscreteRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDiscreteDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseOrderedDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = caseNamedElement(resourceContainerReplicationDegreeWithComponentChange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.RESOURCE_SELECTION_DEGREE: {
			ResourceSelectionDegree resourceSelectionDegree = (ResourceSelectionDegree) theEObject;
			T result = caseResourceSelectionDegree(resourceSelectionDegree);
			if (result == null)
				result = caseClassWithCopyDegree(resourceSelectionDegree);
			if (result == null)
				result = caseProcessingResourceDegree(resourceSelectionDegree);
			if (result == null)
				result = caseClassDegree(resourceSelectionDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(resourceSelectionDegree);
			if (result == null)
				result = caseNamedElement(resourceSelectionDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.SCHEDULING_POLICY_DEGREE: {
			SchedulingPolicyDegree schedulingPolicyDegree = (SchedulingPolicyDegree) theEObject;
			T result = caseSchedulingPolicyDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseProcessingResourceDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseClassDegree(schedulingPolicyDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(schedulingPolicyDegree);
			if (result == null)
				result = caseNamedElement(schedulingPolicyDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.STRING_COMPONENT_PARAM_DEGREE: {
			StringComponentParamDegree stringComponentParamDegree = (StringComponentParamDegree) theEObject;
			T result = caseStringComponentParamDegree(stringComponentParamDegree);
			if (result == null)
				result = caseStringSetDegree(stringComponentParamDegree);
			if (result == null)
				result = caseUnorderedDegree(stringComponentParamDegree);
			if (result == null)
				result = caseDataTypeDegree(stringComponentParamDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(stringComponentParamDegree);
			if (result == null)
				result = caseNamedElement(stringComponentParamDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ALLOCATION_DEGREE: {
			AllocationDegree allocationDegree = (AllocationDegree) theEObject;
			T result = caseAllocationDegree(allocationDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(allocationDegree);
			if (result == null)
				result = caseClassDegree(allocationDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(allocationDegree);
			if (result == null)
				result = caseNamedElement(allocationDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.ASSEMBLED_COMPONENT_DEGREE: {
			AssembledComponentDegree assembledComponentDegree = (AssembledComponentDegree) theEObject;
			T result = caseAssembledComponentDegree(assembledComponentDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(assembledComponentDegree);
			if (result == null)
				result = caseClassDegree(assembledComponentDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(assembledComponentDegree);
			if (result == null)
				result = caseNamedElement(assembledComponentDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CAPACITY_DEGREE: {
			CapacityDegree capacityDegree = (CapacityDegree) theEObject;
			T result = caseCapacityDegree(capacityDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(capacityDegree);
			if (result == null)
				result = caseRangeDegree(capacityDegree);
			if (result == null)
				result = caseDiscreteDegree(capacityDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(capacityDegree);
			if (result == null)
				result = caseDataTypeDegree(capacityDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(capacityDegree);
			if (result == null)
				result = caseNamedElement(capacityDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.MONITORING_DEGREE: {
			MonitoringDegree monitoringDegree = (MonitoringDegree) theEObject;
			T result = caseMonitoringDegree(monitoringDegree);
			if (result == null)
				result = caseContinuousRangeDegree(monitoringDegree);
			if (result == null)
				result = caseRangeDegree(monitoringDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseDataTypeDegree(monitoringDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(monitoringDegree);
			if (result == null)
				result = caseNamedElement(monitoringDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.AT_NUMBER_OF_REPLICA_DEGREE: {
			ATNumberOfReplicaDegree atNumberOfReplicaDegree = (ATNumberOfReplicaDegree) theEObject;
			T result = caseATNumberOfReplicaDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDiscreteRangeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseRangeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDiscreteDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseOrderedDataTypeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDataTypeDegree(atNumberOfReplicaDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(atNumberOfReplicaDegree);
			if (result == null)
				result = caseNamedElement(atNumberOfReplicaDegree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case specificPackage.CONCERN_DEGREE: {
			ConcernDegree concernDegree = (ConcernDegree) theEObject;
			T result = caseConcernDegree(concernDegree);
			if (result == null)
				result = caseClassAsReferenceDegree(concernDegree);
			if (result == null)
				result = caseClassDegree(concernDegree);
			if (result == null)
				result = caseDegreeOfFreedomInstance(concernDegree);
			if (result == null)
				result = caseNamedElement(concernDegree);
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
	 * Returns the result of interpreting the object as an instance of '<em>Class As Reference Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class As Reference Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAsReferenceDegree(ClassAsReferenceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDegree(ClassDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class With Copy Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class With Copy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassWithCopyDegree(ClassWithCopyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousRangeDegree(ContinuousRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeDegree(RangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDegree(DataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteDegree(DiscreteDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Range Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteRangeDegree(DiscreteRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Degree</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDegree(EnumDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedDegree(UnorderedDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Data Type Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedDataTypeDegree(OrderedDataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Integer Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Integer Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedIntegerDegree(OrderedIntegerDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSetDegree(StringSetDegree object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeOfFreedomInstance(DegreeOfFreedomInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>AT Number Of Replica Degree</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT Number Of Replica Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATNumberOfReplicaDegree(ATNumberOfReplicaDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernDegree(ConcernDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
