package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.opt4j.core.Objective;
import org.opt4j.core.Genotype;
import org.opt4j.operator.copy.Copy;

import de.uka.ipd.sdq.context.aggregatedUsageContext.AggregatedCommunication;
import de.uka.ipd.sdq.context.aggregatedUsageContext.AggregatedResourceDemand;
import de.uka.ipd.sdq.context.aggregatedUsageContext.ComputedAggregatedUsage;
import de.uka.ipd.sdq.context.aggregatedUsageContext.ServiceExecutionContext;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.Pair;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.AntipatternsRankingMethod;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.AbstractTactic;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticsResultCandidate;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.UtilisationResultCacheAndHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
//import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.designdecision.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceType;
import de.uka.ipd.sdq.pcm.resourcetype.SchedulingPolicy;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultDecoratorRepository;
import de.uka.ipd.sdq.pcm.resultdecorator.repositorydecorator.ServiceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;

public class ConcurrentProcessingSystemImplCatia extends AbstractTactic {

	private Objective performance;
	
	private AntipatternsRankingMethod rankingMethod = null; 
	
	protected static Logger logger = Logger
			.getLogger(ConcurrentProcessingSystemImplCatia.class.getName());

	public ConcurrentProcessingSystemImplCatia(Copy<Genotype> copy,
			DSEIndividualFactory individualFactory,
			DSEWorkflowConfiguration configuration) {
		super(copy, individualFactory, configuration, new String[] {QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH,
				QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH});
		
		this.rankingMethod = configuration.getRankingMethod(); 
		
		//if (rankingMethod == AntipatternsRankingMethod.NO_RANKING){
			// no ranking
		//} else if (rankingMethod == AntipatternsRankingMethod.BASIC_RANKING){
			// basic ranking
		//} else if (rankingMethod == AntipatternsRankingMethod.SEMANTIC_FACTOR){
			// semantic factor.
		//}
		
		try {
			Collection<Objective> objectives = Opt4JStarter.getDSEEvaluator()
					.getObjectives();
			for (Objective objective : objectives) {
				if (objective.getName().contains(
						QualityAttribute.PERFORMANCE_QUALITY.getName())) {
					this.performance = objective;
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//@author catia: find the max utilised cpu
	private int getMaxUtilisedCpu(List<ActiveResInfo> list) {
		int position = 0;
		int temp = 0;
		for (ActiveResInfo el : list) {
			if (el.type.getEntityName().equals("CPU") && (el.utilisation > list.get(position).utilisation)) {
					position = temp;
			}
			temp++;
		}
		return position;
	}

	//@author catia: find the max utilised hdd
	private int getMaxUtilisedHdd(List<ActiveResInfo> list) {
		int position = 0;
		int temp = 0;
		for (ActiveResInfo el : list) {
			if (el.type.getEntityName().equals("HDD") && (el.utilisation > list.get(position).utilisation)) {
					position = temp;
			}
			temp++;
		}
		return position;
	}
	
	//@author catia: find the max utilised active resource
	private int getMaxUtilisedActiveRes(List<ActiveResInfo> list) {
		int position = 0;
		int temp = 0;
		for (ActiveResInfo el : list) {
				if (el.utilisation > list.get(position).utilisation) {
					position = temp;
			}
			temp++;
		}
		return position;
	}
	
	//@author catia: get over used CPU resources whose queue length exceeds a threshold
	private List<ActiveResInfo> getOverUsedCpu(List<ActiveResInfo> list){
		List<ActiveResInfo> result = new ArrayList<ActiveResInfo>(0);
		
		//@author catia: threshold value for max CPU utilisation
        double thresholdMaxCpu = new Thresholds().thresholdMaxCpu;
        
		// @author catia: threshold value for max queue length
		double thresholdCpuQL = new Thresholds().thresholdCpuQL;
		
		for (ActiveResInfo el : list) {
			if((el.type.getEntityName().equals("CPU")) && (el.utilisation > thresholdMaxCpu) && (el.queueLength > thresholdCpuQL)){
				el.rank = el.utilisation - thresholdMaxCpu;
				result.add(el);
			}
		}
		return result;
	}
	
	//@author catia: get under used CPU resources
	private List<ActiveResInfo> getUnderUsedCpu(List<ActiveResInfo> list){
		List<ActiveResInfo> result = new ArrayList<ActiveResInfo>(0);
		
		//@author catia: threshold value for min CPU utilisation
        double thresholdMinCpu = new Thresholds().thresholdMinCpu;
		
		for (ActiveResInfo el : list) {
			if((el.type.getEntityName().equals("CPU")) && (el.utilisation < thresholdMinCpu)){
				el.rank = thresholdMinCpu - el.utilisation;
				result.add(el);
			}
		}
		return result;
	}
	
	//@author catia: get over used HDD resources whose queue length exceeds a threshold
	private List<ActiveResInfo> getOverUsedHDD(List<ActiveResInfo> list){
		List<ActiveResInfo> result = new ArrayList<ActiveResInfo>(0);
		
		//@author catia: threshold value for max HDD utilisation
        double thresholdMaxHdd = new Thresholds().thresholdMaxHdd;
        
		// @author catia: threshold value for max queue length
		double thresholdHddQL = new Thresholds().thresholdHddQL;
		
		for (ActiveResInfo el : list) {
			if((el.type.getEntityName().equals("HDD")) && (el.utilisation > thresholdMaxHdd) && (el.queueLength > thresholdHddQL)){
				el.rank = el.utilisation - thresholdMaxHdd;
				result.add(el);
			}
		}
		return result;
	}
	
	//@author catia: get under used HDD resources
	private List<ActiveResInfo> getUnderUsedHDD(List<ActiveResInfo> list){
		List<ActiveResInfo> result = new ArrayList<ActiveResInfo>(0);
		
		//@author catia: threshold value for min CPU utilisation
        double thresholdMinHdd = new Thresholds().thresholdMinHdd;
		
		for (ActiveResInfo el : list) {
			if((el.type.getEntityName().equals("HDD")) && (el.utilisation < thresholdMinHdd)){
				el.rank = thresholdMinHdd - el.utilisation;
				result.add(el);
			}
		}
		return result;
	}
	
	//@author catia: get critical passive resources
	//Assumption: a passive resource is considered "critical" if its queue length exceeds a threshold value
	//and the waiting time is more than the double of the holding time
	private List<PassiveResInfo> getCriticalPassiveRes(List<PassiveResInfo> list){
		List<PassiveResInfo> result = new ArrayList<PassiveResInfo>(0);
		
		//@author catia: threshold value for max queue length of passive resources
        double thresholdPrQL = new Thresholds().thresholdPrQL;
		
		for (PassiveResInfo el : list) {
			if((el.queueLength > thresholdPrQL) && (el.waitingTime > (el.holdingTime * 2))){
				el.rank = el.waitingTime - (el.holdingTime * 2);
				result.add(el);
			}
		}
		return result;
	}

	//@author catia: check if a component is already stored for its resource demand (cpu, hdd)
	private boolean compOccurrence(List<CompInfoResDemand> list, AllocationContext a) {
		boolean value = false;
		for (CompInfoResDemand compInfoResDemand : list) {
			if (compInfoResDemand.ac == a) {
				value = true;
			}
		}
		return value;
	}

	//@author catia: increment the computation (cpu demand) of a component
	private void incrementComputation(List<CompInfoResDemand> list,
			AllocationContext b, double value) {
		for (CompInfoResDemand compInfoResDemand : list) {
			if (compInfoResDemand.ac == b) {
				compInfoResDemand.computation = compInfoResDemand.computation
						+ value;
			}
		}
	}

	//@author catia: increment the storage (hdd demand) of a component
	private void incrementStorage(List<CompInfoResDemand> list,
			AllocationContext b, double value) {
		for (CompInfoResDemand compInfoResDemand : list) {
			if (compInfoResDemand.ac == b) {
				compInfoResDemand.storage = compInfoResDemand.storage + value;
			}
		}
	}
	
	//@author catia: update the frequency of a seff
	private void updateFrequency (List<ServiceInfo> list, String seffName, String compName, double f){
		for (ServiceInfo el: list){
			if (el.serviceName.equals(seffName) && el.compName.equals(compName)){
				el.frequency = f;
			}
		}
	}
	
	//@author catia: check if the list of seffs is unbalanced
	//Assumption - a list of seffs is considered "unbalanced" if the maximum and
	//the minimum response time among them is higher than a threshold value 
	private boolean unbalancedSeffs(List<ServiceInfo> list){
		boolean result = false;
		// threshold value, i.e. the allowed gap between the maximum and the minimum response time of seffs
		double gapRT = 0.5;
		
		if ( (getMaxRT(list) - getMinRT(list)) > gapRT ){
			result = true;
			logger.info("The list of seffs is unbalanced, the maximum resp. time is " 
					+ getMaxRT(list) + " and the minimum one is " + getMinRT(list));
		}
		return result;
	}
	
	//@author catia: get the seff with the highest throughput value among the list of seffs
	private ServiceInfo getOverUsedSeff(List<ServiceInfo> list){
		ServiceInfo result = list.get(0);
		for (ServiceInfo el: list){
			if(el.throughput > result.throughput){
				result = el;
			}
		}
		return result;
	}

	//@author catia: get the seff with the lowest throughput value among the list of seffs
	private ServiceInfo getUnderUsedSeff(List<ServiceInfo> list){
		ServiceInfo result = list.get(0);
		for (ServiceInfo el: list){
			if(el.throughput < result.throughput){
				result = el;
			}
		}
		return result;
	}
	
	//@author catia: detection of the antipattern CPS (Concurrent Processing Systems)
	private boolean cps(List<ActiveResInfo> list) {
		boolean result = false;
		if ((getOverUsedCpu(list).size() != 0 && getUnderUsedCpu(list).size() != 0)
				|| (getOverUsedHDD(list).size() != 0 && getUnderUsedHDD(list).size() != 0)) {
			logger.info("The antipattern CONCURRENT PROCESSING SYSTEMS has been detected");
			result = true;
		}
		return result;
	}

	//@author catia: detection of the antipattern OLB (One-Lane Bridge)
	private boolean olb(List<ServiceInfo> list, PassiveResInfo criticPassiveRes) {
		boolean result = false;
		for (ServiceInfo el : list) {
			if (el.compName.equals(criticPassiveRes.bc.getEntityName())) {
				if (el.respT > el.userRTreq) {
					result = true;
				}
			}
		}
		if (result) {
			logger.info("The antipattern ONE-LANE BRIDGE has been detected");
		}
		return result;
	}
	
	//@author catia: detection of the antipattern EP (Extensive Processing)
	private boolean ep(ActiveResInfo activeRes, List<ServiceInfo> list) {
		boolean result = false;
		if ( (activeRes.schedulingPolicy.equals("FCFS")) && (unbalancedSeffs(list))) {
			result = true;
			logger.info("The antipattern EXTENSIVE PROCESSING has been detected");
		}
		return result;
	}

	//@author catia: find the component that requires the most high cpu demand
	private int getCompMaxCPUdemand(List<CompInfoResDemand> list) {
		int position = 0;
		int temp = 0;
		for (CompInfoResDemand compInfoResDemand : list) {
			if (compInfoResDemand != null) {
				if (list.get(position).computation < compInfoResDemand.computation) {
					position = temp;
				}
			}
			temp++;
		}
		return position;
	}

	//@author catia: find the component that requires the most high hdd demand
	private int getCompMaxHDDdemand(List<CompInfoResDemand> list) {
		int position = 0;
		int temp = 0;
		for (CompInfoResDemand compInfoResDemand : list) {
			if (compInfoResDemand != null) {
				if (list.get(position).storage < compInfoResDemand.storage) {
					position = temp;
				}
			}
			temp++;
		}
		return position;
	}

	//@author catia: give the components deployed on a node
	private List<CompInfoResDemand> deployedComponents(List<CompInfoResDemand> comp, ResourceContainer node) {
		List<CompInfoResDemand> result = new ArrayList<CompInfoResDemand>(0);
		for (CompInfoResDemand compInfoResDemand : comp) {
			if (compInfoResDemand.rc == node) {
				result.add(compInfoResDemand);
			}
		}
		return result;
	}
	
	//@author catia: give the resource container on which a component is deployed
	private ResourceContainer componentDeployNode(List<CompInfoResDemand> comp, BasicComponent bc) {
			ResourceContainer result = null;
			for (CompInfoResDemand compInfoResDemand : comp) {
				if (compInfoResDemand.bc == bc) {
					result = compInfoResDemand.rc;
				}
			}
			return result;
		}
	
	//@author catia: give the seffs provided by a basic component
		private List<ServiceInfo> getSeffsOfComp(List<ServiceInfo> list, String comp) {
		List<ServiceInfo> result = new ArrayList<ServiceInfo>(0);
		for (ServiceInfo el : list) {
			if (el.compName.equals(comp)) {
				result.add(el);
			}
		}
		return result;
	}
	
	//@author catia: provide the maximum response time among a list of seffs
	private double getMaxRT(List<ServiceInfo> list) {
		double temp = 0.0;
		for (ServiceInfo el : list) {
				if (el.respT > temp) {
					temp = el.respT;
			}
		}
		return temp;
	}
	
	//@author catia: provide the minimum response time among a list of seffs
	private double getMinRT(List<ServiceInfo> list) {
		double temp = getMaxRT(list);
		for (ServiceInfo el : list) {
				if (el.respT < temp) {
					temp = el.respT;
			}
		}
		return temp;
	}

	private List<TacticsResultCandidate> getSolution(DSEIndividual i) {
		// check that performance is optimised
		if (performance != null
				&& i.getObjectives().getResultDecoratorFor(this.performance) != null) {

			ResultDecoratorRepository resultRepo = i.getObjectives().getResultDecoratorFor(this.performance);
			
			//logger.info("---------------------------------------------------------------------");
			//logger.info("System response time: " + i.getObjectives().get(performance).getDouble());
			//logger.info("---------------------------------------------------------------------");

			// AM: response time of SEFFs
			List<ServiceResult> serviceResultList = resultRepo.getServiceResult_ResultDecoratorRepository();
			
			// AM: get all AllocationDegrees, which together define where components may be allocated to
			List<DegreeOfFreedomInstance> dofList = i.getProblem().getDegreesOfFreedom();
			List<AllocationDegree> allocationDegreeList = new ArrayList<AllocationDegree>(dofList.size() / 3);
			for (DegreeOfFreedomInstance degreeOfFreedomInstance : dofList) {
				if (degreeOfFreedomInstance instanceof AllocationDegree){
					allocationDegreeList.add((AllocationDegree)degreeOfFreedomInstance);
				}
			}
			
			//example START
			AllocationDegree exampleDegree = allocationDegreeList.get(0);
			
			// the component's allocation context:
			AllocationContext exampleAllocationContext = (AllocationContext)exampleDegree.getPrimaryChanged();
			
			// the servers that the component may be allocation to:
			List<EObject> serversAsEObjects= exampleDegree.getClassDesignOptions();
			List<ResourceContainer> allowedContainers = new ArrayList<ResourceContainer>(serversAsEObjects.size());
			for (EObject servers : serversAsEObjects) {
				allowedContainers.add((ResourceContainer) servers);
			}
			
			// allowedContainers now contains all servers that the component may be allocated to. 
			// example END
			

			//@author catia: the list of SEFFs is stored in the ServiceInfo data structure
			List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>(serviceResultList.size());
				
			//@author catia: RT user requirement for all services is currently set to 0.001, TH user requirement for all services is currently set to 10.0 
			
			for (ServiceResult serviceResult : serviceResultList) {

				serviceInfoList.add(new ServiceInfo(serviceResult.getServiceEffectSpecification_ServiceResult().getDescribedService__SEFF().getEntityName(),
						serviceResult.getServiceEffectSpecification_ServiceResult().getBasicComponent_ServiceEffectSpecification().getEntityName(), 
						0.001, serviceResult.getMeanResponseTime(), 10.0, serviceResult.getThroughput(), Math.abs(10.0 - serviceResult.getThroughput()), 0.0));
			}
			
			

			//@author catia: the list of services is printed when the frequency is set (according to the usage model)

			// select the results of active resources (CPU, HDD, ...), and passive resources
			// not network yet.
			List<UtilisationResult> allUtilResults = resultRepo.getUtilisationResults_ResultDecoratorRepository();
									
			// List to contain all active resource results
			List<ProcessingResourceSpecificationResult> utilResults = new ArrayList<ProcessingResourceSpecificationResult>(allUtilResults.size());
			
			// list to contain all passive resource results
			List<PassiveResourceResult> passiveResourceUtilResults = new ArrayList<PassiveResourceResult>(5);
			
			//iterate through utilisation results and add them to the right list.
			for (UtilisationResult anyUtilResult : allUtilResults) {
				if (anyUtilResult instanceof ProcessingResourceSpecificationResult) {
					utilResults.add((ProcessingResourceSpecificationResult) anyUtilResult);
				} else if (anyUtilResult instanceof PassiveResourceResult ){
					passiveResourceUtilResults.add((PassiveResourceResult)anyUtilResult);
					((PassiveResourceResult)anyUtilResult).getAverageQueueLength();
					((PassiveResourceResult)anyUtilResult).getAverageWaitTime();
				}
			}

			// util results can be network util (not yet filled with values) or active resource utils

			//@author catia: the list of active resources is stored in the ActiveResInfo data structure
			List<ActiveResInfo> activeResInfoList = new ArrayList<ActiveResInfo>(utilResults.size());

			for (UtilisationResult utilisationResult : utilResults) {
				if (utilisationResult instanceof ProcessingResourceSpecificationResult) {
					ProcessingResourceSpecificationResult activeProcUtilResult = (ProcessingResourceSpecificationResult) utilisationResult;
					// retrieve the processor for which this is the result
					ProcessingResourceSpecification resource = activeProcUtilResult.getProcessingResourceSpecification_ProcessingResourceSpecificationResult();
					// You can retrieve the utilisation value
					// double util = activeProcUtilResult.getResourceUtilisation();
					// double averageQueueLength = activeProcUtilResult.getAverageQueueLength();
					// does not work with the LQN solver, and is not tested yet for SimuCom.
					// int maxQueueLength = activeProcUtilResult.getMaxQueueLength();

					// AM: added queue length and scheduling here
					activeResInfoList.add(new ActiveResInfo(resource.getResourceContainer_ProcessingResourceSpecification(),
									resource.getActiveResourceType_ActiveResourceSpecification(),
									activeProcUtilResult.getResourceUtilisation(),
									activeProcUtilResult.getAverageQueueLength(), resource.getSchedulingPolicy().getId(), 0.0));

				} 
				// Other possible results are for network:
				// LinkingResourceResults or for the whole resource container:
				// ResourceContainerResult, both are not yet filled with values.
			}
			
			logger.info("List of Active Resources: ");
			
			for (ActiveResInfo el : activeResInfoList) {
				el.print();
			}
			
			logger.info("---------------------------------------------------------------------");
			logger.info("Max utilised hardware resources: ");
			
			//@author catia: select the active resource maximum utilised
			logger.info("Max utilised active resource: ");
			ActiveResInfo maxUtilised = new ActiveResInfo(activeResInfoList.get(getMaxUtilisedActiveRes(activeResInfoList)));
			maxUtilised.print();
			
			//@author catia: select the cpu maximum utilised
			logger.info("Max utilised cpu resource: ");
			ActiveResInfo maxUtilisedCpu = new ActiveResInfo(activeResInfoList.get(getMaxUtilisedCpu(activeResInfoList)));
			maxUtilisedCpu.print();

			//@author catia: select the hdd maximum utilised
			logger.info("Max utilised hdd resource: ");
			ActiveResInfo maxUtilisedHdd = new ActiveResInfo(activeResInfoList.get(getMaxUtilisedHdd(activeResInfoList)));
			maxUtilisedHdd.print();
			
			logger.info("---------------------------------------------------------------------");

			// results for the services
			ComputedAggregatedUsage computedUsage = i.getObjectives().getComputedAggregatedUsageFor(this.performance);
			List<ServiceExecutionContext> serviceContexts = computedUsage.getServiceExecutionContexts_ComputedAggregatedUsage();

			//@author catia: store the components and their resource demands according to the usage model
			List<CompInfoResDemand> listCompIDs = new ArrayList<CompInfoResDemand>(serviceContexts.size());

			for (ServiceExecutionContext serviceExecutionContext : serviceContexts) {

				// the global frequency of calling this service if its usage
				// scenario is called once.
				// Note that there may be several ServiceExecutionContext for
				// one service in this list because
				// there is up to one ServiceExecutionContext for each
				// AssemblyContext (= component instance)
				// and each UsageScenario.
				// We cannot combine the frequencies of
				// usage scenarios on the dependency solver level for closed
				// workloads, because the throughput is depending
				// on the performance prediction.

				UsageScenario usageScenario = serviceExecutionContext.getUsageScenario_ServiceExecutionContext();
				
				AllocationContext allocationContext = serviceExecutionContext.getAllocationContext_ServiceExecutionContext();

				// AM: this is the execution probability for a SEFF (see above,
				// for one execution of the usage scenario!)
				double frequency = serviceExecutionContext
						.getGlobalExecutionFrequency();
				
				//@author catia: store the current basic component the "serviceExecutionContext" refers to.
				BasicComponent currentBasicComp = serviceExecutionContext.getDescribedSEFF_ServiceExecutionContext().getBasicComponent_ServiceEffectSpecification();

				//@author catia: store the current allocation context the "serviceExecutionContext" refers to.
				AllocationContext currentCompAllCont = serviceExecutionContext.getAllocationContext_ServiceExecutionContext();

				if (!compOccurrence(listCompIDs, currentCompAllCont)) {
					listCompIDs.add(new CompInfoResDemand(currentBasicComp, currentCompAllCont, 
							allocationContext.getResourceContainer_AllocationContext(),	0.0, 0.0));
				}

				//logger.info("TEST seff " + serviceExecutionContext.getDescribedSEFF_ServiceExecutionContext().getDescribedService__SEFF().getEntityName() + " frequency: " + frequency);
				
				String seffName = serviceExecutionContext.getDescribedSEFF_ServiceExecutionContext().getDescribedService__SEFF().getEntityName();
				
				//@author catia: update the frequency of the seff - to be checked
				updateFrequency (serviceInfoList, seffName, currentBasicComp.getEntityName(), frequency );
				
				 logger.info(" ");
				 logger.info("Service "+serviceExecutionContext.getDescribedSEFF_ServiceExecutionContext().getDescribedService__SEFF().getEntityName()
				 + " of component " +
				 serviceExecutionContext.getDescribedSEFF_ServiceExecutionContext().getBasicComponent_ServiceEffectSpecification().getEntityName()
				 + " in allocation context "+
				 allocationContext.getEntityName()
				 + " on server "+
				 allocationContext.getResourceContainer_AllocationContext().getEntityName()
				 + " has frequency "+frequency
				 + " in usage scenario "+usageScenario.getEntityName());
				// + " The resource demands are the following: ");

				// the weighted average resource demands per resource type as a list
				List<AggregatedResourceDemand> aggregatedResourceDemandList = serviceExecutionContext
						.getAggregatedResourceDemands_ServiceExecutionContext();
				for (AggregatedResourceDemand aggregatedResourceDemand : aggregatedResourceDemandList) {
					// the resource type of this resource demand
					ResourceType resourceType = aggregatedResourceDemand
							.getResourceType_AggregatedResourceDemand();

					// the weighted average resource demand for this resource type
					double demand = aggregatedResourceDemand
							.getAggregatedResourceDemand();

					// logger.info("Demand "+demand+" on the "+resourceType.getEntityName());

					// @author catia: if the "resourceType" is a CPU then increment computation demand
					if (resourceType.getEntityName().equals("CPU")) {
						incrementComputation(listCompIDs, currentCompAllCont, demand);
					}
					// @author catia: if the "resourceType" is a HDD then increment storage demand
					if (resourceType.getEntityName().equals("HDD")) {
						incrementStorage(listCompIDs, currentCompAllCont, demand);
					}
				}

				// logger.info("The service sends the following messages: ");
				// the message information
				List<AggregatedCommunication> communicationInfoList = serviceExecutionContext
						.getSentAggregatedCommunications_ServiceExecutionContext();
				// The list contains one AggregatedCommunication per
				// communication betwen two ServiceExcecutionContexts.
				for (AggregatedCommunication aggregatedCommunication : communicationInfoList) {

					// the message frequency is relative to the probability of
					// the caller being executed
					// That means, if the caller has just a probability of 0.5
					// of being executed in a usage scenario, and
					// the relativeMessageFrequency here has a frequency of 0.3,
					// then the overall probability
					// that this message is sent in this UsageScenario is 0.15.
					//double relativeMessageFrequency = aggregatedCommunication
						//	.getAverageMessageFrequency();

					// the communication link resource that is used. Is null if
					// this is a local call.
					CommunicationLinkResourceSpecification link = aggregatedCommunication
							.getUsedCommunicationLinkResourceSpecification_AggregatedCommunication();

					// not yet implemented
					//double averageMessageSize = aggregatedCommunication
						//	.getAverageMessageSize();

					// logger.info(relativeMessageFrequency
					// +
					// " messages to service "+aggregatedCommunication.getCommunicationPartner_AggregatedCommunication().getDescribedSEFF_ServiceExecutionContext().getDescribedService__SEFF().getEntityName()
					// + " of component " +
					// aggregatedCommunication.getCommunicationPartner_AggregatedCommunication().getDescribedSEFF_ServiceExecutionContext().getBasicComponent_ServiceEffectSpecification().getEntityName()
					// + " in allocation context "+
					// aggregatedCommunication.getCommunicationPartner_AggregatedCommunication().getAllocationContext_ServiceExecutionContext().getEntityName()
					// + ". The average message size is "+averageMessageSize);
					if (link != null) {
						// logger.info("The communication is remote over link "+link.getId()
						// +
						// " of type "+link.getCommunicationLinkResourceType_CommunicationLinkResourceSpecification().getEntityName());
					}
				}

			}
			
			logger.info("List of all SEFFs with the frequency value: ");
			for (ServiceInfo el : serviceInfoList) {
				el.print();
			}
			logger.info("---------------------------------------------------------------------");

			List<TacticsResultCandidate> listPairs = new ArrayList<TacticsResultCandidate>();

			// AM: Example how to reach the initial PCM model
			PCMInstance pcm = Opt4JStarter.getProblem().getInitialInstance();

			// AM: Example for getting a passive resource capacity. Note that
			// the passive resource belongs to a component, not to a service
			List<Repository> repositoryList = pcm.getRepositories();

			//@author catia: the list of passive resources is stored in the PassiveResInfo data structure
			List<PassiveResInfo> passiveResInfoList = new ArrayList<PassiveResInfo>(repositoryList.size());

			for (PassiveResourceResult passiveResourceResult : passiveResourceUtilResults) {

				PassiveResource passiveResource = passiveResourceResult.getPassiveResource_PassiveResourceResult();
				double util = passiveResourceResult.getResourceUtilisation();
				BasicComponent basicComponent = passiveResource.getBasicComponent_PassiveResource();

				//@author catia: (1) queue length, (2) waiting and (3) holding time of passive resources are currently set to pre-defined values
				passiveResInfoList.add(new PassiveResInfo(passiveResource, basicComponent, Integer.parseInt(passiveResource
						.getCapacity_PassiveResource().getSpecification()),
						passiveResourceResult.getResourceUtilisation(),
						passiveResourceResult.getAverageQueueLength(), 
						passiveResourceResult.getAverageWaitTime(),
						passiveResourceResult.getAverageHoldingTime(), 
						0.0));
			}

						
			logger.info("List of Used Passive Resources: ");
			for (PassiveResInfo el : passiveResInfoList) {
				el.print();
			}
			logger.info("---------------------------------------------------------------------");
						
			//@author catia: select the critical passive resources
			List<PassiveResInfo> criticalPassiveResInfoList = getCriticalPassiveRes(passiveResInfoList);
							
			if(criticalPassiveResInfoList.size()!= 0){
					for (PassiveResInfo criticalPassiveResInfo: criticalPassiveResInfoList){
									
						//@author catia: detection of the antipattern OLB - the rules are verified for each critical passive resource 
						if (olb(serviceInfoList, criticalPassiveResInfo)) {
							
							//@author catia: solution of the antipattern OLB - "IncreaseCapacity" action
							//criticalPassiveResInfo.pr.getCapacity_PassiveResource().setSpecification("5");
							//Note that the capacity is increased by adding 5 units to the current one
							
							if (this.rankingMethod == AntipatternsRankingMethod.NO_RANKING){
								
								TacticsResultCandidate candidate = createIncreasedCapacityCandidate(i,criticalPassiveResInfo.pr, criticalPassiveResInfo.capacity + 5);
								listPairs.add(candidate);
								
							}
							
							if (this.rankingMethod == AntipatternsRankingMethod.BASIC_RANKING){
								if (criticalPassiveResInfo.rank > new Ranks().rankMinPassiveRes) {
									TacticsResultCandidate candidate = createIncreasedCapacityCandidate(i,criticalPassiveResInfo.pr, criticalPassiveResInfo.capacity + 5);
									listPairs.add(candidate);
								}
							}
							
							if (this.rankingMethod == AntipatternsRankingMethod.SEMANTIC_FACTOR){
								//@author catia: semantic factor for the antipattern OLB: |Utilization(resourceContainer) - Utilization(passive resource)| 
								
								double olbSemanticFactor= 0.0;
								
								double utilResContainer= 0.0;
								
								double utilPassiveRes= criticalPassiveResInfo.utilisation;
								
								if (componentDeployNode(listCompIDs, criticalPassiveResInfo.bc)!=null){
									ResourceContainer rc = componentDeployNode(listCompIDs, criticalPassiveResInfo.bc);
									for (ActiveResInfo activeResInfo: activeResInfoList){
									if (activeResInfo.rc == rc){
										utilResContainer = activeResInfo.utilisation;
										}
									}
								}
								
								olbSemanticFactor = Math.abs(utilResContainer - utilPassiveRes);
										
								if ((criticalPassiveResInfo.rank + olbSemanticFactor) > new Ranks().rankMinCpu) {
								TacticsResultCandidate candidate = createIncreasedCapacityCandidate(i,criticalPassiveResInfo.pr, criticalPassiveResInfo.capacity + 5);
								listPairs.add(candidate);
								}
							}
							
							logger.info("The capacity of the passive resource " + criticalPassiveResInfo.pr.getEntityName() + " must be increased");
										
							}
					}
			}

			//@author catia: print the resource demand (cpu, hdd) of the components involved in services specified in the usage model
			logger.info("---------------------------------------------------------------------");
			logger.info("List of components involved in services specified in the usage model: ");
			for (CompInfoResDemand el : listCompIDs) {
				el.print();
			}

			//@author catia: list of components deployed on the max utilised CPU
			List<CompInfoResDemand> depCompCpu = deployedComponents(listCompIDs, maxUtilisedCpu.rc);
			
			//@author catia: list of components deployed on the max utilised HDD
			List<CompInfoResDemand> depCompHdd = deployedComponents(listCompIDs, maxUtilisedHdd.rc);
			
			
			//@author catia: list of components deployed on the max utilised active resource
			List<CompInfoResDemand> depComp = deployedComponents(listCompIDs, maxUtilised.rc);
			
			logger.info("---------------------------------------------------------------------");
			logger.info("List of seffs provided in the max utilised Active Resource : " + maxUtilised.rc.getEntityName());

			//@author catia: list of seffs executed on the max utilised active resource
			List<ServiceInfo> seffsOfMaxUtilised = new ArrayList<ServiceInfo>(0);
			
			for (CompInfoResDemand el: depComp){
				//@author catia: list of seffs provided by a basic component
				List<ServiceInfo> seffsTempList = getSeffsOfComp(serviceInfoList, el.bc.getEntityName());
				
				for (ServiceInfo elseff: seffsTempList){
					seffsOfMaxUtilised.add(elseff);
				}
			}
			
			for (ServiceInfo el : seffsOfMaxUtilised) {
				el.print();
			}
			logger.info("---------------------------------------------------------------------");

			//@author catia: detection of the antipattern EP - the rules are verified for the active resorce maximum utilised (to be checked)  
			if (ep(maxUtilised, seffsOfMaxUtilised)) {
				
				// AM: example how to change the scheduling policy. Values are
				// SchedulingPolicy.FCFS for first come first serve
				// SchedulingPolicy.PROCESSOR_SHARING for processor sharing
				// resource.setSchedulingPolicy(SchedulingPolicy.PROCESSOR_SHARING);
				
				// @author catia: solution of the antipattern EP - "UnblockExecution" action
				//maxUtilised.setSchedulingPolicy(SchedulingPolicy.PROCESSOR_SHARING);
				
				if (this.rankingMethod == AntipatternsRankingMethod.NO_RANKING){
					listPairs.add(createUpdatedSchedulingCandidate(i,maxUtilised,true));
					logger.info("The scheduling policy of the active resource " + maxUtilised.rc.getEntityName() + " must be changed");	
				}
				
				if (this.rankingMethod == AntipatternsRankingMethod.BASIC_RANKING){
					
					for (ServiceInfo s: seffsOfMaxUtilised){
					if (s.rank > new Ranks().rankMinServiceTH) {
						listPairs.add(createUpdatedSchedulingCandidate(i,maxUtilised,true));
						logger.info("The scheduling policy of the active resource " + maxUtilised.rc.getEntityName() + " must be changed");		
					}
					}
					}
				
				if (this.rankingMethod == AntipatternsRankingMethod.SEMANTIC_FACTOR){
					//@author catia: semantic factor for the antipattern EP: (|TH(seffA) - TH(seffB)|) / max{TH(seffA), TH(seffB)} 
					
					double epSemanticFactor= 0.0;
					
					ServiceInfo seffA = getOverUsedSeff(seffsOfMaxUtilised);
					ServiceInfo seffB = getUnderUsedSeff(seffsOfMaxUtilised);
					
					epSemanticFactor = (Math.abs(seffA.throughput - seffB.throughput)) / seffA.throughput;
					
					for (ServiceInfo s: seffsOfMaxUtilised){
							
					if ((s.rank + epSemanticFactor) > new Ranks().rankMinServiceTH) {
						listPairs.add(createUpdatedSchedulingCandidate(i,maxUtilised,true));
						logger.info("The scheduling policy of the active resource " + maxUtilised.rc.getEntityName() + " must be changed");
					}
					}
					}
				
				//listPairs.add(createUpdatedSchedulingCandidate(i,maxUtilised,SchedulingPolicy.DELAY));
				//listPairs.add(createUpdatedSchedulingCandidate(i,maxUtilised,SchedulingPolicy.EXACT));
			}
			
			logger.info("---------------------------------------------------------------------");
			// @author catia: print the most critical components
			logger.info("List of the most critical components: ");
			
			if (depCompCpu.size() !=0){
			CompInfoResDemand mostCriticalCpu =  depCompCpu.get(getCompMaxCPUdemand(depCompCpu));
			logger.info("Most CPU critical");
			mostCriticalCpu.print();
			}
			
			if(depCompHdd.size() !=0){
				
			CompInfoResDemand mostCriticalHdd =  depCompHdd.get(getCompMaxHDDdemand(depCompHdd));
			logger.info("Most HDD critical");
			mostCriticalHdd.print();
			}
			
			logger.info("---------------------------------------------------------------------");

			//@author catia: detection of the antipattern CPS
			if (cps(activeResInfoList)) {
				
				//@author catia: solution of the antipattern CPS (Concurrent Processing Systems)
				
				List<ActiveResInfo> getOverUsedCPUList = getOverUsedCpu(activeResInfoList);
				List<ActiveResInfo> getOverUsedHDDList = getOverUsedHDD(activeResInfoList);

				List<ActiveResInfo> getUnderUsedCPUList = getUnderUsedCpu(activeResInfoList);
				List<ActiveResInfo> getUnderUsedHDDList = getUnderUsedHDD(activeResInfoList);

				// @author catia: solution of the antipattern CPS - "Redeploy Action" with feature F1 : check the computation resource demand of the PCM components
				// It means that the most cpu critical component is re-deployed on all under used cpu(s) available in the system, each redeployment action provides a new candidate (i.e. a pair p)
				// Es: Redeploy component Cx in one of the following servers: S1, S2
				// Two candidates are evaluated: the first one in which Cx is redeployed on S1, and the second one in which Cx is redeployed on S2

				//if ((getUnderUsedCPUList.size() != 0) && (depCompCpu.size() !=0)) {
				if (getUnderUsedCPUList.size() != 0) {
					if (getOverUsedCPUList.size() != 0) {	
					
						for (ActiveResInfo elOver : getOverUsedCPUList) {			
							List<CompInfoResDemand> compToBeRedeployed = deployedComponents(listCompIDs, elOver.rc);					
							if(compToBeRedeployed.size() !=0){					
								logger.info("Redeploy component "
										+ compToBeRedeployed.get(getCompMaxCPUdemand(compToBeRedeployed)).bc.getEntityName()
										+ " in the following servers: ");					
								for (ActiveResInfo elUnder : getUnderUsedCPUList) {
									
									logger.info(elUnder.rc.getEntityName());
									Pair<CompInfoResDemand, ResourceContainer> p = new Pair<CompInfoResDemand, ResourceContainer>(
									compToBeRedeployed.get(getCompMaxCPUdemand(compToBeRedeployed)), elUnder.rc);
									
									if (this.rankingMethod == AntipatternsRankingMethod.NO_RANKING){
										listPairs.add(createCPSCandidate(i, p));
									}
									//@author catia: RANKING STEP WITHOUT SEMANTIC FACTOR
									if (this.rankingMethod == AntipatternsRankingMethod.BASIC_RANKING){
										
										if (elUnder.rank > new Ranks().rankMinCpu) {
											listPairs.add(createCPSCandidate(i, p));	
										}
										
									}
									
									//@author catia: RANKING STEP WITH SEMANTIC FACTOR = (element.utilisation - el.utilisation)									if (this.rankingMethod == AntipatternsRankingMethod.SEMANTIC_FACTOR){
										if ((elUnder.rank + (elOver.utilisation - elUnder.utilisation)) > new Ranks().rankMinCpu) {
											listPairs.add(createCPSCandidate(i, p));
									}
								}
							}
						
						}
					}
					
				}

				// @author catia: solution of the antipattern CPS - "Redeploy Action" with feature F1 : check the storage resource demand of the PCM components
				// It means that the most hdd critical component is re-deployed on all under used hdd(s) available in the system, each redeployment action provides a new candidate (i.e. a pair p)
				//if ((getUnderUsedHDDList.size() != 0) && (depCompHdd.size() !=0)) {
				
				if (getUnderUsedHDDList.size() != 0) {
					if (getOverUsedHDDList.size() != 0) {
						
						for (ActiveResInfo elOver : getOverUsedHDDList) {			
							List<CompInfoResDemand> compToBeRedeployed = deployedComponents(listCompIDs, elOver.rc);					
							if(compToBeRedeployed.size() !=0){					
								logger.info("Redeploy component "
										+ compToBeRedeployed.get(getCompMaxHDDdemand(compToBeRedeployed)).bc.getEntityName()
										+ " in the following servers: ");					
								for (ActiveResInfo elUnder : getUnderUsedHDDList) {
									
									logger.info(elUnder.rc.getEntityName());
									
									Pair<CompInfoResDemand, ResourceContainer> p = new Pair<CompInfoResDemand, ResourceContainer>(
									compToBeRedeployed.get(getCompMaxHDDdemand(compToBeRedeployed)), elUnder.rc);
									
									if (this.rankingMethod == AntipatternsRankingMethod.NO_RANKING){
										TacticsResultCandidate result = createCPSCandidate(i, p);
										if (result != null){
											listPairs.add(result);
										}
									}
									//@author catia: RANKING STEP WITHOUT SEMANTIC FACTOR
									if (this.rankingMethod == AntipatternsRankingMethod.BASIC_RANKING){
										
										if (elUnder.rank > new Ranks().rankMinHdd) {
											TacticsResultCandidate result = createCPSCandidate(i, p);
											if (result != null){
												listPairs.add(result);
											}	
										}
										
									}
									
									//@author catia: RANKING STEP WITH SEMANTIC FACTOR = (element.utilisation - el.utilisation)									if (this.rankingMethod == AntipatternsRankingMethod.SEMANTIC_FACTOR){
										if ((elUnder.rank + (elOver.utilisation - elUnder.utilisation)) > new Ranks().rankMinCpu) {
											TacticsResultCandidate result = createCPSCandidate(i, p);
											if (result != null){
												listPairs.add(result);
											}
									}
								}
							}
						
						}
					}
				}

			}
			logger.info("---------------------------------------------------------------------");
			return listPairs;
		} else {
			logger
					.warn("No performance objective or no result decorator for it found. Skipping "
							+ this.getClass().getName());
		}
		return null;
	}


	@Override
	public List<TacticsResultCandidate> getHeuristicCandidates(DSEIndividual i,
			UtilisationResultCacheAndHelper resultsCache) {

		if (performance != null) {
			List<TacticsResultCandidate> resultsTRC = getSolution(i); 

			if (resultsTRC != null){
				return resultsTRC;
			}
		}
		return Collections.emptyList();
		
	}

	private TacticsResultCandidate createCPSCandidate(DSEIndividual i,
			Pair<CompInfoResDemand, ResourceContainer> result) {
		TacticsResultCandidate candidate = individualFactory
				.buildCandidate(copy.copy(i.getGenotype()), i, this, "Realloc for CPS");

		// apply change
		for (Choice choice : candidate.getGenotype()) {
			if (choice instanceof ClassChoice) {
				ClassChoice classChoice = (ClassChoice) choice;
				if (classChoice.getDegreeOfFreedomInstance() instanceof AllocationDegree) {

					if (EMFHelper.checkIdentity(
							classChoice.getDegreeOfFreedomInstance().getPrimaryChanged(), 
							result.getFirst().ac)) {

						// if (ClassChoice.getDegreeOfFreedomInstance().g)

						classChoice.setChosenValue(EMFHelper.retrieveEntityByID(
								((ClassDegree)classChoice.getDegreeOfFreedomInstance()).getClassDesignOptions(), 
								result.getSecond()));
						
						if (classChoice.getChosenValue() == null){
							logger.error("Antipattern solution chose a server for reallocation that is not a valid server to deploy this component to. Ignoring this candidate.");
							return null;
						}

						// set weight to one for now, maybe later find a better value.
						candidate.setCandidateWeight(1);
						increaseCounterOfGeneratedCandidates();
						
						logger.info("Applied CPS solution");
						return candidate;
						
					}
				}
			}
		}
		throw new RuntimeException("Changing the allocation of "+result.getFirst().ac.getEntityName()+" to server "+result.getSecond().getEntityName()+" is not allowed with the current designdecision model.");
	}
	
	private TacticsResultCandidate createIncreasedCapacityCandidate(
			DSEIndividual i, PassiveResource pr, int newCapacity) {
		TacticsResultCandidate candidate = individualFactory
				.buildCandidate(copy.copy(i.getGenotype()), i, this, "Increased Capacity");

		// apply change
		for (Choice choice : candidate.getGenotype()) {
			if (choice instanceof DiscreteRangeChoice) {
				DiscreteRangeChoice schedChoice = (DiscreteRangeChoice) choice;
				if (schedChoice.getDegreeOfFreedomInstance() instanceof CapacityDegree) {

					if (EMFHelper.checkIdentity(schedChoice
							.getDegreeOfFreedomInstance().getPrimaryChanged(), pr)) {

						// if (ClassChoice.getDegreeOfFreedomInstance().g)

						schedChoice.setChosenValue(newCapacity);

						// set weight to one for now, maybe later find a better value.
						candidate.setCandidateWeight(1);
						increaseCounterOfGeneratedCandidates();
						
						logger.info("Increased capacity of "+pr.getEntityName()+" to "+newCapacity);
						return candidate;
						
					}
				}
			}
		}
		throw new RuntimeException("Increasing the capacity of passive resource "+pr.getEntityName()+" is not allowed with the current designdecision model.");
	}
	

	private TacticsResultCandidate createUpdatedSchedulingCandidate(
			DSEIndividual i, ActiveResInfo resourceToChange,
			boolean useProcessorSharing) {
		TacticsResultCandidate candidate = individualFactory.buildCandidate(
				copy.copy(i.getGenotype()), i, this, "Updated Scheduling");

		// apply change
		for (Choice choice : candidate.getGenotype()) {
			if (choice instanceof ClassChoice) {
				ClassChoice classChoice = (ClassChoice) choice;
				if (classChoice.getDegreeOfFreedomInstance() instanceof SchedulingPolicyDegree) {

					SchedulingPolicyDegree schedDegree = (SchedulingPolicyDegree)classChoice.getDegreeOfFreedomInstance();
					if (EMFHelper.checkIdentity(schedDegree.getPrimaryChanged(),resourceToChange.rc)
							&& EMFHelper.checkIdentity(schedDegree.getProcessingresourcetype(),resourceToChange.type)) {

						
						SchedulingPolicy selectedStrategy = null;
						List<EObject> options = schedDegree.getClassDesignOptions();
						for (EObject eObject : options) {
							if (eObject instanceof SchedulingPolicy){
								SchedulingPolicy policy = (SchedulingPolicy)eObject;
								if ((!useProcessorSharing && policy.getId().equals("FCFS"))
									|| (useProcessorSharing && policy.getId().equals("ProcessorSharing"))){
									selectedStrategy = policy;
									break;
								}
							}
						}
						classChoice.setChosenValue(selectedStrategy);

						// set weight to one for now, maybe later find a better
						// value.
						candidate.setCandidateWeight(1);
						increaseCounterOfGeneratedCandidates();

						logger.info("Changed scheduling policy of "+resourceToChange.type.getEntityName()+" of "
								+ resourceToChange.rc.getEntityName() + " to " + useProcessorSharing);
						return candidate;

					}
				}
			}
		}
		throw new RuntimeException(
				"Changing the scheduling of "+resourceToChange.type.getEntityName()+" of "
					+ resourceToChange.rc.getEntityName()+ " is not allowed with the current designdecision model.");

	}



}