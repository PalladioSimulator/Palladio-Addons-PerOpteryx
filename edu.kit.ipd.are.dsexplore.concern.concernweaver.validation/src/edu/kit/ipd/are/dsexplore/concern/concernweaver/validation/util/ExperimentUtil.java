package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.TransformationModelFactory;
import de.uka.ipd.sdq.identifier.Identifier;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public class ExperimentUtil {

	public final static String RELATIV_PCM_ALLOCATION_MODEL_PATH_SEGMENT = "/models/ms_base.allocation";
	public final static String RELATIV_PCM_RESOURCE_ENV_MODEL_PATH_SEGMENT = "/models/ms.resourceenvironment";
	public final static String RELATIVE_PCM_REPOSITORY_MODEL_PATH_SEGMENT = "/models/ms.repository";
	public final static String RELATIV_PCM_USAGE_MODEL_PATH_SEGMENT = "/models/ms_usage.usagemodel";
	public final static String RELATIVE_PCM_ASSEMBLY_PATH_SEGMENT = "/models/ms_base.system";
	
	private final static String RELATIVE_RESULT_FOLDER_PATH_SEGMENT = "\\result\\";
	
	public static PCMInstance loadPCM() {
		
		List<String> modelFiles = new ArrayList<String>();
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(RELATIV_PCM_ALLOCATION_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(RELATIV_PCM_USAGE_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(RELATIVE_PCM_REPOSITORY_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(RELATIVE_PCM_ASSEMBLY_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(RELATIV_PCM_RESOURCE_ENV_MODEL_PATH_SEGMENT));
		
		PCMResourceSetPartition set = ConcernWeavingTestUtil.createPCMResourceSetPartition(modelFiles);
		PCMInstance pcm = new PCMInstance(set);

		return pcm;
		
	}
	
	public static AdapterTransformation createAdapterTransformationStrategy(String name) {
		
		AdapterTransformation adapterTransformation = TransformationModelFactory.eINSTANCE.createAdapterTransformation();
		adapterTransformation.setAppear(Appearance.BEFORE);
		adapterTransformation.setMultiple(false);
		adapterTransformation.setName(name);
		
		return adapterTransformation;
		
	}

	public static Connector getConnectorWith(String Id, System system) {
		
		return system.getConnectors__ComposedStructure().stream().filter(eachAssemblyConnector -> eachAssemblyConnector.getId().equals(Id))
														  		 .findFirst().get();
		
	}
	
	public static List<Signature> getSignatures(List<Repository> repositories, String... signatureIds) {
		
		return Arrays.asList(signatureIds).stream().map(eachSignature -> getSignatureBy(eachSignature, repositories))
												   .collect(Collectors.toList());
		
	}
	
	private static Signature getSignatureBy(String Id, List<Repository> repositories) {

		return repositories.stream().flatMap(eachRepo -> eachRepo.getInterfaces__Repository().stream())
									.filter(eachInterface -> eachInterface instanceof OperationInterface)
									.flatMap(eachOperationInterface -> ((OperationInterface) eachOperationInterface).getSignatures__OperationInterface().stream())
									.filter(eachSignature -> eachSignature.getId().equals(Id))
									.findFirst().get();
									
	}
	
	public static ResourceContainer getResourceContainerWith(String Id, ResourceEnvironment resourceEnvironment) {
	
		return resourceEnvironment.getResourceContainer_ResourceEnvironment().stream().filter(eachContainer -> eachContainer.getId().equals(Id))
																					  .findFirst().get();
		
	}
	
	public static void savePCMAndConcernRepositoryToResultFolder(Repository pcmConcernRepository, PCMInstance pcmToSave) {
		
		save(pcmConcernRepository);
		savePcm(pcmToSave);
		
	}
	
	private static void savePcm(PCMInstance pcmToSave) {
		
		save(asObjectList(pcmToSave.getRepositories()));
		save(pcmToSave.getSystem());
		save(pcmToSave.getAllocation());
		save(pcmToSave.getUsageModel());
		
	}

	private static void save(List<EObject> modelsToSave) {
		
		modelsToSave.forEach(eachModelToSave -> save(eachModelToSave));
		
	}
	
	private static void save(EObject modelToSave) {
		
		String location = ConcernWeaverUtil.getAbsolutePathOf(modelToSave);
		EMFHelper.saveToXMIFile(modelToSave, location.replace("\\models\\", RELATIVE_RESULT_FOLDER_PATH_SEGMENT));
		
	}
	
	private static List<EObject> asObjectList(List<Repository> repositories) {
		
		return repositories.stream().map(eachRepository -> (EObject) eachRepository)
									.collect(Collectors.toList());
		
	}
	
	public static Optional<EObject> getElementWithId(String id, Resource resource) {
		
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			
			EObject current = iterator.next();
			if (!(current instanceof Identifier)) {
				
				continue;
				
			}
			
			if (hasSameIdentity((Identifier) current, id)) {
				
				return Optional.of(current);
				
			}
			
		}
		
		return Optional.empty();
		
	}

	private static boolean hasSameIdentity(Identifier identifiableObject, String id) {
		
		return identifiableObject.getId().equals(id);
		
	}
	
}
