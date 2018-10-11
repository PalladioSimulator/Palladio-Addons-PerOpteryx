package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;

public final class FeatureHelper {
	private FeatureHelper() {
		throw new IllegalAccessError();
	}

	public static List<Pair<Entity, ComplementumVisnetis>> getCVsFromRepo(Repository repo) {
		List<Pair<Entity, ComplementumVisnetis>> result = new ArrayList<>();

		for (RepositoryComponent rc : repo.getComponents__Repository()) {
			List<ComplementumVisnetis> cvsRc = StereotypeAPIHelper.getViaStereoTypeFrom(rc, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
			for (ComplementumVisnetis cv : cvsRc) {
				result.add(Pair.of(rc, cv));
			}
		}
		for (Interface iface : repo.getInterfaces__Repository()) {
			if (!(iface instanceof OperationInterface)) {
				continue;
			}
			OperationInterface opIface = (OperationInterface) iface;
			List<ComplementumVisnetis> cvsIface = StereotypeAPIHelper.getViaStereoTypeFrom(opIface, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
			for (ComplementumVisnetis cv : cvsIface) {
				result.add(Pair.of(opIface, cv));
			}

			for (OperationSignature opSig : opIface.getSignatures__OperationInterface()) {
				List<ComplementumVisnetis> cvsSig = StereotypeAPIHelper.getViaStereoTypeFrom(opSig, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsSig) {
					result.add(Pair.of(opSig, cv));
				}
			}
		}

		return result;

	}
}
