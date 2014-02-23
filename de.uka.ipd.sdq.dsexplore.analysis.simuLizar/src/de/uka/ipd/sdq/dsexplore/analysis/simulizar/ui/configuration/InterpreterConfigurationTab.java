package de.uka.ipd.sdq.dsexplore.analysis.simulizar.ui.configuration;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuTabGroup;

public class InterpreterConfigurationTab extends SimuTabGroup {
	public void createTabs(final ILaunchConfigurationDialog dialog,
			final String mode) {
		 super.createTabs(dialog, mode);
		 // change file configuration tab
		 super.getTabs()[0] = new InterpreterFilenamesInputTab();
		
   }
}
