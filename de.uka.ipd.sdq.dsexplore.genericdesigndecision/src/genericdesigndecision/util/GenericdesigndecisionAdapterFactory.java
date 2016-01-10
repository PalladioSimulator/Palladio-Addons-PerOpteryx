/**
 */
package genericdesigndecision.util;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder;
import genericdesigndecision.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>AAdapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see genericdesigndecision.GenericdesigndecisionPackage
 * @generated
 */
public class GenericdesigndecisionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericdesigndecisionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericdesigndecisionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenericdesigndecisionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericdesigndecisionSwitch<Adapter> modelSwitch =
		new GenericdesigndecisionSwitch<Adapter>() {
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
			public Adapter caseADSEProblem(ADSEProblem object) {
				return createADSEProblemAdapter();
			}
			@Override
			public Adapter caseDSEDecoder(DSEDecoder object) {
				return createDSEDecoderAdapter();
			}
			@Override
			public Adapter caseGenomeToCandidateModelTransformation(GenomeToCandidateModelTransformation object) {
				return createGenomeToCandidateModelTransformationAdapter();
			}
			@Override
			public Adapter caseAGenomeToCandidateModelTransformation(AGenomeToCandidateModelTransformation object) {
				return createAGenomeToCandidateModelTransformationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
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
	public Adapter createDiscreteRangeChoiceAdapter() {
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
	public Adapter createChoiceAdapter() {
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
	public Adapter createClassChoiceAdapter() {
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
	public Adapter createContinousRangeChoiceAdapter() {
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
	public Adapter createDecisionSpaceAdapter() {
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
	public Adapter createCandidateAdapter() {
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
	public Adapter createCandidatesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder <em>DSE Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder
	 * @generated
	 */
	public Adapter createDSEDecoderAdapter() {
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
	public Adapter createGenomeToCandidateModelTransformationAdapter() {
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
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenericdesigndecisionAdapterFactory
