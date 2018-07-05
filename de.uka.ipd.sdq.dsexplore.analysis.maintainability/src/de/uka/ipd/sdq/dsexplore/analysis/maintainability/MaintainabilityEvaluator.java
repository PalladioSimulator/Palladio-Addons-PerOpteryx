package de.uka.ipd.sdq.dsexplore.analysis.maintainability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsFactoryImpl;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksFactoryImpl;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksFactoryImpl;

public class MaintainabilityEvaluator extends AbstractAnalysis implements IAnalysis {

	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.maintainability");

	private org.palladiosimulator.pcm.system.System baseSystem;
	private ComponentInternalDependencyRepository componentInternalDependencyRepository;
	private OrganizationEnvironmentModel organizationEnvironmentModel;
	private DataModel dataModel;

	private Map<Long, MaintainabilityAnalysisResult> previousMaintainabilityAnalysisResults;

	public MaintainabilityEvaluator() {
		super(new MaintainabilityQualityAttributeDeclaration());
		this.previousMaintainabilityAnalysisResults = new HashMap<Long, MaintainabilityAnalysisResult>();
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
		org.palladiosimulator.pcm.system.System system = pheno.getPCMInstance().getSystem();
		Map<String, UsageModel> usageModels = new HashMap<String, UsageModel>();
		usageModels.put("", pheno.getPCMInstance().getUsageModel());
		Repository repository = getRepository(system, pheno.getPCMInstance().getRepositories());
		ReqModificationmarksFactory reqModificationmarksFactory = new ReqModificationmarksFactoryImpl();
		ISFieldOfActivityAnnotationsFactory fieldOfActivityAnnotationsFactory = new ISFieldOfActivityAnnotationsFactoryImpl();
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = fieldOfActivityAnnotationsFactory
				.createISFieldOfActivityAnnotationsRepository();
		AbstractISModificationRepository<ReqSeedModifications> internalModificationMarkRepository = reqModificationmarksFactory
				.createReqModificationRepository();
		ReqSeedModifications reqSeedModifications = reqModificationmarksFactory.createReqSeedModifications();
		internalModificationMarkRepository.setSeedModifications(reqSeedModifications);
		ReqArchitectureVersion reqArchitectureVersion = null;

		createAndAddComponentSeedModification(system, reqSeedModifications);

		// at the moment, REMOVE modification is analysed
		reqArchitectureVersion = new ReqArchitectureVersion("version", repository, baseSystem,
				fieldOfActivityRepository, internalModificationMarkRepository, componentInternalDependencyRepository,
				usageModels, dataModel, organizationEnvironmentModel, null, null, null);
		double changeImpact = evaluateChangeImpact(reqArchitectureVersion, internalModificationMarkRepository);
		this.previousMaintainabilityAnalysisResults.put(pheno.getNumericID(),
				new MaintainabilityAnalysisResult(changeImpact, this.criterionToAspect,
						(MaintainabilityQualityAttributeDeclaration) this.qualityAttribute));
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.initialiseCriteria(configuration);
		this.componentInternalDependencyRepository = getComponentInternalDependencyRepositoryModel(configuration);
		this.dataModel = getDataModel(configuration);
		this.organizationEnvironmentModel = getOrganizationEnvironmentModel(configuration);
		this.baseSystem = getBaseSystemModel(configuration);
	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws CoreException, AnalysisFailedException {
		return this.previousMaintainabilityAnalysisResults.get(pheno.getNumericID());
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return false;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public List<Criterion> getCriterions() throws CoreException {
		List<Criterion> criterions = new ArrayList<Criterion>();
		criterions.addAll(this.criteriaList);
		return criterions;
	}

	/**
	 * returns a ComponentInternalDependencyRepository or throws an exception.
	 *
	 * @param configuration.getRawConfiguration()
	 * @return ComponentInternalDependencyRepository which is not null
	 * @throws CoreException
	 *             if the model could not be loaded.
	 */
	private ComponentInternalDependencyRepository getComponentInternalDependencyRepositoryModel(
			DSEWorkflowConfiguration configuration) throws CoreException {
		String componentInternalDependencyRepositoryFileName = configuration.getRawConfiguration()
				.getAttribute(DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE, "");
		componentInternalDependencyRepository = (ComponentInternalDependencyRepository) EMFHelper.loadFromXMIFile(
				componentInternalDependencyRepositoryFileName, ComponentInternalDependenciesPackage.eINSTANCE);
		if (componentInternalDependencyRepository == null) {
			throw new CoreException(
					new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "ComponentInternalDependencyRepository "
							+ componentInternalDependencyRepositoryFileName + " could not be loaded.", null));
		}
		return componentInternalDependencyRepository;
	}

	/**
	 * returns a DataModel or throws an exception.
	 *
	 * @param configuration.getRawConfiguration()
	 * @return DataModel which is not null
	 * @throws CoreException
	 *             if the model could not be loaded.
	 */
	private DataModel getDataModel(DSEWorkflowConfiguration configuration) throws CoreException {
		String dataModelFileName = configuration.getRawConfiguration()
				.getAttribute(DSEConstantsContainer.DATA_MODEL_FILE, "");
		dataModel = (DataModel) EMFHelper.loadFromXMIFile(dataModelFileName, DatamodelPackage.eINSTANCE);
		if (dataModel == null) {
			throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0,
					"DataModel " + dataModelFileName + " could not be loaded.", null));
		}
		return dataModel;
	}

	/**
	 * returns a SystemModel or throws an exception.
	 *
	 * @param configuration.getRawConfiguration()
	 * @return DataModel which is not null
	 * @throws CoreException
	 *             if the model could not be loaded.
	 */
	private org.palladiosimulator.pcm.system.System getBaseSystemModel(DSEWorkflowConfiguration configuration)
			throws CoreException {
		String systemModelFileName = configuration.getRawConfiguration()
				.getAttribute(DSEConstantsContainer.SYSTEM_MODEL_FILE, "");
		baseSystem = (org.palladiosimulator.pcm.system.System) EMFHelper.loadFromXMIFile(systemModelFileName,
				SystemPackage.eINSTANCE);
		if (baseSystem == null) {
			throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0,
					"SystemModel " + systemModelFileName + " could not be loaded.", null));
		}
		return baseSystem;
	}

	/**
	 * returns a OrganizationEnvironmentModel or throws an exception.
	 *
	 * @param configuration.getRawConfiguration()
	 * @return OrganizationEnvironmentModel which is not null
	 * @throws CoreException
	 *             if the model could not be loaded.
	 */
	private OrganizationEnvironmentModel getOrganizationEnvironmentModel(DSEWorkflowConfiguration configuration)
			throws CoreException {
		String organizationEnvironmentModelFileName = configuration.getRawConfiguration()
				.getAttribute(DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_FILE, "");
		organizationEnvironmentModel = (OrganizationEnvironmentModel) EMFHelper
				.loadFromXMIFile(organizationEnvironmentModelFileName, OrganizationenvironmentmodelPackage.eINSTANCE);
		if (organizationEnvironmentModel == null) {
			throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0,
					"OrganizationEnvironmentModel " + organizationEnvironmentModelFileName + " could not be loaded.",
					null));
		}
		return organizationEnvironmentModel;
	}

	/**
	 * returns a repository model or throws an exception.
	 *
	 * @throws CoreException
	 *             if the model could not be loaded.
	 */
	private Repository getRepository(org.palladiosimulator.pcm.system.System system, List<Repository> candidates)
			throws CoreException {
		Repository repository = null;
		for (AssemblyContext assemblyContext : system.getAssemblyContexts__ComposedStructure()) {
			RepositoryComponent component = assemblyContext.getEncapsulatedComponent__AssemblyContext();
			for (Repository rep : candidates) {
				for (RepositoryComponent r : rep.getComponents__Repository()) {
					if (component == r) {
						repository = rep;
						break;
					}
				}
			}
			if (repository != null) {
				break;
			}
		}
		if (repository == null) {
			throw new CoreException(
					new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Repository could not be loaded.", null));
		} else {
			logger.info("repository '" + repository.getEntityName() + "' registered");
		}
		return repository;
	}

	/**
	 * run KAMP
	 * 
	 * @param version
	 * @param internalModificationMarkRepository
	 * @return
	 */
	private double evaluateChangeImpact(ReqArchitectureVersion version,
			AbstractISModificationRepository<ReqSeedModifications> internalModificationMarkRepository) {
		ReqChangePropagationAnalysis reqChangePropagationAnalysis = new ReqChangePropagationAnalysis();
		reqChangePropagationAnalysis.runChangePropagationAnalysis(version);
		return internalModificationMarkRepository.getChangePropagationSteps().size()
				+ internalModificationMarkRepository.getSeedModifications().getComponentModifications().size();
	}

	/**
	 * create component seed modification for every component, which is contained in
	 * the base assembly, but not in the current assembly
	 * 
	 * @param system
	 * @param reqSeedModifications
	 */
	private void createAndAddComponentSeedModification(org.palladiosimulator.pcm.system.System system,
			ReqSeedModifications reqSeedModifications) {
		for (AssemblyContext baseAssemblyContext : baseSystem.getAssemblyContexts__ComposedStructure()) {
			boolean contains = false;
			for (AssemblyContext assemblyContext : system.getAssemblyContexts__ComposedStructure()) {
				if (baseAssemblyContext.getEncapsulatedComponent__AssemblyContext().getId()
						.equals(assemblyContext.getEncapsulatedComponent__AssemblyContext().getId())) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				ISModificationmarksFactory isModificationmarksFactory = new ISModificationmarksFactoryImpl();
				ISModifyComponent isModifyComponent = isModificationmarksFactory.createISModifyComponent();
				isModifyComponent.setAffectedElement(baseAssemblyContext.getEncapsulatedComponent__AssemblyContext());
				reqSeedModifications.getComponentModifications().add(isModifyComponent);
			}
		}
	}
}
