/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.DegreeOfFreedomHelper;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixDesignDecisionReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.*;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.PCMDSEProblem;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.impl.ADSEProblemImpl;
import genericdesigndecision.universalDoF.AMetamodelDescription;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.start.Opt4JStarter;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;
import org.palladiosimulator.solver.models.PCMInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCMDSE Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PCMDSEProblemImpl extends ADSEProblemImpl implements PCMDSEProblem {

	private final designdecisionFactory designDecisionFactory;
	private final specificFactory specificDesignDecisionFactory;
	private final PCMInstance pcmInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PCMDSEProblemImpl() {
		super();
		this.pcmInstance = null;
		this.designDecisionFactory = null;
		this.specificDesignDecisionFactory = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param pcmInstance
	 * @throws CoreException
	 * @generated NOT
	 */
	public PCMDSEProblemImpl(final DSEWorkflowConfiguration dseConfig, final EModelElement emfInstance,
			AMetamodelDescription ammd) throws CoreException {
		super(dseConfig, emfInstance, ammd);

		this.designDecisionFactory = designdecisionFactoryImpl.init();
		this.specificDesignDecisionFactory = specificFactoryImpl.init();

		pcmInstance = transformEMFtoPCM(emfInstance);

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

	private PCMInstance transformEMFtoPCM(EModelElement emfInstance) {
		// TODO converts emfInstance into an object of class PCMInstance
		return null;
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

		final FixDesignDecisionReferenceSwitch visitor = new FixDesignDecisionReferenceSwitch(this.pcmInstance);
		visitor.doSwitch(problem);

		EcoreUtil.resolveAll(eproblem);

		return problem;
	}

	// TODO should be rewritten without use of instanceof but inside pcm packages
	@Override
	protected List<DesignDecisionGenotype> determineInitialGenotype(final DecisionSpace problem) {
		final DesignDecisionGenotype genotype = new DesignDecisionGenotype();

		for (final DegreeOfFreedom dd : problem.getDofInstances()) {

			//if (dd.getDof() != null) {
			//TODO correct this if necessary
			if (dd.getClass() != null) {
				final EStructuralFeature property = dd.getPrimaryChangeable().getChangeable();

				final Object value = GenomeToCandidateModelTransformation.getProperty(dd.getPrimaryChanged(), property);

				final Choice choice = this.designDecisionFactory.createChoice();
				choice.setValue(value);
				choice.setDofInstance(dd);

				genotype.add(choice);

			} else if (dd instanceof ClassDegree) {

				final ClassChoice choice = this.designDecisionFactory.createClassChoice();
				choice.setDofInstance(dd);

				if (dd instanceof AssembledComponentDegree) {
					final AssembledComponentDegree acd = (AssembledComponentDegree) dd;
					final AssemblyContext ac = (AssemblyContext) acd.getPrimaryChanged();
					final RepositoryComponent rc = ac.getEncapsulatedComponent__AssemblyContext();
					choice.setChosenValue(rc);
				} else if (dd instanceof AllocationDegree) {
					final AllocationDegree ad = (AllocationDegree) dd;
					final AllocationContext ac = (AllocationContext) ad.getPrimaryChanged();
					final ResourceContainer rc = ac.getResourceContainer_AllocationContext();
					choice.setChosenValue(rc);
				} else if (dd instanceof SchedulingPolicyDegree) {

					final ProcessingResourceType procType = ((SchedulingPolicyDegree) dd).getProcessingresourcetype();
					final ResourceContainer rc = (ResourceContainer) dd.getPrimaryChanged();

					SchedulingPolicy policy = null;

					for (final ProcessingResourceSpecification proc : rc
							.getActiveResourceSpecifications_ResourceContainer()) {
						if (EMFHelper.checkIdentity(proc.getActiveResourceType_ActiveResourceSpecification(),
								procType)) {
							policy = proc.getSchedulingPolicy();
							break;
						}
					}
					if (policy == null) {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString()
								+ ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
					choice.setChosenValue(policy);
					genotype.add(choice);

				} else {
					super.throwUnknownDegreeException(dd);
				}

				//check if entity is in the domain
				if (!EMFHelper.contains(((ClassDegree) dd).getClassDesignOptions(), choice.getChosenValue())) {
					throw new ChoiceOutOfBoundsException(choice, "Error when determining initial genotype");
				}

				genotype.add(choice);
			} else if (dd instanceof ContinuousRangeDegree) {
				/*
				 *
				 */
				final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
				choice.setDofInstance(dd);

				// Monitoring Degree added
				//added by Suman Jojiju
				if (dd instanceof MonitoringDegree) {
					//MonitoringDegree mnrt = (MonitoringDegree) dd;
					final ContinuousRangeDegree crdobj = (ContinuousRangeDegree) dd;
					//Intervall interval = (Intervall) (MonitoringDegree)crdobj.getPrimaryChanged();
					//choice.setChosenValue(interval.getIntervall());
					choice.setChosenValue(crdobj.getFrom());

				} else if (dd instanceof ContinuousProcessingRateDegree) {
					final ContinuousProcessingRateDegree prd = (ContinuousProcessingRateDegree) dd;
					final ProcessingResourceSpecification rightPrs = getProcessingResourceSpec(prd);

					if (rightPrs != null) {
						final double rate = CostUtil.getInstance().getDoubleFromSpecification(
								rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
						choice.setChosenValue(rate);
					} else {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString()
								+ ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
				} else {
					throwUnknownDegreeException(dd);
				}

				genotype.add(choice);
			} else if (dd instanceof DiscreteDegree) {
				final DiscreteDegree degree = (DiscreteDegree) dd;

				final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
				choice.setDofInstance(degree);

				final EObject entity = degree.getPrimaryChanged();

				if (degree instanceof CapacityDegree) {
					final PassiveResource pr = (PassiveResource) entity;
					choice.setChosenValue(Integer.valueOf(pr.getCapacity_PassiveResource().getSpecification()));

				} else if (degree instanceof NumberOfCoresDegree) {
					final ProcessingResourceSpecification prd = getProcessingResourceSpec(
							(ProcessingResourceDegree) degree);
					choice.setChosenValue(prd.getNumberOfReplicas());
				} else if (degree instanceof DiscreteProcessingRateDegree) {

					final DiscreteProcessingRateDegree prd = (DiscreteProcessingRateDegree) dd;

					final ProcessingResourceSpecification rightPrs = getProcessingResourceSpec(prd);

					if (rightPrs != null) {
						if (!prd.isLowerBoundIncluded() || !prd.isUpperBoundIncluded()) {
							throw new RuntimeException(
									"Only DiscreteProcessingRateDegrees with upper and lower bound included are supported so far, sorry. ");
						}
						final double rate = CostUtil.getInstance().getDoubleFromSpecification(
								rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
						final double startStep = prd.getFrom();
						final double endStep = prd.getTo();
						final double stepwidth = (endStep - startStep) / prd.getNumberOfSteps();

						final double chosenStep = (rate - startStep) / stepwidth;
						choice.setChosenValue((int) chosenStep);
					} else {
						throw new RuntimeException("Invalid degree of freedom " + dd.toString()
								+ ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
					}
				} else if (degree instanceof ResourceContainerReplicationDegree) {
					choice.setChosenValue(1);

				} else {
					throwUnknownDegreeException(dd);
				}
				genotype.add(choice);
			} else {
				throwUnknownDegreeException(dd);
			}
		}

		//determineProcessingRateDecisions(new ArrayList<DesignDecision>(), genotype);
		//determineAssembledComponentsDecisions(new ArrayList<DesignDecision>(), genotype);
		//determineAllocationDecisions(new ArrayList<DesignDecision>(), genotype);
		final List<DesignDecisionGenotype> result = new ArrayList<DesignDecisionGenotype>();
		result.add(genotype);
		this.initialGenotype = genotype;
		return result;
	}

	private ProcessingResourceSpecification getProcessingResourceSpec(final ProcessingResourceDegree prd) {
		final ResourceContainer rc = (ResourceContainer) prd.getPrimaryChanged();
		final List<ProcessingResourceSpecification> prsList = rc.getActiveResourceSpecifications_ResourceContainer();
		final ProcessingResourceType prt = prd.getProcessingresourcetype();

		ProcessingResourceSpecification rightPrs = null;
		for (final ProcessingResourceSpecification prs : prsList) {
			if (EMFHelper.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(), prt)) {
				rightPrs = prs;
				break;
			}
		}
		return rightPrs;
	}

	/**
	 * Initialises the degrees of freedoms and at the same time determines the initial genotype.
	 */
	@Override
	protected void initialiseProblem() {
		this.problem = this.designDecisionFactory.createDecisionSpace();
		final List<DegreeOfFreedom> dds = this.problem.getDofInstances();

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
	private void determineCapacityDecisions(final List<DegreeOfFreedom> dds,
			final DesignDecisionGenotype genotype) {

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

						final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
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
	private void determineAllocationDecisions(final List<DegreeOfFreedom> dds,
			final DesignDecisionGenotype genotype) {
		final List<AllocationContext> acs = this.pcmInstance.getAllocation().getAllocationContexts_Allocation();
		final List<ResourceContainer> rcs = this.pcmInstance.getResourceEnvironment()
				.getResourceContainer_ResourceEnvironment();

		//each allocation context could be allocated on each container.
		for (final AllocationContext ac : acs) {
			final AllocationDegree ad = this.specificDesignDecisionFactory.createAllocationDegree();
			ad.setPrimaryChanged(ac);
			ad.getClassDesignOptions().addAll(rcs);
			dds.add(ad);

			final ClassChoice choice = this.designDecisionFactory.createClassChoice();
			choice.setDofInstance(ad);
			choice.setChosenValue(ac.getResourceContainer_AllocationContext());

			genotype.add(choice);
		}
	}

	/**
	 * Be sure to add one design decision and one gene in the initial genotype at once. The index is important.
	 * @param genotypeIndex
	 */
	private void determineAssembledComponentsDecisions(final List<DegreeOfFreedom> dds,
			final DesignDecisionGenotype genotype) {
		final AlternativeComponent ac = AlternativeComponent.getInstance();
		final List<AssembledComponentDegree> decisions = ac.generateDesignDecisions(this.pcmInstance);

		for (final AssembledComponentDegree designDecision : decisions) {
			dds.add(designDecision);
			final RepositoryComponent currentlyAssembledComponent = ((AssemblyContext) designDecision
					.getPrimaryChanged()).getEncapsulatedComponent__AssemblyContext();

			final ClassChoice choice = this.designDecisionFactory.createClassChoice();
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
	private void determineProcessingRateDecisions(final List<DegreeOfFreedom> dds,
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

				final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
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

	private DegreeOfFreedom getDesignDecision(final int index) {
		return this.problem.getDofInstances().get(index);
	}

	@Override
	public List<DegreeOfFreedom> getDesignDecisions() {
		return this.problem.getDofInstances();
	}

	private PCMInstance getPcmInstance() {
		return this.pcmInstance;
	}

	/**
	 * Returns the degree of freedom of the type (or subtype) that has the given
	 * entity as the changeableEntity.
	 * @param entity
	 * @param degreeClass
	 * @return The matching DegreeOfFreedom runtime object from this problem.
	 */
	private DegreeOfFreedom getDoFInstance(final Entity entity,
			final Class<? extends DegreeOfFreedom> degreeClass) {
		final List<DegreeOfFreedom> degrees = this.problem.getDofInstances();
		for (final DegreeOfFreedom DegreeOfFreedom : degrees) {

			if (degreeClass.isInstance(DegreeOfFreedom)
					&& DegreeOfFreedom.getPrimaryChanged().equals(entity)) {
				return DegreeOfFreedom;
			}
		}
		return null;
	}

	@Override
	public DesignDecisionGenotype getGenotypeOfInitialInstance() {
		return this.initialGenotype;
	}

	public List<DesignDecisionGenotype> getInitialGenotypeList() {
		return this.initialGenotypeList;
	}

	//potentially move to ADSEProblem
	@Override
	public void saveProblem() {

		final String filename = this.dseConfig.getDesignDecisionFileName();

		//		resourceSet.getPackageRegistry().put
		//		(designdecisionPackage.eNS_URI,
		//		 designdecisionPackage.eINSTANCE);

		EMFHelper.saveToXMIFile(this.problem, filename);
	}

	@Override
	public void setInitialPopulation(final List<DesignDecisionGenotype> population) throws CoreException {
		this.initialGenotypeList = population;
		Opt4JStarter.getDSECreator().setNumberOfNotEvaluatedPredefinedOnes(population.size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.PCMDSE_PROBLEM;
	}

	@Override
	public DegreeOfFreedom getDegree(Entity entity, Class<? extends DegreeOfFreedom> degreeClass) {
		// TODO Auto-generated method stub
		//probably calls getDoFInstance
		return null;
	}

	@Override
	public DecisionSpace getEMFProblem() {
		// TODO Auto-generated method stub
		return null;
	}

} //PCMDSEProblemImpl
