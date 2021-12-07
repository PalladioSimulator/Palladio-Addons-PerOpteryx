package de.uka.ipd.sdq.dsexplore.launch;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.opt4j.core.DoubleValue;
import org.opt4j.core.Value;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisProxy;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisQualityAttributes;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration.SearchMethod;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.FilteringAnalysis;
import de.uka.ipd.sdq.tcfmoop.config.ElapsedTimeConfig;
import de.uka.ipd.sdq.tcfmoop.config.ElapsedTimeConfig.TimeType;
import de.uka.ipd.sdq.tcfmoop.config.GivenParetoFrontIsReachedConfig;
import de.uka.ipd.sdq.tcfmoop.config.InsignificantParetoFrontChangeConfig;
import de.uka.ipd.sdq.tcfmoop.config.InsignificantSetQualityImprovementConfig;
import de.uka.ipd.sdq.tcfmoop.config.InsignificantSetQualityImprovementConfig.UnresolvedValueDifference;
import de.uka.ipd.sdq.tcfmoop.config.MaxGenerationNumberConfig;
import de.uka.ipd.sdq.tcfmoop.config.MinimalQualityCriteriaValueConfig;
import de.uka.ipd.sdq.tcfmoop.config.NoNewParetoOptimalCandidatesFoundConfig;
import de.uka.ipd.sdq.tcfmoop.config.ParetoOptimalSetStabilityConfig;
import de.uka.ipd.sdq.tcfmoop.config.ParetoOptimalSetStabilityConfig.EvaluationMode;
import de.uka.ipd.sdq.tcfmoop.config.exceptions.InvalidConfigException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;

