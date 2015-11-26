/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>OCL Rule</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.OCLRuleImpl#getPcmHelperDefinition <em>Pcm Helper Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCLRuleImpl extends genericdesigndecision.genericDoF.impl.OCLRuleImpl implements OCLRule {
	/**
	 * The cached value of the '{@link #getPcmHelperDefinition() <em>Pcm Helper Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmHelperDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperOCLDefinition> pcmHelperDefinition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.OCL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HelperOCLDefinition> getPcmHelperDefinition() {
		if (pcmHelperDefinition == null) {
			pcmHelperDefinition = new EObjectContainmentEList<HelperOCLDefinition>(HelperOCLDefinition.class, this,
					gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION);
		}
		return pcmHelperDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION:
			return ((InternalEList<?>) getPcmHelperDefinition()).basicRemove(otherEnd, msgs);
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
		case gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION:
			return getPcmHelperDefinition();
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
		case gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION:
			getPcmHelperDefinition().clear();
			getPcmHelperDefinition().addAll((Collection<? extends HelperOCLDefinition>) newValue);
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
		case gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION:
			getPcmHelperDefinition().clear();
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
		case gdofPackage.OCL_RULE__PCM_HELPER_DEFINITION:
			return pcmHelperDefinition != null && !pcmHelperDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // OCLRuleImpl
