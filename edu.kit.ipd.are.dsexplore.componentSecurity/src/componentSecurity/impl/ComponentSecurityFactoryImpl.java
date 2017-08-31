/**
 */
package componentSecurity.impl;

import componentSecurity.*;

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
public class ComponentSecurityFactoryImpl extends EFactoryImpl implements ComponentSecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentSecurityFactory init() {
		try {
			ComponentSecurityFactory theComponentSecurityFactory = (ComponentSecurityFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentSecurityPackage.eNS_URI);
			if (theComponentSecurityFactory != null) {
				return theComponentSecurityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentSecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurityFactoryImpl() {
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
			case ComponentSecurityPackage.COMPONENT_SECURITY: return createComponentSecurity();
			case ComponentSecurityPackage.COMPONENT_SECURITY_REPOSITORY: return createComponentSecurityRepository();
			case ComponentSecurityPackage.SECURITY_TARGET: return createSecurityTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurity createComponentSecurity() {
		ComponentSecurityImpl componentSecurity = new ComponentSecurityImpl();
		return componentSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurityRepository createComponentSecurityRepository() {
		ComponentSecurityRepositoryImpl componentSecurityRepository = new ComponentSecurityRepositoryImpl();
		return componentSecurityRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityTarget createSecurityTarget() {
		SecurityTargetImpl securityTarget = new SecurityTargetImpl();
		return securityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurityPackage getComponentSecurityPackage() {
		return (ComponentSecurityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentSecurityPackage getPackage() {
		return ComponentSecurityPackage.eINSTANCE;
	}

} //ComponentSecurityFactoryImpl
