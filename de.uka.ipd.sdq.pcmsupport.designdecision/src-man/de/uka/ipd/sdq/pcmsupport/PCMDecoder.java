package de.uka.ipd.sdq.pcmsupport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.exception.InvalidChoiceForDegreeException;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcmsupport.designdecision.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcmsupport.designdecision.impl.GenomeToCandidateModelTransformationImpl;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcmsupport.helper.EMFHelper;
import genericdesigndecision.Choice;
import genericdesigndecision.ClassChoice;
import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.AClassDegree;
import genericdesigndecision.genericDoF.AContinuousRangeDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.genericDoF.ADiscreteRangeDegree;
import genericdesigndecision.genericDoF.ARangeDegree;
import genericdesigndecision.impl.GenericdesigndecisionFactoryImpl;
import genericdesigndecision.universalDoF.UniversalDoF;

/**
 * The {@link PCMDecoder} is responsible for converting the genotypes into
 * proper PCM instances that can then be analysed.
 *
 * @author Anne
 *
 */
public class PCMDecoder {

    /** Logger for log4j. */
    private static Logger logger =
            Logger.getLogger("de.uka.ipd.sdq.dsexplore");

    /** Store first MTTF and rate values to adjust later MTTF with (see {@link #applyChangeProcessingRateDecision(ContinuousProcessingRateDegree, Choice)}).*/
    private double initialMTTF = Double.NaN;
    /** @see #initialMTTF */
    private double initialRate = Double.NaN;
    private static double intervalTime = 0.0;

    public PCMPhenotype decode(PCMInstance pcmInstance, final DesignDecisionGenotype genotype) {

    	final PCMInstance pcm = pcmInstance;

        //new transformation. Transition phase: Only for those DoF that are not explicitly modelled.
        final GenomeToCandidateModelTransformation trans = new GenomeToCandidateModelTransformationImpl();

        // first use new transformation.
        List<Choice> notTransformedChoices;
        try {
            notTransformedChoices = trans.transform(pcm, genotype.getEMFCandidate());
        } catch (final Exception e) {
            // try to continue for now
            logger.warn("Error when executing GDoF transformation. I will try to ignore it and continue. Failure was:");
            e.printStackTrace();
            notTransformedChoices = genotype;
        }

        // then, use old way for choices that have not been transformed, e.g. because there is no GDoF defined for them.
        // adjust values as in genotype
        for (final Choice doubleGene : notTransformedChoices) {

            applyChange(doubleGene.getDofInstance(), doubleGene, trans, pcm);
        }

        final String genotypeString = genotype.toString();

        //encapsulate as phenotype
        //return new PCMPhenotype(pcm.deepCopy(),genotypeStringBuilder.toString());
        return new PCMPhenotype(pcm, genotypeString, genotype.getNumericID());
    }

    /**
     * Applies the given change to the initial pcm instance (as this is
     * referenced by the design decisions. More precisely, this one calls
     * calls specialized methods for dealing with different types of design
     * decisions.
     *
     * @param designDecision
     * @param pcm
     * @param choice The new value the design decision should take.
     * @param trans
     * @param pcm
     */
    private void applyChange(final ADegreeOfFreedom designDecision, final Choice choice, final GenomeToCandidateModelTransformation trans, final PCMInstance pcm) {

        /**
         * TODO Make the selection of the appropriate applyChange method more implicit. Maybe move the method to DesignDecision itself.
         */
        if (ProcessingRateDegree.class.isInstance(designDecision)){
            this.applyChangeProcessingRateDecision((ProcessingRateDegree)designDecision, choice);

            // Monitoring degree added
            //added by Suman Jojiju
        } else if(MonitoringDegree.class.isInstance(designDecision)) {
            this.applyChangeMonitoringDecision((MonitoringDegree) designDecision,choice);

        }else if (AssembledComponentDegree.class.isInstance(designDecision)){
            this.applyChangeAssembledComponentDecision((AssembledComponentDegree)designDecision, choice);
        } else if (AllocationDegree.class.isInstance(designDecision)){
            this.applyChangeAllocationDecision((AllocationDegree)designDecision, choice);
        } else if (SchedulingPolicyDegree.class.isInstance(designDecision)){
            this.applyChangeSchedulingDecision((SchedulingPolicyDegree)designDecision, choice);
        } else if (CapacityDegree.class.isInstance(designDecision)){
            this.applyChangeCapacityDecision((CapacityDegree)designDecision, choice);
        } else if (NumberOfCoresDegree.class.isInstance(designDecision)){
            this.applyChangeNumberOfCoresDecision((NumberOfCoresDegree)designDecision, choice);
        } else if (ResourceContainerReplicationDegree.class.isInstance(designDecision)){
            this.applyChangeResourceContainerReplicationDegree((ResourceContainerReplicationDegree)designDecision, choice, pcm);
        } else {
            try {
                trans.transformChoice(pcm, choice);
            } catch (final Exception e){
                logger.error("There was an unrecognised design decision "+designDecision.getClass()+ " or a problem when handling a generic DoF");
                e.printStackTrace();
            }
        }
    }


    private void applyChangeResourceContainerReplicationDegree(final ResourceContainerReplicationDegree designDecision, final Choice choice, final PCMInstance pcm) {

        if (!(choice instanceof DiscreteRangeChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }
        final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice)choice;

        final int numberOfServers = discreteChoice.getChosenValue();

        final EObject changeableEntity = designDecision.getPrimaryChanged();
        if (!(changeableEntity instanceof ResourceContainer)){
            throwInvalidEntityException(designDecision, changeableEntity, ResourceContainer.class);
        }
        final ResourceContainer server = (ResourceContainer)changeableEntity;

        if (numberOfServers < 1){
            throw new ChoiceOutOfBoundsException(discreteChoice);
        }
        
        // first reset the changes possibly made for earlier candidates
        final List<ResourceContainer> allServers = pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        final List<ResourceContainer> previousReplicasToRemove = new ArrayList<ResourceContainer>();
        for (final ResourceContainer resourceContainer : allServers) {
            if (resourceContainer.getId().contains(server.getId()) && resourceContainer.getEntityName().contains("Replica")){
                previousReplicasToRemove.add(resourceContainer);
            }
        }
        allServers.removeAll(previousReplicasToRemove);
        // also remove them from linking resources
        final List<LinkingResource> linkingResources = pcm.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
        for (final LinkingResource linkingResource : linkingResources) {
            linkingResource.getConnectedResourceContainers_LinkingResource().removeAll(previousReplicasToRemove);
        }

        final List<AllocationContext> allocationContextsToRemove = new ArrayList<AllocationContext>();
        for (final AllocationContext allocationContext : pcm.getAllocation().getAllocationContexts_Allocation()) {
            if (previousReplicasToRemove.contains(allocationContext.getResourceContainer_AllocationContext())){
                allocationContextsToRemove.add(allocationContext);
            }
        }
        pcm.getAllocation().getAllocationContexts_Allocation().removeAll(allocationContextsToRemove);

        // Apply the current value of the genome.
        if (numberOfServers == 1){
            // no replication, keep original model with just one resource container.
            // XXX: assumes that the original model has no replication.
        } else {
            // retrieve components deployed to this server
            final List<AllocationContext> allocationContexts = pcm.getAllocation().getAllocationContexts_Allocation();
            final List<AllocationContext> allocationContextsOnServer = getAllocationContextsOnServer(allocationContexts, server);

            // the initial server is already there, so add numberOfServers - 1 new servers
            for (int i = 1; i < numberOfServers; i++){
                // add a server, replicate all components on it.

             	final ResourceContainer serverCopy = EcoreUtil.copy(server);
             	
             	// need to change the ids as all ids need to be unique. 
                serverCopy.setId(serverCopy.getId()+i);
                serverCopy.setEntityName(serverCopy.getEntityName()+"Replica"+i);
                for (ProcessingResourceSpecification processor : serverCopy.getActiveResourceSpecifications_ResourceContainer()){
                	processor.setId(processor.getId()+i);
                }
               
                pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment().add(serverCopy);

                // connect the new server copy to all linking resources that the old one is connected to
                for (final LinkingResource linkingResource : linkingResources) {
                    if (linkingResource.getConnectedResourceContainers_LinkingResource().contains(server)){
                        linkingResource.getConnectedResourceContainers_LinkingResource().add(serverCopy);
                    }
                }

                for (final AllocationContext allocationContext : allocationContextsOnServer) {
                    final AllocationContext allocationContextCopy = EcoreUtil.copy(allocationContext);
                    allocationContextCopy.setId(allocationContextCopy.getId()+i);
                    allocationContextCopy.setEntityName(allocationContextCopy.getEntityName() + "Replica" + i);

                    allocationContextCopy.setResourceContainer_AllocationContext(serverCopy);

                    pcm.getAllocation().getAllocationContexts_Allocation().add(allocationContextCopy);
                }
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
			List<ExchangeComponentRule> exchangeComponentRules = ((ResourceContainerReplicationDegreeWithComponentChange) designDecision)
					.getExchangeComponentRule();
			int index = numberOfServers - designDecision.getFrom();
			for (ExchangeComponentRule exchangeComponentRule : exchangeComponentRules) {
				if (index >= 0 && index < exchangeComponentRule.getRepositoryComponent().size()) {
					RepositoryComponent repoCompToUse = exchangeComponentRule.getRepositoryComponent().get(index);
					AssemblyContext assemblyContextToChange = exchangeComponentRule.getAllocationContext()
							.getAssemblyContext_AllocationContext();
					RepositoryComponent currentComponent = assemblyContextToChange.getEncapsulatedComponent__AssemblyContext();
					
					//Do not replace component if it is already assembled.  
					if (!EMFHelper.checkIdentity(currentComponent, repoCompToUse)) {
						AlternativeComponent.getInstance().applyChange(assemblyContextToChange, repoCompToUse);
					}
				} else {
					throw new ChoiceOutOfBoundsException(discreteChoice,
							"Looking for index " + index
									+ "in RepositoryComponents of ResourceContainerReplicationDegreeWithComponentChange "
									+ "degree for number of servers "
									+ numberOfServers + ", but no such component available");
				}
					
			}

		}
    }

    private List<AllocationContext> getAllocationContextsOnServer(
            final List<AllocationContext> allocationContexts, final ResourceContainer server) {
        final List<AllocationContext> allocationContextsOnThisServer = new LinkedList<AllocationContext>();
        for (final AllocationContext allocationContext : allocationContexts) {
            if (EMFHelper.checkIdentity(allocationContext.getResourceContainer_AllocationContext(), server)){
                allocationContextsOnThisServer.add(allocationContext);
            }
        }
        return allocationContextsOnThisServer;
    }

    private void applyChangeNumberOfCoresDecision(
            final NumberOfCoresDegree designDecision, final Choice choice) {
        if (!(choice instanceof DiscreteRangeChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }

        final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice)choice;

        final ProcessingResourceSpecification rightPrs = getProcessingRateSpecification(designDecision);
        rightPrs.setNumberOfReplicas(discreteChoice.getChosenValue());

    }

    private void applyChangeCapacityDecision(final CapacityDegree designDecision,
            final Choice choice) {
        if (!(choice instanceof DiscreteRangeChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }

        final DiscreteRangeChoice discreteChoice = (DiscreteRangeChoice)choice;

        final PassiveResource passiveResource = (PassiveResource)designDecision.getPrimaryChanged();
        passiveResource.getCapacity_PassiveResource().setSpecification(String.valueOf(discreteChoice.getChosenValue()));

    }

    private void applyChangeAllocationDecision(
            final AllocationDegree designDecision, final Choice choice) {

        if (!(choice instanceof ClassChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }
        final ClassChoice enumChoice = (ClassChoice)choice;

        final EObject entity = enumChoice.getChosenValue();
        if (!(entity instanceof ResourceContainer)){
            throwInvalidEntityException(designDecision,entity,ResourceContainer.class);
        }

        final ResourceContainer rc = (ResourceContainer)entity;

        ((AllocationContext)designDecision.getPrimaryChanged()).setResourceContainer_AllocationContext(rc);

        logger.debug("Handling a "+designDecision.getClass()+", setting resource container to "+rc.getEntityName()+ " for allocation context "+designDecision.getPrimaryChanged());

    }

    private void applyChangeSchedulingDecision(
            final SchedulingPolicyDegree designDecision, final Choice choice) {
        if (!(choice instanceof ClassChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }

        final ClassChoice schedChoice = (ClassChoice)choice;
        final SchedulingPolicy chosenPolicy = (SchedulingPolicy) schedChoice.getChosenValue();

        final ProcessingResourceSpecification rightPrs = getProcessingRateSpecification(designDecision);

        rightPrs.setSchedulingPolicy(chosenPolicy);

    }

    /**
     * @see applyChange(DesignDecision, PCMInstance, Double)
     * @param designDecision
     * @param pcm
     * @param doubleGene
     */
    private void applyChangeProcessingRateDecision (final ProcessingRateDegree designDecision, final Choice choice) {
        //XXX The value is changed in the original model, not in a copy.

        if (!(choice instanceof ContinousRangeChoice || choice instanceof DiscreteRangeChoice)){
            throwNewInvalidChoiceException(designDecision,choice);
        }

        double newRate = 0;
        if (choice instanceof ContinousRangeChoice){
            final ContinousRangeChoice doubleGene = (ContinousRangeChoice)choice;
            newRate = doubleGene.getChosenValue();
        } else {
            final DiscreteRangeChoice doubleGene = (DiscreteRangeChoice)choice;
            final DiscreteProcessingRateDegree degree = (DiscreteProcessingRateDegree)designDecision;
            newRate = degree.getFrom() + ((degree.getTo() - degree.getFrom()) / degree.getNumberOfSteps()) * doubleGene.getChosenValue();

        }

        final ProcessingResourceSpecification rightPrs = getProcessingRateSpecification(designDecision);

        // get initial models MTTF and rate to scale upcoming candidates MTTF with
        if (Double.isNaN(this.initialRate)){
            //old spec for adjusting MTTF
            final String oldRateString = rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification();
            this.initialRate = CostUtil.getInstance().getDoubleFromSpecification(oldRateString);
        }
        if (Double.isNaN(this.initialMTTF)){
            this.initialMTTF = rightPrs.getMTTF();
        }

        final double mttf = this.initialMTTF * newRate / this.initialRate;

        //round to just four digits after decimal sign, to maybe have no errors by the above
        //long l = (int)Math.round(mttf * 100000000); // truncates
        //mttf = l / 100000000.0;

        rightPrs.getProcessingRate_ProcessingResourceSpecification().setSpecification(String.valueOf(newRate));
        rightPrs.setMTTF(mttf);

        logger.debug("Handling a "+designDecision.getClass()+", setting rate to "+newRate+" and MTTF to "+mttf+" (inital MTTF: "+this.initialMTTF+")");
    }

    //added by Suman Jojiju

    private void applyChangeMonitoringDecision(final MonitoringDegree designDecision,final Choice choice) {
        double newinterval = 0.0;
        if (choice instanceof ContinousRangeChoice){
            final ContinousRangeChoice doubleGene = (ContinousRangeChoice)choice;
            //FIXME: cannot locate Intervall class in SimuLizar after pms has been renamed to prm.
            //Intervall interval = (Intervall)designDecision.getPrimaryChanged();
            newinterval = doubleGene.getChosenValue();
            PCMDecoder.intervalTime = newinterval;
            //interval.setIntervall(newinterval);
            throw new UnsupportedOperationException("MonitoringDegree is not supported anymore after recent SimuLizar refactoring renaming the pms package to psm. Please update PCMDecoder.class and import the required Inervall file from where it is located now. Please also restore the Simulizar plugin dependencies as needed.");
        }
    }

    public static double returnInterval() {
        return PCMDecoder.intervalTime;
    }

    private ProcessingResourceSpecification getProcessingRateSpecification(
            final ProcessingResourceDegree designDecision) {
        final ResourceContainer rc = ((ResourceContainer)designDecision.getPrimaryChanged());
        final ProcessingResourceType prt = designDecision.getProcessingresourcetype();

        ProcessingResourceSpecification rightPrs = null;
        for (final ProcessingResourceSpecification prs : rc.getActiveResourceSpecifications_ResourceContainer()) {
            if (EMFHelper.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(),prt)){
                rightPrs = prs;
                break;
            }
        }

        if (rightPrs == null){
            throw new RuntimeException("Invalid degree of freedom "+designDecision.toString()+". The references ProcessingResourceType is not available in the given ResourceContainer.");
        }
        return rightPrs;
    }

    private void throwNewInvalidChoiceException(final ADegreeOfFreedom designDecision, final Choice choice) {
        throw new InvalidChoiceForDegreeException(choice);
    }

    private void applyChangeAssembledComponentDecision ( final AssembledComponentDegree designDecision, final Choice choice) {

        if (!(choice instanceof ClassChoice)){
            throwNewInvalidChoiceException(designDecision, choice);
        }
        final ClassChoice enumChoice = (ClassChoice)choice;

        //use the order of the enumeration of EquivalentComponents in the Domain
        final EObject entity = enumChoice.getChosenValue();
        if (!(entity instanceof RepositoryComponent)){
            throwInvalidEntityException(designDecision,entity,RepositoryComponent.class);
        }
        final RepositoryComponent componentToBeAssembled = (RepositoryComponent)entity;

        final AssemblyContext changedAssemblyContext = (AssemblyContext)designDecision.getPrimaryChanged();
        final RepositoryComponent currentComponent = changedAssemblyContext.getEncapsulatedComponent__AssemblyContext();

        //Do not replace component if it is already assembled.
        if (!EMFHelper.checkIdentity(currentComponent, componentToBeAssembled)){
            AlternativeComponent.getInstance().applyChange(changedAssemblyContext, componentToBeAssembled);
        }


        logger.debug("Handling a "+designDecision.getClass()+", using component "+componentToBeAssembled.getEntityName());
    }

    private void throwInvalidEntityException(
            final ADegreeOfFreedom designDecision, final EObject changeableEntity,
            final Class<?> expectedClass) {
        throw new RuntimeException("Entity "+changeableEntity+" of type "+changeableEntity.getClass().getName()+" is not an applicable value for degree of freedom "+designDecision.getClass().getName()+", required type is "+expectedClass.getName());

    }

    public String getDecisionString(final Choice choice){
        String result = choice.getValue().toString();

        if (choice.getValue() instanceof Entity){
            final Entity entity = (Entity)choice.getValue();
            result = entity.getEntityName() + " (ID: "+entity.getId()+")";
        }

        //		if (choice instanceof ContinousRangeChoice){
        //			result = AResultsWriter.formatDouble(((ContinousRangeChoice) choice).getChosenValue());
        //		} else if (choice instanceof ClassChoice){
        //			if (((ClassChoice) choice).getChosenValue() instanceof Entity){
        //				result = ((Entity)((ClassChoice)choice).getChosenValue()).getEntityName();
        //			} else {
        //				result = ((ClassChoice)choice).getChosenValue().toString();
        //			}
        //		} else if (choice instanceof DiscreteRangeChoice){
        //			result = String.valueOf(((DiscreteRangeChoice)choice).getChosenValue());
        //		} else {
        //			logger.warn("There was an unrecognised design decision "+designDecision.getClass());
        //		}
        return result;
    }

    /**
     * Calls getDoubleValueFor(String decisionString, DesignDecision designDecision)
     * @param index
     * @param decisionString
     * @return
     * @throws CoreException
     */
    public static Choice getChoiceForIndex(final int index, final String decisionString) throws CoreException{

        final ADegreeOfFreedom designDecision = UniversalDoF.eINSTANCE.getTarget().getDesignDecision(index);

        final Choice value = getChoiceFor(decisionString, designDecision);

        return value;

    }

    public static Choice getChoiceFor(final String decisionString,
            final ADegreeOfFreedom designDecision) throws CoreException {
        Choice choice;

        final GenericdesigndecisionFactory factory = GenericdesigndecisionFactoryImpl.init();

        if (designDecision instanceof AContinuousRangeDegree){
            final AContinuousRangeDegree contDegree = (AContinuousRangeDegree) designDecision;
            final double d = Double.parseDouble(decisionString);
            if (!validRange(d, contDegree, contDegree.getFrom(), contDegree.getTo())){
                throw ExceptionHelper.createNewCoreException("Error: Value "+d+" is not a valid value for degree "+designDecision+" "+designDecision.getDegreeDescription());
            }
            final ContinousRangeChoice contChoice = factory.createContinousRangeChoice();
            contChoice.setChosenValue(d);
            choice = contChoice;
        } else if (designDecision instanceof ADiscreteRangeDegree){
            final ADiscreteRangeDegree discDegree = (ADiscreteRangeDegree) designDecision;
            final int i = Integer.parseInt(decisionString);
            if (!validRange(i, discDegree, discDegree.getFrom(), discDegree.getTo())){
                throw ExceptionHelper.createNewCoreException("Error: Value "+i+"\" is not a valid value for degree "+designDecision+" "+designDecision.getDegreeDescription());
            }
            final DiscreteRangeChoice discChoice = factory.createDiscreteRangeChoice();
            discChoice.setChosenValue(i);
            choice = discChoice;
        } else if (designDecision instanceof AClassDegree){

            final ClassChoice enumChoice = factory.createClassChoice();
            final Entity entity = getEntityFor((AClassDegree)designDecision, decisionString);
            if (entity == null){
                throw ExceptionHelper.createNewCoreException("Error: Decision string \""+decisionString+"\" is not a valid value for degree "+designDecision+" "+designDecision.getDegreeDescription());
            }
            enumChoice.setChosenValue(entity);
            choice = enumChoice;
        } else if (designDecision instanceof SchedulingPolicyDegree){

            final ClassChoice schedChoice = factory.createClassChoice();
            SchedulingPolicy chosenPolicy = null;

            final List<EObject> options = ((SchedulingPolicyDegree) designDecision).getClassDesignOptions();
            for (final EObject option : options) {
                if (option instanceof SchedulingPolicy){
                    final SchedulingPolicy policy = (SchedulingPolicy)option;
                    if (policy.getEntityName().equals(decisionString)) {
                        ;
                    }
                    chosenPolicy = policy;
                }
            }

            if (chosenPolicy == null){
                throw ExceptionHelper.createNewCoreException("Error: Decision string \""+decisionString+"\" is not a valid value for degree "+designDecision+" "+designDecision.getDegreeDescription());
            }
            schedChoice.setChosenValue(chosenPolicy);
            choice = schedChoice;
        } else if (designDecision instanceof NumberOfCoresDegree){
        	NumberOfCoresDegree numOfCoresDegree = (NumberOfCoresDegree)designDecision;
        	DiscreteRangeChoice discreteRangeChoice = factory.createDiscreteRangeChoice();
        	int numberOfCores = Integer.parseInt(decisionString);
        	//TODO check that within range
        	discreteRangeChoice.setChosenValue(numberOfCores);
        	choice = discreteRangeChoice;
        } else {
            logger.warn("There was an unrecognised design decision "+designDecision.getClass());
            return null;
        }
        choice.setDofInstance(designDecision);
        return choice;
    }

    private static boolean validRange(final double value, final ARangeDegree designDecision, final double from,
            final double to) {
        return (value >= from && value <= to);
    }

    private static Entity getEntityFor(final AClassDegree designDecision,
            final String decisionString) {
        final List<Entity> entities = new ArrayList<Entity>();
        for (final EObject entity : designDecision.getClassDesignOptions()) {
            if (entity instanceof Entity){
                entities.add((Entity) entity);
            }
        }
        return getEntityByName(entities, decisionString);
    }

    private static Entity getEntityByName(final List<Entity> entities,
            final String decisionString) {
        for (final Entity entity : entities) {
            if (entity.getEntityName().equals(decisionString) || decisionString.contains(entity.getId())){
                return entity;
            }
        }
        return null;
    }

    /**
     * Edits the passed genotype by inserting the passed choice at the index
     * for the passed {@link DegreeOfFreedomInstance}.
     * @param genotype
     * @param degree
     * @param choice
     */
    public static void applyChangeToGenotype(final DesignDecisionGenotype genotype, final ADegreeOfFreedom degree, final Choice choice){
        final int index = UniversalDoF.eINSTANCE.getTarget().getDesignDecisions().indexOf(degree);
        genotype.set(index, choice);
    }


}
