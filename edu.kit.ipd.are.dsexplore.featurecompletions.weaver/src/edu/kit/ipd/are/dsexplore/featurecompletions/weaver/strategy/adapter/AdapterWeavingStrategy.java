package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;

public class AdapterWeavingStrategy implements IWeavingStrategy {

	private PCMInstance pcmToAdapt;

	@Override
	public void setPCMToAdapt(PCMInstance pcmToAdapt) {
		this.pcmToAdapt = pcmToAdapt;
	}

	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

}
