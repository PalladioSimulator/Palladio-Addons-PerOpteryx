/**
 */
package concernStrategy.impl;

import concernStrategy.Feature;
import concernStrategy.Simple;
import concernStrategy.StrategymodelPackage;

import concernStrategy.util.StrategymodelValidator;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.impl.SimpleImpl#getOptionalChildren <em>Optional Children</em>}</li>
 *   <li>{@link concernStrategy.impl.SimpleImpl#getMandatoryChildren <em>Mandatory Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleImpl extends ChildRelationImpl implements Simple {
	/**
	 * The cached value of the '{@link #getOptionalChildren() <em>Optional Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalChildren()
	 * @generated
	 * @ordered
	 */
	protected EList optionalChildren;

	/**
	 * The cached value of the '{@link #getMandatoryChildren() <em>Mandatory Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryChildren()
	 * @generated
	 * @ordered
	 */
	protected EList mandatoryChildren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StrategymodelPackage.Literals.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOptionalChildren() {
		if (optionalChildren == null) {
			optionalChildren = new EObjectContainmentWithInverseEList(Feature.class, this, StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN, StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL);
		}
		return optionalChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMandatoryChildren() {
		if (mandatoryChildren == null) {
			mandatoryChildren = new EObjectContainmentWithInverseEList(Feature.class, this, StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN, StrategymodelPackage.FEATURE__SIMPLE_MANDATORY);
		}
		return mandatoryChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean atLeastOneChild(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrategymodelValidator.DIAGNOSTIC_SOURCE,
						 StrategymodelValidator.SIMPLE__AT_LEAST_ONE_CHILD,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "atLeastOneChild", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				return ((InternalEList)getOptionalChildren()).basicAdd(otherEnd, msgs);
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				return ((InternalEList)getMandatoryChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				return ((InternalEList)getOptionalChildren()).basicRemove(otherEnd, msgs);
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				return ((InternalEList)getMandatoryChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				return getOptionalChildren();
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				return getMandatoryChildren();
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
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				getOptionalChildren().clear();
				getOptionalChildren().addAll((Collection)newValue);
				return;
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				getMandatoryChildren().clear();
				getMandatoryChildren().addAll((Collection)newValue);
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
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				getOptionalChildren().clear();
				return;
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				getMandatoryChildren().clear();
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
			case StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN:
				return optionalChildren != null && !optionalChildren.isEmpty();
			case StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN:
				return mandatoryChildren != null && !mandatoryChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleImpl
