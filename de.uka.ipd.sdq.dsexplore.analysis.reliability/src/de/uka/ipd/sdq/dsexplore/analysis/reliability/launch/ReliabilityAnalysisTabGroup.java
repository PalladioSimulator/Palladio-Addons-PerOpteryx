package de.uka.ipd.sdq.dsexplore.analysis.reliability.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.palladiosimulator.solver.reliability.runconfig.OptionsTab;

/**
 * Provides a configuration tab group for the reliability Solver analysis method.
 * 
 * @author anne
 *
 */
public class ReliabilityAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new OptionsTab()
		};
		setTabs(tabs);
		
	}
	


}
