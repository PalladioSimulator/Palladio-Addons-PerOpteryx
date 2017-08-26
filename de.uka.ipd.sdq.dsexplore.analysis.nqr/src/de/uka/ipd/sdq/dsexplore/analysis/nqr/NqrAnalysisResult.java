package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ProxyFactory;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

public class NqrAnalysisResult implements IAnalysisResult {

    private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

    private final Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
    private NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration;
    private final List<NqrProxy> nqrs;
    private final ProxyFactory factory;

    public NqrAnalysisResult(Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
            NqrSolverQualityAttributeDeclaration nqrSolverQualityAttributeDeclaration, List<NqrProxy> nqrResults,
            ProxyFactory factory) {
        criterionToAspectMap = criterionToAspect;
        this.nqrs = nqrResults;
        this.nqrQualityDimensionDeclaration = nqrSolverQualityAttributeDeclaration;
        this.factory = factory;
    }

    @Override
    public double getValueFor(final Criterion criterion) {
        final EvaluationAspectWithContext aspect = criterionToAspectMap.get(criterion);

        if (aspect == null) {
            logger.warn("Unknown aspect for Nqr result, adding NaN.");
            return Double.NaN;
        }

        for (final Dimension dimension : nqrQualityDimensionDeclaration.getDimensions()) {
            if (EcoreUtil.equals(dimension, aspect.getDimension())) {
                for (final NqrProxy nqr : nqrs) {
                    if (EcoreUtil.equals(dimension, nqr.getDimension())) {
                        final String dimensionId = nqr.getElementId();
                        final double value = factory.getDimensionIdOrderMap().containsKey(dimensionId)
                                ? factory.getDimensionIdOrderMap().get(dimensionId) : Double.NaN;
                                logger.info("Adding analysis result " + value + " for " + dimension.getEntityName() + ".");
                                return value;
                    }
                }
            }
        }

        logger.info("Unsupported aspect for Nqr result, adding MIN_VALUE.");
        return Integer.MIN_VALUE;
    }

}
