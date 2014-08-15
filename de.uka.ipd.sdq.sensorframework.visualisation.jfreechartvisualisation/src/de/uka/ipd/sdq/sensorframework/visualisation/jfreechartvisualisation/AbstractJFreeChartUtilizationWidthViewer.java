package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation;

import java.util.Collection;

import org.eclipse.swt.widgets.Composite;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Utilization;

public abstract class AbstractJFreeChartUtilizationWidthViewer extends
		AbstractJFreeChartChart<Utilization> {

	protected Collection<Utilization> lastData;

	protected DefaultTableXYDataset densityDataset=new DefaultTableXYDataset();

	
	public AbstractJFreeChartUtilizationWidthViewer(Composite parent, int style) {
		super(parent, style);
	}

	public void setData(Collection<Utilization> data) {
		densityDataset.removeAllSeries();
				
		for (Utilization u : data) {
			densityDataset.addSeries(computeDensities(u));
		}
		initChart();
		
		this.setChart(chart);
		this.forceRedraw();
		
		lastData = data;
	}

	protected abstract XYSeries computeDensities(Utilization util);
}