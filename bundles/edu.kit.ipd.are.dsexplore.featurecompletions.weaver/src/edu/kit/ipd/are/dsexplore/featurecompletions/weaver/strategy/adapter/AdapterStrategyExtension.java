package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FeatureHelper;

public class AdapterStrategyExtension implements IStrategyExtension {
	List<BoolChoice> optionalFeatures;
	private Set<Pair<Connector, ComplementumVisnetis>> features;

	@Override
	public void nextDecodeStart() {
		// Reset all ..
		this.optionalFeatures = new ArrayList<>();

	}

	@Override
	public void grabChoices(Choice fccChoice, List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree) {
				this.optionalFeatures.add((BoolChoice) c);
			}
		}
		this.optionalFeatures.forEach(f -> notTransformedChoices.remove(f));
		this.checkPossibleSolution((Repository) fccChoice.getValue());
	}

	private void checkPossibleSolution(Repository solution) {
		List<ComplementumVisnetis> solutionFeatures = this.getFeatures(solution);
		for (BoolChoice ch : this.optionalFeatures) {
			if (!ch.isChosenValue()) {
				continue;
			}

			@SuppressWarnings("unchecked")
			Pair<Connector, ComplementumVisnetis> feature = (Pair<Connector, ComplementumVisnetis>) ((FeatureDegree) ch.getDegreeOfFreedomInstance()).getPrimaryChanged();
			if (!solutionFeatures.contains(feature.second)) {
				throw new FCCWeaverException("Feature " + feature + " not found in Solution " + solution.getEntityName());
			}
		}
	}

	private List<ComplementumVisnetis> getFeatures(Repository solution) {
		List<ComplementumVisnetis> allFeatures = new ArrayList<>();
		for (Pair<Entity, ComplementumVisnetis> cvs : FeatureHelper.getCVsFromRepo(solution)) {
			allFeatures.add(cvs.second);
		}
		return allFeatures;
	}

	@Override
	public void additionalCreateFCCDegreeBy(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FCCWeaver fccWeaver) {
		this.features = this.getOptionalFeatures(fccWeaver);
		// Add Choices
		for (Pair<Connector, ComplementumVisnetis> optional : this.features) {
			FeatureDegree fd = specificFactory.eINSTANCE.createFeatureDegree();
			fd.setPrimaryChanged(optional);
			BoolChoice bc = designdecisionFactory.eINSTANCE.createBoolChoice();
			bc.setDegreeOfFreedomInstance(fd);
			dds.add(fd);
			initialCandidate.add(bc);
		}
	}

	private Set<Pair<Connector, ComplementumVisnetis>> getOptionalFeatures(FCCWeaver fccWeaver) {
		Set<Pair<Connector, ComplementumVisnetis>> res = new HashSet<>();
		System system = fccWeaver.getInitialSystem();
		for (Connector connector : system.getConnectors__ComposedStructure()) {
			this.handleConnector(connector, res);
		}

		return res;
	}

	private void handleConnector(Connector connector, Set<Pair<Connector, ComplementumVisnetis>> res) {
		StereotypeApplication st = StereotypeAPIHelper.getStereotype(connector, "target");
		if (st == null) {
			return;
		}
		EStructuralFeature sf = st.getStereotype().getEStructuralFeature("optional");
		Boolean optional = sf == null ? null : (Boolean) st.eGet(sf);
		if (optional == null || !optional) {
			return;
		}
		List<ComplementumVisnetis> cvs = StereotypeAPIHelper.getViaStereoTypeFrom(connector, ComplementumVisnetis.class);
		if (cvs.size() != 1) {
			FCCModule.logger.error("Wrong amount of CVs");
			return;
		}
		res.add(Pair.of(connector, cvs.get(0)));
	}

}
