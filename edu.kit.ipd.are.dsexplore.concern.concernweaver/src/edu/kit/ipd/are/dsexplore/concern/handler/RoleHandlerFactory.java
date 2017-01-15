package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class RoleHandlerFactory {
	
	private final static HashMap<Predicate<Role>, Function<ConcernRepositoryManager, RoleHandler>> roleHandlerMap = new HashMap<Predicate<Role>, Function<ConcernRepositoryManager, RoleHandler>>();
	static {
		
		roleHandlerMap.put(isOperationRole(), concernRepositoryManager -> new OperationRoleHandler(concernRepositoryManager));
		roleHandlerMap.put(isSinkOrSourceRole(), concernRepositoryManager -> new SinkSourceRoleHandler(concernRepositoryManager));
		
	}
	
	public static RoleHandler getBy(Role role, ConcernRepositoryManager concernRepositoryManager) {
		
		Iterator<Entry<Predicate<Role>, Function<ConcernRepositoryManager, RoleHandler>>> iterator = roleHandlerMap.entrySet().iterator();
		while (iterator.hasNext()) {
			
			Entry<Predicate<Role>, Function<ConcernRepositoryManager, RoleHandler>> current = iterator.next();
			if (current.getKey().test(role)) {
				
				return current.getValue().apply(concernRepositoryManager);
				
			}
			
		}
		
		//Introduce exceptions
		return null;
		
	}

	private static Predicate<Role> isOperationRole() {
		
		return role -> isOperationRequiredRole(role) || isOperationProvidedRole(role);
		
	}
	
	private static Predicate<Role> isSinkOrSourceRole() {
		
		return role -> isSinkRole(role) || isSourceRole(role);
		
	}

	private static boolean isSinkRole(Role role) {
		
		return role instanceof SinkRole;
		
	}

	private static boolean isSourceRole(Role role) {
		
		return role instanceof SourceRole;
		
	}
	
	private static boolean isOperationProvidedRole(Role role) {
		
		return role instanceof OperationProvidedRole;
		
	}

	private static boolean isOperationRequiredRole(Role role) {
		
		return role instanceof OperationRequiredRole;
		
	}
	
}
