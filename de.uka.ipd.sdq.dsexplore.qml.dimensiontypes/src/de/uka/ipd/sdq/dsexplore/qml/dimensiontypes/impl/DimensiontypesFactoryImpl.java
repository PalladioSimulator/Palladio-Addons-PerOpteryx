/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.*;

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
public class DimensiontypesFactoryImpl extends EFactoryImpl implements DimensiontypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimensiontypesFactory init() {
		try {
			DimensiontypesFactory theDimensiontypesFactory = (DimensiontypesFactory)EPackage.Registry.INSTANCE.getEFactory(DimensiontypesPackage.eNS_URI);
			if (theDimensiontypesFactory != null) {
				return theDimensiontypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DimensiontypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensiontypesFactoryImpl() {
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
			case DimensiontypesPackage.DIMENSION_TYPE_SET: return (EObject)createDimensionTypeSet();
			case DimensiontypesPackage.RELATION_SEMANTICS: return (EObject)createRelationSemantics();
			case DimensiontypesPackage.ELEMENT: return (EObject)createElement();
			case DimensiontypesPackage.ORDER: return (EObject)createOrder();
			case DimensiontypesPackage.DIMENSION_TYPE_ENUM: return (EObject)createDimensionTypeEnum();
			case DimensiontypesPackage.DIMENSION_TYPE_NUMERIC: return (EObject)createDimensionTypeNumeric();
			case DimensiontypesPackage.NUMERIC_RANGE: return (EObject)createNumericRange();
			case DimensiontypesPackage.DIMENSION_TYPE_REPOSITORY: return (EObject)createDimensionTypeRepository();
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE: return (EObject)createDimensionTypeScale();
			case DimensiontypesPackage.SCALE_ELEMENT: return (EObject)createScaleElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DimensiontypesPackage.ENUM_RELATION_SEMANTICS:
				return createEnumRelationSemanticsFromString(eDataType, initialValue);
			case DimensiontypesPackage.ENUM_NUMERIC_DOMAIN:
				return createEnumNumericDomainFromString(eDataType, initialValue);
			case DimensiontypesPackage.ESCALE_OF_MEASURE:
				return createEScaleOfMeasureFromString(eDataType, initialValue);
			case DimensiontypesPackage.ENUMBER:
				return createENumberFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DimensiontypesPackage.ENUM_RELATION_SEMANTICS:
				return convertEnumRelationSemanticsToString(eDataType, instanceValue);
			case DimensiontypesPackage.ENUM_NUMERIC_DOMAIN:
				return convertEnumNumericDomainToString(eDataType, instanceValue);
			case DimensiontypesPackage.ESCALE_OF_MEASURE:
				return convertEScaleOfMeasureToString(eDataType, instanceValue);
			case DimensiontypesPackage.ENUMBER:
				return convertENumberToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeSet createDimensionTypeSet() {
		DimensionTypeSetImpl dimensionTypeSet = new DimensionTypeSetImpl();
		return dimensionTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSemantics createRelationSemantics() {
		RelationSemanticsImpl relationSemantics = new RelationSemanticsImpl();
		return relationSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeEnum createDimensionTypeEnum() {
		DimensionTypeEnumImpl dimensionTypeEnum = new DimensionTypeEnumImpl();
		return dimensionTypeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeNumeric createDimensionTypeNumeric() {
		DimensionTypeNumericImpl dimensionTypeNumeric = new DimensionTypeNumericImpl();
		return dimensionTypeNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericRange createNumericRange() {
		NumericRangeImpl numericRange = new NumericRangeImpl();
		return numericRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeRepository createDimensionTypeRepository() {
		DimensionTypeRepositoryImpl dimensionTypeRepository = new DimensionTypeRepositoryImpl();
		return dimensionTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Number> DimensionTypeScale<T> createDimensionTypeScale() {
		DimensionTypeScaleImpl<T> dimensionTypeScale = new DimensionTypeScaleImpl<T>();
		return dimensionTypeScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Number> ScaleElement<T> createScaleElement() {
		ScaleElementImpl<T> scaleElement = new ScaleElementImpl<T>();
		return scaleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRelationSemantics createEnumRelationSemanticsFromString(EDataType eDataType, String initialValue) {
		EnumRelationSemantics result = EnumRelationSemantics.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumRelationSemanticsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNumericDomain createEnumNumericDomainFromString(EDataType eDataType, String initialValue) {
		EnumNumericDomain result = EnumNumericDomain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNumericDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScaleOfMeasure createEScaleOfMeasureFromString(EDataType eDataType, String initialValue) {
		EScaleOfMeasure result = EScaleOfMeasure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEScaleOfMeasureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createENumberFromString(EDataType eDataType, String initialValue) {
		return (Number)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensiontypesPackage getDimensiontypesPackage() {
		return (DimensiontypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DimensiontypesPackage getPackage() {
		return DimensiontypesPackage.eINSTANCE;
	}

} //DimensiontypesFactoryImpl
