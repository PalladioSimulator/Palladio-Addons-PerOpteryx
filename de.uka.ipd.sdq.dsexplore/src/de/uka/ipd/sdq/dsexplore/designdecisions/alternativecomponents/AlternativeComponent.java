package de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.EntityComparator;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;

//Singleton
/**
 * TODO: Currently, components must have the same provided _and_ required roles, otherwise, an erroneous system is created.
 */
public class AlternativeComponent  {

    private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");


    /** Model files will get the suffix here plus the generation number**/
    //private static String modelFilesSuffix = "-AC";

    //Repository lastRepository = null;

    Map<AssemblyContext, Map<RepositoryComponent, ComponentReplacer>> alternativeMap = null;

    //EvolutionGraphNode rootNode = null;

    private static AlternativeComponent instance = new AlternativeComponent();

    private AlternativeComponent() {

    }

    public static AlternativeComponent getInstance(){
        return AlternativeComponent.instance;
    }

    /**
     * @see de.uka.ipd.sdq.dsexplore.newcandidates.INewCandidates#generateNewCandidates(de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult)
     */
    public List<AssembledComponentDegree> generateDesignDecisions(final PCMInstance pcmInstance) {

        //Retrieve all components from all repositories

        final List<Repository> repositories = pcmInstance.getRepositories();

        final org.palladiosimulator.pcm.system.System s = pcmInstance.getSystem();

        final List<RepositoryComponent> repoComponents = new ArrayList<RepositoryComponent>(15);
        for (final Repository repository : repositories) {
            repoComponents.addAll(repository.getComponents__Repository());
        }


        alternativeMap = findAlternatives(repoComponents,s.getAssemblyContexts__ComposedStructure(),s);
        logger.debug("I have a mapping for " + alternativeMap.size()
                + " AssemblyContexts with the following alternatives:");

        return createAssembledComponentDecisionsInstances(pcmInstance, alternativeMap);
    }

    /**
     * Creates a an {@link AssembledComponentDecision} for each alternative found.
     * Calls createDesignDecision for each alternative to be generated.
     * @param pcmInstance The current solution the new ones will base on
     * @param alternativeMap2 The Map containing all replacement options
     * @return A list of design decisions
     */
    private List<AssembledComponentDegree> createAssembledComponentDecisionsInstances(
            final PCMInstance pcmInstance,
            final Map<AssemblyContext, Map<RepositoryComponent, ComponentReplacer>> alternativeMap2) {

        final List<AssembledComponentDegree> l = new ArrayList<AssembledComponentDegree>();


        for (final Map.Entry<AssemblyContext, Map<RepositoryComponent, ComponentReplacer>> mapping : alternativeMap2
                .entrySet()) {
            logger.debug("Assembly context " + mapping.getKey().getEntityName()
                    + " has " + mapping.getValue().size() + " fitting component(s).");

            //only save design decision if there are at least two components
            if (mapping.getValue().size() > 1){
                final AssembledComponentDegree inst = createDesignDecision(pcmInstance, mapping);
                l.add(inst);
            }

        }
        return l;
    }

    /**
     * Creates a {@link AssembledComponentDecision} for the given Entry.
     * The design decisions has the domain of all {@link RepositoryComponent}s
     * that are alternatives for the given {@link AssemblyContext}.
     * @param pcmInstance
     * @param mappingEntry
     * @return
     */
    private AssembledComponentDegree createDesignDecision(
            final PCMInstance pcmInstance,
            final Entry<AssemblyContext, Map<RepositoryComponent, ComponentReplacer>> mappingEntry) {
        final AssembledComponentDegree decision = specificFactoryImpl.eINSTANCE.createAssembledComponentDegree();

        //Set domain to be all alternative components, i.e. all RepositoryComponents in the mapping.
        decision.getClassDesignOptions().addAll(mappingEntry.getValue().keySet());

        decision.setPrimaryChanged(mappingEntry.getKey());

        return decision;
    }


    /**
     * Set the given {@link RepositoryComponent} as the encapsulated component of the given {@link AssemblyContext}
     *
     * Fixes assembly connectors and delegation connectors that point to the
     * changed assembly so that they point to the new required and provided roles.
     *
     * To do so, the right previously build component replacer is retrieved from {@link AlternativeComponent#alternativeMap}
     * and replace is invoked, which applies the change.
     *
     * @param changedAssemblyContext
     * @param newComponent
     * @param currentComponent
     */
    public void applyChange(final AssemblyContext changedAssemblyContext, final RepositoryComponent newComponent) {

        //call AlternativeComponent.generateDesigndecisions first to initialize.
        if (this.alternativeMap == null){
            throw new RuntimeException("The AlternativeComponent operator has not properly been initialized. Check previous Exceptions or contact the developers.");
        }
        changedAssemblyContext.setEncapsulatedComponent__AssemblyContext(newComponent);

        final Map<RepositoryComponent, ComponentReplacer> map =  this.alternativeMap.get(changedAssemblyContext);
        final ComponentReplacer componentReplacer = map.get(newComponent);
        componentReplacer.replace();
    }

