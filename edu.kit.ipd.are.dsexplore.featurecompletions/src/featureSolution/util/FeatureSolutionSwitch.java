/**
 */
package featureSolution.util;

import FeatureCompletionModel.DescribedElement;
import FeatureCompletionModel.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import featureSolution.*;

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
 * @see featureSolution.FeatureSolutionPackage
 * @generated
 */
public class FeatureSolutionSwitch<T> extends Switch<T> {
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
			case FeatureSolutionPackage.INCLUSION_MECHANISM: {
				InclusionMechanism inclusionMechanism = (InclusionMechanism)theEObject;
				T result = caseInclusionMechanism(inclusionMechanism);
				if (result == null) result = caseDescribedElement(inclusionMechanism);
				if (result == null) result = caseNamedElement(inclusionMechanism);
				if (result == null) result = caseIdentifier(inclusionMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.ADAPTER_INCLUSION: {
				AdapterInclusion adapterInclusion = (AdapterInclusion)theEObject;
				T result = caseAdapterInclusion(adapterInclusion);
				if (result == null) result = caseInclusionMechanism(adapterInclusion);
				if (result == null) result = caseDescribedElement(adapterInclusion);
				if (result == null) result = caseNamedElement(adapterInclusion);
				if (result == null) result = caseIdentifier(adapterInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.EXTENSION_INCLUSION: {
				ExtensionInclusion extensionInclusion = (ExtensionInclusion)theEObject;
				T result = caseExtensionInclusion(extensionInclusion);
				if (result == null) result = caseInclusionMechanism(extensionInclusion);
				if (result == null) result = caseDescribedElement(extensionInclusion);
				if (result == null) result = caseNamedElement(extensionInclusion);
				if (result == null) result = caseIdentifier(extensionInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.PLACEMENT_STRATEGY: {
				PlacementStrategy placementStrategy = (PlacementStrategy)theEObject;
				T result = casePlacementStrategy(placementStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY: {
				ExternalCallPlacementStrategy externalCallPlacementStrategy = (ExternalCallPlacementStrategy)theEObject;
				T result = caseExternalCallPlacementStrategy(externalCallPlacementStrategy);
				if (result == null) result = casePlacementStrategy(externalCallPlacementStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY: {
				InternalActionPlacementStrategy internalActionPlacementStrategy = (InternalActionPlacementStrategy)theEObject;
				T result = caseInternalActionPlacementStrategy(internalActionPlacementStrategy);
				if (result == null) result = casePlacementStrategy(internalActionPlacementStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY: {
				ControlFlowPlacementStrategy controlFlowPlacementStrategy = (ControlFlowPlacementStrategy)theEObject;
				T result = caseControlFlowPlacementStrategy(controlFlowPlacementStrategy);
				if (result == null) result = casePlacementStrategy(controlFlowPlacementStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.POINT_CUT: {
				PointCut pointCut = (PointCut)theEObject;
				T result = casePointCut(pointCut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.ADVICE: {
				Advice advice = (Advice)theEObject;
				T result = caseAdvice(advice);
				if (result == null) result = caseEntity_NamedElement(advice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureSolutionPackage.FEATURE_SELECTION: {
				FeatureSelection featureSelection = (FeatureSelection)theEObject;
				T result = caseFeatureSelection(featureSelection);
				if (result == null) result = caseEntity_NamedElement(featureSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseInclusionMechanism(InclusionMechanism object) {
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
	public T caseAdapterInclusion(AdapterInclusion object) {
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
	public T caseExtensionInclusion(ExtensionInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementStrategy(PlacementStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Call Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Call Placement Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCallPlacementStrategy(ExternalCallPlacementStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Action Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Action Placement Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalActionPlacementStrategy(InternalActionPlacementStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Placement Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlowPlacementStrategy(ControlFlowPlacementStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointCut(PointCut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvice(Advice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSelection(FeatureSelection object) {
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
	public T caseEntity_NamedElement(org.palladiosimulator.pcm.core.entity.NamedElement object) {
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

} //FeatureSolutionSwitch
