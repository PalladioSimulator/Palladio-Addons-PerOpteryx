package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.opt4j.core.problem.Decoder;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;
import org.palladiosimulator.solver.models.PCMInstance;

import com.google.inject.Inject;

import concernStrategy.Feature;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.concernweaving.util.WeavingExecuter;
import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.exception.InvalidChoiceForDegreeException;
import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.DegreeOfFreedomHelper;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureActiveIndicator;
import de.uka.ipd.sdq.pcm.designdecision.specific.IndicatorDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

/**
 * The {@link DSEDecoder} is responsible for converting the genotypes into
 * proper PCM instances that can then be analysed.
 *
 * @author Anne
 *
 */
public class DSEDecoder implements Decoder<DesignDecisionGenotype, PCMPhenotype> {

	// private final DSEProblem problem;

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	/**
	 * Store first MTTF and rate values to adjust later MTTF with (see
	 * {@link #applyChangeProcessingRateDecision(ContinuousProcessingRateDegree, Choice)}).
	 */
	private double initialMTTF = Double.NaN;
	/** @see #initialMTTF */
	private double initialRate = Double.NaN;
	private static double intervalTime = 0.0;

	private PCMInstance pcm;

	@Inject
	public DSEDecoder() {
		// XXX like this you can only set the problem once. Maybe don't save the
		// reference.
		// this.problem = Opt4JStarter.problem;
	}

	@Override
	public PCMPhenotype decode(final DesignDecisionGenotype genotype) {

		// get PCM Instance
		this.pcm = Opt4JStarter.getProblem().getInitialInstance();

		// make local copy

		// new transformation. Transition phase: Only for those DoF that are not
		// explicitly
		// modelled.
		final GenomeToCandidateModelTransformation trans = new GenomeToCandidateModelTransformation();

		// first use new transformation.
		List<Choice> notTransformedChoices;
		try {
			notTransformedChoices = trans.transform(this.pcm, genotype.getEMFCandidate());
		} catch (final Exception e) {
			// try to continue for now
			DSEDecoder.logger.warn("Error when executing GDoF transformation. I will try to ignore it and continue. Failure was:");
			e.printStackTrace();
			notTransformedChoices = genotype;
		}

		WeavingExecuter weavingExecuter = new WeavingExecuter(notTransformedChoices);

		// then, use old way for choices that have not been transformed, e.g.
		// because there is no
		// GDoF defined for them.
		// adjust values as in genotype
		for (final Choice doubleGene : notTransformedChoices) {
			this.applyChange(doubleGene.getDegreeOfFreedomInstance(), doubleGene, trans, this.pcm);
		}

		try {
			this.pcm = weavingExecuter.getWeavedPCMInstanceOf(this.pcm);
		} catch (ConcernWeavingException e) {
			DSEDecoder.logger.error(String.format("An error occured during the concern weaving process. Failure was:%s", e.getMessage()));
			throw new RuntimeException(e);
		} catch (IOException e) {
			DSEDecoder.logger.error(String.format("The cost model has not been saved properly."));
			e.printStackTrace();
		}

		for (final Choice doubleGene : weavingExecuter.getConvertedECCClassChoices()) {
			this.applyChange(doubleGene.getDegreeOfFreedomInstance(), doubleGene, trans, this.pcm);
		}
		this.setIndicators(notTransformedChoices);
		final String genotypeString = DSEDecoder.getGenotypeString(genotype);

		// encapsulate as phenotype
		// return new
		// PCMPhenotype(pcm.deepCopy(),genotypeStringBuilder.toString());
		return new PCMPhenotype(this.pcm, genotypeString, genotype.getNumericID());
	}

	/**
	 * Initialize {@link IndicatorDegree Indicators} (delete them from list of
	 * choices, as they will processed in another way)
	 *
	 * @param choices
	 *            the list of choices
	 * @author Dominik Fuchss
	 */
	private void setIndicators(List<Choice> choices) {
		List<RepositoryComponent> assembled = this.pcm.getSystem().getAssemblyContexts__ComposedStructure().stream().map(ac -> ac.getEncapsulatedComponent__AssemblyContext())
				.collect(Collectors.toList());
		this.setActiveFeaturesIndicator(choices, assembled);
	}

