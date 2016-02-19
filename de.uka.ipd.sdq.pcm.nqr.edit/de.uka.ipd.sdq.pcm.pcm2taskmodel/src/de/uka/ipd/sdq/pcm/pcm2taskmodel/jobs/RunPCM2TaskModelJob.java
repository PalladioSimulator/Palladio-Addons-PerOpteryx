package de.uka.ipd.sdq.pcm.pcm2taskmodel.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;
import org.palladiosimulator.solver.context.computed_allocation.ComputedAllocation;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsage;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.SolverStrategy;

import de.uka.ipd.sdq.pcm.pcm2taskmodel.runconfig.PCM2TaskModelWorkflowRunConfiguration;
import de.uka.ipd.sdq.pcm.pcm2taskmodel.transformation.Pcm2TaskmodelStrategy;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class RunPCM2TaskModelJob implements
		IBlackboardInteractingJob<MDSDBlackboard> {

	private MDSDBlackboard blackboard;
	private PCM2TaskModelWorkflowRunConfiguration config;

	public RunPCM2TaskModelJob(PCM2TaskModelWorkflowRunConfiguration config) {
		this.config = config;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
		
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		 
		PCMInstance pcmInstance = retrievePCMInstanceFromBlackboard();
		
		SolverStrategy strategy = new Pcm2TaskmodelStrategy(config, pcmInstance);
		
		strategy.transform(pcmInstance);
		
		strategy.storeTransformedModel(config.getTaskmodelResultFile());
		
	}

	private PCMInstance retrievePCMInstanceFromBlackboard() {
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) blackboard
			.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		PCMInstance pcmInstance = new PCMInstance(pcmPartition);
		
		ResourceSetPartition contextPartition = blackboard.getPartition(RunDSolverJob.PCM_CONTEXT_MODEL_PARTITION_ID);
				
		//Replace this with data from config
		String prefix = "C:\\temp\\taskmodel\\context";
		
		//TODO: Add failure handling
		ComputedAggregatedUsage aggregatedUsage = (ComputedAggregatedUsage)contextPartition.getContents(URI.createFileURI(prefix + ".aggregatedusage")).get(0);
		ComputedAllocation computedAllocation = (ComputedAllocation)contextPartition.getContents(URI.createFileURI(prefix + ".computedallocation")).get(0);
		ComputedUsage computedUsage = (ComputedUsage)contextPartition.getContents(URI.createFileURI(prefix + ".computedusage")).get(0);
		
		pcmInstance.setComputedContexts(computedAllocation, computedUsage, aggregatedUsage);
		return pcmInstance;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// TODO Auto-generated method stub
		
	}


}
