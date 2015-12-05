/**
 */
package genericdesigndecision.impl;

import genericdesigndecision.DecisionSpace;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.impl.DecisionSpaceImpl#getDofInstances <em>Dof Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSpaceImpl extends MinimalEObjectImpl.Container implements DecisionSpace {
	/**
	 * The cached value of the '{@link #getDofInstances() <em>Dof Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDofInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ADegreeOfFreedom> dofInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericdesigndecisionPackage.Literals.DECISION_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADegreeOfFreedom> getDofInstances() {
		if (dofInstances == null) {
			dofInstances = new EObjectContainmentEList<ADegreeOfFreedom>(ADegreeOfFreedom.class, this, GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES);
		}
		return dofInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				return ((InternalEList<?>)getDofInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				return getDofInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				getDofInstances().clear();
				getDofInstances().addAll((Collection<? extends ADegreeOfFreedom>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				getDofInstances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				return dofInstances != null && !dofInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSpaceImpl
