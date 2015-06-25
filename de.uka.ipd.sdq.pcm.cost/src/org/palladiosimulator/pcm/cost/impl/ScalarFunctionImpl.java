/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.cost.ScalarFunction;
import org.palladiosimulator.pcm.cost.costPackage;

import de.uka.ipd.sdq.stoex.Term;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scalar Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.ScalarFunctionImpl#getSpecification <em>
 * Specification</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.ScalarFunctionImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalarFunctionImpl extends EObjectImpl implements ScalarFunction
{
    /**
     * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected static final String SPECIFICATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected String specification = SPECIFICATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ScalarFunctionImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return costPackage.Literals.SCALAR_FUNCTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getSpecification()
    {
        return this.specification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSpecification(final String newSpecification)
    {
        final String oldSpecification = this.specification;
        this.specification = newSpecification;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, costPackage.SCALAR_FUNCTION__SPECIFICATION,
                    oldSpecification, this.specification));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Term getTerm()
    {
        final Term term = this.basicGetTerm();
        return term != null && ((EObject) term).eIsProxy() ? (Term) this.eResolveProxy((InternalEObject) term) : term;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Term basicGetTerm()
    {
        // TODO: implement this method to return the 'Term' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetTerm()
    {
        // TODO: implement this method to return whether the 'Term' reference is set
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
    {
        switch (featureID)
        {
        case costPackage.SCALAR_FUNCTION__SPECIFICATION:
            return this.getSpecification();
        case costPackage.SCALAR_FUNCTION__TERM:
            if (resolve) {
                return this.getTerm();
            }
            return this.basicGetTerm();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue)
    {
        switch (featureID)
        {
        case costPackage.SCALAR_FUNCTION__SPECIFICATION:
            this.setSpecification((String) newValue);
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
    public void eUnset(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.SCALAR_FUNCTION__SPECIFICATION:
            this.setSpecification(SPECIFICATION_EDEFAULT);
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
    public boolean eIsSet(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.SCALAR_FUNCTION__SPECIFICATION:
            return SPECIFICATION_EDEFAULT == null ? this.specification != null : !SPECIFICATION_EDEFAULT
            .equals(this.specification);
        case costPackage.SCALAR_FUNCTION__TERM:
            return this.isSetTerm();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString()
    {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (specification: ");
        result.append(this.specification);
        result.append(')');
        return result.toString();
    }

} // ScalarFunctionImpl
