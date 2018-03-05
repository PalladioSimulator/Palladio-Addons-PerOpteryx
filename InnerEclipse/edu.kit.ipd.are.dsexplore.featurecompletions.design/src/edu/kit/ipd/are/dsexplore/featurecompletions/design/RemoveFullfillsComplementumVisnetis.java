package edu.kit.ipd.are.dsexplore.featurecompletions.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

public class RemoveFullfillsComplementumVisnetis implements IExternalJavaAction {
	private static final String STEREOTYPE_NAME= "fulfillsComplementumVisnetis"; 

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject e : selections) {
			Services.removeStereotypeWithName(e, STEREOTYPE_NAME);			
		}
	}
		
}
