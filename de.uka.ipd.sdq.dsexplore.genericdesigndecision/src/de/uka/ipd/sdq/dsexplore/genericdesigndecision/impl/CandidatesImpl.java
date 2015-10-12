/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.util.genericdesigndecisionValidator;

import java.lang.reflect.InvocationTargetException;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl#getProblem <em>Problem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidatesImpl extends MinimalEObjectImpl.Container implements Candidates {
	/**
	 * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidate()
	 * @generated
	 * @ordered
	 */
	protected EList<Candidate> candidate;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected DecisionSpace problem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return genericdesigndecisionPackage.Literals.CANDIDATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Candidate> getCandidate() {
		if (candidate == null) {
			candidate = new EObjectContainmentEList<Candidate>(Candidate.class, this, genericdesigndecisionPackage.CANDIDATES__CANDIDATE);
		}
		return candidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject)problem;
			problem = (DecisionSpace)eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, genericdesigndecisionPackage.CANDIDATES__PROBLEM, oldProblem, problem));
			}
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace basicGetProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(DecisionSpace newProblem) {
		DecisionSpace oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, genericdesigndecisionPackage.CANDIDATES__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numberOfChoicesMustEqualNumberOfDecisions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 genericdesigndecisionValidator.DIAGNOSTIC_SOURCE,
						 genericdesigndecisionValidator.CANDIDATES__NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfChoicesMustEqualNumberOfDecisions", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATES__CANDIDATE:
				return ((InternalEList<?>)getCandidate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATES__CANDIDATE:
				return getCandidate();
			case genericdesigndecisionPackage.CANDIDATES__PROBLEM:
				if (resolve) return getProblem();
				return basicGetProblem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATES__CANDIDATE:
				getCandidate().clear();
				getCandidate().addAll((Collection<? extends Candidate>)newValue);
				return;
			case genericdesigndecisionPackage.CANDIDATES__PROBLEM:
				setProblem((DecisionSpace)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATES__CANDIDATE:
				getCandidate().clear();
				return;
			case genericdesigndecisionPackage.CANDIDATES__PROBLEM:
				setProblem((DecisionSpace)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case genericdesigndecisionPackage.CANDIDATES__CANDIDATE:
				return candidate != null && !candidate.isEmpty();
			case genericdesigndecisionPackage.CANDIDATES__PROBLEM:
				return problem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case genericdesigndecisionPackage.CANDIDATES___NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS__DIAGNOSTICCHAIN_MAP:
				return numberOfChoicesMustEqualNumberOfDecisions((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CandidatesImpl
