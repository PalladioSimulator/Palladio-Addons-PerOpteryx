package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.modelversioning.emfprofile.EMFProfilePackage;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.ConcernModelPackage;
import ConcernModel.ConcernRepository;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import SolutionModel.SolutionModelFactory;
import TransformationModel.TransformationModelPackage;
import TransformationModel.TransformationRepository;
import concernStrategy.StrategymodelPackage;

public class ConcernWeavingTestUtil {

	public final static String RELATIVE_REPOSITORY_PERSISTING_PATH = "./result/pcm_$_weaved.repository";
	public final static String RELATIVE_CONCERN_REPOSITORY_PERSISTING_PATH = "./result/pcm_concern_repo_weaved.repository";
	public final static String RELATIVE_ASSEMBLY_PERSISTING_PATH = "./result/pcm_assembly_weaved.system";
	public final static String RELATIVE_ALLOCATION_PERSISTING_PATH = "./result/pcm_allocation_weaved.allocation";
	public final static String REPOSITORY_FILE_EXTENSION = "repository";
	public final static String RELATIV_PCM_ALLOCATION_MODEL_PATH_SEGMENT = "/models/ms_base.allocation";
	public final static String RELATIV_PCM_RESOURCE_ENV_MODEL_PATH_SEGMENT = "/models/ms.resourceenvironment";
	public final static String RELATIVE_PCM_REPOSITORY_MODEL_PATH_SEGMENT = "/models/ms.repository";
	public final static String RELATIV_PCM_USAGE_MODEL_PATH_SEGMENT = "/models/ms_usage.usagemodel";
	public final static String RELATIVE_PCM_ASSEMBLY_PATH_SEGMENT = "/models/ms_base.system";
	public final static String RELATIVE_CONCERN_REALIZATION_MODEL_PATH_SEGMENT = "/models/ossec.repository";
	public final static String RELATIVE_CONCERN_REPOSITORY_MODEL_PATH_SEGMENT = "/models/concern.concernmodel";
	public final static String RELATIVE_CONCERN_TRANSFORMATION_MODEL_PATH_SEGMENT = "/models/TransformationRepository.transformationmodel";
	public final static String RELATIVE_CONCERN_STRATEGY_ANNOTATION_MODEL_PATH_SEGMENT = "/models/strategy.emfprofile_diagram";
	public final static String RELATIVE_PCM_CONCERN_MODEL_PATH_SEGMENT = "/assembly_models/TemporaryConcernRepository.repository";
	public final static String RELATIVE_RESULT_FOLDER_PATH_SEGMENT = "/result";
	public final static String RELATIVE_CONCERN_REALIZATION_ANNOTATION_MODEL_PATH_SEGMENT = "/models/annotations.emfprofile_diagram";
	public final static String RELATIVE_CONCERN_REALIZATION_STRATEGY_MODEL_PATH_SEGMENT = "/models/strategy.emfprofile_diagram";

	private final static String ECC_DETECTION_NAME = "Detection";
	private final static String ECC_RESPONSE_NAME = "Response";
	private final static String ECC_ANALYSIS_NAME = "Analysis";

	public static Solution loadConcernSolution() {
		Solution sol = SolutionModelFactory.eINSTANCE.createSolution();
		sol.setRepository((Repository) ConcernWeavingTestUtil.loadWithProfiles(RepositoryPackage.eINSTANCE, ConcernWeavingTestUtil.RELATIVE_CONCERN_REALIZATION_MODEL_PATH_SEGMENT));
		return sol;
	}

	public static Repository loadPCMConcernRepository() {

		return (Repository) ConcernWeavingTestUtil.loadWithoutProfiles(RepositoryPackage.eINSTANCE, ConcernWeavingTestUtil.RELATIVE_PCM_CONCERN_MODEL_PATH_SEGMENT);

	}

	public static ConcernRepository loadConcernRepository() {

		return (ConcernRepository) ConcernWeavingTestUtil.loadWithProfiles(ConcernModelPackage.eINSTANCE, ConcernWeavingTestUtil.RELATIVE_CONCERN_REPOSITORY_MODEL_PATH_SEGMENT);

	}

	public static TransformationRepository loadTransformation() {

		EObject transRepo = ConcernWeavingTestUtil.loadWithoutProfiles(TransformationModelPackage.eINSTANCE, ConcernWeavingTestUtil.RELATIVE_CONCERN_TRANSFORMATION_MODEL_PATH_SEGMENT);
		EcoreUtil.resolveAll(transRepo);

		return (TransformationRepository) transRepo;

	}

