/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.DegreeOfFreedom;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Decision Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl#getDofInstances <em>Dof Instances</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl#getDegreesOfFreedom <em>Degrees Of Freedom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSpaceImpl extends NamedElementImpl implements DecisionSpace {
	/**
	 * The cached value of the '{@link #getDofInstances() <em>Dof Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDofInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeOfFreedom> dofInstances;
	/**
	 * The cached value of the '{@link #getDegreesOfFreedom() <em>Degrees Of Freedom</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDegreesOfFreedom()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeOfFreedomInstance> degreesOfFreedom;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.DECISION_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeOfFreedom> getDofInstances() {
		if (dofInstances == null) {
			dofInstances = new EObjectContainmentEList<DegreeOfFreedom>(DegreeOfFreedom.class, this,
					designdecisionPackage.DECISION_SPACE__DOF_INSTANCES);
		}
		return dofInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeOfFreedomInstance> getDegreesOfFreedom() {
		if (degreesOfFreedom == null) {
			degreesOfFreedom = new EObjectContainmentEList<DegreeOfFreedomInstance>(DegreeOfFreedomInstance.class, this,
					designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM);
		}
		return degreesOfFreedom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
			return ((InternalEList<?>) getDofInstances()).basicRemove(otherEnd, msgs);
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			return ((InternalEList<?>) getDegreesOfFreedom()).basicRemove(otherEnd, msgs);
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
		case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
			return getDofInstances();
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			return getDegreesOfFreedom();
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
		case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
			getDofInstances().clear();
			getDofInstances().addAll((Collection<? extends DegreeOfFreedom>) newValue);
			return;
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			getDegreesOfFreedom().clear();
			getDegreesOfFreedom().addAll((Collection<? extends DegreeOfFreedomInstance>) newValue);
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
		case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
			getDofInstances().clear();
			return;
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			getDegreesOfFreedom().clear();
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
		case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
			return dofInstances != null && !dofInstances.isEmpty();
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			return degreesOfFreedom != null && !degreesOfFreedom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.DecisionSpace.class) {
			switch (derivedFeatureID) {
			case designdecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				return GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.DecisionSpace.class) {
			switch (baseFeatureID) {
			case GenericdesigndecisionPackage.DECISION_SPACE__DOF_INSTANCES:
				return designdecisionPackage.DECISION_SPACE__DOF_INSTANCES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // DecisionSpaceImpl
