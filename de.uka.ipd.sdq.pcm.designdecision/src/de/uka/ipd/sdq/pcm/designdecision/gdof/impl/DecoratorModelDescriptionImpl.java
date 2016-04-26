/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;

import de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorator Model Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DecoratorModelDescriptionImpl#getReferedDecorator <em>Refered Decorator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecoratorModelDescriptionImpl extends NamedElementImpl implements DecoratorModelDescription {
	/**
	 * The cached value of the '{@link #getReferedDecorator() <em>Refered Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferedDecorator()
	 * @generated
	 * @ordered
	 */
	protected EClass referedDecorator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecoratorModelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.DECORATOR_MODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferedDecorator() {
		if (referedDecorator != null && referedDecorator.eIsProxy()) {
			InternalEObject oldReferedDecorator = (InternalEObject) referedDecorator;
			referedDecorator = (EClass) eResolveProxy(oldReferedDecorator);
			if (referedDecorator != oldReferedDecorator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR, oldReferedDecorator,
							referedDecorator));
			}
		}
		return referedDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetReferedDecorator() {
		return referedDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferedDecorator(EClass newReferedDecorator) {
		EClass oldReferedDecorator = referedDecorator;
		referedDecorator = newReferedDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR, oldReferedDecorator, referedDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR:
			if (resolve)
				return getReferedDecorator();
			return basicGetReferedDecorator();
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
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR:
			setReferedDecorator((EClass) newValue);
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
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR:
			setReferedDecorator((EClass) null);
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
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION__REFERED_DECORATOR:
			return referedDecorator != null;
		}
		return super.eIsSet(featureID);
	}

} //DecoratorModelDescriptionImpl
