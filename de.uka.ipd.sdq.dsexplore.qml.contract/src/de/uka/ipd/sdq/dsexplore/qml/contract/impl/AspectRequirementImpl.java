/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.ValueLiteral;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.AspectRequirementImpl#getAspectRequirementLiteral <em>Aspect Requirement Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AspectRequirementImpl extends IdentifierImpl implements AspectRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.ASPECT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueLiteral getAspectRequirementLiteral() {
		return (ValueLiteral)eDynamicGet(QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL, QMLContractPackage.Literals.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectRequirementLiteral(ValueLiteral newAspectRequirementLiteral, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAspectRequirementLiteral, QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRequirementLiteral(ValueLiteral newAspectRequirementLiteral) {
		eDynamicSet(QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL, QMLContractPackage.Literals.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL, newAspectRequirementLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL:
				return basicSetAspectRequirementLiteral(null, msgs);
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
			case QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL:
				return getAspectRequirementLiteral();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL:
				setAspectRequirementLiteral((ValueLiteral)newValue);
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
			case QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL:
				setAspectRequirementLiteral((ValueLiteral)null);
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
			case QMLContractPackage.ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL:
				return getAspectRequirementLiteral() != null;
		}
		return super.eIsSet(featureID);
	}

} //AspectRequirementImpl
