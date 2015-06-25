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
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage
 * @generated
 */
public class specificSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static specificPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public specificSwitch() {
        if (modelPackage == null)
        {
            modelPackage = specificPackage.eINSTANCE;
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
        case specificPackage.EXCHANGE_COMPONENT_RULE: {
            final ExchangeComponentRule exchangeComponentRule = (ExchangeComponentRule) theEObject;
            T result = this.caseExchangeComponentRule(exchangeComponentRule);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CLASS_AS_REFERENCE_DEGREE: {
            final ClassAsReferenceDegree classAsReferenceDegree = (ClassAsReferenceDegree) theEObject;
            T result = this.caseClassAsReferenceDegree(classAsReferenceDegree);
            if (result == null) {
                result = this.caseClassDegree(classAsReferenceDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(classAsReferenceDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(classAsReferenceDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CLASS_DEGREE: {
            final ClassDegree classDegree = (ClassDegree) theEObject;
            T result = this.caseClassDegree(classDegree);
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(classDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(classDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CLASS_WITH_COPY_DEGREE: {
            final ClassWithCopyDegree classWithCopyDegree = (ClassWithCopyDegree) theEObject;
            T result = this.caseClassWithCopyDegree(classWithCopyDegree);
            if (result == null) {
                result = this.caseClassDegree(classWithCopyDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(classWithCopyDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(classWithCopyDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CONTINUOUS_RANGE_DEGREE: {
            final ContinuousRangeDegree continuousRangeDegree = (ContinuousRangeDegree) theEObject;
            T result = this.caseContinuousRangeDegree(continuousRangeDegree);
            if (result == null) {
                result = this.caseRangeDegree(continuousRangeDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(continuousRangeDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(continuousRangeDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(continuousRangeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(continuousRangeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.RANGE_DEGREE: {
            final RangeDegree rangeDegree = (RangeDegree) theEObject;
            T result = this.caseRangeDegree(rangeDegree);
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(rangeDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(rangeDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(rangeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(rangeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.DATA_TYPE_DEGREE: {
            final DataTypeDegree dataTypeDegree = (DataTypeDegree) theEObject;
            T result = this.caseDataTypeDegree(dataTypeDegree);
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(dataTypeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(dataTypeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.DISCRETE_DEGREE: {
            final DiscreteDegree discreteDegree = (DiscreteDegree) theEObject;
            T result = this.caseDiscreteDegree(discreteDegree);
            if (result == null) {
                result = this.caseDataTypeDegree(discreteDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(discreteDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(discreteDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.DISCRETE_RANGE_DEGREE: {
            final DiscreteRangeDegree discreteRangeDegree = (DiscreteRangeDegree) theEObject;
            T result = this.caseDiscreteRangeDegree(discreteRangeDegree);
            if (result == null) {
                result = this.caseRangeDegree(discreteRangeDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(discreteRangeDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(discreteRangeDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(discreteRangeDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(discreteRangeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(discreteRangeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.ENUM_DEGREE: {
            final EnumDegree enumDegree = (EnumDegree) theEObject;
            T result = this.caseEnumDegree(enumDegree);
            if (result == null) {
                result = this.caseUnorderedDegree(enumDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(enumDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(enumDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(enumDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.UNORDERED_DEGREE: {
            final UnorderedDegree unorderedDegree = (UnorderedDegree) theEObject;
            T result = this.caseUnorderedDegree(unorderedDegree);
            if (result == null) {
                result = this.caseDataTypeDegree(unorderedDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(unorderedDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(unorderedDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.ORDERED_DATA_TYPE_DEGREE: {
            final OrderedDataTypeDegree orderedDataTypeDegree = (OrderedDataTypeDegree) theEObject;
            T result = this.caseOrderedDataTypeDegree(orderedDataTypeDegree);
            if (result == null) {
                result = this.caseDataTypeDegree(orderedDataTypeDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(orderedDataTypeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(orderedDataTypeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.ORDERED_INTEGER_DEGREE: {
            final OrderedIntegerDegree orderedIntegerDegree = (OrderedIntegerDegree) theEObject;
            T result = this.caseOrderedIntegerDegree(orderedIntegerDegree);
            if (result == null) {
                result = this.caseDiscreteDegree(orderedIntegerDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(orderedIntegerDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(orderedIntegerDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(orderedIntegerDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(orderedIntegerDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.STRING_SET_DEGREE: {
            final StringSetDegree stringSetDegree = (StringSetDegree) theEObject;
            T result = this.caseStringSetDegree(stringSetDegree);
            if (result == null) {
                result = this.caseUnorderedDegree(stringSetDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(stringSetDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(stringSetDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(stringSetDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.UNORDERED_PRIMITIVE_DEGREE: {
            final UnorderedPrimitiveDegree unorderedPrimitiveDegree = (UnorderedPrimitiveDegree) theEObject;
            T result = this.caseUnorderedPrimitiveDegree(unorderedPrimitiveDegree);
            if (result == null) {
                result = this.caseUnorderedDegree(unorderedPrimitiveDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(unorderedPrimitiveDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(unorderedPrimitiveDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(unorderedPrimitiveDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE: {
            final ContinuousComponentParamDegree continuousComponentParamDegree = (ContinuousComponentParamDegree) theEObject;
            T result = this.caseContinuousComponentParamDegree(continuousComponentParamDegree);
            if (result == null) {
                result = this.caseContinuousRangeDegree(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(continuousComponentParamDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE: {
            final ContinuousProcessingRateDegree continuousProcessingRateDegree = (ContinuousProcessingRateDegree) theEObject;
            T result = this.caseContinuousProcessingRateDegree(continuousProcessingRateDegree);
            if (result == null) {
                result = this.caseContinuousRangeDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseProcessingRateDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(continuousProcessingRateDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.PROCESSING_RATE_DEGREE: {
            final ProcessingRateDegree processingRateDegree = (ProcessingRateDegree) theEObject;
            T result = this.caseProcessingRateDegree(processingRateDegree);
            if (result == null) {
                result = this.caseProcessingResourceDegree(processingRateDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(processingRateDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(processingRateDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.PROCESSING_RESOURCE_DEGREE: {
            final ProcessingResourceDegree processingResourceDegree = (ProcessingResourceDegree) theEObject;
            T result = this.caseProcessingResourceDegree(processingResourceDegree);
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(processingResourceDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(processingResourceDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE: {
            final DiscreteComponentParamDegree discreteComponentParamDegree = (DiscreteComponentParamDegree) theEObject;
            T result = this.caseDiscreteComponentParamDegree(discreteComponentParamDegree);
            if (result == null) {
                result = this.caseDiscreteRangeDegree(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(discreteComponentParamDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE: {
            final DiscreteProcessingRateDegree discreteProcessingRateDegree = (DiscreteProcessingRateDegree) theEObject;
            T result = this.caseDiscreteProcessingRateDegree(discreteProcessingRateDegree);
            if (result == null) {
                result = this.caseDiscreteRangeDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseProcessingRateDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(discreteProcessingRateDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.FEATURE_CONFIG_DEGREE: {
            final FeatureConfigDegree featureConfigDegree = (FeatureConfigDegree) theEObject;
            T result = this.caseFeatureConfigDegree(featureConfigDegree);
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(featureConfigDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(featureConfigDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.FEATURE_GROUP_DEGREE: {
            final FeatureGroupDegree featureGroupDegree = (FeatureGroupDegree) theEObject;
            T result = this.caseFeatureGroupDegree(featureGroupDegree);
            if (result == null) {
                result = this.caseFeatureConfigDegree(featureGroupDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(featureGroupDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(featureGroupDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.FEATURE_SUBSET: {
            final FeatureSubset featureSubset = (FeatureSubset) theEObject;
            T result = this.caseFeatureSubset(featureSubset);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE: {
            final NumberOfCoresAsListDegree numberOfCoresAsListDegree = (NumberOfCoresAsListDegree) theEObject;
            T result = this.caseNumberOfCoresAsListDegree(numberOfCoresAsListDegree);
            if (result == null) {
                result = this.caseNumberOfCoresDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseOrderedIntegerDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(numberOfCoresAsListDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.NUMBER_OF_CORES_DEGREE: {
            final NumberOfCoresDegree numberOfCoresDegree = (NumberOfCoresDegree) theEObject;
            T result = this.caseNumberOfCoresDegree(numberOfCoresDegree);
            if (result == null) {
                result = this.caseProcessingResourceDegree(numberOfCoresDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(numberOfCoresDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(numberOfCoresDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE: {
            final NumberOfCoresAsRangeDegree numberOfCoresAsRangeDegree = (NumberOfCoresAsRangeDegree) theEObject;
            T result = this.caseNumberOfCoresAsRangeDegree(numberOfCoresAsRangeDegree);
            if (result == null) {
                result = this.caseDiscreteRangeDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseNumberOfCoresDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(numberOfCoresAsRangeDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.OPTIONAL_FEATURE_DEGREE: {
            final OptionalFeatureDegree optionalFeatureDegree = (OptionalFeatureDegree) theEObject;
            T result = this.caseOptionalFeatureDegree(optionalFeatureDegree);
            if (result == null) {
                result = this.caseFeatureConfigDegree(optionalFeatureDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(optionalFeatureDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(optionalFeatureDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE: {
            final ResourceContainerReplicationDegree resourceContainerReplicationDegree = (ResourceContainerReplicationDegree) theEObject;
            T result = this.caseResourceContainerReplicationDegree(resourceContainerReplicationDegree);
            if (result == null) {
                result = this.caseDiscreteRangeDegree(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceContainerReplicationDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE: {
            final ResourceContainerReplicationDegreeWithComponentChange resourceContainerReplicationDegreeWithComponentChange = (ResourceContainerReplicationDegreeWithComponentChange) theEObject;
            T result = this
                    .caseResourceContainerReplicationDegreeWithComponentChange(resourceContainerReplicationDegreeWithComponentChange);
            if (result == null) {
                result = this
                        .caseResourceContainerReplicationDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseDiscreteRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseRangeDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceContainerReplicationDegreeWithComponentChange);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.RESOURCE_SELECTION_DEGREE: {
            final ResourceSelectionDegree resourceSelectionDegree = (ResourceSelectionDegree) theEObject;
            T result = this.caseResourceSelectionDegree(resourceSelectionDegree);
            if (result == null) {
                result = this.caseClassWithCopyDegree(resourceSelectionDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(resourceSelectionDegree);
            }
            if (result == null) {
                result = this.caseClassDegree(resourceSelectionDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(resourceSelectionDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(resourceSelectionDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.SCHEDULING_POLICY_DEGREE: {
            final SchedulingPolicyDegree schedulingPolicyDegree = (SchedulingPolicyDegree) theEObject;
            T result = this.caseSchedulingPolicyDegree(schedulingPolicyDegree);
            if (result == null) {
                result = this.caseClassAsReferenceDegree(schedulingPolicyDegree);
            }
            if (result == null) {
                result = this.caseProcessingResourceDegree(schedulingPolicyDegree);
            }
            if (result == null) {
                result = this.caseClassDegree(schedulingPolicyDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(schedulingPolicyDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(schedulingPolicyDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.STRING_COMPONENT_PARAM_DEGREE: {
            final StringComponentParamDegree stringComponentParamDegree = (StringComponentParamDegree) theEObject;
            T result = this.caseStringComponentParamDegree(stringComponentParamDegree);
            if (result == null) {
                result = this.caseStringSetDegree(stringComponentParamDegree);
            }
            if (result == null) {
                result = this.caseUnorderedDegree(stringComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(stringComponentParamDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(stringComponentParamDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(stringComponentParamDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.ALLOCATION_DEGREE: {
            final AllocationDegree allocationDegree = (AllocationDegree) theEObject;
            T result = this.caseAllocationDegree(allocationDegree);
            if (result == null) {
                result = this.caseClassAsReferenceDegree(allocationDegree);
            }
            if (result == null) {
                result = this.caseClassDegree(allocationDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(allocationDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(allocationDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.ASSEMBLED_COMPONENT_DEGREE: {
            final AssembledComponentDegree assembledComponentDegree = (AssembledComponentDegree) theEObject;
            T result = this.caseAssembledComponentDegree(assembledComponentDegree);
            if (result == null) {
                result = this.caseClassAsReferenceDegree(assembledComponentDegree);
            }
            if (result == null) {
                result = this.caseClassDegree(assembledComponentDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(assembledComponentDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(assembledComponentDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.CAPACITY_DEGREE: {
            final CapacityDegree capacityDegree = (CapacityDegree) theEObject;
            T result = this.caseCapacityDegree(capacityDegree);
            if (result == null) {
                result = this.caseDiscreteRangeDegree(capacityDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(capacityDegree);
            }
            if (result == null) {
                result = this.caseDiscreteDegree(capacityDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(capacityDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(capacityDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(capacityDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(capacityDegree);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case specificPackage.MONITORING_DEGREE: {
            final MonitoringDegree monitoringDegree = (MonitoringDegree) theEObject;
            T result = this.caseMonitoringDegree(monitoringDegree);
            if (result == null) {
                result = this.caseContinuousRangeDegree(monitoringDegree);
            }
            if (result == null) {
                result = this.caseRangeDegree(monitoringDegree);
            }
            if (result == null) {
                result = this.caseOrderedDataTypeDegree(monitoringDegree);
            }
            if (result == null) {
                result = this.caseDataTypeDegree(monitoringDegree);
            }
            if (result == null) {
                result = this.caseDegreeOfFreedomInstance(monitoringDegree);
            }
            if (result == null) {
                result = this.caseNamedElement(monitoringDegree);
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
     * Returns the result of interpreting the object as an instance of '
     * <em>Exchange Component Rule</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Exchange Component Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExchangeComponentRule(final ExchangeComponentRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Class As Reference Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Class As Reference Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassAsReferenceDegree(final ClassAsReferenceDegree object) {
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
    public T caseClassDegree(final ClassDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Class With Copy Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Class With Copy Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassWithCopyDegree(final ClassWithCopyDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Continuous Range Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Continuous Range Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinuousRangeDegree(final ContinuousRangeDegree object) {
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
    public T caseRangeDegree(final RangeDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypeDegree(final DataTypeDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteDegree(final DiscreteDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Discrete Range Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Discrete Range Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteRangeDegree(final DiscreteRangeDegree object) {
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
    public T caseEnumDegree(final EnumDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unordered Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnorderedDegree(final UnorderedDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Ordered Data Type Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Ordered Data Type Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrderedDataTypeDegree(final OrderedDataTypeDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Ordered Integer Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Ordered Integer Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrderedIntegerDegree(final OrderedIntegerDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Set Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringSetDegree(final StringSetDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Unordered Primitive Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Unordered Primitive Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnorderedPrimitiveDegree(final UnorderedPrimitiveDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Continuous Component Param Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Continuous Component Param Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinuousComponentParamDegree(final ContinuousComponentParamDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Continuous Processing Rate Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Continuous Processing Rate Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinuousProcessingRateDegree(final ContinuousProcessingRateDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Processing Rate Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Processing Rate Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessingRateDegree(final ProcessingRateDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Processing Resource Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Processing Resource Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessingResourceDegree(final ProcessingResourceDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Discrete Component Param Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Discrete Component Param Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteComponentParamDegree(final DiscreteComponentParamDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Discrete Processing Rate Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Discrete Processing Rate Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteProcessingRateDegree(final DiscreteProcessingRateDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Feature Config Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Feature Config Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureConfigDegree(final FeatureConfigDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Feature Group Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Feature Group Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureGroupDegree(final FeatureGroupDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature Subset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureSubset(final FeatureSubset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Number Of Cores As List Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Number Of Cores As List Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberOfCoresAsListDegree(final NumberOfCoresAsListDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Number Of Cores Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Number Of Cores Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberOfCoresDegree(final NumberOfCoresDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Number Of Cores As Range Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Number Of Cores As Range Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberOfCoresAsRangeDegree(final NumberOfCoresAsRangeDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Optional Feature Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Optional Feature Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOptionalFeatureDegree(final OptionalFeatureDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Container Replication Degree</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Container Replication Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceContainerReplicationDegree(final ResourceContainerReplicationDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Container Replication Degree With Component Change</em>'. <!-- begin-user-doc
     * --> This implementation returns null; returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Container Replication Degree With Component Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceContainerReplicationDegreeWithComponentChange(
            final ResourceContainerReplicationDegreeWithComponentChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Resource Selection Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Resource Selection Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceSelectionDegree(final ResourceSelectionDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Scheduling Policy Degree</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Scheduling Policy Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulingPolicyDegree(final SchedulingPolicyDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>String Component Param Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>String Component Param Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringComponentParamDegree(final StringComponentParamDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allocation Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllocationDegree(final AllocationDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Assembled Component Degree</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Assembled Component Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssembledComponentDegree(final AssembledComponentDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capacity Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapacityDegree(final CapacityDegree object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Degree Of Freedom Instance</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Degree Of Freedom Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDegreeOfFreedomInstance(final DegreeOfFreedomInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitoring Degree</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitoringDegree(final MonitoringDegree object) {
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
    public T caseNamedElement(final NamedElement object) {
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

} // specificSwitch
