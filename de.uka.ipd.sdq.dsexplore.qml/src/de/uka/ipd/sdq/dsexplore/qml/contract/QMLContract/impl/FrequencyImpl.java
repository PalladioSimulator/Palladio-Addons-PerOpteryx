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

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Frequency</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.FrequencyImpl#getUpperLimit
 * <em>Upper Limit</em>}</li>
 * <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.FrequencyImpl#getLowerLimit
 * <em>Lower Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrequencyImpl extends StochasticEvaluationAspectImpl implements Frequency {
    /**
     * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUpperLimit()
     * @generated
     * @ordered
     */
    protected RangeValue upperLimit;

    /**
     * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLowerLimit()
     * @generated
     * @ordered
     */
    protected RangeValue lowerLimit;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FrequencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.FREQUENCY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RangeValue getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUpperLimit(final RangeValue newUpperLimit, NotificationChain msgs) {
        final RangeValue oldUpperLimit = this.upperLimit;
        this.upperLimit = newUpperLimit;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.FREQUENCY__UPPER_LIMIT, oldUpperLimit, newUpperLimit);
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
    public void setUpperLimit(final RangeValue newUpperLimit) {
        if (newUpperLimit != this.upperLimit)
        {
            NotificationChain msgs = null;
            if (this.upperLimit != null) {
                msgs = ((InternalEObject) this.upperLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.FREQUENCY__UPPER_LIMIT, null, msgs);
            }
            if (newUpperLimit != null) {
                msgs = ((InternalEObject) newUpperLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.FREQUENCY__UPPER_LIMIT, null, msgs);
            }
            msgs = this.basicSetUpperLimit(newUpperLimit, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractPackage.FREQUENCY__UPPER_LIMIT,
                    newUpperLimit, newUpperLimit));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RangeValue getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLowerLimit(final RangeValue newLowerLimit, NotificationChain msgs) {
        final RangeValue oldLowerLimit = this.lowerLimit;
        this.lowerLimit = newLowerLimit;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.FREQUENCY__LOWER_LIMIT, oldLowerLimit, newLowerLimit);
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
    public void setLowerLimit(final RangeValue newLowerLimit) {
        if (newLowerLimit != this.lowerLimit)
        {
            NotificationChain msgs = null;
            if (this.lowerLimit != null) {
                msgs = ((InternalEObject) this.lowerLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.FREQUENCY__LOWER_LIMIT, null, msgs);
            }
            if (newLowerLimit != null) {
                msgs = ((InternalEObject) newLowerLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - QMLContractPackage.FREQUENCY__LOWER_LIMIT, null, msgs);
            }
            msgs = this.basicSetLowerLimit(newLowerLimit, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractPackage.FREQUENCY__LOWER_LIMIT,
                    newLowerLimit, newLowerLimit));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Range of FREQUENCY must have UPPERLIMIT or LOWERLIMIT</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.lowerLimit <> null) or (self.upperLimit <> null)";

    /**
     * The cached OCL invariant for the '
     * {@link #range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Range of FREQUENCY must have UPPERLIMIT or LOWERLIMIT</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractPackage.Literals.FREQUENCY);
            try
            {
                RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV
                .createQuery(RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
                .check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractValidator.DIAGNOSTIC_SOURCE,
                                QMLContractValidator.FREQUENCY__RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT,
                                EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                        new Object[] { "range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT",
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
        case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
            return this.basicSetUpperLimit(null, msgs);
        case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
            return this.basicSetLowerLimit(null, msgs);
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
        case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
            return this.getUpperLimit();
        case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
            return this.getLowerLimit();
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
        case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
            this.setUpperLimit((RangeValue) newValue);
            return;
        case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
            this.setLowerLimit((RangeValue) newValue);
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
        case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
            this.setUpperLimit((RangeValue) null);
            return;
        case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
            this.setLowerLimit((RangeValue) null);
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
        case QMLContractPackage.FREQUENCY__UPPER_LIMIT:
            return this.upperLimit != null;
        case QMLContractPackage.FREQUENCY__LOWER_LIMIT:
            return this.lowerLimit != null;
        }
        return super.eIsSet(featureID);
    }

} // FrequencyImpl
