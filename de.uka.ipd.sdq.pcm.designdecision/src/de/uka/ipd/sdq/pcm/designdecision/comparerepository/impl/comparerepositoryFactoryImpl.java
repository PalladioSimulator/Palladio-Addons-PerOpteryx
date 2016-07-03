/**
 */
package de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl;

import de.uka.ipd.sdq.pcm.designdecision.comparerepository.*;

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
public class comparerepositoryFactoryImpl extends EFactoryImpl implements comparerepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static comparerepositoryFactory init() {
		try {
			comparerepositoryFactory thecomparerepositoryFactory = (comparerepositoryFactory) EPackage.Registry.INSTANCE
					.getEFactory(comparerepositoryPackage.eNS_URI);
			if (thecomparerepositoryFactory != null) {
				return thecomparerepositoryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new comparerepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comparerepositoryFactoryImpl() {
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
		case comparerepositoryPackage.DIFF:
			return createDiff();
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
	public Diff createDiff() {
		DiffImpl diff = new DiffImpl();
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public comparerepositoryPackage getcomparerepositoryPackage() {
		return (comparerepositoryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static comparerepositoryPackage getPackage() {
		return comparerepositoryPackage.eINSTANCE;
	}

} //comparerepositoryFactoryImpl
