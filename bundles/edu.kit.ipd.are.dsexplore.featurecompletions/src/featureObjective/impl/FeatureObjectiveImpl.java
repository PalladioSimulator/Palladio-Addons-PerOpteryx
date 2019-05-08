/**
 */
package featureObjective.impl;

import FeatureCompletionModel.impl.DescribedElementImpl;

import featureObjective.Constraint;
import featureObjective.FeatureGroup;
import featureObjective.FeatureObjective;
import featureObjective.FeatureObjectivePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getFeatureGroups <em>Feature Groups</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featureObjective.impl.FeatureObjectiveImpl#getAnnotatableElement <em>Annotatable Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureObjectiveImpl extends DescribedElementImpl implements FeatureObjective {
	/**
	 * The cached value of the '{@link #getFeatureGroups() <em>Feature Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroup> featureGroups;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getAnnotatableElement() <em>Annotatable Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatableElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> annotatableElement;

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
	@Override
	protected EClass eStaticClass() {
		return FeatureObjectivePackage.Literals.FEATURE_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureGroup> getFeatureGroups() {
		if (featureGroups == null) {
			featureGroups = new EObjectContainmentEList<FeatureGroup>(FeatureGroup.class, this, FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS);
		}
		return featureGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAnnotatableElement() {
		if (annotatableElement == null) {
			annotatableElement = new EObjectResolvingEList<EObject>(EObject.class, this, FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT);
		}
		return annotatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS:
				return ((InternalEList<?>)getFeatureGroups()).basicRemove(otherEnd, msgs);
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS:
				return getFeatureGroups();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS:
				getFeatureGroups().clear();
				getFeatureGroups().addAll((Collection<? extends FeatureGroup>)newValue);
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				getAnnotatableElement().clear();
				getAnnotatableElement().addAll((Collection<? extends EObject>)newValue);
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS:
				getFeatureGroups().clear();
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__FEATURE_GROUPS:
				return featureGroups != null && !featureGroups.isEmpty();
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case FeatureObjectivePackage.FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT:
				return annotatableElement != null && !annotatableElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureObjectiveImpl
