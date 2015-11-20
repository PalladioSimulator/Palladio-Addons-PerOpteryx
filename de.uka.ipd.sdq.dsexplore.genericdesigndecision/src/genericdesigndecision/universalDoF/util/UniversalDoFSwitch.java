/**
 */
package genericdesigndecision.universalDoF.util;

import genericdesigndecision.genericDoF.DegreeOfFreedom;

import genericdesigndecision.universalDoF.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage
 * @generated
 */
public class UniversalDoFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UniversalDoFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoFSwitch() {
		if (modelPackage == null) {
			modelPackage = UniversalDoFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UniversalDoFPackage.GDO_FREPOSITORY: {
				GDoFRepository gDoFRepository = (GDoFRepository)theEObject;
				T result = caseGDoFRepository(gDoFRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversalDoFPackage.GENERIC_DO_F: {
				GenericDoF genericDoF = (GenericDoF)theEObject;
				T result = caseGenericDoF(genericDoF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION: {
				AMetamodelDescription aMetamodelDescription = (AMetamodelDescription)theEObject;
				T result = caseAMetamodelDescription(aMetamodelDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversalDoFPackage.UNIVERSAL_DO_F: {
				UniversalDoF universalDoF = (UniversalDoF)theEObject;
				T result = caseUniversalDoF(universalDoF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversalDoFPackage.GENERIC_DO_FTO_DEGREE_OF_FREEDOM: {
				@SuppressWarnings("unchecked") Map.Entry<GenericDoF, DegreeOfFreedom> genericDoFToDegreeOfFreedom = (Map.Entry<GenericDoF, DegreeOfFreedom>)theEObject;
				T result = caseGenericDoFToDegreeOfFreedom(genericDoFToDegreeOfFreedom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GDo FRepository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GDo FRepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGDoFRepository(GDoFRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Do F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Do F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDoF(GenericDoF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMetamodel Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMetamodel Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMetamodelDescription(AMetamodelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Do F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Do F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalDoF(UniversalDoF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Do FTo Degree Of Freedom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Do FTo Degree Of Freedom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDoFToDegreeOfFreedom(Map.Entry<GenericDoF, DegreeOfFreedom> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UniversalDoFSwitch
