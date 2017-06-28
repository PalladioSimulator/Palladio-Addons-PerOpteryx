/**
 */
package org.palladiosimulator.qualitymodel.util;

import de.uka.ipd.sdq.identifier.Identifier;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.qualitymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage
 * @generated
 */
public class QualityModelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelSwitch() {
		if (modelPackage == null) {
			modelPackage = QualityModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QualityModelPackage.NQR: {
				Nqr nqr = (Nqr)theEObject;
				Object result = caseNqr(nqr);
				if (result == null) result = caseEntity(nqr);
				if (result == null) result = caseIdentifier(nqr);
				if (result == null) result = caseNamedElement(nqr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				Object result = caseMapping(mapping);
				if (result == null) result = caseEntity(mapping);
				if (result == null) result = caseIdentifier(mapping);
				if (result == null) result = caseNamedElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				Object result = caseTransformation(transformation);
				if (result == null) result = caseEntity(transformation);
				if (result == null) result = caseIdentifier(transformation);
				if (result == null) result = caseNamedElement(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.REASONING: {
				Reasoning reasoning = (Reasoning)theEObject;
				Object result = caseReasoning(reasoning);
				if (result == null) result = caseEntity(reasoning);
				if (result == null) result = caseIdentifier(reasoning);
				if (result == null) result = caseNamedElement(reasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.REDUCTION: {
				Reduction reduction = (Reduction)theEObject;
				Object result = caseReduction(reduction);
				if (result == null) result = caseEntity(reduction);
				if (result == null) result = caseIdentifier(reduction);
				if (result == null) result = caseNamedElement(reduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.QUANTITY_REDUCTION: {
				QuantityReduction quantityReduction = (QuantityReduction)theEObject;
				Object result = caseQuantityReduction(quantityReduction);
				if (result == null) result = caseReduction(quantityReduction);
				if (result == null) result = caseEntity(quantityReduction);
				if (result == null) result = caseIdentifier(quantityReduction);
				if (result == null) result = caseNamedElement(quantityReduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.STATISTIC_REDUCTION: {
				StatisticReduction statisticReduction = (StatisticReduction)theEObject;
				Object result = caseStatisticReduction(statisticReduction);
				if (result == null) result = caseReduction(statisticReduction);
				if (result == null) result = caseEntity(statisticReduction);
				if (result == null) result = caseIdentifier(statisticReduction);
				if (result == null) result = caseNamedElement(statisticReduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.MAPPING_REPOSITORY: {
				MappingRepository mappingRepository = (MappingRepository)theEObject;
				Object result = caseMappingRepository(mappingRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.MAPPING_ENTRY: {
				MappingEntry mappingEntry = (MappingEntry)theEObject;
				Object result = caseMappingEntry(mappingEntry);
				if (result == null) result = caseEntity(mappingEntry);
				if (result == null) result = caseIdentifier(mappingEntry);
				if (result == null) result = caseNamedElement(mappingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.TRANSFORMATION_REPOSITORY: {
				TransformationRepository transformationRepository = (TransformationRepository)theEObject;
				Object result = caseTransformationRepository(transformationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.REASONING_REPOSITORY: {
				ReasoningRepository reasoningRepository = (ReasoningRepository)theEObject;
				Object result = caseReasoningRepository(reasoningRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.NQR_REPOSITORY: {
				NqrRepository nqrRepository = (NqrRepository)theEObject;
				Object result = caseNqrRepository(nqrRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.REASONING_COMPONENT: {
				ReasoningComponent reasoningComponent = (ReasoningComponent)theEObject;
				Object result = caseReasoningComponent(reasoningComponent);
				if (result == null) result = caseEntity(reasoningComponent);
				if (result == null) result = caseIdentifier(reasoningComponent);
				if (result == null) result = caseNamedElement(reasoningComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityModelPackage.REASONING_SYSTEM: {
				ReasoningSystem reasoningSystem = (ReasoningSystem)theEObject;
				Object result = caseReasoningSystem(reasoningSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nqr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nqr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNqr(Nqr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReasoning(Reasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReduction(Reduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQuantityReduction(QuantityReduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistic Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistic Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatisticReduction(StatisticReduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMappingRepository(MappingRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMappingEntry(MappingEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransformationRepository(TransformationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReasoningRepository(ReasoningRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nqr Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nqr Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNqrRepository(NqrRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReasoningComponent(ReasoningComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReasoningSystem(ReasoningSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //QualityModelSwitch
