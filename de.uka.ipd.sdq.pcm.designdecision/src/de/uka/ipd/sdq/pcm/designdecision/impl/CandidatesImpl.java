/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Candidates</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl#getPcmCandidate <em>Pcm Candidate</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.CandidatesImpl#getPcmProblem <em>Pcm Problem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidatesImpl extends genericdesigndecision.impl.CandidatesImpl implements Candidates {
	/**
	 * The cached value of the '{@link #getPcmCandidate() <em>Pcm Candidate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmCandidate()
	 * @generated
	 * @ordered
	 */
	protected EList<Candidate> pcmCandidate;

	/**
	 * The cached value of the '{@link #getPcmProblem() <em>Pcm Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmProblem()
	 * @generated
	 * @ordered
	 */
	protected DecisionSpace pcmProblem;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.CANDIDATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Candidate> getPcmCandidate() {
		if (pcmCandidate == null) {
			pcmCandidate = new EObjectContainmentEList<Candidate>(Candidate.class, this,
					designdecisionPackage.CANDIDATES__PCM_CANDIDATE);
		}
		return pcmCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionSpace getPcmProblem() {
		if (pcmProblem != null && pcmProblem.eIsProxy()) {
			InternalEObject oldPcmProblem = (InternalEObject) pcmProblem;
			pcmProblem = (DecisionSpace) eResolveProxy(oldPcmProblem);
			if (pcmProblem != oldPcmProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							designdecisionPackage.CANDIDATES__PCM_PROBLEM, oldPcmProblem, pcmProblem));
			}
		}
		return pcmProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace basicGetPcmProblem() {
		return pcmProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmProblem(DecisionSpace newPcmProblem) {
		DecisionSpace oldPcmProblem = pcmProblem;
		pcmProblem = newPcmProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.CANDIDATES__PCM_PROBLEM,
					oldPcmProblem, pcmProblem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATES__PCM_CANDIDATE:
			return ((InternalEList<?>) getPcmCandidate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATES__PCM_CANDIDATE:
			return getPcmCandidate();
		case designdecisionPackage.CANDIDATES__PCM_PROBLEM:
			if (resolve)
				return getPcmProblem();
			return basicGetPcmProblem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATES__PCM_CANDIDATE:
			getPcmCandidate().clear();
			getPcmCandidate().addAll((Collection<? extends Candidate>) newValue);
			return;
		case designdecisionPackage.CANDIDATES__PCM_PROBLEM:
			setPcmProblem((DecisionSpace) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATES__PCM_CANDIDATE:
			getPcmCandidate().clear();
			return;
		case designdecisionPackage.CANDIDATES__PCM_PROBLEM:
			setPcmProblem((DecisionSpace) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case designdecisionPackage.CANDIDATES__PCM_CANDIDATE:
			return pcmCandidate != null && !pcmCandidate.isEmpty();
		case designdecisionPackage.CANDIDATES__PCM_PROBLEM:
			return pcmProblem != null;
		}
		return super.eIsSet(featureID);
	}

} // CandidatesImpl
