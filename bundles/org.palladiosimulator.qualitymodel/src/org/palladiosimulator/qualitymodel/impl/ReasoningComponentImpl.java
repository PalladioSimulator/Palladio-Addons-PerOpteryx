/**
 */
package org.palladiosimulator.qualitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import org.palladiosimulator.qualitymodel.Nqr;
import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.Reasoning;
import org.palladiosimulator.qualitymodel.ReasoningComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reasoning Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl#getNqrs <em>Nqrs</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl#getReasonings <em>Reasonings</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReasoningComponentImpl extends EntityImpl implements ReasoningComponent {
	/**
	 * The cached value of the '{@link #getNqrs() <em>Nqrs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNqrs()
	 * @generated
	 * @ordered
	 */
	protected EList nqrs;

	/**
	 * The cached value of the '{@link #getReasonings() <em>Reasonings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonings()
	 * @generated
	 * @ordered
	 */
	protected EList reasonings;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasoningComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.REASONING_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNqrs() {
		if (nqrs == null) {
			nqrs = new EObjectResolvingEList(Nqr.class, this, QualityModelPackage.REASONING_COMPONENT__NQRS);
		}
		return nqrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReasonings() {
		if (reasonings == null) {
			reasonings = new EObjectResolvingEList(Reasoning.class, this, QualityModelPackage.REASONING_COMPONENT__REASONINGS);
		}
		return reasonings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityModelPackage.REASONING_COMPONENT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.REASONING_COMPONENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityModelPackage.REASONING_COMPONENT__NQRS:
				return getNqrs();
			case QualityModelPackage.REASONING_COMPONENT__REASONINGS:
				return getReasonings();
			case QualityModelPackage.REASONING_COMPONENT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityModelPackage.REASONING_COMPONENT__NQRS:
				getNqrs().clear();
				getNqrs().addAll((Collection)newValue);
				return;
			case QualityModelPackage.REASONING_COMPONENT__REASONINGS:
				getReasonings().clear();
				getReasonings().addAll((Collection)newValue);
				return;
			case QualityModelPackage.REASONING_COMPONENT__COMPONENT:
				setComponent((RepositoryComponent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualityModelPackage.REASONING_COMPONENT__NQRS:
				getNqrs().clear();
				return;
			case QualityModelPackage.REASONING_COMPONENT__REASONINGS:
				getReasonings().clear();
				return;
			case QualityModelPackage.REASONING_COMPONENT__COMPONENT:
				setComponent((RepositoryComponent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualityModelPackage.REASONING_COMPONENT__NQRS:
				return nqrs != null && !nqrs.isEmpty();
			case QualityModelPackage.REASONING_COMPONENT__REASONINGS:
				return reasonings != null && !reasonings.isEmpty();
			case QualityModelPackage.REASONING_COMPONENT__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //ReasoningComponentImpl
