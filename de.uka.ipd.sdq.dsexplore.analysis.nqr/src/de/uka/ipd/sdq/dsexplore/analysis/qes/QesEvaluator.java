package de.uka.ipd.sdq.dsexplore.analysis.qes;

import static org.eclipse.core.runtime.IStatus.ERROR;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.Reduction;

import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ProxyFactory;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;

public class QesEvaluator extends ProxyFactory{
	
	private final Model model;
	
    private static Model loadModel(final String qualityEffectSpecificationUri) throws CoreException {
        final String extension = DSEConstantsContainer.REASONING_MODEL_EXTENSION[0].substring(1);
        if ((qualityEffectSpecificationUri != null) && qualityEffectSpecificationUri.endsWith(extension)) {
            URI loadFrom = URI.createURI(qualityEffectSpecificationUri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(qualityEffectSpecificationUri);
            }
            
            try {
            		return new QesParser().getModel(loadFrom);
            } catch (ParseException e) {
            		
            }
    
        }
        throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.nqr", 0,
                "ReductionProxy ProxyFactory " + String.valueOf(qualityEffectSpecificationUri) + " could not be loaded.", null));
       
    }

	public QesEvaluator(final String reasoningComponentUri, final String reductionUri, final String dimensionTypeSetUri, final String qualityEffectSpecificationUri)
            throws CoreException, ParseException {
		super(reasoningComponentUri, reductionUri, dimensionTypeSetUri);
		
		 URI loadFrom = URI.createURI(qualityEffectSpecificationUri);
	        if (!loadFrom.isPlatform()) {
	            loadFrom = URI.createFileURI(qualityEffectSpecificationUri);
	        }
	        model = new QesParser().getModel(loadFrom);
	}

}
