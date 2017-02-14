/**
 */
package ConcernModel.impl;

import ConcernModel.AnnotationEnrich;
import ConcernModel.ConcernModelPackage;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Concern Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.impl.ElementaryConcernComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link ConcernModel.impl.ElementaryConcernComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.impl.ElementaryConcernComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.impl.ElementaryConcernComponentImpl#getAnnotationenrich <em>Annotationenrich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementaryConcernComponentImpl extends MinimalEObjectImpl.Container implements ElementaryConcernComponent {
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryConcernComponent> requires;

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
	 * The cached value of the '{@link #getAnnotationenrich() <em>Annotationenrich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationenrich()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationEnrich> annotationenrich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryConcernComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcernModelPackage.Literals.ELEMENTARY_CONCERN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryConcernComponent> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<ElementaryConcernComponent>(ElementaryConcernComponent.class, this, ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__REQUIRES);
		}
		return requires;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationEnrich> getAnnotationenrich() {
		if (annotationenrich == null) {
			annotationenrich = new EObjectContainmentEList<AnnotationEnrich>(AnnotationEnrich.class, this, ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH);
		}
		return annotationenrich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH:
				return ((InternalEList<?>)getAnnotationenrich()).basicRemove(otherEnd, msgs);
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
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__REQUIRES:
				return getRequires();
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__NAME:
				return getName();
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION:
				return getDescription();
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH:
				return getAnnotationenrich();
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
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends ElementaryConcernComponent>)newValue);
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH:
				getAnnotationenrich().clear();
				getAnnotationenrich().addAll((Collection<? extends AnnotationEnrich>)newValue);
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
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__REQUIRES:
				getRequires().clear();
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH:
				getAnnotationenrich().clear();
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
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConcernModelPackage.ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH:
				return annotationenrich != null && !annotationenrich.isEmpty();
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

} //ElementaryConcernComponentImpl
