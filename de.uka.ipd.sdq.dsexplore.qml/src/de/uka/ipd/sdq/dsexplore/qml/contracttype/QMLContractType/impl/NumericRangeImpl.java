/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util.QMLContractTypeValidator;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Numeric Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.NumericRangeImpl#getLowerLimit
 * <em>Lower Limit</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.NumericRangeImpl#getUpperLimit
 * <em>Upper Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericRangeImpl extends IdentifierImpl implements NumericRange {
    /**
     * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected static final double LOWER_LIMIT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected double lowerLimit = LOWER_LIMIT_EDEFAULT;

    /**
     * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected static final double UPPER_LIMIT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected double upperLimit = UPPER_LIMIT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.NUMERIC_RANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLowerLimit(final double newLowerLimit) {
        final double oldLowerLimit = this.lowerLimit;
        this.lowerLimit = newLowerLimit;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.NUMERIC_RANGE__LOWER_LIMIT,
                    oldLowerLimit, this.lowerLimit));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUpperLimit(final double newUpperLimit) {
        final double oldUpperLimit = this.upperLimit;
        this.upperLimit = newUpperLimit;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.NUMERIC_RANGE__UPPER_LIMIT,
                    oldUpperLimit, this.upperLimit));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #UPPERLIMIT_must_be_greater_than_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>UPPERLIMIT must be greater than LOWERLIMIT</em>}' operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #UPPERLIMIT_must_be_greater_than_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.upperLimit.oclAsType(Real) > self.lowerLimit.oclAsType(Real)";

    /**
     * The cached OCL invariant for the '
     * {@link #UPPERLIMIT_must_be_greater_than_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>UPPERLIMIT must be greater than LOWERLIMIT</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #UPPERLIMIT_must_be_greater_than_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean UPPERLIMIT_must_be_greater_than_LOWERLIMIT(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractTypePackage.Literals.NUMERIC_RANGE);
            try
            {
                UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
                this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractTypeValidator.DIAGNOSTIC_SOURCE,
                                QMLContractTypeValidator.NUMERIC_RANGE__UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "UPPERLIMIT_must_be_greater_than_LOWERLIMIT",
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
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case QMLContractTypePackage.NUMERIC_RANGE__LOWER_LIMIT:
            return this.getLowerLimit();
        case QMLContractTypePackage.NUMERIC_RANGE__UPPER_LIMIT:
            return this.getUpperLimit();
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
        case QMLContractTypePackage.NUMERIC_RANGE__LOWER_LIMIT:
            this.setLowerLimit((Double) newValue);
            return;
        case QMLContractTypePackage.NUMERIC_RANGE__UPPER_LIMIT:
            this.setUpperLimit((Double) newValue);
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
        case QMLContractTypePackage.NUMERIC_RANGE__LOWER_LIMIT:
            this.setLowerLimit(LOWER_LIMIT_EDEFAULT);
            return;
        case QMLContractTypePackage.NUMERIC_RANGE__UPPER_LIMIT:
            this.setUpperLimit(UPPER_LIMIT_EDEFAULT);
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
        case QMLContractTypePackage.NUMERIC_RANGE__LOWER_LIMIT:
            return this.lowerLimit != LOWER_LIMIT_EDEFAULT;
        case QMLContractTypePackage.NUMERIC_RANGE__UPPER_LIMIT:
            return this.upperLimit != UPPER_LIMIT_EDEFAULT;
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
        result.append(" (lowerLimit: ");
        result.append(this.lowerLimit);
        result.append(", upperLimit: ");
        result.append(this.upperLimit);
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

} // NumericRangeImpl
