/**
 */
package featureObjective.impl;

import FeatureCompletionModel.impl.DescribedElementImpl;
import featureObjective.Constraint;
import featureObjective.Feature;
import featureObjective.FeatureObjective;
import featureObjective.FeatureObjectivePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getAnnotatableElement <em>Annotatable Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureObjectiveImpl extends DescribedElementImpl implements FeatureObjective {
	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature rootFeature;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList constraints;

	/**
	 * The cached value of the '{@link #getAnnotatableElement() <em>Annotatable Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatableElement()
	 * @generated
	 * @ordered
	 */
	protected EList annotatableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureObjectivePackage.Literals.FEATURE_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFeature(Feature newRootFeature, NotificationChain msgs) {
		Feature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE, oldRootFeature, newRootFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(Feature newRootFeature) {
		if (newRootFeature != rootFeature) {
			NotificationChain msgs = null;
			if (rootFeature != null)
				msgs = ((InternalEObject)rootFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE, null, msgs);
			if (newRootFeature != null)
				msgs = ((InternalEObject)newRootFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE, null, msgs);
			msgs = basicSetRootFeature(newRootFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE, newRootFeature, newRootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList(Constraint.class, this, FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAnnotatableElement() {
		if (annotatableElement == null) {
			annotatableElement = new EObjectResolvingEList(EObject.class, this, FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT);
		}
		return annotatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE:
				return basicSetRootFeature(null, msgs);
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				return ((InternalEList)getConstraints()).basicRemove(otherEnd, msgs);
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE:
				return getRootFeature();
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				return getConstraints();
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				return getAnnotatableElement();
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE:
				setRootFeature((Feature)newValue);
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection)newValue);
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				getAnnotatableElement().clear();
				getAnnotatableElement().addAll((Collection)newValue);
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE:
				setRootFeature((Feature)null);
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				getAnnotatableElement().clear();
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ROOT_FEATURE:
				return rootFeature != null;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				return annotatableElement != null && !annotatableElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureObjectiveImpl
