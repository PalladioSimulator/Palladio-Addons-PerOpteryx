package de.uka.ipd.sdq.dsexplore.launch;

import java.util.ArrayList;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisQualityAttributes;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.DebugEnabledCommonTab;
import genericdesigndecision.universalDoF.Metamodel;

/**
 * Creates a Tab Group for the launch configuration.
 * @author Anne
 *
 */
public class DSETabGroup extends AbstractLaunchConfigurationTabGroup {

	private Shell shell;

	/**
	 * Actually creates the tabs for the launch configuration
	 */
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
	
		// TODO only ask the first time when tabs are created
		Metamodel metamodel = Metamodel.PCM;//showMMDialog();
		
		QMLManager qmlManager = new QMLManager();
		
		ArrayList<DSEAnalysisMethodTab> analysisTabs = new ArrayList<DSEAnalysisMethodTab>(); 
		for(QualityAttribute quality : new AnalysisQualityAttributes().getAllQualityAttributes()){
			analysisTabs.add(new DSEAnalysisMethodTab(quality));
		}
		
		qmlManager.addTabs(analysisTabs.toArray(new DSEAnalysisMethodTab[]{}));
		
		DSEFileNamesInputTab defaultTab = DSEPresentationFactory.eINSTANCE.createFileNamesInputTab(qmlManager, metamodel);
				
		DSEOptionsTab optionsTab = DSEPresentationFactory.eINSTANCE.createDSEOptionsTab(metamodel);
		
		TerminationCriteriaTab terminationTab = new TerminationCriteriaTab(qmlManager);
		
		ArrayList<ILaunchConfigurationTab> tabs = new ArrayList<ILaunchConfigurationTab>();
		
		tabs.add(defaultTab); // Default tab
		tabs.add(optionsTab);
		tabs.add(terminationTab);
	
		tabs.addAll(analysisTabs);
	
		tabs.add(new TacticsTab());
		tabs.add(new StartingPopulationHeuristicTab());
				
		tabs.add(new DebugEnabledCommonTab());
		
		ILaunchConfigurationTab[] iTabs = new ILaunchConfigurationTab[tabs.size()];
		for (int i = 0; i < iTabs.length; i++) {
			iTabs[i] = tabs.get(i);
		}
		setTabs(iTabs);
	}

	/**
	 * asks the user for the metamodel of the input model
	 * @return the specified metamodel
	 */
	private Metamodel showMMDialog() {

		Display display = PlatformUI.getWorkbench().getDisplay();

		//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		shell = new Shell(display, SWT.TITLE | SWT.MIN | SWT.CLOSE);
		shell.setText("Metamodel dialog");

		MetamodelDialog dialog = new MetamodelDialog(shell);
		dialog.setBlockOnOpen(true);

		int returnCode = dialog.open();

		//      shell.pack();
		//      shell.open();
		//
		//      while (!shell.isDisposed()) {
		//        if (!display.readAndDispatch()) {
		//          display.sleep();
		//        }
		//      }
		//      
		//      display.dispose();

		return Metamodel.get(returnCode);
	}
	
}
