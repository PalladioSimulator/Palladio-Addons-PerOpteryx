package de.uka.ipd.sdq.dsexplore.analysis.cost;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class CostAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

    @Override
    public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
        final ILaunchConfigurationTab[] tabs =
                new ILaunchConfigurationTab[] {new CostAnalysisTab()};
        setTabs(tabs);
    }

}
