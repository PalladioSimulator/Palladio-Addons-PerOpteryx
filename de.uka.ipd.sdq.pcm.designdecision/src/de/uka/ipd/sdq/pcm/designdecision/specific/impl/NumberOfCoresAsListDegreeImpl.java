/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Number Of Cores As List Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl#getListOfIntegers <em>List Of Integers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberOfCoresAsListDegreeImpl extends NumberOfCoresDegreeImpl implements NumberOfCoresAsListDegree {
	/**
	 * The cached value of the '{@link #getListOfIntegers() <em>List Of Integers</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getListOfIntegers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> listOfIntegers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfCoresAsListDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.NUMBER_OF_CORES_AS_LIST_DEGREE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getListOfIntegers() {
		if (listOfIntegers == null) {
			listOfIntegers = new EDataTypeUniqueEList<Integer>(Integer.class, this, specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS);
		}
		return listOfIntegers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS:
			return getListOfIntegers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS:
			getListOfIntegers().clear();
			getListOfIntegers().addAll((Collection<? extends Integer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS:
			getListOfIntegers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS:
			return listOfIntegers != null && !listOfIntegers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataTypeDegree.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DiscreteDegree.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == OrderedDataTypeDegree.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == OrderedIntegerDegree.class) {
			switch (derivedFeatureID) {
			case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS:
				return specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataTypeDegree.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DiscreteDegree.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == OrderedDataTypeDegree.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == OrderedIntegerDegree.class) {
			switch (baseFeatureID) {
			case specificPackage.ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS:
				return specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (listOfIntegers: ");
		result.append(listOfIntegers);
		result.append(')');
		return result.toString();
	}

} // NumberOfCoresAsListDegreeImpl
