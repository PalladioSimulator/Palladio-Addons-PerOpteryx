package de.uka.ipd.sdq.dsexplore.export.toometa;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class ResultsHandlerLaunchConfigSettings implements IResultsHandlerLaunchConfigSettings {
	private final String DISPLAYNAME = "PerOpteryx to Toometa Exporter";

	private Composite settings;
	private Button useHandler;
	private Text textOutputDirectory;

	public ResultsHandlerLaunchConfigSettings(Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell) {
		this.settings = new Composite(parent, SWT.NONE);
		this.settings.setLayout(new GridLayout());
		this.useHandler = new Button(settings, SWT.CHECK);
		this.useHandler.setEnabled(true);
		this.useHandler.setText("Use " + DISPLAYNAME);
		this.useHandler.addSelectionListener(selectionListener);
		this.textOutputDirectory = new Text(this.settings, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFolderInputSection(settings, modifyListener, "Select output directory", textOutputDirectory, "dialogTitle", shell, null);
		this.textOutputDirectory.setEnabled(false);
	}

	@Override
	public String getLaunchConfigSettingsCaption() {
		return DISPLAYNAME;
	}

	@Override
	public Composite getSettingsComposite() {
		return settings;
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			this.useHandler.setSelection(configuration.getAttribute(ResultsHandler.PROP_ENABLED, false));
			this.textOutputDirectory.setText(configuration.getAttribute(ResultsHandler.PROP_PATH, ""));
		} catch (CoreException e) {
			this.useHandler.setSelection(false);
			this.textOutputDirectory.setText("");
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ResultsHandler.PROP_ENABLED, this.useHandler.getSelection());
		if (this.useHandler.getSelection()) {
			this.textOutputDirectory.setEnabled(true);
			if (!this.textOutputDirectory.getText().isEmpty()) {
				configuration.setAttribute(ResultsHandler.PROP_PATH, this.textOutputDirectory.getText());
			}	
		} else {
			this.textOutputDirectory.setEnabled(false);
			if (!this.textOutputDirectory.getText().isEmpty()) {
				configuration.setAttribute(ResultsHandler.PROP_PATH, this.textOutputDirectory.getText());
			}	
		}
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ResultsHandler.PROP_ENABLED, false);
		configuration.setAttribute(ResultsHandler.PROP_PATH, "");
		this.useHandler.setSelection(false);
		this.textOutputDirectory.setText("");
		this.textOutputDirectory.setEnabled(false);
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		if (!this.useHandler.getSelection()) {
			return true;
		} else if (!this.textOutputDirectory.getText().isEmpty()) {
			return true;
		}
		return false;
	}
}
