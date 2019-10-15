package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.LinkingResourceResults;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorFactory;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

public class SimulizarAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	private long observations;
	private final Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;
	private final SimulizarQualityAttributeDeclaration qualityAttributeInfo;
	private final ExperimentSetting experimentSetting;
	private final ExperimentRun run;

	private double meanValue;
	private double throughput;
	private double maxUtilization;

	protected SimulizarAnalysisResult(final ExperimentRun run, final ExperimentSetting experiment, final PCMInstance pcmInstance, final Entity pcmEntity,
			final Map<Criterion, EvaluationAspectWithContext> objectiveToAspect, final SimulizarQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {
		super(pcmInstance);

		this.experimentSetting = experiment;
		this.run = run;

		this.objectiveToAspects = objectiveToAspect;
		this.qualityAttributeInfo = qualityAttributeInfo;


		this.results = this.retrieveResults(pcmInstance);
		this.calculateResults();
		SimulizarAnalysisResult.logger.debug("Initialised Simulizar EDP2 result");
	}

	private void calculateResults() {
		this.observations = 0;
		this.maxUtilization = Double.NaN;
		this.throughput = Double.NaN;
		this.maxUtilization = Double.NaN;
		
//	    final SensorAndMeasurements sam = getUsageScenarioMeasurements();
//        this.meanValue =  calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new Mean());
//        this.stdDeviation = calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new StandardDeviation());
//        this.medianValue = calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new Median());
//        this.throughput = calculateThroughput(sam);
//        this.observations = sam.getMeasurements().size();
//        this.confidenceInterval = determineConfidenceInterval(sam);

		
	}


	private ResultDecoratorRepository retrieveResults(final PCMInstance pcmInstance) throws AnalysisFailedException {
		final ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
		this.retrieveResourceUtilisation(pcmInstance, repo);
		this.retrieveServiceResults(pcmInstance, repo);
		this.retrievePassiveResourceUtil(repo, pcmInstance);
		return repo;
	}

	private void retrievePassiveResourceUtil(ResultDecoratorRepository repo, PCMInstance pcmInstance) {
//
//        final Map<String, PassiveResourceResult> idsToPassiveResourceResult = new HashMap<String, PassiveResourceResult>();
//
//        // results for passive resources
//        final List<AssemblyContext> allAssemblyContexts = de.uka.ipd.sdq.dsexplore.helper.EMFHelper.getAllUsedAssemblyContexts(pcm.getSystem());
//        for (final AssemblyContext assemblyContext : allAssemblyContexts) {
//            final RepositoryComponent innerComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();
//            if (innerComponent instanceof BasicComponent){
//
//                final BasicComponent basicComponent = (BasicComponent) innerComponent;
//                final List<PassiveResource> passiveResourceOfComponentList = basicComponent
//                        .getPassiveResource_BasicComponent();
//                for (final PassiveResource passiveResource : passiveResourceOfComponentList) {
//
//                    final String passiveResourceAndAssemblyContextId = passiveResource.getId()+":"+assemblyContext.getId();
//
//                    final PassiveResourceResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createPassiveResourceResult();
//
//                    result.setPassiveResource_PassiveResourceResult(passiveResource);
//                    result.setAssemblyContext_PassiveResourceResult(assemblyContext);
//                    result.setEntityName("Utilisation of "+passiveResource.getEntityName()+" id: "+passiveResourceAndAssemblyContextId);
//
//
//                    repo.getUtilisationResults_ResultDecoratorRepository().add(result);
//                    idsToPassiveResourceResult.put(passiveResourceAndAssemblyContextId, result);
//
//                }
//
//            }
//
//        }
//
//        return retrievePassiveResourceUtilFinish(idsToPassiveResourceResult);
//		
	}
	
	
//	 @Override
//	    protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(final Map<String, PassiveResourceResult> idsToPassiveResourceResult)
//	    {
//	        final Collection<Sensor> sensorList = this.experiment.getSensors();
//
//	        for (final Sensor sensor : sensorList) {
//	            final String sensorName = sensor.getSensorName();
//	            if (sensorName.contains("Passive Resource")){
//	                final String passiveResourceAndAssemblyContextID = sensorName.substring(sensorName.lastIndexOf(" ")+1);
//	                final PassiveResourceResult passiveResourceResult = idsToPassiveResourceResult.get(passiveResourceAndAssemblyContextID);
//
//	                if (passiveResourceResult != null){
//
//	                    final SensorAndMeasurements results = run.getMeasurementsOfSensor(sensor);
//
//	                    if (sensorName.contains("Hold time")){
//	                        passiveResourceResult.setAverageHoldingTime(calculateUnivariateStatistic(results, TimeseriesData.TIMESPAN, new Mean()));
//	                    } else if (sensorName.contains("Wait time")){
//	                        passiveResourceResult.setAverageWaitTime(calculateUnivariateStatistic(results, TimeseriesData.TIMESPAN, new Mean()));
//	                    } else if (sensorName.contains("Util")){
//	                        // for passive resources, also consider the capacity when calculating the util
//	                        final int capacity = Integer.parseInt(passiveResourceResult.getPassiveResource_PassiveResourceResult().getCapacity_PassiveResource().getSpecification());
//	                        retrieveUtilisationFromSensor(sensor, passiveResourceResult, capacity);
//
//	                    }
//	                } else {
//	                    logger.warn("Unknown passive resource id "+passiveResourceAndAssemblyContextID+", ignoring this sensor.");
//	                }
//	            }
//
//	        }
//
//	        return idsToPassiveResourceResult;
//	    }

	private void retrieveServiceResults(PCMInstance pcmInstance, ResultDecoratorRepository repo) {
//		 final Collection<Sensor> sensorList = this.experiment.getSensors();
//	        final List<ExternalCallActionWithSensors> externalCallsInContextWithSensorsList = new LinkedList<ExternalCallActionWithSensors>();
//
//	        for (final Sensor sensor : sensorList) {
//	            final String sensorName = sensor.getSensorName();
//	            if (sensorName.contains("CallID")){
//	                //current sensor is an ExternalCall sensor
//
//	                // parse external call id
//	                if (sensorName.lastIndexOf(" ") < sensorName.length()-2
//	                        && sensorName.lastIndexOf(" ") > -1
//	                        && sensorName.length() > 2){
//	                    final String externalCallID = sensorName.substring(sensorName.lastIndexOf(" ")+1, sensorName.length()-1);
//
//	                    // 	find the external call in the model
//	                    final ExternalCallAction myCall = idToExternalCallMap.get(externalCallID);
//
//	                    if (myCall != null){
//
//	                        //retrieve AssemblyContext from sensor name
//	                        final String assemblyContextID = sensorName.substring(sensorName.indexOf("AssemblyCtx")+13,sensorName.indexOf("CallID")-2);
//	                        final AssemblyContextContext myAssemblyContext = idToAssemblyContextMap.get(assemblyContextID);
//	                        if (myAssemblyContext != null){
//
//	                            ExternalCallActionWithSensors externalCallInContextWithSensors = new ExternalCallActionWithSensors(myCall, myAssemblyContext);
//
//	                            //reuse pair if it already there
//	                            final int index = externalCallsInContextWithSensorsList.indexOf(externalCallInContextWithSensors);
//	                            if (index > 0){
//	                                externalCallInContextWithSensors = externalCallsInContextWithSensorsList.get(index);
//	                            } else {
//	                                externalCallsInContextWithSensorsList.add(externalCallInContextWithSensors);
//	                            }
//
//	                            // map all result sensors to the SEFF they call
//	                            externalCallInContextWithSensors.addSensor(sensor);
//	                            continue;
//	                        }
//	                    } else {
//	                        // check if this is a completion component, if yes, ignore it and continue
//	                        final String componentID = sensorName.substring(sensorName.indexOf("Component: ")+11,sensorName.indexOf("AssemblyCtx")-2);
//	                        if (completionComponentIdsToIgnore.contains(componentID)){
//	                            logger.info("Ignoring completion component sensor "+sensorName+" when reading in SimuCom results.");
//	                            continue;
//	                        }
//	                    }
//	                }
//	                logger.warn("Cannot retrieve external call id from sensor. If this is a completion component, this is ok. Otherwise, sensor name labels must have changed. Contact developers if this sensors is needed. Sensor: "+sensorName);
//	            }
		
	}

	private void retrieveResourceUtilisation(PCMInstance pcmInstance, ResultDecoratorRepository repo) {
		final List<ResourceContainer> resourceContainerList = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		for (final ResourceContainer resourceContainer : resourceContainerList) {
			final List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
			for (final ProcessingResourceSpecification resource : resources) {
				final ProcessingResourceSpecificationResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createProcessingResourceSpecificationResult();
				this.getUtilisationOfResource(result, resourceContainer, resource.getActiveResourceType_ActiveResourceSpecification());
				if (result != null && result.getResourceUtilisation() != Double.NaN) {
					result.setEntityName("Util of " + resourceContainer.getEntityName() + "_" + resource.getActiveResourceType_ActiveResourceSpecification().getEntityName());
					result.setProcessingResourceSpecification_ProcessingResourceSpecificationResult(resource);
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
				}
			}

		}
		final List<LinkingResource> linkList = pcmInstance.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
		for (final LinkingResource linkingResource : linkList) {
			final ResourceType type = linkingResource.getCommunicationLinkResourceSpecifications_LinkingResource().getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
			final LinkingResourceResults result = ResourceenvironmentdecoratorFactory.eINSTANCE.createLinkingResourceResults();
			result.setLinkingResource_LinkingResourceResults(linkingResource);
			this.getUtilisationOfResource(result, linkingResource, type);
			if (result != null && result.getResourceUtilisation() != Double.NaN) {
				result.setEntityName("Util of " + linkingResource.getEntityName() + "_" + type);
				repo.getUtilisationResults_ResultDecoratorRepository().add(result);
			}
		}

	}

	private void getUtilisationOfResource(final ActiveResourceUtilisationResult resultToFill, final Entity container, final ResourceType resourceType) {
		List<Measurement> measurements = this.run.getMeasurement();
		for (Measurement measurement : measurements) {
			// TODO DTHF1
		}
	}

	
	@Override
	public double getValueFor(Criterion criterion) {
		if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
			return this.meanValue;
		} else if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getThroughput())) {
			return this.throughput;
		} else if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getMaxUtilization())) {
			return this.maxUtilization;
		}

		SimulizarAnalysisResult.logger.warn("Unknown aspect for simu com result, adding NaN.");
		return Double.NaN;
	}

	private Dimension getDimensionForCriterion(final Criterion criterion) {
		final EvaluationAspectWithContext aspect = this.objectiveToAspects.get(criterion);
		if (aspect != null) {
			return aspect.getDimension();
		} else {
			return null;
		}
	}

	@Override
	public double getMedianValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMeanValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getStandardDeviation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCoefficientOfVariance() {
		final double std = this.getStandardDeviation();
		final double mean = this.getMeanValue();
		return std / mean;
	}

	@Override
	public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfObservations() {
		return this.observations;
	}

	////////////////////// LOAD /////////////////////////
	/**
	 * Tries to find a matching experiment setting in all data sources available
	 * in the repository manager. If a matching experiment setting that contains
	 * at least one run is found, <code>true</code>. If not, <code>false</code>
	 * is returned.
	 *
	 * @param experimentSettingName
	 *            The experiment name to match
	 * @return <code>true</code> if experiment has been found,
	 *         <code>false</code> otherwise
	 */
	public static boolean isExperimentRunExisting(final String experimentName, final String experimentSettingName, Repository repo) {
		return (SimulizarAnalysisResult.findExperimentRun(experimentName, experimentSettingName, repo) != null);
	}

	public static IStatisticAnalysisResult findExperimentRunAndCreateResult(Entity entity, String experimentName, String experimentSettingName, PCMInstance pcmInstance, Repository repo,
			Map<Criterion, EvaluationAspectWithContext> criterionToAspect, SimulizarQualityAttributeDeclaration qualityAttribute) throws AnalysisFailedException {
		ExperimentSetting mySetting = SimulizarAnalysisResult.findExperimentRun(experimentName, experimentSettingName, repo);

		if (mySetting != null) {

			final EList<ExperimentRun> expRuns = mySetting.getExperimentRuns();

			// Find latest run
			final Comparator<ExperimentRun> comp = new ExperimentRunComparator();

			/* sort so that the newest it at the beginning */
			ECollections.sort(expRuns, comp);

			ExperimentRun reqRun = null;
			for (ExperimentRun experimentRun : expRuns) {
				if (experimentRun.getMeasurement().size() > 0) {
					reqRun = experimentRun;
					break;
				}
			}

			// Return new instance of SimuComAnalysisEDP2Result for the
			// requested run
			return new SimulizarAnalysisResult(reqRun, mySetting, pcmInstance, entity, criterionToAspect, qualityAttribute);
		}

		return null;
	}

	/**
	 * Comparator for ExperimentRuns to sort them ordered by start date in
	 * descending order (newest first).
	 *
	 * @author Shengjia Feng
	 */
	private static class ExperimentRunComparator implements Comparator<ExperimentRun> {
		/**
		 * Sorts experiment runs by their start date in ascending order.
		 */
		@Override
		public int compare(final ExperimentRun first, final ExperimentRun second) {
			return second.getStartTime().compareTo(first.getStartTime());
		}
	}

	/**
	 * Tries to find a matching experiment setting in all data sources available
	 * in the repository manager. If a matching experiment setting that contains
	 * at least one run is found, it is returned. If not, <code>null</code> is
	 * returned.
	 *
	 * @param experimentSettingName
	 *            The experiment name to match
	 * @param repo
	 * @return The experiment setting if it has been found, <code>null</code>
	 *         otherwise
	 */
	private static ExperimentSetting findExperimentRun(final String experimentName, final String experimentSettingName, Repository repo) {

		// Iterate through all experiment groups and find the one with the
		// requested name
		final EList<ExperimentGroup> currentExperimentGroups = repo.getExperimentGroups();

		for (final ExperimentGroup curr : currentExperimentGroups) {
			if (experimentName.equals(curr.getPurpose())) {

				final EList<ExperimentSetting> settings = curr.getExperimentSettings();

				for (ExperimentSetting experimentSetting : settings) {

					if (experimentSettingName.equals(experimentSetting.getDescription())) {
						// Assuming that each experiment group only has ONE
						// setting
						// NOTE: Change to loop if data structure is altered to
						// find the matching setting
						final EList<ExperimentRun> expRuns = experimentSetting.getExperimentRuns();

						// Return true if there are runs
						if (expRuns.size() > 0) {
							for (ExperimentRun experimentRun : expRuns) {
								if (experimentRun.getMeasurement().size() > 0) {
									return experimentSetting;
								}
							}

						}
					}
				}
			}
		}

		return null;
	}

	protected static Repository findSelectedEDP2Repository(final ILaunchConfiguration config) throws CoreException {
		final String selectedDataSourceID = config.getAttribute("EDP2RepositoryID", "");

		// Get the repository with the given name frRepositoryository manager.
		EList<Repository> repos = RepositoryManager.getCentralRepository().getAvailableRepositories();
		for (Repository repo : repos) {
			if (repo.getId().equals(selectedDataSourceID)) {
				return repo;
			}
		}
		return null;
	}

}
