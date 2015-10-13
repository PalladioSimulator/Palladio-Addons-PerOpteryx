/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Refined QML Contract</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.RefinedQMLContractImpl#getRefinedBy
 * <em>Refined By</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.RefinedQMLContractImpl#getBaseContract
 * <em>Base Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinedQMLContractImpl extends GenericQMLContractImpl implements RefinedQMLContract {
    /**
     * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRefinedBy()
     * @generated
     * @ordered
     */
    protected EList<Criterion> refinedBy;

    /**
     * The cached value of the '{@link #getBaseContract() <em>Base Contract</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBaseContract()
     * @generated
     * @ordered
     */
    protected GenericQMLContract baseContract;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RefinedQMLContractImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractPackage.Literals.REFINED_QML_CONTRACT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Criterion> getRefinedBy() {
        if (this.refinedBy == null)
        {
            this.refinedBy = new EObjectContainmentEList<Criterion>(Criterion.class, this,
                    QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY);
        }
        return this.refinedBy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public GenericQMLContract getBaseContract() {
        if (this.baseContract != null && this.baseContract.eIsProxy())
        {
            final InternalEObject oldBaseContract = (InternalEObject) this.baseContract;
            this.baseContract = (GenericQMLContract) this.eResolveProxy(oldBaseContract);
            if (this.baseContract != oldBaseContract)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT, oldBaseContract, this.baseContract));
                }
            }
        }
        return this.baseContract;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public GenericQMLContract basicGetBaseContract() {
        return this.baseContract;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBaseContract(final GenericQMLContract newBaseContract) {
        final GenericQMLContract oldBaseContract = this.baseContract;
        this.baseContract = newBaseContract;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT, oldBaseContract, this.baseContract));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #contract_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Contract cannot refine itself</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #contract_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.baseContract <> self";

    /**
     * The cached OCL invariant for the '
     * {@link #contract_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Contract cannot refine itself</em>}' invariant operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #contract_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean contract_cannot_refine_itself(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractPackage.Literals.REFINED_QML_CONTRACT);
            try
            {
                CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(CONTRACT_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractValidator.DIAGNOSTIC_SOURCE,
                                QMLContractValidator.REFINED_QML_CONTRACT__CONTRACT_CANNOT_REFINE_ITSELF,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "contract_cannot_refine_itself",
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
        case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
            return ((InternalEList<?>) this.getRefinedBy()).basicRemove(otherEnd, msgs);
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
        case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
            return this.getRefinedBy();
        case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
            if (resolve) {
                return this.getBaseContract();
            }
            return this.basicGetBaseContract();
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
        case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
            this.getRefinedBy().clear();
            this.getRefinedBy().addAll((Collection<? extends Criterion>) newValue);
            return;
        case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
            this.setBaseContract((GenericQMLContract) newValue);
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
        case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
            this.getRefinedBy().clear();
            return;
        case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
            this.setBaseContract((GenericQMLContract) null);
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
        case QMLContractPackage.REFINED_QML_CONTRACT__REFINED_BY:
            return this.refinedBy != null && !this.refinedBy.isEmpty();
        case QMLContractPackage.REFINED_QML_CONTRACT__BASE_CONTRACT:
            return this.baseContract != null;
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

} // RefinedQMLContractImpl
