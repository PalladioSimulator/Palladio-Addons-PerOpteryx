/**
 */
package featureObjective.impl;

import FeatureCompletionModel.impl.NamedElementImpl;

import featureObjective.Attribute;
import featureObjective.ChildRelation;
import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.FeatureObjectivePackage;
import featureObjective.Simple;

import featureObjective.util.FeatureObjectiveValidator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureImpl#getChildrelation <em>Childrelation</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureImpl#getSimpleMandatory <em>Simple Mandatory</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureImpl#getSimpleOptional <em>Simple Optional</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureImpl#getFeaturegroup <em>Featuregroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes;

	/**
	 * The cached value of the '{@link #getChildrelation() <em>Childrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrelation()
	 * @generated
	 * @ordered
	 */
	protected ChildRelation childrelation;

	/**
	 * The cached value of the '{@link #getSimpleMandatory() <em>Simple Mandatory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleMandatory()
	 * @generated
	 * @ordered
	 */
	protected Simple simpleMandatory;

	/**
	 * The cached value of the '{@link #getSimpleOptional() <em>Simple Optional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleOptional()
	 * @generated
	 * @ordered
	 */
	protected Simple simpleOptional;

	/**
	 * The cached value of the '{@link #getFeaturegroup() <em>Featuregroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturegroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroup featuregroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureObjectivePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(Attribute.class, this, FeatureObjectivePackage.FEATURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildRelation getChildrelation() {
		return childrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildrelation(ChildRelation newChildrelation, NotificationChain msgs) {
		ChildRelation oldChildrelation = childrelation;
		childrelation = newChildrelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__CHILDRELATION, oldChildrelation, newChildrelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrelation(ChildRelation newChildrelation) {
		if (newChildrelation != childrelation) {
			NotificationChain msgs = null;
			if (childrelation != null)
				msgs = ((InternalEObject)childrelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureObjectivePackage.FEATURE__CHILDRELATION, null, msgs);
			if (newChildrelation != null)
				msgs = ((InternalEObject)newChildrelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureObjectivePackage.FEATURE__CHILDRELATION, null, msgs);
			msgs = basicSetChildrelation(newChildrelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__CHILDRELATION, newChildrelation, newChildrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple getSimpleMandatory() {
		if (simpleMandatory != null && simpleMandatory.eIsProxy()) {
			InternalEObject oldSimpleMandatory = (InternalEObject)simpleMandatory;
			simpleMandatory = (Simple)eResolveProxy(oldSimpleMandatory);
			if (simpleMandatory != oldSimpleMandatory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY, oldSimpleMandatory, simpleMandatory));
			}
		}
		return simpleMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple basicGetSimpleMandatory() {
		return simpleMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleMandatory(Simple newSimpleMandatory) {
		Simple oldSimpleMandatory = simpleMandatory;
		simpleMandatory = newSimpleMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY, oldSimpleMandatory, simpleMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple getSimpleOptional() {
		if (simpleOptional != null && simpleOptional.eIsProxy()) {
			InternalEObject oldSimpleOptional = (InternalEObject)simpleOptional;
			simpleOptional = (Simple)eResolveProxy(oldSimpleOptional);
			if (simpleOptional != oldSimpleOptional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL, oldSimpleOptional, simpleOptional));
			}
		}
		return simpleOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple basicGetSimpleOptional() {
		return simpleOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleOptional(Simple newSimpleOptional) {
		Simple oldSimpleOptional = simpleOptional;
		simpleOptional = newSimpleOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL, oldSimpleOptional, simpleOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getFeaturegroup() {
		if (featuregroup != null && featuregroup.eIsProxy()) {
			InternalEObject oldFeaturegroup = (InternalEObject)featuregroup;
			featuregroup = (FeatureGroup)eResolveProxy(oldFeaturegroup);
			if (featuregroup != oldFeaturegroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureObjectivePackage.FEATURE__FEATUREGROUP, oldFeaturegroup, featuregroup));
			}
		}
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup basicGetFeaturegroup() {
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturegroup(FeatureGroup newFeaturegroup) {
		FeatureGroup oldFeaturegroup = featuregroup;
		featuregroup = newFeaturegroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__FEATUREGROUP, oldFeaturegroup, featuregroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EachAttributeNameDefinedJustOnce(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FeatureObjectiveValidator.DIAGNOSTIC_SOURCE,
						 FeatureObjectiveValidator.FEATURE__EACH_ATTRIBUTE_NAME_DEFINED_JUST_ONCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachAttributeNameDefinedJustOnce", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				return basicSetChildrelation(null, msgs);
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
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				return getChildrelation();
			case FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY:
				if (resolve) return getSimpleMandatory();
				return basicGetSimpleMandatory();
			case FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL:
				if (resolve) return getSimpleOptional();
				return basicGetSimpleOptional();
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				if (resolve) return getFeaturegroup();
				return basicGetFeaturegroup();
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
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				setChildrelation((ChildRelation)newValue);
				return;
			case FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY:
				setSimpleMandatory((Simple)newValue);
				return;
			case FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL:
				setSimpleOptional((Simple)newValue);
				return;
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				setFeaturegroup((FeatureGroup)newValue);
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
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				setChildrelation((ChildRelation)null);
				return;
			case FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY:
				setSimpleMandatory((Simple)null);
				return;
			case FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL:
				setSimpleOptional((Simple)null);
				return;
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				setFeaturegroup((FeatureGroup)null);
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
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				return childrelation != null;
			case FeatureObjectivePackage.FEATURE__SIMPLE_MANDATORY:
				return simpleMandatory != null;
			case FeatureObjectivePackage.FEATURE__SIMPLE_OPTIONAL:
				return simpleOptional != null;
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				return featuregroup != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
