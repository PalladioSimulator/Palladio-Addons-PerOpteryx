package de.uka.ipd.sdq.dsexplore.gdof;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ChangeableElementDescription;

/**
 * see also http://www.eclipse.org/articles/article.php?file=Article-EMF-Codegen-with-OCL/index.html
 * 
 * Cite from there: 
 * This query accesses the derived isManager property and calls the reportsTo(Employee) operation, 
 * both of which we implemented using OCL. It is worth noting here that OCL encourages the 
 * definition of additional properties and operations externally to the model, as conveniences 
 * for the formulation of constraints. The OCL implementation supports these "def:" expressions 
 * via the OCL.parse() and OCLHelper.define() APIs.
 * 
 * @author martens
 *
 */
public interface GenomeToCandidateModelTransformation {
	
	/**
	 * The generic transformation method
	 * @param rootElements The initial architecture model or the architecture model of any other candidate. 
	 * @param candidate The decision vector to apply. 
	 * @return The choices that have not been transformed
	 */
	public List<Choice> transform(List<EObject> rootElements, Candidate candidate);
	
	public boolean transformChoice(List<EObject> rootElements, Choice choice);
	
	public void setProperty(EObject changeableElement, EStructuralFeature property, Object value);
	
	public Object getProperty(EObject changeableElement, EStructuralFeature property);

	public Object valueRule(ChangeableElementDescription ced, EObject changeableElement, List<EObject> rootElements);
	
	public Collection<Object> valueRuleForCollection (ChangeableElementDescription ced, EObject changeableElement, List<EObject> rootElements);

}
