/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.provider;

import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofAdapterFactory;

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
public class GDoFItemProviderAdapterFactory extends gdofAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public GDoFItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeableElementDescriptionItemProvider changeableElementDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeableElementDescriptionAdapter() {
		if (changeableElementDescriptionItemProvider == null) {
			changeableElementDescriptionItemProvider = new ChangeableElementDescriptionItemProvider(this);
		}

		return changeableElementDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRuleItemProvider valueRuleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueRuleAdapter() {
		if (valueRuleItemProvider == null) {
			valueRuleItemProvider = new ValueRuleItemProvider(this);
		}

		return valueRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLRuleItemProvider oclRuleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOCLRuleAdapter() {
		if (oclRuleItemProvider == null) {
			oclRuleItemProvider = new OCLRuleItemProvider(this);
		}

		return oclRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperOCLDefinitionItemProvider helperOCLDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHelperOCLDefinitionAdapter() {
		if (helperOCLDefinitionItemProvider == null) {
			helperOCLDefinitionItemProvider = new HelperOCLDefinitionItemProvider(this);
		}

		return helperOCLDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoFRepositoryItemProvider doFRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoFRepositoryAdapter() {
		if (doFRepositoryItemProvider == null) {
			doFRepositoryItemProvider = new DoFRepositoryItemProvider(this);
		}

		return doFRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSelectionRuleItemProvider instanceSelectionRuleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceSelectionRuleAdapter() {
		if (instanceSelectionRuleItemProvider == null) {
			instanceSelectionRuleItemProvider = new InstanceSelectionRuleItemProvider(this);
		}

		return instanceSelectionRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticSelectionRuleItemProvider staticSelectionRuleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticSelectionRuleAdapter() {
		if (staticSelectionRuleItemProvider == null) {
			staticSelectionRuleItemProvider = new StaticSelectionRuleItemProvider(this);
		}

		return staticSelectionRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeOfFreedomItemProvider degreeOfFreedomItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDegreeOfFreedomAdapter() {
		if (degreeOfFreedomItemProvider == null) {
			degreeOfFreedomItemProvider = new DegreeOfFreedomItemProvider(this);
		}

		return degreeOfFreedomItemProvider;
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
		if (changeableElementDescriptionItemProvider != null) changeableElementDescriptionItemProvider.dispose();
		if (valueRuleItemProvider != null) valueRuleItemProvider.dispose();
		if (oclRuleItemProvider != null) oclRuleItemProvider.dispose();
		if (helperOCLDefinitionItemProvider != null) helperOCLDefinitionItemProvider.dispose();
		if (doFRepositoryItemProvider != null) doFRepositoryItemProvider.dispose();
		if (instanceSelectionRuleItemProvider != null) instanceSelectionRuleItemProvider.dispose();
		if (staticSelectionRuleItemProvider != null) staticSelectionRuleItemProvider.dispose();
		if (degreeOfFreedomItemProvider != null) degreeOfFreedomItemProvider.dispose();
	}

}
