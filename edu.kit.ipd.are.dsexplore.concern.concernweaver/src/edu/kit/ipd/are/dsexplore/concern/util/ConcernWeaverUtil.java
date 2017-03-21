package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;

import de.uka.ipd.sdq.identifier.Identifier;

public class ConcernWeaverUtil {
	
	public static String getDefaultInstanceNameWith(String name) {
		
		return String.format("%sInstance", name);
		
	}
	
	public static Stream<Signature> getSignaturesOfReferencedInterfaceBy(Role role) {
		
		return getSignaturesOf(getInterfaceFrom(role).get().eAllContents());
		
	}

	private static Stream<Signature> getSignaturesOf(TreeIterator<EObject> interfaceObjectIterator) {
		
		List<Signature> signatures = new ArrayList<Signature>();
		while(interfaceObjectIterator.hasNext()) {
			
			EObject current = interfaceObjectIterator.next();
			if (current instanceof Signature) {
				
				signatures.add((Signature) current);
				
			}
			
		}
		
		return signatures.stream();
		
	}
	
	public static <T extends Role> boolean referencesSameInterface(T firstRole, T secondRole) {
		
		Optional<Interface> firstInterface = getInterfaceFrom(firstRole);
		Optional<Interface> secondInterface = getInterfaceFrom(secondRole);
		
		if (firstInterface.isPresent() && secondInterface.isPresent()) {
			
			return areEqual((Identifier) firstInterface.get(), (Identifier) secondInterface.get());
			
		}
		
		return false;
		
	}
	
	public static <T extends Role> Optional<Interface> getInterfaceFrom(T firstRole) {
		
		return firstRole.eCrossReferences().stream().filter(each -> each instanceof Interface)
													.map(each -> (Interface) each)
													.findFirst();
		
	}

	public static boolean areEqual(EObject object1, EObject object2) {
		
		if (object1 instanceof Identifier && object2 instanceof Identifier) {
			
			return ((Identifier) object1).getId().equals(((Identifier) object2).getId());
			
		}
		
		return false;
		
	}
	
}
