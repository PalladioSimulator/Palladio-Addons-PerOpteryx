/**
 */
package genericdesigndecision.genericDoF.util;

import genericdesigndecision.genericDoF.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see genericdesigndecision.genericDoF.GenericDoFPackage
 * @generated
 */
public class GenericDoFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericDoFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFSwitch() {
		if (modelPackage == null) {
			modelPackage = GenericDoFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION: {
				ChangeableElementDescription changeableElementDescription = (ChangeableElementDescription)theEObject;
				T result = caseChangeableElementDescription(changeableElementDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.VALUE_RULE: {
				ValueRule valueRule = (ValueRule)theEObject;
				T result = caseValueRule(valueRule);
				if (result == null) result = caseOCLRule(valueRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.OCL_RULE: {
				OCLRule oclRule = (OCLRule)theEObject;
				T result = caseOCLRule(oclRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.HELPER_OCL_DEFINITION: {
				HelperOCLDefinition helperOCLDefinition = (HelperOCLDefinition)theEObject;
				T result = caseHelperOCLDefinition(helperOCLDefinition);
				if (result == null) result = caseOCLRule(helperOCLDefinition);
				if (result == null) result = caseStaticContextRule(helperOCLDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.STATIC_CONTEXT_RULE: {
				StaticContextRule staticContextRule = (StaticContextRule)theEObject;
				T result = caseStaticContextRule(staticContextRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.SELECTION_RULE: {
				SelectionRule selectionRule = (SelectionRule)theEObject;
				T result = caseSelectionRule(selectionRule);
				if (result == null) result = caseOCLRule(selectionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.DO_FREPOSITORY: {
				DoFRepository doFRepository = (DoFRepository)theEObject;
				T result = caseDoFRepository(doFRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.INSTANCE_SELECTION_RULE: {
				InstanceSelectionRule instanceSelectionRule = (InstanceSelectionRule)theEObject;
				T result = caseInstanceSelectionRule(instanceSelectionRule);
				if (result == null) result = caseSelectionRule(instanceSelectionRule);
				if (result == null) result = caseOCLRule(instanceSelectionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.STATIC_SELECTION_RULE: {
				StaticSelectionRule staticSelectionRule = (StaticSelectionRule)theEObject;
				T result = caseStaticSelectionRule(staticSelectionRule);
				if (result == null) result = caseSelectionRule(staticSelectionRule);
				if (result == null) result = caseStaticContextRule(staticSelectionRule);
				if (result == null) result = caseOCLRule(staticSelectionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ADEGREE_OF_FREEDOM: {
				ADegreeOfFreedom aDegreeOfFreedom = (ADegreeOfFreedom)theEObject;
				T result = caseADegreeOfFreedom(aDegreeOfFreedom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE: {
				AClassAsReferenceDegree aClassAsReferenceDegree = (AClassAsReferenceDegree)theEObject;
				T result = caseAClassAsReferenceDegree(aClassAsReferenceDegree);
				if (result == null) result = caseAClassDegree(aClassAsReferenceDegree);
				if (result == null) result = caseADegreeOfFreedom(aClassAsReferenceDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ACLASS_DEGREE: {
				AClassDegree aClassDegree = (AClassDegree)theEObject;
				T result = caseAClassDegree(aClassDegree);
				if (result == null) result = caseADegreeOfFreedom(aClassDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ACLASS_WITH_COPY_DEGREE: {
				AClassWithCopyDegree aClassWithCopyDegree = (AClassWithCopyDegree)theEObject;
				T result = caseAClassWithCopyDegree(aClassWithCopyDegree);
				if (result == null) result = caseAClassDegree(aClassWithCopyDegree);
				if (result == null) result = caseADegreeOfFreedom(aClassWithCopyDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE: {
				AContinuousRangeDegree aContinuousRangeDegree = (AContinuousRangeDegree)theEObject;
				T result = caseAContinuousRangeDegree(aContinuousRangeDegree);
				if (result == null) result = caseARangeDegree(aContinuousRangeDegree);
				if (result == null) result = caseAOrderedDataTypeDegree(aContinuousRangeDegree);
				if (result == null) result = caseADataTypeDegree(aContinuousRangeDegree);
				if (result == null) result = caseADegreeOfFreedom(aContinuousRangeDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ARANGE_DEGREE: {
				ARangeDegree aRangeDegree = (ARangeDegree)theEObject;
				T result = caseARangeDegree(aRangeDegree);
				if (result == null) result = caseAOrderedDataTypeDegree(aRangeDegree);
				if (result == null) result = caseADataTypeDegree(aRangeDegree);
				if (result == null) result = caseADegreeOfFreedom(aRangeDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ADATA_TYPE_DEGREE: {
				ADataTypeDegree aDataTypeDegree = (ADataTypeDegree)theEObject;
				T result = caseADataTypeDegree(aDataTypeDegree);
				if (result == null) result = caseADegreeOfFreedom(aDataTypeDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ADISCRETE_DEGREE: {
				ADiscreteDegree aDiscreteDegree = (ADiscreteDegree)theEObject;
				T result = caseADiscreteDegree(aDiscreteDegree);
				if (result == null) result = caseADataTypeDegree(aDiscreteDegree);
				if (result == null) result = caseADegreeOfFreedom(aDiscreteDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ADISCRETE_RANGE_DEGREE: {
				ADiscreteRangeDegree aDiscreteRangeDegree = (ADiscreteRangeDegree)theEObject;
				T result = caseADiscreteRangeDegree(aDiscreteRangeDegree);
				if (result == null) result = caseARangeDegree(aDiscreteRangeDegree);
				if (result == null) result = caseADiscreteDegree(aDiscreteRangeDegree);
				if (result == null) result = caseAOrderedDataTypeDegree(aDiscreteRangeDegree);
				if (result == null) result = caseADataTypeDegree(aDiscreteRangeDegree);
				if (result == null) result = caseADegreeOfFreedom(aDiscreteRangeDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.AENUM_DEGREE: {
				AEnumDegree aEnumDegree = (AEnumDegree)theEObject;
				T result = caseAEnumDegree(aEnumDegree);
				if (result == null) result = caseAUnorderedDegree(aEnumDegree);
				if (result == null) result = caseADataTypeDegree(aEnumDegree);
				if (result == null) result = caseADegreeOfFreedom(aEnumDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.AUNORDERED_DEGREE: {
				AUnorderedDegree aUnorderedDegree = (AUnorderedDegree)theEObject;
				T result = caseAUnorderedDegree(aUnorderedDegree);
				if (result == null) result = caseADataTypeDegree(aUnorderedDegree);
				if (result == null) result = caseADegreeOfFreedom(aUnorderedDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.AORDERED_DATA_TYPE_DEGREE: {
				AOrderedDataTypeDegree aOrderedDataTypeDegree = (AOrderedDataTypeDegree)theEObject;
				T result = caseAOrderedDataTypeDegree(aOrderedDataTypeDegree);
				if (result == null) result = caseADataTypeDegree(aOrderedDataTypeDegree);
				if (result == null) result = caseADegreeOfFreedom(aOrderedDataTypeDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.AORDERED_INTEGER_DEGREE: {
				AOrderedIntegerDegree aOrderedIntegerDegree = (AOrderedIntegerDegree)theEObject;
				T result = caseAOrderedIntegerDegree(aOrderedIntegerDegree);
				if (result == null) result = caseADiscreteDegree(aOrderedIntegerDegree);
				if (result == null) result = caseAOrderedDataTypeDegree(aOrderedIntegerDegree);
				if (result == null) result = caseADataTypeDegree(aOrderedIntegerDegree);
				if (result == null) result = caseADegreeOfFreedom(aOrderedIntegerDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDoFPackage.ASTRING_SET_DEGREE: {
				AStringSetDegree aStringSetDegree = (AStringSetDegree)theEObject;
				T result = caseAStringSetDegree(aStringSetDegree);
				if (result == null) result = caseAUnorderedDegree(aStringSetDegree);
				if (result == null) result = caseADataTypeDegree(aStringSetDegree);
				if (result == null) result = caseADegreeOfFreedom(aStringSetDegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changeable Element Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changeable Element Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeableElementDescription(ChangeableElementDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRule(ValueRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLRule(OCLRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper OCL Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper OCL Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperOCLDefinition(HelperOCLDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Context Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Context Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticContextRule(StaticContextRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionRule(SelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do FRepository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do FRepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoFRepository(DoFRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Selection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSelectionRule(InstanceSelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Selection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticSelectionRule(StaticSelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADegree Of Freedom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADegree Of Freedom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADegreeOfFreedom(ADegreeOfFreedom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass As Reference Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass As Reference Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassAsReferenceDegree(AClassAsReferenceDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassDegree(AClassDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClass With Copy Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClass With Copy Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassWithCopyDegree(AClassWithCopyDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AContinuous Range Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AContinuous Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAContinuousRangeDegree(AContinuousRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARange Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARange Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARangeDegree(ARangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AData Type Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AData Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADataTypeDegree(ADataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADiscrete Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADiscrete Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADiscreteDegree(ADiscreteDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADiscrete Range Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADiscrete Range Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADiscreteRangeDegree(ADiscreteRangeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEnum Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEnum Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEnumDegree(AEnumDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AUnordered Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AUnordered Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAUnorderedDegree(AUnorderedDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOrdered Data Type Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOrdered Data Type Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOrderedDataTypeDegree(AOrderedDataTypeDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOrdered Integer Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOrdered Integer Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOrderedIntegerDegree(AOrderedIntegerDegree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AString Set Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AString Set Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAStringSetDegree(AStringSetDegree object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenericDoFSwitch
