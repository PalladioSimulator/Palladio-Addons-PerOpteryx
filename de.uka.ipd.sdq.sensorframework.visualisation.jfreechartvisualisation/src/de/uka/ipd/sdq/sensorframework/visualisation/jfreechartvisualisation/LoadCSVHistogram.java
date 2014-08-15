package de.uka.ipd.sdq.sensorframework.visualisation.jfreechartvisualisation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Histogram;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.HistogramBucketInformation;

public class LoadCSVHistogram extends Action {
    private Histogram histogram = null;
    private final IHistogramAccepter viewer;

    public Histogram getHistogram() {
        return histogram;
    }

    public LoadCSVHistogram(final IHistogramAccepter freeChartHistogramViewer) {
        super();
        setText("Load CSV...");
        this.viewer = freeChartHistogramViewer;
    }

    @Override
    public void run() {
        final FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
        dialog.open();
        if (dialog.getFileName() != null){
            this.histogram = importHistogram(dialog.getFilterPath()+File.separator+dialog.getFileName());
        }
        viewer.addHistogram(histogram);
    }

    private Histogram importHistogram(final String fileName) {
        final Histogram h = new Histogram("Measurements");
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            String row;
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            while((row=bufferedReader.readLine()) != null)
            {
                final String[] parts = row.split(";");
                final double x = Double.parseDouble(parts[0].replace(',','.'));
                final double y = Double.parseDouble(parts[1].replace(',','.'));
                h.addEntity(new HistogramBucketInformation(y, x));
            }
        } catch(final Exception e) {
            return null;
            // TODO: Error Message Box
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (final IOException e1) {
                    return null;
                }
            }
        }
        for (final HistogramBucketInformation e:h.getBucketInformation()) {
            System.out.print("runif("+Math.round(e.getProbability()*100000)+","+(e.getValue()-5)+","+(e.getValue()+5)+"),");
        }
        return h;
    }
}
