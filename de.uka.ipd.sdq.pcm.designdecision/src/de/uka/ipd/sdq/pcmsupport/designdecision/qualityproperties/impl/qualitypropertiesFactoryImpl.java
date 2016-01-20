/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesFactory;
import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class qualitypropertiesFactoryImpl extends EFactoryImpl implements qualitypropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static qualitypropertiesFactory init() {
		try {
			qualitypropertiesFactory thequalitypropertiesFactory = (qualitypropertiesFactory) EPackage.Registry.INSTANCE
					.getEFactory(qualitypropertiesPackage.eNS_URI);
			if (thequalitypropertiesFactory != null) {
				return thequalitypropertiesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new qualitypropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypropertiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypropertiesPackage getqualitypropertiesPackage() {
		return (qualitypropertiesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static qualitypropertiesPackage getPackage() {
		return qualitypropertiesPackage.eINSTANCE;
	}

} // qualitypropertiesFactoryImpl
