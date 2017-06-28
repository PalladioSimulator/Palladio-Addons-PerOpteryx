package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

public class TransformationProxy {
    private final List<Dimension> input;
    private final Map<List<String>, String> map;
    private final Map<String, String> dimensions;

    public TransformationProxy(List<Dimension> input, Map<List<String>, String> map, Map<String, String> dimensions) {
        this.input = input;
        this.map = map;
        this.dimensions = dimensions;
    }

    public String get(final List<NqrProxy> nqrs) {
        if (nqrs == null || nqrs.isEmpty()) {
            return null;
        }

        final List<String> key = new ArrayList<>(input.size());
        for (final Dimension dimension : input) {
            for (final NqrProxy nqr : nqrs) {

                if (dimension.getId().equals(nqr.getDimensionId())) {
                    key.add(nqr.getElementId());
                    // break; // Continue with the next quality from the input
                }
            }
        }

        if (key.size() != input.size()) {
            return null;
        }

        return map.get(key);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for (Dimension dimension : input) {
            builder.append(dimension.getEntityName()).append(" ");
        }
        builder.append("= ");
        for (List<String> keys : map.keySet()) {
            builder.append("{").append(dimensions.get(map.get(keys))).append(" =");
            for (String key : keys) {
                builder.append(" ").append(dimensions.get(key));
            }
            builder.append("}");
        }
        return builder.append(")").toString();
    }

}
