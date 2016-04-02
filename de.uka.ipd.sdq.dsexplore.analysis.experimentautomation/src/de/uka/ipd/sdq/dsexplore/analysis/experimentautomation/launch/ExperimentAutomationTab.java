package de.uka.ipd.sdq.dsexplore.analysis.experimentautomation.launch;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.palladiosimulator.experimentautomation.application.workflow.ExperimentAutomationConfigurationTab;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuTabGroup;

public class ExperimentAutomationTab extends SimuTabGroup {
    @Override
    public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
        super.createTabs(dialog, mode);
        // change file configuration tab
        super.getTabs()[0] = new ExperimentAutomationConfigurationTab();
    }
}
