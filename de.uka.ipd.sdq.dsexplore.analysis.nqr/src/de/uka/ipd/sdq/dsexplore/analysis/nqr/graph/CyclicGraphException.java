package de.uka.ipd.sdq.dsexplore.analysis.nqr.graph;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;

public class CyclicGraphException extends AnalysisFailedException {

    private static final long serialVersionUID = 5641894003949637682L;

    public CyclicGraphException(final Object obj) {
        super(String.valueOf(obj));
    }

}
