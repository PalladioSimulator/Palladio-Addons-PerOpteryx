package de.uka.ipd.sdq.dsexplore.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.opt4j.core.Criterion;
import org.opt4j.core.InfeasibilityConstraint;
import org.opt4j.core.Objective;
import org.opt4j.core.SatisfactionConstraint;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.EntryLevelSystemCallInfeasibilityConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.EntryLevelSystemCallObjectiveBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.EntryLevelSystemCallSatisfactionConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedInfeasibilityConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedObjectiveBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedSatisfactionConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.reader.PCMDeclarationsReader;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public abstract class AbstractAnalysis implements IAnalysis {

	protected MDSDBlackboard blackboard;

	protected IAnalysisQualityAttributeDeclaration qualityAttribute;

	protected List<Criterion> criteriaList = new ArrayList<Criterion>();
	protected Map<Criterion, EvaluationAspectWithContext> criterionToAspect = new HashMap<Criterion, EvaluationAspectWithContext>();

	public AbstractAnalysis(IAnalysisQualityAttributeDeclaration qualityAttribute) {
		super();
		this.qualityAttribute = qualityAttribute;
	}

	public QualityAttribute getQualityAttribute() throws CoreException {
		// return DSEConstantsContainer.MEAN_RESPONSE_TIME_QUALITY;
		return qualityAttribute.getQualityAttribute();
	}

	protected void initialiseCriteria(DSEWorkflowConfiguration configuration) throws CoreException {
		PCMInstance pcmInstance = getPCMInstance();
		List<UsageScenario> scenarios = pcmInstance.getUsageModel().getUsageScenario_UsageModel();
		UsageModel usageModel = pcmInstance.getUsageModel();

		PCMDeclarationsReader reader = new PCMDeclarationsReader(configuration.getRawConfiguration().getAttribute("qmlDefinitionFile", ""));

		List<Dimension> dimensions = this.qualityAttribute.getDimensions();

		List<EvaluationAspectWithContext> qualityAttributeAspects = new ArrayList<EvaluationAspectWithContext>(6);
		for (Dimension dimension : dimensions) {
			qualityAttributeAspects.addAll(reader.getDimensionConstraintContextsForUsageModel(usageModel, dimension.getId()));
			qualityAttributeAspects.addAll(reader.getDimensionObjectiveContextsForUsageModel(usageModel, dimension.getId()));
		}

		// Check constraint aspects and create Constraint-Objects for every
		// Aspect
		for (Iterator<EvaluationAspectWithContext> iterator = qualityAttributeAspects.iterator(); iterator.hasNext();) {
			EvaluationAspectWithContext aspectContext = iterator.next();
			// handle possible aspects here
			if (canEvaluateAspect(aspectContext.getEvaluationAspect(), aspectContext.getDimension())) {

				if (aspectContext.getRequirement() instanceof UsageScenarioRequirement) {

					if (((UsageScenarioRequirement) aspectContext.getRequirement()).getUsageScenario() == null) {
						// The criterion refers to EVERY US since none is
						// explicitly specified
						for (Iterator<UsageScenario> iterator2 = scenarios.iterator(); iterator2.hasNext();) {
							UsageScenario usageScenario = (UsageScenario) iterator2.next();

							if (aspectContext.getCriterion() instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint) {
								UsageScenarioBasedInfeasibilityConstraintBuilder builder = new UsageScenarioBasedInfeasibilityConstraintBuilder(
										usageScenario);
								InfeasibilityConstraint c = reader.translateEvalAspectToInfeasibilityConstraint(aspectContext, builder);

								criteriaList.add(c);
								criterionToAspect.put(c, aspectContext);
							} else {
								// instanceof Objective
								UsageScenarioBasedObjectiveBuilder objectiveBuilder = new UsageScenarioBasedObjectiveBuilder(usageScenario);
								Objective o = reader.translateEvalAspectToObjective(this.getQualityAttribute().getName(), aspectContext,
										objectiveBuilder);
								criteriaList.add(o);
								criterionToAspect.put(o, aspectContext);

								UsageScenarioBasedSatisfactionConstraintBuilder builder = new UsageScenarioBasedSatisfactionConstraintBuilder(
										usageScenario);
								SatisfactionConstraint c = reader.translateEvalAspectToSatisfactionConstraint(aspectContext, o, builder);
								criteriaList.add(c);
								criterionToAspect.put(c, aspectContext);
							}
						}
					} else {
						if (aspectContext.getCriterion() instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint) {
							UsageScenarioBasedInfeasibilityConstraintBuilder builder = new UsageScenarioBasedInfeasibilityConstraintBuilder(
									((UsageScenarioRequirement) aspectContext.getRequirement()).getUsageScenario());

							InfeasibilityConstraint c = reader.translateEvalAspectToInfeasibilityConstraint(aspectContext, builder);
							criteriaList.add(c);
							criterionToAspect.put(c, aspectContext);
						} else {
							// instanceof Objective
							UsageScenarioBasedObjectiveBuilder objectiveBuilder = new UsageScenarioBasedObjectiveBuilder(
									((UsageScenarioRequirement) aspectContext.getRequirement()).getUsageScenario());
							Objective o = reader.translateEvalAspectToObjective(this.getQualityAttribute().getName(), aspectContext,
									objectiveBuilder);
							criteriaList.add(o);
							criterionToAspect.put(o, aspectContext);

							UsageScenarioBasedSatisfactionConstraintBuilder builder = new UsageScenarioBasedSatisfactionConstraintBuilder(
									((UsageScenarioRequirement) aspectContext.getRequirement()).getUsageScenario());

							SatisfactionConstraint c = reader.translateEvalAspectToSatisfactionConstraint(aspectContext, o, builder);
							criteriaList.add(c);
							criterionToAspect.put(c, aspectContext);
						}
					}

				} else if (aspectContext.getRequirement() instanceof EntryLevelSystemCallRequirement) {
					if (aspectContext.getCriterion() instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint) {
						EntryLevelSystemCallInfeasibilityConstraintBuilder builder = new EntryLevelSystemCallInfeasibilityConstraintBuilder(
								((EntryLevelSystemCallRequirement) aspectContext.getRequirement()).getEntryLevelSystemCall());
						InfeasibilityConstraint c = reader.translateEvalAspectToInfeasibilityConstraint(aspectContext, builder);
						criteriaList.add(c);
						criterionToAspect.put(c, aspectContext);
					} else {
						// instanceof Objective
						EntryLevelSystemCall entryLevelSystemCall = ((EntryLevelSystemCallRequirement) aspectContext.getRequirement())
								.getEntryLevelSystemCall();
						EntryLevelSystemCallObjectiveBuilder builder = new EntryLevelSystemCallObjectiveBuilder(entryLevelSystemCall);

						Objective o = reader.translateEvalAspectToObjective(this.getQualityAttribute().getName(), aspectContext, builder);
						criteriaList.add(o);
						criterionToAspect.put(o, aspectContext);

						EntryLevelSystemCallSatisfactionConstraintBuilder satisBuilder = new EntryLevelSystemCallSatisfactionConstraintBuilder(
								entryLevelSystemCall);
						SatisfactionConstraint c = reader.translateEvalAspectToSatisfactionConstraint(aspectContext, o, satisBuilder);
						criteriaList.add(c);
						criterionToAspect.put(c, aspectContext);
					}

				} else {
					throw new RuntimeException("Unsupported Requirement!");
				}
			} else {
				// XXX: This should never be the case if the optimization is
				// started with the LaunchConfig the aspect is checked there as
				// well
				throw new RuntimeException("Evaluation aspect not supported(" + aspectContext.getEvaluationAspect() + ")!");
			}
		}
	}

	protected boolean canEvaluateAspect(EvaluationAspect aspect, Dimension dimension) {
		return qualityAttribute.canEvaluateAspectForDimension(aspect, dimension);
	}

	protected PCMInstance getPCMInstance() {
		return new PCMInstance((PCMResourceSetPartition) this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
	}

	@Override
	public List<Criterion> getCriterions() throws CoreException {
		List<Criterion> criterions = new ArrayList<Criterion>();

		criterions.addAll(criteriaList);

		return criterions;
	}

	@Override
	public boolean hasStatisticResultsFor() throws CoreException {
		return false;
	}

}