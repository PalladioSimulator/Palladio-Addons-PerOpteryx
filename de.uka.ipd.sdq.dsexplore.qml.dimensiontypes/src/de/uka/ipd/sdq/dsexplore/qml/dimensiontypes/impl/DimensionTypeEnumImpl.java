/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.util.DimensiontypesValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeEnumImpl extends DimensionTypeImpl implements DimensionTypeEnum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.DIMENSION_TYPE_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
		return (EList<Element>)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS, DimensiontypesPackage.Literals.DIMENSION_TYPE_ENUM__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Order> getOrder() {
		return (EList<Order>)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER, DimensiontypesPackage.Literals.DIMENSION_TYPE_ENUM__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DimensiontypesValidator.DIAGNOSTIC_SOURCE,
						 DimensiontypesValidator.DIMENSION_TYPE_ENUM__ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS_AND_VICE_VERSA,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER:
				return ((InternalEList<?>)getOrder()).basicRemove(otherEnd, msgs);
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
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS:
				return getElements();
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER:
				return getOrder();
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
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Order>)newValue);
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
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS:
				getElements().clear();
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER:
				getOrder().clear();
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
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ELEMENTS:
				return !getElements().isEmpty();
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM__ORDER:
				return !getOrder().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeEnumImpl
