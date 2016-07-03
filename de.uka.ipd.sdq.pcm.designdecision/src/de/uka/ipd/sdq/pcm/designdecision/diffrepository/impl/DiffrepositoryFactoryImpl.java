/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl;

import de.uka.ipd.sdq.pcm.designdecision.diffrepository.*;

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
public class DiffrepositoryFactoryImpl extends EFactoryImpl implements DiffrepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiffrepositoryFactory init() {
		try {
			DiffrepositoryFactory theDiffrepositoryFactory = (DiffrepositoryFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiffrepositoryPackage.eNS_URI);
			if (theDiffrepositoryFactory != null) {
				return theDiffrepositoryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiffrepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffrepositoryFactoryImpl() {
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
		case DiffrepositoryPackage.DIFF_MODEL_REPOSITORY:
			return createDiffModelRepository();
		case DiffrepositoryPackage.DIFF_MODEL:
			return createDiffModel();
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
	public DiffModelRepository createDiffModelRepository() {
		DiffModelRepositoryImpl diffModelRepository = new DiffModelRepositoryImpl();
		return diffModelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffModel createDiffModel() {
		DiffModelImpl diffModel = new DiffModelImpl();
		return diffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffrepositoryPackage getDiffrepositoryPackage() {
		return (DiffrepositoryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiffrepositoryPackage getPackage() {
		return DiffrepositoryPackage.eINSTANCE;
	}

} //DiffrepositoryFactoryImpl
