/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.pcm.designdecision.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;
import genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl;

import java.util.ArrayList;
import java.util.List;

//import genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genome To Candidate Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenomeToCandidateModelTransformationImpl extends AGenomeToCandidateModelTransformationImpl
		implements GenomeToCandidateModelTransformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenomeToCandidateModelTransformationImpl() {
		super();
	}

	/** 
	 * PCM specific method to conveniently call the transformation
	 * @param pcm
	 * @param candidate
	 * @return The choices that have not been transformed, e.g. because no GDoF has been specified from them
	 */
	public List<Choice> transform(PCMInstance pcm, Candidate candidate) {

		List<EObject> rootElements = getPCMRootElements(pcm);

		// TODO: add my resource repository with the alternative resources. Rename it first, because the repository of resource types is already named resource repository.
		return transform(rootElements, candidate);
	}

	public static List<EObject> getPCMRootElements(PCMInstance pcm) {
		List<EObject> rootElements = new ArrayList<EObject>();

		List<Repository> repos = pcm.getRepositories();
		for (Repository repository : repos) {
			rootElements.add(repository);
		}
		rootElements.add(pcm.getSystem());
		rootElements.add(pcm.getResourceEnvironment());
		rootElements.add(pcm.getAllocation());
		// usage model is probably not needed
		return rootElements;
	}

	/** 
	 * PCM specific method to conveniently call the transformation for one {@link Choice}
	 * @param pcm
	 * @param candidate
	 */
	public boolean transformChoice(PCMInstance pcm, Choice choice) {

		List<EObject> rootElements = getPCMRootElements(pcm);

		// TODO: add my resource repository with the alternative resources. Rename it first, because the repository of resource types is already named resource repository.
		return transformChoice(rootElements, choice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION;
	}

} //GenomeToCandidateModelTransformationImpl
