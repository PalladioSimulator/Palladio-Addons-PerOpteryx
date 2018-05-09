/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.Replication;
import FeatureCompletionModel.Visnetum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.ComplementumImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.ComplementumImpl#getVisnetum <em>Visnetum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementumImpl extends DescribedElementImpl implements Complementum {
	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final Replication REPLICATION_EDEFAULT = Replication.SINGLE_LITERAL;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected Replication replication = REPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisnetum() <em>Visnetum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisnetum()
	 * @generated
	 * @ordered
	 */
	protected static final Visnetum VISNETUM_EDEFAULT = Visnetum.SIGNATURE_LITERAL;

	/**
	 * The cached value of the '{@link #getVisnetum() <em>Visnetum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisnetum()
	 * @generated
	 * @ordered
	 */
	protected Visnetum visnetum = VISNETUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.COMPLEMENTUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replication getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication(Replication newReplication) {
		Replication oldReplication = replication;
		replication = newReplication == null ? REPLICATION_EDEFAULT : newReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLEMENTUM__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visnetum getVisnetum() {
		return visnetum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisnetum(Visnetum newVisnetum) {
		Visnetum oldVisnetum = visnetum;
		visnetum = newVisnetum == null ? VISNETUM_EDEFAULT : newVisnetum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLEMENTUM__VISNETUM, oldVisnetum, visnetum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureCompletionPackage.COMPLEMENTUM__REPLICATION:
				return getReplication();
			case FeatureCompletionPackage.COMPLEMENTUM__VISNETUM:
				return getVisnetum();
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
			case FeatureCompletionPackage.COMPLEMENTUM__REPLICATION:
				setReplication((Replication)newValue);
				return;
			case FeatureCompletionPackage.COMPLEMENTUM__VISNETUM:
				setVisnetum((Visnetum)newValue);
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
			case FeatureCompletionPackage.COMPLEMENTUM__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
				return;
			case FeatureCompletionPackage.COMPLEMENTUM__VISNETUM:
				setVisnetum(VISNETUM_EDEFAULT);
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
			case FeatureCompletionPackage.COMPLEMENTUM__REPLICATION:
				return replication != REPLICATION_EDEFAULT;
			case FeatureCompletionPackage.COMPLEMENTUM__VISNETUM:
				return visnetum != VISNETUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (replication: ");
		result.append(replication);
		result.append(", visnetum: ");
		result.append(visnetum);
		result.append(')');
		return result.toString();
	}

} //ComplementumImpl
