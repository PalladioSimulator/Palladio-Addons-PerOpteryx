package de.uka.ipd.sdq.dsexplore.analysis.qes;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.eclipse.emf.common.util.URI;

public class QesParser {
	
	private final XtextResourceSet xtextResources;
	
    public QesParser() {
		xtextResources = new XtextResourceSet();
	}

    public Model getModel(URI uri) throws ParseException {
	    try {
	     	return (Model) xtextResources.getResource(uri, true).getContents().get(0);
	    } catch (Exception e) {
	    		throw new ParseException(e);
	    }
    }
    
	public static void printModel(Model model) {
	 	System.out.println(String.valueOf(model));
	 	boolean nonEmpty = model != null;
	 	nonEmpty &= model.getElements() != null;
	 	nonEmpty &= model.getElements().isEmpty() == false;
	 	if (nonEmpty) {
		 	for (Object element : model.getElements()) {
		 		System.out.println("\t" + String.valueOf(element));
			}
	 	}
	}
     
}