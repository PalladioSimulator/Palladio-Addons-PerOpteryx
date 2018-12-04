package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.facade.IDecodeExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;

public class FCCDecoderExtension implements IDecodeExtension {

	private final Pointer<FCCWeaver> weaver;

	public FCCDecoderExtension(Pointer<FCCWeaver> weaver) {
		this.weaver = weaver;
	}

	@Override
	public void nextDecodeStart() {
		FCCWeaver weaver = this.weaver.get();
		if (weaver == null) {
			return;
		}
		weaver.nextDecodeStart();

	}

	@Override
	public void grabChoices(List<Choice> notTransformedChoices) {
		FCCWeaver weaver = this.weaver.get();
		if (weaver == null) {
			return;
		}
		weaver.grabChoices(notTransformedChoices);
	}

	@Override
	public void decode(Pointer<PCMInstance> pcm) {
		FCCWeaver weaver = this.weaver.get();
		if (weaver == null) {
			return;
		}
		PCMInstance weaved = weaver.getWeavedInstance(pcm.get());
		pcm.set(weaved);
	}

	@Override
	public List<Choice> getChoices() {
		FCCWeaver weaver = this.weaver.get();
		if (weaver == null) {
			return new ArrayList<>();
		}
		return weaver.getConvertedFCCClassChoices();
	}

	@Override
	public void postProcessing(List<Choice> notTransformedChoices, PCMInstance pcm) {

	}

}
