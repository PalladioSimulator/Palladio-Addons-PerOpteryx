package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;


public class NqrSolverQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

    private final List<Dimension> dimensions;
    private final Map<Dimension, Requirement> requirements;

    public NqrSolverQualityAttributeDeclaration() {
        dimensions = new ArrayList<Dimension>();
        requirements = new HashMap<Dimension, Requirement>();

    }

    public boolean addDimension(final Dimension dimension) {
        return dimensions.add(dimension);
    }

    public boolean addAllDimensions(final List<Dimension> dimensions) {
        boolean addAll = true;
        for (Dimension dimension : dimensions) {
            addAll &= addDimension(dimension);
        }
        return addAll;

    }

    public boolean addRequirement(final Dimension dimension, final Requirement requirement) {
        return requirements.put(dimension, requirement) == null;
    }

    @Override
    public boolean canEvaluateAspectForDimension(final EvaluationAspect aspect, final Dimension dimension) {
        return aspect instanceof Value;
    }

    @Override
    public List<Dimension> getDimensions() {
        // TODO: load nqr from nqr model instance here
        return dimensions;
    }

    @Override
    public QualityAttribute getQualityAttribute() {
        return QualityAttribute.NQR_QUALITY;
    }

    public Requirement getRequirement(final Dimension dimension) {
        return requirements.get(dimension);
    }

}
