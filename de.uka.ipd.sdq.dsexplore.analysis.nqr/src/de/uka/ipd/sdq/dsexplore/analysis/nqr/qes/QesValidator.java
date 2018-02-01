package de.uka.ipd.sdq.dsexplore.analysis.nqr.qes;

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
	    		QesParser.printModel(model); // TODO debug
	    		return diagnostician.validate(model).getSeverity() <= Diagnostic.WARNING;
	    } catch (Exception e) {
	    		return false;
	    }
	}
	
}
