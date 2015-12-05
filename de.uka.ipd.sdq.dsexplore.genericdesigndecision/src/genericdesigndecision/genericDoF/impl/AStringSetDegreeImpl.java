/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.genericDoF.AStringSetDegree;
import genericdesigndecision.genericDoF.GenericDoFPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AString Set Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl#getStringValues <em>String Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AStringSetDegreeImpl extends AUnorderedDegreeImpl implements AStringSetDegree {
	/**
	 * The cached value of the '{@link #getStringValues() <em>String Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stringValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AStringSetDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.ASTRING_SET_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringValues() {
		if (stringValues == null) {
			stringValues = new EDataTypeUniqueEList<String>(String.class, this, GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES);
		}
		return stringValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES:
				return getStringValues();
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
			case GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES:
				getStringValues().clear();
				getStringValues().addAll((Collection<? extends String>)newValue);
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
			case GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES:
				getStringValues().clear();
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
			case GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES:
				return stringValues != null && !stringValues.isEmpty();
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
		result.append(" (stringValues: ");
		result.append(stringValues);
		result.append(')');
		return result.toString();
	}

} //AStringSetDegreeImpl
