/**
 */
package componentSecurity.impl;

import componentSecurity.ComponentSecurity;
import componentSecurity.ComponentSecurityPackage;
import componentSecurity.ComponentSecurityRepository;

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
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentSecurity.impl.ComponentSecurityRepositoryImpl#getComponentsecurity <em>Componentsecurity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSecurityRepositoryImpl extends MinimalEObjectImpl.Container implements ComponentSecurityRepository {
	/**
	 * The cached value of the '{@link #getComponentsecurity() <em>Componentsecurity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSecurity> componentsecurity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSecurityRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSecurityPackage.Literals.COMPONENT_SECURITY_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSecurity> getComponentsecurity() {
		if (componentsecurity == null) {
			componentsecurity = new EObjectContainmentEList<ComponentSecurity>(ComponentSecurity.class, this, ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY);
		}
		return componentsecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY:
				return ((InternalEList<?>)getComponentsecurity()).basicRemove(otherEnd, msgs);
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
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY:
				return getComponentsecurity();
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
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY:
				getComponentsecurity().clear();
				getComponentsecurity().addAll((Collection<? extends ComponentSecurity>)newValue);
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
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY:
				getComponentsecurity().clear();
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
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY:
				return componentsecurity != null && !componentsecurity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSecurityRepositoryImpl
