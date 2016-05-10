/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.helper;

import java.util.Collection;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;

/**
 * @author peter
 *
 */
public interface IResultsHandler {

	/**
	 * Sets up the results handler.
	 * 
	 * @param configuration
	 */
	void initialize(ILaunchConfiguration configuration);

	/**
	 * Does something with the individuals...
	 * 
	 * @param individuals
	 * @param iteration
	 */
	void handleResults(Collection<DSEIndividual> individuals, int iteration);

	/**
	 * Provides the launch configuration settings.
	 * 
	 * @return
	 */
	IResultsHandlerLaunchConfigSettings getLaunchSettingsTab(Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell);
}
