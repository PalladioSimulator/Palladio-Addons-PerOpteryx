/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import de.uka.ipd.sdq.workflow.launchconfig.ImageRegistryHelper;

/**
 * The class defines the structure and behavior of a general tab, which is responsible for the input parameters of PerOpteryx.
 */
public abstract class InputTab extends AbstractLaunchConfigurationTab {
	
	/** The id of this plug-in. TODO probably not correct anymore */
	public static final String PLUGIN_ID = "org.palladiosimulator.analyzer.workflow";
	/** The path to the image file for the tab icon. */
	private static final String FILENAME_TAB_IMAGE_PATH = "icons/filenames_tab.gif";
	
	/** Container for UI elements. */
	protected Composite container;
	
	protected ModifyListener modifyListener;
	
	public InputTab() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return ImageRegistryHelper.getTabImage(PLUGIN_ID,FILENAME_TAB_IMAGE_PATH);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent){
		modifyListener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		};
		container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Architecture Model(s)";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration){
		
	}
	
	@Override
	public boolean canSave() {
		return true;
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// Override this methods's super class implementation in order to
		// prevent multiple invocation of initializeFrom() and subsequent
		// invocations of performApply().
	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		return true;
	}

	// TODO should be corrected correspondingly
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
	 */
	@Override
	public String getId() {
		return "de.uka.ipd.sdq.codegen.runconfig.tabs.ProtocomFileNamesInputTab";
	}
}
