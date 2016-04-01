/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.*;

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
public class DimensionsFactoryImpl extends EFactoryImpl implements DimensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimensionsFactory init() {
		try {
			DimensionsFactory theDimensionsFactory = (DimensionsFactory)EPackage.Registry.INSTANCE.getEFactory(DimensionsPackage.eNS_URI);
			if (theDimensionsFactory != null) {
				return theDimensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DimensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsFactoryImpl() {
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
			case DimensionsPackage.DIMENSION: return (EObject)createDimension();
			case DimensionsPackage.DIMENSION_REPOSITORY: return (EObject)createDimensionRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionRepository createDimensionRepository() {
		DimensionRepositoryImpl dimensionRepository = new DimensionRepositoryImpl();
		return dimensionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsPackage getDimensionsPackage() {
		return (DimensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DimensionsPackage getPackage() {
		return DimensionsPackage.eINSTANCE;
	}

} //DimensionsFactoryImpl
