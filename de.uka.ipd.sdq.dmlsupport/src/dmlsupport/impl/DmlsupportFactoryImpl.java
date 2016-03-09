/**
 */
package dmlsupport.impl;

import dmlsupport.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.EClass;
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
public class DmlsupportFactoryImpl extends EFactoryImpl implements DmlsupportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DmlsupportFactory init() {
		try {
			DmlsupportFactory theDmlsupportFactory = (DmlsupportFactory)EPackage.Registry.INSTANCE.getEFactory(DmlsupportPackage.eNS_URI);
			if (theDmlsupportFactory != null) {
				return theDmlsupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DmlsupportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmlsupportFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMLWorkflowConfigurationImpl createDMLWorkflowConfiguration() {
		DMLWorkflowConfigurationImpl dmlWorkflowConfiguration = new DMLWorkflowConfigurationImpl();
		return dmlWorkflowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMLWorkflowConfigurationBuilderImpl createDMLWorkflowConfigurationBuilder(ILaunchConfiguration configuration, String mode) {
		DMLWorkflowConfigurationBuilderImpl dmlWorkflowConfigurationBuilder = null;
		try {
			dmlWorkflowConfigurationBuilder = new DMLWorkflowConfigurationBuilderImpl(configuration, mode);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return dmlWorkflowConfigurationBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmlsupportPackage getDmlsupportPackage() {
		return (DmlsupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DmlsupportPackage getPackage() {
		return DmlsupportPackage.eINSTANCE;
	}

} //DmlsupportFactoryImpl
