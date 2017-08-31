/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.*;
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
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage
 * @generated
 */
public class QMLContractTypeSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static QMLContractTypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractTypeSwitch() {
		if (modelPackage == null) {
			modelPackage = QMLContractTypePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QMLContractTypePackage.DIMENSION_TYPE_SET: {
			DimensionTypeSet dimensionTypeSet = (DimensionTypeSet) theEObject;
			T1 result = caseDimensionTypeSet(dimensionTypeSet);
			if (result == null)
				result = caseDimensionType(dimensionTypeSet);
			if (result == null)
				result = caseIdentifier(dimensionTypeSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION_TYPE: {
			DimensionType dimensionType = (DimensionType) theEObject;
			T1 result = caseDimensionType(dimensionType);
			if (result == null)
				result = caseIdentifier(dimensionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.RELATION_SEMANTICS: {
			RelationSemantics relationSemantics = (RelationSemantics) theEObject;
			T1 result = caseRelationSemantics(relationSemantics);
			if (result == null)
				result = caseIdentifier(relationSemantics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.ELEMENT: {
			Element element = (Element) theEObject;
			T1 result = caseElement(element);
			if (result == null)
				result = caseEntity(element);
			if (result == null)
				result = caseIdentifier(element);
			if (result == null)
				result = caseNamedElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.ORDER: {
			Order order = (Order) theEObject;
			T1 result = caseOrder(order);
			if (result == null)
				result = caseIdentifier(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION_TYPE_ENUM: {
			DimensionTypeEnum dimensionTypeEnum = (DimensionTypeEnum) theEObject;
			T1 result = caseDimensionTypeEnum(dimensionTypeEnum);
			if (result == null)
				result = caseDimensionType(dimensionTypeEnum);
			if (result == null)
				result = caseIdentifier(dimensionTypeEnum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.UNIT: {
			Unit unit = (Unit) theEObject;
			T1 result = caseUnit(unit);
			if (result == null)
				result = caseEntity(unit);
			if (result == null)
				result = caseIdentifier(unit);
			if (result == null)
				result = caseNamedElement(unit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION_TYPE_NUMERIC: {
			DimensionTypeNumeric dimensionTypeNumeric = (DimensionTypeNumeric) theEObject;
			T1 result = caseDimensionTypeNumeric(dimensionTypeNumeric);
			if (result == null)
				result = caseDimensionType(dimensionTypeNumeric);
			if (result == null)
				result = caseIdentifier(dimensionTypeNumeric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.NUMERIC_RANGE: {
			NumericRange numericRange = (NumericRange) theEObject;
			T1 result = caseNumericRange(numericRange);
			if (result == null)
				result = caseIdentifier(numericRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.QML_CONTRACT_TYPE: {
			QMLContractType qmlContractType = (QMLContractType) theEObject;
			T1 result = caseQMLContractType(qmlContractType);
			if (result == null)
				result = caseQMLDeclaration(qmlContractType);
			if (result == null)
				result = caseEntity(qmlContractType);
			if (result == null)
				result = caseIdentifier(qmlContractType);
			if (result == null)
				result = caseNamedElement(qmlContractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.UNIT_REPOSITORY: {
			UnitRepository unitRepository = (UnitRepository) theEObject;
			T1 result = caseUnitRepository(unitRepository);
			if (result == null)
				result = caseIdentifier(unitRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY: {
			DimensionTypeRepository dimensionTypeRepository = (DimensionTypeRepository) theEObject;
			T1 result = caseDimensionTypeRepository(dimensionTypeRepository);
			if (result == null)
				result = caseIdentifier(dimensionTypeRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION: {
			Dimension dimension = (Dimension) theEObject;
			T1 result = caseDimension(dimension);
			if (result == null)
				result = caseEntity(dimension);
			if (result == null)
				result = caseIdentifier(dimension);
			if (result == null)
				result = caseNamedElement(dimension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE: {
			DimensionTypeScale<?> dimensionTypeScale = (DimensionTypeScale<?>) theEObject;
			T1 result = caseDimensionTypeScale(dimensionTypeScale);
			if (result == null)
				result = caseDimensionType(dimensionTypeScale);
			if (result == null)
				result = caseIdentifier(dimensionTypeScale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QMLContractTypePackage.SCALE_ELEMENT: {
			ScaleElement<?> scaleElement = (ScaleElement<?>) theEObject;
			T1 result = caseScaleElement(scaleElement);
			if (result == null)
				result = caseElement(scaleElement);
			if (result == null)
				result = caseEntity(scaleElement);
			if (result == null)
				result = caseIdentifier(scaleElement);
			if (result == null)
				result = caseNamedElement(scaleElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type Set</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDimensionTypeSet(DimensionTypeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDimensionType(DimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Semantics</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationSemantics(RelationSemantics object) {
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
	public T1 caseElement(Element object) {
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
	public T1 caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type Enum</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDimensionTypeEnum(DimensionTypeEnum object) {
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
	public T1 caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type Numeric</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDimensionTypeNumeric(DimensionTypeNumeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Range</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumericRange(NumericRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QML Contract Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QML Contract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQMLContractType(QMLContractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnitRepository(UnitRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type Repository</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDimensionTypeRepository(DimensionTypeRepository object) {
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
	public T1 caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Number> T1 caseDimensionTypeScale(DimensionTypeScale<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Number> T1 caseScaleElement(ScaleElement<T> object) {
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
	public T1 caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
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
	public T1 caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQMLDeclaration(QMLDeclaration object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} // QMLContractTypeSwitch
