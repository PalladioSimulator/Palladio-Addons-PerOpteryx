package de.uka.ipd.sdq.dsexplore.analysis.privacy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.iobserve.analysis.graph.GraphFactory;
import org.iobserve.analysis.graph.ModelCollection;
import org.iobserve.analysis.graph.ModelGraph;
import org.iobserve.analysis.privacy.ComponentClassificationAnalysis;
import org.iobserve.analysis.privacy.DeploymentAnalysis;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class PrivacyEvaluator extends AbstractAnalysis implements IAnalysis {

	private Set<Integer> legalCountryCodes;
	private Map<Long, PrivacyAnalysisResult> previousPrivacyResults = new HashMap<Long, PrivacyAnalysisResult>();

	public PrivacyEvaluator(IAnalysisQualityAttributeDeclaration qualityAttribute) {
		super(qualityAttribute);
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.legalCountryCodes = new HashSet<Integer>();
		String costModelFileName = configuration.getRawConfiguration().getAttribute(DSEConstantsContainer.PRIVACY_FILE,
				"");

		File legalPersonalGeoLocationFile = new File(costModelFileName);

		if (legalPersonalGeoLocationFile.exists() && legalPersonalGeoLocationFile.isFile()) {

			try (Stream<String> stream = Files.lines(legalPersonalGeoLocationFile.toPath())) {

				stream.forEach((s) -> legalCountryCodes.add(Integer.parseInt(s)));
			} catch (IOException e) {
				e.printStackTrace();
				throw new IllegalArgumentException(e);
			}
		}
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {

		PCMInstance pcmInstance = pheno.getPCMInstance();
		ModelCollection models = new ModelCollection(pcmInstance.getRepositories().get(0), pcmInstance.getSystem(),
				pcmInstance.getAllocation(), pcmInstance.getResourceEnvironment());

		GraphFactory graphFactory = new GraphFactory();
		ModelGraph modelGraph;
		try {
			modelGraph = graphFactory.buildGraph(models);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AnalysisFailedException(e);
		}

		ComponentClassificationAnalysis compAnalysis = new ComponentClassificationAnalysis(modelGraph);
		compAnalysis.start();

		DeploymentAnalysis deplAnalysis = new DeploymentAnalysis(modelGraph, null);
		String[] illegalDeployments = deplAnalysis.start();

		PrivacyAnalysisResult analysisResult = new PrivacyAnalysisResult(illegalDeployments, this.criterionToAspect,
				(PrivacyAnalysisQualityAttributeDeclaration) this.qualityAttribute);
		this.previousPrivacyResults.put(pheno.getNumericID(), analysisResult);

	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws CoreException, AnalysisFailedException {
		PrivacyAnalysisResult result = this.previousPrivacyResults.get(pheno.getNumericID());
		return result;
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return false;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

}
