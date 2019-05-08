package de.uka.ipd.sdq.dsexplore.export.println;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.opt4j.core.Objective;

import de.uka.ipd.sdq.dsexplore.helper.IResultsHandler;
import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;

public class ResultsHandler implements IResultsHandler {
	protected static final String PROP_ENABLED = "peropteryx_println_enabled";

	private boolean enabled;

	@Override
	public void initialize(ILaunchConfiguration configuration) {
		try {
			this.enabled = configuration.getAttribute(PROP_ENABLED, false);
		} catch (CoreException e) {
			this.enabled = false;
		}
	}

	@Override
	public void handleResults(Collection<DSEIndividual> individuals, int iteration) {
		if (!this.enabled) {
			return;
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("In iteration " + iteration + " with " + individuals.size() + " individuals...");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		printIndividuals(individuals);
	}

	private void printIndividuals(Collection<DSEIndividual> individuals) {
		for (DSEIndividual individual: individuals) {
			System.out.println("---------------------------------------------");
			System.out.println("Genotype String: " + individual.getGenotypeString());
			System.out.println("ID: " + individual.getID());
			System.out.println("Objectives: " + individual.getObjectives());
			printValues(individual.getObjectives());
			System.out.println("---------------------------------------------");
		}
	}

	private void printValues(DSEObjectives objectives) {
		for (Objective objective: objectives.getKeys()) {
			if (objective.getName().contains("de.uka.ipd.sdq.dsexplore.cost")) {
				System.out.println("Cost: " + objectives.get(objective));
			} else if (objective.getName().contains("de.uka.ipd.sdq.dsexplore.performance")) {
				System.out.println("Response Time: " + objectives.get(objective));
			} else if (objective.getName().contains("de.uka.ipd.sdq.dsexplore.reliability")) {
				System.out.println("POFOD: " + objectives.get(objective));
			} else {
				System.out.println("UNKNOWN OBJECTIVE!!!!!");
			}
		}
	}

	@Override
	public IResultsHandlerLaunchConfigSettings getLaunchSettingsTab(Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell) {
		return new ResultsHandlerLaunchConfigSettings(parent, selectionListener, modifyListener, shell);
	}
}
