package de.uka.ipd.sdq.dsexplore.opt4j.representation;


import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

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

    /**
     * Returns the degree of freedom of the type (or subtype) that has the given
     * entity as the changeableEntity.
     * @param entity
     * @param degreeClass
     * @return The matching DegreeOfFreedomInstance from this problem.
     */
    public ADegreeOfFreedom getDegree(final Entity entity, final Class<? extends ADegreeOfFreedom> degreeClass);

    public DecisionSpace getProblem();

	public List<DesignDecisionGenotype> getInitialGenotypeList();

	public ADegreeOfFreedom getDesignDecision(int index);

}
