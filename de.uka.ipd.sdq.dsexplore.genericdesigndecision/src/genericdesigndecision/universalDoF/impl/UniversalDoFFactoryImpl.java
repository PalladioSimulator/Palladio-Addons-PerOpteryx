/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.genericDoF.DegreeOfFreedom;

import genericdesigndecision.universalDoF.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case UniversalDoFPackage.GDO_FREPOSITORY: return createGDoFRepository();
			case UniversalDoFPackage.GENERIC_DO_F: return createGenericDoF();
			case UniversalDoFPackage.UNIVERSAL_DO_F: return createUniversalDoF();
			case UniversalDoFPackage.GENERIC_DO_FTO_DEGREE_OF_FREEDOM: return (EObject)createGenericDoFToDegreeOfFreedom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UniversalDoFPackage.METAMODEL:
				return createMetamodelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UniversalDoFPackage.METAMODEL:
				return convertMetamodelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	 * @generated NOT
	 */
	public UniversalDoF createUniversalDoF() {
		return UniversalDoFImpl.getUniversalDoFImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<GenericDoF, DegreeOfFreedom> createGenericDoFToDegreeOfFreedom() {
		GenericDoFToDegreeOfFreedomImpl genericDoFToDegreeOfFreedom = new GenericDoFToDegreeOfFreedomImpl();
		return genericDoFToDegreeOfFreedom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodelFromString(EDataType eDataType, String initialValue) {
		Metamodel result = Metamodel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetamodelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
