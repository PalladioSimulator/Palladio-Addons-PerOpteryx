/**
 */
package featureSolution.impl;

import FeatureCompletionModel.FeatureCompletion;

import featureSolution.FeatureList;
import featureSolution.FeatureSelection;
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
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.FeatureSelectionImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link featureSolution.impl.FeatureSelectionImpl#getFeatureLists <em>Feature Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureSelectionImpl extends NamedElementImpl implements FeatureSelection {
	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected FeatureCompletion completion;

	/**
	 * The cached value of the '{@link #getFeatureLists() <em>Feature Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLists()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureList> featureLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.FEATURE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletion getCompletion() {
		if (completion != null && completion.eIsProxy()) {
			InternalEObject oldCompletion = (InternalEObject)completion;
			completion = (FeatureCompletion)eResolveProxy(oldCompletion);
			if (completion != oldCompletion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION, oldCompletion, completion));
			}
		}
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletion basicGetCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(FeatureCompletion newCompletion) {
		FeatureCompletion oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION, oldCompletion, completion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureList> getFeatureLists() {
		if (featureLists == null) {
			featureLists = new EObjectContainmentEList<FeatureList>(FeatureList.class, this, FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS);
		}
		return featureLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS:
				return ((InternalEList<?>)getFeatureLists()).basicRemove(otherEnd, msgs);
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
			case FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION:
				if (resolve) return getCompletion();
				return basicGetCompletion();
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS:
				return getFeatureLists();
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
			case FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION:
				setCompletion((FeatureCompletion)newValue);
				return;
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS:
				getFeatureLists().clear();
				getFeatureLists().addAll((Collection<? extends FeatureList>)newValue);
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
			case FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION:
				setCompletion((FeatureCompletion)null);
				return;
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS:
				getFeatureLists().clear();
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
			case FeatureSolutionPackage.FEATURE_SELECTION__COMPLETION:
				return completion != null;
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURE_LISTS:
				return featureLists != null && !featureLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureSelectionImpl
