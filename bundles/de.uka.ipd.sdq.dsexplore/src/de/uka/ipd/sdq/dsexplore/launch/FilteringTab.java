package de.uka.ipd.sdq.dsexplore.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.FilteringAnalysis;

public class FilteringTab extends AbstractLaunchConfigurationTab {

	public static final String optionsName = "de.uka.ipd.sdq.dsexplore.launch.filters";
	private List<Button> buttons;

	@Override
	public void createControl(Composite parent) {
		buttons = new ArrayList<>();
		var comp = new Composite(parent, SWT.NONE);
		final var layout = new GridLayout();
		comp.setLayout(layout);
		setControl(comp);

		var text = new Label(comp, 0);
		text.setText("Options");

		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint(DSEConstantsContainer.FILTERING_EXTENSION_POINT);
		IExtension[] extensions = ep.getExtensions();

		for (var ext : extensions) {
			for (var ce : ext.getConfigurationElements()) {

//					var execution = ce.createExecutableExtension("class");
				var checkbox = new Button(comp, SWT.CHECK);
				var name = ce.getAttribute(DSEConstantsContainer.FILTERING_EXTENSION_POINT_NAME);
				checkbox.setText(name);
				checkbox.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent event) {
						FilteringTab.this.setDirty(true);
						FilteringTab.this.updateLaunchConfigurationDialog();
					}
				});
				buttons.add(checkbox);

			}
		}

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		buttons.stream().forEach(button -> button.setSelection(false));
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			var selectedFilters = configuration.getAttribute(optionsName, new ArrayList<String>());
				buttons.stream().filter(button -> selectedFilters.contains(button.getText()))
						.forEach(button -> button.setSelection(true));

			} catch (CoreException e) {
				e.printStackTrace();
			}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		var selectedFilters = buttons.stream().filter(Button::getSelection).map(Button::getText).collect(Collectors.toList());
		configuration.setAttribute(optionsName, selectedFilters);

	}

	@Override
	public String getName() {
		return "FilteringOption";
	}

}