	/**
	 * Initialize {@link FeatureActiveIndicator FeatureActiveIndicators} (delete
	 * them from list of choices, as they will processed in another way)
	 *
	 * @param choices
	 *            the list of choices
	 * @author Dominik Fuchss
	 */
	private void setActiveFeaturesIndicator(List<Choice> choices, List<RepositoryComponent> assembled) {
		List<Feature> actives = new ArrayList<>();
		for (RepositoryComponent rc : assembled) {
			List<ProvidedRole> pr = rc.getProvidedRoles_InterfaceProvidingEntity();
			List<RequiredRole> rr = rc.getRequiredRoles_InterfaceRequiringEntity();
			actives.addAll(this.extractFeatures(pr, rr));
		}
		for (Feature active : actives) {
			this.setFeatureToActive(active.getId(), choices);
		}
	}

	/**
	 * Set a Feature (id) to active (and delete the Choice from ListOfChoices)
	 *
	 * @param id
	 *            the id
	 * @param choices
	 *            all choices
	 * @author Dominik Fuchss
	 */
	private void setFeatureToActive(String id, List<Choice> choices) {
		Iterator<Choice> iter = choices.iterator();
		Choice current = null;
		while (iter.hasNext()) {
			current = iter.next();
			if (!(current.getDegreeOfFreedomInstance() instanceof FeatureActiveIndicator)) {
				continue;
			}
			Feature cf = (Feature) ((FeatureActiveIndicator) current.getDegreeOfFreedomInstance()).getPrimaryChanged();
			if (id.equals(cf.getId())) {
				iter.remove();
				current.setValue(true);
				return;
			}
		}
	}

	/**
	 * Extract features of ProvidedRole and RequiredRoles
	 *
	 * @param prs
	 *            all {@link ProvidedRole}
	 *
	 * @param rrs
	 *            all {@link RequiredRole}
	 * @return the annotated Features
	 * @author Dominik Fuchss
	 */
	private List<Feature> extractFeatures(List<ProvidedRole> prs, List<RequiredRole> rrs) {
		List<Feature> features = new ArrayList<>();
		for (ProvidedRole pr : prs) {
			List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(pr);
			for (StereotypeApplication appl : appls) {
				List<Feature> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(Feature.class);
				features.addAll(provided);
			}
		}

		for (RequiredRole rr : rrs) {
			List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(rr);
			for (StereotypeApplication appl : appls) {
				List<Feature> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(Feature.class);
				features.addAll(provided);
			}
		}
		return features;
	}

