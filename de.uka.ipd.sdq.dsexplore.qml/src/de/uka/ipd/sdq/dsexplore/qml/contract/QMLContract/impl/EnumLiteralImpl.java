/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.EnumLiteralImpl#getValue <em>
 * Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumLiteralImpl extends ValueLiteralImpl implements EnumLiteral {
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Element value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EnumLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.ENUM_LITERAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Element getValue() {
        if (this.value != null && this.value.eIsProxy())
        {
            final InternalEObject oldValue = (InternalEObject) this.value;
            this.value = (Element) this.eResolveProxy(oldValue);
            if (this.value != oldValue)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLContractPackage.ENUM_LITERAL__VALUE,
                            oldValue, this.value));
                }
            }
        }
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Element basicGetValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final Element newValue) {
        final Element oldValue = this.value;
        this.value = newValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractPackage.ENUM_LITERAL__VALUE,
                    oldValue,
                    this.value));
        }
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
        case QMLContractPackage.ENUM_LITERAL__VALUE:
            if (resolve) {
                return this.getValue();
            }
            return this.basicGetValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case QMLContractPackage.ENUM_LITERAL__VALUE:
            this.setValue((Element) newValue);
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
        case QMLContractPackage.ENUM_LITERAL__VALUE:
            this.setValue((Element) null);
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
        case QMLContractPackage.ENUM_LITERAL__VALUE:
            return this.value != null;
        }
        return super.eIsSet(featureID);
    }

} // EnumLiteralImpl
