/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * Criterion tied to an UsageScenario.
 * 
 * @author noorshams
 *
 */
public interface UsageScenarioBasedCriterion {
	public UsageScenario getUsageScenario();
}
