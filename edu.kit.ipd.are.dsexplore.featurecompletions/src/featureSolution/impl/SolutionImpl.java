/**
 */
package featureSolution.impl;

import FeatureCompletionModel.impl.DescribedElementImpl;

import featureSolution.FeatureSolutionPackage;
import featureSolution.InclusionMechanism;
import featureSolution.Solution;
import featureSolution.SolutionComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.SolutionImpl#getInclusionInstructions <em>Inclusion Instructions</em>}</li>
 *   <li>{@link featureSolution.impl.SolutionImpl#getSolutionComponents <em>Solution Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends DescribedElementImpl implements Solution {
	/**
	 * The cached value of the '{@link #getInclusionInstructions() <em>Inclusion Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusionInstructions()
	 * @generated
	 * @ordered
	 */
	protected InclusionMechanism inclusionInstructions;

	/**
	 * The cached value of the '{@link #getSolutionComponents() <em>Solution Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionComponents()
	 * @generated
	 * @ordered
	 */
	protected EList solutionComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionMechanism getInclusionInstructions() {
		return inclusionInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusionInstructions(InclusionMechanism newInclusionInstructions, NotificationChain msgs) {
		InclusionMechanism oldInclusionInstructions = inclusionInstructions;
		inclusionInstructions = newInclusionInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS, oldInclusionInstructions, newInclusionInstructions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusionInstructions(InclusionMechanism newInclusionInstructions) {
		if (newInclusionInstructions != inclusionInstructions) {
			NotificationChain msgs = null;
			if (inclusionInstructions != null)
				msgs = ((InternalEObject)inclusionInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS, null, msgs);
			if (newInclusionInstructions != null)
				msgs = ((InternalEObject)newInclusionInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS, null, msgs);
			msgs = basicSetInclusionInstructions(newInclusionInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS, newInclusionInstructions, newInclusionInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSolutionComponents() {
		if (solutionComponents == null) {
			solutionComponents = new EObjectResolvingEList(SolutionComponent.class, this, FeatureSolutionPackage.SOLUTION__SOLUTION_COMPONENTS);
		}
		return solutionComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS:
				return basicSetInclusionInstructions(null, msgs);
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
			case FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS:
				return getInclusionInstructions();
			case FeatureSolutionPackage.SOLUTION__SOLUTION_COMPONENTS:
				return getSolutionComponents();
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
			case FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS:
				setInclusionInstructions((InclusionMechanism)newValue);
				return;
			case FeatureSolutionPackage.SOLUTION__SOLUTION_COMPONENTS:
				getSolutionComponents().clear();
				getSolutionComponents().addAll((Collection)newValue);
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
			case FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS:
				setInclusionInstructions((InclusionMechanism)null);
				return;
			case FeatureSolutionPackage.SOLUTION__SOLUTION_COMPONENTS:
				getSolutionComponents().clear();
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
			case FeatureSolutionPackage.SOLUTION__INCLUSION_INSTRUCTIONS:
				return inclusionInstructions != null;
			case FeatureSolutionPackage.SOLUTION__SOLUTION_COMPONENTS:
				return solutionComponents != null && !solutionComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
