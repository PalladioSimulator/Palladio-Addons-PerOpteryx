/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set Literal</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.SetLiteralImpl#getValues <em>
 * Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetLiteralImpl extends ValueLiteralImpl implements SetLiteral {
    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<Element> values;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SetLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.SET_LITERAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Element> getValues() {
        if (this.values == null)
        {
            this.values = new EObjectResolvingEList<Element>(Element.class, this,
                    QMLContractPackage.SET_LITERAL__VALUES);
        }
        return this.values;
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
        case QMLContractPackage.SET_LITERAL__VALUES:
            return this.getValues();
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
        case QMLContractPackage.SET_LITERAL__VALUES:
            this.getValues().clear();
            this.getValues().addAll((Collection<? extends Element>) newValue);
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
        case QMLContractPackage.SET_LITERAL__VALUES:
            this.getValues().clear();
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
        case QMLContractPackage.SET_LITERAL__VALUES:
            return this.values != null && !this.values.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SetLiteralImpl
