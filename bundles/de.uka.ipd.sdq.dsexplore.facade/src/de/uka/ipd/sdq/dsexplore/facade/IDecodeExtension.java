package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.pcm.designdecision.Choice;

/**
 * Extension part of {@link IModule}. This part will be during the decode
 * process of the model.
 *
 * @author Dominik Fuchss
 *
 */
public interface IDecodeExtension {
	/**
	 * Indicates the start of a new decoding.
	 */
	void nextDecodeStart();

	/**
	 * Grab choices which belong to this module (delete them from the list, and
	 * save it in the module). (Especially iff the choices cannot interpreted by
	 * the 'plain' PerOpteryx.)
	 *
	 * @param notTransformedChoices
	 *            the list of not transformed choices
	 */
	void grabChoices(List<Choice> notTransformedChoices);

	/**
	 * Start the decoding process.
	 *
	 * @param pcm
	 *            a pointer to the PCMInstance. You are allowed to create a new
	 *            one for further work.
	 */
	void decode(Pointer<PCMInstance> pcm);

	/**
	 * Get new choices which might be produced during decoding.
	 *
	 * @return a list of new choices
	 */
	List<Choice> getChoices();

	/**
	 * At the end of the decoding this method will be invoked by PerOpteryx.
	 * 
	 * @param notTransformedChoices
	 *            the remaining choices
	 * @param pcm
	 *            the final {@link PCMInstance}
	 */
	void postProcessing(List<Choice> notTransformedChoices, PCMInstance pcm);

}
