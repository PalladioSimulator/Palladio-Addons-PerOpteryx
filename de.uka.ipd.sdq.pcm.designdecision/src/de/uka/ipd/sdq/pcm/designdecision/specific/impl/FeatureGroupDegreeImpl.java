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
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl#getFeaturegroup <em>Featuregroup</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl#getDomainOfFeatureConfigCombinations <em>Domain Of Feature Config Combinations</em>}</li>
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
	 * @generated
	 */
	protected FeatureGroupDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.FEATURE_GROUP_DEGREE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroup getFeaturegroup() {
		if (featuregroup != null && featuregroup.eIsProxy()) {
			InternalEObject oldFeaturegroup = (InternalEObject) featuregroup;
			featuregroup = (FeatureGroup) eResolveProxy(oldFeaturegroup);
			if (featuregroup != oldFeaturegroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP, oldFeaturegroup, featuregroup));
			}
		}
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup basicGetFeaturegroup() {
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturegroup(FeatureGroup newFeaturegroup) {
		FeatureGroup oldFeaturegroup = featuregroup;
		featuregroup = newFeaturegroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP,
					oldFeaturegroup, featuregroup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureSubset> getDomainOfFeatureConfigCombinations() {
		if (domainOfFeatureConfigCombinations == null) {
			domainOfFeatureConfigCombinations = new EObjectContainmentEList<FeatureSubset>(FeatureSubset.class, this,
					specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS);
		}
		return domainOfFeatureConfigCombinations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
			return ((InternalEList<?>) getDomainOfFeatureConfigCombinations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
			if (resolve)
				return getFeaturegroup();
			return basicGetFeaturegroup();
		case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
			return getDomainOfFeatureConfigCombinations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
			setFeaturegroup((FeatureGroup) newValue);
			return;
		case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
			getDomainOfFeatureConfigCombinations().clear();
			getDomainOfFeatureConfigCombinations().addAll((Collection<? extends FeatureSubset>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
			setFeaturegroup((FeatureGroup) null);
			return;
		case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
			getDomainOfFeatureConfigCombinations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case specificPackage.FEATURE_GROUP_DEGREE__FEATUREGROUP:
			return featuregroup != null;
		case specificPackage.FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS:
			return domainOfFeatureConfigCombinations != null && !domainOfFeatureConfigCombinations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // FeatureGroupDegreeImpl
