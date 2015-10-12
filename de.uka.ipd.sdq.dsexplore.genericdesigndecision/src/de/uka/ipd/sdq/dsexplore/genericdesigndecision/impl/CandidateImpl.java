/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.QualityProperty;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl#getQualityProperty <em>Quality Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateImpl extends MinimalEObjectImpl.Container implements Candidate {
	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choices;

	/**
	 * The cached value of the '{@link #getQualityProperty() <em>Quality Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityProperty> qualityProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return genericdesigndecisionPackage.Literals.CANDIDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<Choice>(Choice.class, this, genericdesigndecisionPackage.CANDIDATE__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityProperty> getQualityProperty() {
		if (qualityProperty == null) {
			qualityProperty = new EObjectContainmentEList<QualityProperty>(QualityProperty.class, this, genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY);
		}
		return qualityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATE__CHOICES:
				return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
			case genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				return ((InternalEList<?>)getQualityProperty()).basicRemove(otherEnd, msgs);
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
			case genericdesigndecisionPackage.CANDIDATE__CHOICES:
				return getChoices();
			case genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				return getQualityProperty();
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
			case genericdesigndecisionPackage.CANDIDATE__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends Choice>)newValue);
				return;
			case genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				getQualityProperty().clear();
				getQualityProperty().addAll((Collection<? extends QualityProperty>)newValue);
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
			case genericdesigndecisionPackage.CANDIDATE__CHOICES:
				getChoices().clear();
				return;
			case genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				getQualityProperty().clear();
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
			case genericdesigndecisionPackage.CANDIDATE__CHOICES:
				return choices != null && !choices.isEmpty();
			case genericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				return qualityProperty != null && !qualityProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CandidateImpl
