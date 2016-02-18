package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.nqr.NqrPackage;
import de.uka.ipd.sdq.nqr.NqrRepository;
import de.uka.ipd.sdq.pcmsupport.PCMPhenotype;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class NqrEvaluator extends AbstractAnalysis implements IAnalysis{

	/** Logger for log4j. */
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");
	
	private NqrRepository nqrModel;
	private Map<Long, NqrAnalysisResult> previousNqrResults = new HashMap<Long, NqrAnalysisResult>();

	//private Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();

	public NqrEvaluator(){
		super(new NqrSolverQualityAttributeDeclaration());
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException,
			AnalysisFailedException {
//		for (AssemblyContext ac: pheno.getPCMInstance().getSystem().getAssemblyContexts__ComposedStructure())
//		{
//			for (RepositoryComponent rc: ac.getEncapsulatedComponent__AssemblyContext().getRepository__RepositoryComponent().getComponents__Repository())
//			{
				//for (Nqr nqr: nqrModel.getNqr())
				//{
					//if (rc.getId().equals(nqr.getAnnotatedElement().getId()))
					//if (doesNqrApply(nqr.getAnnotatedElement(), pheno.getPCMInstance()))
					//{
						//for (de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion targetCrit: nqr.getCriterion())
						//{
							List<Nqr> nqr = new ArrayList<Nqr>();
							for (Nqr iter: nqrModel.getNqr())
								if (doesNqrApply(iter.getAnnotatedElement(), pheno.getPCMInstance()))
									nqr.add(iter);
							previousNqrResults.put(pheno.getNumericID(), new NqrAnalysisResult(this.criterionToAspect, nqr, (NqrSolverQualityAttributeDeclaration)this.qualityAttribute));
							//}
							//}
							//}
//			//}
//		//}
	}
	
	/**
	 * Only checks uses in system (for components) and in the allocation (for processing resources)
	 * @param cost
	 * @param pcmInstance
	 * @return
	 */
	private boolean doesNqrApply(RepositoryComponent component, PCMInstance pcmInstance) {
			List<AssemblyContext> asctx =  getAllContainedAssemblyContexts(pcmInstance.getSystem().getAssemblyContexts__ComposedStructure());
			
			for (AssemblyContext assemblyContext : asctx) {
				if (EMFHelper.checkIdentity(assemblyContext.getEncapsulatedComponent__AssemblyContext(), component)){
					return true;
				}
			}
			return false;
	}
	
	/** 
	 * Get all contained ones recursively
	 * @param assemblyContextsComposedStructure
	 * @return
	 * Copied from CostEvaluator
	 */
	private List<AssemblyContext> getAllContainedAssemblyContexts(
			EList<AssemblyContext> assemblyContextsComposedStructure) {
		List<AssemblyContext> list = new ArrayList<AssemblyContext>();
		list.addAll(assemblyContextsComposedStructure);
		for (AssemblyContext assemblyContext : assemblyContextsComposedStructure) {
			if (assemblyContext.getEncapsulatedComponent__AssemblyContext() instanceof ComposedStructure){
				ComposedStructure composite = (ComposedStructure)assemblyContext.getEncapsulatedComponent__AssemblyContext();
				list.addAll(getAllContainedAssemblyContexts(composite.getAssemblyContexts__ComposedStructure()));
			}
		}
		return list;
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		NqrRepository nqrRep = getNqrModel(configuration);
		this.nqrModel = nqrRep;
		NqrSolverQualityAttributeDeclaration quality = ((NqrSolverQualityAttributeDeclaration)this.qualityAttribute);
		for (Nqr nqr: nqrRep.getNqr())
			for (de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion crit: nqr.getCriterion())
			{
				Dimension d = crit.getDimension();
				if (d != null && !quality.getDimensions().contains(d))
					quality.addDimension(crit.getDimension());
			}
					
		
		initialiseCriteria(configuration);
	}

	@Override
	public boolean hasStatisticResults() throws CoreException {
		return false;
	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws CoreException, AnalysisFailedException {
		NqrAnalysisResult result = this.previousNqrResults.get(pheno.getNumericID());
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
		NqrRepository nqrr =  (NqrRepository)de.uka.ipd.sdq.pcmsupport.helper.EMFHelper.loadFromXMIFile(nqrModelFileName, NqrPackage.eINSTANCE);
		if (nqrr == null){
			throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore", 0, "Nqr model "+nqrModelFileName+" could not be loaded.", null));
		}
		return nqrr;
	}
}
