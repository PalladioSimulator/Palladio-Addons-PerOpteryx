/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.*;

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
public class QualitypropertiesFactoryImpl extends EFactoryImpl implements QualitypropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualitypropertiesFactory init() {
		try {
			QualitypropertiesFactory theQualitypropertiesFactory = (QualitypropertiesFactory)EPackage.Registry.INSTANCE.getEFactory(QualitypropertiesPackage.eNS_URI);
			if (theQualitypropertiesFactory != null) {
				return theQualitypropertiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualitypropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypropertiesFactoryImpl() {
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
			case QualitypropertiesPackage.CONFIDENCE_INTERVAL: return createConfidenceInterval();
			case QualitypropertiesPackage.ELEMENT_QUALITY_PROPERTY: return createElementQualityProperty();
			case QualitypropertiesPackage.INTEGER_QUALITY_PROPERTY: return createIntegerQualityProperty();
			case QualitypropertiesPackage.DOUBLE_QUALITY_PROPERTY: return createDoubleQualityProperty();
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
	public QualitypropertiesPackage getQualitypropertiesPackage() {
		return (QualitypropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualitypropertiesPackage getPackage() {
		return QualitypropertiesPackage.eINSTANCE;
	}

} //QualitypropertiesFactoryImpl
