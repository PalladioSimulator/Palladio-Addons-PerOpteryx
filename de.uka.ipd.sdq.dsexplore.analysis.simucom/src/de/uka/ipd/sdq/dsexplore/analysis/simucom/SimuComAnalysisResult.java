package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.AbstractPie;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.PieEntity;
import de.uka.ipd.sdq.completions.Completion;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionFactory;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceType;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultDecoratorRepository;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultdecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.repositorydecorator.RepositorydecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.repositorydecorator.ServiceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.LinkingResourceResults;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.SeffFactory;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.pcmsolver.transformations.ContextWrapper;
import de.uka.ipd.sdq.pcmsolver.transformations.EMFHelper;
import de.uka.ipd.sdq.sensorframework.adapter.StateSensorToPieAdapter;
import de.uka.ipd.sdq.sensorframework.adapter.StateSensorToTimeDeltaPieAdapter;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.Measurement;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.SensorAndMeasurements;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanMeasurement;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.statistics.PhiMixingBatchAlgorithm;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;


abstract public class SimuComAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {
	
	protected double meanValue;

	protected double medianValue; 
	
	protected double throughput;
	
	protected double maxUtilization;
	
	protected double stdDeviation;

	protected ConfidenceInterval confidenceInterval; 
	
	protected double alpha = 0.95;

	protected long observations = 0;

	/** You must not use the usage scenario to navigate in the PCM, as the
	 * model may not be longer valid for this result after the constructor call.
	 */
	protected String usageScenarioName;

	/**
	 * Contains: resource utilisations
	 * Should also contain: Passive resources. 
	 */
	protected ResultDecoratorRepository results;

	protected Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;

	protected SimuComQualityAttributeDeclaration qualityAttributeInfo;

    /**
     * Identifier for subsets of data elements that belong to a single time series element.
     * 
     * Copied from de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.reports.RReport,
     * will copy instead of import to not get a dependency on an R dependent plugin. 
     * 
     * @see TimeSeries
     * @author groenda
     */
    protected enum TimeseriesData {
        /** The timespan value of the time series data point. */
        TIMESPAN,
        /** The eventtime value of the time series data point. */
        EVENTTIME,
        /** Both, the timespan and eventtime, of the time series data point. */
        BOTH
    }
	
	protected static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore");
	
	protected SimuComAnalysisResult(PCMInstance pcm) {
		super(pcm);
	}

	// Implemented individually in subclasses:
	// - abstract protected double calculateUnivariateStatistic(TimeseriesData timespan, UnivariateStatistic stat);
	// - abstract protected double calculateThroughput() throws AnalysisFailedException;

	protected double calculateMaxUtil(String resourceType) {
		double maxUtil = 0.0;
		for (UtilisationResult utilResult : this.results.getUtilisationResults_ResultDecoratorRepository()) {
			if (utilResult.getEntityName().contains(resourceType) && maxUtil < utilResult.getResourceUtilisation()){
				maxUtil = utilResult.getResourceUtilisation();
			}
		}
		return maxUtil;
	}

	protected ResultDecoratorRepository retrieveResults(PCMInstance pcmInstance) throws AnalysisFailedException {
		
		ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
		//FIXME : Not implemented for EDP2 yet -> commented for testing 
		// The following three functions can be commented in as soon as they are implemented in 
		// SimuComAnalysisEDP2Result. 
		//retrieveResourceUtilisation(pcmInstance, repo);
		//retrieveServiceResults(pcmInstance, repo);
		//retrievePassiveResourceUtil(repo, pcmInstance);
		
		return repo;
	}

	// Persistency framework dependent part of the next method
	abstract protected void retrieveServiceResultsFinish(PCMInstance pcmInstance, ResultDecoratorRepository repo, 
								HashMap<String, ExternalCallAction> idToExternalCallMap,
								Map<String, AssemblyContextContext> idToAssemblyContextMap,
								List<String> completionComponentIdsToIgnore);
	
