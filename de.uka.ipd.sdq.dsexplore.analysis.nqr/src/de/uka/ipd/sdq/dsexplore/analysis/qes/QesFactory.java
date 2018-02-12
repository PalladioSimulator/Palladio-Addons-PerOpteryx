package de.uka.ipd.sdq.dsexplore.analysis.qes;

import static org.eclipse.core.runtime.IStatus.ERROR;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrFactory;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ReasoningProxy;

public class QesFactory extends NqrFactory {

    private static final Logger LOG = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.qes");

    private static Model loadModel(final String qualityEffectSpecificationUri)
            throws CoreException {
        try {
            URI loadFrom = URI.createURI(qualityEffectSpecificationUri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(qualityEffectSpecificationUri);
            }
            return new QesParser().getModel(loadFrom);
        } catch (final Exception e) {
            throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.qes", 0,
                    "Qes Model " + String.valueOf(qualityEffectSpecificationUri)
                            + " could not be loaded.",
                    e));
        }


    }

    private final Model model;
    private List<String> effectedComponents;

    public QesFactory(final String reasoningComponentUri, final String reductionUri,
            final String dimensionTypeSetUri, final String qualityEffectSpecificationUri)
            throws CoreException {
        super(reasoningComponentUri, reductionUri, dimensionTypeSetUri);

        model = loadModel(qualityEffectSpecificationUri);
    }

    public void determineEffectedComponents(final PCMPhenotype pheno) {
        if ((model == null) || (pheno == null)) {
            return;
        }

        effectedComponents = new ArrayList<>();

        // TODO Auto-generated method stub
    }

    @Override
    public List<NqrProxy> getNqrList(final String componentId) {
        if (!isEffected(componentId)) {
            return super.getNqrList(componentId);
        }

        final List<NqrProxy> nqrs = new ArrayList<>(super.getNqrList(componentId));

        // TODO Auto-generated method stub
        return nqrs;
    }

    @Override
    public List<ReasoningProxy> getReasoningList(final String componentId) {
        if (!isEffected(componentId)) {
            return super.getReasoningList(componentId);
        }

        final List<ReasoningProxy> reasonings =
                new ArrayList<>(super.getReasoningList(componentId));

        // TODO Auto-generated method stub
        return null;
    }

    private boolean isEffected(final String componentId) {
        return (effectedComponents != null) && (componentId != null)
                && effectedComponents.contains(componentId);
    }

}
