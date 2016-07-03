/**
 */
package de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl;

import de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff;
import de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl#getDiffModel <em>Diff Model</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl#getDiffDescription <em>Diff Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffImpl extends EObjectImpl implements Diff {
	/**
	 * The cached value of the '{@link #getDiffModel() <em>Diff Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffModel()
	 * @generated
	 * @ordered
	 */
	protected EObject diffModel;

	/**
	 * The default value of the '{@link #getDiffDescription() <em>Diff Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiffDescription() <em>Diff Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffDescription()
	 * @generated
	 * @ordered
	 */
	protected String diffDescription = DIFF_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return comparerepositoryPackage.Literals.DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDiffModel() {
		if (diffModel != null && diffModel.eIsProxy()) {
			InternalEObject oldDiffModel = (InternalEObject) diffModel;
			diffModel = eResolveProxy(oldDiffModel);
			if (diffModel != oldDiffModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, comparerepositoryPackage.DIFF__DIFF_MODEL,
							oldDiffModel, diffModel));
			}
		}
		return diffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDiffModel() {
		return diffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiffModel(EObject newDiffModel) {
		EObject oldDiffModel = diffModel;
		diffModel = newDiffModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, comparerepositoryPackage.DIFF__DIFF_MODEL,
					oldDiffModel, diffModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiffDescription() {
		return diffDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiffDescription(String newDiffDescription) {
		String oldDiffDescription = diffDescription;
		diffDescription = newDiffDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, comparerepositoryPackage.DIFF__DIFF_DESCRIPTION,
					oldDiffDescription, diffDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case comparerepositoryPackage.DIFF__DIFF_MODEL:
			if (resolve)
				return getDiffModel();
			return basicGetDiffModel();
		case comparerepositoryPackage.DIFF__DIFF_DESCRIPTION:
			return getDiffDescription();
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
		case comparerepositoryPackage.DIFF__DIFF_MODEL:
			setDiffModel((EObject) newValue);
			return;
		case comparerepositoryPackage.DIFF__DIFF_DESCRIPTION:
			setDiffDescription((String) newValue);
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
		case comparerepositoryPackage.DIFF__DIFF_MODEL:
			setDiffModel((EObject) null);
			return;
		case comparerepositoryPackage.DIFF__DIFF_DESCRIPTION:
			setDiffDescription(DIFF_DESCRIPTION_EDEFAULT);
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
		case comparerepositoryPackage.DIFF__DIFF_MODEL:
			return diffModel != null;
		case comparerepositoryPackage.DIFF__DIFF_DESCRIPTION:
			return DIFF_DESCRIPTION_EDEFAULT == null ? diffDescription != null
					: !DIFF_DESCRIPTION_EDEFAULT.equals(diffDescription);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DiffDescription: ");
		result.append(diffDescription);
		result.append(')');
		return result.toString();
	}

} //DiffImpl