public class DSEWorkflowConfigurationBuilder extends
		AbstractWorkflowConfigurationBuilder {

	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfigurationBuilder");

	
	/**XXX Quickfix to reset the loggers in the analysis Proxies */
	DSELaunch dseLaunch;

	public DSEWorkflowConfigurationBuilder(ILaunchConfiguration configuration,
			String mode, DSELaunch dseLaunch) throws CoreException {
		super(configuration, mode);
		this.dseLaunch = dseLaunch;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fillConfiguration(
			AbstractWorkflowBasedRunConfiguration abstractConfiguration)
			throws CoreException {
		
		DSEWorkflowConfiguration config = (DSEWorkflowConfiguration)abstractConfiguration;
		
		config.setOriginalConfig(this.configuration);
		
		config.setMaxIterations(getIntAttribute(DSEConstantsContainer.MAX_ITERATIONS));
		config.setIndividualsPerGeneration(getIntAttribute(DSEConstantsContainer.INDIVIDUALS_PER_GENERATION));
		config.setCrossoverRate(getDoubleAttribute(DSEConstantsContainer.CROSSOVER_RATE));
		
		
		config.setPredefinedInstancesFileName(getURIAttribute(DSEConstantsContainer.PREDEFINED_INSTANCES));
		config.setCacheInstancesFileName(getURIAttribute(DSEConstantsContainer.CACHE_INSTANCES));
		config.setPredefinedAllCandidatesFileName(getURIAttribute(DSEConstantsContainer.ALL_CANDIDATES));
		config.setArchiveCandidateFileName(getURIAttribute(DSEConstantsContainer.ARCHIVE_CANDIDATES));
		
		
		String searchMethod = getStringAttribute(DSEConstantsContainer.SEARCH_METHOD);
		if (searchMethod.equals(DSEConstantsContainer.SEARCH_EVOLUTIONARY)){
			config.setSearchMethod(SearchMethod.EVOLUTIONARY);
 		} else if (searchMethod.equals(DSEConstantsContainer.SEARCH_RANDOM)) {
 			config.setSearchMethod(SearchMethod.RANDOM);
 		} else if (searchMethod.equals(DSEConstantsContainer.SEARCH_RULE)) {
 			config.setSearchMethod(SearchMethod.RULE);
 		} else if (searchMethod.equals(DSEConstantsContainer.SEARCH_RULE_OPT)){
 			config.setSearchMethod(SearchMethod.RULE_OPT);
 		} else if (searchMethod.equals(DSEConstantsContainer.SEARCH_EVOLUTIONARY_WITH_BAYES)){
 			config.setSearchMethod(SearchMethod.EVOLUTIONARY_WITH_BAYES);
 		}

		
		config.setNewProblem(!this.configuration.getAttribute(DSEConstantsContainer.OPTIMISATION_ONLY, false));
		config.setOptimise(!this.configuration.getAttribute(DSEConstantsContainer.DESIGN_DECISIONS_ONLY, false));
		
		
		/*
		 * Heuristics settings
		 */
		boolean isConsiderQMLBounds = getBooleanAttribute(DSEConstantsContainer.CONSIDER_QML_BOUNDS);
		config.setConsiderQMLBoundsWhenApplyingHeuristics(isConsiderQMLBounds);
		
		double tacticsProbability = getDoubleAttribute(DSEConstantsContainer.TACTICS_PROBABILITY);
		config.setTacticsProbability(tacticsProbability);
		
		boolean isUseReallocation = getBooleanAttribute(DSEConstantsContainer.USE_REALLOCATION);
		config.setUseReallocation(isUseReallocation);
		if (isUseReallocation){
			config.setReallocationThresholdUtilisationDifference(getDoubleAttribute(DSEConstantsContainer.REALLOCATION_UTILISATION_DIFFERENCE));
			config.setReallocationWeight(getDoubleAttribute(DSEConstantsContainer.REALLOCATION_WEIGHT));
		}
		
		boolean isUseProcRate = getBooleanAttribute(DSEConstantsContainer.USE_PROCESSING_RATE);
		config.setUseProcessingRate(isUseProcRate);
		if (isUseProcRate){
			config.setProcessingRateDecreaseFactor(getDoubleAttribute(DSEConstantsContainer.PROCESSING_RATE_DECREASE_FACTOR));
			config.setProcessingRateIncreaseFactor(getDoubleAttribute(DSEConstantsContainer.PROCESSING_RATE_INCREASE_FACTOR));
			config.setProcessingRateThresholdHighUtilisation(getDoubleAttribute(DSEConstantsContainer.PROCESSING_RATE_THRESHOLD_HIGH_UTILISATION));
			config.setProcessingRateThresholdLowUtilisation(getDoubleAttribute(DSEConstantsContainer.PROCESSING_RATE_THRESHOLD_LOW_UTILISATION));
			config.setProcessingRateWeight(getDoubleAttribute(DSEConstantsContainer.PROCESSING_RATE_WEIGHT));
		}
		
		boolean isUseServerConsolidation = getBooleanAttribute(DSEConstantsContainer.USE_SERVER_CONSOLIDATION);
		config.setUseServerConsolidation(isUseServerConsolidation);
		if (isUseServerConsolidation){
			config.setServerConsolidationThresholdLowUtilisation(getDoubleAttribute(DSEConstantsContainer.SERVER_CONSOLIDATION_THRESHOLD_LOW_UTILISATION));
			config.setServerConsolidationWeight(getDoubleAttribute(DSEConstantsContainer.SERVER_CONSOLIDATION_WEIGHT));
		}
		
		boolean isUseServerExpansion = getBooleanAttribute(DSEConstantsContainer.USE_SERVER_EXPANSION);
		config.setUseServerExpansion(isUseServerExpansion);
		if (isUseServerExpansion){
			config.setServerExpansionMaxNumberOfReplacements(getIntAttribute(DSEConstantsContainer.SERVER_EXPANSION_MAX_NUMBER_OF_REPLACEMENTS));
			config.setServerExpansionThresholdHighUtilisation(getDoubleAttribute(DSEConstantsContainer.SERVER_EXPANSION_THRESHOLD_HIGH_UTILISATION));
			config.setServerExpansionWeight(getDoubleAttribute(DSEConstantsContainer.SERVER_EXPANSION_WEIGHT));
		}
		
		boolean isUseLinkRealloc = getBooleanAttribute(DSEConstantsContainer.USE_LINK_REALLOCATION);
		config.setUseLinkReallocationTactic(isUseLinkRealloc);
		
		boolean isUseAntipattern = getBooleanAttribute(DSEConstantsContainer.USE_ANTIPATTERNS);
		config.setUseAntipatternKnowledge(isUseAntipattern);
		
		/*
		 * Starting Population
		 */
		boolean isUseStartingPop = getBooleanAttribute(DSEConstantsContainer.USE_STARTING_POPULATION_HEURISTIC);
		config.setUseStartingPopulationHeuristic(isUseStartingPop);
		if (isUseStartingPop){
			config.setMinNumberOfResourceContainers(getIntAttribute(DSEConstantsContainer.MIN_NUMBER_RESOURCE_CONTAINERS));
			config.setMaxNumberOfResourceContainers(getIntAttribute(DSEConstantsContainer.MAX_NUMBER_RESOURCE_CONTAINERS));
			config.setNumberOfCandidatesPerAllocationLevel(getIntAttribute(DSEConstantsContainer.NUMBER_OF_CANDIDATES_PER_ALLOCATION_LEVEL));
		}
		
		
		
		String ddfilenameString = this.configuration.getAttribute(DSEConstantsContainer.DESIGN_DECISION_FILE, "");
		URI ddfilename;
		if (ddfilenameString.length() != 0){
			ddfilename = URI.createURI(ddfilenameString);
		} else {
			ddfilename = getDefaultDesignDecisionFileName();
		}
		config.setDesignDecisionFileName(ddfilename);
		
		URI resultsPath = createOrReuseResultFolder();
		
		config.setResultFolder(resultsPath);
		
		config.setConfigurationName(this.configuration.getName());
		
		//Initialise Evaluators last
		ArrayList<IAnalysis> evaluators = new ArrayList<IAnalysis>();
		for(QualityAttribute d : new AnalysisQualityAttributes().getAllQualityAttributes()) {
			addEvaluatorsIfSelected(evaluators, d, config);
		}
		//addEvaluatorsIfSelected(evaluators, DSEConstantsContainer.SECURITY, config);
		config.setEvaluators(evaluators);
		
		addTerminationCriteriaSettings(config);
		
		config.setStopOnInitialFailure(getBooleanAttribute(DSEConstantsContainer.STOP_ON_INITIAL_FAILURE));
		config.setResultsAsEMF(getBooleanAttribute(DSEConstantsContainer.STORE_RESULTS_AS_EMF));
		config.setResultsAsCSV(getBooleanAttribute(DSEConstantsContainer.STORE_RESULTS_AS_CSV));
		
		
		
		//Get filtering extensions from name
		var filteringList = this.configuration.getAttribute(FilteringTab.optionsName, new ArrayList<String>());		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint(DSEConstantsContainer.FILTERING_EXTENSION_POINT);
		IExtension[] extensions = ep.getExtensions();

		for (var ext : extensions) {
			for (var ce : ext.getConfigurationElements()) {

				var name = ce.getAttribute(DSEConstantsContainer.FILTERING_EXTENSION_POINT_NAME);
				if(filteringList.contains(name)) {
					var execution = (FilteringAnalysis) ce.createExecutableExtension(DSEConstantsContainer.FILTERING_EXTENSION_POINT_INTERFACE);
					config.setFilteringAnalysis(execution);
				}

			}
		}
		
		
		

	}

	private URI createOrReuseResultFolder() throws CoreException {
		//Write results "next to" allocation model file. 
		URI folderPathOnly = getPathToAllocation();
		
		URI resultsPath = folderPathOnly.appendSegment("PerOpteryx_results");
		
		if (resultsPath.isPlatform()) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IFolder resultFolder = workspace.getRoot().getFolder(new Path(resultsPath.toPlatformString(true)));

			if (!resultFolder.exists()) {
				resultFolder.create(true, true, null);
			}
		} else {
			File f = new File(resultsPath.toFileString());
			if (f.exists()){
				if (!f.isDirectory()){
					throw new CoreException(new Status(Status.ERROR,"de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfigurationBuilder","File "+resultsPath+" already exists and is not a directory, please rename that file."));
				}
			} else {
				f.mkdir();
			}
		}
		return resultsPath;
	}

	private URI getURIAttribute(final String constant) throws CoreException {
		String asString = getStringAttribute(constant);
		if (asString == null || "".equals(asString) ){
			return null;
		} else {
			try{ 
				URI uri = URI.createURI(asString);
				if (uri == null || !uri.isPlatform()){
					URI fileURI = URI.createFileURI(asString);
					if (fileURI != null && fileURI.isFile()){
						uri = fileURI;
					}
				}
				return uri;
			} catch (IllegalArgumentException e) {
				logger.error("Launch configuration value '"+asString+"' is not a valid URI. Using null instead: "+e.getClass()+" "+e.getMessage());
				return null;
			}
		}
	}

	private void addEvaluatorsIfSelected(ArrayList<IAnalysis> evaluators,
			QualityAttribute d, DSEWorkflowConfiguration config) throws CoreException {
	    
		String methodName = configuration.getAttribute(DSEConstantsContainer.getAnalysisMethod(d), "");
		if (!methodName.equals(DSEConstantsContainer.NONE)){
	    	AnalysisProxy analysis = new AnalysisProxy(config, d, this.dseLaunch, methodName);
	    	evaluators.add(analysis);
	    }
		
	}


	private URI getPathToAllocation() throws CoreException {
		String allocFileName = this.configuration.getAttribute(ConstantsContainer.ALLOCATION_FILE, "");
		URI folderPathOnly = getPathTo(allocFileName);
		if (folderPathOnly == null){
			throw new CoreException(new Status(Status.ERROR,"de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfigurationBuilder","Cannot determine path to allocation model to decide where to put the result files. Please check you allocation model."));
		}
		return folderPathOnly;
	}
	
	   /**
	 * Reads an attribute from the configurations and tries to parse it as an integer. 
	 * @param configuration The {@link ILaunchConfiguration}
	 * @param key The key under which the attribute is stored
	 * @param defaultValue A default value if the attribute is not found
	 * @return An integer value for the attribute, 0 if parsing was unsuccessful
	 * @throws CoreException thrown by {@link ILaunchConfiguration#getAttribute(String, String)}
	 */
	private int getIntAttribute(String key)
			throws CoreException {
		String stringValue = configuration.getAttribute(key, "0");
		if (stringValue.equals("")){
			return 0;
		} else {
			int i = Integer.parseInt(stringValue);
			return i;
		}
	}
	

	private URI getDefaultDesignDecisionFileName() throws CoreException {
		String problemName = this.configuration.getName();
		return getPathToAllocation().appendSegment(problemName+".designdecision");
	}
	
	/**returns the path including the last slash */
	private URI getPathTo(String fileURL){
		
		URI myURI = URI.createURI(fileURL);
		
		if (myURI == null || !myURI.isPlatform()){
			// if this is a device String such as C:\, transform it to the appropriate device URI
			myURI =	URI.createFileURI(fileURL);
		}
		return myURI.trimSegments(1);
	}
	
	private void addTerminationCriteriaSettings(DSEWorkflowConfiguration config) throws CoreException {
		config.setUseTerminationCriteria(this.getBooleanAttribute(DSEConstantsContainer.TC_GENERAL_USE_TERMINATION_CRITERIA));
		
		if(config.getUseTerminationCriteria()){
			config.setRunInComparisionMode(this.getBooleanAttribute(DSEConstantsContainer.TC_GENERAL_COMPARISION_MODE));
			
			config.setActivateComposedTerminationCriteria(this.getBooleanAttribute(DSEConstantsContainer.TC_COMPOSED_CRITERIA_ACTIVATE));
			if(config.getActivateComposedTerminationCriteria()){
				config.setComposedCriteriaExpression(this.getStringAttribute(DSEConstantsContainer.TC_COMPOSED_CRITERIA_EXPRESSION));
			}
			
			//Maximum Generation Number Criterion
			if(getBooleanAttribute(DSEConstantsContainer.TC_MAX_NUM_OF_GEN_ACTIVATE)){
				try {
					MaxGenerationNumberConfig mgnc = new MaxGenerationNumberConfig();
					mgnc.setMaximumNumberOfIterations(this.getIntegerAttribute(DSEConstantsContainer.TC_MAX_NUM_OF_GEN_LIMIT));
					config.getTCConfigurations().add(mgnc);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			//Elapsed Time Criterion
			if (getBooleanAttribute(DSEConstantsContainer.TC_ELAPSED_TIME_ACTIVATE)) {
				try {
					ElapsedTimeConfig etc = new ElapsedTimeConfig();
					etc.setExecutionInterval(this.getIntegerAttribute(DSEConstantsContainer.TC_ELAPSED_TIME_TIME_LIMIT)*60*1000L);
					if (getStringAttribute(DSEConstantsContainer.TC_ELAPSED_TIME_TYPE).equalsIgnoreCase("USER_TIME")) {
						etc.setTimeType(TimeType.USER_TIME);
						config.getTCConfigurations().add(etc);
					} else if (getStringAttribute(DSEConstantsContainer.TC_ELAPSED_TIME_TYPE).equalsIgnoreCase("CPU_TIME")) {
						etc.setTimeType(TimeType.CPU_TIME);
						etc.setExecutionInterval(this.getIntegerAttribute(DSEConstantsContainer.TC_ELAPSED_TIME_TIME_LIMIT)*60*1000L);
						config.getTCConfigurations().add(etc);
					}
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			//No New Pareto Optimal Candidates Found Criterion
			if(getBooleanAttribute(DSEConstantsContainer.TC_NO_NEW_CANDIDATES_ACTIVATE)){
				try {
					NoNewParetoOptimalCandidatesFoundConfig nnpocf = new NoNewParetoOptimalCandidatesFoundConfig();
					nnpocf.setIterationsWithoutNewCandidates(this.getIntegerAttribute(DSEConstantsContainer.TC_NO_NEW_CANDIDATES_ITERATIONS_WITHOUT));
					config.getTCConfigurations().add(nnpocf);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//Pareto Optimal Set Stability
			if(getBooleanAttribute(DSEConstantsContainer.TC_SET_STABILITY_ACTIVATE)){
				try {
					ParetoOptimalSetStabilityConfig poss = new ParetoOptimalSetStabilityConfig();
					poss.setMinimumIterationsToSurvive(this.getIntegerAttribute(DSEConstantsContainer.TC_SET_STABILITY_MINIMUM_ITERATION_TO_SURVIVE));
					if(getStringAttribute(DSEConstantsContainer.TC_SET_STABILITY_MODE).equalsIgnoreCase("EXACT_NUMBER")){
						poss.setEvaluationMode(EvaluationMode.EXACT_NUMBER);
						poss.setMinimumSurvivors(this.getIntegerAttribute(DSEConstantsContainer.TC_SET_STABILITY_NUMBER_OF_SURVIVORS_EXACT));
					}else if(getStringAttribute(DSEConstantsContainer.TC_SET_STABILITY_MODE).equalsIgnoreCase("PERCENTAGE")){
						poss.setEvaluationMode(EvaluationMode.PERCENTAGE);
						poss.setMinimumSurvivorsInPercentage(this.getIntegerAttribute(DSEConstantsContainer.TC_SET_STABILITY_NUMBER_OF_SURVIVORS_PERCENTAGE) / 100.0);
					}
					config.getTCConfigurations().add(poss);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//Minimal Quality Criteria Value
			if(getBooleanAttribute(DSEConstantsContainer.TC_MINIMAL_VALUES_ACTIVATE)){
				try {
					MinimalQualityCriteriaValueConfig mqcvc = new MinimalQualityCriteriaValueConfig();
					mqcvc.setNumberOfCandidatesToConform(this.getIntegerAttribute(DSEConstantsContainer.TC_MINIMAL_VALUES_CANDIDATES_TO_CONFORM));
					
					String[] configuredObjectivesLines = getStringAttribute(DSEConstantsContainer.TC_MINIMAL_VALUES_CONFIGURED_OBJECTIVES).split(";");
					List<String[]> decodedLines = new LinkedList<String[]>();
					for(String item : configuredObjectivesLines){
						decodedLines.add(item.split("\\|"));
					}
					
					Map<String, Value<?>> unresolvedObjectives = new HashMap<String, Value<?>>();
					for (String[] singleLine : decodedLines) {
						unresolvedObjectives.put(singleLine[0], new DoubleValue(Double.parseDouble(singleLine[1])));
					}
					
					mqcvc.setUnresolvedObjectiveMinimalValue(unresolvedObjectives);
					config.getTCConfigurations().add(mqcvc);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//A Given Pareto Front is Reached
			if(getBooleanAttribute(DSEConstantsContainer.TC_PARETO_FRONT_IS_REACHED_ACTIVATE)){
				try {
					GivenParetoFrontIsReachedConfig gpfir = new GivenParetoFrontIsReachedConfig();
					gpfir.setParetoFrontFile(getStringAttribute(DSEConstantsContainer.TC_PARETO_FRONT_IS_REACHED_PATH_TO_FRONT_FILE));
					gpfir.setPercentagesToCover(this.getIntegerAttribute(DSEConstantsContainer.TC_PARETO_FRONT_IS_REACHED_PERCENTAGES_TO_COVER)/100d);
					config.getTCConfigurations().add(gpfir);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//Insignificant Set Quality Improvement
			if(getBooleanAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_SET_IMPROVEMENT_ACTIVATE)){
				try {
					InsignificantSetQualityImprovementConfig isqic = new InsignificantSetQualityImprovementConfig();
					isqic.setComparisionGenerations(configuration.getAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_SET_IMPROVEMENT_GENERATION_X, 1));
					
					String[] configuredObjectivesLines = getStringAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_SET_IMPROVEMENT_CONFIGURED_OBJECTIVES).split(";");
					List<String[]> decodedLines = new LinkedList<String[]>();
					for(String item : configuredObjectivesLines){
						decodedLines.add(item.split("\\|"));
					}
					
					List<UnresolvedValueDifference> unresolvedValueDifferences = new LinkedList<UnresolvedValueDifference>();

					for(String[] singleLine : decodedLines){
						unresolvedValueDifferences.add(isqic.new UnresolvedValueDifference(singleLine[0], Double.parseDouble(singleLine[1])/100d, Double.parseDouble(singleLine[2])/100d));
					}

					isqic.setUnresolvedValueDifferences(unresolvedValueDifferences);
					config.getTCConfigurations().add(isqic);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//Insignificant Pareto Front Change
			if(getBooleanAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_FRONT_CHANGE_ACTIVATE)){
				try {
					InsignificantParetoFrontChangeConfig ipfc = new InsignificantParetoFrontChangeConfig();
					ipfc.setPastIterationNumber(this.getIntegerAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_FRONT_CHANGE_GENERATION_X));
					ipfc.setMinimumAllowedDifference(this.getIntegerAttribute(DSEConstantsContainer.TC_INSIGNIFICANT_FRONT_CHANGE_IMPROVEMENT)/100d);
					config.getTCConfigurations().add(ipfc);
				} catch (InvalidConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
