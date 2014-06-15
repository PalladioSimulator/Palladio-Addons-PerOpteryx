package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**Exports the utilization values displayed in the corresponding JFreeChart editor as CSV file.
 * @see LoadCSVUtilization
 * @author hgroenda
 *
 */
public class ExportCSVUtilization extends Action {
	/** Logger for this class. */
	private static final Logger logger = Logger.getLogger(ExportCSVUtilization.class);
	/** The compatible viewer. */
	private IUtilizationSeriesExporter viewer;

	public ExportCSVUtilization(IUtilizationSeriesExporter freeChartUtilizationViewer) {
		super();
		setText("Export Utilization CSV...");
		this.viewer = freeChartUtilizationViewer;
	}

	@Override
	public void run() {
		FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
		dialog.open();
		if (dialog.getFileName() != null) {
			exportCSVUtilization(dialog.getFilterPath() + File.separatorChar + dialog.getFileName(), viewer);
		}
	}

	private void exportCSVUtilization(String filename, IUtilizationSeriesExporter viewer) {
		XYSeries series = viewer.getSeries();
		double width = viewer.getUtilizationWidth();
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;
		try{
			fileWriter = new FileWriter(filename);
			bufferedWriter = new BufferedWriter(fileWriter);
			for(Object item : series.getItems()){
				XYDataItem data = (XYDataItem) item;
				bufferedWriter.append((data.getY()+"").replace(".", ",")
						+";" + (data.getX().doubleValue() - 0.5 * width +"").replace(".", ",")
						+";" + (data.getX().doubleValue() +  0.5 * width +"").replace(".", ",") + "\n");
			}
			bufferedWriter.close();
			fileWriter.close();
		} catch(Exception e) {
			logger.error("Error writing CSV file.", e);
		}
	}
}
