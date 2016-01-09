/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EFactory;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMWorkflowConfiguration;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public interface designdecisionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	designdecisionFactory eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSE Problem</em>'.
	 * @generated
	 */
	DSEProblem createDSEProblem();

	/**
	 * Returns a new object of class '<em>Metamodel Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Description</em>'.
	 * @generated
	 */
	MetamodelDescription createMetamodelDescription();

	/**
	 * Returns a new object of class '<em>Genome To Candidate Model Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genome To Candidate Model Transformation</em>'.
	 * @generated
	 */
	GenomeToCandidateModelTransformation createGenomeToCandidateModelTransformation();

	DSEProblem createDSEProblem(PCMWorkflowConfiguration dseConfig, PCMResourceSetPartition pcmPartition) throws CoreException;

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	designdecisionPackage getdesigndecisionPackage();

} //designdecisionFactory
