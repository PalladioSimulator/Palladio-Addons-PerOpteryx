/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.stochasticexpressions.parser.MyPCMStoExLexer;
import org.palladiosimulator.pcm.stochasticexpressions.parser.MyPCMStoExParser;

import de.uka.ipd.sdq.pcm.cost.ScalarFunction;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.Term;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scalar Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ScalarFunctionImpl#getSpecification <em>Specification
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ScalarFunctionImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalarFunctionImpl extends EObjectImpl implements ScalarFunction {
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
    protected ScalarFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return costPackage.Literals.SCALAR_FUNCTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getSpecification() {
        return this.specification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSpecification(final String newSpecification) {
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
    public Term getTerm() {
        final Term term = this.basicGetTerm();
        return term != null && ((EObject) term).eIsProxy() ? (Term) this.eResolveProxy((InternalEObject) term) : term;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public Term basicGetTerm() {
        if (this.specification == null) {
            return null;
        }
        final MyPCMStoExLexer lexer = new MyPCMStoExLexer(new ANTLRStringStream(this.getSpecification()));
        final MyPCMStoExParser parser = new MyPCMStoExParser(new CommonTokenStream(lexer));
        Expression e;
        try {
            e = parser.expression();
        } catch (final RecognitionException e1) {
            return null;
        }
        if (parser.hasErrors()) {
            return null;
        }

        if (e instanceof Term) {
            return (Term) e;
        }

        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public boolean isSetTerm() {
        return this.basicGetTerm() != null;
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
    public void eSet(final int featureID, final Object newValue) {
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
    public void eUnset(final int featureID) {
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
    public boolean eIsSet(final int featureID) {
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
    public String toString() {
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
