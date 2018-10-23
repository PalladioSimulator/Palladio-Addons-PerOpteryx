package de.uka.ipd.sdq.dsexplore.analysis.nqr.solver;

import org.palladiosimulator.qualitymodel.Nqr;
import org.palladiosimulator.qualitymodel.QualityModelFactory;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;

public class NqrProxy {
    private final Dimension dimension;
    private final Element element;
    private final String elementEntityName;

    public NqrProxy(final Dimension dimension, final Element element, final String elementEntityName) {
        super();
        this.dimension = dimension;
        this.element = element;
        this.elementEntityName = elementEntityName;
    }

    public String getDimensionId() {
        return dimension.getId();
    }

    public String getElementId() {
        return element.getId();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Element getElement() {
        return element;
    }

    public Nqr getNqr() {
        final Nqr nqr = QualityModelFactory.eINSTANCE.createNqr();
        nqr.setDimension(dimension);
        // nqr.setValue(element); TODO
        return nqr;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Nqr [").append(dimension.getEntityName()).append(" = ").append(elementEntityName).append("]");
        return builder.toString();
    }
}
