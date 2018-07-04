package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.dsexplore.facade.ICreateExtension;
import de.uka.ipd.sdq.dsexplore.facade.IDecodeExtension;
import de.uka.ipd.sdq.dsexplore.facade.IModule;
import de.uka.ipd.sdq.dsexplore.facade.IProblemExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCCreateExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCDecoderExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCProblemExtension;

public class FCCModule implements IModule {
	public static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.featurecompletions.weaver");

	private final Pointer<FCCWeaver> weaver;

	private final FCCProblemExtension problem;
	private final FCCCreateExtension creator;
	private final FCCDecoderExtension decoder;

	public FCCModule() {
		this.weaver = new Pointer<>();
		this.problem = new FCCProblemExtension(this.weaver);
		this.creator = new FCCCreateExtension();
		this.decoder = new FCCDecoderExtension(this.weaver);
	}

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
		return this.creator;
	}

	@Override
	public IDecodeExtension getDecodeExtension() {
		return this.decoder;
	}

}
