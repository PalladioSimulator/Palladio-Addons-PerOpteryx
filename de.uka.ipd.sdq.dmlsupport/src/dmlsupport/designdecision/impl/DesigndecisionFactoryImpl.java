/**
 */
package dmlsupport.designdecision.impl;

import dmlsupport.designdecision.*;
import dmlsupport.impl.DMLWorkflowConfigurationImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesigndecisionFactoryImpl extends EFactoryImpl implements DesigndecisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesigndecisionFactory init() {
		try {
			DesigndecisionFactory theDesigndecisionFactory = (DesigndecisionFactory)EPackage.Registry.INSTANCE.getEFactory(DesigndecisionPackage.eNS_URI);
			if (theDesigndecisionFactory != null) {
				return theDesigndecisionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DesigndecisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesigndecisionFactoryImpl() {
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
			case DesigndecisionPackage.METAMODEL_DESCRIPTION: return createMetamodelDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSEProblem createDSEProblem(DMLWorkflowConfigurationImpl dseConfig, ResourceSetPartition modelPartition) {
		DSEProblemImpl dseProblem = new DSEProblemImpl(dseConfig, modelPartition);
		return dseProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelDescription createMetamodelDescription() {
		MetamodelDescriptionImpl metamodelDescription = new MetamodelDescriptionImpl();
		return metamodelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesigndecisionPackage getDesigndecisionPackage() {
		return (DesigndecisionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DesigndecisionPackage getPackage() {
		return DesigndecisionPackage.eINSTANCE;
	}

} //DesigndecisionFactoryImpl
