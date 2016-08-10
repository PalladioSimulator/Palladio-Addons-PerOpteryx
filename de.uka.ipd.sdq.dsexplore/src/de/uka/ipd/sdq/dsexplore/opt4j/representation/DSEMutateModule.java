package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.operator.mutate.MutateModule;
import org.opt4j.operator.mutate.MutationRate;
import org.opt4j.start.Constant;

/**
 * Module to use a configurable adaptive mutation rate. I did not manage to get it called, though, so deprecated now. 
 * Will be needed when genomes of variable length shall be supported. 
 * 
 *  @author martens
 */
public class DSEMutateModule extends MutateModule {
	
	@Constant(value = "intensity", namespace = ConfigurableAdaptiveMutationRate.class)
	protected double mutationIntensity = 1;

	public double getMutationIntensity() {
		return mutationIntensity;
	}

	public void setMutationIntensity(double mutationIntensity) {
		this.mutationIntensity = mutationIntensity;
	}

	@Override
	protected void config() {
		bind(MutationRate.class).to(ConfigurableAdaptiveMutationRate.class).in(
				SINGLETON);

	}

}
