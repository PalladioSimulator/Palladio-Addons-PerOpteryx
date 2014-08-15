package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Utilization;
import de.uka.ipd.sdq.sensorframework.adapter.DataAdapter;
import de.uka.ipd.sdq.sensorframework.adapter.StateToUtilizationAdapter;
import de.uka.ipd.sdq.sensorframework.visualisation.IVisualisation;
import de.uka.ipd.sdq.sensorframework.visualisation.editor.AbstractReportView;
import de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation.AbstractJFreeChartUtilizationWidthViewer;

/**Report for Utilization.
 * Provides the basic Utilizations to generate Utilization and change their classes width.
 * @author khameershaik
 */
public abstract class AbstractJFreeChartUtilizationWidthReport extends AbstractReportView implements IVisualisation<Utilization>{

	AbstractJFreeChartUtilizationWidthViewer viewer;
	protected Text widthInput;
	protected double utilizationWidth = Double.NaN;
	private List<DataAdapter> adapterList = null;
	
	public AbstractJFreeChartUtilizationWidthReport() {
		super();
	}
	
	protected abstract AbstractJFreeChartUtilizationWidthViewer createViewer(Composite parent, int flags);

	/** {@inheritDoc}
	 */
	@Override
	protected void createReportControls(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		Composite utilizationWidthPanel = new Composite(parent, SWT.NONE);
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		utilizationWidthPanel.setLayoutData(data);
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = false;
		rowLayout.pack = true;
		utilizationWidthPanel.setLayout(rowLayout);
		Label label = new Label(utilizationWidthPanel, SWT.CENTER);
		label.setText("Sampling Rate");
		label.setLayoutData(new RowData(SWT.DEFAULT, SWT.DEFAULT));
		widthInput = new Text(utilizationWidthPanel, SWT.BORDER);
		widthInput.setText(Double.toString(utilizationWidth));
		widthInput.setLayoutData(new RowData(60, SWT.DEFAULT));
		Listener listener = new Listener() {

			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.KeyDown:
					if (event.character == SWT.CR)
						updateUtilizationWidth(Double.parseDouble(widthInput
							.getText()));
					break;
				case SWT.FocusOut:
					updateUtilizationWidth(Double.parseDouble(widthInput
							.getText()));
					break;
				}
			}

		};
		widthInput.addListener(SWT.KeyDown, listener);
		widthInput.addListener(SWT.FocusOut, listener);

		viewer = createViewer(parent, SWT.NONE);
		GridData data2 = new GridData();
		data2.grabExcessHorizontalSpace = true;
		data2.grabExcessVerticalSpace = true;
		data2.verticalAlignment = GridData.FILL;
		data2.horizontalAlignment = GridData.FILL;
		viewer.setLayoutData(data2);
		utilizationWidthPanel.setLayoutData(data);
	}

	/**Updates the utilization width after a change on the gui.
	 * @param newWidth The new width to set.
	 */
	private void updateUtilizationWidth(double newWidth) {
		this.utilizationWidth = newWidth;

		setIgnoreDataSettingsChanged(true);
		// Set new utilization width on all adapters of this report
		for (DataAdapter adapter : adapterList) {
			Properties adapterProperties = adapter.getProperties();
			adapterProperties.put(StateToUtilizationAdapter.UTILIZATION_WIDTH, 
					utilizationWidth);
			adapter.setProperties(adapterProperties);
		}
		setIgnoreDataSettingsChanged(false);
		generateVisualization(adapterList);
	}
	
	/** {@inheritDoc}
	 */
	public void setInput(Collection<Utilization> utilization) {
		viewer.setData(utilization);
		this.widthInput.setText(""+utilizationWidth);
	}

	/** {@inheritDoc}
	 */
	@Override
	protected void generateVisualization(List<DataAdapter> newList) {
		if (newList == null || newList.isEmpty())
			throw new RuntimeException("Utilization reports must have at least one data input.");
		Properties adapterProperties = null;
		// Determine width of "old" utilization, if existing
		double newWidth = Double.NaN;
		if (adapterList != null && adapterList.isEmpty() == false) {
			DataAdapter adapter = adapterList.get(0);
			adapterProperties = adapter.getProperties();
			Double test = (Double) adapterProperties.get(StateToUtilizationAdapter.UTILIZATION_WIDTH); 
			newWidth = test;
		} else {
			// this is the first data added
			DataAdapter adapter = newList.get(0);
			adapterProperties = adapter.getProperties();
			newWidth = (Double) adapterProperties.get(StateToUtilizationAdapter.UTILIZATION_WIDTH);
		}
		
		boolean allSameWidth = isSameWidth(newList);
		
		/* Set all utilization to the same utilization width and add utilization
		 * to the current view.
		 */
		ArrayList<Utilization> newUtilizationList = new ArrayList<Utilization>();
		for (DataAdapter adapter : newList) {
			if (!allSameWidth) {
				adapterProperties = adapter.getProperties();
				adapterProperties.put(StateToUtilizationAdapter.UTILIZATION_WIDTH, newWidth);
				// Note: The property change will notify all listeners, so be careful
				adapter.setProperties(adapterProperties);
			}
			newUtilizationList.add((Utilization) adapter.getAdaptedObject());
		}
		utilizationWidth = newWidth; // set view-local cached version to new value
		adapterList = newList;

		this.setInput(newUtilizationList);
	}

	/**Checks if the adapters all have the same utilization width.
	 * @param adapterList The list of adapters to check.
	 * @return <code>true</code> if all have the same width.
	 */
	private boolean isSameWidth(List<DataAdapter> adapterList) {
		Properties adapterProperties;
		boolean allSameWidth = true;
		double width = Double.NaN;
		double currentWidth = Double.NaN;
		for (DataAdapter adapter : adapterList) {
			adapterProperties = adapter.getProperties();
			currentWidth = (Double) adapterProperties.get(StateToUtilizationAdapter.UTILIZATION_WIDTH);
			if (Double.isNaN(width)) {
				width = currentWidth;
			}
			if (width != currentWidth) {
				allSameWidth = false;
			}
		}
		return allSameWidth;
	}


	/** {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		viewer.setFocus();
	}

	/** {@inheritDoc}
	 */
	public void addInput(Collection<Utilization> c) {
		// The implementation is not necessary.
	}
	
	/** {@inheritDoc}
	 */
	public void deleteInput(Collection<Utilization> c) {
		// The implementation is not necessary.
	}
}