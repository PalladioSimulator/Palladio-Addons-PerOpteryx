/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Unit;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.UnitRepository;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage
 * @generated
 */
public class QMLContractTypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLContractTypePackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractTypeSwitch() {
        if (modelPackage == null)
        {
            modelPackage = QMLContractTypePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET: {
            final DimensionTypeSet dimensionTypeSet = (DimensionTypeSet) theEObject;
            T result = this.caseDimensionTypeSet(dimensionTypeSet);
            if (result == null) {
                result = this.caseDimensionType(dimensionTypeSet);
            }
            if (result == null) {
                result = this.caseIdentifier(dimensionTypeSet);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.DIMENSION_TYPE: {
            final DimensionType dimensionType = (DimensionType) theEObject;
            T result = this.caseDimensionType(dimensionType);
            if (result == null) {
                result = this.caseIdentifier(dimensionType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.RELATION_SEMANTICS: {
            final RelationSemantics relationSemantics = (RelationSemantics) theEObject;
            T result = this.caseRelationSemantics(relationSemantics);
            if (result == null) {
                result = this.caseIdentifier(relationSemantics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.ELEMENT: {
            final Element element = (Element) theEObject;
            T result = this.caseElement(element);
            if (result == null) {
                result = this.caseEntity(element);
            }
            if (result == null) {
                result = this.caseIdentifier(element);
            }
            if (result == null) {
                result = this.caseNamedElement(element);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.ORDER: {
            final Order order = (Order) theEObject;
            T result = this.caseOrder(order);
            if (result == null) {
                result = this.caseIdentifier(order);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.DIMENSION_TYPE_ENUM: {
            final DimensionTypeEnum dimensionTypeEnum = (DimensionTypeEnum) theEObject;
            T result = this.caseDimensionTypeEnum(dimensionTypeEnum);
            if (result == null) {
                result = this.caseDimensionType(dimensionTypeEnum);
            }
            if (result == null) {
                result = this.caseIdentifier(dimensionTypeEnum);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.UNIT: {
            final Unit unit = (Unit) theEObject;
            T result = this.caseUnit(unit);
            if (result == null) {
                result = this.caseEntity(unit);
            }
            if (result == null) {
                result = this.caseIdentifier(unit);
            }
            if (result == null) {
                result = this.caseNamedElement(unit);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC: {
            final DimensionTypeNumeric dimensionTypeNumeric = (DimensionTypeNumeric) theEObject;
            T result = this.caseDimensionTypeNumeric(dimensionTypeNumeric);
            if (result == null) {
                result = this.caseDimensionType(dimensionTypeNumeric);
            }
            if (result == null) {
                result = this.caseIdentifier(dimensionTypeNumeric);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.NUMERIC_RANGE: {
            final NumericRange numericRange = (NumericRange) theEObject;
            T result = this.caseNumericRange(numericRange);
            if (result == null) {
                result = this.caseIdentifier(numericRange);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.QML_CONTRACT_TYPE: {
            final QMLContractType qmlContractType = (QMLContractType) theEObject;
            T result = this.caseQMLContractType(qmlContractType);
            if (result == null) {
                result = this.caseQMLDeclaration(qmlContractType);
            }
            if (result == null) {
                result = this.caseEntity(qmlContractType);
            }
            if (result == null) {
                result = this.caseIdentifier(qmlContractType);
            }
            if (result == null) {
                result = this.caseNamedElement(qmlContractType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.UNIT_REPOSITORY: {
            final UnitRepository unitRepository = (UnitRepository) theEObject;
            T result = this.caseUnitRepository(unitRepository);
            if (result == null) {
                result = this.caseIdentifier(unitRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY: {
            final DimensionTypeRepository dimensionTypeRepository = (DimensionTypeRepository) theEObject;
            T result = this.caseDimensionTypeRepository(dimensionTypeRepository);
            if (result == null) {
                result = this.caseIdentifier(dimensionTypeRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case QMLContractTypePackage.DIMENSION: {
            final Dimension dimension = (Dimension) theEObject;
            T result = this.caseDimension(dimension);
            if (result == null) {
                result = this.caseEntity(dimension);
            }
            if (result == null) {
                result = this.caseIdentifier(dimension);
            }
            if (result == null) {
                result = this.caseNamedElement(dimension);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension Type Set</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension Type Set</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionTypeSet(final DimensionTypeSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionType(final DimensionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Semantics</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Semantics</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationSemantics(final RelationSemantics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(final Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Order</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Order</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrder(final Order object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension Type Enum</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension Type Enum</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionTypeEnum(final DimensionTypeEnum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unit</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnit(final Unit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Dimension Type Numeric</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Dimension Type Numeric</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionTypeNumeric(final DimensionTypeNumeric object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Range</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericRange(final NumericRange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>QML Contract Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>QML Contract Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQMLContractType(final QMLContractType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnitRepository(final UnitRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Dimension Type Repository</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Dimension Type Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionTypeRepository(final DimensionTypeRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimension(final Dimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object)
    {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQMLDeclaration(final QMLDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // QMLContractTypeSwitch
