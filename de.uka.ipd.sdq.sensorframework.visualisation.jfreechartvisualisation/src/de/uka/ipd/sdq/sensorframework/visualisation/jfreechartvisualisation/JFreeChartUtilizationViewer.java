package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Composite;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Utilization;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.UtilizationBucketInformation;


public class JFreeChartUtilizationViewer extends AbstractJFreeChartUtilizationWidthViewer
	implements IUtilizationAccepter, IUtilizationSeriesExporter {

	public JFreeChartUtilizationViewer(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void initializeContextMenu(MenuManager menu_manager) {
		super.initializeContextMenu(menu_manager);
	    menu_manager.add(new LoadCSVUtilization(this));
	    menu_manager.add(new ExportCSVUtilization(this));
	}

	public void addUtilization(Utilization utilization) {
		XYSeries density = new XYSeries(utilization.getTitle(),true,false);
		for (UtilizationBucketInformation e : utilization.getBucketInformation())
			density.add(e.getValue(), e.getUtilization());
		densityDataset.addSeries(density);
		densityDataset.setAutoWidth(true);
		initChart();
		this.redraw();
	}

	protected void initChart() {
		chart = ChartFactory.createHistogram("Utilization over Time","Time","Utilization", densityDataset,PlotOrientation.VERTICAL,true,true,true);

		XYPlot plot = (XYPlot)chart.getPlot();
		plot.getRangeAxis().setAutoRange(true);
		plot.setForegroundAlpha(0.8f); // for transparency
		if (densityDataset != null)
			densityDataset.setAutoWidth(true);
	}
	
	protected XYSeries computeDensities(Utilization util) {
		XYSeries density;
		density = new XYSeries(util.getTitle(),true,false);
		for (UtilizationBucketInformation bucketInformation : util.getBucketInformation()) {
			density.add(bucketInformation.getValue() + util.getBucketWidth() / 2, bucketInformation.getUtilization());
		}
		return density;
	}

	public XYSeries getSeries() {
		return densityDataset.getSeries(0);
	}

	public double getUtilizationWidth() {
		return densityDataset.getIntervalWidth();
	}

}
