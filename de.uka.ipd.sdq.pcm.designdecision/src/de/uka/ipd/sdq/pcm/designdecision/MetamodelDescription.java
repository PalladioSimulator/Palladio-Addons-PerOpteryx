/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMPhenotype;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;
import genericdesigndecision.universalDoF.AMetamodelDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getMetamodelDescription()
 * @model
 * @generated
 */
public interface MetamodelDescription extends AMetamodelDescription {

	public static final String PCM_METAMODEL = "Palladio Component Model (PCM)";
	
	public static final String PCM_ALLOCATION_DOF = "PCM Allocation Degree";

	public static final String PCM_ALTERNATIVE_COMPONENT_DOF = "PCM Alternative Component Degree";

	public static final String PCM_CAPACITY_DOF = "PCM Capacity Degree";

	public static final String PCM_PROCESSING_RATE_DOF = "PCM Processing Rate Degree";

	PCMInstance transformEMFtoPCM(PCMResourceSetPartition pcmPartition);

	public List<EObject> getPCMRootElements(PCMInstance pcm);

	public List<Choice> transform(PCMInstance pcm, Candidate candidate);

	public boolean transformChoice(PCMInstance pcm, Choice choice);

	public ProcessingResourceSpecification getProcessingResourceSpec(final ProcessingResourceDegree prd);

	PCMPhenotype decode(PCMInstance pcmInstance, DesignDecisionGenotype genotype);
} // MetamodelDescription