	/**
	 * Applies the given change to the initial pcm instance (as this is
	 * referenced by the design decisions. More precisely, this one calls calls
	 * specialized methods for dealing with different types of design decisions.
	 *
	 * @param designDecision
	 * @param pcm
	 * @param choice
	 *            The new value the design decision should take.
	 * @param trans
	 * @param pcm
	 */
	private void applyChange(final DegreeOfFreedomInstance designDecision, final Choice choice, final GenomeToCandidateModelTransformation trans, final PCMInstance pcm) {
		if (designDecision instanceof IndicatorDegree) {
			// No Changes needed ..
			return;
		}
		/**
		 * TODO Make the selection of the appropriate applyChange method more
		 * implicit. Maybe move the method to DesignDecision itself.
		 */
		if (ProcessingRateDegree.class.isInstance(designDecision)) {
			this.applyChangeProcessingRateDecision((ProcessingRateDegree) designDecision, choice);

			// Monitoring degree added
			// added by Suman Jojiju
		} else if (MonitoringDegree.class.isInstance(designDecision)) {
			this.applyChangeMonitoringDecision((MonitoringDegree) designDecision, choice);

		} else if (AssembledComponentDegree.class.isInstance(designDecision)) {
			this.applyChangeAssembledComponentDecision((AssembledComponentDegree) designDecision, choice);
		} else if (AllocationDegree.class.isInstance(designDecision)) {
			this.applyChangeAllocationDecision((AllocationDegree) designDecision, choice);
		} else if (SchedulingPolicyDegree.class.isInstance(designDecision)) {
			this.applyChangeSchedulingDecision((SchedulingPolicyDegree) designDecision, choice);
		} else if (CapacityDegree.class.isInstance(designDecision)) {
			this.applyChangeCapacityDecision((CapacityDegree) designDecision, choice);
		} else if (NumberOfCoresDegree.class.isInstance(designDecision)) {
			this.applyChangeNumberOfCoresDecision((NumberOfCoresDegree) designDecision, choice);
		} else if (ResourceContainerReplicationDegree.class.isInstance(designDecision)) {
			this.applyChangeResourceContainerReplicationDegree((ResourceContainerReplicationDegree) designDecision, choice);
		} else if (ATNumberOfReplicaDegree.class.isInstance(designDecision)) {
			this.applyChangeATNumberOfReplicaDegree((ATNumberOfReplicaDegree) designDecision, choice);
		} else {
			try {
				trans.transformChoice(pcm, choice);
			} catch (final Exception e) {
				DSEDecoder.logger.error("There was an unrecognised design decision " + designDecision.getClass() + " or a problem when handling a generic DoF");
				e.printStackTrace();
			}
		}
	}

	private void applyChangeATNumberOfReplicaDegree(ATNumberOfReplicaDegree designDecision, Choice choice) {
		if (!(choice instanceof DiscreteRangeChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}
		final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice) choice;
		final EObject changeableEntity = designDecision.getPrimaryChanged();

		if (changeableEntity instanceof ResourceContainer) {
			ResourceContainer resourceContainer = (ResourceContainer) changeableEntity;
			if (StereotypeAPI.isStereotypeApplied(resourceContainer, "ReplicableResourceContainer")) {
				int min = designDecision.getFrom();
				int max = designDecision.getTo();
				// TODO: Randomize choice appropriately
				int newNumberOfReplicas = ThreadLocalRandom.current().nextInt(min, max + 1);
				StereotypeAPI.setTaggedValue(resourceContainer, newNumberOfReplicas, "ReplicableResourceContainer", "numberOfReplicas");
				discreteChoice.setChosenValue(newNumberOfReplicas);

			}
		} else if (changeableEntity instanceof AssemblyContext) {
			// TODO: Handle Assembly Context numberOfReplicas Parameter
		}
	}

