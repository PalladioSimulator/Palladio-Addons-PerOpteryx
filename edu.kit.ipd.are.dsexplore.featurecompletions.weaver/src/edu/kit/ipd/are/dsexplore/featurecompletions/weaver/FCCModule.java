package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.dsexplore.facade.ICreateExtension;
import de.uka.ipd.sdq.dsexplore.facade.IDecodeExtension;
import de.uka.ipd.sdq.dsexplore.facade.IModule;
import de.uka.ipd.sdq.dsexplore.facade.IProblemExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;

public class FCCModule implements IModule, ICreateExtension {
	static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.featurecompletions.weaver");

	private final Pointer<FCCWeaver> weaver = new Pointer<>();

	private final FCCProblemExtension problem = new FCCProblemExtension(this.weaver);
	private final FCCDecoderExtension decoder = new FCCDecoderExtension(this.weaver);

	@Override
	public void reset() {
		this.weaver.set(null);
	}

	@Override
	public IProblemExtension getProblemExtension() {
		return this.problem;
	}

	@Override
	public ICreateExtension getCreateExtension() {
		return this;
	}

	@Override
	public IDecodeExtension getDecodeExtension() {
		return this.decoder;
	}

	@Override
	public boolean shallHandle(DegreeOfFreedomInstance degree) {
		return false;
	}

	@Override
	public Choice getChoice(DegreeOfFreedomInstance degree) {
		throw new UnsupportedOperationException("You shall not execute this method if #shallHandle returns false!");
	}

}
