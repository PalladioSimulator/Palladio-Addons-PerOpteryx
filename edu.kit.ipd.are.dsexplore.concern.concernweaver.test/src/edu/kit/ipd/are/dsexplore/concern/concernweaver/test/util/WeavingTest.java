package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import ConcernModel.ConcernRepository;
import ConcernModel.ElementaryConcernComponent;
import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.TransformationModelFactory;
import TransformationModel.TransformationRepository;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

public class WeavingTest {

	protected final static String DUMMY_NAME = "DummyName";
	
	protected static Repository concernSolution; 
	protected static PCMInstance pcmToAdapt;
	protected static TransformationRepository transformationRepository;
	protected static ConcernRepository concern;
	
	@BeforeClass
	public static void initialize() {
		
		ConcernWeavingTestUtil.registerFactories();
//		ConcernWeavingTestUtil.initialize();		
		
		pcmToAdapt = ConcernWeavingTestUtil.loadPCM();
		concernSolution = ConcernWeavingTestUtil.loadConcernSolution();
        concern = ConcernWeavingTestUtil.loadConcernRepository();
        transformationRepository = createTransformationRepository();
        
	}
	
	protected Repository getPcmConcernRepository() {
		
		Repository pcmConcernRepository = createRepository();
		copy(concernSolution, pcmConcernRepository);
		savePcmConcernRepository(pcmConcernRepository);
		
		return pcmConcernRepository;
		
	}
	
	private Repository createRepository() {
		
		Repository concernRepository = RepositoryFactory.eINSTANCE.createRepository();
		concernRepository.setEntityName(ConcernWeaverConstant.CONCERN_REPOSITORY_NAME);
		concernRepository.setRepositoryDescription(ConcernWeaverConstant.CONCERN_REPSITORY_DESCRIPTION);
		
		return concernRepository;
		
	}
	
	private void copy(Repository source, Repository destination) {
		
		destination.getComponents__Repository().addAll(source.getComponents__Repository());
		destination.getInterfaces__Repository().addAll(source.getInterfaces__Repository());
		
	}
	
	private void savePcmConcernRepository(Repository pcmConcernRepository) {
		
		String location = ConcernWeavingTestUtil.getAbsolutePathOf(pcmConcernRepository, pcmToAdapt.getRepositories().get(0));
		EMFHelper.saveToXMIFile(pcmConcernRepository, location);
		
	}
	
	protected List<WeavingInstruction> createTestWeavingInstructions() {

		return Arrays.asList(getWeavingInstruction());
		
	}

	private WeavingInstruction getWeavingInstruction() {
		
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(getECCWithConsumedFeatures())
											  .setWeavingLocation(getJoinPointLocation())
											  .setTransformationStrategy(transformationRepository.getTransformation().get(0))
											  .setResourceContainer(getResourceContainer())
											  .build();
		
	}

	private ResourceContainer getResourceContainer() {
		
		return pcmToAdapt.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(0);
		
	}

	@SuppressWarnings("unchecked")
	private WeavingLocation getJoinPointLocation() {
		
		AssemblyConnector assemblyConnectorToReplace = getAssembyConnectorToReplace();
		List<Signature> signatures = (List<Signature>) getSignaturesFrom(assemblyConnectorToReplace.getProvidedRole_AssemblyConnector()); 
		
		return new WeavingLocation(signatures, assemblyConnectorToReplace);
		
	}


	private List<? extends Signature> getSignaturesFrom(OperationProvidedRole providedRole) {
		
		return providedRole.getProvidedInterface__OperationProvidedRole()
						   .getSignatures__OperationInterface();
		
	}

	private AssemblyConnector getAssembyConnectorToReplace() {
		
		return (AssemblyConnector) pcmToAdapt.getSystem().getConnectors__ComposedStructure().stream().filter(eachConnector -> eachConnector instanceof AssemblyConnector)
																									 .findFirst().get();
		
	}

	private Pair<ElementaryConcernComponent, List<ProvidedRole>> getECCWithConsumedFeatures() {
		
		ElementaryConcernComponent ecc = ConcernWeavingTestUtil.getDetectionECCOf(concern);
		return Pair.of(ecc, new ECCFeatureHandler(concernSolution).getProvidedFeaturesOf(ecc));
		
	}
	
	private static TransformationRepository createTransformationRepository() {
		
		TransformationRepository transRepo = TransformationModelFactory.eINSTANCE.createTransformationRepository();
		transRepo.getTransformation().add(createAdapterTransformationStrategy());
		
		return transRepo;
		
	}
	
	private static AdapterTransformation createAdapterTransformationStrategy() {
		
		AdapterTransformation adapterTransformation = TransformationModelFactory.eINSTANCE.createAdapterTransformation();
		adapterTransformation.setAppear(Appearance.AFTER);
		adapterTransformation.setMultiple(true);
		adapterTransformation.setName("AdapterTestTrans");
		adapterTransformation.setInjectable(ConcernWeavingTestUtil.getDetectionECCOf(concern).getAnnotationenrich().get(0));
		adapterTransformation.setTarget(concern.getConcerns().get(0).getAnnotationtarget().get(0));
		
		return adapterTransformation;
		
	}

}
