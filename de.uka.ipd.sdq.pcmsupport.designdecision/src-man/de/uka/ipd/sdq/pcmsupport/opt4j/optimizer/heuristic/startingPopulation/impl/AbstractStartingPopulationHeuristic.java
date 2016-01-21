package de.uka.ipd.sdq.pcmsupport.opt4j.optimizer.heuristic.startingPopulation.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.startingPopulation.IStartingPoulationHeuristic;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

/**
 * Class defines methods to get all resource containers and allocation contexts
 * @author Tom Beyer
 *
 */
public abstract class AbstractStartingPopulationHeuristic implements IStartingPoulationHeuristic {
	
	/**
	 * Resource containers found by getResourceContainers(). Caching used to here to avoid
	 * Unnecessary calculations
	 */
	ArrayList<ResourceContainer> resourceContainers;
	
	/**
	 * Allocation contexts found by getAllocationContexts(). Caching used to here to avoid
	 * Unnecessary calculations
	 */
	ArrayList<AllocationContext> allocationContexts;

	public AbstractStartingPopulationHeuristic(DSEWorkflowConfiguration configuration) {
		super();
	}
	
	/**
	 * @return All resource containers based on the current Opt4J Problem (via Opt4JStarter.getProblem())
	 */
	protected ArrayList<ResourceContainer> getResourceContainers() {
		if (resourceContainers != null) {
			return resourceContainers;
		} else {
			ArrayList<ResourceContainer> resourceContainers = new ArrayList<ResourceContainer>();
			
			Collection<ADegreeOfFreedom> degreesOfFreedom = Opt4JStarter.getProblem().getDesignDecisions();
			for (ADegreeOfFreedom DegreeOfFreedomInstance : degreesOfFreedom) {
				if (DegreeOfFreedomInstance instanceof de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree) {
					AllocationDegree allocationDegree = (AllocationDegree) DegreeOfFreedomInstance;
					for (EObject entity : allocationDegree.getClassDesignOptions()) {
						if (entity instanceof ResourceContainer) {
							if (!resourceContainers.contains(entity)) {
								resourceContainers.add((ResourceContainer) entity);
							}
						}
					}
				}
			}
			this.resourceContainers = resourceContainers;
			return resourceContainers;
		}
	}
	
	/**
	 * @return All allocation contexts based on the current Opt4J Problem (via Opt4JStarter.getProblem())
	 */
	protected ArrayList<AllocationContext> getAllocationContexts() {
		if (allocationContexts != null) {
			return allocationContexts;
		} else {
			ArrayList<AllocationContext> allocationContexts = new ArrayList<AllocationContext>();
			Collection<ADegreeOfFreedom> degreesOfFreedom = Opt4JStarter.getProblem().getDesignDecisions();
			for (ADegreeOfFreedom DegreeOfFreedomInstance : degreesOfFreedom) {
				if (DegreeOfFreedomInstance instanceof AllocationDegree) {
					de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree allocationDegree = (AllocationDegree) DegreeOfFreedomInstance;
					EObject entity = allocationDegree.getPrimaryChanged();
					if (entity instanceof AllocationContext) {
						if (!allocationContexts.contains(entity)) {
							allocationContexts.add((AllocationContext) entity);
						}
					}
				}
			}
			this.allocationContexts = allocationContexts;
			return allocationContexts;
		}
	}

}