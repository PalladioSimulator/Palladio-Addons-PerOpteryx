/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

import de.uka.ipd.sdq.pcm.cost.LinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Linking Resource Cost</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.VariableLinkingResourceCostImpl#getLinkingresource <em>
 * Linkingresource</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.VariableLinkingResourceCostImpl#getBandwithInitialFactor
 * <em>Bandwith Initial Factor</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.cost.impl.VariableLinkingResourceCostImpl#getBandwidthOperatingFactor
 * <em>Bandwidth Operating Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableLinkingResourceCostImpl extends VariableCostImpl implements VariableLinkingResourceCost {
    /**
     * The cached value of the '{@link #getLinkingresource() <em>Linkingresource</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLinkingresource()
     * @generated
     * @ordered
     */
    protected LinkingResource linkingresource;

    /**
     * The default value of the '{@link #getBandwithInitialFactor()
     * <em>Bandwith Initial Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBandwithInitialFactor()
     * @generated
     * @ordered
     */
    protected static final double BANDWITH_INITIAL_FACTOR_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getBandwithInitialFactor() <em>Bandwith Initial Factor</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBandwithInitialFactor()
     * @generated
     * @ordered
     */
    protected double bandwithInitialFactor = BANDWITH_INITIAL_FACTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getBandwidthOperatingFactor()
     * <em>Bandwidth Operating Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getBandwidthOperatingFactor()
     * @generated
     * @ordered
     */
    protected static final double BANDWIDTH_OPERATING_FACTOR_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getBandwidthOperatingFactor()
     * <em>Bandwidth Operating Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getBandwidthOperatingFactor()
     * @generated
     * @ordered
     */
    protected double bandwidthOperatingFactor = BANDWIDTH_OPERATING_FACTOR_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected VariableLinkingResourceCostImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return costPackage.Literals.VARIABLE_LINKING_RESOURCE_COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getBandwithInitialFactor() {
        return this.bandwithInitialFactor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBandwithInitialFactor(final double newBandwithInitialFactor) {
        final double oldBandwithInitialFactor = this.bandwithInitialFactor;
        this.bandwithInitialFactor = newBandwithInitialFactor;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR, oldBandwithInitialFactor,
                    this.bandwithInitialFactor));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getBandwidthOperatingFactor() {
        return this.bandwidthOperatingFactor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBandwidthOperatingFactor(final double newBandwidthOperatingFactor) {
        final double oldBandwidthOperatingFactor = this.bandwidthOperatingFactor;
        this.bandwidthOperatingFactor = newBandwidthOperatingFactor;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR,
                    oldBandwidthOperatingFactor, this.bandwidthOperatingFactor));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LinkingResource getLinkingresource() {
        if (this.linkingresource != null && ((EObject) this.linkingresource).eIsProxy())
        {
            final InternalEObject oldLinkingresource = (InternalEObject) this.linkingresource;
            this.linkingresource = (LinkingResource) this.eResolveProxy(oldLinkingresource);
            if (this.linkingresource != oldLinkingresource)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE, oldLinkingresource,
                            this.linkingresource));
                }
            }
        }
        return this.linkingresource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LinkingResource basicGetLinkingresource() {
        return this.linkingresource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLinkingresource(final LinkingResource newLinkingresource) {
        final LinkingResource oldLinkingresource = this.linkingresource;
        this.linkingresource = newLinkingresource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE, oldLinkingresource,
                    this.linkingresource));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE:
            if (resolve) {
                return this.getLinkingresource();
            }
            return this.basicGetLinkingresource();
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR:
            return this.getBandwithInitialFactor();
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR:
            return this.getBandwidthOperatingFactor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE:
            this.setLinkingresource((LinkingResource) newValue);
            return;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR:
            this.setBandwithInitialFactor((Double) newValue);
            return;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR:
            this.setBandwidthOperatingFactor((Double) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE:
            this.setLinkingresource((LinkingResource) null);
            return;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR:
            this.setBandwithInitialFactor(BANDWITH_INITIAL_FACTOR_EDEFAULT);
            return;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR:
            this.setBandwidthOperatingFactor(BANDWIDTH_OPERATING_FACTOR_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE:
            return this.linkingresource != null;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR:
            return this.bandwithInitialFactor != BANDWITH_INITIAL_FACTOR_EDEFAULT;
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR:
            return this.bandwidthOperatingFactor != BANDWIDTH_OPERATING_FACTOR_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == LinkingResourceCost.class)
        {
            switch (derivedFeatureID)
            {
            case costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE:
                return costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == LinkingResourceCost.class)
        {
            switch (baseFeatureID)
            {
            case costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE:
                return costPackage.VARIABLE_LINKING_RESOURCE_COST__LINKINGRESOURCE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (bandwithInitialFactor: ");
        result.append(this.bandwithInitialFactor);
        result.append(", bandwidthOperatingFactor: ");
        result.append(this.bandwidthOperatingFactor);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getOperatingCost() {
        return this.getFixedOperatingCost() + this.bandwidthOperatingFactor * this.getThroughput();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getInitialCost() {
        return this.getFixedInitialCost() + this.getBandwithInitialFactor() * this.getThroughput();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    private double getThroughput() {
        // TODO: what about longs and shorts and stuff here?
        if (this.getLinkingresource() != null
                && this.getLinkingresource().getCommunicationLinkResourceSpecifications_LinkingResource() != null
                && this.getLinkingresource().getCommunicationLinkResourceSpecifications_LinkingResource()
                .getThroughput_CommunicationLinkResourceSpecification() != null
                && this.getLinkingresource().getCommunicationLinkResourceSpecifications_LinkingResource()
                .getThroughput_CommunicationLinkResourceSpecification().getSpecification() != null) {
            return CostUtil.getInstance().getDoubleFromSpecification(
                    this.getLinkingresource().getCommunicationLinkResourceSpecifications_LinkingResource()
                    .getThroughput_CommunicationLinkResourceSpecification().getSpecification());
        }
        return 0;
    }

    @Override
    public EObject basicGetAnnotatedElement() {
        return this.getLinkingresource();
    }

} // VariableLinkingResourceCostImpl