    private Map<AssemblyContext, Map<RepositoryComponent, ComponentReplacer>> findAlternatives(
            final List<RepositoryComponent> repoComponents,
            final List<AssemblyContext> assemblyContexts, final org.palladiosimulator.pcm.system.System s) {

        // Use IdentityHashMap to compare BasicComponents only by reference
        // identity, i.e. two BasicComponents are only equal if they are the
        // same object.
        final Comparator<Entity> c = new EntityComparator();

        final Map<AssemblyContext, Map<RepositoryComponent,ComponentReplacer>> alternativeMap = new TreeMap<AssemblyContext, Map<RepositoryComponent,ComponentReplacer>>(c);

        for (final AssemblyContext assemblyContext : assemblyContexts) {
            final Map<RepositoryComponent,ComponentReplacer> map = getAlternatives(assemblyContext, repoComponents, s);
            if (map.size() > 0) {
                alternativeMap.put(assemblyContext, map);
            }
        }

        return alternativeMap;
    }

    /**
     * Finds alternatives for a specific assembled component. To do so, this checks for each {@link RepositoryComponent} in the given {@link Repository}
     * whether it fits in the given {@link AssemblyContext}.
     * @param assemblyContext
     * @param repoComponents
     * @param s
     * @return a Map of alternative {@link RepositoryComponent} with the {@link ComponentReplacer} that can put them in the {@link AssemblyContext}, which is possibly empty if no alternatives are found.
     */
    private Map<RepositoryComponent, ComponentReplacer> getAlternatives(
            final AssemblyContext assemblyContext, final List<RepositoryComponent> repoComponents, final org.palladiosimulator.pcm.system.System s) {

        final Comparator<Entity> c = new EntityComparator();
        final Map<RepositoryComponent, ComponentReplacer> map = new TreeMap<RepositoryComponent, ComponentReplacer>(c);
        for (final RepositoryComponent repoComponent : repoComponents) {

            //if compatible, this returns not null
            final ComponentReplacer p = findRoleMappingFor(assemblyContext, repoComponent, s);

            if (p != null) {
                map.put(repoComponent,p);
                logger.debug("Found an alternative: "
                        + assemblyContext.getEntityName()
                        + " can encapsulate the component "
                        + repoComponent.getEntityName() + ".");
            } /*else {
				logger.debug(repoComponent.getEntityName()
						+ " is no alternative for "
						+ assembledComponent.getEntityName());
			}*/
        }
        return map;
    }

