/**
 */
package TransformationModel.impl;

import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.TransformationModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapter Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransformationModel.impl.AdapterTransformationImpl#getAppear <em>Appear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdapterTransformationImpl extends TransformationImpl implements AdapterTransformation {
	/**
	 * The default value of the '{@link #getAppear() <em>Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppear()
	 * @generated
	 * @ordered
	 */
	protected static final Appearance APPEAR_EDEFAULT = Appearance.BEFORE;

	/**
	 * The cached value of the '{@link #getAppear() <em>Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppear()
	 * @generated
	 * @ordered
	 */
	protected Appearance appear = APPEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationModelPackage.Literals.ADAPTER_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance getAppear() {
		return appear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppear(Appearance newAppear) {
		Appearance oldAppear = appear;
		appear = newAppear == null ? APPEAR_EDEFAULT : newAppear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationModelPackage.ADAPTER_TRANSFORMATION__APPEAR, oldAppear, appear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformationModelPackage.ADAPTER_TRANSFORMATION__APPEAR:
				return getAppear();
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
			case TransformationModelPackage.ADAPTER_TRANSFORMATION__APPEAR:
				setAppear((Appearance)newValue);
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
			case TransformationModelPackage.ADAPTER_TRANSFORMATION__APPEAR:
				setAppear(APPEAR_EDEFAULT);
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
			case TransformationModelPackage.ADAPTER_TRANSFORMATION__APPEAR:
				return appear != APPEAR_EDEFAULT;
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
		result.append(" (appear: ");
		result.append(appear);
		result.append(')');
		return result.toString();
	}

} //AdapterTransformationImpl
