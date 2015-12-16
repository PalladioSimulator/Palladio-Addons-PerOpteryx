package de.uka.ipd.sdq.dsexplore.opt4j.representation;


import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.universalDoF.AMetamodelDescription;

/**
 * The {@link DSEProblem} defines the problem.
 *
 */
public interface DSEProblem {

    public List<ADegreeOfFreedom> getDesignDecisions();
    
    public EObject getEmfInstance();
    
    public DesignDecisionGenotype getGenotypeOfInitialInstance();

    public void saveProblem();

    @Override
    public String toString();

    public void setInitialPopulation(final List<DesignDecisionGenotype> population) throws CoreException;

    public DecisionSpace getProblem();

	public List<DesignDecisionGenotype> getInitialGenotypeList();

	public ADegreeOfFreedom getDesignDecision(int index);
	
	public AMetamodelDescription getAssociatedMetamodel();

}
