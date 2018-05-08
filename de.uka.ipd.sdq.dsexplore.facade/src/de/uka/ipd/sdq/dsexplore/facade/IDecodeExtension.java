package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.pcm.designdecision.Choice;

public interface IDecodeExtension {

	void nextDecodeStart();

	void grabChoices(List<Choice> notTransformedChoices);

	void decode(Pointer<PCMInstance> pcm);

	List<Choice> getChoices();

	void postProcessing(List<Choice> notTransformedChoices, PCMInstance pcm);

}
