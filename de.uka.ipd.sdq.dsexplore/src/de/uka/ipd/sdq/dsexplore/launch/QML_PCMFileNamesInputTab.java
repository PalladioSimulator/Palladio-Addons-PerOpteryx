package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

/**
 * The QML_PCMFileNamesInputTab has additional QML logic.
 * 
 * @author noorshams
 *
 */
public class QML_PCMFileNamesInputTab extends PCMFileNamesInputTab {

	protected Text textQMLDefinitionFile;
	
	protected QMLManager qmlManager;
	
	public QML_PCMFileNamesInputTab(QMLManager qmlManager) {
		super();
		this.qmlManager = qmlManager;
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		final ModifyListener modifyListener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				QML_PCMFileNamesInputTab.this.setDirty(true);
				QML_PCMFileNamesInputTab.this.updateLaunchConfigurationDialog();
			}
		};
				
		/**
		 * Add QML input section
		 */
		this.textQMLDefinitionFile = new Text(container, SWT.SINGLE | SWT.BORDER);
		String[] qmlExtension = new String[1];
		qmlExtension[0] = DSEConstantsContainer.QML_DEFINITION_EXTENSION;
		TabHelper.createFileInputSection(container, modifyListener, "QML Criteria Definitions", qmlExtension, textQMLDefinitionFile, getShell(), DSEConstantsContainer.DEFAULT_QML_CRITERIA_DEFINITIONS_FILE);
	}
	
	protected void loadQML() {
		qmlManager.processQMLFile(textQMLDefinitionFile.getText(), textUsage.getText());
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {		
		super.initializeFrom(configuration);
		
		try {
			String currentQMLPath = configuration.getAttribute(DSEConstantsContainer.QML_DEFINITION_FILE, "");
			this.textQMLDefinitionFile.setText(currentQMLPath);
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.QML_DEFINITION_FILE, e.getMessage());
		}
		
		loadQML();
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {		
		super.performApply(configuration);
		
		configuration.setAttribute(
				DSEConstantsContainer.QML_DEFINITION_FILE, 
				this.textQMLDefinitionFile.getText());
		
		loadQML();
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		
		if(!qmlManager.isQMLLoaded()){
			String errorMessage = "Select Usage Model and load QML Definition! For help, click the help button (?) in the bottom-left corner.";
			if(qmlManager.getDiagnosis() != null) {
				errorMessage += " "+qmlManager.getDiagnosis();
			}
			setErrorMessage(errorMessage);
			return false;
		} else if(!qmlManager.hasActivatedObjectives()) {
			setErrorMessage("No objectives for specified UsageModel found in QML Definition. Make sure the right UsageModel is referenced and objectives are defined.");
			return false;
		}
		return super.isValid(launchConfig);
	}

}
