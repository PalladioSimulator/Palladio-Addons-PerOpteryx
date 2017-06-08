/**
 */
package concernStrategy.impl;

import concernStrategy.Attribute;
import concernStrategy.ChildRelation;
import concernStrategy.Feature;
import concernStrategy.FeatureGroup;
import concernStrategy.Simple;
import concernStrategy.StrategymodelPackage;

import concernStrategy.util.StrategymodelValidator;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link concernStrategy.impl.FeatureImpl#getChildrelation <em>Childrelation</em>}</li>
 *   <li>{@link concernStrategy.impl.FeatureImpl#getSimpleMandatory <em>Simple Mandatory</em>}</li>
 *   <li>{@link concernStrategy.impl.FeatureImpl#getSimpleOptional <em>Simple Optional</em>}</li>
 *   <li>{@link concernStrategy.impl.FeatureImpl#getFeaturegroup <em>Featuregroup</em>}</li>
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
		return StrategymodelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(Attribute.class, this, StrategymodelPackage.FEATURE__ATTRIBUTES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StrategymodelPackage.FEATURE__CHILDRELATION, oldChildrelation, newChildrelation);
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
				msgs = ((InternalEObject)childrelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StrategymodelPackage.FEATURE__CHILDRELATION, null, msgs);
			if (newChildrelation != null)
				msgs = ((InternalEObject)newChildrelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StrategymodelPackage.FEATURE__CHILDRELATION, null, msgs);
			msgs = basicSetChildrelation(newChildrelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategymodelPackage.FEATURE__CHILDRELATION, newChildrelation, newChildrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple getSimpleMandatory() {
		if (eContainerFeatureID() != StrategymodelPackage.FEATURE__SIMPLE_MANDATORY) return null;
		return (Simple)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleMandatory(Simple newSimpleMandatory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSimpleMandatory, StrategymodelPackage.FEATURE__SIMPLE_MANDATORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleMandatory(Simple newSimpleMandatory) {
		if (newSimpleMandatory != eInternalContainer() || (eContainerFeatureID() != StrategymodelPackage.FEATURE__SIMPLE_MANDATORY && newSimpleMandatory != null)) {
			if (EcoreUtil.isAncestor(this, newSimpleMandatory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSimpleMandatory != null)
				msgs = ((InternalEObject)newSimpleMandatory).eInverseAdd(this, StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN, Simple.class, msgs);
			msgs = basicSetSimpleMandatory(newSimpleMandatory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategymodelPackage.FEATURE__SIMPLE_MANDATORY, newSimpleMandatory, newSimpleMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple getSimpleOptional() {
		if (eContainerFeatureID() != StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL) return null;
		return (Simple)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleOptional(Simple newSimpleOptional, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSimpleOptional, StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleOptional(Simple newSimpleOptional) {
		if (newSimpleOptional != eInternalContainer() || (eContainerFeatureID() != StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL && newSimpleOptional != null)) {
			if (EcoreUtil.isAncestor(this, newSimpleOptional))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSimpleOptional != null)
				msgs = ((InternalEObject)newSimpleOptional).eInverseAdd(this, StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN, Simple.class, msgs);
			msgs = basicSetSimpleOptional(newSimpleOptional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL, newSimpleOptional, newSimpleOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getFeaturegroup() {
		if (eContainerFeatureID() != StrategymodelPackage.FEATURE__FEATUREGROUP) return null;
		return (FeatureGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturegroup(FeatureGroup newFeaturegroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeaturegroup, StrategymodelPackage.FEATURE__FEATUREGROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturegroup(FeatureGroup newFeaturegroup) {
		if (newFeaturegroup != eInternalContainer() || (eContainerFeatureID() != StrategymodelPackage.FEATURE__FEATUREGROUP && newFeaturegroup != null)) {
			if (EcoreUtil.isAncestor(this, newFeaturegroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeaturegroup != null)
				msgs = ((InternalEObject)newFeaturegroup).eInverseAdd(this, StrategymodelPackage.FEATURE_GROUP__CHILDREN, FeatureGroup.class, msgs);
			msgs = basicSetFeaturegroup(newFeaturegroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StrategymodelPackage.FEATURE__FEATUREGROUP, newFeaturegroup, newFeaturegroup));
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
						 StrategymodelValidator.DIAGNOSTIC_SOURCE,
						 StrategymodelValidator.FEATURE__EACH_ATTRIBUTE_NAME_DEFINED_JUST_ONCE,
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSimpleMandatory((Simple)otherEnd, msgs);
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSimpleOptional((Simple)otherEnd, msgs);
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFeaturegroup((FeatureGroup)otherEnd, msgs);
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
			case StrategymodelPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case StrategymodelPackage.FEATURE__CHILDRELATION:
				return basicSetChildrelation(null, msgs);
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				return basicSetSimpleMandatory(null, msgs);
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				return basicSetSimpleOptional(null, msgs);
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
				return basicSetFeaturegroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				return eInternalContainer().eInverseRemove(this, StrategymodelPackage.SIMPLE__MANDATORY_CHILDREN, Simple.class, msgs);
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				return eInternalContainer().eInverseRemove(this, StrategymodelPackage.SIMPLE__OPTIONAL_CHILDREN, Simple.class, msgs);
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
				return eInternalContainer().eInverseRemove(this, StrategymodelPackage.FEATURE_GROUP__CHILDREN, FeatureGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StrategymodelPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case StrategymodelPackage.FEATURE__CHILDRELATION:
				return getChildrelation();
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				return getSimpleMandatory();
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				return getSimpleOptional();
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
				return getFeaturegroup();
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
			case StrategymodelPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case StrategymodelPackage.FEATURE__CHILDRELATION:
				setChildrelation((ChildRelation)newValue);
				return;
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				setSimpleMandatory((Simple)newValue);
				return;
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				setSimpleOptional((Simple)newValue);
				return;
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
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
			case StrategymodelPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StrategymodelPackage.FEATURE__CHILDRELATION:
				setChildrelation((ChildRelation)null);
				return;
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				setSimpleMandatory((Simple)null);
				return;
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				setSimpleOptional((Simple)null);
				return;
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
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
			case StrategymodelPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StrategymodelPackage.FEATURE__CHILDRELATION:
				return childrelation != null;
			case StrategymodelPackage.FEATURE__SIMPLE_MANDATORY:
				return getSimpleMandatory() != null;
			case StrategymodelPackage.FEATURE__SIMPLE_OPTIONAL:
				return getSimpleOptional() != null;
			case StrategymodelPackage.FEATURE__FEATUREGROUP:
				return getFeaturegroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
