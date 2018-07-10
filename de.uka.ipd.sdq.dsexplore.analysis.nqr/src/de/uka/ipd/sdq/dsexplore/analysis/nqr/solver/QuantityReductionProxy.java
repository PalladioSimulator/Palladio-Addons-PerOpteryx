package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class QuantityReductionProxy implements ReductionProxy {

    private String value;
    private final String identity;
    private final Map<String, String> dimensionsIdNameMap;
    private final Map<List<String>, String> mapping;

    public QuantityReductionProxy(String identity, Map<List<String>, String> mapping,
            Map<String, String> dimensionsIdNameMap) {
        this.mapping = mapping;
        this.identity = identity;
        this.value = identity;
        this.dimensionsIdNameMap = dimensionsIdNameMap;
    }

    @Override
    public boolean add(final String element) {
        if (element == null || element.length() == 0) {
            return false;
        }

        final List<String> list = new ArrayList<>();
        list.add(value);
        list.add(element);
        value = mapping.get(list);
        return true;
    }

    @Override
    public String get() {
        return value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(dimensionsIdNameMap.get(get()));
        builder.append(" [");
        String prefix = "";
        for (List<String> keys : mapping.keySet()) {
            builder.append(prefix);
            prefix = ",";
            builder.append("{").append(dimensionsIdNameMap.get(mapping.get(keys))).append(" =");
            for (String key : keys) {
                builder.append(" ").append(dimensionsIdNameMap.get(key));
            }
            builder.append("}");
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean reset() {
        this.value = identity;
        return true;
    }

}
