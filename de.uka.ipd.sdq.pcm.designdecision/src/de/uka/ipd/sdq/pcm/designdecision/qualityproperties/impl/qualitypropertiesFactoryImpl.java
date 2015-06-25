/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class qualitypropertiesFactoryImpl extends EFactoryImpl implements qualitypropertiesFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static qualitypropertiesFactory init() {
        try
        {
            final qualitypropertiesFactory thequalitypropertiesFactory = (qualitypropertiesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(qualitypropertiesPackage.eNS_URI);
            if (thequalitypropertiesFactory != null)
            {
                return thequalitypropertiesFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new qualitypropertiesFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public qualitypropertiesFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case qualitypropertiesPackage.CONFIDENCE_INTERVAL:
            return this.createConfidenceInterval();
        case qualitypropertiesPackage.ELEMENT_QUALITY_PROPERTY:
            return this.createElementQualityProperty();
        case qualitypropertiesPackage.INTEGER_QUALITY_PROPERTY:
            return this.createIntegerQualityProperty();
        case qualitypropertiesPackage.DOUBLE_QUALITY_PROPERTY:
            return this.createDoubleQualityProperty();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ConfidenceInterval createConfidenceInterval() {
        final ConfidenceIntervalImpl confidenceInterval = new ConfidenceIntervalImpl();
        return confidenceInterval;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ElementQualityProperty createElementQualityProperty() {
        final ElementQualityPropertyImpl elementQualityProperty = new ElementQualityPropertyImpl();
        return elementQualityProperty;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public IntegerQualityProperty createIntegerQualityProperty() {
        final IntegerQualityPropertyImpl integerQualityProperty = new IntegerQualityPropertyImpl();
        return integerQualityProperty;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DoubleQualityProperty createDoubleQualityProperty() {
        final DoubleQualityPropertyImpl doubleQualityProperty = new DoubleQualityPropertyImpl();
        return doubleQualityProperty;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public qualitypropertiesPackage getqualitypropertiesPackage() {
        return (qualitypropertiesPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static qualitypropertiesPackage getPackage() {
        return qualitypropertiesPackage.eINSTANCE;
    }

} // qualitypropertiesFactoryImpl
