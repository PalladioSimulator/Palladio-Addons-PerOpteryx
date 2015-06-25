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

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Candidate</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getChoices <em>Choices</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidateImpl#getQualityProperty <em>Quality
 * Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CandidateImpl extends NamedElementImpl implements Candidate {
    /**
     * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChoices()
     * @generated
     * @ordered
     */
    protected EList<Choice> choices;

    /**
     * The cached value of the '{@link #getQualityProperty() <em>Quality Property</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQualityProperty()
     * @generated
     * @ordered
     */
    protected EList<QualityProperty> qualityProperty;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CandidateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.CANDIDATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Choice> getChoices() {
        if (this.choices == null)
        {
            this.choices = new EObjectContainmentEList<Choice>(Choice.class, this,
                    designdecisionPackage.CANDIDATE__CHOICES);
        }
        return this.choices;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<QualityProperty> getQualityProperty() {
        if (this.qualityProperty == null)
        {
            this.qualityProperty = new EObjectContainmentEList<QualityProperty>(QualityProperty.class, this,
                    designdecisionPackage.CANDIDATE__QUALITY_PROPERTY);
        }
        return this.qualityProperty;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case designdecisionPackage.CANDIDATE__CHOICES:
            return ((InternalEList<?>) this.getChoices()).basicRemove(otherEnd, msgs);
        case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
            return ((InternalEList<?>) this.getQualityProperty()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case designdecisionPackage.CANDIDATE__CHOICES:
            return this.getChoices();
        case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
            return this.getQualityProperty();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case designdecisionPackage.CANDIDATE__CHOICES:
            this.getChoices().clear();
            this.getChoices().addAll((Collection<? extends Choice>) newValue);
            return;
        case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
            this.getQualityProperty().clear();
            this.getQualityProperty().addAll((Collection<? extends QualityProperty>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case designdecisionPackage.CANDIDATE__CHOICES:
            this.getChoices().clear();
            return;
        case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
            this.getQualityProperty().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case designdecisionPackage.CANDIDATE__CHOICES:
            return this.choices != null && !this.choices.isEmpty();
        case designdecisionPackage.CANDIDATE__QUALITY_PROPERTY:
            return this.qualityProperty != null && !this.qualityProperty.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CandidateImpl
