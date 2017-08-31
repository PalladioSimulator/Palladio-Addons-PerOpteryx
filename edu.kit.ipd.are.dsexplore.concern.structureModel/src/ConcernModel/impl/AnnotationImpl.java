/**
 */
package ConcernModel.impl;

import ConcernModel.Annotation;
import ConcernModel.ConcernModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.impl.AnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.impl.AnnotationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.impl.AnnotationImpl#getMaxAmount <em>Max Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation {
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
	 * The default value of the '{@link #getMaxAmount() <em>Max Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAmount() <em>Max Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAmount()
	 * @generated
	 * @ordered
	 */
	protected int maxAmount = MAX_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcernModelPackage.Literals.ANNOTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.ANNOTATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.ANNOTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAmount() {
		return maxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAmount(int newMaxAmount) {
		int oldMaxAmount = maxAmount;
		maxAmount = newMaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcernModelPackage.ANNOTATION__MAX_AMOUNT, oldMaxAmount, maxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcernModelPackage.ANNOTATION__NAME:
				return getName();
			case ConcernModelPackage.ANNOTATION__DESCRIPTION:
				return getDescription();
			case ConcernModelPackage.ANNOTATION__MAX_AMOUNT:
				return getMaxAmount();
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
			case ConcernModelPackage.ANNOTATION__NAME:
				setName((String)newValue);
				return;
			case ConcernModelPackage.ANNOTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConcernModelPackage.ANNOTATION__MAX_AMOUNT:
				setMaxAmount((Integer)newValue);
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
			case ConcernModelPackage.ANNOTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcernModelPackage.ANNOTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConcernModelPackage.ANNOTATION__MAX_AMOUNT:
				setMaxAmount(MAX_AMOUNT_EDEFAULT);
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
			case ConcernModelPackage.ANNOTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcernModelPackage.ANNOTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConcernModelPackage.ANNOTATION__MAX_AMOUNT:
				return maxAmount != MAX_AMOUNT_EDEFAULT;
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
		result.append(", maxAmount: ");
		result.append(maxAmount);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
