/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
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
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Unit;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.UnitRepository;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage
 * @generated
 */
public class QMLContractTypeValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final QMLContractTypeValidator INSTANCE = new QMLContractTypeValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ORDER can
     * only exist with RELATIONSEMANTICS' of 'Dimension Type Set'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int DIMENSION_TYPE_SET__ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint
     * 'BIGGERELEMENT must not be SMALLELEMENT' of 'Order'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int ORDER__BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ORDER can
     * only exist with RELATIONSEMANTICS and vice versa' of 'Dimension Type Enum'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int DIMENSION_TYPE_ENUM__ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS_AND_VICE_VERSA = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint
     * 'NUMERICDIMENSIONTYPE must have RELATIONSEMANTICS' of 'Dimension Type Numeric'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int DIMENSION_TYPE_NUMERIC__NUMERICDIMENSIONTYPE_MUST_HAVE_RELATIONSEMANTICS = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'UPPERLIMIT
     * must be greater than LOWERLIMIT' of 'Numeric Range'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int NUMERIC_RANGE__UPPERLIMIT_MUST_BE_GREATER_THAN_LOWERLIMIT = 5;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractTypeValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return QMLContractTypePackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET:
            return this.validateDimensionTypeSet((DimensionTypeSet) value, diagnostics, context);
        case QMLContractTypePackage.DIMENSION_TYPE:
            return this.validateDimensionType((DimensionType) value, diagnostics, context);
        case QMLContractTypePackage.RELATION_SEMANTICS:
            return this.validateRelationSemantics((RelationSemantics) value, diagnostics, context);
        case QMLContractTypePackage.ELEMENT:
            return this.validateElement((Element) value, diagnostics, context);
        case QMLContractTypePackage.ORDER:
            return this.validateOrder((Order) value, diagnostics, context);
        case QMLContractTypePackage.DIMENSION_TYPE_ENUM:
            return this.validateDimensionTypeEnum((DimensionTypeEnum) value, diagnostics, context);
        case QMLContractTypePackage.UNIT:
            return this.validateUnit((Unit) value, diagnostics, context);
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC:
            return this.validateDimensionTypeNumeric((DimensionTypeNumeric) value, diagnostics, context);
        case QMLContractTypePackage.NUMERIC_RANGE:
            return this.validateNumericRange((NumericRange) value, diagnostics, context);
        case QMLContractTypePackage.QML_CONTRACT_TYPE:
            return this.validateQMLContractType((QMLContractType) value, diagnostics, context);
        case QMLContractTypePackage.UNIT_REPOSITORY:
            return this.validateUnitRepository((UnitRepository) value, diagnostics, context);
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY:
            return this.validateDimensionTypeRepository((DimensionTypeRepository) value, diagnostics, context);
        case QMLContractTypePackage.DIMENSION:
            return this.validateDimension((Dimension) value, diagnostics, context);
        case QMLContractTypePackage.ENUM_RELATION_SEMANTICS:
            return this.validateEnumRelationSemantics((EnumRelationSemantics) value, diagnostics, context);
        case QMLContractTypePackage.ENUM_NUMERIC_DOMAIN:
            return this.validateEnumNumericDomain((EnumNumericDomain) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeSet(final DimensionTypeSet dimensionTypeSet, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(dimensionTypeSet, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(dimensionTypeSet, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(dimensionTypeSet, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateDimensionTypeSet_ORDER_can_only_exist_with_RELATIONSEMANTICS(dimensionTypeSet,
                    diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ORDER_can_only_exist_with_RELATIONSEMANTICS constraint of '
     * <em>Dimension Type Set</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeSet_ORDER_can_only_exist_with_RELATIONSEMANTICS(
            final DimensionTypeSet dimensionTypeSet, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return dimensionTypeSet.ORDER_can_only_exist_with_RELATIONSEMANTICS(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionType(final DimensionType dimensionType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(dimensionType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRelationSemantics(final RelationSemantics relationSemantics,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(relationSemantics, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateElement(final Element element, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(element, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOrder(final Order order, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(order, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(order, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(order, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateOrder_BIGGERELEMENT_must_not_be_SMALLELEMENT(order, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the BIGGERELEMENT_must_not_be_SMALLELEMENT constraint of '<em>Order</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateOrder_BIGGERELEMENT_must_not_be_SMALLELEMENT(final Order order,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return order.BIGGERELEMENT_must_not_be_SMALLELEMENT(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeEnum(final DimensionTypeEnum dimensionTypeEnum,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(dimensionTypeEnum, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(dimensionTypeEnum, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(dimensionTypeEnum, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateDimensionTypeEnum_ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa(
                    dimensionTypeEnum, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa constraint of '
     * <em>Dimension Type Enum</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeEnum_ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa(
            final DimensionTypeEnum dimensionTypeEnum, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return dimensionTypeEnum.ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateUnit(final Unit unit, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(unit, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeNumeric(final DimensionTypeNumeric dimensionTypeNumeric,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(dimensionTypeNumeric, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(dimensionTypeNumeric, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(dimensionTypeNumeric, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateDimensionTypeNumeric_NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(
                    dimensionTypeNumeric, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS constraint of '
     * <em>Dimension Type Numeric</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeNumeric_NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(
            final DimensionTypeNumeric dimensionTypeNumeric, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return dimensionTypeNumeric.NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateNumericRange(final NumericRange numericRange, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(numericRange, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(numericRange, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(numericRange, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateNumericRange_UPPERLIMIT_must_be_greater_than_LOWERLIMIT(numericRange, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the UPPERLIMIT_must_be_greater_than_LOWERLIMIT constraint of '
     * <em>Numeric Range</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateNumericRange_UPPERLIMIT_must_be_greater_than_LOWERLIMIT(final NumericRange numericRange,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return numericRange.UPPERLIMIT_must_be_greater_than_LOWERLIMIT(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateQMLContractType(final QMLContractType qmlContractType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(qmlContractType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateUnitRepository(final UnitRepository unitRepository, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(unitRepository, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimensionTypeRepository(final DimensionTypeRepository dimensionTypeRepository,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(dimensionTypeRepository, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDimension(final Dimension dimension, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(dimension, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEnumRelationSemantics(final EnumRelationSemantics enumRelationSemantics,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEnumNumericDomain(final EnumNumericDomain enumNumericDomain,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // QMLContractTypeValidator
