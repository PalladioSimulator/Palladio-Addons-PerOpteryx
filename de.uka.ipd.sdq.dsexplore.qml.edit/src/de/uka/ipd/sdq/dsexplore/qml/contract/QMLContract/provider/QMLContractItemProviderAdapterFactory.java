/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.provider;

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

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class QMLContractItemProviderAdapterFactory extends QMLContractAdapterFactory implements
        ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SimpleQMLContractItemProvider simpleQMLContractItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSimpleQMLContractAdapter() {
        if (this.simpleQMLContractItemProvider == null)
        {
            this.simpleQMLContractItemProvider = new SimpleQMLContractItemProvider(this);
        }

        return this.simpleQMLContractItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PercentileItemProvider percentileItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPercentileAdapter() {
        if (this.percentileItemProvider == null)
        {
            this.percentileItemProvider = new PercentileItemProvider(this);
        }

        return this.percentileItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FrequencyItemProvider frequencyItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFrequencyAdapter() {
        if (this.frequencyItemProvider == null)
        {
            this.frequencyItemProvider = new FrequencyItemProvider(this);
        }

        return this.frequencyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RangeValueItemProvider rangeValueItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRangeValueAdapter() {
        if (this.rangeValueItemProvider == null)
        {
            this.rangeValueItemProvider = new RangeValueItemProvider(this);
        }

        return this.rangeValueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeanItemProvider meanItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMeanAdapter() {
        if (this.meanItemProvider == null)
        {
            this.meanItemProvider = new MeanItemProvider(this);
        }

        return this.meanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected VarianceItemProvider varianceItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createVarianceAdapter() {
        if (this.varianceItemProvider == null)
        {
            this.varianceItemProvider = new VarianceItemProvider(this);
        }

        return this.varianceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericLiteralItemProvider numericLiteralItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNumericLiteralAdapter() {
        if (this.numericLiteralItemProvider == null)
        {
            this.numericLiteralItemProvider = new NumericLiteralItemProvider(this);
        }

        return this.numericLiteralItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EnumLiteralItemProvider enumLiteralItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEnumLiteralAdapter() {
        if (this.enumLiteralItemProvider == null)
        {
            this.enumLiteralItemProvider = new EnumLiteralItemProvider(this);
        }

        return this.enumLiteralItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SetLiteralItemProvider setLiteralItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSetLiteralAdapter() {
        if (this.setLiteralItemProvider == null)
        {
            this.setLiteralItemProvider = new SetLiteralItemProvider(this);
        }

        return this.setLiteralItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RefinedQMLContractItemProvider refinedQMLContractItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRefinedQMLContractAdapter() {
        if (this.refinedQMLContractItemProvider == null)
        {
            this.refinedQMLContractItemProvider = new RefinedQMLContractItemProvider(this);
        }

        return this.refinedQMLContractItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ValueItemProvider valueItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createValueAdapter() {
        if (this.valueItemProvider == null)
        {
            this.valueItemProvider = new ValueItemProvider(this);
        }

        return this.valueItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ObjectiveItemProvider objectiveItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createObjectiveAdapter() {
        if (this.objectiveItemProvider == null)
        {
            this.objectiveItemProvider = new ObjectiveItemProvider(this);
        }

        return this.objectiveItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ConstraintItemProvider constraintItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createConstraintAdapter() {
        if (this.constraintItemProvider == null)
        {
            this.constraintItemProvider = new ConstraintItemProvider(this);
        }

        return this.constraintItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RestrictionItemProvider restrictionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRestrictionAdapter() {
        if (this.restrictionItemProvider == null)
        {
            this.restrictionItemProvider = new RestrictionItemProvider(this);
        }

        return this.restrictionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GoalItemProvider goalItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGoalAdapter() {
        if (this.goalItemProvider == null)
        {
            this.goalItemProvider = new GoalItemProvider(this);
        }

        return this.goalItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type))
        {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter)))
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null)
        {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.simpleQMLContractItemProvider != null) {
            this.simpleQMLContractItemProvider.dispose();
        }
        if (this.percentileItemProvider != null) {
            this.percentileItemProvider.dispose();
        }
        if (this.frequencyItemProvider != null) {
            this.frequencyItemProvider.dispose();
        }
        if (this.rangeValueItemProvider != null) {
            this.rangeValueItemProvider.dispose();
        }
        if (this.meanItemProvider != null) {
            this.meanItemProvider.dispose();
        }
        if (this.varianceItemProvider != null) {
            this.varianceItemProvider.dispose();
        }
        if (this.numericLiteralItemProvider != null) {
            this.numericLiteralItemProvider.dispose();
        }
        if (this.enumLiteralItemProvider != null) {
            this.enumLiteralItemProvider.dispose();
        }
        if (this.setLiteralItemProvider != null) {
            this.setLiteralItemProvider.dispose();
        }
        if (this.refinedQMLContractItemProvider != null) {
            this.refinedQMLContractItemProvider.dispose();
        }
        if (this.valueItemProvider != null) {
            this.valueItemProvider.dispose();
        }
        if (this.objectiveItemProvider != null) {
            this.objectiveItemProvider.dispose();
        }
        if (this.constraintItemProvider != null) {
            this.constraintItemProvider.dispose();
        }
        if (this.restrictionItemProvider != null) {
            this.restrictionItemProvider.dispose();
        }
        if (this.goalItemProvider != null) {
            this.goalItemProvider.dispose();
        }
    }

}