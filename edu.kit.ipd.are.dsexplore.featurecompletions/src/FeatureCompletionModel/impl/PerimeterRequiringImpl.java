/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.PerimeterRequiring;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perimeter Requiring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.PerimeterRequiringImpl#getComplementum <em>Complementum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerimeterRequiringImpl extends NamedElementImpl implements PerimeterRequiring {
	/**
	 * The cached value of the '{@link #getComplementum() <em>Complementum</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementum()
	 * @generated
	 * @ordered
	 */
	protected EList<Complementum> complementum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerimeterRequiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.PERIMETER_REQUIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complementum> getComplementum() {
		if (complementum == null) {
			complementum = new EObjectResolvingEList<Complementum>(Complementum.class, this, FeatureCompletionPackage.PERIMETER_REQUIRING__COMPLEMENTUM);
		}
		return complementum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureCompletionPackage.PERIMETER_REQUIRING__COMPLEMENTUM:
				return getComplementum();
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
			case FeatureCompletionPackage.PERIMETER_REQUIRING__COMPLEMENTUM:
				getComplementum().clear();
				getComplementum().addAll((Collection<? extends Complementum>)newValue);
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
			case FeatureCompletionPackage.PERIMETER_REQUIRING__COMPLEMENTUM:
				getComplementum().clear();
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
			case FeatureCompletionPackage.PERIMETER_REQUIRING__COMPLEMENTUM:
				return complementum != null && !complementum.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerimeterRequiringImpl
