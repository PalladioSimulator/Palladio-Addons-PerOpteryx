/**
 */
package dmlsupport.representation.impl;

import dmlsupport.representation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.dsexplore.launch.QMLManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentationFactoryImpl extends EFactoryImpl implements RepresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepresentationFactory init() {
		try {
			RepresentationFactory theRepresentationFactory = (RepresentationFactory)EPackage.Registry.INSTANCE.getEFactory(RepresentationPackage.eNS_URI);
			if (theRepresentationFactory != null) {
				return theRepresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationFactoryImpl() {
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
	public DML_DSEOptionsTabImpl createDML_DSEOptionsTab() {
		DML_DSEOptionsTabImpl dmL_DSEOptionsTab = new DML_DSEOptionsTabImpl();
		return dmL_DSEOptionsTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMLFileNamesInputImpl createDMLFileNamesInput(QMLManager qmlManager) {
		DMLFileNamesInputImpl dmlFileNamesInput = new DMLFileNamesInputImpl();
		return dmlFileNamesInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationPackage getRepresentationPackage() {
		return (RepresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepresentationPackage getPackage() {
		return RepresentationPackage.eINSTANCE;
	}

} //RepresentationFactoryImpl
