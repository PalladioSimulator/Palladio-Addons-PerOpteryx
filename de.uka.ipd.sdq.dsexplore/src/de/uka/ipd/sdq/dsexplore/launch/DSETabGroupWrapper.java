package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import de.uka.ipd.sdq.dsexplore.helper.LaunchConfigurationDialogProxy;
import genericdesigndecision.universalDoF.Metamodel;

public class DSETabGroupWrapper extends InputTab implements ILaunchConfigurationTab {

	private Composite tabFolderContainer;
	private CTabFolder tabFolder;
	private DSEMetamodelTab dseMetamodelTab;
	private DSETabGroup dseTabs;
	private boolean canSave;
	private ILaunchConfigurationDialog dialogProxy;
	
	public DSETabGroupWrapper(ILaunchConfigurationDialog dialog, String mode) {
		super.setLaunchConfigurationDialog(dialog);
		this.dseTabs = new DSETabGroup(DSEMetamodelTab.DEFAULT_METAMODEL, this);
		this.dseTabs.createTabs(dialog, mode);
		this.dseMetamodelTab = new DSEMetamodelTab(DSEMetamodelTab.DEFAULT_METAMODEL, this);
		this.canSave = false;
	}
	
	@Override
	public void createControl(Composite parent) {
		
		tabFolderContainer = new Composite(parent, SWT.NONE);
		setControl(tabFolderContainer);
		tabFolderContainer.setLayout(new GridLayout(1, true));
		
		createSubControl();
	}

	private void createSubControl() {
		tabFolder = new CTabFolder(tabFolderContainer, SWT.BORDER | SWT.FLAT);
		
		// add metamodel tab
		createTab(dseMetamodelTab);
		
		// add all other tabs (likely to be metamodel-specific)
		ILaunchConfigurationTab[] otherTabs = this.dseTabs.getTabs();
		for(int i = 0; i < otherTabs.length; i++) {
			createTab(otherTabs[i]);
		}
		tabFolder.setSelection(0);
		tabFolder.layout();
		
		this.canSave = true;
		
		//tabFolder = TabHelper.createTabFolder(dseTabsWrapper, dialog, mode, parent, SWT.BORDER | SWT.FLAT);
	}

	private void createTab(ILaunchConfigurationTab tab) {
		//for each tab set the dialog to the dialog proxy
		tab.setLaunchConfigurationDialog(dialogProxy);
		tab.createControl(tabFolder);

		CTabItem tabItem = new CTabItem(tabFolder, SWT.NULL);
		tabItem.setText(tab.getName());
		tabItem.setControl(tab.getControl());
	}
	
	/**
	 * processes all changes in the sub tabs when switching to another metamodel;
	 * referenced DSETabGroup switches its metamodel and creates new DSETabs correspondingly;
	 * sub UI elements are disposed and newly created;
	 * during this process, calls to performApply() are of no effect
	 * @param metamodel
	 */
	public void metamodelHasChanged(Metamodel metamodel) {
		this.canSave = false;
		//Composite parent = tabFolderContainer.getParent();
		//tabFolder.dispose();
		//tabFolderContainer.dispose();
		//null values are not used anyway
		this.dseTabs.metamodelHasChanged(metamodel, null, null);
		createSubControl();
		//canSave set to true here
		super.setDirty(true);
		super.updateLaunchConfigurationDialog();
	}
		
	@Override
	public void dispose() {
		dseMetamodelTab.dispose();
		dseTabs.dispose();
		super.dispose();
	}
	
	@Override
	public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
		super.setLaunchConfigurationDialog(dialog);
		dialogProxy = new LaunchConfigurationDialogProxy(dialog, this);
		ILaunchConfigurationTab[] tabs = this.dseTabs.getTabs();
		for (int i = 0; i < tabs.length; i++) {
			tabs[i].setLaunchConfigurationDialog(dialogProxy);
		}
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		dseMetamodelTab.setDefaults(configuration);
		dseTabs.setDefaults(configuration);
		super.setDefaults(configuration);
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		dseMetamodelTab.initializeFrom(configuration);
		// dseTabs may be rebuild here
		dseTabs.initializeFrom(configuration);		
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		if(this.canSave()) {
			dseMetamodelTab.performApply(configuration);
			dseTabs.performApply(configuration);
		}		
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.launch.InputTab#canSave()
	 */
	@Override
	public boolean canSave() {
		return canSave;
	}

	@Override
	public String getName() {
		return "Configuration Wrapper";
	}
	
	@Override
	public String getErrorMessage() {
		String msg = null;
		ILaunchConfigurationTab[] tabs = this.dseTabs.getTabs();
		for (int i = 0; i < tabs.length; i++) {
			msg = tabs[i].getErrorMessage();
			if(msg == null) {
				continue;
			} else {
				break;
			}
		}
		return msg;
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		boolean result = false;
		ILaunchConfigurationTab[] tabs = this.dseTabs.getTabs();
		for (int i = 0; i < tabs.length; i++) {
			result &= tabs[i].isValid(launchConfig);
		}
		return result;
	}
}
