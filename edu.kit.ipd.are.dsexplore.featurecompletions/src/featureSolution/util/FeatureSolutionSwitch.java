/**
 */
package featureSolution.util;

import FeatureCompletionModel.DescribedElement;
import FeatureCompletionModel.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import featureSolution.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see featureSolution.FeatureSolutionPackage
 * @generated
 */
public class FeatureSolutionSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureSolutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSolutionSwitch() {
		if (modelPackage == null) {
			modelPackage = FeatureSolutionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FeatureSolutionPackage.SOLUTION_REPOSITORY: {
				SolutionRepository solutionRepository = (SolutionRepository)theEObject;
				Object result = caseSolutionRepository(solutionRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				Object result = caseSolution(solution);
				if (result == null) result = caseDescribedElement(solution);
				if (result == null) result = caseNamedElement(solution);
				if (result == null) result = caseIdentifier(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.INCLUSION_MECHANISM: {
				InclusionMechanism inclusionMechanism = (InclusionMechanism)theEObject;
				Object result = caseInclusionMechanism(inclusionMechanism);
				if (result == null) result = caseDescribedElement(inclusionMechanism);
				if (result == null) result = caseNamedElement(inclusionMechanism);
				if (result == null) result = caseIdentifier(inclusionMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.ADAPTER_INCLUSION: {
				AdapterInclusion adapterInclusion = (AdapterInclusion)theEObject;
				Object result = caseAdapterInclusion(adapterInclusion);
				if (result == null) result = caseInclusionMechanism(adapterInclusion);
				if (result == null) result = caseDescribedElement(adapterInclusion);
				if (result == null) result = caseNamedElement(adapterInclusion);
				if (result == null) result = caseIdentifier(adapterInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.EXTENSION_INCLUSION: {
				ExtensionInclusion extensionInclusion = (ExtensionInclusion)theEObject;
				Object result = caseExtensionInclusion(extensionInclusion);
				if (result == null) result = caseInclusionMechanism(extensionInclusion);
				if (result == null) result = caseDescribedElement(extensionInclusion);
				if (result == null) result = caseNamedElement(extensionInclusion);
				if (result == null) result = caseIdentifier(extensionInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.SOLUTION_COMPONENT: {
				SolutionComponent solutionComponent = (SolutionComponent)theEObject;
				Object result = caseSolutionComponent(solutionComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSolutionRepository(SolutionRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusion Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusion Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInclusionMechanism(InclusionMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdapterInclusion(AdapterInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtensionInclusion(ExtensionInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSolutionComponent(SolutionComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDescribedElement(DescribedElement object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //FeatureSolutionSwitch
