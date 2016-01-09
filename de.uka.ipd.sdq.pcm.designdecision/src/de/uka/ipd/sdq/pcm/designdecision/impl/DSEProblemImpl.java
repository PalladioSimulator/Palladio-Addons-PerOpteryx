/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.helper.EMFHelper;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMPhenotype;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.designdecision.helper.ResultsWriter;
import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import genericdesigndecision.ClassChoice;
import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.impl.ADSEProblemImpl;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
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
public class DSEProblemImpl extends ADSEProblemImpl implements DSEProblem {

	private final designdecisionFactory designDecisionFactory;
	private final specificFactory specificDesignDecisionFactory;
	private final PCMInstance pcmInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DSEProblemImpl() {
		this.designDecisionFactory = null;
		this.specificDesignDecisionFactory = null;
		this.pcmInstance = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param pcmInstance
	 * @throws CoreException
	 * @generated NOT
	 */
	public DSEProblemImpl(final PCMWorkflowConfiguration dseConfig, final PCMResourceSetPartition pcmPartition)
			throws CoreException {

		this.dseConfig = dseConfig;
		this.designDecisionFactory = designdecisionFactoryImpl.init();
		this.specificDesignDecisionFactory = specificFactoryImpl.init();
		this.associatedMetamodel = designDecisionFactory.createMetamodelDescription();

		pcmInstance = ((MetamodelDescription) this.associatedMetamodel).transformEMFtoPCM(pcmPartition);

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
	protected DecisionSpace loadProblem(final String filename) throws CoreException {
		final ResourceSet pcmResourceSet = this.pcmInstance.getAllocation().eResource().getResourceSet();

		final EObject eproblem = EMFHelper.loadFromXMIFile(filename, pcmResourceSet, designdecisionPackage.eINSTANCE);
		if (!(eproblem instanceof DecisionSpace)) {
			throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0,
					"Cannot read design decision file " + filename + ". Please create a new one.", null));
		}
		final DecisionSpace problem = (DecisionSpace) eproblem;
		//Adjust references with the right loaded model objects in memory?

		// TODO try it without using switch first
		//final FixDesignDecisionReferenceSwitch visitor = new FixDesignDecisionReferenceSwitch(this.pcmInstance);
		//visitor.doSwitch(problem);

		EcoreUtil.resolveAll(eproblem);

		return problem;
	}

	@Override
	protected List<DesignDecisionGenotype> determineInitialGenotype(final DecisionSpace problem) {
		final DesignDecisionGenotype genotype = new DesignDecisionGenotype();

		for (final ADegreeOfFreedom dd : problem.getDofInstances()) {
			genotype.add(dd.determineInitialChoice());
		}

		final List<DesignDecisionGenotype> result = new ArrayList<DesignDecisionGenotype>();
		result.add(genotype);
		this.initialGenotype = genotype;
		return result;
	}

	/**
	 * Initialises the degrees of freedoms and at the same time determines the initial genotype.
	 */
	@Override
	protected void initialiseProblem() {
		this.problem = GenericdesigndecisionFactory.eINSTANCE.createDecisionSpace();
		final List<ADegreeOfFreedom> dds = this.problem.getDofInstances();

		//analyse PCM Instance and create design decisions
		//TODO: could this be possible with a M2M transformation?
		//First, only get design decisions for making resources faster.

		this.initialGenotypeList = new ArrayList<DesignDecisionGenotype>();
		final DesignDecisionGenotype initialCandidate = new DesignDecisionGenotype();
		determineProcessingRateDecisions(dds, initialCandidate);
		//find equivalent components
		determineAssembledComponentsDecisions(dds, initialCandidate);
		determineAllocationDecisions(dds, initialCandidate);
		//Quickfix: Add a Soap or RMI decision. This is not meta modelled.
		//determineSOAPOrRMIDecisions();
		determineCapacityDecisions(dds, initialCandidate);

		//TODO: Check if the initial genotype is actually a valid genotype?
		//(this may not be the case if the degrees of freedom have been reduced for the optimisation?)

		this.initialGenotypeList.add(initialCandidate);

	}

	/**
	 * Determine Capacity options based on {@link Repository}.
	 * Thus, this may detect {@link PassiveResource}s of components that are not used
	 * in the system. These need to be deleted manually.
	 *
	 * Otherwise, I would have to descend in all composed structures to find all {@link BasicComponent}s.
	 * @param dds
	 * @param initialCandidate
	 */
	private void determineCapacityDecisions(final List<ADegreeOfFreedom> dds, final DesignDecisionGenotype genotype) {

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
						capacityDegree.setTo(
								Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));
						dds.add(capacityDegree);

						final DiscreteRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE
								.createDiscreteRangeChoice();
						choice.setDofInstance(capacityDegree);
						choice.setChosenValue(
								Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));

						genotype.add(choice);
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
	private void determineAllocationDecisions(final List<ADegreeOfFreedom> dds, final DesignDecisionGenotype genotype) {
		final List<AllocationContext> acs = this.pcmInstance.getAllocation().getAllocationContexts_Allocation();
		final List<ResourceContainer> rcs = this.pcmInstance.getResourceEnvironment()
				.getResourceContainer_ResourceEnvironment();

		//each allocation context could be allocated on each container.
		for (final AllocationContext ac : acs) {
			final AllocationDegree ad = this.specificDesignDecisionFactory.createAllocationDegree();
			ad.setPrimaryChanged(ac);
			ad.getClassDesignOptions().addAll(rcs);
			dds.add(ad);

			final ClassChoice choice = GenericdesigndecisionFactory.eINSTANCE.createClassChoice();
			choice.setDofInstance(ad);
			choice.setChosenValue(ac.getResourceContainer_AllocationContext());

			genotype.add(choice);
		}
	}

	/**
	 * Be sure to add one design decision and one gene in the initial genotype at once. The index is important.
	 * @param genotypeIndex
	 */
	private void determineAssembledComponentsDecisions(final List<ADegreeOfFreedom> dds,
			final DesignDecisionGenotype genotype) {
		final AlternativeComponent ac = AlternativeComponent.getInstance();
		final List<AssembledComponentDegree> decisions = ac.generateDesignDecisions(this.pcmInstance);

		for (final AssembledComponentDegree designDecision : decisions) {
			dds.add(designDecision);
			final RepositoryComponent currentlyAssembledComponent = ((AssemblyContext) designDecision
					.getPrimaryChanged()).getEncapsulatedComponent__AssemblyContext();

			final ClassChoice choice = GenericdesigndecisionFactory.eINSTANCE.createClassChoice();
			choice.setDofInstance(designDecision);
			choice.setChosenValue(currentlyAssembledComponent);
			genotype.add(choice);

		}

	}

	/**
	 * Be sure to add one design decision and one gene in the initial genotype at once. The index is important.
	 * Creates {@link ContinuousProcessingRateDegree} decisions for each found processing resource.
	 *
	 * Also determines {@link SchedulingPolicyDegree}s.
	 *
	 * TODO: make configurable to also add {@link DiscreteProcessingRateDegree}s.
	 */
	private void determineProcessingRateDecisions(final List<ADegreeOfFreedom> dds,
			final DesignDecisionGenotype genotype) {
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

				final ContinousRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createContinousRangeChoice();
				choice.setDofInstance(decision);
				choice.setChosenValue(currentRate);

				genotype.add(choice);

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

	@Override
	public PCMPhenotype decode(DesignDecisionGenotype genotype) {
		MetamodelDescription pcm = (MetamodelDescription) this.getAssociatedMetamodel();
		return pcm.decode(this.pcmInstance, genotype);
	}

} //DSEProblemImpl
