package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.List;
/**
 * An interface visualising the implementation
 * of the {@link BinaryGenotype} class
 * @author Hp
 *
 * @param <E>
 */
public interface BinaryGenotypeRepresentation<E> extends List<E> {

	// Insert all possible values of the Degrees of Freedom which you can think of.
	enum TypeOfDegree{
		 AllocationDegree, AssembledComponentDegree, CapacityDegree, ClassAsReferenceDegree, ClassDegree,
		 ClassWithCopyDegree, ContinuousComponentParamDegree, ContinuousProcessingRateDegree, ContinuousRangeDegree,
		 DataTypeDegree, DiscreteComponentParamDegree, DiscreteDegree, DiscreteProcessingRateDegree,
		 DiscreteRangeDegree, EnumDegree, FeatureConfigDegree, FeatureGroupDegree,
		 MonitoringDegree, NumberOfCoresAsListDegree, NumberOfCoresAsRangeDegree,
		 NumberOfCoresDegree, OptionalFeatureDegree, OrderedDataTypeDegree,
		 OrderedIntegerDegree, ProcessingRateDegree, ProcessingResourceDegree,
		 RangeDegree, ResourceContainerReplicationDegree, ResourceContainerReplicationDegreeWithComponentChange,
		 ResourceSelectionDegree, SchedulingPolicyDegree, StringComponentParamDegree,
		 StringSetDegree, UnorderedDegree, UnorderedPrimitiveDegree
	}
	
	// Abstract methods
	public void setDegreeType(TypeOfDegree D);
	public TypeOfDegree getDegreeType();
}
