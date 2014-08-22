/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of Cores As Range Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl#getProcessingresourcetype <em>Processingresourcetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberOfCoresAsRangeDegreeImpl extends DiscreteRangeDegreeImpl implements NumberOfCoresAsRangeDegree {
	/**
	 * The cached value of the '{@link #getProcessingresourcetype() <em>Processingresourcetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingresourcetype()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType processingresourcetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfCoresAsRangeDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.NUMBER_OF_CORES_AS_RANGE_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType getProcessingresourcetype() {
		if (processingresourcetype != null && ((EObject)processingresourcetype).eIsProxy()) {
			InternalEObject oldProcessingresourcetype = (InternalEObject)processingresourcetype;
			processingresourcetype = (ProcessingResourceType)eResolveProxy(oldProcessingresourcetype);
			if (processingresourcetype != oldProcessingresourcetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype, processingresourcetype));
			}
		}
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetProcessingresourcetype() {
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingresourcetype(ProcessingResourceType newProcessingresourcetype) {
		ProcessingResourceType oldProcessingresourcetype = processingresourcetype;
		processingresourcetype = newProcessingresourcetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype, processingresourcetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE:
				if (resolve) return getProcessingresourcetype();
				return basicGetProcessingresourcetype();
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
			case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE:
				setProcessingresourcetype((ProcessingResourceType)newValue);
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
			case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE:
				setProcessingresourcetype((ProcessingResourceType)null);
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
			case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE:
				return processingresourcetype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (derivedFeatureID) {
				case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE: return specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;
				default: return -1;
			}
		}
		if (baseClass == NumberOfCoresDegree.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (baseFeatureID) {
				case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE: return specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE;
				default: return -1;
			}
		}
		if (baseClass == NumberOfCoresDegree.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NumberOfCoresAsRangeDegreeImpl
