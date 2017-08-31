/**
 */
package componentSecurity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see componentSecurity.ComponentSecurityFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentSecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentSecurity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/componentSecurity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentSecurity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSecurityPackage eINSTANCE = componentSecurity.impl.ComponentSecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentSecurity.impl.ComponentSecurityImpl <em>Component Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSecurity.impl.ComponentSecurityImpl
	 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getComponentSecurity()
	 * @generated
	 */
	int COMPONENT_SECURITY = 0;

	/**
	 * The feature id for the '<em><b>Po Co B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY__PO_CO_B = 0;

	/**
	 * The feature id for the '<em><b>TTDV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY__TTDV = 1;

	/**
	 * The number of structural features of the '<em>Component Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link componentSecurity.impl.ComponentSecurityRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSecurity.impl.ComponentSecurityRepositoryImpl
	 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getComponentSecurityRepository()
	 * @generated
	 */
	int COMPONENT_SECURITY_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Componentsecurity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_REPOSITORY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link componentSecurity.impl.SecurityTargetImpl <em>Security Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentSecurity.impl.SecurityTargetImpl
	 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getSecurityTarget()
	 * @generated
	 */
	int SECURITY_TARGET = 2;

	/**
	 * The number of structural features of the '<em>Security Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_TARGET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link componentSecurity.ComponentSecurity <em>Component Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Security</em>'.
	 * @see componentSecurity.ComponentSecurity
	 * @generated
	 */
	EClass getComponentSecurity();

	/**
	 * Returns the meta object for the attribute '{@link componentSecurity.ComponentSecurity#getPoCoB <em>Po Co B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Po Co B</em>'.
	 * @see componentSecurity.ComponentSecurity#getPoCoB()
	 * @see #getComponentSecurity()
	 * @generated
	 */
	EAttribute getComponentSecurity_PoCoB();

	/**
	 * Returns the meta object for the attribute '{@link componentSecurity.ComponentSecurity#getTTDV <em>TTDV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TTDV</em>'.
	 * @see componentSecurity.ComponentSecurity#getTTDV()
	 * @see #getComponentSecurity()
	 * @generated
	 */
	EAttribute getComponentSecurity_TTDV();

	/**
	 * Returns the meta object for class '{@link componentSecurity.ComponentSecurityRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see componentSecurity.ComponentSecurityRepository
	 * @generated
	 */
	EClass getComponentSecurityRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link componentSecurity.ComponentSecurityRepository#getComponentsecurity <em>Componentsecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentsecurity</em>'.
	 * @see componentSecurity.ComponentSecurityRepository#getComponentsecurity()
	 * @see #getComponentSecurityRepository()
	 * @generated
	 */
	EReference getComponentSecurityRepository_Componentsecurity();

	/**
	 * Returns the meta object for class '{@link componentSecurity.SecurityTarget <em>Security Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Target</em>'.
	 * @see componentSecurity.SecurityTarget
	 * @generated
	 */
	EClass getSecurityTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentSecurityFactory getComponentSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link componentSecurity.impl.ComponentSecurityImpl <em>Component Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSecurity.impl.ComponentSecurityImpl
		 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getComponentSecurity()
		 * @generated
		 */
		EClass COMPONENT_SECURITY = eINSTANCE.getComponentSecurity();

		/**
		 * The meta object literal for the '<em><b>Po Co B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SECURITY__PO_CO_B = eINSTANCE.getComponentSecurity_PoCoB();

		/**
		 * The meta object literal for the '<em><b>TTDV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SECURITY__TTDV = eINSTANCE.getComponentSecurity_TTDV();

		/**
		 * The meta object literal for the '{@link componentSecurity.impl.ComponentSecurityRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSecurity.impl.ComponentSecurityRepositoryImpl
		 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getComponentSecurityRepository()
		 * @generated
		 */
		EClass COMPONENT_SECURITY_REPOSITORY = eINSTANCE.getComponentSecurityRepository();

		/**
		 * The meta object literal for the '<em><b>Componentsecurity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY = eINSTANCE.getComponentSecurityRepository_Componentsecurity();

		/**
		 * The meta object literal for the '{@link componentSecurity.impl.SecurityTargetImpl <em>Security Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentSecurity.impl.SecurityTargetImpl
		 * @see componentSecurity.impl.ComponentSecurityPackageImpl#getSecurityTarget()
		 * @generated
		 */
		EClass SECURITY_TARGET = eINSTANCE.getSecurityTarget();

	}

} //ComponentSecurityPackage
