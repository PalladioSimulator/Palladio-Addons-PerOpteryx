package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation.editor;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Utilization;
import de.uka.ipd.sdq.sensorframework.visualisation.IVisualisation;
import de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation.AbstractJFreeChartUtilizationWidthViewer;
import de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation.JFreeChartUtilizationViewer;

public class JFreeChartUtilizationReport extends AbstractJFreeChartUtilizationWidthReport implements
		ITabbedPropertySheetPageContributor,
		IVisualisation<Utilization> {

	public static String EDITOR_ID = "de.uka.ipd.sdq.simucomframework.visualisation.jfreeChartUtilizationReport";

	@Override
	protected AbstractJFreeChartUtilizationWidthViewer createViewer(Composite parent,
			int flags) {
		return new JFreeChartUtilizationViewer(parent, flags);
	}
}
