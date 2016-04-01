/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.impl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.*;

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
public class QMLContractTypeFactoryImpl extends EFactoryImpl implements QMLContractTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QMLContractTypeFactory init() {
		try {
			QMLContractTypeFactory theQMLContractTypeFactory = (QMLContractTypeFactory)EPackage.Registry.INSTANCE.getEFactory(QMLContractTypePackage.eNS_URI);
			if (theQMLContractTypeFactory != null) {
				return theQMLContractTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QMLContractTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractTypeFactoryImpl() {
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
			case QMLContractTypePackage.QML_CONTRACT_TYPE: return (EObject)createQMLContractType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractType createQMLContractType() {
		QMLContractTypeImpl qmlContractType = new QMLContractTypeImpl();
		return qmlContractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractTypePackage getQMLContractTypePackage() {
		return (QMLContractTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QMLContractTypePackage getPackage() {
		return QMLContractTypePackage.eINSTANCE;
	}

} //QMLContractTypeFactoryImpl