	/**
	 * Quite ugly method to get the service results, because sensors only contain strings for identification, 
	 * and because only external calls currently have results, not SEFFs (TODO: define right probes when optimizing, then refactor this).
	 * @param pcmInstance
	 * @param repo
	 * @throws AnalysisFailedException 
	 */
	private void retrieveServiceResults(PCMInstance pcmInstance,
			ResultDecoratorRepository repo) throws AnalysisFailedException {
		
		//Need to get all times from all calls to that SEFF. 
		
		//get all ExternalCalls from model
		// get the eclass (strange way, but how to do it better?
		ExternalCallAction sampleExternalCall = SeffFactory.eINSTANCE.createExternalCallAction();
		EMFHelper helper = new EMFHelper();
		List<Repository> respositories = pcmInstance.getRepositories();
		
		HashMap<String, ExternalCallAction> idToExternalCallMap = new HashMap<String, ExternalCallAction>(100);
		
		for (Repository repository : respositories) {
			List<EObject> allExternalCallsList = helper.getElements(repository, sampleExternalCall.eClass());
			
			//put all external calls in a hash map based on their id
			for (EObject eObject : allExternalCallsList) {
				if (eObject instanceof ExternalCallAction){
					ExternalCallAction externalCall = (ExternalCallAction) eObject;
					String id = externalCall.getId(); 
					idToExternalCallMap.put(id, externalCall);
				}
				//if not ignore it (although something is wrong with the query above in that case) 

			}
		}
		
		// need all AssemblyContexts to get the called SEFFs and to get the contexts for the external calls 
		// (they may be instantiated several times in the system) 
		AssemblyContext sampleAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		//only gets the AssemblyContexts directly contained in the system, so we also need to query the Repository for composite components 
		EList<EObject> eObjectAssemblyContexts = helper.getElements(pcmInstance.getSystem(), sampleAssemblyContext.eClass());
		
		for (Repository repository : respositories) {
			List<EObject> assemblyContextsInRepo = helper.getElements(repository, sampleAssemblyContext.eClass());
			eObjectAssemblyContexts.addAll(assemblyContextsInRepo);
		}
		
		//Put them in map based on their id
		Map<String, AssemblyContextContext> idToAssemblyContextMap = new HashMap<String, AssemblyContextContext>(eObjectAssemblyContexts.size());
		List<String> completionComponentIdsToIgnore = new ArrayList<String>();
		
		//List<AssemblyContext> assemblyContextList = new ArrayList<AssemblyContext>(eObjectAssemblyContexts.size());
		for (EObject eObjectAssemblyContext : eObjectAssemblyContexts) {
			if (eObjectAssemblyContext instanceof AssemblyContext){
				AssemblyContext assemblyContext = (AssemblyContext)eObjectAssemblyContext;
				idToAssemblyContextMap.put(assemblyContext.getId(), new AssemblyContextContext(assemblyContext));
			}
		}
		
		
		Map<String, AssemblyContextContext> temporaryIdToAssemblyContextMap = new HashMap<String, AssemblyContextContext>(eObjectAssemblyContexts.size());
		//set parent contexts
		for (AssemblyContextContext assemblyContextContext : idToAssemblyContextMap.values()) {
			RepositoryComponent component = assemblyContextContext.getAssemblyContext().getEncapsulatedComponent__AssemblyContext();
			if (component instanceof ComposedStructure && ! (component instanceof Completion)){
				List<AssemblyContext> innerAssemblyContexts = ((ComposedStructure)component).getAssemblyContexts__ComposedStructure();
				for (AssemblyContext assemblyContext : innerAssemblyContexts) {
					String id = assemblyContext.getId();
					AssemblyContextContext innerContext = idToAssemblyContextMap.get(id);
					innerContext.setParent(assemblyContextContext);
					temporaryIdToAssemblyContextMap.put(innerContext.getComposedId(), innerContext);
				}
			} else if (component instanceof Completion){
				completionComponentIdsToIgnore.add(component.getEntityName());
			}
			
		}
		idToAssemblyContextMap.putAll(temporaryIdToAssemblyContextMap);
		
		//iterate through sensors and store the (ExternalCall,AssemblyContext) pairs with their sensors.
		
		// Delegated following code to subclasses
		retrieveServiceResultsFinish(pcmInstance, repo, idToExternalCallMap, idToAssemblyContextMap, completionComponentIdsToIgnore);
	}

