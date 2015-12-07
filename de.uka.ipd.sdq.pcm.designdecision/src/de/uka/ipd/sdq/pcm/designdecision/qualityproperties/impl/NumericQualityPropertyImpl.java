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

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numeric Quality Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl#getResultDecoratorRepository <em>Result Decorator Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumericQualityPropertyImpl extends
		genericdesigndecision.qualityproperties.impl.NumericQualityPropertyImpl implements NumericQualityProperty {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			if (resolve)
				return getResultDecoratorRepository();
			return basicGetResultDecoratorRepository();
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
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			setResultDecoratorRepository((ResultDecoratorRepository) newValue);
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
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			setResultDecoratorRepository((ResultDecoratorRepository) null);
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
		case qualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY:
			return resultDecoratorRepository != null;
		}
		return super.eIsSet(featureID);
	}

} // NumericQualityPropertyImpl
