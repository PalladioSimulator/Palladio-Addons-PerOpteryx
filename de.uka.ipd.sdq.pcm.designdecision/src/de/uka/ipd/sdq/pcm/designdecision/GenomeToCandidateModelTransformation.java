/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.solver.models.PCMInstance;

import genericdesigndecision.AGenomeToCandidateModelTransformation;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genome To Candidate Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getGenomeToCandidateModelTransformation()
 * @model
 * @generated
 */
public interface GenomeToCandidateModelTransformation extends AGenomeToCandidateModelTransformation {

	public List<Choice> transform(PCMInstance pcm, Candidate candidate);

	public List<EObject> getPCMRootElements(PCMInstance pcm);

	public boolean transformChoice(PCMInstance pcm, Choice choice);
} // GenomeToCandidateModelTransformation
