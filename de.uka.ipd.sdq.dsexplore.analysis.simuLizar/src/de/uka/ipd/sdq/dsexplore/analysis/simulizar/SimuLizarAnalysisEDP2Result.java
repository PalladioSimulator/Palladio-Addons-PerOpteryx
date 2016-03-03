package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.Map;

import org.opt4j.core.Criterion;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisEDP2Result;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

public class SimuLizarAnalysisEDP2Result extends SimuComAnalysisEDP2Result {

    public SimuLizarAnalysisEDP2Result(ExperimentRun run, ExperimentSetting experiment, PCMInstance pcmInstance,
            UsageScenario usageScenario, Map<Criterion, EvaluationAspectWithContext> objectiveToAspect,
            SimuComQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {

        super(run, experiment, pcmInstance, usageScenario, objectiveToAspect, qualityAttributeInfo);

    }
}
