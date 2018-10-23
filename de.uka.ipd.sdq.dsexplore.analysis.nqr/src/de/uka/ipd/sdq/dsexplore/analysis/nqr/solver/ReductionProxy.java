package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

public interface ReductionProxy {

    boolean add(final String element);

    String get();

    boolean reset();
}
