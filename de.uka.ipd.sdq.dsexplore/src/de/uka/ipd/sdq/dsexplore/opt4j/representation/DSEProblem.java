package de.uka.ipd.sdq.dsexplore.opt4j.representation;


import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EModelElement;
import org.palladiosimulator.pcm.core.entity.Entity;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.genericDoF.DegreeOfFreedom;

/**
 * The {@link DSEProblem} defines the problem.
 *
 */
public interface DSEProblem {

    public List<DegreeOfFreedom> getDesignDecisions();
    
    public EModelElement getEmfInstance();
    
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
    public DegreeOfFreedom getDegree(final Entity entity, final Class<? extends DegreeOfFreedom> degreeClass);

    public DecisionSpace getEMFProblem();

}
