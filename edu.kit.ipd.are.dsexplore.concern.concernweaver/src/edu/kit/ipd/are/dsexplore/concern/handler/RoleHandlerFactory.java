package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class RoleHandlerFactory {

	private final static HashMap<Predicate<Role>, Function<ConcernSolutionManager, RoleHandler>> roleHandlerMap = new HashMap<>();
	static {
		RoleHandlerFactory.roleHandlerMap.put(RoleHandlerFactory.isOperationRole(), concernRepositoryManager -> new OperationRoleHandler(concernRepositoryManager));
		RoleHandlerFactory.roleHandlerMap.put(RoleHandlerFactory.isSinkOrSourceRole(), concernRepositoryManager -> new SinkSourceRoleHandler(concernRepositoryManager));
	}

	public static Optional<RoleHandler> getBy(Role role, ConcernSolutionManager concernRepositoryManager) {
		Iterator<Entry<Predicate<Role>, Function<ConcernSolutionManager, RoleHandler>>> iterator = RoleHandlerFactory.roleHandlerMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Predicate<Role>, Function<ConcernSolutionManager, RoleHandler>> current = iterator.next();
			if (current.getKey().test(role)) {
				return Optional.of(current.getValue().apply(concernRepositoryManager));
			}
		}
		return Optional.empty();

	}

	private static Predicate<Role> isOperationRole() {
		return role -> RoleHandlerFactory.isOperationRequiredRole(role) || RoleHandlerFactory.isOperationProvidedRole(role);
	}

	private static Predicate<Role> isSinkOrSourceRole() {
		return role -> RoleHandlerFactory.isSinkRole(role) || RoleHandlerFactory.isSourceRole(role);
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
