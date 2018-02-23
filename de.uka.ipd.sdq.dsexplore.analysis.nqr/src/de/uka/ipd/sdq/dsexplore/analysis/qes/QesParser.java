package de.uka.ipd.sdq.dsexplore.analysis.qes;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;

public class QesParser {

    private final XtextResourceSet xtextResources;

    public QesParser() {
        xtextResources = new XtextResourceSet();
    }

    public Model getModel(URI uri) throws ParseException {
        try {
            return (Model) xtextResources.getResource(uri, true).getContents().get(0);
        } catch (final Exception e) {
            throw new ParseException(e);
        }
    }

}
