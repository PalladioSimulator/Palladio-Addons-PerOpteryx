/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty;
import genericdesigndecision.GenericdesigndecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Candidate</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getQualityProperty <em>Quality Property</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getPcmChoices <em>Pcm Choices</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getPcmQualityProperty <em>Pcm Quality Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateImpl extends NamedElementImpl implements Candidate {
	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<genericdesigndecision.Choice> choices;

	/**
	 * The cached value of the '{@link #getQualityProperty() <em>Quality Property</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQualityProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<genericdesigndecision.qualityproperties.QualityProperty> qualityProperty;

	/**
	 * The cached value of the '{@link #getPcmChoices() <em>Pcm Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> pcmChoices;

	/**
	 * The cached value of the '{@link #getPcmQualityProperty() <em>Pcm Quality Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmQualityProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityProperty> pcmQualityProperty;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.CANDIDATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<genericdesigndecision.Choice> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<genericdesigndecision.Choice>(genericdesigndecision.Choice.class,
					this, designdecisionPackage.CANDIDATE__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<genericdesigndecision.qualityproperties.QualityProperty> getQualityProperty() {
		if (qualityProperty == null) {
			qualityProperty = new EObjectContainmentEList<genericdesigndecision.qualityproperties.QualityProperty>(
					genericdesigndecision.qualityproperties.QualityProperty.class, this,
					designdecisionPackage.CANDIDATE__QUALITY_PROPERTY);
		}
		return qualityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Choice> getPcmChoices() {
		if (pcmChoices == null) {
			pcmChoices = new EObjectContainmentEList<Choice>(Choice.class, this,
					designdecisionPackage.CANDIDATE__PCM_CHOICES);
		}
		return pcmChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityProperty> getPcmQualityProperty() {
		if (pcmQualityProperty == null) {
			pcmQualityProperty = new EObjectContainmentEList<QualityProperty>(QualityProperty.class, this,
					designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY);
		}
		return pcmQualityProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATE__CHOICES:
			return ((InternalEList<?>) getChoices()).basicRemove(otherEnd, msgs);
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			return ((InternalEList<?>) getQualityProperty()).basicRemove(otherEnd, msgs);
		case designdecisionPackage.CANDIDATE__PCM_CHOICES:
			return ((InternalEList<?>) getPcmChoices()).basicRemove(otherEnd, msgs);
		case designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY:
			return ((InternalEList<?>) getPcmQualityProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATE__CHOICES:
			return getChoices();
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			return getQualityProperty();
		case designdecisionPackage.CANDIDATE__PCM_CHOICES:
			return getPcmChoices();
		case designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY:
			return getPcmQualityProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATE__CHOICES:
			getChoices().clear();
			getChoices().addAll((Collection<? extends genericdesigndecision.Choice>) newValue);
			return;
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			getQualityProperty().clear();
			getQualityProperty()
					.addAll((Collection<? extends genericdesigndecision.qualityproperties.QualityProperty>) newValue);
			return;
		case designdecisionPackage.CANDIDATE__PCM_CHOICES:
			getPcmChoices().clear();
			getPcmChoices().addAll((Collection<? extends Choice>) newValue);
			return;
		case designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY:
			getPcmQualityProperty().clear();
			getPcmQualityProperty().addAll((Collection<? extends QualityProperty>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATE__CHOICES:
			getChoices().clear();
			return;
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			getQualityProperty().clear();
			return;
		case designdecisionPackage.CANDIDATE__PCM_CHOICES:
			getPcmChoices().clear();
			return;
		case designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY:
			getPcmQualityProperty().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATE__CHOICES:
			return choices != null && !choices.isEmpty();
		case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
			return qualityProperty != null && !qualityProperty.isEmpty();
		case designdecisionPackage.CANDIDATE__PCM_CHOICES:
			return pcmChoices != null && !pcmChoices.isEmpty();
		case designdecisionPackage.CANDIDATE__PCM_QUALITY_PROPERTY:
			return pcmQualityProperty != null && !pcmQualityProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.Candidate.class) {
			switch (derivedFeatureID) {
			case designdecisionPackage.CANDIDATE__CHOICES:
				return GenericdesigndecisionPackage.CANDIDATE__CHOICES;
			case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				return GenericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.Candidate.class) {
			switch (baseFeatureID) {
			case GenericdesigndecisionPackage.CANDIDATE__CHOICES:
				return designdecisionPackage.CANDIDATE__CHOICES;
			case GenericdesigndecisionPackage.CANDIDATE__QUALITY_PROPERTY:
				return designdecisionPackage.CANDIDATE__QUALITY_PROPERTY;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // CandidateImpl
