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

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Decision Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DecisionSpaceImpl#getDegreesOfFreedom <em>
 * Degrees Of Freedom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionSpaceImpl extends NamedElementImpl implements DecisionSpace {
    /**
     * The cached value of the '{@link #getDegreesOfFreedom() <em>Degrees Of Freedom</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDegreesOfFreedom()
     * @generated
     * @ordered
     */
    protected EList<DegreeOfFreedomInstance> degreesOfFreedom;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DecisionSpaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.DECISION_SPACE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<DegreeOfFreedomInstance> getDegreesOfFreedom() {
        if (this.degreesOfFreedom == null)
        {
            this.degreesOfFreedom = new EObjectContainmentEList<DegreeOfFreedomInstance>(DegreeOfFreedomInstance.class,
                    this, designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM);
        }
        return this.degreesOfFreedom;
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
        case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
            return ((InternalEList<?>) this.getDegreesOfFreedom()).basicRemove(otherEnd, msgs);
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
        case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
            return this.getDegreesOfFreedom();
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
        case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
            this.getDegreesOfFreedom().clear();
            this.getDegreesOfFreedom().addAll((Collection<? extends DegreeOfFreedomInstance>) newValue);
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
        case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
            this.getDegreesOfFreedom().clear();
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
        case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
            return this.degreesOfFreedom != null && !this.degreesOfFreedom.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DecisionSpaceImpl
