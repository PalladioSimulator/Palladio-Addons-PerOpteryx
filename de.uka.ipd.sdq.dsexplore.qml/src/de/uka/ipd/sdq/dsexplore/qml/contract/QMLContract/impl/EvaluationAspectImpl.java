/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

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

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractValidator;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Evaluation Aspect</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.EvaluationAspectImpl#getAspectRequirement
 * <em>Aspect Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvaluationAspectImpl extends IdentifierImpl implements EvaluationAspect {
    /**
     * The cached value of the '{@link #getAspectRequirement() <em>Aspect Requirement</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAspectRequirement()
     * @generated
     * @ordered
     */
    protected AspectRequirement aspectRequirement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EvaluationAspectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.EVALUATION_ASPECT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AspectRequirement getAspectRequirement() {
        return this.aspectRequirement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAspectRequirement(final AspectRequirement newAspectRequirement,
            NotificationChain msgs) {
        final AspectRequirement oldAspectRequirement = this.aspectRequirement;
        this.aspectRequirement = newAspectRequirement;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, oldAspectRequirement,
                    newAspectRequirement);
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
    public void setAspectRequirement(final AspectRequirement newAspectRequirement) {
        if (newAspectRequirement != this.aspectRequirement)
        {
            NotificationChain msgs = null;
            if (this.aspectRequirement != null) {
                msgs = ((InternalEObject) this.aspectRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, null, msgs);
            }
            if (newAspectRequirement != null) {
                msgs = ((InternalEObject) newAspectRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, null, msgs);
            }
            msgs = this.basicSetAspectRequirement(newAspectRequirement, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT, newAspectRequirement,
                    newAspectRequirement));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #FREQUENCY_LIMIT_must_be_NUMERIC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>FREQUENCY LIMIT must be NUMERIC</em>}' operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #FREQUENCY_LIMIT_must_be_NUMERIC(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.oclIsTypeOf(QMLContract::Frequency) implies ("
            +
            "	self.aspectRequirement <> null implies (" +
            "		self.aspectRequirement.aspectRequirementLiteral.oclIsTypeOf(QMLContract::NumericLiteral)" +
            "	)" +
            ")";

    /**
     * The cached OCL invariant for the '
     * {@link #FREQUENCY_LIMIT_must_be_NUMERIC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>FREQUENCY LIMIT must be NUMERIC</em>}' invariant operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #FREQUENCY_LIMIT_must_be_NUMERIC(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean FREQUENCY_LIMIT_must_be_NUMERIC(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractPackage.Literals.EVALUATION_ASPECT);
            try
            {
                FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(FREQUENCY_LIMIT_MUST_BE_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractValidator.DIAGNOSTIC_SOURCE,
                                QMLContractValidator.EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_NUMERIC,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "FREQUENCY_LIMIT_must_be_NUMERIC",
                                                EObjectValidator.getObjectLabel(this, context) }),
                                                new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * The cached OCL expression body for the '
     * {@link #FREQUENCY_LIMIT_must_be_between_0_and_100(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>FREQUENCY LIMIT must be between 0and 100</em>}' operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #FREQUENCY_LIMIT_must_be_between_0_and_100(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.oclIsTypeOf(QMLContract::Frequency) implies ("
            +
            "	self.aspectRequirement <> null implies ("
            +
            "		self.aspectRequirement.aspectRequirementLiteral.oclIsTypeOf(QMLContract::NumericLiteral) implies ("
            +
            "			self.aspectRequirement.aspectRequirementLiteral.oclAsType(QMLContract::NumericLiteral).value.oclAsType(Real) > 0 and"
            +
            "			self.aspectRequirement.aspectRequirementLiteral.oclAsType(QMLContract::NumericLiteral).value.oclAsType(Real) < 100"
            +
            "		)" +
            "	)" +
            ")";

    /**
     * The cached OCL invariant for the '
     * {@link #FREQUENCY_LIMIT_must_be_between_0_and_100(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>FREQUENCY LIMIT must be between 0and 100</em>}' invariant operation. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #FREQUENCY_LIMIT_must_be_between_0_and_100(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean FREQUENCY_LIMIT_must_be_between_0_and_100(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractPackage.Literals.EVALUATION_ASPECT);
            try
            {
                FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractValidator.DIAGNOSTIC_SOURCE,
                                QMLContractValidator.EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "FREQUENCY_LIMIT_must_be_between_0_and_100",
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
        case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
            return this.basicSetAspectRequirement(null, msgs);
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
        case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
            return this.getAspectRequirement();
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
        case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
            this.setAspectRequirement((AspectRequirement) newValue);
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
        case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
            this.setAspectRequirement((AspectRequirement) null);
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
        case QMLContractPackage.EVALUATION_ASPECT__ASPECT_REQUIREMENT:
            return this.aspectRequirement != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * The cached environment for evaluating OCL expressions. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected static final OCL EOCL_ENV = OCL.newInstance();

} // EvaluationAspectImpl
