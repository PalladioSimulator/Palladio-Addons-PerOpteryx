/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.ArchitectureConstraints;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.PerimeterProviding;
import FeatureCompletionModel.PerimeterRequiring;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.CompletionComponentImpl#getRequiredComponents <em>Required Components</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.CompletionComponentImpl#getPerimeterProviding <em>Perimeter Providing</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.CompletionComponentImpl#getComponentConstraints <em>Component Constraints</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.CompletionComponentImpl#getPerimeterRequiring <em>Perimeter Requiring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionComponentImpl extends ConstrainableElementImpl implements CompletionComponent {
	/**
	 * The cached value of the '{@link #getRequiredComponents() <em>Required Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompletionComponent> requiredComponents;

	/**
	 * The cached value of the '{@link #getPerimeterProviding() <em>Perimeter Providing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeterProviding()
	 * @generated
	 * @ordered
	 */
	protected PerimeterProviding perimeterProviding;

	/**
	 * The cached value of the '{@link #getComponentConstraints() <em>Component Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureConstraints> componentConstraints;

	/**
	 * The cached value of the '{@link #getPerimeterRequiring() <em>Perimeter Requiring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeterRequiring()
	 * @generated
	 * @ordered
	 */
	protected PerimeterRequiring perimeterRequiring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletionComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.COMPLETION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompletionComponent> getRequiredComponents() {
		if (requiredComponents == null) {
			requiredComponents = new EObjectResolvingEList<CompletionComponent>(CompletionComponent.class, this, FeatureCompletionPackage.COMPLETION_COMPONENT__REQUIRED_COMPONENTS);
		}
		return requiredComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerimeterProviding getPerimeterProviding() {
		return perimeterProviding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerimeterProviding(PerimeterProviding newPerimeterProviding, NotificationChain msgs) {
		PerimeterProviding oldPerimeterProviding = perimeterProviding;
		perimeterProviding = newPerimeterProviding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING, oldPerimeterProviding, newPerimeterProviding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeterProviding(PerimeterProviding newPerimeterProviding) {
		if (newPerimeterProviding != perimeterProviding) {
			NotificationChain msgs = null;
			if (perimeterProviding != null)
				msgs = ((InternalEObject)perimeterProviding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING, null, msgs);
			if (newPerimeterProviding != null)
				msgs = ((InternalEObject)newPerimeterProviding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING, null, msgs);
			msgs = basicSetPerimeterProviding(newPerimeterProviding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING, newPerimeterProviding, newPerimeterProviding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureConstraints> getComponentConstraints() {
		if (componentConstraints == null) {
			componentConstraints = new EObjectContainmentEList<ArchitectureConstraints>(ArchitectureConstraints.class, this, FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS);
		}
		return componentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerimeterRequiring getPerimeterRequiring() {
		return perimeterRequiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerimeterRequiring(PerimeterRequiring newPerimeterRequiring, NotificationChain msgs) {
		PerimeterRequiring oldPerimeterRequiring = perimeterRequiring;
		perimeterRequiring = newPerimeterRequiring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING, oldPerimeterRequiring, newPerimeterRequiring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeterRequiring(PerimeterRequiring newPerimeterRequiring) {
		if (newPerimeterRequiring != perimeterRequiring) {
			NotificationChain msgs = null;
			if (perimeterRequiring != null)
				msgs = ((InternalEObject)perimeterRequiring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING, null, msgs);
			if (newPerimeterRequiring != null)
				msgs = ((InternalEObject)newPerimeterRequiring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING, null, msgs);
			msgs = basicSetPerimeterRequiring(newPerimeterRequiring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING, newPerimeterRequiring, newPerimeterRequiring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING:
				return basicSetPerimeterProviding(null, msgs);
			case FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS:
				return ((InternalEList<?>)getComponentConstraints()).basicRemove(otherEnd, msgs);
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING:
				return basicSetPerimeterRequiring(null, msgs);
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
			case FeatureCompletionPackage.COMPLETION_COMPONENT__REQUIRED_COMPONENTS:
				return getRequiredComponents();
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING:
				return getPerimeterProviding();
			case FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS:
				return getComponentConstraints();
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING:
				return getPerimeterRequiring();
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
			case FeatureCompletionPackage.COMPLETION_COMPONENT__REQUIRED_COMPONENTS:
				getRequiredComponents().clear();
				getRequiredComponents().addAll((Collection<? extends CompletionComponent>)newValue);
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING:
				setPerimeterProviding((PerimeterProviding)newValue);
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS:
				getComponentConstraints().clear();
				getComponentConstraints().addAll((Collection<? extends ArchitectureConstraints>)newValue);
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING:
				setPerimeterRequiring((PerimeterRequiring)newValue);
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
			case FeatureCompletionPackage.COMPLETION_COMPONENT__REQUIRED_COMPONENTS:
				getRequiredComponents().clear();
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING:
				setPerimeterProviding((PerimeterProviding)null);
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS:
				getComponentConstraints().clear();
				return;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING:
				setPerimeterRequiring((PerimeterRequiring)null);
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
			case FeatureCompletionPackage.COMPLETION_COMPONENT__REQUIRED_COMPONENTS:
				return requiredComponents != null && !requiredComponents.isEmpty();
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_PROVIDING:
				return perimeterProviding != null;
			case FeatureCompletionPackage.COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS:
				return componentConstraints != null && !componentConstraints.isEmpty();
			case FeatureCompletionPackage.COMPLETION_COMPONENT__PERIMETER_REQUIRING:
				return perimeterRequiring != null;
		}
		return super.eIsSet(featureID);
	}

} //CompletionComponentImpl
