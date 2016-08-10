/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl#getDiffModel <em>Diff Model</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl#getDiffDescription <em>Diff Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffModelImpl extends NamedElementImpl implements DiffModel {
	/**
	 * The cached value of the '{@link #getDiffModel() <em>Diff Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> diffModel;

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
	protected DiffModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrepositoryPackage.Literals.DIFF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDiffModel() {
		if (diffModel == null) {
			diffModel = new EObjectResolvingEList<EObject>(EObject.class, this,
					DiffrepositoryPackage.DIFF_MODEL__DIFF_MODEL);
		}
		return diffModel;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrepositoryPackage.DIFF_MODEL__DIFF_DESCRIPTION,
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
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_MODEL:
			return getDiffModel();
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_DESCRIPTION:
			return getDiffDescription();
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
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_MODEL:
			getDiffModel().clear();
			getDiffModel().addAll((Collection<? extends EObject>) newValue);
			return;
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_DESCRIPTION:
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
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_MODEL:
			getDiffModel().clear();
			return;
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_DESCRIPTION:
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
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_MODEL:
			return diffModel != null && !diffModel.isEmpty();
		case DiffrepositoryPackage.DIFF_MODEL__DIFF_DESCRIPTION:
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

} //DiffModelImpl
