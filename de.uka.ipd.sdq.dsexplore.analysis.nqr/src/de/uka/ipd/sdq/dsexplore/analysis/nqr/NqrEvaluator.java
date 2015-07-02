package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.internal.ReopenEditorMenu;
import org.opt4j.core.Criterion;






import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.nqr.NqrPackage;
import de.uka.ipd.sdq.nqr.NqrRepository;
import de.uka.ipd.sdq.pcm.allocation.Allocation;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcm.nqr.helper.NqrUtil;
//import de.uka.ipd.sdq.pcm.nqr.helper.NqrUtil;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class NqrEvaluator extends AbstractAnalysis implements IAnalysis{

	/** Logger for log4j. */
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");
	
	private NqrRepository nqrModel;

	//private Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();

	public NqrEvaluator(){
		super(new NqrSolverQualityAttributeDeclaration());
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException,
			AnalysisFailedException {
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		NqrRepository nqrRep = getNqrModel(configuration);
		this.nqrModel = nqrRep;
		NqrSolverQualityAttributeDeclaration quality = ((NqrSolverQualityAttributeDeclaration)this.qualityAttribute);
		for (Nqr nqr: nqrRep.getNqr())
			for (de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion crit: nqr.getCriterion())
				quality.addDimension(crit.getDimension());
					
		
		initialiseCriteria(configuration);
	}

	@Override
	public boolean hasStatisticResults() throws CoreException {
		return false;
	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws CoreException, AnalysisFailedException {
				NqrAnalysisResult result = null;
				for (AssemblyContext ac: pheno.getPCMInstance().getSystem().getAssemblyContexts__ComposedStructure())
				{
					for (RepositoryComponent rc: ac.getEncapsulatedComponent__AssemblyContext().getRepository__RepositoryComponent().getComponents__Repository())
					{
						for (Nqr nqr: nqrModel.getNqr())
						{
							if (rc.getId().equals(nqr.getAnnotatedElement().getId()))
							{
								for (de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion targetCrit: nqr.getCriterion())
								{
									DimensionType type = targetCrit.getDimension().getType();
									result = new NqrAnalysisResult(criterion, NqrUtil.getNqrValue(targetCrit), this.criterionToAspect, (NqrSolverQualityAttributeDeclaration)this.qualityAttribute);
									System.out.println();
								}
							}
						}
					}
				}
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

	/**
	 * returns a nqr model or throws an exception. 
	 * @param configuration.getRawConfiguration()
	 * @return a NqrRepository which is not null
	 * @throws CoreException if the model could not be loaded.  
	 */
	private NqrRepository getNqrModel(DSEWorkflowConfiguration configuration) throws CoreException {
		String nqrModelFileName = configuration.getRawConfiguration().getAttribute(DSEConstantsContainer.NQR_FILE, "");
		NqrRepository nqrr =  (NqrRepository)EMFHelper.loadFromXMIFile(nqrModelFileName, NqrPackage.eINSTANCE);
		if (nqrr == null){
			throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Nqr model "+nqrModelFileName+" could not be loaded.", null));
		}
		return nqrr;
	}
}
