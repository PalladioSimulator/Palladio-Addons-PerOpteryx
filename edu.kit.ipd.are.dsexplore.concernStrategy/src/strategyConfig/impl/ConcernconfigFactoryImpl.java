/**
 */
package strategyConfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import strategyConfig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernconfigFactoryImpl extends EFactoryImpl implements ConcernconfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcernconfigFactory init() {
		try {
			ConcernconfigFactory theConcernconfigFactory = (ConcernconfigFactory)EPackage.Registry.INSTANCE.getEFactory(ConcernconfigPackage.eNS_URI);
			if (theConcernconfigFactory != null) {
				return theConcernconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcernconfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernconfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcernconfigPackage.CONFIG_NODE: return createConfigNode();
			case ConcernconfigPackage.FEATURE_CONFIG: return createFeatureConfig();
			case ConcernconfigPackage.CONFIGURATION: return createConfiguration();
			case ConcernconfigPackage.INTEGER_ATTRIBUTE_VALUE: return createIntegerAttributeValue();
			case ConcernconfigPackage.DOUBLE_ATTRIBUTE_VALUE: return createDoubleAttributeValue();
			case ConcernconfigPackage.STRING_ATTRIBUTE_VALUE: return createStringAttributeValue();
			case ConcernconfigPackage.EXTERNAL_OBJECT_ATTRIBUTE_VALUE: return createExternalObjectAttributeValue();
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
			case ConcernconfigPackage.CONFIG_STATE:
				return createConfigStateFromString(eDataType, initialValue);
			case ConcernconfigPackage.FEATURE_CONFIG_STATE:
				return createFeatureConfigStateFromString(eDataType, initialValue);
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
			case ConcernconfigPackage.CONFIG_STATE:
				return convertConfigStateToString(eDataType, instanceValue);
			case ConcernconfigPackage.FEATURE_CONFIG_STATE:
				return convertFeatureConfigStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigNode createConfigNode() {
		ConfigNodeImpl configNode = new ConfigNodeImpl();
		return configNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfig createFeatureConfig() {
		FeatureConfigImpl featureConfig = new FeatureConfigImpl();
		return featureConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAttributeValue createIntegerAttributeValue() {
		IntegerAttributeValueImpl integerAttributeValue = new IntegerAttributeValueImpl();
		return integerAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleAttributeValue createDoubleAttributeValue() {
		DoubleAttributeValueImpl doubleAttributeValue = new DoubleAttributeValueImpl();
		return doubleAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAttributeValue createStringAttributeValue() {
		StringAttributeValueImpl stringAttributeValue = new StringAttributeValueImpl();
		return stringAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObjectAttributeValue createExternalObjectAttributeValue() {
		ExternalObjectAttributeValueImpl externalObjectAttributeValue = new ExternalObjectAttributeValueImpl();
		return externalObjectAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigState createConfigStateFromString(EDataType eDataType, String initialValue) {
		ConfigState result = ConfigState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfigState createFeatureConfigStateFromString(EDataType eDataType, String initialValue) {
		FeatureConfigState result = FeatureConfigState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureConfigStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernconfigPackage getConcernconfigPackage() {
		return (ConcernconfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ConcernconfigPackage getPackage() {
		return ConcernconfigPackage.eINSTANCE;
	}

} //ConcernconfigFactoryImpl
