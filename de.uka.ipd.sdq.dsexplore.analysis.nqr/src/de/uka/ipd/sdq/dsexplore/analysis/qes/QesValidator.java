package de.uka.ipd.sdq.dsexplore.analysis.qes;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;

public class QesValidator {

    private final Diagnostician diagnostician;

    public QesValidator() {
        diagnostician = Diagnostician.INSTANCE;
    }

    public boolean isValidModel(Model model) {
        try {
            return diagnostician.validate(model).getSeverity() <= Diagnostic.WARNING;
        } catch (final Exception e) {
            return false;
        }
    }

}
