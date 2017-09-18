/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ConcernDegreeImpl#getFeatureDiagram <em>Feature Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernDegreeImpl extends ClassAsReferenceDegreeImpl implements ConcernDegree {
	/**
	 * The cached value of the '{@link #getFeatureDiagram() <em>Feature Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDiagram()
	 * @generated
	 * @ordered
	 */
	protected EObject featureDiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.CONCERN_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getFeatureDiagram() {
		if (featureDiagram != null && featureDiagram.eIsProxy()) {
			InternalEObject oldFeatureDiagram = (InternalEObject) featureDiagram;
			featureDiagram = eResolveProxy(oldFeatureDiagram);
			if (featureDiagram != oldFeatureDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM, oldFeatureDiagram, featureDiagram));
			}
		}
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetFeatureDiagram() {
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureDiagram(EObject newFeatureDiagram) {
		EObject oldFeatureDiagram = featureDiagram;
		featureDiagram = newFeatureDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM, oldFeatureDiagram, featureDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM:
			if (resolve)
				return getFeatureDiagram();
			return basicGetFeatureDiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM:
			setFeatureDiagram((EObject) newValue);
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
		case specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM:
			setFeatureDiagram((EObject) null);
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
		case specificPackage.CONCERN_DEGREE__FEATURE_DIAGRAM:
			return featureDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //ConcernDegreeImpl