	public static PCMInstance loadPCM() {

		List<String> modelFiles = new ArrayList<>();
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIV_PCM_ALLOCATION_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIV_PCM_USAGE_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIVE_PCM_REPOSITORY_MODEL_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIVE_PCM_ASSEMBLY_PATH_SEGMENT));
		modelFiles.add(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIV_PCM_RESOURCE_ENV_MODEL_PATH_SEGMENT));

		PCMResourceSetPartition set = ConcernWeavingTestUtil.createPCMResourceSetPartition(modelFiles);
		// set.resolveAllProxies();

		return new PCMInstance(set);

	}

	public static PCMResourceSetPartition createPCMResourceSetPartition(List<String> modelFiles) {

		PCMResourceSetPartition resourceSetPartition = new PCMResourceSetPartition();
		resourceSetPartition.initialiseResourceSetEPackages(AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES);
		resourceSetPartition.initialiseResourceSetEPackages(ConcernWeavingTestUtil.getRelevantPackages());

		for (String modelFile : modelFiles) {

			resourceSetPartition.loadModel(modelFile);

		}

		return resourceSetPartition;

	}

	private static EPackage[] getRelevantPackages() {

		List<EPackage> profilePackages = new ArrayList<>();
		profilePackages.add(EMFProfilePackage.eINSTANCE);
		profilePackages.add(EMFProfileApplicationPackage.eINSTANCE);
		profilePackages.add(NotationPackage.eINSTANCE);
		profilePackages.add(ConcernModelPackage.eINSTANCE);
		profilePackages.addAll(ConcernWeavingTestUtil.getProfiles(new ResourceSetImpl()));

		EPackage[] helper = new EPackage[profilePackages.size()];
		helper = profilePackages.toArray(helper);

		return helper;

	}

	private static EObject loadWithoutProfiles(EPackage modelPackage, String relativePath) {

		ResourceSet set = new ResourceSetImpl();

		ConcernWeavingTestUtil.registerDefaultPackages(set);
		ConcernWeavingTestUtil.registerPackage(set, modelPackage);

		return ConcernWeavingTestUtil.load(set.getResource(URI.createFileURI(ConcernWeavingTestUtil.getAbsolutePathOf(relativePath)), true));

	}

	public static EObject loadWithProfiles(EPackage modelPackage, String relativePath) {

		ResourceSet set = new ResourceSetImpl();

		ConcernWeavingTestUtil.registerDefaultPackages(set);
		ConcernWeavingTestUtil.registerPackage(set, modelPackage);
		ConcernWeavingTestUtil.loadProfile(set);

		return ConcernWeavingTestUtil.load(set.getResource(URI.createFileURI(ConcernWeavingTestUtil.getAbsolutePathOf(relativePath)), true));

	}

	private static EObject load(Resource resource) {

		return resource.getContents().get(0);

	}

	private static void loadProfile(ResourceSet set) {

		ConcernWeavingTestUtil.registerPackages(set, ConcernWeavingTestUtil.getProfiles(set));

	}

	public static List<Profile> getProfiles(ResourceSet set) {

		Resource annotationProfile = set.getResource(URI.createFileURI(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIVE_CONCERN_REALIZATION_ANNOTATION_MODEL_PATH_SEGMENT)),
				true);
		Resource strategyProfile = set.getResource(URI.createFileURI(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIVE_CONCERN_STRATEGY_ANNOTATION_MODEL_PATH_SEGMENT)), true);

		return Arrays.asList((Profile) annotationProfile.getContents().get(0), (Profile) strategyProfile.getContents().get(0));

	}

	private static void registerPackage(ResourceSet set, EPackage modelPackage) {

		set.getPackageRegistry().put(modelPackage.getNsURI(), modelPackage);

	}

	private static void registerPackages(ResourceSet set, List<Profile> modelPackages) {

		modelPackages.forEach(modelPackage -> ConcernWeavingTestUtil.registerPackage(set, modelPackage));

	}

	private static void registerDefaultPackages(ResourceSet set) {

		set.getPackageRegistry().put(EMFProfilePackage.eNS_URI, EMFProfilePackage.eINSTANCE);
		set.getPackageRegistry().put(EMFProfileApplicationPackage.eNS_URI, EMFProfileApplicationPackage.eINSTANCE);
		set.getPackageRegistry().put(NotationPackage.eNS_PREFIX, NotationPackage.eINSTANCE);
		set.getPackageRegistry().put(StrategymodelPackage.eNS_URI, StrategymodelPackage.eINSTANCE);
		set.getPackageRegistry().put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);

	}

	public static void registerFactories() {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

	}

	public static String getAbsolutePathOf(Repository repository, Repository referenceRepository) {

		String absolutePath = ConcernWeavingTestUtil.getAbsolutePathOf(referenceRepository);
		return String.format("%1s\\%2s.%3s", new File(absolutePath).getParent(), repository.getEntityName(), FilenameUtils.getExtension(absolutePath));

	}

	public static String getAbsolutePathOf(EObject object) {

		return ConcernWeavingTestUtil.getAbsolutePathOf(object.eResource());

	}

	private static String getAbsolutePathOf(Resource resource) {

		return new File(resource.getURI().path()).toString();

	}

	public static String getAbsolutePathOf(String relativePath) {

		return System.getProperty("user.dir") + relativePath;

	}

	public static String getAbsoluteResultFolderPathOf(Repository repository) {

		return String.format("%1s/%2s.%3s", new File(ConcernWeavingTestUtil.getAbsolutePathOf(ConcernWeavingTestUtil.RELATIVE_RESULT_FOLDER_PATH_SEGMENT)), repository.getEntityName(),
				ConcernWeavingTestUtil.REPOSITORY_FILE_EXTENSION);

	}

	public static ElementaryConcernComponent getDetectionECCOf(ConcernRepository concern) {

		return concern.getConcerns().stream().flatMap(eachConcern -> eachConcern.getComponents().stream()).filter(eachECC -> eachECC.getName().equals(ConcernWeavingTestUtil.ECC_DETECTION_NAME))
				.findFirst().get();

	}

	public static ElementaryConcernComponent getResponseECCOf(ConcernRepository concern) {

		return concern.getConcerns().stream().flatMap(eachConcern -> eachConcern.getComponents().stream()).filter(eachECC -> eachECC.getName().equals(ConcernWeavingTestUtil.ECC_RESPONSE_NAME))
				.findFirst().get();

	}

	public static ElementaryConcernComponent getAnalysisECCOf(ConcernRepository concern) {

		return concern.getConcerns().stream().flatMap(eachConcern -> eachConcern.getComponents().stream()).filter(eachECC -> eachECC.getName().equals(ConcernWeavingTestUtil.ECC_ANALYSIS_NAME))
				.findFirst().get();

	}

}
