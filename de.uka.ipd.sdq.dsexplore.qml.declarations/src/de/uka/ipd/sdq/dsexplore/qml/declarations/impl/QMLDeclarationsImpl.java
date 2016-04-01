/**
 */
package de.uka.ipd.sdq.dsexplore.qml.declarations.impl;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QML Declarations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsImpl#getQmlDeclarations <em>Qml Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QMLDeclarationsImpl extends IdentifierImpl implements QMLDeclarations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QMLDeclarationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLDeclarationsPackage.Literals.QML_DECLARATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QMLDeclaration> getQmlDeclarations() {
		return (EList<QMLDeclaration>)eDynamicGet(QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS, QMLDeclarationsPackage.Literals.QML_DECLARATIONS__QML_DECLARATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS:
				return ((InternalEList<?>)getQmlDeclarations()).basicRemove(otherEnd, msgs);
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
			case QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS:
				return getQmlDeclarations();
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
			case QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS:
				getQmlDeclarations().clear();
				getQmlDeclarations().addAll((Collection<? extends QMLDeclaration>)newValue);
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
			case QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS:
				getQmlDeclarations().clear();
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
			case QMLDeclarationsPackage.QML_DECLARATIONS__QML_DECLARATIONS:
				return !getQmlDeclarations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QMLDeclarationsImpl
