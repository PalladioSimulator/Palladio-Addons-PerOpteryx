package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;

/**
 * Interface for filtering analyses to implement.
 * @author Oliver
 *
 */
public interface FilteringAnalysis {

	/**
	 * Initialises necessary components for analysis. This method should initialise everything 
	 * necessary for subsequent calls to {@link #runAnalysis}. Depending on needs, this method
	 * should either be called once during instantiation of the class (in the constructor), or
	 * once before each analysis run (at the beginning of {@link #runAnalysis}).
	 */
	public void init();
	
	/**
	 * Runs an analysis using the passed parameters to determine whether the sample being
	 * analysed should be filtered / discarded or not. Returns a boolean only if the analysis
	 * could be completed <i>successfully</i>. Throws a {@link JobFailedException} otherwise.
	 * The parameters should originate from the same PCMPhenotype instance.
	 * 
	 * @param pcmInstance the PCMInstance of the PCMPhenotype
	 * @param genotypeId the Genotype ID of the PCMPhenotype
	 * @param numericId the numeric ID of the PCMPhenotype
	 * @return <b>true</b> if this sample should be kept;<br>
	 * 		   <b>false</b> if this sample should be discarded
	 * @throws JobFailedException if analysis failed, or if analysis not initialised
	 */
	public boolean runAnalysis(PCMInstance pcmInstance, String genotypeId, long numericId) throws JobFailedException;
	
}