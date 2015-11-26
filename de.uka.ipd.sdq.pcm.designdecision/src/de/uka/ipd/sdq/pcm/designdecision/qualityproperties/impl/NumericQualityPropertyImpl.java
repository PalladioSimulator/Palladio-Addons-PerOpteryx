/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numeric Quality Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getConfidenceInterval <em>Confidence Interval</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getResultDecoratorRepository <em>Result Decorator Repository</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getPcmConfidenceInterval <em>Pcm Confidence Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumericQualityPropertyImpl extends QualityPropertyImpl implements NumericQualityProperty {
	/**
	 * The cached value of the '{@link #getConfidenceInterval() <em>Confidence Interval</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConfidenceInterval()
	 * @generated
	 * @ordered
	 */
	protected genericdesigndecision.qualityproperties.ConfidenceInterval confidenceInterval;

	/**
	 * The cached value of the '{@link #getResultDecoratorRepository()
	 * <em>Result Decorator Repository</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getResultDecoratorRepository()
	 * @generated
	 * @ordered
	 */
	protected ResultDecoratorRepository resultDecoratorRepository;

	/**
	 * The cached value of the '{@link #getPcmConfidenceInterval() <em>Pcm Confidence Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmConfidenceInterval()
	 * @generated
	 * @ordered
	 */
	protected ConfidenceInterval pcmConfidenceInterval;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericQualityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return qualitypropertiesPackage.Literals.NUMERIC_QUALITY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultDecoratorRepository getResultDecoratorRepository() {
		if (resultDecoratorRepository != null && resultDecoratorRepository.eIsProxy()) {
			InternalEObject oldResultDecoratorRepository = (InternalEObject) resultDecoratorRepository;
			resultDecoratorRepository = (ResultDecoratorRepository) eResolveProxy(oldResultDecoratorRepository);
			if (resultDecoratorRepository != oldResultDecoratorRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY,
							oldResultDecoratorRepository, resultDecoratorRepository));
			}
		}
		return resultDecoratorRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultDecoratorRepository basicGetResultDecoratorRepository() {
		return resultDecoratorRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDecoratorRepository(ResultDecoratorRepository newResultDecoratorRepository) {
		ResultDecoratorRepository oldResultDecoratorRepository = resultDecoratorRepository;
		resultDecoratorRepository = newResultDecoratorRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY,
					oldResultDecoratorRepository, resultDecoratorRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceInterval getPcmConfidenceInterval() {
		if (pcmConfidenceInterval != null && pcmConfidenceInterval.eIsProxy()) {
			InternalEObject oldPcmConfidenceInterval = (InternalEObject) pcmConfidenceInterval;
			pcmConfidenceInterval = (ConfidenceInterval) eResolveProxy(oldPcmConfidenceInterval);
			if (pcmConfidenceInterval != oldPcmConfidenceInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL,
							oldPcmConfidenceInterval, pcmConfidenceInterval));
			}
		}
		return pcmConfidenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidenceInterval basicGetPcmConfidenceInterval() {
		return pcmConfidenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmConfidenceInterval(ConfidenceInterval newPcmConfidenceInterval) {
		ConfidenceInterval oldPcmConfidenceInterval = pcmConfidenceInterval;
		pcmConfidenceInterval = newPcmConfidenceInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL,
					oldPcmConfidenceInterval, pcmConfidenceInterval));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public genericdesigndecision.qualityproperties.ConfidenceInterval getConfidenceInterval() {
		if (confidenceInterval != null && confidenceInterval.eIsProxy()) {
			InternalEObject oldConfidenceInterval = (InternalEObject) confidenceInterval;
			confidenceInterval = (genericdesigndecision.qualityproperties.ConfidenceInterval) eResolveProxy(
					oldConfidenceInterval);
			if (confidenceInterval != oldConfidenceInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL,
							oldConfidenceInterval, confidenceInterval));
			}
		}
		return confidenceInterval;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecision.qualityproperties.ConfidenceInterval basicGetConfidenceInterval() {
		return confidenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidenceInterval(
			genericdesigndecision.qualityproperties.ConfidenceInterval newConfidenceInterval) {
		genericdesigndecision.qualityproperties.ConfidenceInterval oldConfidenceInterval = confidenceInterval;
		confidenceInterval = newConfidenceInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL, oldConfidenceInterval,
					confidenceInterval));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
			if (resolve)
				return getConfidenceInterval();
			return basicGetConfidenceInterval();
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			if (resolve)
				return getResultDecoratorRepository();
			return basicGetResultDecoratorRepository();
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL:
			if (resolve)
				return getPcmConfidenceInterval();
			return basicGetPcmConfidenceInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
			setConfidenceInterval((genericdesigndecision.qualityproperties.ConfidenceInterval) newValue);
			return;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			setResultDecoratorRepository((ResultDecoratorRepository) newValue);
			return;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL:
			setPcmConfidenceInterval((ConfidenceInterval) newValue);
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
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
			setConfidenceInterval((genericdesigndecision.qualityproperties.ConfidenceInterval) null);
			return;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			setResultDecoratorRepository((ResultDecoratorRepository) null);
			return;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL:
			setPcmConfidenceInterval((ConfidenceInterval) null);
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
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
			return confidenceInterval != null;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			return resultDecoratorRepository != null;
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__PCM_CONFIDENCE_INTERVAL:
			return pcmConfidenceInterval != null;
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
		if (baseClass == genericdesigndecision.qualityproperties.NumericQualityProperty.class) {
			switch (derivedFeatureID) {
			case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
				return QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL;
			default:
				return -1;
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
		if (baseClass == genericdesigndecision.qualityproperties.NumericQualityProperty.class) {
			switch (baseFeatureID) {
			case QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL:
				return qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // NumericQualityPropertyImpl
