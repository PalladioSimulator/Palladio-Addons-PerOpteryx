/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class qualitypropertiesFactoryImpl extends EFactoryImpl implements qualitypropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static qualitypropertiesFactory init() {
		try {
			qualitypropertiesFactory thequalitypropertiesFactory = (qualitypropertiesFactory)EPackage.Registry.INSTANCE.getEFactory(qualitypropertiesPackage.eNS_URI);
			if (thequalitypropertiesFactory != null) {
				return thequalitypropertiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new qualitypropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypropertiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case qualitypropertiesPackage.CONFIDENCE_INTERVAL: return createConfidenceInterval();
			case qualitypropertiesPackage.ELEMENT_QUALITY_PROPERTY: return createElementQualityProperty();
			case qualitypropertiesPackage.INTEGER_QUALITY_PROPERTY: return createIntegerQualityProperty();
			case qualitypropertiesPackage.DOUBLE_QUALITY_PROPERTY: return createDoubleQualityProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidenceInterval createConfidenceInterval() {
		ConfidenceIntervalImpl confidenceInterval = new ConfidenceIntervalImpl();
		return confidenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementQualityProperty createElementQualityProperty() {
		ElementQualityPropertyImpl elementQualityProperty = new ElementQualityPropertyImpl();
		return elementQualityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerQualityProperty createIntegerQualityProperty() {
		IntegerQualityPropertyImpl integerQualityProperty = new IntegerQualityPropertyImpl();
		return integerQualityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleQualityProperty createDoubleQualityProperty() {
		DoubleQualityPropertyImpl doubleQualityProperty = new DoubleQualityPropertyImpl();
		return doubleQualityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypropertiesPackage getqualitypropertiesPackage() {
		return (qualitypropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static qualitypropertiesPackage getPackage() {
		return qualitypropertiesPackage.eINSTANCE;
	}

} //qualitypropertiesFactoryImpl
