package de.uka.ipd.sdq.dsexplore.facade;

/**
 * An extension module for PerOpteryx.
 * 
 * @author Dominik Fuchss
 *
 */
public interface IModule {
	/**
	 * Reset the module.
	 */
	void reset();

	/**
	 * Get the Problem Extension for the module.
	 * 
	 * @return the ProblemExtension
	 */
	IProblemExtension getProblemExtension();

	/**
	 * Get the Create Extension for the module.
	 * 
	 * @return the CreateExtension
	 */
	ICreateExtension getCreateExtension();

	/**
	 * Get the Decode Extension for the module.
	 * 
	 * @return the DecodeExtension
	 */
	IDecodeExtension getDecodeExtension();

	/**
	 * Get the Analysis Extension for the module.
	 * 
	 * @return the AnalysisExtension
	 */
	IAnalysisExtension getAnalysisExtension();
}
