/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;

import de.uka.ipd.sdq.pcmsupport.PCMPhenotype;
import de.uka.ipd.sdq.pcmsupport.designdecision.impl.MetamodelDescriptionImpl;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;
import genericdesigndecision.universalDoF.AMetamodelDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage#getMetamodelDescription()
 * @model
 * @generated
 */
public interface MetamodelDescription extends AMetamodelDescription {

	/**
	 * The singleton instance of the PCM metamodel description.
	 */
	MetamodelDescription eINSTANCE = MetamodelDescriptionImpl.getMetamodelDescription();

	// Insert all possible values of the Degrees of Freedom which you can think of.
	public static final String PCM_ALLOCATION_DOF = "PCM Allocation Degree";
	public static final String PCM_ASSEMBLED_COMPONENT_DOF = "PCM Assembled Component Degree";
	public static final String PCM_CAPACITY_DOF = "PCM Capacity Degree";
	public static final String PCM_CONTINUOUS_PROCESSING_RATE_DOF = "PCM Continuous Processing Rate Degree";
	public static final String PCM_MONITORING_DOF = "PCM Monitoring Degree";
	public static final String PCM_NUM_OF_CORES_AS_LIST_DOF = "PCM NumberOfCoresAsList Degree";
	public static final String PCM_NUM_OF_CORES_AS_RANGE_DOF = "PCM NumberOfCoresAsRangeDegree";
	public static final String PCM_NUM_OF_CORES_DOF = "PCM NumberOfCoresDegree";
	public static final String PCM_SCHEDULING_POLICY_DOF = "PCM SchedulingPolicyDegree";
	public static final String PCM_RESOURCE_SELECTION_DOF = "PCM ResourceSelectionDegree";
	public static final String PCM_PROCESSINGRESOURCE_DOF = "PCM ProcessingResourceDegree";
	public static final String PCM_RESOURCECONTAINER_REPLICATION_WITH_COMPONENT_CHANGE_DOF = "PCM ResourceContainerReplicationDegreeWithComponentChange";
	public static final String PCM_RESOURCECONTAINER_REPLICATION_DOF = "PCM ResourceContainerReplicationDegree";

	PCMInstance transformEMFtoPCM(PCMResourceSetPartition pcmPartition);

	public List<EObject> getPCMRootElements(PCMInstance pcm);

	public List<Choice> transform(PCMInstance pcm, Candidate candidate);

	public boolean transformChoice(PCMInstance pcm, Choice choice);

	public ProcessingResourceSpecification getProcessingResourceSpec(final ProcessingResourceDegree prd);

	PCMPhenotype decode(PCMInstance pcmInstance, DesignDecisionGenotype genotype);
} // MetamodelDescription
