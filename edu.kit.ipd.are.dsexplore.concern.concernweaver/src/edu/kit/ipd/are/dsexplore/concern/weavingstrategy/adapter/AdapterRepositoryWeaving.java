package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public abstract class AdapterRepositoryWeaving extends AdapterWeaving {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		setAdapterComponentRegarding(weavingInstruction.getTransformationStrategy().isMultiple());
		connectAdapterTo(weavingInstruction.getECCWithConsumedFeatures().getSecond());													  
		weaveAdapterIntoRepository(weavingInstruction.getWeavingLocation());
		
	}

	private void setAdapterComponentRegarding(boolean isMultiple) {
		
		if(isMultiple) {
			
			setAdapterComponent(concernRepositoryManager.createAndAddAdapter(ConcernWeaverConstant.ADAPTER_NAME));
			
		} else {
			
			setAdapterComponent(getOrCreateAdapterComponent());
			
		}
		
	}

	private RepositoryComponent getOrCreateAdapterComponent() {
		
		Optional<RepositoryComponent> result = getExistingAdapter();
		if (result.isPresent()) {
			
			return result.get();
			
		}
		
		return concernRepositoryManager.createAndAddAdapter(ConcernWeaverConstant.ADAPTER_NAME);
		
	}
	
	//Assumption: When multiple == false then for each concern solution there may exist only a single adapter component tops.
	private Optional<RepositoryComponent> getExistingAdapter() {
		
		return concernRepositoryManager.getComponentBy(getAdapterComponentSearchCriteria());
		
	}

	//An adapter component is not annotated
	private Predicate<RepositoryComponent> getAdapterComponentSearchCriteria() {
		
		return component -> !EMFProfileFilter.isAnnotated(component); 
		
	}

	private void connectAdapterTo(List<ProvidedRole> providedECCFeatures) throws ConcernWeavingException {

		for (ProvidedRole eachProvidedFeature : providedECCFeatures) {

			RequiredRole complimentaryRequiredRole = createComplimentaryRequiredRoleOf(eachProvidedFeature);
			if (isNotAlreadyContainedInAdapter(complimentaryRequiredRole)) {
				
				adapter.getRequiredRoles_InterfaceRequiringEntity().add(complimentaryRequiredRole);
				
			}
			
		}
		
	}

	private RequiredRole createComplimentaryRequiredRoleOf(ProvidedRole providedRole) throws ConcernWeavingException {
		
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, concernRepositoryManager)
			    									.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.unsupportedRole()));
		return roleHandler.createRequiredRoleOf(providedRole);
		
	}
	
	private boolean isNotAlreadyContainedInAdapter(RequiredRole requiredRole) {
		
		return !adapter.getRequiredRoles_InterfaceRequiringEntity().stream().anyMatch(eachRequRole -> ConcernWeaverUtil.referenceSameInterface(eachRequRole, requiredRole));
		
	}

	protected abstract void weaveAdapterIntoRepository(WeavingLocation weavingLocation);
	
}
