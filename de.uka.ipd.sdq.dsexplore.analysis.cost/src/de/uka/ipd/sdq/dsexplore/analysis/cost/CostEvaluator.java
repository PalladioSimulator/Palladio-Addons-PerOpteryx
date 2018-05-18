package de.uka.ipd.sdq.dsexplore.analysis.cost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.qes.qualityEffectSpecification.QES;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesFinder;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesHelper;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesParser;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance;
import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.ProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class CostEvaluator extends AbstractAnalysis implements IAnalysis {

    /** Logger for log4j. */
    private static final Logger LOGGER = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.cost");

    private static boolean checkWhetherResourceContainerIsUsed(final PCMInstance pcmInstance,
            final ResourceContainer resourceContainer) {
        for (final AllocationContext allocationContext : pcmInstance.getAllocation()
                .getAllocationContexts_Allocation()) {
            if (EMFHelper.checkIdentity(allocationContext.getResourceContainer_AllocationContext(),
                    resourceContainer)) {
                return true;
            }
        }
        return false;
    }

    private static Predicate<Cost> contains(final ComponentCost givenCost) {
        return new Predicate<Cost>() {
            @Override
            public boolean test(final Cost cost) {
                return (cost instanceof ComponentCost)
                        && (((ComponentCost) cost).getRepositoryComponent().getId()
                                .equals(givenCost.getRepositoryComponent().getId()));
            }
        };

    }

    /**
     * FIXME: this should be more elegantly handled by separating a resource repository with costs
     * specification from the actually used resources
     *
     * @param allCosts
     * @param pcmInstance
     */
    private static void createCostsForReplicas(final List<Cost> allCosts,
            final PCMInstance pcmInstance) {

        final List<ResourceContainer> containers =
                pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        final List<Cost> replicaCosts = new ArrayList<Cost>();

        // also remove old replica costs from previous candidates
        final List<Cost> oldReplicaCosts = new ArrayList<Cost>();

        for (final Cost anyCost : allCosts) {

            // iterate through costs, look at all VariableProcessingResourceCost
            // or FixedProcessingResourceCost and in particular at their
            // resourcecontainer.
            ResourceContainer originalContainer = null;
            ProcessingResourceType procResourceType = null;
            ProcessingResourceCost cost = null;
            if (anyCost instanceof ProcessingResourceCost) {
                cost = ((ProcessingResourceCost) anyCost);
                originalContainer = cost.getProcessingresourcespecification()
                        .getResourceContainer_ProcessingResourceSpecification();
                procResourceType = cost.getProcessingresourcespecification()
                        .getActiveResourceType_ActiveResourceSpecification();
            } else {
                // look at next cost model element
                continue;
            }

            // check if this is a cost model element for a replica, if yes
            // delete it if its server is no longer in the resource environment
            if (originalContainer.getEntityName().contains("Replica")
                    && !containers.contains(originalContainer)) {
                oldReplicaCosts.add(cost);
            }

            // find replicated servers and their original
            for (final ResourceContainer resourceContainer : containers) {
                if (resourceContainer.getEntityName().contains("Replica")
                        && resourceContainer.getId().contains(originalContainer.getId())) {
                    // resourceContainer is a replica of
                    // originalResourceContainer

                    // check if there already is a cost model element for the
                    // replica. If not, create a new one.
                    boolean replicaAlreadyAnnotated = false;
                    for (final Cost existingCost : allCosts) {
                        if (existingCost instanceof ProcessingResourceCost) {
                            final ProcessingResourceCost existingProcRateCost =
                                    (ProcessingResourceCost) existingCost;
                            if (existingProcRateCost.getProcessingresourcespecification()
                                    .getResourceContainer_ProcessingResourceSpecification().getId()
                                    .equals(resourceContainer.getId())) {
                                // there already is a cost model element
                                // annotating this replica, so continue;
                                replicaAlreadyAnnotated = true;
                                break; // inner for loop
                            }
                        }
                    }
                    if (replicaAlreadyAnnotated) {
                        continue;
                    }

                    // get the processing resource spec that corresponds to the
                    // annotated one
                    ProcessingResourceSpecification replicaProcSpec = null;
                    for (final ProcessingResourceSpecification procRes : resourceContainer
                            .getActiveResourceSpecifications_ResourceContainer()) {
                        if (procRes.getActiveResourceType_ActiveResourceSpecification().getId()
                                .equals(procResourceType.getId())) {
                            replicaProcSpec = procRes;
                            break;
                        }
                    }
                    if (replicaProcSpec == null) {
                        CostEvaluator.LOGGER.warn("Could not find processing resource type "
                                + procResourceType.getEntityName() + " in container "
                                + resourceContainer.getEntityName()
                                + ", assuming that there are no costs for it in this replica");
                        return;
                    }

                    // replicate cost element, too.
                    final ProcessingResourceCost replicaCost = EcoreUtil.copy(cost);
                    replicaCost.setProcessingresourcespecification(replicaProcSpec);
                    replicaCosts.add(replicaCost);
                }
            }
        }
        allCosts.removeAll(oldReplicaCosts);
        allCosts.addAll(replicaCosts);
    }

    /**
     * returns a cost model or throws an exception.
     *
     * @param configuration.getRawConfiguration()
     * @return a CostRepository which is not null
     * @throws CoreException if the model could not be loaded.
     */
    private static CostRepository getCostModel(final DSEWorkflowConfiguration configuration)
            throws CoreException {
        final String costModelFileName = configuration.getRawConfiguration()
                .getAttribute(DSEConstantsContainer.COST_FILE, "");

        URI locationToLoadFrom = URI.createURI(costModelFileName);
        if ((locationToLoadFrom == null) || (locationToLoadFrom.isPlatform() == false)) {
            locationToLoadFrom = URI.createFileURI(costModelFileName);
        }
        final EObject costRepository =
                EMFHelper.loadFromXMIFile(locationToLoadFrom, costPackage.eINSTANCE);

        if ((costRepository == null) || ((costRepository instanceof CostRepository) == false)) {
            throw new CoreException(
                    new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.cost", 0,
                            "Cost model " + costModelFileName + " could not be loaded.", null));
        }
        return (CostRepository) costRepository;
    }

    private DSEWorkflowConfiguration configuration;
    private CostRepository costModel;
    private QesFinder finder;
    private final Map<Long, CostAnalysisResult> previousCostResults;

    private Set<QES> qesCostSpecifications;


    public CostEvaluator() {
        super(new CostSolverQualityAttributeDeclaration());
        previousCostResults = new HashMap<Long, CostAnalysisResult>();
    }

    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor)
            throws CoreException, UserCanceledException, JobFailedException,
            AnalysisFailedException {
        final PCMInstance pcm = pheno.getPCMInstance();

        reloadCostModelIfNecessary();

        // Important: "Read in" the right PCM instance first.
        updateCostModel(pcm);

        final double initialCost = getInitialCost(pcm);
        final double operatingCost = getOperatingCost(pcm);
        previousCostResults.put(Long.valueOf(pheno.getNumericID()), new CostAnalysisResult(
                CostUtil.getTotalCost(initialCost, operatingCost, costModel.getInterest(),
                        costModel.getTimePeriodYears()),
                initialCost, operatingCost, pcm, criterionToAspect,
                (CostSolverQualityAttributeDeclaration) qualityAttribute));
        CostUtil.getInstance().resetCache();
    }

    private boolean costModelChanged(final CostRepository currentCostModel) {
        for (final Cost eachCost : currentCostModel.getCost()) {
            if (eachCost instanceof ComponentCost) {
                if (costModel.getCost().stream()
                        .anyMatch(CostEvaluator.contains((ComponentCost) eachCost)) == false) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Only checks uses in system (for components) and in the allocation (for processing resources)
     *
     * @param cost
     * @param pcmInstance
     * @return
     */
    private boolean doesCostApply(final Cost cost, final PCMInstance pcmInstance) {
        if (cost instanceof VariableProcessingResourceCost) {
            final VariableProcessingResourceCost vc = (VariableProcessingResourceCost) cost;
            final ResourceContainer rc =
                    (ResourceContainer) vc.getProcessingresourcespecification().eContainer();
            return CostEvaluator.checkWhetherResourceContainerIsUsed(pcmInstance, rc);
            // No usage of resource container found, return false.
        } else if (cost instanceof ComponentCost) {
            final ComponentCost cc = (ComponentCost) cost;
            final RepositoryComponent rc = cc.getRepositoryComponent();
            // List<AssemblyContext> asctx =
            // pcmInstance.getSystem().getAssemblyContexts__ComposedStructure();
            // TODO: also retrieve inner assembly contexts of deployed composite
            // components. Cost currently need to be specified separately.

            final List<AssemblyContext> asctx = getAllContainedAssemblyContexts(
                    pcmInstance.getSystem().getAssemblyContexts__ComposedStructure());

            for (final AssemblyContext assemblyContext : asctx) {
                if (EMFHelper.checkIdentity(
                        assemblyContext.getEncapsulatedComponent__AssemblyContext(), rc)) {
                    return true;
                }
            }
            return false;
        } else if (cost instanceof FixedProcessingResourceCost) {
            final FixedProcessingResourceCost fc = (FixedProcessingResourceCost) cost;
            final ResourceContainer rc =
                    (ResourceContainer) fc.getProcessingresourcespecification().eContainer();
            return checkWhetherResourceContainerIsUsed(pcmInstance, rc);
        } else {
            return true;
        }
    }



    /**
     * Get all contained ones recursively
     *
     * @param assemblyContextsComposedStructure
     * @return
     */
    private List<AssemblyContext> getAllContainedAssemblyContexts(
            final EList<AssemblyContext> assemblyContextsComposedStructure) {
        final List<AssemblyContext> list = new ArrayList<AssemblyContext>();
        list.addAll(assemblyContextsComposedStructure);
        for (final AssemblyContext assemblyContext : assemblyContextsComposedStructure) {
            if (assemblyContext
                    .getEncapsulatedComponent__AssemblyContext() instanceof ComposedStructure) {
                final ComposedStructure composite = (ComposedStructure) assemblyContext
                        .getEncapsulatedComponent__AssemblyContext();
                list.addAll(getAllContainedAssemblyContexts(
                        composite.getAssemblyContexts__ComposedStructure()));
            }
        }
        return list;
    }

    @Override
    public List<Criterion> getCriterions() throws CoreException {
        final List<Criterion> criterions = new ArrayList<Criterion>(criteriaList.size());
        criterions.addAll(criteriaList);
        return criterions;
    }

    /**
     * Sums up the initial cost of the PCM elements present in the given PCM instance. TODO For now,
     * all cost in the internal costRepository are considered. Thus, only variable cost lead to a
     * change in cost, e.g. the variable cost for changing processing rates.
     *
     * Careful: This must point to the right pcm instance first.
     *
     * @param pcmInstance the PCM instance
     * @return
     */
    private double getInitialCost(final PCMInstance pcmInstance) {
        double sum = 0.0;
        for (final Cost cost : costModel.getCost()) {
            if (doesCostApply(cost, pcmInstance)) {
                sum += cost.getInitialCost();
            }
        }
        return sum;
    }

    /**
     * Careful: This must point to the right pcm instance first.
     *
     * @param pcmInstance
     * @return
     */
    private double getOperatingCost(final PCMInstance pcmInstance) {
        double sum = 0.0;
        for (final Cost cost : costModel.getCost()) {
            if (doesCostApply(cost, pcmInstance)) {
                sum += cost.getOperatingCost();
            }
        }
        return sum;
    }

    @Override
    public boolean hasObjectivePerUsageScenario() throws CoreException {
        return false;
    }

    @Override
    public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {
        costModel = CostEvaluator.getCostModel(configuration);
        initialiseCriteria(configuration);
        initialiseQesModel(configuration);
        this.configuration = configuration;

    }

    private void initialiseQesModel(final DSEWorkflowConfiguration configuration) {
        qesCostSpecifications = new HashSet<QES>();
        try {
            final QesParser parser = new QesParser(configuration.getRawConfiguration()
                    .getAttribute(DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE, ""));
            if ((parser.isEmpty() == false) && parser.isValid()) {
                qesCostSpecifications.addAll(parser.getSpecifications("InitialCost"));
                qesCostSpecifications.addAll(parser.getSpecifications("OperatingCost"));
            }
        } catch (final Exception e) {
            LOGGER.warn("No Quality Effect Specification File", e);
        }
    }

    private void reloadCostModelIfNecessary() {
        try {
            final CostRepository currentCostModel = CostEvaluator.getCostModel(configuration);
            EcoreUtil.resolveAll(currentCostModel.eResource());

            if (costModelChanged(currentCostModel)) {
                costModel = currentCostModel;
            }
        } catch (final CoreException e) {
            LOGGER.warn("Cost model could not be reload.", e);
        }

    }

    @Override
    public IAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion)
            throws CoreException, AnalysisFailedException {
        // It is always the cost value, i.e. objective and constraint always
        // have to refer to the SimpleValue (-> no statistical requirements atm)
        // If more possible aspects are added, the criterion needs to be
        // examined here

        return previousCostResults.get(Long.valueOf(pheno.getNumericID()));
    }

    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

    private void updateCostModel(final PCMInstance pcmInstance) {
        final List<Cost> allCosts = costModel.getCost();

        createCostsForReplicas(allCosts, pcmInstance);
        updateQesModel(pcmInstance);

        for (final Cost cost : allCosts) {
            if (cost instanceof ComponentCost) {
                QesHelper.evaluateQesCostModel((ComponentCost) cost, finder, qesCostSpecifications);
            } else if (cost instanceof ComponentCostPerInstance) {
                // fix links between model elements (maybe this is not needed
                // anymore...)
                ((ComponentCostPerInstance) cost).setAllocation(pcmInstance.getAllocation());
            } else if (cost instanceof VariableProcessingResourceCost) {

                final VariableProcessingResourceCost varCost =
                        (VariableProcessingResourceCost) cost;

                final ProcessingResourceSpecification old_prs =
                        ((VariableProcessingResourceCost) cost)
                                .getProcessingresourcespecification();
                final ResourceContainer old_rc = (ResourceContainer) old_prs.eContainer();
                final ProcessingResourceType ars =
                        old_prs.getActiveResourceType_ActiveResourceSpecification();

                final List<ResourceContainer> all_new_rcs = pcmInstance.getResourceEnvironment()
                        .getResourceContainer_ResourceEnvironment();

                for (final ResourceContainer resourceContainer : all_new_rcs) {

                    if (resourceContainer.getId().equals(old_rc.getId())) {

                        final List<ProcessingResourceSpecification> new_resources =
                                resourceContainer
                                        .getActiveResourceSpecifications_ResourceContainer();

                        boolean resourceTypeFound = false;

                        for (final ProcessingResourceSpecification new_prs : new_resources) {

                            if (new_prs.getActiveResourceType_ActiveResourceSpecification().getId()
                                    .equals(ars.getId())) {
                                if (!resourceTypeFound) {
                                    // Reset the processing rate with the first
                                    // matching one found
                                    varCost.setProcessingresourcespecification(new_prs);
                                    resourceTypeFound = true;
                                } else {
                                    throw new RuntimeException(
                                            "There are two processing resources with the same resource type within one resource container, this cannot be handled by the optimisation yet. Please change your model.");
                                }
                            }
                        }
                        break;
                    }

                    /*
                     * Resource resource = prs.eResource(); if (resource != null){ URI oldURI =
                     * resource.getURI(); resource.setURI(resEnvFileURI); } else {
                     * System.out.println ("Resource of ProcessingResourceSpecification "
                     * +prs.toString()+" has a null eResource!"); }
                     */
                }
            }
        }

    }


    private void updateQesModel(final PCMInstance pcmInstance) {
        if ((qesCostSpecifications == null) || qesCostSpecifications.isEmpty()) {
            return;
        }
        finder = new QesFinder(pcmInstance);
    }

}
