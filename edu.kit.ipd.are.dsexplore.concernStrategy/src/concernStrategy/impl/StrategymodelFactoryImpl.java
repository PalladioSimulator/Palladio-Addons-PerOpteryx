/**
 */
package concernStrategy.impl;

import concernStrategy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StrategymodelFactoryImpl extends EFactoryImpl implements StrategymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StrategymodelFactory init() {
		try {
			StrategymodelFactory theStrategymodelFactory = (StrategymodelFactory)EPackage.Registry.INSTANCE.getEFactory(StrategymodelPackage.eNS_URI);
			if (theStrategymodelFactory != null) {
				return theStrategymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StrategymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StrategymodelPackage.FEATURE: return createFeature();
			case StrategymodelPackage.SIMPLE: return createSimple();
			case StrategymodelPackage.FEATURE_GROUP: return createFeatureGroup();
			case StrategymodelPackage.FEATURE_DIAGRAM: return createFeatureDiagram();
			case StrategymodelPackage.REQUIRED_CONSTRAINT: return createRequiredConstraint();
			case StrategymodelPackage.PROHIBITS_CONSTRAINT: return createProhibitsConstraint();
			case StrategymodelPackage.INTEGER_INTERVAL_RANGE: return createIntegerIntervalRange();
			case StrategymodelPackage.CONTINOUS_INTERVAL_RANGE: return createContinousIntervalRange();
			case StrategymodelPackage.INTEGER_ATTRIBUTE: return createIntegerAttribute();
			case StrategymodelPackage.DOUBLE_ATTRIBUTE: return createDoubleAttribute();
			case StrategymodelPackage.STRING_ATTRIBUTE: return createStringAttribute();
			case StrategymodelPackage.EXTERNAL_OBJECT_ATTRIBUTE: return createExternalObjectAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StrategymodelPackage.ATTRIBUTE_TYPES:
				return createAttributeTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StrategymodelPackage.ATTRIBUTE_TYPES:
				return convertAttributeTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup createFeatureGroup() {
		FeatureGroupImpl featureGroup = new FeatureGroupImpl();
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram createFeatureDiagram() {
		FeatureDiagramImpl featureDiagram = new FeatureDiagramImpl();
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredConstraint createRequiredConstraint() {
		RequiredConstraintImpl requiredConstraint = new RequiredConstraintImpl();
		return requiredConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProhibitsConstraint createProhibitsConstraint() {
		ProhibitsConstraintImpl prohibitsConstraint = new ProhibitsConstraintImpl();
		return prohibitsConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerIntervalRange createIntegerIntervalRange() {
		IntegerIntervalRangeImpl integerIntervalRange = new IntegerIntervalRangeImpl();
		return integerIntervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousIntervalRange createContinousIntervalRange() {
		ContinousIntervalRangeImpl continousIntervalRange = new ContinousIntervalRangeImpl();
		return continousIntervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAttribute createIntegerAttribute() {
		IntegerAttributeImpl integerAttribute = new IntegerAttributeImpl();
		return integerAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleAttribute createDoubleAttribute() {
		DoubleAttributeImpl doubleAttribute = new DoubleAttributeImpl();
		return doubleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAttribute createStringAttribute() {
		StringAttributeImpl stringAttribute = new StringAttributeImpl();
		return stringAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObjectAttribute createExternalObjectAttribute() {
		ExternalObjectAttributeImpl externalObjectAttribute = new ExternalObjectAttributeImpl();
		return externalObjectAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypes createAttributeTypesFromString(EDataType eDataType, String initialValue) {
		AttributeTypes result = AttributeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategymodelPackage getStrategymodelPackage() {
		return (StrategymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static StrategymodelPackage getPackage() {
		return StrategymodelPackage.eINSTANCE;
	}

} //StrategymodelFactoryImpl
