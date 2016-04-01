/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.util.DimensiontypesValidator;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl#getBiggerElement <em>Bigger Element</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl#getSmallerElement <em>Smaller Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends IdentifierImpl implements Order {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getBiggerElement() {
		return (Element)eDynamicGet(DimensiontypesPackage.ORDER__BIGGER_ELEMENT, DimensiontypesPackage.Literals.ORDER__BIGGER_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetBiggerElement() {
		return (Element)eDynamicGet(DimensiontypesPackage.ORDER__BIGGER_ELEMENT, DimensiontypesPackage.Literals.ORDER__BIGGER_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiggerElement(Element newBiggerElement) {
		eDynamicSet(DimensiontypesPackage.ORDER__BIGGER_ELEMENT, DimensiontypesPackage.Literals.ORDER__BIGGER_ELEMENT, newBiggerElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSmallerElement() {
		return (Element)eDynamicGet(DimensiontypesPackage.ORDER__SMALLER_ELEMENT, DimensiontypesPackage.Literals.ORDER__SMALLER_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSmallerElement() {
		return (Element)eDynamicGet(DimensiontypesPackage.ORDER__SMALLER_ELEMENT, DimensiontypesPackage.Literals.ORDER__SMALLER_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallerElement(Element newSmallerElement) {
		eDynamicSet(DimensiontypesPackage.ORDER__SMALLER_ELEMENT, DimensiontypesPackage.Literals.ORDER__SMALLER_ELEMENT, newSmallerElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BIGGERELEMENT_must_not_be_SMALLELEMENT(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 DimensiontypesValidator.ORDER__BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BIGGERELEMENT_must_not_be_SMALLELEMENT", EObjectValidator.getObjectLabel(this, context) }),
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensiontypesPackage.ORDER__BIGGER_ELEMENT:
				if (resolve) return getBiggerElement();
				return basicGetBiggerElement();
			case DimensiontypesPackage.ORDER__SMALLER_ELEMENT:
				if (resolve) return getSmallerElement();
				return basicGetSmallerElement();
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
			case DimensiontypesPackage.ORDER__BIGGER_ELEMENT:
				setBiggerElement((Element)newValue);
				return;
			case DimensiontypesPackage.ORDER__SMALLER_ELEMENT:
				setSmallerElement((Element)newValue);
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
			case DimensiontypesPackage.ORDER__BIGGER_ELEMENT:
				setBiggerElement((Element)null);
				return;
			case DimensiontypesPackage.ORDER__SMALLER_ELEMENT:
				setSmallerElement((Element)null);
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
			case DimensiontypesPackage.ORDER__BIGGER_ELEMENT:
				return basicGetBiggerElement() != null;
			case DimensiontypesPackage.ORDER__SMALLER_ELEMENT:
				return basicGetSmallerElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderImpl
