/**
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.*;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static designdecisionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = designdecisionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected designdecisionSwitch<Adapter> modelSwitch = new designdecisionSwitch<Adapter>() {
		@Override
		public Adapter caseDiscreteRangeChoice(DiscreteRangeChoice object) {
			return createDiscreteRangeChoiceAdapter();
		}

		@Override
		public Adapter caseChoice(Choice object) {
			return createChoiceAdapter();
		}

		@Override
		public Adapter caseDegreeOfFreedomInstance(DegreeOfFreedomInstance object) {
			return createDegreeOfFreedomInstanceAdapter();
		}

		@Override
		public Adapter caseClassChoice(ClassChoice object) {
			return createClassChoiceAdapter();
		}

		@Override
		public Adapter caseContinousRangeChoice(ContinousRangeChoice object) {
			return createContinousRangeChoiceAdapter();
		}

		@Override
		public Adapter caseDecisionSpace(DecisionSpace object) {
			return createDecisionSpaceAdapter();
		}

		@Override
		public Adapter caseCandidate(Candidate object) {
			return createCandidateAdapter();
		}

		@Override
		public Adapter caseCandidates(Candidates object) {
			return createCandidatesAdapter();
		}

		@Override
		public Adapter caseBoolChoice(BoolChoice object) {
			return createBoolChoiceAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseIdentifier(Identifier object) {
			return createIdentifierAdapter();
		}

		@Override
		public Adapter casefeaturemodel_NamedElement(de.uka.ipd.sdq.featuremodel.NamedElement object) {
			return createfeaturemodel_NamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice
	 * @generated
	 */
	public Adapter createDiscreteRangeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance
	 * @generated
	 */
	public Adapter createDegreeOfFreedomInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.ClassChoice <em>Class Choice</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ClassChoice
	 * @generated
	 */
	public Adapter createClassChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice
	 * @generated
	 */
	public Adapter createContinousRangeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.DecisionSpace <em>Decision Space</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DecisionSpace
	 * @generated
	 */
	public Adapter createDecisionSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidate
	 * @generated
	 */
	public Adapter createCandidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.uka.ipd.sdq.pcm.designdecision.Candidates <em>Candidates</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidates
	 * @generated
	 */
	public Adapter createCandidatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.BoolChoice <em>Bool Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.BoolChoice
	 * @generated
	 */
	public Adapter createBoolChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.featuremodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.featuremodel.NamedElement
	 * @generated
	 */
	public Adapter createfeaturemodel_NamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // designdecisionAdapterFactory
