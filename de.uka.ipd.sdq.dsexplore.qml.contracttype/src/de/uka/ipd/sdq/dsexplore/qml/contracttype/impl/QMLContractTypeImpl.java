/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.impl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage;

import de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationImpl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QML Contract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QMLContractTypeImpl extends QMLDeclarationImpl implements QMLContractType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QMLContractTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractTypePackage.Literals.QML_CONTRACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Dimension> getDimensions() {
		return (EList<Dimension>)eDynamicGet(QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS, QMLContractTypePackage.Literals.QML_CONTRACT_TYPE__DIMENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
				return getDimensions();
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
			case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Dimension>)newValue);
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
			case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
				getDimensions().clear();
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
			case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
				return !getDimensions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QMLContractTypeImpl
