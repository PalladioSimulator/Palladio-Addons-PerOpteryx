/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumNumericDomain;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypeFactory;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Unit;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.UnitRepository;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class QMLContractTypeFactoryImpl extends EFactoryImpl implements QMLContractTypeFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static QMLContractTypeFactory init() {
        try
        {
            final QMLContractTypeFactory theQMLContractTypeFactory = (QMLContractTypeFactory) EPackage.Registry.INSTANCE
                    .getEFactory(QMLContractTypePackage.eNS_URI);
            if (theQMLContractTypeFactory != null)
            {
                return theQMLContractTypeFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QMLContractTypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractTypeFactoryImpl() {
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
        case QMLContractTypePackage.DIMENSION_TYPE_SET:
            return this.createDimensionTypeSet();
        case QMLContractTypePackage.RELATION_SEMANTICS:
            return this.createRelationSemantics();
        case QMLContractTypePackage.ELEMENT:
            return this.createElement();
        case QMLContractTypePackage.ORDER:
            return this.createOrder();
        case QMLContractTypePackage.DIMENSION_TYPE_ENUM:
            return this.createDimensionTypeEnum();
        case QMLContractTypePackage.UNIT:
            return this.createUnit();
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC:
            return this.createDimensionTypeNumeric();
        case QMLContractTypePackage.NUMERIC_RANGE:
            return this.createNumericRange();
        case QMLContractTypePackage.QML_CONTRACT_TYPE:
            return this.createQMLContractType();
        case QMLContractTypePackage.UNIT_REPOSITORY:
            return this.createUnitRepository();
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY:
            return this.createDimensionTypeRepository();
        case QMLContractTypePackage.DIMENSION:
            return this.createDimension();
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
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID())
        {
        case QMLContractTypePackage.ENUM_RELATION_SEMANTICS:
            return this.createEnumRelationSemanticsFromString(eDataType, initialValue);
        case QMLContractTypePackage.ENUM_NUMERIC_DOMAIN:
            return this.createEnumNumericDomainFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID())
        {
        case QMLContractTypePackage.ENUM_RELATION_SEMANTICS:
            return this.convertEnumRelationSemanticsToString(eDataType, instanceValue);
        case QMLContractTypePackage.ENUM_NUMERIC_DOMAIN:
            return this.convertEnumNumericDomainToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DimensionTypeSet createDimensionTypeSet() {
        final DimensionTypeSetImpl dimensionTypeSet = new DimensionTypeSetImpl();
        return dimensionTypeSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RelationSemantics createRelationSemantics() {
        final RelationSemanticsImpl relationSemantics = new RelationSemanticsImpl();
        return relationSemantics;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Element createElement() {
        final ElementImpl element = new ElementImpl();
        return element;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Order createOrder() {
        final OrderImpl order = new OrderImpl();
        return order;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DimensionTypeEnum createDimensionTypeEnum() {
        final DimensionTypeEnumImpl dimensionTypeEnum = new DimensionTypeEnumImpl();
        return dimensionTypeEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit createUnit() {
        final UnitImpl unit = new UnitImpl();
        return unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DimensionTypeNumeric createDimensionTypeNumeric() {
        final DimensionTypeNumericImpl dimensionTypeNumeric = new DimensionTypeNumericImpl();
        return dimensionTypeNumeric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericRange createNumericRange() {
        final NumericRangeImpl numericRange = new NumericRangeImpl();
        return numericRange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLContractType createQMLContractType() {
        final QMLContractTypeImpl qmlContractType = new QMLContractTypeImpl();
        return qmlContractType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UnitRepository createUnitRepository() {
        final UnitRepositoryImpl unitRepository = new UnitRepositoryImpl();
        return unitRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DimensionTypeRepository createDimensionTypeRepository() {
        final DimensionTypeRepositoryImpl dimensionTypeRepository = new DimensionTypeRepositoryImpl();
        return dimensionTypeRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Dimension createDimension() {
        final DimensionImpl dimension = new DimensionImpl();
        return dimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EnumRelationSemantics createEnumRelationSemanticsFromString(final EDataType eDataType,
            final String initialValue) {
        final EnumRelationSemantics result = EnumRelationSemantics.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertEnumRelationSemanticsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EnumNumericDomain createEnumNumericDomainFromString(final EDataType eDataType, final String initialValue) {
        final EnumNumericDomain result = EnumNumericDomain.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertEnumNumericDomainToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLContractTypePackage getQMLContractTypePackage() {
        return (QMLContractTypePackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QMLContractTypePackage getPackage() {
        return QMLContractTypePackage.eINSTANCE;
    }

} // QMLContractTypeFactoryImpl