    /**
     * Checks provided and required interfaces and returns whether the
     * interfaces are compatible so that the alternativeComponent can replace
     * the assembledComponent.
     *
     * At the same time, this already finds out how to replace the
     * {@link RepositoryComponent} alternativeComponent if needed. Builds
     * a {@link ComponentReplacer} that stores all information how to replace the components.
     *
     * Returns null if the {@link RepositoryComponent} alternativeComponent cannot
     * be assembled in the given {@link AssemblyContext} assemblyContext.
     *
     * Current notion of compatible: allows the alternative to provide more and
     * require less. TODO: Allow super interfaces and sub interfaces where
     * appropriate
     * @param assemblyContext
     *
     * @param assembledComponent
     * @param alternativeComponent
     * @param s
     * @return a map if alternativeComponent has compatible interfaces to replace
     *         assembledComponent, null otherwise.
     */
    private ComponentReplacer findRoleMappingFor(final AssemblyContext assemblyContext,
            final RepositoryComponent alternativeComponent, final org.palladiosimulator.pcm.system.System s) {

        final RepositoryComponent assembledComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

        //logger.debug("isAlternativeFor(..) called");

        // first check whether the two parameters are the same component, if
        // yes, return false.
        //if (checkIdentity(assembledComponent, alternativeComponent))
        //	return null;
        //TODO: in the case above, we could save the whole calculation. But for now, leave it like this.

        // check whether they have compatible interfaces
        /*
         * TODO Assumption: An interface is always used in the same way and
         * fully defines whether two components are exchangeable.
         */

        /*
         * TODO Assumption: Note that I allow that a component can require the
         * same interface multiple times. Two components are only alternatives
         * to each other, if they provide the same interfaces equally often. For
         * provided interfaces, there just needs to be one matching interface
         */
        final ComponentReplacer cr = new ComponentReplacer();

        // Start with provided interfaces. Alternative component
        final EList<ProvidedRole> altprl = alternativeComponent
                .getProvidedRoles_InterfaceProvidingEntity();
        final EList<ProvidedRole> assprl = assembledComponent
                .getProvidedRoles_InterfaceProvidingEntity();

        final Map<OperationProvidedRole, OperationProvidedRole> providedMapping = new IdentityHashMap<OperationProvidedRole, OperationProvidedRole>();
        for (final ProvidedRole asspr : assprl) {
            if (asspr instanceof OperationProvidedRole){
                final OperationProvidedRole assembledOperationProvidedRole =  (OperationProvidedRole) asspr;
                for (final ProvidedRole altpr : altprl) {
                    if (altpr instanceof OperationProvidedRole){
                        final OperationProvidedRole alternativeOperationProvidedRole =  (OperationProvidedRole) altpr;
                        // 	TODO: Allow derived interfaces at the alternativeComponent
                        /*						logger.debug("Interface "
							+ altpr.getProvidedInterface__ProvidedRole()
							+ " and Interface "
							+ asspr.getProvidedInterface__ProvidedRole());*/

                        if (EMFHelper.checkIdentity(alternativeOperationProvidedRole.getProvidedInterface__OperationProvidedRole(),
                                assembledOperationProvidedRole.getProvidedInterface__OperationProvidedRole())) {
                            providedMapping.put(assembledOperationProvidedRole, alternativeOperationProvidedRole);

                            break;
                        }
                    }
                }
            }
        }

        // If not all provided interfaces of the assembled component are
        // provided by the alternative, return false.
        if (providedMapping.size() != assprl.size()) {
            /*			logger.debug("The provided interfaces of "
					+ assembledComponent.getEntityName() + " and "
					+ alternativeComponent.getEntityName() + " do not match.");
			logger.debug("Mapping size: " + providedMapping.size()
					+ ", provided role list size: " + altprl.size());*/
            return null;
        } else {

            //find connector that points to this assembly context
            final List<ConnectorAdjuster> cas = findProvidedConnectors(assemblyContext, s, providedMapping);

            //add to list
            cr.addAllConnectorAdjuster(cas);
        }

        logger.debug("These two have matching provided interfaces:" + assembledComponent.getEntityName()+ " and "+alternativeComponent.getEntityName());

        // Now look at the required interfaces. alternativeComponent must not
        // require
        // more than assembled component requires.
        // TODO: Allow super interfaces at the alternative component
        final EList<RequiredRole> altrrl = alternativeComponent
                .getRequiredRoles_InterfaceRequiringEntity();
        final EList<RequiredRole> assrrl = assembledComponent
                .getRequiredRoles_InterfaceRequiringEntity();

        final Map<OperationRequiredRole, OperationRequiredRole> requiredMapping = new IdentityHashMap<OperationRequiredRole, OperationRequiredRole>();
        // Outer loop is alternative, because it must require no more and must
        // be completely checked.
        for (final RequiredRole altrr : altrrl) {
            if (altrr instanceof OperationRequiredRole){
                final OperationRequiredRole alternativeOperationRequiredRole = (OperationRequiredRole)altrr;
                boolean foundMatch = false;
                for (final RequiredRole assrr : assrrl) {
                    if (assrr instanceof OperationRequiredRole){
                        final OperationRequiredRole assembledOperationRequiredRole = (OperationRequiredRole)assrr;
                        // TODO: Allow derived interfaces at the alternativeComponent
                        // TODO: Rather use same ImplementationComponentType?
                        if (EMFHelper.checkIdentity(alternativeOperationRequiredRole.getRequiredInterface__OperationRequiredRole(),
                                assembledOperationRequiredRole.getRequiredInterface__OperationRequiredRole())) {
                            requiredMapping.put(assembledOperationRequiredRole, alternativeOperationRequiredRole);
                            foundMatch = true;
                            break;
                        }
                    }
                }
                // break loop and return false when noticing that one role
                // cannot be fit.
                if (!foundMatch){
                    return null;
                }
            }
        }

        // If not all required interfaces of the alternative component are
        // required by the assembled one, return false.
        //TODO: This should be unreachable... but maybe leave it to be sure.
        if (requiredMapping.size() != altrrl.size()) {
            /*			logger.debug("The required interfaces of "
					+ assembledComponent.getEntityName() + " and "
					+ alternativeComponent.getEntityName() + " do not match.");
			logger.debug("Mapping size: " + requiredMapping.size()
					+ ", required role list size: " + altrrl.size());*/
            return null;
        } else {

            //find connector that points to this assembly context
            final List<ConnectorAdjuster> cas = findRequiredConnectors(assemblyContext, s, requiredMapping);

            //add to list
            cr.addAllConnectorAdjuster(cas);
        }
        logger.debug("These two have matching required interfaces:" + assembledComponent.getEntityName()+ " and "+alternativeComponent.getEntityName());

        return cr;
    }

