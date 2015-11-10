/**
 */
package genericdesigndecision.UniversalDoF.impl;

import genericdesigndecision.GenericDoF.DegreeOfFreedom;

import genericdesigndecision.UniversalDoF.*;

import java.util.Map;

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
public class UniversalDoFFactoryImpl extends EFactoryImpl implements UniversalDoFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversalDoFFactory init() {
		try {
			UniversalDoFFactory theUniversalDoFFactory = (UniversalDoFFactory)EPackage.Registry.INSTANCE.getEFactory(UniversalDoFPackage.eNS_URI);
			if (theUniversalDoFFactory != null) {
				return theUniversalDoFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversalDoFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoFFactoryImpl() {
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
			case UniversalDoFPackage.GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP: return (EObject)createGenericDoFToDegreeOfFreedomMap();
			case UniversalDoFPackage.METAMODEL_DESCRIPTION: return createMetamodelDescription();
			case UniversalDoFPackage.GDO_FREPOSITORY: return createGDoFRepository();
			case UniversalDoFPackage.GENERIC_DO_F: return createGenericDoF();
			case UniversalDoFPackage.UNIVERSAL_DO_F: return createUniversalDoF();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<GenericDoF, DegreeOfFreedom> createGenericDoFToDegreeOfFreedomMap() {
		GenericDoFToDegreeOfFreedomMapImpl genericDoFToDegreeOfFreedomMap = new GenericDoFToDegreeOfFreedomMapImpl();
		return genericDoFToDegreeOfFreedomMap;
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
	public GDoFRepository createGDoFRepository() {
		GDoFRepositoryImpl gDoFRepository = new GDoFRepositoryImpl();
		return gDoFRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoF createGenericDoF() {
		GenericDoFImpl genericDoF = new GenericDoFImpl();
		return genericDoF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoF createUniversalDoF() {
		UniversalDoFImpl universalDoF = new UniversalDoFImpl();
		return universalDoF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoFPackage getUniversalDoFPackage() {
		return (UniversalDoFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversalDoFPackage getPackage() {
		return UniversalDoFPackage.eINSTANCE;
	}

} //UniversalDoFFactoryImpl
