/**
 */
package ConcernModel.provider;

import ConcernModel.util.ConcernModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernModelItemProviderAdapterFactory extends ConcernModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.ConcernRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernRepositoryItemProvider concernRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.ConcernRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernRepositoryAdapter() {
		if (concernRepositoryItemProvider == null) {
			concernRepositoryItemProvider = new ConcernRepositoryItemProvider(this);
		}

		return concernRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.Concern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernItemProvider concernItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernAdapter() {
		if (concernItemProvider == null) {
			concernItemProvider = new ConcernItemProvider(this);
		}

		return concernItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.ConcernStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernStrategyItemProvider concernStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.ConcernStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernStrategyAdapter() {
		if (concernStrategyItemProvider == null) {
			concernStrategyItemProvider = new ConcernStrategyItemProvider(this);
		}

		return concernStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.ElementaryConcernComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryConcernComponentItemProvider elementaryConcernComponentItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.ElementaryConcernComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementaryConcernComponentAdapter() {
		if (elementaryConcernComponentItemProvider == null) {
			elementaryConcernComponentItemProvider = new ElementaryConcernComponentItemProvider(this);
		}

		return elementaryConcernComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.AnnotationTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTargetItemProvider annotationTargetItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.AnnotationTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationTargetAdapter() {
		if (annotationTargetItemProvider == null) {
			annotationTargetItemProvider = new AnnotationTargetItemProvider(this);
		}

		return annotationTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.AnnotationEnrich} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationEnrichItemProvider annotationEnrichItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.AnnotationEnrich}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationEnrichAdapter() {
		if (annotationEnrichItemProvider == null) {
			annotationEnrichItemProvider = new AnnotationEnrichItemProvider(this);
		}

		return annotationEnrichItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ConcernModel.DeploymentConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConstraintItemProvider deploymentConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link ConcernModel.DeploymentConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentConstraintAdapter() {
		if (deploymentConstraintItemProvider == null) {
			deploymentConstraintItemProvider = new DeploymentConstraintItemProvider(this);
		}

		return deploymentConstraintItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (concernRepositoryItemProvider != null) concernRepositoryItemProvider.dispose();
		if (concernItemProvider != null) concernItemProvider.dispose();
		if (concernStrategyItemProvider != null) concernStrategyItemProvider.dispose();
		if (elementaryConcernComponentItemProvider != null) elementaryConcernComponentItemProvider.dispose();
		if (annotationTargetItemProvider != null) annotationTargetItemProvider.dispose();
		if (annotationEnrichItemProvider != null) annotationEnrichItemProvider.dispose();
		if (deploymentConstraintItemProvider != null) deploymentConstraintItemProvider.dispose();
	}

}
