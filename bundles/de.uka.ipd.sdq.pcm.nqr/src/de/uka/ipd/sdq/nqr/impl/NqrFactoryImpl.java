/**
 */
package de.uka.ipd.sdq.nqr.impl;

import de.uka.ipd.sdq.nqr.*;

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
public class NqrFactoryImpl extends EFactoryImpl implements NqrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NqrFactory init() {
		try {
			NqrFactory theNqrFactory = (NqrFactory)EPackage.Registry.INSTANCE.getEFactory(NqrPackage.eNS_URI);
			if (theNqrFactory != null) {
				return theNqrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NqrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrFactoryImpl() {
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
			case NqrPackage.NQR_REPOSITORY: return createNqrRepository();
			case NqrPackage.NQR: return createNqr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrRepository createNqrRepository() {
		NqrRepositoryImpl nqrRepository = new NqrRepositoryImpl();
		return nqrRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nqr createNqr() {
		NqrImpl nqr = new NqrImpl();
		return nqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrPackage getNqrPackage() {
		return (NqrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NqrPackage getPackage() {
		return NqrPackage.eINSTANCE;
	}

} //NqrFactoryImpl
