package de.uka.ipd.sdq.pcmsupport.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;

import com.google.inject.Inject;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;

import de.uka.ipd.sdq.pcmsupport.PCMPhenotype;
import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.pcmsupport.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcmsupport.helper.ResultsWriter;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.impl.ADSEProblemImpl;
import genericdesigndecision.universalDoF.SpecificDoF;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSE Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DSEProblemImpl extends ADSEProblemImpl<PCMPhenotype> implements DSEProblem {

	private final designdecisionFactory designDecisionFactory;
	private final specificFactory specificDesignDecisionFactory;
	private final PCMInstance pcmInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param pcmInstance
	 * @throws CoreException
	 * @generated NOT
	 */
	@Inject
	public DSEProblemImpl(final PCMWorkflowConfiguration dseConfig, final PCMResourceSetPartition pcmPartition)
			throws CoreException {

		this.dseConfig = dseConfig;
		this.emfPartition = pcmPartition;
		this.designDecisionFactory = designdecisionFactory.eINSTANCE;
		this.specificDesignDecisionFactory = specificFactory.eINSTANCE;
		this.associatedMetamodel = designDecisionFactory.createMetamodelDescription();

		pcmInstance = MetamodelDescription.eINSTANCE.transformEMFtoPCM(pcmPartition);

		if (newProblem) {
			initialiseProblem();
		} else {
			//Alternative Component has to be called to create the mapping for all AssemblyContexts and their roles,
			//in order to be able to exchange implementations later. The design decisions calculated here are not kept, only
			//the mapping inside AlternativeComponent.getInstance()
			AlternativeComponent.getInstance().generateDesignDecisions(pcmInstance);
			problem = loadProblem();
			this.initialGenotypeList = determineInitialGenotype(problem);

		}

		//TODO: mapping of design decisions to bounds.
		/*
		 * Meta model design decisions?? Each design decision would know its
		 * bounds and the annotated element or more specific the annotated
		 * property of this element that is exactly the value range than the
		 * bound of the decision.
		 *
		 * But what about the genotype? With a ordered list
		 * of design decisions, I can map the genotype entry to a design
		 * decisions. Better group in integer and double, then. -> require CompositeGenotype
		 *
		 * Also meta-model the genotype as a choice within the range.
		 */
	}

	@Override
	public ResultsWriter getWriter(String filename) {
		return new ResultsWriter(filename, this.pcmInstance);
	}
	
	@Override
	protected EPackage getEPackage() {
		return designdecisionPackage.eINSTANCE;
	}
	
	protected ResourceSet getResourceSet() {
		return this.pcmInstance.getAllocation().eResource().getResourceSet();
	}

	@Override
	protected void instantiateDegrees() {
		List<ADegreeOfFreedom> dds = this.problem.getDofInstances();

		for (SpecificDoF d : dseConfig.getSelectedSpecificDoFs()) {
			switch (d.getName()) {
			case MetamodelDescription.PCM_ALLOCATION_DOF:
				determineAllocationDecisions(dds);
				break;
			case MetamodelDescription.PCM_CONTINUOUS_PROCESSING_RATE_DOF:
				determineProcessingRateDecisions(dds);
				break;
			case MetamodelDescription.PCM_CAPACITY_DOF:
				determineCapacityDecisions(dds);
				break;
			case MetamodelDescription.PCM_ASSEMBLED_COMPONENT_DOF:
				determineAssembledComponentsDecisions(dds);
				break;
			default:
				throw new IllegalArgumentException("PCM-specific degree of freedom could not be found");
			}
		}
	}

	/**
	 * Determine Capacity options based on {@link Repository}.
	 * Thus, this may detect {@link PassiveResource}s of components that are not used
	 * in the system. These need to be deleted manually.
	 *
	 * Otherwise, I would have to descend in all composed structures to find all {@link BasicComponent}s.
	 * @param dds
	 */
	private void determineCapacityDecisions(final List<ADegreeOfFreedom> dds) {

		final List<Repository> repositories = this.pcmInstance.getRepositories();
		for (final Repository repository : repositories) {
			final List<RepositoryComponent> components = repository.getComponents__Repository();
			for (final RepositoryComponent repositoryComponent : components) {
				if (repositoryComponent instanceof BasicComponent) {

					final BasicComponent basicComponent = (BasicComponent) repositoryComponent;
					final List<PassiveResource> passiveResources = basicComponent.getPassiveResource_BasicComponent();
					for (final PassiveResource passiveResource : passiveResources) {
						final CapacityDegree capacityDegree = this.specificDesignDecisionFactory.createCapacityDegree();
						capacityDegree.setPrimaryChanged(passiveResource);
						capacityDegree.setFrom(1);
						capacityDegree.setTo(Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));
						dds.add(capacityDegree);
					}
				}
			}
		}

	}

	/**
	 * XXX: This is not meta modelled and just a quick fix
	 *
	 */
	//	private void determineSOAPOrRMIDecisions(List<DesignDecision> dds, DesignDecisionGenotype genotype) {
	//
	//		Configuration connectorConfig = this.initialInstance.getConnectorConfig();
	//		FeatureConfig featureConfig = connectorConfig.getDefaultConfig();
	//
	//		ConnectorConfigDecision cd = this.designDecisionFactory.createConnectorConfigDecision();
	//		SoapOrRmi domain = this.designDecisionFactory.createSoapOrRmi();
	//
	//		cd.setDomain(domain);
	//		cd.setFeatureconfig(featureConfig);
	//
	//		dds.add(cd);
	//
	//		//0.0 stands for SOAP, 1.0 for RMI
	//		genotype.add(0.0);
	//
	//	}

	//TODO: change this to two visitors that either create the design decision and initial genotype or just initial genotype.
	private void determineAllocationDecisions(final List<ADegreeOfFreedom> dds) {
		final List<AllocationContext> acs = this.pcmInstance.getAllocation().getAllocationContexts_Allocation();
		final List<ResourceContainer> rcs = this.pcmInstance.getResourceEnvironment()
				.getResourceContainer_ResourceEnvironment();

		//each allocation context could be allocated on each container.
		for (final AllocationContext ac : acs) {
			final AllocationDegree ad = this.specificDesignDecisionFactory.createAllocationDegree();
			ad.setPrimaryChanged(ac);
			ad.getClassDesignOptions().addAll(rcs);
			dds.add(ad);
		}
	}

	private void determineAssembledComponentsDecisions(final List<ADegreeOfFreedom> dds) {
		final AlternativeComponent ac = AlternativeComponent.getInstance();
		final List<AssembledComponentDegree> decisions = ac.generateDesignDecisions(this.pcmInstance);

		for (final AssembledComponentDegree designDecision : decisions) {
			dds.add(designDecision);
		}
	}

	/**
	 * Creates {@link ContinuousProcessingRateDegree} decisions for each found processing resource.
	 *
	 * Also determines {@link SchedulingPolicyDegree}s.
	 *
	 * TODO: make configurable to also add {@link DiscreteProcessingRateDegree}s.
	 */
	private void determineProcessingRateDecisions(final List<ADegreeOfFreedom> dds) {
		final List<ResourceContainer> resourceContainers = this.pcmInstance.getResourceEnvironment()
				.getResourceContainer_ResourceEnvironment();
		for (final ResourceContainer resourceContainer : resourceContainers) {
			final List<ProcessingResourceSpecification> resources = resourceContainer
					.getActiveResourceSpecifications_ResourceContainer();
			for (final ProcessingResourceSpecification resource : resources) {

				//Create ContinuousProcessingRateDegree
				final ContinuousProcessingRateDegree decision = this.specificDesignDecisionFactory
						.createContinuousProcessingRateDegree();
				decision.setLowerBoundIncluded(false);
				final double currentRate = CostUtil.getInstance().getDoubleFromSpecification(
						resource.getProcessingRate_ProcessingResourceSpecification().getSpecification());
				//XXX initial assumption: the highest possible processingRate is 10 times the current one.
				decision.setTo(currentRate * 2.0);
				decision.setFrom(currentRate * 0.5);
				decision.setPrimaryChanged(resourceContainer);
				decision.setProcessingresourcetype(resource.getActiveResourceType_ActiveResourceSpecification());
				dds.add(decision);


				//Create SchedulingPolicyDegree (excluded here, not in default problem, can be modelled manually).
				/*SchedulingPolicyDegree schedulingDecision = this.designDecisionFactory.createSchedulingPolicyDegree();
				SchedulingPolicy currentPolicy = resource.getSchedulingPolicy();
				
				schedulingDecision.getDomainOfAllowedSchedulingPolicies().add(SchedulingPolicy.FCFS);
				schedulingDecision.getDomainOfAllowedSchedulingPolicies().add(SchedulingPolicy.PROCESSOR_SHARING);
				schedulingDecision.setPrimaryChanged(resourceContainer);
				schedulingDecision.setProcessingresourcetype(resource.getActiveResourceType_ActiveResourceSpecification());
				dds.add(schedulingDecision);
				
				SchedulingPolicyChoice schedulingChoice = this.designDecisionFactory.createSchedulingPolicyChoice();
				schedulingChoice.setDegreeOfFreedomInstance(schedulingDecision);
				schedulingChoice.setChosenValue(currentPolicy);
				
				genotype.add(schedulingChoice);*/

				;
			}
		}
	}

	@Override
	public PCMPhenotype decode(DesignDecisionGenotype genotype) {
		return MetamodelDescription.eINSTANCE.decode(this.pcmInstance, genotype);
	}

	@Override
	public PCMInstance getPcmInstance() {
		return this.pcmInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.DSE_PROBLEM;
	}

} //DSEProblemImpl
