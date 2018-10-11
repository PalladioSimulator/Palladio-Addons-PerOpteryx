/**
 */
package featureSolution.impl;

import featureSolution.BehaviourInclusion;
import featureSolution.FeatureSolutionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import placementDescription.Advice;
import placementDescription.FeatureSelection;
import placementDescription.Import;
import placementDescription.PointCut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.BehaviourInclusionImpl#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.impl.BehaviourInclusionImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link featureSolution.impl.BehaviourInclusionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link featureSolution.impl.BehaviourInclusionImpl#getFeatureCompletion <em>Feature Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourInclusionImpl extends InclusionMechanismImpl implements BehaviourInclusion {
	/**
	 * The cached value of the '{@link #getPointCut() <em>Point Cut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCut()
	 * @generated
	 * @ordered
	 */
	protected EList<PointCut> pointCut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<Advice> advice;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getFeatureCompletion() <em>Feature Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCompletion()
	 * @generated
	 * @ordered
	 */
	protected FeatureSelection featureCompletion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointCut> getPointCut() {
		if (pointCut == null) {
			pointCut = new EObjectContainmentEList<PointCut>(PointCut.class, this, FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT);
		}
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advice> getAdvice() {
		if (advice == null) {
			advice = new EObjectContainmentEList<Advice>(Advice.class, this, FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE);
		}
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelection getFeatureCompletion() {
		return featureCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCompletion(FeatureSelection newFeatureCompletion, NotificationChain msgs) {
		FeatureSelection oldFeatureCompletion = featureCompletion;
		featureCompletion = newFeatureCompletion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION, oldFeatureCompletion, newFeatureCompletion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCompletion(FeatureSelection newFeatureCompletion) {
		if (newFeatureCompletion != featureCompletion) {
			NotificationChain msgs = null;
			if (featureCompletion != null)
				msgs = ((InternalEObject)featureCompletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION, null, msgs);
			if (newFeatureCompletion != null)
				msgs = ((InternalEObject)newFeatureCompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION, null, msgs);
			msgs = basicSetFeatureCompletion(newFeatureCompletion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION, newFeatureCompletion, newFeatureCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
				return ((InternalEList<?>)getPointCut()).basicRemove(otherEnd, msgs);
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
				return ((InternalEList<?>)getAdvice()).basicRemove(otherEnd, msgs);
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
				return basicSetFeatureCompletion(null, msgs);
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
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
				return getPointCut();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
				return getAdvice();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
				return getImports();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
				return getFeatureCompletion();
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
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
				getPointCut().clear();
				getPointCut().addAll((Collection<? extends PointCut>)newValue);
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
				getAdvice().clear();
				getAdvice().addAll((Collection<? extends Advice>)newValue);
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
				setFeatureCompletion((FeatureSelection)newValue);
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
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
				getPointCut().clear();
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
				getAdvice().clear();
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
				getImports().clear();
				return;
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
				setFeatureCompletion((FeatureSelection)null);
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
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
				return pointCut != null && !pointCut.isEmpty();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
				return advice != null && !advice.isEmpty();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
				return featureCompletion != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviourInclusionImpl
