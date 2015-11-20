/**
 */
package genericdesigndecision.pcmsupport.impl;

import genericdesigndecision.pcmsupport.*;

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
public class PcmsupportFactoryImpl extends EFactoryImpl implements PcmsupportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmsupportFactory init() {
		try {
			PcmsupportFactory thePcmsupportFactory = (PcmsupportFactory)EPackage.Registry.INSTANCE.getEFactory(PcmsupportPackage.eNS_URI);
			if (thePcmsupportFactory != null) {
				return thePcmsupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmsupportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmsupportFactoryImpl() {
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
			case PcmsupportPackage.PCM_METAMODEL_DESCRIPTION: return createPCMMetamodelDescription();
			case PcmsupportPackage.PCMDSE_PROBLEM: return createPCMDSEProblem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMMetamodelDescription createPCMMetamodelDescription() {
		PCMMetamodelDescriptionImpl pcmMetamodelDescription = new PCMMetamodelDescriptionImpl();
		return pcmMetamodelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMDSEProblem createPCMDSEProblem() {
		PCMDSEProblemImpl pcmdseProblem = new PCMDSEProblemImpl();
		return pcmdseProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmsupportPackage getPcmsupportPackage() {
		return (PcmsupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmsupportPackage getPackage() {
		return PcmsupportPackage.eINSTANCE;
	}

} //PcmsupportFactoryImpl
