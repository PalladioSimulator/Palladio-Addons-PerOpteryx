package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;

public abstract class AdapterRepositoryWeaving extends AdapterWeaving {

	private WeavingInstruction weavingInstruction;
	protected RepositoryComponent adapter;
	
	private void setWeavingInstruction(WeavingInstruction weavingInstruction) {
		
		this.weavingInstruction = weavingInstruction;
		
	}
	
	private void setAdapter(RepositoryComponent adapter) {
		
		this.adapter = adapter;
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
		
		setWeavingInstruction(weavingInstruction);
		
		weaveAdapterIntoRepository();
		
	}

	private void weaveAdapterIntoRepository() {
		
		String uniqueAdapterName = getUniqueAdapterName(this.weavingInstruction);
		
		Optional<RepositoryComponent> adapter = concernRepositoryManager.getComponentByUnique(uniqueAdapterName);
		if (!adapter.isPresent()) {
			
			adapter = Optional.of(connectToElementaryConcernComponent(concernRepositoryManager.createAndAddAdapter(uniqueAdapterName)));
			
		}
		
		setAdapter(adapter.get());													  
		
		weaveAdapterIntoRepository(this.weavingInstruction.getWeavingLocation());
		
	}

	private RepositoryComponent connectToElementaryConcernComponent(RepositoryComponent adapter) {

		List<OperationProvidedRole> consumedFeatures = this.weavingInstruction.getECCWithConsumedFeatures().getSecond();
		//This step is important because the eccs ProvidedOperationRoles are not the copied one in the pcm-concern-repository. This would lead to wrong references.
		concernRepositoryManager.getEquivalentConsumedFeaturesFromRepository(consumedFeatures).forEach(eachConsumedFeature -> {

			RoleHandler roleHandler = RoleHandlerFactory.getBy(eachConsumedFeature, concernRepositoryManager);
			adapter.getRequiredRoles_InterfaceRequiringEntity().add(roleHandler.createRequiredRoleOf(eachConsumedFeature));
			
		});
		
		return adapter;
		
	}
	
	protected abstract void weaveAdapterIntoRepository(WeavingLocation weavingLocation);
	
}
