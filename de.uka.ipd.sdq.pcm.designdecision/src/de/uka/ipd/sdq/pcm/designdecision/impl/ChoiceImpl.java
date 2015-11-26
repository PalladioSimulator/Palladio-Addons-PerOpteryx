/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Choice</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl#getDegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends genericdesigndecision.impl.ChoiceImpl implements Choice {
	/**
	 * The cached value of the '{@link #getDegreeOfFreedomInstance()
	 * <em>Degree Of Freedom Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfFreedomInstance degreeOfFreedomInstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeOfFreedomInstance getDegreeOfFreedomInstance() {
		if (degreeOfFreedomInstance != null && degreeOfFreedomInstance.eIsProxy()) {
			InternalEObject oldDegreeOfFreedomInstance = (InternalEObject) degreeOfFreedomInstance;
			degreeOfFreedomInstance = (DegreeOfFreedomInstance) eResolveProxy(oldDegreeOfFreedomInstance);
			if (degreeOfFreedomInstance != oldDegreeOfFreedomInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance,
							degreeOfFreedomInstance));
			}
		}
		return degreeOfFreedomInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomInstance basicGetDegreeOfFreedomInstance() {
		return degreeOfFreedomInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegreeOfFreedomInstance(DegreeOfFreedomInstance newDegreeOfFreedomInstance) {
		DegreeOfFreedomInstance oldDegreeOfFreedomInstance = degreeOfFreedomInstance;
		degreeOfFreedomInstance = newDegreeOfFreedomInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance,
					degreeOfFreedomInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
			if (resolve)
				return getDegreeOfFreedomInstance();
			return basicGetDegreeOfFreedomInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
			setDegreeOfFreedomInstance((DegreeOfFreedomInstance) newValue);
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
		case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
			setDegreeOfFreedomInstance((DegreeOfFreedomInstance) null);
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
		case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
			return degreeOfFreedomInstance != null;
		}
		return super.eIsSet(featureID);
	}

} // ChoiceImpl
