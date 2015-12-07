/**
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties;

import genericdesigndecision.qualityproperties.QualitypropertiesPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface qualitypropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualityproperties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/QualityProperties/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualityproperties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	qualitypropertiesPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl <em>Numeric Quality Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	int NUMERIC_QUALITY_PROPERTY__QUALITY_VALUE = QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__QUALITY_VALUE;

	/**
	 * The feature id for the '<em><b>Confidence Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL = QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY__CONFIDENCE_INTERVAL;

	/**
	 * The feature id for the '<em><b>Result Decorator Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Numeric Quality Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT = QualitypropertiesPackage.NUMERIC_QUALITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty <em>Numeric Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Quality Property</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty
	 * @generated
	 */
	EClass getNumericQualityProperty();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository <em>Result Decorator Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Decorator Repository</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository()
	 * @see #getNumericQualityProperty()
	 * @generated
	 */
	EReference getNumericQualityProperty_ResultDecoratorRepository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	qualitypropertiesFactory getqualitypropertiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl <em>Numeric Quality Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.NumericQualityPropertyImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl#getNumericQualityProperty()
		 * @generated
		 */
		EClass NUMERIC_QUALITY_PROPERTY = eINSTANCE.getNumericQualityProperty();

		/**
		 * The meta object literal for the '<em><b>Result Decorator Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_QUALITY_PROPERTY__RESULT_DECORATOR_REPOSITORY = eINSTANCE
				.getNumericQualityProperty_ResultDecoratorRepository();

	}

} //qualitypropertiesPackage
