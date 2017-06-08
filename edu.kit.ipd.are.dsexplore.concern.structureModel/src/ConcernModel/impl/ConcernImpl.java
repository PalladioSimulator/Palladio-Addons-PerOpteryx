/**
 */
package ConcernModel.impl;

import ConcernModel.AnnotationTarget;
import ConcernModel.Concern;
import ConcernModel.ConcernModelPackage;
import ConcernModel.ConcernStrategy;
import ConcernModel.DeploymentConstraint;
import ConcernModel.ElementaryConcernComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getAnnotationtarget <em>Annotationtarget</em>}</li>
 *   <li>{@link ConcernModel.impl.ConcernImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernImpl extends MinimalEObjectImpl.Container implements Concern {
	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcernStrategy> strategies;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryConcernComponent> components;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotationtarget() <em>Annotationtarget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationtarget()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationTarget> annotationtarget;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentConstraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcernModelPackage.Literals.CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcernStrategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<ConcernStrategy>(ConcernStrategy.class, this, ConcernModelPackage.CONCERN__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryConcernComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ElementaryConcernComponent>(ElementaryConcernComponent.class, this, ConcernModelPackage.CONCERN__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.CONCERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.CONCERN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationTarget> getAnnotationtarget() {
		if (annotationtarget == null) {
			annotationtarget = new EObjectContainmentEList<AnnotationTarget>(AnnotationTarget.class, this, ConcernModelPackage.CONCERN__ANNOTATIONTARGET);
		}
		return annotationtarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<DeploymentConstraint>(DeploymentConstraint.class, this, ConcernModelPackage.CONCERN__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernModelPackage.CONCERN__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case ConcernModelPackage.CONCERN__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ConcernModelPackage.CONCERN__ANNOTATIONTARGET:
				return ((InternalEList<?>)getAnnotationtarget()).basicRemove(otherEnd, msgs);
			case ConcernModelPackage.CONCERN__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case ConcernModelPackage.CONCERN__STRATEGIES:
				return getStrategies();
			case ConcernModelPackage.CONCERN__COMPONENTS:
				return getComponents();
			case ConcernModelPackage.CONCERN__NAME:
				return getName();
			case ConcernModelPackage.CONCERN__DESCRIPTION:
				return getDescription();
			case ConcernModelPackage.CONCERN__ANNOTATIONTARGET:
				return getAnnotationtarget();
			case ConcernModelPackage.CONCERN__CONSTRAINTS:
				return getConstraints();
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
			case ConcernModelPackage.CONCERN__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends ConcernStrategy>)newValue);
				return;
			case ConcernModelPackage.CONCERN__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ElementaryConcernComponent>)newValue);
				return;
			case ConcernModelPackage.CONCERN__NAME:
				setName((String)newValue);
				return;
			case ConcernModelPackage.CONCERN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConcernModelPackage.CONCERN__ANNOTATIONTARGET:
				getAnnotationtarget().clear();
				getAnnotationtarget().addAll((Collection<? extends AnnotationTarget>)newValue);
				return;
			case ConcernModelPackage.CONCERN__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DeploymentConstraint>)newValue);
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
			case ConcernModelPackage.CONCERN__STRATEGIES:
				getStrategies().clear();
				return;
			case ConcernModelPackage.CONCERN__COMPONENTS:
				getComponents().clear();
				return;
			case ConcernModelPackage.CONCERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcernModelPackage.CONCERN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConcernModelPackage.CONCERN__ANNOTATIONTARGET:
				getAnnotationtarget().clear();
				return;
			case ConcernModelPackage.CONCERN__CONSTRAINTS:
				getConstraints().clear();
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
			case ConcernModelPackage.CONCERN__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case ConcernModelPackage.CONCERN__COMPONENTS:
				return components != null && !components.isEmpty();
			case ConcernModelPackage.CONCERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcernModelPackage.CONCERN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConcernModelPackage.CONCERN__ANNOTATIONTARGET:
				return annotationtarget != null && !annotationtarget.isEmpty();
			case ConcernModelPackage.CONCERN__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConcernImpl
