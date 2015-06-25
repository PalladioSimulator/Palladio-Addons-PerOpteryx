/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.util.designdecisionValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Candidates</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl#getCandidate <em>Candidate</em>}
 * </li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl#getProblem <em>Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CandidatesImpl extends EObjectImpl implements Candidates {
    /**
     * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCandidate()
     * @generated
     * @ordered
     */
    protected EList<Candidate> candidate;

    /**
     * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProblem()
     * @generated
     * @ordered
     */
    protected DecisionSpace problem;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CandidatesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.CANDIDATES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Candidate> getCandidate() {
        if (this.candidate == null)
        {
            this.candidate = new EObjectContainmentEList<Candidate>(Candidate.class, this,
                    designdecisionPackage.CANDIDATES__CANDIDATE);
        }
        return this.candidate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DecisionSpace getProblem() {
        if (this.problem != null && this.problem.eIsProxy())
        {
            final InternalEObject oldProblem = (InternalEObject) this.problem;
            this.problem = (DecisionSpace) this.eResolveProxy(oldProblem);
            if (this.problem != oldProblem)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            designdecisionPackage.CANDIDATES__PROBLEM, oldProblem, this.problem));
                }
            }
        }
        return this.problem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public DecisionSpace basicGetProblem() {
        return this.problem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProblem(final DecisionSpace newProblem) {
        final DecisionSpace oldProblem = this.problem;
        this.problem = newProblem;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.CANDIDATES__PROBLEM,
                    oldProblem, this.problem));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean numberOfChoicesMustEqualNumberOfDecisions(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false)
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                designdecisionValidator.DIAGNOSTIC_SOURCE,
                                designdecisionValidator.CANDIDATES__NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "numberOfChoicesMustEqualNumberOfDecisions",
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
        case designdecisionPackage.CANDIDATES__CANDIDATE:
            return ((InternalEList<?>) this.getCandidate()).basicRemove(otherEnd, msgs);
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
        case designdecisionPackage.CANDIDATES__CANDIDATE:
            return this.getCandidate();
        case designdecisionPackage.CANDIDATES__PROBLEM:
            if (resolve) {
                return this.getProblem();
            }
            return this.basicGetProblem();
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
        case designdecisionPackage.CANDIDATES__CANDIDATE:
            this.getCandidate().clear();
            this.getCandidate().addAll((Collection<? extends Candidate>) newValue);
            return;
        case designdecisionPackage.CANDIDATES__PROBLEM:
            this.setProblem((DecisionSpace) newValue);
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
        case designdecisionPackage.CANDIDATES__CANDIDATE:
            this.getCandidate().clear();
            return;
        case designdecisionPackage.CANDIDATES__PROBLEM:
            this.setProblem((DecisionSpace) null);
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
        case designdecisionPackage.CANDIDATES__CANDIDATE:
            return this.candidate != null && !this.candidate.isEmpty();
        case designdecisionPackage.CANDIDATES__PROBLEM:
            return this.problem != null;
        }
        return super.eIsSet(featureID);
    }

} // CandidatesImpl
