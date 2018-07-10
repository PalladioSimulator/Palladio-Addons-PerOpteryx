/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface qualitypropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualityproperties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/QualityProperties/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualityproperties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	qualitypropertiesPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.QualityPropertyImpl <em>Quality Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.QualityPropertyImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getQualityProperty()
	 * @generated
	 */
	int QUALITY_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY__QUALITY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Quality Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl <em>Numeric Quality Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getNumericQualityProperty()
	 * @generated
	 */
	int NUMERIC_QUALITY_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY__QUALITY_VALUE = QUALITY_PROPERTY__QUALITY_VALUE;

	/**
	 * The feature id for the '<em><b>Result Decorator Repository</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confidence Interval</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL = QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Quality Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ConfidenceIntervalImpl <em>Confidence Interval</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ConfidenceIntervalImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getConfidenceInterval()
	 * @generated
	 */
	int CONFIDENCE_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Confidence Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL__CONFIDENCE_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL__MEAN = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL__LOWER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Confidence Interval</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ElementQualityPropertyImpl <em>Element Quality Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ElementQualityPropertyImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getElementQualityProperty()
	 * @generated
	 */
	int ELEMENT_QUALITY_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_QUALITY_PROPERTY__QUALITY_VALUE = QUALITY_PROPERTY__QUALITY_VALUE;

	/**
	 * The number of structural features of the '<em>Element Quality Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ELEMENT_QUALITY_PROPERTY_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.IntegerQualityPropertyImpl <em>Integer Quality Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.IntegerQualityPropertyImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getIntegerQualityProperty()
	 * @generated
	 */
	int INTEGER_QUALITY_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUALITY_PROPERTY__QUALITY_VALUE = NUMERIC_QUALITY_PROPERTY__QUALITY_VALUE;

	/**
	 * The feature id for the '<em><b>Result Decorator Repository</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Confidence Interval</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUALITY_PROPERTY__CONFIDENCE_INTERVAL = NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUALITY_PROPERTY__VALUE = NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Quality Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUALITY_PROPERTY_FEATURE_COUNT = NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.DoubleQualityPropertyImpl <em>Double Quality Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.DoubleQualityPropertyImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getDoubleQualityProperty()
	 * @generated
	 */
	int DOUBLE_QUALITY_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUALITY_PROPERTY__QUALITY_VALUE = NUMERIC_QUALITY_PROPERTY__QUALITY_VALUE;

	/**
	 * The feature id for the '<em><b>Result Decorator Repository</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Confidence Interval</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUALITY_PROPERTY__CONFIDENCE_INTERVAL = NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUALITY_PROPERTY__VALUE = NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Quality Property</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUALITY_PROPERTY_FEATURE_COUNT = NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction <em>Quality Prediction</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getQualityPrediction()
	 * @generated
	 */
	int QUALITY_PREDICTION = 5;

	/**
	 * The number of structural features of the '<em>Quality Prediction</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_PREDICTION_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty <em>Numeric Quality Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty
	 * @generated
	 */
	EClass getNumericQualityProperty();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository <em>Result Decorator Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Decorator Repository</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository()
	 * @see #getNumericQualityProperty()
	 * @generated
	 */
	EReference getNumericQualityProperty_ResultDecoratorRepository();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getConfidenceInterval <em>Confidence Interval</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Confidence Interval</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getConfidenceInterval()
	 * @see #getNumericQualityProperty()
	 * @generated
	 */
	EReference getNumericQualityProperty_ConfidenceInterval();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval <em>Confidence Interval</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence Interval</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval
	 * @generated
	 */
	EClass getConfidenceInterval();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getConfidenceLevel <em>Confidence Level</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence Level</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getConfidenceLevel()
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	EAttribute getConfidenceInterval_ConfidenceLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getMean()
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	EAttribute getConfidenceInterval_Mean();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getUpperBound()
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	EAttribute getConfidenceInterval_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ConfidenceInterval#getLowerBound()
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	EAttribute getConfidenceInterval_LowerBound();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty <em>Element Quality Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.ElementQualityProperty
	 * @generated
	 */
	EClass getElementQualityProperty();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty <em>Integer Quality Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty
	 * @generated
	 */
	EClass getIntegerQualityProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.IntegerQualityProperty#getValue()
	 * @see #getIntegerQualityProperty()
	 * @generated
	 */
	EAttribute getIntegerQualityProperty_Value();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty <em>Double Quality Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty
	 * @generated
	 */
	EClass getDoubleQualityProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.DoubleQualityProperty#getValue()
	 * @see #getDoubleQualityProperty()
	 * @generated
	 */
	EAttribute getDoubleQualityProperty_Value();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction <em>Quality Prediction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Prediction</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction
	 * @generated
	 */
	EClass getQualityPrediction();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty
	 * @generated
	 */
	EClass getQualityProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty#getQualityValue <em>Quality Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Value</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityProperty#getQualityValue()
	 * @see #getQualityProperty()
	 * @generated
	 */
	EAttribute getQualityProperty_QualityValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	qualitypropertiesFactory getqualitypropertiesFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl <em>Numeric Quality Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getNumericQualityProperty()
		 * @generated
		 */
		EClass NUMERIC_QUALITY_PROPERTY = eINSTANCE.getNumericQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Result Decorator Repository</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = eINSTANCE.getNumericQualityProperty_ResultDecoratorRepository();

		/**
		 * The meta object literal for the '<em><b>Confidence Interval</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL = eINSTANCE.getNumericQualityProperty_ConfidenceInterval();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ConfidenceIntervalImpl <em>Confidence Interval</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ConfidenceIntervalImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getConfidenceInterval()
		 * @generated
		 */
		EClass CONFIDENCE_INTERVAL = eINSTANCE.getConfidenceInterval();

		/**
		 * The meta object literal for the '<em><b>Confidence Level</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIDENCE_INTERVAL__CONFIDENCE_LEVEL = eINSTANCE.getConfidenceInterval_ConfidenceLevel();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIDENCE_INTERVAL__MEAN = eINSTANCE.getConfidenceInterval_Mean();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIDENCE_INTERVAL__UPPER_BOUND = eINSTANCE.getConfidenceInterval_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIDENCE_INTERVAL__LOWER_BOUND = eINSTANCE.getConfidenceInterval_LowerBound();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ElementQualityPropertyImpl <em>Element Quality Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.ElementQualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getElementQualityProperty()
		 * @generated
		 */
		EClass ELEMENT_QUALITY_PROPERTY = eINSTANCE.getElementQualityProperty();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.IntegerQualityPropertyImpl <em>Integer Quality Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.IntegerQualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getIntegerQualityProperty()
		 * @generated
		 */
		EClass INTEGER_QUALITY_PROPERTY = eINSTANCE.getIntegerQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute INTEGER_QUALITY_PROPERTY__VALUE = eINSTANCE.getIntegerQualityProperty_Value();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.DoubleQualityPropertyImpl <em>Double Quality Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.DoubleQualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getDoubleQualityProperty()
		 * @generated
		 */
		EClass DOUBLE_QUALITY_PROPERTY = eINSTANCE.getDoubleQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOUBLE_QUALITY_PROPERTY__VALUE = eINSTANCE.getDoubleQualityProperty_Value();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction <em>Quality Prediction</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.QualityPrediction
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getQualityPrediction()
		 * @generated
		 */
		EClass QUALITY_PREDICTION = eINSTANCE.getQualityPrediction();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.QualityPropertyImpl <em>Quality Property</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.QualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getQualityProperty()
		 * @generated
		 */
		EClass QUALITY_PROPERTY = eINSTANCE.getQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Quality Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUALITY_PROPERTY__QUALITY_VALUE = eINSTANCE.getQualityProperty_QualityValue();

	}

} // qualitypropertiesPackage
