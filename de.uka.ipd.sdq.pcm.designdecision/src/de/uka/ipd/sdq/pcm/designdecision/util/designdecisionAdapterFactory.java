/**
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.*;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.AGenomeToCandidateModelTransformation;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
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
		public Adapter caseDSEProblem(de.uka.ipd.sdq.pcm.designdecision.DSEProblem object) {
			return createDSEProblemAdapter();
		}

		@Override
		public Adapter caseMetamodelDescription(MetamodelDescription object) {
			return createMetamodelDescriptionAdapter();
		}

		@Override
		public Adapter caseGenomeToCandidateModelTransformation(GenomeToCandidateModelTransformation object) {
			return createGenomeToCandidateModelTransformationAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_Choice(genericdesigndecision.Choice object) {
			return createGenericdesigndecision_ChoiceAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_DiscreteRangeChoice(genericdesigndecision.DiscreteRangeChoice object) {
			return createGenericdesigndecision_DiscreteRangeChoiceAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_ClassChoice(genericdesigndecision.ClassChoice object) {
			return createGenericdesigndecision_ClassChoiceAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_ContinousRangeChoice(
				genericdesigndecision.ContinousRangeChoice object) {
			return createGenericdesigndecision_ContinousRangeChoiceAdapter();
		}

		@Override
		public Adapter caseIdentifier(Identifier object) {
			return createIdentifierAdapter();
		}

		@Override
		public Adapter caseNamedElement(de.uka.ipd.sdq.featuremodel.NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_DecisionSpace(genericdesigndecision.DecisionSpace object) {
			return createGenericdesigndecision_DecisionSpaceAdapter();
		}

		@Override
		public Adapter caseEntity_NamedElement(NamedElement object) {
			return createEntity_NamedElementAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_Candidate(genericdesigndecision.Candidate object) {
			return createGenericdesigndecision_CandidateAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_Candidates(genericdesigndecision.Candidates object) {
			return createGenericdesigndecision_CandidatesAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_DSEProblem(DSEProblem object) {
			return createGenericdesigndecision_DSEProblemAdapter();
		}

		@Override
		public Adapter caseADSEProblem(ADSEProblem object) {
			return createADSEProblemAdapter();
		}

		@Override
		public Adapter caseGenericdesigndecision_GenomeToCandidateModelTransformation(
				de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation object) {
			return createGenericdesigndecision_GenomeToCandidateModelTransformationAdapter();
		}

		@Override
		public Adapter caseAGenomeToCandidateModelTransformation(AGenomeToCandidateModelTransformation object) {
			return createAGenomeToCandidateModelTransformationAdapter();
		}

		@Override
		public Adapter caseAMetamodelDescription(AMetamodelDescription object) {
			return createAMetamodelDescriptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases; it's useful to
	* ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This default implementation
	* returns null so that we can easily ignore cases; it's useful to ignore a case when
	* inheritance will catch all the cases anyway. <!-- end-user-doc -->
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
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.Choice
	 * @generated
	 */
	public Adapter createGenericdesigndecision_ChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.DiscreteRangeChoice
	 * @generated
	 */
	public Adapter createGenericdesigndecision_DiscreteRangeChoiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.ClassChoice <em>Class Choice</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.ClassChoice
	 * @generated
	 */
	public Adapter createGenericdesigndecision_ClassChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.ContinousRangeChoice
	 * @generated
	 */
	public Adapter createGenericdesigndecision_ContinousRangeChoiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.DecisionSpace <em>Decision Space</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.DecisionSpace
	 * @generated
	 */
	public Adapter createGenericdesigndecision_DecisionSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createEntity_NamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.Candidate
	 * @generated
	 */
	public Adapter createGenericdesigndecision_CandidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.Candidates <em>Candidates</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.Candidates
	 * @generated
	 */
	public Adapter createGenericdesigndecision_CandidatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem <em>DSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem
	 * @generated
	 */
	public Adapter createGenericdesigndecision_DSEProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DSEProblem <em>DSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DSEProblem
	 * @generated
	 */
	public Adapter createDSEProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription <em>Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription
	 * @generated
	 */
	public Adapter createMetamodelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation
	 * @generated
	 */
	public Adapter createGenomeToCandidateModelTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.ADSEProblem <em>ADSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.ADSEProblem
	 * @generated
	 */
	public Adapter createADSEProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation
	 * @generated
	 */
	public Adapter createGenericdesigndecision_GenomeToCandidateModelTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.universalDoF.AMetamodelDescription <em>AMetamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription
	 * @generated
	 */
	public Adapter createAMetamodelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericdesigndecision.AGenomeToCandidateModelTransformation <em>AGenome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericdesigndecision.AGenomeToCandidateModelTransformation
	 * @generated
	 */
	public Adapter createAGenomeToCandidateModelTransformationAdapter() {
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
