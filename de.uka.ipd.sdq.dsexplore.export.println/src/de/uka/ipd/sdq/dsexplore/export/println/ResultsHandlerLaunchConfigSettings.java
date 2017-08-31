package de.uka.ipd.sdq.dsexplore.export.println;

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

import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;

public class ResultsHandlerLaunchConfigSettings implements IResultsHandlerLaunchConfigSettings {
	private final String DISPLAYNAME = "PerOpteryx Candidates Printer";

	private Composite settings;
	private Button useHandler;

	public ResultsHandlerLaunchConfigSettings(Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell) {
		this.settings = new Composite(parent, SWT.NONE);
		this.settings.setLayout(new GridLayout());
		this.useHandler = new Button(settings, SWT.CHECK);
		this.useHandler.setEnabled(true);
		this.useHandler.setText("Use " + DISPLAYNAME);
		this.useHandler.addSelectionListener(selectionListener);
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
		} catch (CoreException e) {
			this.useHandler.setSelection(false);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ResultsHandler.PROP_ENABLED, this.useHandler.getSelection());

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ResultsHandler.PROP_ENABLED, false);
		this.useHandler.setSelection(false);
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return true;
	}

}
