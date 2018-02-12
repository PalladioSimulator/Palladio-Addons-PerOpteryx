package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

public class NqrReductionProxy {

    private final NqrFactory factory;
    private final Map<Dimension, ReductionProxy> map;

    public NqrReductionProxy(final NqrFactory factory) {
        this.factory = factory;
        map = new HashMap<Dimension, ReductionProxy>();

    }

    public boolean add(final NqrProxy nqr) {
        if (nqr == null) {
            return false;
        }

        final Dimension dimension = nqr.getDimension();
        final String element = nqr.getElementId();

        if (map.containsKey(dimension)) {
            return map.get(dimension).add(element);
        }

        ReductionProxy reduction = factory.createReductionProxy();
        reduction.add(element);
        return map.put(dimension, reduction) == null;
    }

    public boolean addAll(final Collection<NqrProxy> collection) {
        if ((collection == null) || collection.isEmpty()) {
            return false;
        }

        boolean addAll = true;
        for (final NqrProxy nqr : collection) {
            addAll &= add(nqr);
        }

        return addAll;
    }

    public List<NqrProxy> get() {
        final List<NqrProxy> list = new ArrayList<NqrProxy>();
        for (final Dimension key : map.keySet()) {
            list.add(factory.createNqrProxy(key, map.get(key).get()));
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NqrReductionProxy [");
        String prefix = "";
        for (Dimension dimension : map.keySet()) {
            builder.append(prefix);
            prefix = ", ";
            builder.append(dimension.getEntityName()).append(" = ").append(map.get(dimension).toString());
        }
        return builder.append("]").toString();
    }
}
