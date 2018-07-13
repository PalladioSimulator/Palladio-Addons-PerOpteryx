package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.facade.IDecodeExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import featureObjective.Feature;

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
		PCMInstance weaved = weaver.getWeavedInstance();
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
		this.setActiveFeatureDegrees( //
				notTransformedChoices, //
				pcm.getSystem().getAssemblyContexts__ComposedStructure().stream().map(ac -> ac.getEncapsulatedComponent__AssemblyContext()).collect(Collectors.toList()) //
		);

	}

	/**
	 * Set {@link FeatureDegree FeatureDegree} (delete them from list of
	 * choices, as they will processed in another way)
	 *
	 * @param choices
	 *            the list of choices
	 * @author Dominik Fuchss
	 */
	private void setActiveFeatureDegrees(List<Choice> choices, List<RepositoryComponent> assembled) {
		List<Feature> actives = new ArrayList<>();
		for (RepositoryComponent rc : assembled) {
			List<ProvidedRole> pr = rc.getProvidedRoles_InterfaceProvidingEntity();
			actives.addAll(this.extractFeatures(pr));
		}
		actives = this.deleteDuplicates(actives, (f1, f2) -> f1.getId().equals(f2.getId()));
		// Set all to not present.
		choices.stream().filter(ch -> ch.getDegreeOfFreedomInstance() instanceof FeatureDegree).map(ch -> (FeatureChoice) ch).forEach(c -> c.setPresent(false));
		for (Feature active : actives) {
			this.setFeatureToActive(active, choices);
		}
		choices.removeIf(ch -> ch.getDegreeOfFreedomInstance() instanceof FeatureDegree);
	}

	/**
	 * Set a Feature (id) to active (and delete the Choice from ListOfChoices)
	 *
	 * @param feature
	 *            the feature
	 * @param choices
	 *            all choices
	 * @author Dominik Fuchss
	 */
	private void setFeatureToActive(Feature feature, List<Choice> choices) {
		if (feature.getSimpleOptional() == null) {
			// Not optional
			return;
		}
		String id = feature.getId();
		Iterator<Choice> iter = choices.iterator();
		Choice current = null;
		while (iter.hasNext()) {
			current = iter.next();
			if (!(current.getDegreeOfFreedomInstance() instanceof FeatureDegree)) {
				continue;
			}
			Feature cf = (Feature) ((FeatureDegree) current.getDegreeOfFreedomInstance()).getPrimaryChanged();
			if (id.equals(cf.getId())) {
				iter.remove();
				((FeatureChoice) current).setPresent(true);
				return;
			}
		}
		FCCModule.logger.error("No FeatureDegree found for Feature with id " + feature.getId());
	}

	/**
	 * Extract features of ProvidedRole
	 *
	 * @param prs
	 *            all {@link ProvidedRole}
	 *
	 * @return the annotated Features
	 * @author Dominik Fuchss
	 */
	private List<Feature> extractFeatures(List<ProvidedRole> prs) {
		List<Feature> features = new ArrayList<>();
		for (ProvidedRole pr : prs) {
			features.addAll(StereotypeAPIHelper.getViaStereoTypeFrom(pr, Feature.class));
		}

		return features;
	}

	/**
	 * Create a list without duplicated by isEqual-function.
	 *
	 * @param in
	 *            the input list
	 * @param isEqual
	 *            the isEqual-function
	 * @return a list without duplicates
	 * @author Dominik Fuchss
	 */
	private <T> List<T> deleteDuplicates(final List<T> in, BiFunction<T, T, Boolean> isEqual) {
		TreeSet<T> ts = new TreeSet<>((a, b) -> isEqual.apply(a, b) ? 0 : 1);
		ts.addAll(in);
		return new ArrayList<>(ts);
	}

}
