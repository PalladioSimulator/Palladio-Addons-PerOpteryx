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
			public Adapter caseDegreeOfFreedom(DegreeOfFreedom object) {
				return createDegreeOfFreedomAdapter();
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
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.genericDoF.DegreeOfFreedom <em>Degree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom
	 * @generated
	 */
	public Adapter createDegreeOfFreedomAdapter() {
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
