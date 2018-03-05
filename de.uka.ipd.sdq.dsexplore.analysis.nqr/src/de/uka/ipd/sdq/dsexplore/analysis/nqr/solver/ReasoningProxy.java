package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import java.util.List;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

public class ReasoningProxy {

    // private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

    private final NqrFactory factory;
    private final Dimension output;
    private final List<TransformationProxy> transformations;
    private final ReductionProxy reduction;

    public boolean reset() {
        return reduction.reset();
    }

    public Dimension getOutput() {
        return output;
    }

    public ReasoningProxy(Dimension output, List<TransformationProxy> transformations, NqrFactory factory) {
        this.output = output;
        this.transformations = transformations;
        this.factory = factory;
        this.reduction = factory.createReductionProxy();
    }

    public NqrProxy get(final List<NqrProxy> nqrs) {
        if ((nqrs == null) || (nqrs.isEmpty())) {
            return null;
        }

        // StringBuilder builder = new StringBuilder();
        // builder.append("\t\t\t\t").append(output.getEntityName()).append(" = ");
        // for (NqrProxy nqr : nqrs) {
        // builder.append(nqr.toString());
        // }
        // logger.info(builder.toString());
        for (TransformationProxy transformation : transformations) {
            String dimension = transformation.get(nqrs);
            // builder = new StringBuilder();
            // builder.append("\t\t\t\t\t").append(transformation.toString());
            // builder.append(" = ").append(factory.getDimensionName(dimension));
            // logger.info(builder.toString());
            reduction.add(dimension);
        }

        return factory.createNqrProxy(output, reduction.get());
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Reasoning ").append(output.getEntityName()).append(" [");
        for (TransformationProxy transformation : transformations) {
            builder.append(transformation.toString());
        }
        return builder.append("]").toString();
    }

}