	private void applyChangeResourceContainerReplicationDegree(final ResourceContainerReplicationDegree designDecision, final Choice choice) {

		if (!(choice instanceof DiscreteRangeChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}
		final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice) choice;

		final int numberOfServers = discreteChoice.getChosenValue();

		final EObject changeableEntity = designDecision.getPrimaryChanged();
		if (!(changeableEntity instanceof ResourceContainer)) {
			this.throwInvalidEntityException(designDecision, changeableEntity, ResourceContainer.class);
		}
		final ResourceContainer server = (ResourceContainer) changeableEntity;

		if (numberOfServers < 1) {
			throw new ChoiceOutOfBoundsException(discreteChoice);
		}

		final PCMInstance pcm = Opt4JStarter.getProblem().getInitialInstance();

		boolean unrollReplication = true;
		if (unrollReplication) {

			// first reset the changes possibly made for earlier candidates
			final List<ResourceContainer> allServers = pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
			final List<ResourceContainer> previousReplicasToRemove = new ArrayList<>();
			for (final ResourceContainer resourceContainer : allServers) {
				if (resourceContainer.getId().contains(server.getId()) && resourceContainer.getEntityName().contains("Replica")) {
					previousReplicasToRemove.add(resourceContainer);
				}
			}
			allServers.removeAll(previousReplicasToRemove);
			// also remove them from linking resources
			final List<LinkingResource> linkingResources = pcm.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
			for (final LinkingResource linkingResource : linkingResources) {
				linkingResource.getConnectedResourceContainers_LinkingResource().removeAll(previousReplicasToRemove);
			}

			final List<AllocationContext> allocationContextsToRemove = new ArrayList<>();
			for (final AllocationContext allocationContext : pcm.getAllocation().getAllocationContexts_Allocation()) {
				if (previousReplicasToRemove.contains(allocationContext.getResourceContainer_AllocationContext())) {
					allocationContextsToRemove.add(allocationContext);
				}
			}
			pcm.getAllocation().getAllocationContexts_Allocation().removeAll(allocationContextsToRemove);

			// Apply the current value of the genome.
			if (numberOfServers == 1) {
				// no replication, keep original model with just one resource
				// container.
				// XXX: assumes that the original model has no replication.
			} else {
				// retrieve components deployed to this server
				final List<AllocationContext> allocationContexts = pcm.getAllocation().getAllocationContexts_Allocation();
				final List<AllocationContext> allocationContextsOnServer = this.getAllocationContextsOnServer(allocationContexts, server);

				// the initial server is already there, so add numberOfServers -
				// 1 new servers
				for (int i = 1; i < numberOfServers; i++) {
					// add a server, replicate all components on it.

					final ResourceContainer serverCopy = EcoreUtil.copy(server);

					// need to change the ids as all ids need to be unique.
					serverCopy.setId(serverCopy.getId() + i);
					serverCopy.setEntityName(serverCopy.getEntityName() + "Replica" + i);
					for (ProcessingResourceSpecification processor : serverCopy.getActiveResourceSpecifications_ResourceContainer()) {
						processor.setId(processor.getId() + i);
					}

					pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment().add(serverCopy);

					// connect the new server copy to all linking resources that
					// the old one is
					// connected to
					for (final LinkingResource linkingResource : linkingResources) {
						if (linkingResource.getConnectedResourceContainers_LinkingResource().contains(server)) {
							linkingResource.getConnectedResourceContainers_LinkingResource().add(serverCopy);
						}
					}

					for (final AllocationContext allocationContext : allocationContextsOnServer) {
						final AllocationContext allocationContextCopy = EcoreUtil.copy(allocationContext);
						allocationContextCopy.setId(allocationContextCopy.getId() + i);
						allocationContextCopy.setEntityName(allocationContextCopy.getEntityName() + "Replica" + i);

						allocationContextCopy.setResourceContainer_AllocationContext(serverCopy);

						pcm.getAllocation().getAllocationContexts_Allocation().add(allocationContextCopy);
					}
				}
			}
		} else {
			// FIXME quickfix, assumes that number of cores is reset for every
			// iteration by the
			// numberofcores degree (i.e. assumes that degree preceeds this one
			// in the
			// designdecision file)

			for (ProcessingResourceSpecification processingResourceSpec : server.getActiveResourceSpecifications_ResourceContainer()) {
				processingResourceSpec.setNumberOfReplicas(processingResourceSpec.getNumberOfReplicas() * numberOfServers);
			}
		}

		// This part handles the
		// ResourceContainerReplicationDegreeWithComponentChange, where
		// additionally the assembled component is changed
		// This is for example needed if a single instance of a component
		// behaves differently than multiple ones (e.g. the multiple ones
		// generate overhead when synchronizing information among each other).
		// This was used in the 2012 ICPE PerOpteryx paper for modelling the
		// remote diagnostic system.
		if (designDecision instanceof ResourceContainerReplicationDegreeWithComponentChange) {
			List<ExchangeComponentRule> exchangeComponentRules = ((ResourceContainerReplicationDegreeWithComponentChange) designDecision).getExchangeComponentRule();
			int index = numberOfServers - designDecision.getFrom();
			for (ExchangeComponentRule exchangeComponentRule : exchangeComponentRules) {
				if (index >= 0 && index < exchangeComponentRule.getRepositoryComponent().size()) {
					RepositoryComponent repoCompToUse = exchangeComponentRule.getRepositoryComponent().get(index);
					AssemblyContext assemblyContextToChange = exchangeComponentRule.getAllocationContext().getAssemblyContext_AllocationContext();
					RepositoryComponent currentComponent = assemblyContextToChange.getEncapsulatedComponent__AssemblyContext();

					// Do not replace component if it is already assembled.
					if (!EMFHelper.checkIdentity(currentComponent, repoCompToUse)) {
						AlternativeComponent.getInstance().applyChange(assemblyContextToChange, repoCompToUse);
					}
				} else {
					throw new ChoiceOutOfBoundsException(discreteChoice, "Looking for index " + index + "in RepositoryComponents of ResourceContainerReplicationDegreeWithComponentChange "
							+ "degree for number of servers " + numberOfServers + ", but no such component available");
				}

			}

		}
	}

	private List<AllocationContext> getAllocationContextsOnServer(final List<AllocationContext> allocationContexts, final ResourceContainer server) {
		final List<AllocationContext> allocationContextsOnThisServer = new LinkedList<>();
		for (final AllocationContext allocationContext : allocationContexts) {
			if (EMFHelper.checkIdentity(allocationContext.getResourceContainer_AllocationContext(), server)) {
				allocationContextsOnThisServer.add(allocationContext);
			}
		}
		return allocationContextsOnThisServer;
	}

	private void applyChangeNumberOfCoresDecision(final NumberOfCoresDegree designDecision, final Choice choice) {
		if (!(choice instanceof DiscreteRangeChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}

		final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice) choice;

		final ProcessingResourceSpecification rightPrs = this.getProcessingRateSpecification(designDecision);
		rightPrs.setNumberOfReplicas(discreteChoice.getChosenValue());

	}

	private void applyChangeCapacityDecision(final CapacityDegree designDecision, final Choice choice) {
		if (!(choice instanceof DiscreteRangeChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}

		final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice) choice;

		final PassiveResource passiveResource = (PassiveResource) designDecision.getPrimaryChanged();
		passiveResource.getCapacity_PassiveResource().setSpecification(String.valueOf(discreteChoice.getChosenValue()));

	}

	private void applyChangeAllocationDecision(final AllocationDegree designDecision, final Choice choice) {

		if (!(choice instanceof ClassChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}
		final ClassChoice enumChoice = (ClassChoice) choice;

		final EObject entity = enumChoice.getChosenValue();
		if (!(entity instanceof ResourceContainer)) {
			this.throwInvalidEntityException(designDecision, entity, ResourceContainer.class);
		}

		final ResourceContainer rc = (ResourceContainer) entity;

		((AllocationContext) designDecision.getPrimaryChanged()).setResourceContainer_AllocationContext(rc);

		DSEDecoder.logger.debug("Handling a " + designDecision.getClass() + ", setting resource container to " + rc.getEntityName() + " for allocation context " + designDecision.getPrimaryChanged());

	}

	private void applyChangeSchedulingDecision(final SchedulingPolicyDegree designDecision, final Choice choice) {
		if (!(choice instanceof ClassChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}

		final ClassChoice schedChoice = (ClassChoice) choice;
		final SchedulingPolicy chosenPolicy = (SchedulingPolicy) schedChoice.getChosenValue();

		final ProcessingResourceSpecification rightPrs = this.getProcessingRateSpecification(designDecision);

		rightPrs.setSchedulingPolicy(chosenPolicy);

	}

	/**
	 * @see applyChange(DesignDecision, PCMInstance, Double)
	 * @param designDecision
	 * @param pcm
	 * @param doubleGene
	 */
	private void applyChangeProcessingRateDecision(final ProcessingRateDegree designDecision, final Choice choice) {
		// XXX The value is changed in the original model, not in a copy.

		if (!(choice instanceof ContinousRangeChoice || choice instanceof DiscreteRangeChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}

		double newRate = 0;
		if (choice instanceof ContinousRangeChoice) {
			final ContinousRangeChoice doubleGene = (ContinousRangeChoice) choice;
			newRate = doubleGene.getChosenValue();
		} else {
			final DiscreteRangeChoice doubleGene = (DiscreteRangeChoice) choice;
			final DiscreteProcessingRateDegree degree = (DiscreteProcessingRateDegree) designDecision;
			newRate = degree.getFrom() + ((degree.getTo() - degree.getFrom()) / degree.getNumberOfSteps()) * doubleGene.getChosenValue();

		}

		final ProcessingResourceSpecification rightPrs = this.getProcessingRateSpecification(designDecision);

		// get initial models MTTF and rate to scale upcoming candidates MTTF
		// with
		if (Double.isNaN(this.initialRate)) {
			// old spec for adjusting MTTF
			final String oldRateString = rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification();
			this.initialRate = CostUtil.getInstance().getDoubleFromSpecification(oldRateString);
		}
		if (Double.isNaN(this.initialMTTF)) {
			this.initialMTTF = rightPrs.getMTTF();
		}

		final double mttf = this.initialMTTF * newRate / this.initialRate;

		// round to just four digits after decimal sign, to maybe have no errors
		// by the above
		// long l = (int)Math.round(mttf * 100000000); // truncates
		// mttf = l / 100000000.0;

		rightPrs.getProcessingRate_ProcessingResourceSpecification().setSpecification(String.valueOf(newRate));
		rightPrs.setMTTF(mttf);

		DSEDecoder.logger.debug("Handling a " + designDecision.getClass() + ", setting rate to " + newRate + " and MTTF to " + mttf + " (inital MTTF: " + this.initialMTTF + ")");
	}

	// added by Suman Jojiju

	private void applyChangeMonitoringDecision(final MonitoringDegree designDecision, final Choice choice) {
		double newinterval = 0.0;
		if (choice instanceof ContinousRangeChoice) {
			final ContinousRangeChoice doubleGene = (ContinousRangeChoice) choice;
			// FIXME: cannot locate Intervall class in SimuLizar after pms has
			// been renamed to prm.
			// Intervall interval =
			// (Intervall)designDecision.getPrimaryChanged();
			newinterval = doubleGene.getChosenValue();
			DSEDecoder.intervalTime = newinterval;
			// interval.setIntervall(newinterval);
			throw new UnsupportedOperationException(
					"MonitoringDegree is not supported anymore after recent SimuLizar refactoring renaming the pms package to psm. Please update DSEDecoder.class and import the required Inervall file from where it is located now. Please also restore the Simulizar plugin dependencies as needed.");
		}
	}

	public static double returnInterval() {
		return DSEDecoder.intervalTime;
	}

	private ProcessingResourceSpecification getProcessingRateSpecification(final ProcessingResourceDegree designDecision) {
		final ResourceContainer rc = ((ResourceContainer) designDecision.getPrimaryChanged());
		final ProcessingResourceType prt = designDecision.getProcessingresourcetype();

		ProcessingResourceSpecification rightPrs = null;
		for (final ProcessingResourceSpecification prs : rc.getActiveResourceSpecifications_ResourceContainer()) {
			if (EMFHelper.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(), prt)) {
				rightPrs = prs;
				break;
			}
		}

		if (rightPrs == null) {
			throw new RuntimeException("Invalid degree of freedom " + designDecision.toString() + ". The references ProcessingResourceType is not available in the given ResourceContainer.");
		}
		return rightPrs;
	}

	private void throwNewInvalidChoiceException(final DegreeOfFreedomInstance designDecision, final Choice choice) {
		throw new InvalidChoiceForDegreeException(choice);

	}

	private void applyChangeAssembledComponentDecision(final AssembledComponentDegree designDecision, final Choice choice) {

		if (!(choice instanceof ClassChoice)) {
			this.throwNewInvalidChoiceException(designDecision, choice);
		}
		final ClassChoice enumChoice = (ClassChoice) choice;

		// use the order of the enumeration of EquivalentComponents in the
		// Domain
		final EObject entity = enumChoice.getChosenValue();
		if (!(entity instanceof RepositoryComponent)) {
			this.throwInvalidEntityException(designDecision, entity, RepositoryComponent.class);
		}
		final RepositoryComponent componentToBeAssembled = (RepositoryComponent) entity;

		final AssemblyContext changedAssemblyContext = (AssemblyContext) designDecision.getPrimaryChanged();
		final RepositoryComponent currentComponent = changedAssemblyContext.getEncapsulatedComponent__AssemblyContext();

		// Do not replace component if it is already assembled.
		if (!EMFHelper.checkIdentity(currentComponent, componentToBeAssembled)) {
			AlternativeComponent.getInstance().applyChange(changedAssemblyContext, componentToBeAssembled);
		}

		DSEDecoder.logger.debug("Handling a " + designDecision.getClass() + ", using component " + componentToBeAssembled.getEntityName());
	}

	private void throwInvalidEntityException(final DegreeOfFreedomInstance designDecision, final EObject changeableEntity, final Class<?> expectedClass) {
		throw new RuntimeException("Entity " + changeableEntity + " of type " + changeableEntity.getClass().getName() + " is not an applicable value for degree of freedom "
				+ designDecision.getClass().getName() + ", required type is " + expectedClass.getName());

	}

	public static String getGenotypeString(final DesignDecisionGenotype genotype) {
		final StringBuilder genotypeStringBuilder = new StringBuilder(100);
		for (final Choice choice : genotype) {
			genotypeStringBuilder.append(DSEDecoder.getDecisionString(choice) + ";");
		}
		return genotypeStringBuilder.toString();
	}

	/**
	 * Returns the String that can be used to represent the choice. Either
	 * toString or, for an Entity, a more speaking String.
	 *
	 * @param choice
	 *            the choice
	 * @return a String that can be used to represent this choice
	 */
	public static String getDecisionString(final Choice choice) {
		// DegreeOfFreedomInstance designDecision =
		// choice.getDegreeOfFreedomInstance();

		String result = choice.getValue().toString();

		if (choice.getValue() instanceof Entity) {
			result = DSEDecoder.getDecisionString((Entity) choice.getValue());
		}

		return result;
	}

	/**
	 * Returns the string to represent this entity.
	 */
	private static String getDecisionString(final Entity entity) {
		return entity.getEntityName() + " (ID: " + entity.getId() + ")";
	}

	/**
	 * Calls getDoubleValueFor(String decisionString, DesignDecision
	 * designDecision)
	 *
	 * @param index
	 * @param decisionString
	 * @return
	 * @throws CoreException
	 */
	public static Choice getChoiceForIndex(final int index, final String decisionString) throws CoreException {

		final DegreeOfFreedomInstance designDecision = Opt4JStarter.getProblem().getDesignDecision(index);

		final Choice value = DSEDecoder.getChoiceFor(decisionString, designDecision);

		return value;

	}

	public static Choice getChoiceFor(final String decisionString, final DegreeOfFreedomInstance designDecision) throws CoreException {
		Choice choice;

		final designdecisionFactory factory = designdecisionFactoryImpl.init();

		if (designDecision instanceof ContinuousRangeDegree) {
			final ContinuousRangeDegree contDegree = (ContinuousRangeDegree) designDecision;
			final double d = Double.parseDouble(decisionString);
			if (!DSEDecoder.validRange(d, contDegree, contDegree.getFrom(), contDegree.getTo())) {
				throw ExceptionHelper
						.createNewCoreException("Error: Value " + d + " is not a valid value for degree " + designDecision + " " + DegreeOfFreedomHelper.getDegreeDescription(designDecision));
			}
			final ContinousRangeChoice contChoice = factory.createContinousRangeChoice();
			contChoice.setChosenValue(d);
			choice = contChoice;
		} else if (designDecision instanceof DiscreteRangeDegree) {
			final DiscreteRangeDegree discDegree = (DiscreteRangeDegree) designDecision;
			final int i = Integer.parseInt(decisionString);
			if (!DSEDecoder.validRange(i, discDegree, discDegree.getFrom(), discDegree.getTo())) {
				throw ExceptionHelper
						.createNewCoreException("Error: Value " + i + "\" is not a valid value for degree " + designDecision + " " + DegreeOfFreedomHelper.getDegreeDescription(designDecision));
			}
			final DiscreteRangeChoice discChoice = factory.createDiscreteRangeChoice();
			discChoice.setChosenValue(i);
			choice = discChoice;
		} else if (designDecision instanceof ClassDegree) {

			final ClassChoice enumChoice = factory.createClassChoice();
			final Entity entity = DSEDecoder.getEntityFor((ClassDegree) designDecision, decisionString);
			if (entity == null) {
				throw ExceptionHelper.createNewCoreException(
						"Error: Decision string \"" + decisionString + "\" is not a valid value for degree " + designDecision + " " + DegreeOfFreedomHelper.getDegreeDescription(designDecision));
			}
			enumChoice.setChosenValue(entity);
			choice = enumChoice;
		} else if (designDecision instanceof SchedulingPolicyDegree) {

			final ClassChoice schedChoice = factory.createClassChoice();
			SchedulingPolicy chosenPolicy = null;

			final List<EObject> options = ((SchedulingPolicyDegree) designDecision).getClassDesignOptions();
			for (final EObject option : options) {
				if (option instanceof SchedulingPolicy) {
					final SchedulingPolicy policy = (SchedulingPolicy) option;
					if (policy.toString().equals(decisionString)) {
						chosenPolicy = policy;
					}

				}
			}

			if (chosenPolicy == null) {
				throw ExceptionHelper.createNewCoreException(
						"Error: Decision string \"" + decisionString + "\" is not a valid value for degree " + designDecision + " " + DegreeOfFreedomHelper.getDegreeDescription(designDecision));
			}
			schedChoice.setChosenValue(chosenPolicy);
			choice = schedChoice;
		} else if (designDecision instanceof NumberOfCoresDegree) {
			NumberOfCoresDegree numOfCoresDegree = (NumberOfCoresDegree) designDecision;
			DiscreteRangeChoice discreteRangeChoice = factory.createDiscreteRangeChoice();
			int numberOfCores = Integer.parseInt(decisionString);
			// TODO check that within range
			discreteRangeChoice.setChosenValue(numberOfCores);
			choice = discreteRangeChoice;
		} else {
			DSEDecoder.logger.warn("There was an unrecognised design decision " + designDecision.getClass());
			return null;
		}
		choice.setDegreeOfFreedomInstance(designDecision);
		return choice;
	}

	private static boolean validRange(final double value, final RangeDegree designDecision, final double from, final double to) {
		return (value >= from && value <= to);
	}

	private static Entity getEntityFor(final ClassDegree designDecision, final String decisionString) {
		final List<Entity> entities = new ArrayList<>();
		for (final EObject entity : designDecision.getClassDesignOptions()) {
			if (entity instanceof Entity) {
				entities.add((Entity) entity);
			}
		}
		return DSEDecoder.getEntityByName(entities, decisionString);
	}

	private static Entity getEntityByName(final List<Entity> entities, final String decisionString) {
		for (final Entity entity : entities) {
			if (DSEDecoder.getDecisionString(entity).equals(decisionString)) {
				return entity;
			}
		}
		return null;
	}

	/**
	 * Edits the passed genotype by inserting the passed choice at the index for
	 * the passed {@link DegreeOfFreedomInstance}.
	 *
	 * @param genotype
	 * @param degree
	 * @param choice
	 */
	public static void applyChangeToGenotype(final DesignDecisionGenotype genotype, final DegreeOfFreedomInstance degree, final Choice choice) {
		final int index = Opt4JStarter.getProblem().getDesignDecisions().indexOf(degree);
		genotype.set(index, choice);
	}

}
