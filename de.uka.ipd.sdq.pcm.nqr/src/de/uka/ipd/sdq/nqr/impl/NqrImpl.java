/**
 */
package de.uka.ipd.sdq.nqr.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.nqr.NqrPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.nqr.impl.NqrImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.nqr.impl.NqrImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NqrImpl extends MinimalEObjectImpl.Container implements Nqr {
	/**
	 * The cached value of the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent annotatedElement;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criterion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NqrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NqrPackage.Literals.NQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getAnnotatedElement() {
		if (annotatedElement != null && ((EObject)annotatedElement).eIsProxy()) {
			InternalEObject oldAnnotatedElement = (InternalEObject)annotatedElement;
			annotatedElement = (RepositoryComponent)eResolveProxy(oldAnnotatedElement);
			if (annotatedElement != oldAnnotatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NqrPackage.NQR__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetAnnotatedElement() {
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedElement(RepositoryComponent newAnnotatedElement) {
		RepositoryComponent oldAnnotatedElement = annotatedElement;
		annotatedElement = newAnnotatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NqrPackage.NQR__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criterion> getCriterion() {
		if (criterion == null) {
			criterion = new EObjectContainmentEList<Criterion>(Criterion.class, this, NqrPackage.NQR__CRITERION);
		}
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NqrPackage.NQR__CRITERION:
				return ((InternalEList<?>)getCriterion()).basicRemove(otherEnd, msgs);
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
			case NqrPackage.NQR__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case NqrPackage.NQR__CRITERION:
				return getCriterion();
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
			case NqrPackage.NQR__ANNOTATED_ELEMENT:
				setAnnotatedElement((RepositoryComponent)newValue);
				return;
			case NqrPackage.NQR__CRITERION:
				getCriterion().clear();
				getCriterion().addAll((Collection<? extends Criterion>)newValue);
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
			case NqrPackage.NQR__ANNOTATED_ELEMENT:
				setAnnotatedElement((RepositoryComponent)null);
				return;
			case NqrPackage.NQR__CRITERION:
				getCriterion().clear();
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
			case NqrPackage.NQR__ANNOTATED_ELEMENT:
				return annotatedElement != null;
			case NqrPackage.NQR__CRITERION:
				return criterion != null && !criterion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NqrImpl
