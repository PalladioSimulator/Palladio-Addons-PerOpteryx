/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.ArchitectureConstraints;
import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;

import featureObjective.FeatureObjective;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.FeatureCompletionImpl#getFeatureObjectives <em>Feature Objectives</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.FeatureCompletionImpl#getCompletionComponents <em>Completion Components</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.FeatureCompletionImpl#getComplementa <em>Complementa</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.FeatureCompletionImpl#getArchitectureConstraints <em>Architecture Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureCompletionImpl extends DescribedElementImpl implements FeatureCompletion {
	/**
	 * The cached value of the '{@link #getFeatureObjectives() <em>Feature Objectives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureObjectives()
	 * @generated
	 * @ordered
	 */
	protected FeatureObjective featureObjectives;

	/**
	 * The cached value of the '{@link #getCompletionComponents() <em>Completion Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompletionComponent> completionComponents;

	/**
	 * The cached value of the '{@link #getComplementa() <em>Complementa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementa()
	 * @generated
	 * @ordered
	 */
	protected EList<Complementum> complementa;

	/**
	 * The cached value of the '{@link #getArchitectureConstraints() <em>Architecture Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureConstraints> architectureConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCompletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.FEATURE_COMPLETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjective getFeatureObjectives() {
		if (featureObjectives != null && featureObjectives.eIsProxy()) {
			InternalEObject oldFeatureObjectives = (InternalEObject)featureObjectives;
			featureObjectives = (FeatureObjective)eResolveProxy(oldFeatureObjectives);
			if (featureObjectives != oldFeatureObjectives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES, oldFeatureObjectives, featureObjectives));
			}
		}
		return featureObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjective basicGetFeatureObjectives() {
		return featureObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureObjectives(FeatureObjective newFeatureObjectives) {
		FeatureObjective oldFeatureObjectives = featureObjectives;
		featureObjectives = newFeatureObjectives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES, oldFeatureObjectives, featureObjectives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompletionComponent> getCompletionComponents() {
		if (completionComponents == null) {
			completionComponents = new EObjectContainmentEList<CompletionComponent>(CompletionComponent.class, this, FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS);
		}
		return completionComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complementum> getComplementa() {
		if (complementa == null) {
			complementa = new EObjectContainmentEList<Complementum>(Complementum.class, this, FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA);
		}
		return complementa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureConstraints> getArchitectureConstraints() {
		if (architectureConstraints == null) {
			architectureConstraints = new EObjectContainmentEList<ArchitectureConstraints>(ArchitectureConstraints.class, this, FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS);
		}
		return architectureConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS:
				return ((InternalEList<?>)getCompletionComponents()).basicRemove(otherEnd, msgs);
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA:
				return ((InternalEList<?>)getComplementa()).basicRemove(otherEnd, msgs);
			case FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS:
				return ((InternalEList<?>)getArchitectureConstraints()).basicRemove(otherEnd, msgs);
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
			case FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES:
				if (resolve) return getFeatureObjectives();
				return basicGetFeatureObjectives();
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS:
				return getCompletionComponents();
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA:
				return getComplementa();
			case FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS:
				return getArchitectureConstraints();
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
			case FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES:
				setFeatureObjectives((FeatureObjective)newValue);
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS:
				getCompletionComponents().clear();
				getCompletionComponents().addAll((Collection<? extends CompletionComponent>)newValue);
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA:
				getComplementa().clear();
				getComplementa().addAll((Collection<? extends Complementum>)newValue);
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS:
				getArchitectureConstraints().clear();
				getArchitectureConstraints().addAll((Collection<? extends ArchitectureConstraints>)newValue);
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
			case FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES:
				setFeatureObjectives((FeatureObjective)null);
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS:
				getCompletionComponents().clear();
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA:
				getComplementa().clear();
				return;
			case FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS:
				getArchitectureConstraints().clear();
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
			case FeatureCompletionPackage.FEATURE_COMPLETION__FEATURE_OBJECTIVES:
				return featureObjectives != null;
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLETION_COMPONENTS:
				return completionComponents != null && !completionComponents.isEmpty();
			case FeatureCompletionPackage.FEATURE_COMPLETION__COMPLEMENTA:
				return complementa != null && !complementa.isEmpty();
			case FeatureCompletionPackage.FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS:
				return architectureConstraints != null && !architectureConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureCompletionImpl
