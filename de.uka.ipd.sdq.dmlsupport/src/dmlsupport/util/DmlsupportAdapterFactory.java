/**
 */
package dmlsupport.util;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import dmlsupport.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.DmlsupportPackage
 * @generated
 */
public class DmlsupportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmlsupportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmlsupportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DmlsupportPackage.eINSTANCE;
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
	protected DmlsupportSwitch<Adapter> modelSwitch =
		new DmlsupportSwitch<Adapter>() {
			@Override
			public Adapter caseDMLWorkflowConfiguration(DMLWorkflowConfiguration object) {
				return createDMLWorkflowConfigurationAdapter();
			}
			@Override
			public Adapter caseDMLWorkflowConfigurationBuilder(DMLWorkflowConfigurationBuilder object) {
				return createDMLWorkflowConfigurationBuilderAdapter();
			}
			@Override
			public Adapter caseDSEWorkflowConfiguration(DSEWorkflowConfiguration object) {
				return createDSEWorkflowConfigurationAdapter();
			}
			@Override
			public Adapter caseAbstractWorkflowConfigurationBuilder(AbstractWorkflowConfigurationBuilder object) {
				return createAbstractWorkflowConfigurationBuilderAdapter();
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
	 * Creates a new adapter for an object of class '{@link dmlsupport.DMLWorkflowConfiguration <em>DML Workflow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmlsupport.DMLWorkflowConfiguration
	 * @generated
	 */
	public Adapter createDMLWorkflowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmlsupport.DMLWorkflowConfigurationBuilder <em>DML Workflow Configuration Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmlsupport.DMLWorkflowConfigurationBuilder
	 * @generated
	 */
	public Adapter createDMLWorkflowConfigurationBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration <em>DSE Workflow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration
	 * @generated
	 */
	public Adapter createDSEWorkflowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder <em>Abstract Workflow Configuration Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder
	 * @generated
	 */
	public Adapter createAbstractWorkflowConfigurationBuilderAdapter() {
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

} //DmlsupportAdapterFactory