	/**
	 * retrieves active resource utils. 
	 * Should also do passive resource utils (but not yet collected in SimuCom).  
	 * @param pcmInstance
	 * @param repo 
	 * @return
	 * @throws AnalysisFailedException
	 */
	private ResultDecoratorRepository retrieveResourceUtilisation(
			PCMInstance pcmInstance, ResultDecoratorRepository repo) throws AnalysisFailedException {
		
		List<ResourceContainer> resourceContainerList = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		for (ResourceContainer resourceContainer : resourceContainerList) {
			List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
			for (ProcessingResourceSpecification resource : resources) {
				ProcessingResourceSpecificationResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createProcessingResourceSpecificationResult();
				this.getUtilisationOfResource(result, resourceContainer, resource.getActiveResourceType_ActiveResourceSpecification());
				if (result != null && result.getResourceUtilisation() != Double.NaN){
					result.setEntityName("Util of "+resourceContainer.getEntityName()+"_"+resource.getActiveResourceType_ActiveResourceSpecification().getEntityName());
					result.setProcessingResourceSpecification_ProcessingResourceSpecificationResult(resource);
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
				}
			}
			
		}
		List<LinkingResource> linkList = pcmInstance.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
		for (LinkingResource linkingResource : linkList) {
			ResourceType type = linkingResource.getCommunicationLinkResourceSpecifications_LinkingResource().getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
			LinkingResourceResults result = ResourceenvironmentdecoratorFactory.eINSTANCE.createLinkingResourceResults();
			result.setLinkingResource_LinkingResourceResults(linkingResource);
			this.getUtilisationOfResource(result, linkingResource, type);
			if (result != null && result.getResourceUtilisation() != Double.NaN){
				result.setEntityName("Util of "+linkingResource.getEntityName()+"_"+type);
				repo.getUtilisationResults_ResultDecoratorRepository().add(result);
			}
		}
		return repo;
	}

	// Extracted from retrievePassiveResourceUtil
	abstract protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(Map<String, PassiveResourceResult> idsToPassiveResourceResult);
	
	// Extracted last part (see method above)
	private Map<String, PassiveResourceResult> retrievePassiveResourceUtil(ResultDecoratorRepository repo, PCMInstance pcm) throws AnalysisFailedException{
		
		
		Map<String, PassiveResourceResult> idsToPassiveResourceResult = new HashMap<String, PassiveResourceResult>();
		
		// results for passive resources
		List<AssemblyContext> allAssemblyContexts = de.uka.ipd.sdq.dsexplore.helper.EMFHelper.getAllUsedAssemblyContexts(pcm.getSystem());
		for (AssemblyContext assemblyContext : allAssemblyContexts) {
			RepositoryComponent innerComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();
			if (innerComponent instanceof BasicComponent){
				
				BasicComponent basicComponent = (BasicComponent) innerComponent;
				List<PassiveResource> passiveResourceOfComponentList = basicComponent
						.getPassiveResource_BasicComponent();
				for (PassiveResource passiveResource : passiveResourceOfComponentList) {

					String passiveResourceAndAssemblyContextId = passiveResource.getId()+":"+assemblyContext.getId();
					
					PassiveResourceResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createPassiveResourceResult();
					
					result.setPassiveResource_PassiveResourceResult(passiveResource);
					result.setAssemblyContext_PassiveResourceResult(assemblyContext);
					result.setEntityName("Utilisation of "+passiveResource.getEntityName()+" id: "+passiveResourceAndAssemblyContextId);
					
					
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
					idsToPassiveResourceResult.put(passiveResourceAndAssemblyContextId, result);
					
				}
		
			}
			
		}
		
		return retrievePassiveResourceUtilFinish(idsToPassiveResourceResult);
		
	}

	// Implemented individually in subclasses
	// abstract protected ConfidenceInterval determineConfidenceInterval() throws AnalysisFailedException;
	

	/**
	 * This implementation does not properly check the passed criterion...
	 */
	@Override
	public double getValueFor(Criterion criterion) {
		EvaluationAspectWithContext aspect = this.objectiveToAspects.get(criterion);
		
		if (aspect != null){
			if (EcoreUtil.equals(aspect.getDimension(), this.qualityAttributeInfo.getResponseTime())){
				return this.meanValue;
			} else if (EcoreUtil.equals(aspect.getDimension(), this.qualityAttributeInfo.getThroughput())){
				return this.throughput;
			} else if (EcoreUtil.equals(aspect.getDimension(), this.qualityAttributeInfo.getMaxUtilization())){
				return this.maxUtilization;
			}
		} 
		
		logger.warn("Unknown aspect for simu com result, adding NaN.");
		return Double.NaN;
	}

	@Override
	public double getMeanValue() {
		return meanValue;
	}
	
	public double getStandardDeviation() {
		return stdDeviation;
	}
	
	public double getVariance() throws AnalysisFailedException {
		double std = this.getStandardDeviation();
		return std * std;
	}
	
	public double getCoefficientOfVariance()  {
		double std = this.getStandardDeviation();
		double mean = this.getMeanValue();
		return std / mean;
	}
	
	/**
	 * Retrieves the confidence interval. When called for the first time, this 
	 * method calculates the confidence interval with the given level from the 
	 * data stored in the usage scenario sensor. 
	 * If no batch independence is given, the confidence interval is set to  
	 * 0 to positive infinity. 
	 */
	public ConfidenceInterval getConfidenceInterval(){
		return this.confidenceInterval;
	}
	
	public double getMedianValue() {
		return medianValue;
	}

	/**
	 * Get the utilisation of the passed resource
	 */
	abstract protected void getUtilisationOfResource(ActiveResourceUtilisationResult resultToFill, Entity container, ResourceType resourceType) throws AnalysisFailedException;
	
	@Override
	public long getNumberOfObservations() {
		return this.observations;
	}

	@Override
	public ResultDecoratorRepository getResults() {
		return this.results;
	}
	
	/**Prepares to export the measurements of a time series sensor to R. 
	 * Therefore a temporary file is created and the R command line to 
	 * import this data is returned. 
	 * 
	 * @param measurements Measurements for a sensor.
	 * @param dataSelection the data element to save.
	 * @return R command to read measurements. 
	 *         Can be used to store data in a r vector.
	 */
/*	private String prepareExportToRByFile(
			final SensorAndMeasurements measurements,
			final TimeseriesData dataSelection) {
		File temporaryFile;
		try {
			temporaryFile = File.createTempFile("data", 
					(dataSelection == TimeseriesData.EVENTTIME) 
						? "_et.txt" 
						: "_ts.txt"
					);
			temporaryFile.deleteOnExit();
			FileWriter temporaryFileWriter = new FileWriter(temporaryFile);
			StringBuffer result = new StringBuffer();
			for (Measurement time : measurements.getMeasurements()) {
				TimeSpanMeasurement tsm = (TimeSpanMeasurement) time;
				result.append(
					(dataSelection == TimeseriesData.EVENTTIME) 
						? tsm.getEventTime() 
						: tsm.getTimeSpan() 
					);
				result.append(" ");
			}
			temporaryFileWriter.write(result.toString());
			temporaryFileWriter.close();
			return "scan(file=\"" 
				+ temporaryFile.getAbsolutePath().replace(File.separator, 
						"\\\\")
				+ "\")";
		} catch (IOException e) {
			RVisualisationPlugin.log(IStatus.ERROR,
				"Error accessing temporary file to transfer sensordata "
				+ "to R. \n\n Details: "	+ e.getMessage());
		}
		return "";
	}*/

}

class ExternalCallActionWithSensors {
	
	private ExternalCallAction externalCallAction;
	private AssemblyContextContext assemblyContext;
	private List<Sensor> sensors;

	public ExternalCallActionWithSensors(ExternalCallAction e, AssemblyContextContext myAssemblyContext){
		this.externalCallAction = e;
		this.assemblyContext = myAssemblyContext;
		this.sensors = new LinkedList<Sensor>();
	}
	
	public ExternalCallAction getExternalCall() {
		return this.externalCallAction;
	}
	
	public AssemblyContextContext getAssemblyContext() {
		return this.assemblyContext;
	}

	public void addSensor(Sensor s){
		this.sensors.add(s);
	}
	
	public List<Sensor> getSensors(){
		return this.sensors;
	}
	
	@Override
	public boolean equals(Object o){
		if (this == o){
			return true;
		}
		if (o instanceof ExternalCallActionWithSensors){
			ExternalCallActionWithSensors other = (ExternalCallActionWithSensors)o;
			return other.getAssemblyContext().equals(this.assemblyContext)
				&& other.getExternalCall().equals(this.externalCallAction);
		} else {
			return false;
		}
		
	}
}

class AssemblyContextContext {
	
	private AssemblyContext assemblyContext;
	private AssemblyContextContext parentAssemblyContext;


	public AssemblyContextContext(AssemblyContext thisContext){
		this.assemblyContext = thisContext;
	}
	
	/** 
	 * return composed id 
	 * <this.id><parent.id><grandparent.id>...
	 * 
	 * @return
	 */
	public String getComposedId() {
		String parentID = "";
		if (this.hasParent()){
			parentID = this.getParentAssemblyContext().getComposedId();
		}
		return this.assemblyContext.getId()+parentID;
	}

	public boolean hasParent(){
		return this.parentAssemblyContext != null;
	}
	
	/**
	 * @return the assemblyContext
	 */
	public AssemblyContext getAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * @return the parentAssemblyContext
	 */
	public AssemblyContextContext getParentAssemblyContext() {
		return parentAssemblyContext;
	}
	
	public void setParent(AssemblyContextContext assemblyContextContext){
		this.parentAssemblyContext = assemblyContextContext;
	}
	
	
}
