/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Requirement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.RequirementImpl#getRequireContract
 * <em>Require Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequirementImpl extends IdentifierImpl implements Requirement {
    /**
     * The cached value of the '{@link #getRequireContract() <em>Require Contract</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRequireContract()
     * @generated
     * @ordered
     */
    protected EList<GenericQMLContract> requireContract;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLProfilePackage.Literals.REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<GenericQMLContract> getRequireContract() {
        if (this.requireContract == null)
        {
            this.requireContract = new EObjectResolvingEList<GenericQMLContract>(GenericQMLContract.class, this,
                    QMLProfilePackage.REQUIREMENT__REQUIRE_CONTRACT);
        }
        return this.requireContract;
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
        case QMLProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
            return this.getRequireContract();
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
        case QMLProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
            this.getRequireContract().clear();
            this.getRequireContract().addAll((Collection<? extends GenericQMLContract>) newValue);
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
        case QMLProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
            this.getRequireContract().clear();
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
        case QMLProfilePackage.REQUIREMENT__REQUIRE_CONTRACT:
            return this.requireContract != null && !this.requireContract.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // RequirementImpl
