package de.uka.ipd.sdq.dsexplore.analysis.maintainability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
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
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsFactoryImpl;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksFactoryImpl;

public class MaintainabilityEvaluator extends AbstractAnalysis implements IAnalysis {

	private DSEWorkflowConfiguration configuration;
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.maintainability");

	private Repository repository;
	private org.palladiosimulator.pcm.system.System system;
	private ComponentInternalDependencyRepository componentInternalDependencyRepository;
	private OrganizationEnvironmentModel organizationEnvironmentModel;
	private DataModel dataModel;
	private Map<String, UsageModel> usageModels;
	private AbstractISModificationRepository<ReqSeedModifications> internalModificationMarkRepository;
	private ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository;
	private ReqSeedModifications reqSeedModifications;

	private Map<Long, MaintainabilityAnalysisResult> previousMaintainabilityAnalysisResults;

	public MaintainabilityEvaluator() {
		super(new MaintainabilityQualityAttributeDeclaration());
		this.usageModels = new HashMap<String, UsageModel>();
		this.previousMaintainabilityAnalysisResults = new HashMap<Long, MaintainabilityAnalysisResult>();
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
		system = pheno.getPCMInstance().getSystem();
		repository = pheno.getPCMInstance().getRepositories().get(0);
		usageModels.put("", pheno.getPCMInstance().getUsageModel());

		for (Repository rep : pheno.getPCMInstance().getRepositories()) {
			System.out.println(rep.getEntityName());
			for (RepositoryComponent r : rep.getComponents__Repository()) {
				System.out.println("component: " + r.getEntityName());
			}
			for (Interface i : rep.getInterfaces__Repository()) {
				System.out.println("interface: " + i.getEntityName());
			}
			for (DataType d : rep.getDataTypes__Repository()) {
				System.out.println("data type: " + d.toString());
			}
		}

		// reqSeedModifications.getDataTypeModifications().add();

		ReqArchitectureVersion reqArchitectureVersion = new ReqArchitectureVersion("version", repository, system,
				fieldOfActivityRepository, internalModificationMarkRepository, componentInternalDependencyRepository,
				usageModels, dataModel, organizationEnvironmentModel, null, null, null);
		double changeImpact = evaluateChangeImpact(reqArchitectureVersion);
		this.previousMaintainabilityAnalysisResults.put(pheno.getNumericID(), new MaintainabilityAnalysisResult(5.0,
				this.criterionToAspect, (MaintainabilityQualityAttributeDeclaration) this.qualityAttribute));

	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		logger.info("maintainability evaluator initialise");
		this.initialiseCriteria(configuration);
		this.configuration = configuration;
		this.componentInternalDependencyRepository = getComponentInternalDependencyRepositoryModel(configuration);
		this.dataModel = getDataModel(configuration);
		this.organizationEnvironmentModel = getOrganizationEnvironmentModel(configuration);

		ISFieldOfActivityAnnotationsFactory fieldOfActivityAnnotationsFactory = new ISFieldOfActivityAnnotationsFactoryImpl();
		this.fieldOfActivityRepository = fieldOfActivityAnnotationsFactory
				.createISFieldOfActivityAnnotationsRepository();

		ReqModificationmarksFactory reqModificationmarksFactory = new ReqModificationmarksFactoryImpl();
		this.internalModificationMarkRepository = reqModificationmarksFactory.createReqModificationRepository();
		this.reqSeedModifications = reqModificationmarksFactory.createReqSeedModifications();
		this.internalModificationMarkRepository.setSeedModifications(reqSeedModifications);
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

	private double evaluateChangeImpact(ReqArchitectureVersion version) {
		ReqChangePropagationAnalysis reqChangePropagationAnalysis = new ReqChangePropagationAnalysis();
		reqChangePropagationAnalysis.runChangePropagationAnalysis(version);

		List<String> list = new LinkedList<String>();
		for (ChangePropagationStep step : internalModificationMarkRepository.getChangePropagationSteps()) {
			TreeIterator<EObject> objectsToSearch = step.eAllContents();
			while (objectsToSearch.hasNext()) {
				Object object = objectsToSearch.next();
				if (object instanceof AbstractModification<?, ?>) {
					AbstractModification<?, ?> modification = (AbstractModification<?, ?>) object;
					list.add(((Entity) modification.getAffectedElement()).getId());
				}
			}
		}
		return list.size();
	}
}
