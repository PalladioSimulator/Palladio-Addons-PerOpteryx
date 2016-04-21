/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.featuremodel.FeatureGroup;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Feature Group Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl#getFeaturegroup
 * <em>Featuregroup</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl#getDomainOfFeatureConfigCombinations
 * <em>Domain Of Feature Config Combinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupDegreeImpl extends FeatureConfigDegreeImpl implements FeatureGroupDegree {
    /**
     * The cached value of the '{@link #getFeaturegroup() <em>Featuregroup</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFeaturegroup()
     * @generated
     * @ordered
     */
    protected FeatureGroup featuregroup;

    /**
     * The cached value of the '{@link #getDomainOfFeatureConfigCombinations()
     * <em>Domain Of Feature Config Combinations</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDomainOfFeatureConfigCombinations()
     * @generated
     * @ordered
     */
    protected EList<FeatureSubset> domainOfFeatureConfigCombinations;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FeatureGroupDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.FEATURE_GROUP_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FeatureGroup getFeaturegroup() {
        if (this.featuregroup != null && this.featuregroup.eIsProxy()) {
            final InternalEObject oldFeaturegroup = (InternalEObject) this.featuregroup;
            this.featuregroup = (FeatureGroup) this.eResolveProxy(oldFeaturegroup);
            if (this.featuregroup != oldFeaturegroup) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP, oldFeaturegroup, this.featuregroup));
                }
            }
        }
        return this.featuregroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public FeatureGroup basicGetFeaturegroup() {
        return this.featuregroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFeaturegroup(final FeatureGroup newFeaturegroup) {
        final FeatureGroup oldFeaturegroup = this.featuregroup;
        this.featuregroup = newFeaturegroup;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP, oldFeaturegroup, this.featuregroup));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<FeatureSubset> getDomainOfFeatureConfigCombinations() {
        if (this.domainOfFeatureConfigCombinations == null) {
            this.domainOfFeatureConfigCombinations = new EObjectContainmentEList<FeatureSubset>(FeatureSubset.class,
                    this, specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS);
        }
        return this.domainOfFeatureConfigCombinations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
            return ((InternalEList<?>) this.getDomainOfFeatureConfigCombinations()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
            if (resolve) {
                return this.getFeaturegroup();
            }
            return this.basicGetFeaturegroup();
        case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
            return this.getDomainOfFeatureConfigCombinations();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
            this.setFeaturegroup((FeatureGroup) newValue);
            return;
        case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
            this.getDomainOfFeatureConfigCombinations().clear();
            this.getDomainOfFeatureConfigCombinations().addAll((Collection<? extends FeatureSubset>) newValue);
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
        switch (featureID) {
        case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
            this.setFeaturegroup((FeatureGroup) null);
            return;
        case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
            this.getDomainOfFeatureConfigCombinations().clear();
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
        switch (featureID) {
        case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
            return this.featuregroup != null;
        case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
            return this.domainOfFeatureConfigCombinations != null && !this.domainOfFeatureConfigCombinations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // FeatureGroupDegreeImpl
