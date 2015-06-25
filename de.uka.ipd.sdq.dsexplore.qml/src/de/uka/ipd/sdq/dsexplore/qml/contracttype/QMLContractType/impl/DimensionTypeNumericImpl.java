/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumNumericDomain;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util.QMLContractTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dimension Type Numeric</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeNumericImpl#getRange
 * <em>Range</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeNumericImpl#getDomain
 * <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionTypeNumericImpl extends DimensionTypeImpl implements DimensionTypeNumeric {
    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected NumericRange range;

    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final EnumNumericDomain DOMAIN_EDEFAULT = EnumNumericDomain.REAL;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected EnumNumericDomain domain = DOMAIN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DimensionTypeNumericImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.DIMENSION_TYPE_NUMERIC;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericRange getRange() {
        return this.range;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRange(final NumericRange newRange, NotificationChain msgs) {
        final NumericRange oldRange = this.range;
        this.range = newRange;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE, oldRange, newRange);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRange(final NumericRange newRange) {
        if (newRange != this.range)
        {
            NotificationChain msgs = null;
            if (this.range != null) {
                msgs = ((InternalEObject) this.range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE, null, msgs);
            }
            if (newRange != null) {
                msgs = ((InternalEObject) newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE, null, msgs);
            }
            msgs = this.basicSetRange(newRange, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE,
                    newRange, newRange));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EnumNumericDomain getDomain() {
        return this.domain;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDomain(final EnumNumericDomain newDomain) {
        final EnumNumericDomain oldDomain = this.domain;
        this.domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__DOMAIN, oldDomain, this.domain));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>NUMERICDIMENSIONTYPE must have RELATIONSEMANTICS</em>}' operation. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relationSemantics <> null";

    /**
     * The cached OCL invariant for the '
     * {@link #NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>NUMERICDIMENSIONTYPE must have RELATIONSEMANTICS</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractTypePackage.Literals.DIMENSION_TYPE_NUMERIC);
            try
            {
                NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
                .check(this))
        {
            if (diagnostics != null)
            {
                diagnostics
                .add
                (new BasicDiagnostic
                        (
                                Diagnostic.ERROR,
                                QMLContractTypeValidator.DIAGNOSTIC_SOURCE,
                                QMLContractTypeValidator.DIMENSION_TYPE_NUMERIC__NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS",
                                        EObjectValidator.getObjectLabel(this, context) }),
                                        new Object[] { this }));
            }
            return false;
        }
        return true;
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
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE:
            return this.basicSetRange(null, msgs);
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
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE:
            return this.getRange();
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
            return this.getDomain();
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
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE:
            this.setRange((NumericRange) newValue);
            return;
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
            this.setDomain((EnumNumericDomain) newValue);
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
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE:
            this.setRange((NumericRange) null);
            return;
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
            this.setDomain(DOMAIN_EDEFAULT);
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
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__RANGE:
            return this.range != null;
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC__DOMAIN:
            return this.domain != DOMAIN_EDEFAULT;
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
        result.append(" (domain: ");
        result.append(this.domain);
        result.append(')');
        return result.toString();
    }

    /**
     * The cached environment for evaluating OCL expressions. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected static final OCL EOCL_ENV = OCL.newInstance();

} // DimensionTypeNumericImpl
