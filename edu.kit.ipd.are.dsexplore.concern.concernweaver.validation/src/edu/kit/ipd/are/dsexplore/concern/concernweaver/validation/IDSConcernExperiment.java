package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Test;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;
import org.palladiosimulator.pcm.seff.StopAction;

import de.uka.ipd.sdq.identifier.Identifier;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.ExperimentUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.WeavingInstructionFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;

public class IDSConcernExperiment extends ExperimentConfiguration {

	private final static String REQUIRED_ROLE_MEDIAACCESS = "_vU0HsLg_EeSNPorBlo7x9g";
	private final static String PROVIDED_ROLE_FILESTORAGE = "_sFS0gLg7EeSNPorBlo7x9g";
	private final static String PROVIDED_ROLE_DECODER = "_ViTmIK_hEeaFof9L2wGlaQ";
	private final static String MEDIAACCESS_ASSEMBLYCONTEXT_ID = "_4LdYsHD4EeSA4fySuX9I2Q";
	private final static String FILESTORAGE_ASSEMBLYCONTEXT_ID = "_1ek7QLg_EeSNPorBlo7x9g";
	private final static String GETFILES_SIGNATURE_ID = "_lLuUoLg7EeSNPorBlo7x9g";
	private final static String STOREFILES_SIGNATURE_ID = "_ZlS-sL0KEeSAHuL4ItXOLQ";
	private final static String DECODEEVENT_SIGNATURE_ID = "_FF5eEK_hEeaFof9L2wGlaQ";
	private final static String AGENT_COMPONENT_ID = "_yKLUkK_YEeaFof9L2wGlaQ";
	
	private int oldOSSECComponentSize;
	private int oldMediaStoreAssembliesSize;
	private int oldMediaStoreConnectorsSize;
	private int oldMediaStoreAllocationsSize;
	private List<WeavingInstruction> weavingInstructions;
	
	/**
	 * This method tests a weaving process. An intrusion detection system (ossec) has to be woven between the mediaaccess-
	 * and the filestorage-component of the media store.
	 * The configurations are: appearance = before, strategy = adapter. 
	 */
	@Test
	public void executeIDSExperiment() {
		
		givenTheConcernSolutionAndThePCMModel();
		whenApplyingTheConcernWeaver();
		thenModelChangesHasBeenApplied();
		
	}
	
	private void givenTheConcernSolutionAndThePCMModel() {
		
		oldOSSECComponentSize = this.concernSolution.getComponents__Repository().size();
		oldMediaStoreAssembliesSize = this.pcmToAdapt.getSystem().getAssemblyContexts__ComposedStructure().size();
		oldMediaStoreConnectorsSize = this.pcmToAdapt.getSystem().getConnectors__ComposedStructure().size();
		oldMediaStoreAllocationsSize = this.pcmToAdapt.getAllocation().getAllocationContexts_Allocation().size();
		
		this.weavingInstructions = WeavingInstructionFactory.getBy(this.pcmToAdapt, this.concernModel, this.concernSolution)
															.getExperimentWeavingInstructions();
		
	}

