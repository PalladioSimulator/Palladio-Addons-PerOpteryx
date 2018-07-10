/**
 */
package FeatureCompletionModel.util;

import FeatureCompletionModel.*;

import de.uka.ipd.sdq.identifier.Identifier;

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
 * @see FeatureCompletionModel.FeatureCompletionPackage
 * @generated
 */
public class FeatureCompletionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureCompletionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionSwitch() {
		if (modelPackage == null) {
			modelPackage = FeatureCompletionPackage.eINSTANCE;
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY: {
				FeatureCompletionRepository featureCompletionRepository = (FeatureCompletionRepository)theEObject;
				T result = caseFeatureCompletionRepository(featureCompletionRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.FEATURE_COMPLETION: {
				FeatureCompletion featureCompletion = (FeatureCompletion)theEObject;
				T result = caseFeatureCompletion(featureCompletion);
				if (result == null) result = caseDescribedElement(featureCompletion);
				if (result == null) result = caseNamedElement(featureCompletion);
				if (result == null) result = caseIdentifier(featureCompletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.COMPLETION_COMPONENT: {
				CompletionComponent completionComponent = (CompletionComponent)theEObject;
				T result = caseCompletionComponent(completionComponent);
				if (result == null) result = caseConstrainableElement(completionComponent);
				if (result == null) result = caseDescribedElement(completionComponent);
				if (result == null) result = caseNamedElement(completionComponent);
				if (result == null) result = caseIdentifier(completionComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.DESCRIBED_ELEMENT: {
				DescribedElement describedElement = (DescribedElement)theEObject;
				T result = caseDescribedElement(describedElement);
				if (result == null) result = caseNamedElement(describedElement);
				if (result == null) result = caseIdentifier(describedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseIdentifier(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.PERIMETER_PROVIDING: {
				PerimeterProviding perimeterProviding = (PerimeterProviding)theEObject;
				T result = casePerimeterProviding(perimeterProviding);
				if (result == null) result = caseNamedElement(perimeterProviding);
				if (result == null) result = caseIdentifier(perimeterProviding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS: {
				ComplementumVisnetis complementumVisnetis = (ComplementumVisnetis)theEObject;
				T result = caseComplementumVisnetis(complementumVisnetis);
				if (result == null) result = caseComplementum(complementumVisnetis);
				if (result == null) result = caseConstrainableElement(complementumVisnetis);
				if (result == null) result = caseDescribedElement(complementumVisnetis);
				if (result == null) result = caseNamedElement(complementumVisnetis);
				if (result == null) result = caseIdentifier(complementumVisnetis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.COMPLEMENTUM: {
				Complementum complementum = (Complementum)theEObject;
				T result = caseComplementum(complementum);
				if (result == null) result = caseDescribedElement(complementum);
				if (result == null) result = caseNamedElement(complementum);
				if (result == null) result = caseIdentifier(complementum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS: {
				ArchitectureConstraints architectureConstraints = (ArchitectureConstraints)theEObject;
				T result = caseArchitectureConstraints(architectureConstraints);
				if (result == null) result = caseDescribedElement(architectureConstraints);
				if (result == null) result = caseNamedElement(architectureConstraints);
				if (result == null) result = caseIdentifier(architectureConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.CONSTRAINABLE_ELEMENT: {
				ConstrainableElement constrainableElement = (ConstrainableElement)theEObject;
				T result = caseConstrainableElement(constrainableElement);
				if (result == null) result = caseDescribedElement(constrainableElement);
				if (result == null) result = caseNamedElement(constrainableElement);
				if (result == null) result = caseIdentifier(constrainableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureCompletionPackage.PERIMETER_REQUIRING: {
				PerimeterRequiring perimeterRequiring = (PerimeterRequiring)theEObject;
				T result = casePerimeterRequiring(perimeterRequiring);
				if (result == null) result = caseNamedElement(perimeterRequiring);
				if (result == null) result = caseIdentifier(perimeterRequiring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCompletionRepository(FeatureCompletionRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Completion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCompletion(FeatureCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionComponent(CompletionComponent object) {
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
	public T caseDescribedElement(DescribedElement object) {
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
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perimeter Providing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perimeter Providing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerimeterProviding(PerimeterProviding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementum Visnetis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementum Visnetis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementumVisnetis(ComplementumVisnetis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementum(Complementum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureConstraints(ArchitectureConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrainable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrainable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainableElement(ConstrainableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perimeter Requiring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perimeter Requiring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerimeterRequiring(PerimeterRequiring object) {
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
	public T caseIdentifier(Identifier object) {
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

} //FeatureCompletionSwitch