    /**
     * Finds out how the Connectors to the {@link AssemblyContext} assemblyContext have to be adjusted on the required side in order
     * to put another {@link RepositoryComponent} (given by its roles) there. The mapping requiredMapping already
     * contains a mapping of the {@link RequiredRole}s of the currently assembledComponent to the {@link RequiredRole}s of the
     * {@link RepositoryComponent} to be assembled.
     *
     *  The results for each connector are stored in a {@link ConnectorAdjuster} object, which can fix the connector references if needed.
     *  A List of {@link ConnectorAdjuster} is returned with a {@link ConnectorAdjuster} for each connector pointing to or coming from this {@link AssemblyContext}.
     * @param assemblyContext
     * @param assembledComponent
     * @param s
     * @param providedMapping
     * @return a List of {@link ConnectorAdjuster}
     */
    private List<ConnectorAdjuster> findRequiredConnectors(
            final AssemblyContext assemblyContext,
            final org.palladiosimulator.pcm.system.System s, final Map<OperationRequiredRole, OperationRequiredRole> requiredMapping) {
        final List<ConnectorAdjuster> result = new ArrayList<ConnectorAdjuster>();

        for (final Connector conn : s.getConnectors__ComposedStructure()) {
            if (conn instanceof AssemblyConnector) {
                final AssemblyConnector assemblyConnector = (AssemblyConnector) conn;
                if (EMFHelper.checkIdentity(assemblyConnector.getRequiringAssemblyContext_AssemblyConnector(), assemblyContext)){
                    final OperationRequiredRole role = requiredMapping.get(assemblyConnector.getRequiredRole_AssemblyConnector());
                    result.add(new OutgoingAssemblyConnectorAdjuster(assemblyConnector, role));
                }
            }
        }

        for (final Connector conn : s.getConnectors__ComposedStructure()) {
            if (conn instanceof RequiredDelegationConnector) {
                final RequiredDelegationConnector requiredDelegationConnector = (RequiredDelegationConnector) conn;
                if (EMFHelper.checkIdentity(requiredDelegationConnector.getInnerRequiredRole_RequiredDelegationConnector(), assemblyContext)){
                    final OperationRequiredRole role = requiredMapping.get(requiredDelegationConnector.getInnerRequiredRole_RequiredDelegationConnector());
                    result.add(new RequiredDelegationConnectorAdjuster(requiredDelegationConnector, role));
                }
            }
        }

        return result;
    }

    /**
     * Finds out how the Connectors to the {@link AssemblyContext} assemblyContext have to be adjusted on the provided side in order
     * to put another {@link RepositoryComponent} (given by its roles) there. The mapping providedMapping already
     * contains a mapping of the {@link ProvidedRole}s of the currently assembledComponent to the {@link ProvidedRole}s of the
     * {@link RepositoryComponent} to be assembled.
     *
     *  The results for each connector are stored in a {@link ConnectorAdjuster} object, which can fix the connector references if needed.
     *  A List of {@link ConnectorAdjuster} is returned with a {@link ConnectorAdjuster} for each connector pointing to or coming from this {@link AssemblyContext}.
     * @param assemblyContext
     * @param assembledComponent
     * @param s
     * @param providedMapping
     * @return a List of {@link ConnectorAdjuster}
     */
    private List<ConnectorAdjuster> findProvidedConnectors(
            final AssemblyContext assemblyContext, final org.palladiosimulator.pcm.system.System s, final Map<OperationProvidedRole, OperationProvidedRole> providedMapping) {
        final List<ConnectorAdjuster> result = new ArrayList<ConnectorAdjuster>();

        for (final Connector conn : s.getConnectors__ComposedStructure()) {
            if (conn instanceof AssemblyConnector) {
                final AssemblyConnector assemblyConnector = (AssemblyConnector) conn;
                if (EMFHelper.checkIdentity(assemblyConnector.getProvidingAssemblyContext_AssemblyConnector(), assemblyContext)){
                    final OperationProvidedRole role = providedMapping.get(assemblyConnector.getProvidedRole_AssemblyConnector());
                    result.add(new IncomingAssemblyConnectorAdjuster(assemblyConnector, role));
                }
            }
        }

        for (final Connector conn : s.getConnectors__ComposedStructure()) {
            if (conn instanceof ProvidedDelegationConnector) {
                final ProvidedDelegationConnector providedDelegationConnector = (ProvidedDelegationConnector) conn;
                if (EMFHelper.checkIdentity(providedDelegationConnector.getAssemblyContext_ProvidedDelegationConnector(), assemblyContext)){
                    final OperationProvidedRole role = providedMapping.get(providedDelegationConnector.getInnerProvidedRole_ProvidedDelegationConnector());
                    result.add(new ProvidedDelegationConnectorReplacer(providedDelegationConnector, role));
                }
            }
        }

        return result;
    }





}