	private void whenApplyingTheConcernWeaver() {
		
		try {
			
			ConcernWeaver.getBy(this.pcmToAdapt, concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
	}

	private void thenModelChangesHasBeenApplied() {
		
		try {
		
			thenAnAdapterHasBeenAddedToOSSEC();
			thenTheAdapterContainsAllComplementaryRoles();
			thenTheAdapterContainsTheCorrectSEFFs();
			thenTheSizeOfAllAssemblyContextsIsCorrect();
			thenForEachComponentOfOSSECThereExistExactlyOneAssemblyContext();
			thenTheSizeOfAllConnectorsIsCorrect();
			thenTheAdapterIsInsertedProperly();
			thenAllAssemblyContextsOfOSSECAreConnectedProperly();
			thenTheSizeOfAllAllocationContextsIsCorrect();
			thenForAllAssemblyContextsOfOSSECThereExistOneAllocationContext();
			thenEachAssemblyContextOfOSSECIsDeployed();
			
		} catch(Exception ex) {
			
			fail(String.format("An error occured: %s", ex.getMessage()));
			
		}
		
	}

	private void thenAnAdapterHasBeenAddedToOSSEC() {
		
		assertTrue(this.concernSolution.getComponents__Repository().size() == getExpectedOSSECComponentSize());
		
	}

	private void thenTheAdapterContainsAllComplementaryRoles() throws Exception {
		
		assertTrue(adapterHasComplementaryProvidedRoleToMediaAccess());
		assertTrue(adapterHasComplementaryRequiredRoleToFileStorage());
		assertTrue(adapterHasComplementaryRequiredRoleToDecoder());
		
	}

	private void thenTheAdapterContainsTheCorrectSEFFs() throws Exception {
		
		assertTrue(adapterContainsSEFFForServiceWith(GETFILES_SIGNATURE_ID));
		assertTrue(adapterContainsSEFFForServiceWith(STOREFILES_SIGNATURE_ID));
		
	}

	private void thenTheSizeOfAllAssemblyContextsIsCorrect() {
		
		assertTrue(this.pcmToAdapt.getSystem().getAssemblyContexts__ComposedStructure().size() == getExpectedAssemblyContextsSize());
		
	}

	private void thenForEachComponentOfOSSECThereExistExactlyOneAssemblyContext() {
		
		this.concernSolution.getComponents__Repository().forEach(component -> assertTrue(getAssemblyContextsOf(component).count() == 1));
		
	}

	private void thenTheSizeOfAllConnectorsIsCorrect() {
		
		assertTrue(this.pcmToAdapt.getSystem().getConnectors__ComposedStructure().size() == getExpectedConnectorsSize());
		
	}

	private void thenTheAdapterIsInsertedProperly() throws Exception {
		
		RepositoryComponent adapter = getAdapterComponentFrom(this.concernSolution).orElseThrow(() -> new Exception(String.format("There exist no component name: %s", ADAPTER_NAME)));
		AssemblyContext adapterAssemblyContext = getAssemblyContextsOf(adapter).findFirst().orElseThrow(() -> new Exception("There exist no adapter assembly context."));
		AssemblyContext mediaAccessAssemblyContext = (AssemblyContext) getElementWithId(MEDIAACCESS_ASSEMBLYCONTEXT_ID, this.pcmToAdapt.getSystem().eResource());
		AssemblyContext fileStorageAssemblyContext = (AssemblyContext) getElementWithId(FILESTORAGE_ASSEMBLYCONTEXT_ID, this.pcmToAdapt.getSystem().eResource());
		
		assertTrue(thereExistExactOneConnectionBetween(mediaAccessAssemblyContext, adapterAssemblyContext));
		assertTrue(thereExistExactOneConnectionBetween(adapterAssemblyContext, fileStorageAssemblyContext));
		
	}

	private void thenAllAssemblyContextsOfOSSECAreConnectedProperly() {
		
		for (RepositoryComponent eachComponent : this.concernSolution.getComponents__Repository()) {
			
			if (eachComponent.getId().equals(AGENT_COMPONENT_ID)) {
				
				continue;
				
			}
			
			AssemblyContext requiredAssemblyContext = getAssemblyContextsOf(eachComponent).findFirst().get();
			assertTrue(getOSSECAssemblyContextsConnectedTo(requiredAssemblyContext).count() == 1);			
			
		}
		
	}

	private void thenTheSizeOfAllAllocationContextsIsCorrect() {
		
		assertTrue(this.pcmToAdapt.getAllocation().getAllocationContexts_Allocation().size() == getExpectedAllocationsSize());
		
	}

	private void thenForAllAssemblyContextsOfOSSECThereExistOneAllocationContext() {
		
		this.concernSolution.getComponents__Repository().forEach(component -> {
			
			AssemblyContext assemblyContext = getAssemblyContextsOf(component).findFirst().get();
			assertTrue(getAllocationContextOf(assemblyContext).isPresent());			
			
		});
		
	}

	private void thenEachAssemblyContextOfOSSECIsDeployed() {
		
		this.concernSolution.getComponents__Repository().forEach(component -> {
			
			AssemblyContext assemblyContext = getAssemblyContextsOf(component).findFirst().get();
			AllocationContext allocationContext = getAllocationContextOf(assemblyContext).get();
			assertTrue(allocationContext.getResourceContainer_AllocationContext() != null);			
			
		});
		
	}

	private boolean adapterHasComplementaryProvidedRoleToMediaAccess() throws Exception {
		
		OperationRequiredRole requiredFileStorage = (OperationRequiredRole) getElementWithId(REQUIRED_ROLE_MEDIAACCESS, this.pcmToAdapt.getRepositories().get(0).eResource());
		return getOperationProvidedRolesOf(this.concernSolution).anyMatch(providedRole -> areEqual((Identifier) requiredFileStorage.getRequiredInterface__OperationRequiredRole(), 
																								   (Identifier) providedRole.getProvidedInterface__OperationProvidedRole()));
		
	}

	private boolean adapterHasComplementaryRequiredRoleToFileStorage() throws Exception {
		
		OperationProvidedRole providedFileStorage = (OperationProvidedRole) getElementWithId(PROVIDED_ROLE_FILESTORAGE, this.pcmToAdapt.getRepositories().get(0).eResource());
		return getOperationRequiredRolesOf(this.concernSolution).anyMatch(requiredRole -> areEqual((Identifier) requiredRole.getRequiredInterface__OperationRequiredRole(), 
				   																				   (Identifier) providedFileStorage.getProvidedInterface__OperationProvidedRole()));
		
	}

	private boolean adapterHasComplementaryRequiredRoleToDecoder() throws Exception {
		
		OperationProvidedRole providedDecoder = (OperationProvidedRole) getElementWithId(PROVIDED_ROLE_DECODER, this.concernSolution.eResource());
		return getOperationRequiredRolesOf(this.concernSolution).anyMatch(requiredRole -> areEqual((Identifier) requiredRole.getRequiredInterface__OperationRequiredRole(), 
				   																				   (Identifier) providedDecoder.getProvidedInterface__OperationProvidedRole()));
		
	}
	
	private boolean adapterContainsSEFFForServiceWith(String id) throws Exception {
		
		ResourceDemandingSEFF seff = (ResourceDemandingSEFF) getSEFFDescribing(id).orElseThrow(() -> new Exception("There exist no SEFF for signature getFiles"));
		AbstractAction current = seff.getSteps_Behaviour().get(0);
		
		current = current.getSuccessor_AbstractAction();
		isExternalCallActionWithService(DECODEEVENT_SIGNATURE_ID, current);
		
		current = current.getSuccessor_AbstractAction();
		isExternalCallActionWithService(id, current);
		
		if (id.equals(GETFILES_SIGNATURE_ID)) {
			
			current = current.getSuccessor_AbstractAction();
			assertTrue(current instanceof SetVariableAction);
			
		}
		
		return current.getSuccessor_AbstractAction() instanceof StopAction;
		
	}
	
	private Optional<ServiceEffectSpecification> getSEFFDescribing(String id) {
		
		List<ServiceEffectSpecification> seffs = ((BasicComponent) getAdapterComponentFrom(this.concernSolution).get()).getServiceEffectSpecifications__BasicComponent();
		return seffs.stream().filter(each -> ((ResourceDemandingSEFF) each).getDescribedService__SEFF().getId().equals(id))
							 .findFirst();
		
	}

	
	private void isExternalCallActionWithService(String id, AbstractAction current) {
		
		assertTrue(current instanceof ExternalCallAction);
		assertTrue(((ExternalCallAction) current).getCalledService_ExternalService().getId().equals(id));
		
	}
		
	private int getExpectedAssemblyContextsSize() {
		
		return this.oldMediaStoreAssembliesSize + 6;
		
	}
	
	private int getExpectedOSSECComponentSize() {
		
		return this.oldOSSECComponentSize + 1;
		
	}
	
	private int getExpectedConnectorsSize() {
		
		return this.oldMediaStoreConnectorsSize + 7 - 1;
		
	}
	
	private int getExpectedAllocationsSize() {
		
		return this.oldMediaStoreAllocationsSize + 6;
		
	}
	
	private Stream<OperationProvidedRole> getOperationProvidedRolesOf(Repository repository) {
		
		return repository.getComponents__Repository().stream().flatMap(each -> each.getProvidedRoles_InterfaceProvidingEntity().stream())
															  .filter(each -> each instanceof OperationProvidedRole)
															  .map(each -> (OperationProvidedRole) each);
		
	}
	
	private Stream<OperationRequiredRole> getOperationRequiredRolesOf(Repository repository) {
		
		return repository.getComponents__Repository().stream().flatMap(each -> each.getRequiredRoles_InterfaceRequiringEntity().stream())
															  .filter(each -> each instanceof OperationRequiredRole)
															  .map(each -> (OperationRequiredRole) each);
		
	}
	
	private Stream<AssemblyContext> getAssemblyContextsOf(RepositoryComponent component) {
		
		return this.pcmToAdapt.getSystem().getAssemblyContexts__ComposedStructure().stream().filter(each -> areEqual((Identifier) each.getEncapsulatedComponent__AssemblyContext(), 
																													 (Identifier) component));
		
	}
	
	private boolean thereExistExactOneConnectionBetween(AssemblyContext requiredAssemblyContext, AssemblyContext providedAssemblyContext) {
		
		return getAssemblyConnectorsWith(requiredAssemblyContext, providedAssemblyContext).count() == 1;
		
	}

	private Stream<AssemblyConnector> getAssemblyConnectorsWith(AssemblyContext requiredAssemblyContext, AssemblyContext providedAssemblyContext) {

		return this.pcmToAdapt.getSystem().getConnectors__ComposedStructure().stream().filter(each -> each instanceof AssemblyConnector)
																					  .map(each -> (AssemblyConnector) each)
																					  .filter(areConnected(requiredAssemblyContext, providedAssemblyContext));
		
	}

	private Predicate<AssemblyConnector> areConnected(AssemblyContext requiredAssemblyContext, AssemblyContext providedAssemblyContext) {
		
		return isRequiredAssemblyContext(requiredAssemblyContext).and(isProvidedAssemblyContext(providedAssemblyContext));
		
	}
	
	private Predicate<AssemblyConnector> isProvidedAssemblyContext(AssemblyContext assemblyContext) {
		
		return ac -> areEqual((Identifier) ac.getProvidingAssemblyContext_AssemblyConnector(), (Identifier) assemblyContext);
		
	}
	
	private Predicate<AssemblyConnector> isRequiredAssemblyContext(AssemblyContext assemblyContext) {
		
		return ac -> areEqual((Identifier) ac.getRequiringAssemblyContext_AssemblyConnector(), (Identifier) assemblyContext);
		
	}
	
	private boolean areEqual(Identifier identifier1, Identifier identifier2) {
		
		return identifier1.getId().equals(identifier2.getId());
		
	}
	
	private Optional<RepositoryComponent> getAdapterComponentFrom(Repository repository) {
		
		return repository.getComponents__Repository().stream().filter(each -> each.getEntityName().equals(ConcernWeaverConstant.ADAPTER_NAME))
															  .findFirst();
		
	}
	
	private Stream<AssemblyContext> getOSSECAssemblyContextsConnectedTo(AssemblyContext requiredAC) {
		
		return this.concernSolution.getComponents__Repository().stream().map(each -> getAssemblyContextsOf(each).findFirst().get())
																		.filter(each -> thereExistExactOneConnectionBetween(requiredAC, each));
		
	}
	
	private Optional<AllocationContext> getAllocationContextOf(AssemblyContext assemblyContext) {
		
		return this.pcmToAdapt.getAllocation().getAllocationContexts_Allocation().stream().filter(each -> areEqual((Identifier) assemblyContext, 
																												   (Identifier) each.getAssemblyContext_AllocationContext()))
																						  .findFirst();
		
	}
	
	private EObject getElementWithId(String id, Resource resource) throws Exception {
		
		return ExperimentUtil.getElementWithId(id, resource).orElseThrow(() -> new Exception("Element does not exist"));
		
	}
	
	@After
	public void saveModels() {
		
		ExperimentUtil.savePCMAndConcernRepositoryToResultFolder(WeavingStep.getConcernSolution(), this.pcmToAdapt);
		
	}

}
