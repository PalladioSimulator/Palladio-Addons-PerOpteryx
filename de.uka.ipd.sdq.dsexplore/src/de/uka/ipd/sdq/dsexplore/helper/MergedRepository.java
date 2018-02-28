package de.uka.ipd.sdq.dsexplore.helper;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObjectHistory;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.security.CDOPermission;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.pcm.reliability.FailureType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * This class realizes a {@link Repository} which consists of many
 * {@link Repository Repositories}.
 *
 * @author Dominik Fuchss
 *
 */
public final class MergedRepository implements Repository {
	private final Set<Repository> repositories;

	public MergedRepository(Repository... repositories) {
		this.repositories = new HashSet<>();
		this.repositories.addAll(Arrays.asList(repositories));
	}

	public MergedRepository(Set<Repository> repositories) {
		this.repositories = new HashSet<>();
		this.repositories.addAll(repositories);
	}

	@Override
	public String getId() {
		String mergedId = "MergedRepoOf" + String.join("-", this.repositories.stream().map(Repository::getId).collect(Collectors.toList()));
		return mergedId;
	}

	@Override
	public EList<EObject> eContents() {
		EList<EObject> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.eContents());
		}
		return result;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		EList<EObject> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.eCrossReferences());
		}
		return result;
	}

	@Override
	public EList<Adapter> eAdapters() {
		EList<Adapter> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.eAdapters());
		}
		return result;
	}

	@Override
	public String getRepositoryDescription() {
		String mergedDesc = "MergedRepoOf" + String.join("-", this.repositories.stream().map(Repository::getRepositoryDescription).collect(Collectors.toList()));
		return mergedDesc;
	}

	@Override
	public String getEntityName() {
		String mergedEN = "MergedRepoOf" + String.join("-", this.repositories.stream().map(Repository::getEntityName).collect(Collectors.toList()));
		return mergedEN;
	}

	@Override
	public EList<RepositoryComponent> getComponents__Repository() {
		EList<RepositoryComponent> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.getComponents__Repository());
		}
		return result;
	}

	@Override
	public EList<Interface> getInterfaces__Repository() {
		EList<Interface> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.getInterfaces__Repository());
		}
		return result;
	}

	@Override
	public EList<FailureType> getFailureTypes__Repository() {
		EList<FailureType> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.getFailureTypes__Repository());
		}
		return result;
	}

	@Override
	public EList<DataType> getDataTypes__Repository() {
		EList<DataType> result = new BasicEList<>();
		for (Repository repo : this.repositories) {
			result.addAll(repo.getDataTypes__Repository());
		}
		return result;
	}

	/// Unsupported Ops

	@Override
	public void setId(String value) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public boolean cdoConflict() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOResource cdoDirectResource() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOObjectHistory cdoHistory() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOID cdoID() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public boolean cdoInvalid() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOLockState cdoLockState() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOPermission cdoPermission() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void cdoPrefetch(int arg0) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOLock cdoReadLock() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void cdoReload() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOResource cdoResource() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDORevision cdoRevision() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDORevision cdoRevision(boolean arg0) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOState cdoState() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOView cdoView() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOLock cdoWriteLock() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public CDOLock cdoWriteOption() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public EClass eClass() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public Resource eResource() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public EObject eContainer() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public EReference eContainmentFeature() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public boolean eIsProxy() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public boolean eDeliver() {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void eNotify(Notification notification) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void setEntityName(String value) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

	@Override
	public void setRepositoryDescription(String value) {
		throw new UnsupportedOperationException("MergedRepo does not provide this method");
	}

}
