package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import java.util.HashMap;
import java.util.Map;

public class StatisticReductionProxy implements ReductionProxy {


    private final Map<Integer, String> dimensionOrderIdMap;
    private final Map<String, String> dimensionsIdNameMap;
    private final Map<String, Integer> histogram;

    public StatisticReductionProxy(final Map<String, String> dimensionsIdNameMap,
            final Map<Integer, String> dimensionOrderIdMap) {
        histogram = new HashMap<String, Integer>();
        this.dimensionsIdNameMap = dimensionsIdNameMap;
        this.dimensionOrderIdMap = dimensionOrderIdMap;
    }


    @Override
    public boolean add(final String element) {
        if ((element == null) || (element.length() == 0)) {
            return false;
        }

        if (histogram.containsKey(element)) {
            histogram.put(element, histogram.get(element) + 1);
        } else {
            histogram.put(element, 1);
        }

        return true;
    }

    @Override
    public String get() {
        if (histogram.isEmpty()) {
            return null; // TODO
        }

        int sum = 0;
        for (final int count : histogram.values()) {
            sum += count;
        }
        if ((sum % 2) == 0) {
            return getDimensionId(getDimensionOrder(sum / 2), getDimensionOrder((sum / 2) - 1));
        }
        return getDimensionId(getDimensionOrder(sum / 2));
    }

    private String getDimensionId(final int dimensionOrder) {
        if (dimensionOrder <= 0) {
            return dimensionOrderIdMap.get(0);
        }
        final int max = dimensionOrderIdMap.keySet().size() - 1;
        if (dimensionOrder >= max) {
            return dimensionOrderIdMap.get(max);
        }
        return dimensionOrderIdMap.get(dimensionOrder);
    }

    private String getDimensionId(final int dimensionOrder1, final int dimensionOrder2) {
        return getDimensionId((int) Math.ceil(((dimensionOrder1 + dimensionOrder2) - 1) / 2.0));
    }

    private int getDimensionOrder(final int position) {
        int count = 0;
        for (int i = 0; i < dimensionOrderIdMap.size(); i++) {
            final String key = dimensionOrderIdMap.get(i);
            if (histogram.containsKey(key)) {
                count += histogram.get(key);
                if (position < count) {

                    return i;
                }
            }
        }
        return count;
    }


    @Override
    public boolean reset() {
        histogram.clear();
        return histogram.isEmpty();
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(String.valueOf(dimensionsIdNameMap.get(get())));
        builder.append(" [");
        String prefix = "";
        for (final String key : histogram.keySet()) {
            builder.append(prefix);
            prefix = ",";
            builder.append("{").append(dimensionsIdNameMap.get(key)).append("=").append(histogram.get(key).toString());
            builder.append("}");
        }
        builder.append("]");
        return builder.toString();
    }
}
