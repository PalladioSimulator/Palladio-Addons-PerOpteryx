package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;

import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
import de.uka.ipd.sdq.identifier.Identifier;

public final class FCCWeaverUtil {

	public static String getDefaultInstanceNameWith(String name) {
		return String.format("%sInstance", name);
	}

	public static String createUniqueAdapterNameBy(Connector connector) {
		EcoreReferenceResolver resolver = new EcoreReferenceResolver(connector);
		List<AssemblyContext> connectedACs = resolver.getCrossReferencedElementsOfType(AssemblyContext.class);

		final StringBuilder builder = new StringBuilder();
		connectedACs.forEach(each -> builder.append(each.getEncapsulatedComponent__AssemblyContext().getEntityName()));

		return String.format("%1s_%2s", builder.toString(), FCCWeaverConstant.ADAPTER_NAME);
	}

	public static Stream<Signature> getSignaturesOfReferencedInterfaceBy(Role role) {
		return FCCWeaverUtil.getSignaturesOf(FCCWeaverUtil.getInterfaceFrom(role).get().eAllContents());
	}

	private static Stream<Signature> getSignaturesOf(TreeIterator<EObject> interfaceObjectIterator) {
		List<Signature> signatures = new ArrayList<>();
		while (interfaceObjectIterator.hasNext()) {
			EObject current = interfaceObjectIterator.next();
			if (current instanceof Signature) {
				signatures.add((Signature) current);
			}
		}
		return signatures.stream();

	}

	public static <T extends Role> boolean referencesSameInterface(T firstRole, T secondRole) {
		Optional<Interface> firstInterface = FCCWeaverUtil.getInterfaceFrom(firstRole);
		Optional<Interface> secondInterface = FCCWeaverUtil.getInterfaceFrom(secondRole);
		if (firstInterface.isPresent() && secondInterface.isPresent()) {
			return FCCWeaverUtil.areEqual(firstInterface.get(), secondInterface.get());
		}
		return false;
	}

	public static <T extends Role> Optional<Interface> getInterfaceFrom(T firstRole) {
		return firstRole.eCrossReferences().stream().filter(each -> each instanceof Interface).map(each -> (Interface) each).findFirst();
	}

	public static boolean areEqual(EObject object1, EObject object2) {
		if (object1 instanceof Identifier && object2 instanceof Identifier) {
			return ((Identifier) object1).getId().equals(((Identifier) object2).getId());
		}
		return false;
	}
}
