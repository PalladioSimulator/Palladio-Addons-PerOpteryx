/**
 */
package TransformationModel.impl;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;

import TransformationModel.Transformation;
import TransformationModel.TransformationModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransformationModel.impl.TransformationImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link TransformationModel.impl.TransformationImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link TransformationModel.impl.TransformationImpl#getInjectable <em>Injectable</em>}</li>
 *   <li>{@link TransformationModel.impl.TransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link TransformationModel.impl.TransformationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected int threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInjectable() <em>Injectable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectable()
	 * @generated
	 * @ordered
	 */
	protected AnnotationEnrich injectable;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AnnotationTarget target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationModelPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(int newThreshold) {
		int oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.TRANSFORMATION__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.TRANSFORMATION__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationEnrich getInjectable() {
		if (injectable != null && injectable.eIsProxy()) {
			InternalEObject oldInjectable = (InternalEObject)injectable;
			injectable = (AnnotationEnrich)eResolveProxy(oldInjectable);
			if (injectable != oldInjectable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationModelPackage.TRANSFORMATION__INJECTABLE, oldInjectable, injectable));
			}
		}
		return injectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationEnrich basicGetInjectable() {
		return injectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectable(AnnotationEnrich newInjectable) {
		AnnotationEnrich oldInjectable = injectable;
		injectable = newInjectable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.TRANSFORMATION__INJECTABLE, oldInjectable, injectable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AnnotationTarget)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformationModelPackage.TRANSFORMATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AnnotationTarget newTarget) {
		AnnotationTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.TRANSFORMATION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformationModelPackage.TRANSFORMATION__THRESHOLD:
				return getThreshold();
			case TransformationModelPackage.TRANSFORMATION__MULTIPLE:
				return isMultiple();
			case TransformationModelPackage.TRANSFORMATION__INJECTABLE:
				if (resolve) return getInjectable();
				return basicGetInjectable();
			case TransformationModelPackage.TRANSFORMATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TransformationModelPackage.TRANSFORMATION__NAME:
				return getName();
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
			case TransformationModelPackage.TRANSFORMATION__THRESHOLD:
				setThreshold((Integer)newValue);
				return;
			case TransformationModelPackage.TRANSFORMATION__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case TransformationModelPackage.TRANSFORMATION__INJECTABLE:
				setInjectable((AnnotationEnrich)newValue);
				return;
			case TransformationModelPackage.TRANSFORMATION__TARGET:
				setTarget((AnnotationTarget)newValue);
				return;
			case TransformationModelPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
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
			case TransformationModelPackage.TRANSFORMATION__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case TransformationModelPackage.TRANSFORMATION__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case TransformationModelPackage.TRANSFORMATION__INJECTABLE:
				setInjectable((AnnotationEnrich)null);
				return;
			case TransformationModelPackage.TRANSFORMATION__TARGET:
				setTarget((AnnotationTarget)null);
				return;
			case TransformationModelPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
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
			case TransformationModelPackage.TRANSFORMATION__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case TransformationModelPackage.TRANSFORMATION__MULTIPLE:
				return multiple != MULTIPLE_EDEFAULT;
			case TransformationModelPackage.TRANSFORMATION__INJECTABLE:
				return injectable != null;
			case TransformationModelPackage.TRANSFORMATION__TARGET:
				return target != null;
			case TransformationModelPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (threshold: ");
		result.append(threshold);
		result.append(", multiple: ");
		result.append(multiple);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
