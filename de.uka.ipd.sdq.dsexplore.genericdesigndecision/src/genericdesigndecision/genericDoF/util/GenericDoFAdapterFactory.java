/**
 */
package genericdesigndecision.genericDoF.util;

import genericdesigndecision.genericDoF.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see genericdesigndecision.genericDoF.GenericDoFPackage
 * @generated
 */
public class GenericDoFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericDoFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenericDoFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDoFSwitch<Adapter> modelSwitch =
		new GenericDoFSwitch<Adapter>() {
			@Override
			public Adapter caseChangeableElementDescription(ChangeableElementDescription object) {
				return createChangeableElementDescriptionAdapter();
			}
			@Override
			public Adapter caseValueRule(ValueRule object) {
				return createValueRuleAdapter();
			}
			@Override
			public Adapter caseOCLRule(OCLRule object) {
				return createOCLRuleAdapter();
			}
			@Override
			public Adapter caseHelperOCLDefinition(HelperOCLDefinition object) {
				return createHelperOCLDefinitionAdapter();
			}
			@Override
			public Adapter caseStaticContextRule(StaticContextRule object) {
				return createStaticContextRuleAdapter();
			}
			@Override
			public Adapter caseSelectionRule(SelectionRule object) {
				return createSelectionRuleAdapter();
			}
			@Override
			public Adapter caseDoFRepository(DoFRepository object) {
				return createDoFRepositoryAdapter();
			}
			@Override
			public Adapter caseInstanceSelectionRule(InstanceSelectionRule object) {
				return createInstanceSelectionRuleAdapter();
			}
			@Override
			public Adapter caseStaticSelectionRule(StaticSelectionRule object) {
				return createStaticSelectionRuleAdapter();
			}
			@Override
			public Adapter caseADegreeOfFreedom(ADegreeOfFreedom object) {
				return createADegreeOfFreedomAdapter();
			}
			@Override
			public Adapter caseAClassAsReferenceDegree(AClassAsReferenceDegree object) {
				return createAClassAsReferenceDegreeAdapter();
			}
			@Override
			public Adapter caseAClassDegree(AClassDegree object) {
				return createAClassDegreeAdapter();
			}
			@Override
			public Adapter caseAClassWithCopyDegree(AClassWithCopyDegree object) {
				return createAClassWithCopyDegreeAdapter();
			}
			@Override
			public Adapter caseAContinuousRangeDegree(AContinuousRangeDegree object) {
				return createAContinuousRangeDegreeAdapter();
			}
			@Override
			public Adapter caseARangeDegree(ARangeDegree object) {
				return createARangeDegreeAdapter();
			}
			@Override
			public Adapter caseADataTypeDegree(ADataTypeDegree object) {
				return createADataTypeDegreeAdapter();
			}
			@Override
			public Adapter caseADiscreteDegree(ADiscreteDegree object) {
				return createADiscreteDegreeAdapter();
			}
			@Override
			public Adapter caseADiscreteRangeDegree(ADiscreteRangeDegree object) {
				return createADiscreteRangeDegreeAdapter();
			}
			@Override
			public Adapter caseAEnumDegree(AEnumDegree object) {
				return createAEnumDegreeAdapter();
			}
			@Override
			public Adapter caseAUnorderedDegree(AUnorderedDegree object) {
				return createAUnorderedDegreeAdapter();
			}
			@Override
			public Adapter caseAOrderedDataTypeDegree(AOrderedDataTypeDegree object) {
				return createAOrderedDataTypeDegreeAdapter();
			}
			@Override
			public Adapter caseAOrderedIntegerDegree(AOrderedIntegerDegree object) {
				return createAOrderedIntegerDegreeAdapter();
			}
			@Override
			public Adapter caseAStringSetDegree(AStringSetDegree object) {
				return createAStringSetDegreeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ChangeableElementDescription <em>Changeable Element Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ChangeableElementDescription
	 * @generated
	 */
	public Adapter createChangeableElementDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ValueRule <em>Value Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ValueRule
	 * @generated
	 */
	public Adapter createValueRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.OCLRule <em>OCL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.OCLRule
	 * @generated
	 */
	public Adapter createOCLRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.HelperOCLDefinition <em>Helper OCL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.HelperOCLDefinition
	 * @generated
	 */
	public Adapter createHelperOCLDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.StaticContextRule <em>Static Context Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.StaticContextRule
	 * @generated
	 */
	public Adapter createStaticContextRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.SelectionRule <em>Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.SelectionRule
	 * @generated
	 */
	public Adapter createSelectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.DoFRepository <em>Do FRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.DoFRepository
	 * @generated
	 */
	public Adapter createDoFRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.InstanceSelectionRule <em>Instance Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.InstanceSelectionRule
	 * @generated
	 */
	public Adapter createInstanceSelectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.StaticSelectionRule <em>Static Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.StaticSelectionRule
	 * @generated
	 */
	public Adapter createStaticSelectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom <em>ADegree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom
	 * @generated
	 */
	public Adapter createADegreeOfFreedomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassAsReferenceDegree <em>AClass As Reference Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassAsReferenceDegree
	 * @generated
	 */
	public Adapter createAClassAsReferenceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassDegree <em>AClass Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassDegree
	 * @generated
	 */
	public Adapter createAClassDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AClassWithCopyDegree <em>AClass With Copy Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AClassWithCopyDegree
	 * @generated
	 */
	public Adapter createAClassWithCopyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree <em>AContinuous Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree
	 * @generated
	 */
	public Adapter createAContinuousRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ARangeDegree <em>ARange Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ARangeDegree
	 * @generated
	 */
	public Adapter createARangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADataTypeDegree <em>AData Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADataTypeDegree
	 * @generated
	 */
	public Adapter createADataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADiscreteDegree <em>ADiscrete Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADiscreteDegree
	 * @generated
	 */
	public Adapter createADiscreteDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree <em>ADiscrete Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.ADiscreteRangeDegree
	 * @generated
	 */
	public Adapter createADiscreteRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AEnumDegree <em>AEnum Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AEnumDegree
	 * @generated
	 */
	public Adapter createAEnumDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AUnorderedDegree <em>AUnordered Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AUnorderedDegree
	 * @generated
	 */
	public Adapter createAUnorderedDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AOrderedDataTypeDegree <em>AOrdered Data Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AOrderedDataTypeDegree
	 * @generated
	 */
	public Adapter createAOrderedDataTypeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AOrderedIntegerDegree <em>AOrdered Integer Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AOrderedIntegerDegree
	 * @generated
	 */
	public Adapter createAOrderedIntegerDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.AStringSetDegree <em>AString Set Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.AStringSetDegree
	 * @generated
	 */
	public Adapter createAStringSetDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenericDoFAdapterFactory
