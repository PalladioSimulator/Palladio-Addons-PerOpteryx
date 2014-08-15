package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Utilization;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.UtilizationBucketInformation;

/**Loads utilization values from a CSV file.
 * 
 * @see ExportCSVUtilization
 * @author hgroenda
 *
 */
public class LoadCSVUtilization extends Action {
	/** Logger for this class. */
	private static final Logger logger = Logger.getLogger(LoadCSVUtilization.class.getCanonicalName());
	/** Utilization values. */
	private Utilization utilization;
	/** The viewer accepting the utilization input.*/
	private IUtilizationAccepter viewer;
	
	public Utilization getUtilization() {
		return utilization;
	}

	public LoadCSVUtilization(IUtilizationAccepter freeChartUtilizationViewer) {
		super();
		setText("Load Utilization CSV...");
		this.viewer = freeChartUtilizationViewer;
	}
	
	@Override
	public void run() {
		FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		dialog.open();
		if (dialog.getFileName() != null){
			this.utilization = importUtilization(dialog.getFilterPath()+File.separator+dialog.getFileName());
		}
		if (viewer != null) {
			viewer.addUtilization(utilization);
		}
	}

	private Utilization importUtilization(String fileName) {
		Utilization utilization = new Utilization("Measurements");
		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			String row;
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			while((row=bufferedReader.readLine()) != null)
			{
				String[] parts = row.split(";");
				double utilizationValue = Double.parseDouble(parts[0].replace(',','.'));
				double eventTimeStart = Double.parseDouble(parts[1].replace(',','.'));
				double eventTimeEnd = Double.parseDouble(parts[2].replace(',','.'));
				utilization.setBucketWidth(eventTimeEnd - eventTimeStart);
				utilization.addEntity(new UtilizationBucketInformation(utilizationValue, eventTimeStart));
			}
			bufferedReader.close();
			fileReader.close();
		} catch(Exception e) {
			logger.error("Could not load utilization values from CSV file.", e);
		}
		return utilization;
	}
}
