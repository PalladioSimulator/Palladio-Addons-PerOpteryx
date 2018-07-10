/**
 */
package featureSolution.impl;

import featureSolution.Advice;
import featureSolution.Appearance;
import featureSolution.FeatureSelection;
import featureSolution.FeatureSolutionPackage;
import featureSolution.PointCut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.AdviceImpl#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.impl.AdviceImpl#getAppears <em>Appears</em>}</li>
 *   <li>{@link featureSolution.impl.AdviceImpl#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviceImpl extends NamedElementImpl implements Advice {
	/**
	 * The cached value of the '{@link #getPointCut() <em>Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCut()
	 * @generated
	 * @ordered
	 */
	protected PointCut pointCut;

	/**
	 * The default value of the '{@link #getAppears() <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppears()
	 * @generated
	 * @ordered
	 */
	protected static final Appearance APPEARS_EDEFAULT = Appearance.BEFORE;

	/**
	 * The cached value of the '{@link #getAppears() <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppears()
	 * @generated
	 * @ordered
	 */
	protected Appearance appears = APPEARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected FeatureSelection completion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut getPointCut() {
		if (pointCut != null && pointCut.eIsProxy()) {
			InternalEObject oldPointCut = (InternalEObject)pointCut;
			pointCut = (PointCut)eResolveProxy(oldPointCut);
			if (pointCut != oldPointCut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureSolutionPackage.ADVICE__POINT_CUT, oldPointCut, pointCut));
			}
		}
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut basicGetPointCut() {
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointCut(PointCut newPointCut) {
		PointCut oldPointCut = pointCut;
		pointCut = newPointCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.ADVICE__POINT_CUT, oldPointCut, pointCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance getAppears() {
		return appears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppears(Appearance newAppears) {
		Appearance oldAppears = appears;
		appears = newAppears == null ? APPEARS_EDEFAULT : newAppears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.ADVICE__APPEARS, oldAppears, appears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelection getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletion(FeatureSelection newCompletion, NotificationChain msgs) {
		FeatureSelection oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.ADVICE__COMPLETION, oldCompletion, newCompletion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(FeatureSelection newCompletion) {
		if (newCompletion != completion) {
			NotificationChain msgs = null;
			if (completion != null)
				msgs = ((InternalEObject)completion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.ADVICE__COMPLETION, null, msgs);
			if (newCompletion != null)
				msgs = ((InternalEObject)newCompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.ADVICE__COMPLETION, null, msgs);
			msgs = basicSetCompletion(newCompletion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.ADVICE__COMPLETION, newCompletion, newCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.ADVICE__COMPLETION:
				return basicSetCompletion(null, msgs);
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
			case FeatureSolutionPackage.ADVICE__POINT_CUT:
				if (resolve) return getPointCut();
				return basicGetPointCut();
			case FeatureSolutionPackage.ADVICE__APPEARS:
				return getAppears();
			case FeatureSolutionPackage.ADVICE__COMPLETION:
				return getCompletion();
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
			case FeatureSolutionPackage.ADVICE__POINT_CUT:
				setPointCut((PointCut)newValue);
				return;
			case FeatureSolutionPackage.ADVICE__APPEARS:
				setAppears((Appearance)newValue);
				return;
			case FeatureSolutionPackage.ADVICE__COMPLETION:
				setCompletion((FeatureSelection)newValue);
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
			case FeatureSolutionPackage.ADVICE__POINT_CUT:
				setPointCut((PointCut)null);
				return;
			case FeatureSolutionPackage.ADVICE__APPEARS:
				setAppears(APPEARS_EDEFAULT);
				return;
			case FeatureSolutionPackage.ADVICE__COMPLETION:
				setCompletion((FeatureSelection)null);
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
			case FeatureSolutionPackage.ADVICE__POINT_CUT:
				return pointCut != null;
			case FeatureSolutionPackage.ADVICE__APPEARS:
				return appears != APPEARS_EDEFAULT;
			case FeatureSolutionPackage.ADVICE__COMPLETION:
				return completion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (appears: ");
		result.append(appears);
		result.append(')');
		return result.toString();
	}

} //AdviceImpl
