package de.uka.ipd.sdq.dsexplore.launch;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.GenotypeReader;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class OptimisationJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {
	
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.launch.OptimisationJob");

	private List<IAnalysis> evaluators;
	private Long startTimestampMillis;
	
	private MDSDBlackboard blackboard;
	
	private DSEWorkflowConfiguration dseConfig;
    	

	public OptimisationJob(DSEWorkflowConfiguration config, DSELaunch launch) {
		
		    this.dseConfig = config;
		    
		    this.evaluators = config.getEvaluators();
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		
		startTimestampMillis = System.currentTimeMillis();
		
		logger.debug("Starting...");

		try{
		logger.debug("\n Launching optimization with \n"+
				"maximal number of iterations: "+this.dseConfig.getMaxIterations()+"\n"+
				"individuals per generation:" +this.dseConfig.getIndividualsPerGeneration()+"\n"+
				"offspring per generation: individuals per generation / 2 rounded up.");
	    
	    Opt4JStarter.init(evaluators, this.dseConfig, getInputModel(), monitor, this.blackboard);
	    
	    if (this.dseConfig.hasCacheInstances()){
	    	fillCacheWithValues(this.dseConfig.getCacheInstancesFileName());
	    }
	    
		//TODO: extract this in a Builder?
	    if (this.dseConfig.isOptimise()){//use predefined instances as initial population
	    	List<DesignDecisionGenotype> genotypes = GenotypeReader.getGenotypes(this.dseConfig.getPredefinedInstancesFileName(), this.blackboard);

	    	//read in all candidates file if there and add to cache
	    	List<DesignDecisionGenotype> allCandidates = GenotypeReader.getGenotypes(this.dseConfig.getPredefinedAllCandidatesFileName(), this.blackboard);

	    	// read in archive candidates file if there and add to cache. 
	    	// Need to add them to Opt4J archive to ensure a proper continuation of an evolutionary search.
	    	// The addition is done by Opt4JStarter (see below)
	    	List<DesignDecisionGenotype> archiveCandidates = GenotypeReader.getGenotypes(this.dseConfig.getArchiveCandidateFileName(), this.blackboard);

	    	Opt4JStarter.runOpt4JWithPopulation(this.dseConfig, monitor, genotypes, allCandidates, archiveCandidates);

	    }
		} catch (CoreException e){
			throw new JobFailedException(e);
	  		
		} finally {
		
			logger.warn("DSE launch done. It took "+((System.currentTimeMillis()-startTimestampMillis)/1000)+" seconds.");
			
			try {
				/* There was quite some memory allocation at this point (probably),
				 * which seemed caused an OutOfMemory quicker than the VM could get 
				 * more memory (max perm size had not been reached yet). Thus, make sure
				 * here that all memory is freed. */ 
				Runtime.getRuntime().gc();
				Opt4JStarter.closeTask();
				Opt4JStarter.tearDown();
				Runtime.getRuntime().gc();
			} catch (Exception e){
				e.printStackTrace();
			}

		}

	}

	private List<DSEIndividual> fillCacheWithValues(String cacheInstancesFileName) throws CoreException {
		return GenotypeReader.getIndividuals(cacheInstancesFileName, this.blackboard);
	}



	@Override
	public String getName() {
		return this.getClass().getName();
	}


	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
		
	}
	
	private EPackage getInputModel(String filename){		
		return EMFHelper.loadModelFromXMIFile(filename);
	}
	

	@Override
	public void cleanup(IProgressMonitor arg0) throws CleanupFailedException {
		// TODO Auto-generated method stub
		
	}
	
}
