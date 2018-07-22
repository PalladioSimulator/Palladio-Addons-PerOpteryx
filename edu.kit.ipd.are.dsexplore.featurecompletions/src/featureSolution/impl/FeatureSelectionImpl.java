/**
 */
package featureSolution.impl;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.FeatureCompletion;

import featureSolution.FeatureSelection;
import featureSolution.FeatureSolutionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link featureSolution.impl.FeatureSelectionImpl#getFeatures <em>Features</em>}</li>
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplementumVisnetis> features;

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
	public EList<ComplementumVisnetis> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<ComplementumVisnetis>(ComplementumVisnetis.class, this, FeatureSolutionPackage.FEATURE_SELECTION__FEATURES);
		}
		return features;
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
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURES:
				return getFeatures();
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
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ComplementumVisnetis>)newValue);
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
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURES:
				getFeatures().clear();
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
			case FeatureSolutionPackage.FEATURE_SELECTION__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureSelectionImpl
