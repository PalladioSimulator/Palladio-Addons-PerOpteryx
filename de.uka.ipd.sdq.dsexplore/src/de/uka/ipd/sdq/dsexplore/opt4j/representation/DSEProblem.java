package de.uka.ipd.sdq.dsexplore.opt4j.representation;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.impl.ComparisonImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.ocl.internal.evaluation.NumberUtil;
import org.eclipse.ocl.utilities.OCLFactory;
import org.modelversioning.emfprofile.EMFProfileFactory;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.impl.PCMRandomVariableImpl;
import org.palladiosimulator.pcm.parameter.ParameterFactory;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.impl.ParameterImpl;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.ResourceRepository;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractSimuComExtensionJob;
import de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents.AlternativeComponent;
import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.DegreeOfFreedomHelper;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixDesignDecisionReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.dsexplore.launch.OptimisationJob;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.cost.util.costResourceImpl;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofResourceImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
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
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionRepositoryImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.util.resourcerepositoryResourceImpl;
import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * The {@link DSEProblem} defines the problem. Therefore, it reads in the
 * current PCM instances and identifies the available design options to define
 * the design space.
 *
 * @author Anne
 *
 */
public class DSEProblem implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

    /**
     * Is changed during the evaluation, as the decisions refer to it.
     */
    private final PCMInstance initialInstance;

    private DecisionSpace pcmProblem;
    private final designdecisionFactory designDecisionFactory;
    private final specificFactory specificDesignDecisionFactory;

    //private PCMInstance currentInstance;

    private MDSDBlackboard blackboard;

	private List<DesignDecisionGenotype> initialGenotypeList = null;

    private final DSEWorkflowConfiguration dseConfig;

    private DesignDecisionGenotype initialGenotype;

    //FIXME testing purpose, if it works try to implement it without the flag 
    //I need to know if this is the decoding of the first candidate
    private boolean firstDecode;


    /**
     * @param pcmInstance
     * @throws CoreException
     */
    public DSEProblem(final DSEWorkflowConfiguration dseConfig, final PCMInstance pcmInstance, final MDSDBlackboard blackboard) throws CoreException{
        this.dseConfig = dseConfig;
        
        final boolean newProblem = dseConfig.isNewProblem();
        this.initialInstance = pcmInstance;
        //this.currentInstance = null;
        this.blackboard = blackboard;
        this.setFirstDecode(true);
        //EcoreUtil.Copier deep copy

        this.designDecisionFactory = designdecisionFactoryImpl.init();
        this.specificDesignDecisionFactory = specificFactoryImpl.init();

        if (newProblem){
            initialiseProblem();
        } else {
            //Alternative Component has to be called to create the mapping for all AssemblyContexts and their roles,
            //in order to be able to exchange implementations later. The design decisions calculated here are not kept, only
            //the mapping inside AlternativeComponent.getInstance()
            AlternativeComponent.getInstance().generateDesignDecisions(pcmInstance);
            final DecisionSpace problem = loadProblem();
            this.pcmProblem = problem;
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

    public PCMResourceSetPartition makeLocalCopy(PCMResourceSetPartition partition, boolean storeToBlackboard) {
    	
    	
    	PCMResourceSetPartition pcmPartition = null;
    			
    	if(partition == null)pcmPartition = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
    	else  pcmPartition = partition;
    	//PCMResourceSetPartition pcmPartitionCurrent = (PCMResourceSetPartition) this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
    	
    	//boolean newProb = this.dseConfig.isNewProblem();
    	
//    	if (this.currentInstance.equals(this.initialInstance)) {
//    		return new PCMInstance(pcmPartitionCurrent);
//    	}
    	
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
          
        org.palladiosimulator.pcm.system.System system = pcmPartition.getSystem();
        Allocation allocation = pcmPartition.getAllocation();
        List<Repository> repositories = pcmPartition.getRepositories();
        ResourceEnvironment resEnv = pcmPartition.getResourceEnvironment();
        UsageModel usagemodel =  pcmPartition.getUsageModel();
        //ResourceRepository resRep = pcmPartition.getResourceRepository();
        ResourceRepository resRep = pcmPartition.getResourceTypeRepository();
        CostRepository costRepo = null;
        
        for (Resource resource : pcmPartition.getResourceSet().getResources()) {
        	if (resource instanceof costResourceImpl) {
        		for (EObject cr : resource.getContents()) {
        			costRepo = (CostRepository)cr;
        			break;
        		}
        		
        	}
        }
        
        PCMResourceSetPartition pcmModel = new PCMResourceSetPartition();
        
        if (costRepo != null) {
        	CostRepository costLocal = (CostRepository) copier.copy(costRepo);
        
	        copier.copyReferences();
	        URI uri = URI.createURI(costRepo.eResource().getURI()+"copy."+costRepo.eResource().getURI().fileExtension());
	        pcmModel.setContents(uri, costLocal);
        }
        
        org.palladiosimulator.pcm.system.System sys = (org.palladiosimulator.pcm.system.System)copier.copy(system);
        copier.copyReferences();
        URI uri = URI.createURI(system.eResource().getURI()+"copy."+system.eResource().getURI().fileExtension());
        pcmModel.setContents(uri, sys);
        
        Allocation localAllocation = (Allocation)copier.copy(allocation);
        copier.copyReferences();
        uri = URI.createURI(allocation.eResource().getURI()+"copy."+allocation.eResource().getURI().fileExtension());
        pcmModel.setContents(uri, localAllocation);
 
        for (Repository repo : repositories) {
        	if (repo.eResource().getURI().toString().contains("pathmap")) uri = repo.eResource().getURI();
        	else uri = URI.createURI(repo.eResource().getURI()+"copy."+repo.eResource().getURI().fileExtension());
        	Repository localRepo = (Repository)copier.copy(repo);
        	copier.copyReferences();
        	pcmModel.setContents(uri, localRepo);
        }
        
        ResourceEnvironment localResEnv = (ResourceEnvironment)copier.copy(resEnv);
        copier.copyReferences();
        uri = URI.createURI(resEnv.eResource().getURI()+"copy."+resEnv.eResource().getURI().fileExtension());
        pcmModel.setContents(uri, localResEnv);
        
        UsageModel localUsagemodel = (UsageModel)copier.copy(usagemodel);
        copier.copyReferences();
        uri = URI.createURI(usagemodel.eResource().getURI()+"copy."+usagemodel.eResource().getURI().fileExtension());
        pcmModel.setContents(uri, localUsagemodel);
        
        ResourceRepository localResRepo = (ResourceRepository)copier.copy(resRep);
        copier.copyReferences();
        uri = URI.createURI(resRep.eResource().getURI().toString());
        pcmModel.setContents(uri, localResRepo);
        
        //TODO make copy of decorator if they are changed -> decos should generally not be changed
        //Copy COST MODEL like the rest!!!
        for (DegreeOfFreedomInstance dofi : this.pcmProblem.getDegreesOfFreedom()) {
        	EList<EObject> decos = dofi.getDecoratorModel();
        	for (EObject deco : decos) {
        		String name = deco.eClass().getName().toLowerCase()+'$';
        		if (deco instanceof DiffModelRepositoryImpl) {
        			GenomeToCandidateModelTransformation.getDecorator().put(name, deco);
        			continue;
        		}
        		EObject localCopy = copier.copy(deco);
        		copier.copyReferences();
        		GenomeToCandidateModelTransformation.getDecorator().put(name, localCopy);
        	}
        }
        
//        ResourceSet rset = pcmPartition.getResourceSet();
//        
//        for (Resource o : rset.getResources()) {
//        	if (o instanceof resourcerepositoryResourceImpl) {
//        		//ResourceDescriptionRepository rrr = (ResourceDescriptionRepository)o;
//        	}
//        }
        
        PCMInstance pcm = new PCMInstance(pcmModel);
        
        
        //PCMResourceSetPartition part = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
       
        //PCMInstance pcm = new PCMInstance(part);

        if (storeToBlackboard) {
	        this.blackboard.removePartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
	        this.blackboard.addPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, pcmModel);
	        
	//        PCMResourceSetPartition pcmPartitionCurrentCopy = (PCMResourceSetPartition) this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
	//        PCMInstance pcmcopy = new PCMInstance(pcmPartitionCurrentCopy);
	//        org.palladiosimulator.pcm.system.System fromBB = pcmcopy.getSystem();
	//        org.palladiosimulator.pcm.system.System copied = pcm.getSystem();
	        
	        //this.setCurrentInstance(pcm);
        }
        PCMResourceSetPartition part = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
        return pcmModel;
	}
    
    private DecisionSpace loadProblem() throws CoreException {
        final URI filename = this.dseConfig.getDesignDecisionFileName();
        return this.loadProblem(filename);
    }

    private DecisionSpace loadProblem(final URI filename) throws CoreException{
        final ResourceSet pcmResourceSet = this.initialInstance.getAllocation().eResource().getResourceSet();

        final EObject eproblem = EMFHelper.loadFromXMIFile(filename, pcmResourceSet, designdecisionPackage.eINSTANCE);
        if (!(eproblem instanceof DecisionSpace)){
            throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Cannot read design decision file "+filename+". Please create a new one.", null));
        }
        final DecisionSpace problem = (DecisionSpace)eproblem;
        //Adjust references with the right loaded model objects in memory?

        final FixDesignDecisionReferenceSwitch visitor = new FixDesignDecisionReferenceSwitch(this.initialInstance);
        visitor.doSwitch(problem);

        EcoreUtil.resolveAll(eproblem);

        return problem;
    }
    private boolean isNumeric(String s) {  
	    return s.matches("[-+]?\\d*\\.?\\d+");  
	} 

    private List<DesignDecisionGenotype> determineInitialGenotype(final DecisionSpace problem) throws CoreException {
        final DesignDecisionGenotype genotype = new DesignDecisionGenotype();

        for (final DegreeOfFreedomInstance dd : problem.getDegreesOfFreedom()) {

            if (dd.getDof() != null) {
            	Object value = null;
            	if (!dd.getDecoratorModel().isEmpty() && dd.getDecoratorModel().get(0) instanceof DiffModelRepositoryImpl) {
            		value = ((DiffModelRepository)dd.getDecoratorModel().get(0)).getAvailableDiffModels_DiffRepository().get(0);
            	} else {
                final EStructuralFeature property = dd.getDof().getPrimaryChangeable().getChangeable();

                value = GenomeToCandidateModelTransformation.getProperty(dd.getPrimaryChanged(), property);
                if (value instanceof PCMRandomVariableImpl && dd instanceof ContinuousRangeDegree) {
                	value = Double.parseDouble(((PCMRandomVariable)value).getSpecification());
                }
            	}
                final Choice choice;
                if (value instanceof EObject) {
                    choice = this.designDecisionFactory.createClassChoice();
                    ((ClassChoice) choice).setChosenValue((EObject) value);
                } else if (value instanceof Double) {
                    choice = this.designDecisionFactory.createContinousRangeChoice();
                    ((ContinousRangeChoice) choice).setChosenValue((Double) value);
                } else if (value instanceof Integer) {
                    choice = this.designDecisionFactory.createDiscreteRangeChoice();
                    ((DiscreteRangeChoice) choice).setChosenValue((Integer) value);
                } else if (value instanceof Collection<?>) {
                	
                	choice = this.designDecisionFactory.createClassChoice();
                	Random generator = new Random();
                	EList<?> val = (EList<?>)value;
                	int i = generator.nextInt(val.size());
                	if (val.size() > 0 && val.get(0) instanceof ProcessingResourceSpecificationImpl) {
                		for (Object prs : val) {
                			if (((ProcessingResourceSpecification)prs).getActiveResourceType_ActiveResourceSpecification().getEntityName().equals("CPU")) {
                				((ClassChoice) choice).setChosenValue( (EObject) prs);
                				break;
                			}
                		}
                	} else {
                		((ClassChoice) choice).setChosenValue( (EObject) val.get(i));
                	}
                	
                /*
                 * If the value is a string then it is assumed that it is a specification value and it is parsed to
                 * an integer.
                 * TODO maybe it is necessary to check if its an integer or a double value.
                 */
                } else if (value instanceof String) {
                	int i = -1;
                	double d = -1.0;
                	Choice tempChoice = null;
                	if (isNumeric((String)value)) {
                		if (((String)value).contains(".")) {
                			d = Double.parseDouble((String)value);
                			tempChoice = this.designDecisionFactory.createContinousRangeChoice();
                            ((ContinousRangeChoice) tempChoice).setChosenValue((Double) d);
                		} else {
                			i = Integer.parseInt((String)value);
                			tempChoice = this.designDecisionFactory.createDiscreteRangeChoice();
                			((DiscreteRangeChoice) tempChoice).setChosenValue((Integer) i);
                		}
                	}
                	choice = tempChoice;
                	
                	
                } else {
                	throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Cannot cast " + value + " to an EObject, Integer, or Double. Please extend DSEProblem.determineInitialGenotype to handle your type of choice.", null));
                }


                choice.setDegreeOfFreedomInstance(dd);

                genotype.add(choice);
                
            } else if (dd instanceof ClassDegree) {

                final ClassChoice choice = this.designDecisionFactory.createClassChoice();
                choice.setDegreeOfFreedomInstance(dd);

                if (dd instanceof AssembledComponentDegree) {
                    final AssembledComponentDegree acd = (AssembledComponentDegree) dd;
                    final AssemblyContext ac = (AssemblyContext)acd.getPrimaryChanged();
                    final RepositoryComponent rc = ac.getEncapsulatedComponent__AssemblyContext();
                    choice.setChosenValue(rc);
                } else if (dd instanceof AllocationDegree){
                    final AllocationDegree ad = (AllocationDegree)dd;
                    final AllocationContext ac = (AllocationContext)ad.getPrimaryChanged();
                    final ResourceContainer rc = ac.getResourceContainer_AllocationContext();
                    choice.setChosenValue(rc);
                } else if (dd instanceof SchedulingPolicyDegree){

                    final ProcessingResourceType procType = ((SchedulingPolicyDegree)dd).getProcessingresourcetype();
                    final ResourceContainer rc = (ResourceContainer)dd.getPrimaryChanged();

                    SchedulingPolicy policy = null;

                    for (final ProcessingResourceSpecification proc : rc.getActiveResourceSpecifications_ResourceContainer()) {
                        if (EMFHelper.checkIdentity(proc.getActiveResourceType_ActiveResourceSpecification(),procType)){
                            policy = proc.getSchedulingPolicy();
                            break;
                        }
                    }
                    if (policy == null){
                        throw new RuntimeException("Invalid degree of freedom "+dd.toString()+". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
                    }
                    choice.setChosenValue(policy);
                    genotype.add(choice);

                } else {
                    throwUnknownDegreeException(dd);
                }

                //check if entity is in the domain
                if (!EMFHelper.contains(((ClassDegree) dd).getClassDesignOptions(), choice.getChosenValue())){
                    throw new ChoiceOutOfBoundsException(choice, "Error when determining initial genotype");
                }

                genotype.add(choice);
            } else if (dd instanceof ContinuousRangeDegree){
                /*
                 *
                 */
                final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
                choice.setDegreeOfFreedomInstance(dd);

                // Monitoring Degree added
                //added by Suman Jojiju
                if(dd instanceof MonitoringDegree){
                    //MonitoringDegree mnrt = (MonitoringDegree) dd;
                    final ContinuousRangeDegree crdobj = (ContinuousRangeDegree) dd;
                    //Intervall interval = (Intervall) (MonitoringDegree)crdobj.getPrimaryChanged();
                    //choice.setChosenValue(interval.getIntervall());
                    choice.setChosenValue(crdobj.getFrom());

                } else if (dd instanceof ContinuousProcessingRateDegree){
                    final ContinuousProcessingRateDegree prd = (ContinuousProcessingRateDegree)dd;
                    final ProcessingResourceSpecification rightPrs = getProcessingResourceSpec(prd);

                    if (rightPrs != null){
                        final double rate = CostUtil.getInstance().getDoubleFromSpecification(rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
                        choice.setChosenValue(rate);
                    } else {
                        throw new RuntimeException("Invalid degree of freedom "+dd.toString()+". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
                    }
                } else {
                    throwUnknownDegreeException(dd);
                }

                genotype.add(choice);
            } else if (dd instanceof DiscreteDegree){
                final DiscreteDegree degree = (DiscreteDegree)dd;

                final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
                choice.setDegreeOfFreedomInstance(degree);

                final EObject entity = degree.getPrimaryChanged();

                if (degree instanceof CapacityDegree){
                    final PassiveResource pr = (PassiveResource)entity;
                    choice.setChosenValue(Integer.valueOf(pr.getCapacity_PassiveResource().getSpecification()));

                } else if (degree instanceof NumberOfCoresDegree) {
                    final ProcessingResourceSpecification prd = getProcessingResourceSpec((ProcessingResourceDegree)degree);
                    choice.setChosenValue(prd.getNumberOfReplicas());
                } else if (degree instanceof DiscreteProcessingRateDegree){

                    final DiscreteProcessingRateDegree prd = (DiscreteProcessingRateDegree)dd;

                    final ProcessingResourceSpecification rightPrs = getProcessingResourceSpec(prd);

                    if (rightPrs != null){
                        if (!prd.isLowerBoundIncluded() || !prd.isUpperBoundIncluded()){
                            throw new RuntimeException("Only DiscreteProcessingRateDegrees with upper and lower bound included are supported so far, sorry. ");
                        }
                        final double rate = CostUtil.getInstance().getDoubleFromSpecification(rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
                        final double startStep = prd.getFrom();
                        final double endStep = prd.getTo();
                        final double stepwidth = (endStep - startStep) / prd.getNumberOfSteps();

                        final double chosenStep = (rate - startStep) / stepwidth;
                        choice.setChosenValue((int)chosenStep);
                    } else {
                        throw new RuntimeException("Invalid degree of freedom "+dd.toString()+". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
                    }
                } else if (degree instanceof ResourceContainerReplicationDegree){
                    choice.setChosenValue(1);

                } else {
                    throwUnknownDegreeException(dd);
                }
                genotype.add(choice);
            } else {
                throwUnknownDegreeException(dd);
            }
        };

        //determineProcessingRateDecisions(new ArrayList<DesignDecision>(), genotype);
        //determineAssembledComponentsDecisions(new ArrayList<DesignDecision>(), genotype);
        //determineAllocationDecisions(new ArrayList<DesignDecision>(), genotype);
        final List<DesignDecisionGenotype> result = new ArrayList<DesignDecisionGenotype>();
        result.add(genotype);
        this.initialGenotype = genotype;
        return result;
    }

    private ProcessingResourceSpecification getProcessingResourceSpec(
            final ProcessingResourceDegree prd) {
        final ResourceContainer rc = (ResourceContainer)prd.getPrimaryChanged();
        final List<ProcessingResourceSpecification> prsList = rc.getActiveResourceSpecifications_ResourceContainer();
        final ProcessingResourceType prt = prd.getProcessingresourcetype();

        ProcessingResourceSpecification rightPrs = null;
        for (final ProcessingResourceSpecification prs : prsList) {
            if (EMFHelper.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(),prt)){
                rightPrs = prs;
                break;
            }
        }
        return rightPrs;
    }


    private void throwUnknownDegreeException(final DegreeOfFreedomInstance dd) {
        throw new RuntimeException("Unknown degree of freedom "+dd.toString()+".");
    }

    /**
     * Initialises the degrees of freedoms and at the same time determines the initial genotype.
     */
    private void initialiseProblem() {
        this.pcmProblem = this.designDecisionFactory.createDecisionSpace();
        final List<DegreeOfFreedomInstance> dds = this.pcmProblem.getDegreesOfFreedom();

        //analyse PCM Instance and create design decisions
        //TODO: could this be possible with a M2M transformation?
        //First, only get design decisions for making resources faster.

        this.initialGenotypeList = new ArrayList<DesignDecisionGenotype>();
        final DesignDecisionGenotype initialCandidate = new DesignDecisionGenotype();
        determineProcessingRateDecisions(dds,initialCandidate);
        //find equivalent components
        determineAssembledComponentsDecisions(dds,initialCandidate);
        determineAllocationDecisions(dds,initialCandidate);
        //Quickfix: Add a Soap or RMI decision. This is not meta modelled.
        //determineSOAPOrRMIDecisions();
        determineCapacityDecisions(dds,initialCandidate);



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
    private void determineCapacityDecisions(final List<DegreeOfFreedomInstance> dds,
            final DesignDecisionGenotype genotype) {

        final List<Repository> repositories = this.initialInstance.getRepositories();
        for (final Repository repository : repositories) {
            final List<RepositoryComponent> components = repository.getComponents__Repository();
            for (final RepositoryComponent repositoryComponent : components) {
                if (repositoryComponent instanceof BasicComponent){

                    final BasicComponent basicComponent = (BasicComponent)repositoryComponent;
                    final List<PassiveResource> passiveResources = basicComponent.getPassiveResource_BasicComponent();
                    for (final PassiveResource passiveResource : passiveResources) {
                        final CapacityDegree capacityDegree = this.specificDesignDecisionFactory.createCapacityDegree();
                        capacityDegree.setPrimaryChanged(passiveResource);
                        capacityDegree.setFrom(1);
                        capacityDegree.setTo(Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));
                        dds.add(capacityDegree);

                        final DiscreteRangeChoice choice = this.designDecisionFactory.createDiscreteRangeChoice();
                        choice.setDegreeOfFreedomInstance(capacityDegree);
                        choice.setChosenValue(Integer.valueOf(passiveResource.getCapacity_PassiveResource().getSpecification()));

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
    private void determineAllocationDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
        final List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
        final List<ResourceContainer> rcs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();



        //each allocation context could be allocated on each container.
        for (final AllocationContext ac : acs) {
            final AllocationDegree ad = this.specificDesignDecisionFactory.createAllocationDegree();
            ad.setPrimaryChanged(ac);
            ad.getClassDesignOptions().addAll(rcs);
            dds.add(ad);

            final ClassChoice choice = this.designDecisionFactory.createClassChoice();
            choice.setDegreeOfFreedomInstance(ad);
            choice.setChosenValue(ac.getResourceContainer_AllocationContext());

            genotype.add(choice);
        }



    }


    /**
     * Be sure to add one design decision and one gene in the initial genotype at once. The index is important.
     * @param genotypeIndex
     */
    private void determineAssembledComponentsDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
        final AlternativeComponent ac = AlternativeComponent.getInstance();
        final List<AssembledComponentDegree> decisions = ac.generateDesignDecisions(this.initialInstance);

        for (final AssembledComponentDegree designDecision : decisions) {
            dds.add(designDecision);
            final RepositoryComponent currentlyAssembledComponent = ((AssemblyContext)designDecision.getPrimaryChanged()).getEncapsulatedComponent__AssemblyContext();

            final ClassChoice choice = this.designDecisionFactory.createClassChoice();
            choice.setDegreeOfFreedomInstance(designDecision);
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
    private void determineProcessingRateDecisions(final List<DegreeOfFreedomInstance> dds, final DesignDecisionGenotype genotype) {
        final List<ResourceContainer> resourceContainers = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        for (final ResourceContainer resourceContainer : resourceContainers) {
            final List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
            for (final ProcessingResourceSpecification resource : resources) {

                //Create ContinuousProcessingRateDegree
                final ContinuousProcessingRateDegree decision = this.specificDesignDecisionFactory.createContinuousProcessingRateDegree();
                decision.setLowerBoundIncluded(false);
                final double currentRate = CostUtil.getInstance().getDoubleFromSpecification(resource.getProcessingRate_ProcessingResourceSpecification().getSpecification());
                //XXX initial assumption: the highest possible processingRate is 10 times the current one.
                decision.setTo(currentRate * 2.0);
                decision.setFrom(currentRate * 0.5);
                decision.setPrimaryChanged(resourceContainer);
                decision.setProcessingresourcetype(resource.getActiveResourceType_ActiveResourceSpecification());
                dds.add(decision);

                final ContinousRangeChoice choice = this.designDecisionFactory.createContinousRangeChoice();
                choice.setDegreeOfFreedomInstance(decision);
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


    protected DegreeOfFreedomInstance getDesignDecision(final int index){
        return this.pcmProblem.getDegreesOfFreedom().get(index);
    }

    public List<DegreeOfFreedomInstance> getDesignDecisions(){
        return this.pcmProblem.getDegreesOfFreedom();
    }


    public PCMInstance getInitialInstance() {
    	// TODO rename to getCurrentInstance, return latest copy
    	// new method getCopyOfInitialInstance, which returns new copy of initialInstance
    	// and saves new copy as currentInstance?
    	return new PCMInstance((PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID));
        //return this.initialInstance;
    }
    
    public void setInitialInstance(PCMResourceSetPartition partition) {
    	this.blackboard.removePartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
    	this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, partition);
    }
    
    public PCMInstance getCurrentInstance() {
    	return new PCMInstance((PCMResourceSetPartition)blackboard
    			.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
    }
    
    public PCMResourceSetPartition getCurrentInstancePartition() {
    	return (PCMResourceSetPartition)blackboard
    			.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
    }
    
    public PCMResourceSetPartition getInitialInstancePartition() {
    	return (PCMResourceSetPartition)blackboard
    			.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
    }
    
//    public void setCurrentInstance(PCMInstance currentInstance) {
//		this.currentInstance = currentInstance;
//	}

    public DesignDecisionGenotype getGenotypeOfInitialPCMInstance(){
        return this.initialGenotype;
    }

    protected List<DesignDecisionGenotype> getInitialGenotypeList(){
        return this.initialGenotypeList;
    }


    public void saveProblem() {

        final URI filename = this.dseConfig.getDesignDecisionFileName();

        //		resourceSet.getPackageRegistry().put
        //		(designdecisionPackage.eNS_URI,
        //		 designdecisionPackage.eINSTANCE);

        EMFHelper.saveToXMIFile(this.pcmProblem, filename);

    }


    @Override
    public String toString(){

        String result = "";

        final List<DegreeOfFreedomInstance> decisions = this.pcmProblem.getDegreesOfFreedom();
        for (final DegreeOfFreedomInstance designDecision : decisions) {
            result += DegreeOfFreedomHelper.getDegreeDescription(designDecision)+";";
        }

        return result;

    }


    public void setInitialPopulation(final List<DesignDecisionGenotype> population) throws CoreException{
        this.initialGenotypeList = population;
        Opt4JStarter.getDSECreator().setNumberOfNotEvaluatedPredefinedOnes(population.size());
    }

    /**
     * Returns the degree of freedom of the type (or subtype) that has the given
     * entity as the changeableEntity.
     * @param entity
     * @param degreeClass
     * @return The matching DegreeOfFreedomInstance from this problem.
     */
    public DegreeOfFreedomInstance getDegree(final Entity entity, final Class<? extends DegreeOfFreedomInstance> degreeClass){
        final List<DegreeOfFreedomInstance> degrees = this.pcmProblem.getDegreesOfFreedom();
        for (final DegreeOfFreedomInstance DegreeOfFreedomInstance : degrees) {

            if (degreeClass.isInstance(DegreeOfFreedomInstance) && DegreeOfFreedomInstance.getPrimaryChanged().equals(entity)){
                return DegreeOfFreedomInstance;
            }
        }
        return null;
    }

    public DecisionSpace getEMFProblem(){
        return this.pcmProblem;
    }

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		int i = 0;
		System.out.println("hallo");
		MDSDBlackboard blcak = this.blackboard;
		
		
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
		
	}

	public boolean isFirstDecode() {
		return firstDecode;
	}

	public void setFirstDecode(boolean firstDecode) {
		this.firstDecode = firstDecode;
	}
    

	
    
}
