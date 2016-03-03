package de.uka.ipd.sdq.dsexplore.analysis.simulizar.ui.configuration;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.palladiosimulator.simulizar.ui.configuration.InterpreterFileNamesInputTab;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuTabGroup;

public class InterpreterConfigurationTab extends SimuTabGroup {
    @Override
    public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
        super.createTabs(dialog, mode);
        // change file configuration tab
        super.getTabs()[0] = new InterpreterFileNamesInputTab();

    }
}
