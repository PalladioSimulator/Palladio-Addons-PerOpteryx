/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.emf.ecore.EFactory;

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
	 * Returns a new object of class '<em>Discrete Range Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Range Choice</em>'.
	 * @generated
	 */
	DiscreteRangeChoice createDiscreteRangeChoice();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Degree Of Freedom Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree Of Freedom Instance</em>'.
	 * @generated
	 */
	DegreeOfFreedomInstance createDegreeOfFreedomInstance();

	/**
	 * Returns a new object of class '<em>Class Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Choice</em>'.
	 * @generated
	 */
	ClassChoice createClassChoice();

	/**
	 * Returns a new object of class '<em>Continous Range Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continous Range Choice</em>'.
	 * @generated
	 */
	ContinousRangeChoice createContinousRangeChoice();

	/**
	 * Returns a new object of class '<em>Decision Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Space</em>'.
	 * @generated
	 */
	DecisionSpace createDecisionSpace();

	/**
	 * Returns a new object of class '<em>Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate</em>'.
	 * @generated
	 */
	Candidate createCandidate();

	/**
	 * Returns a new object of class '<em>Candidates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidates</em>'.
	 * @generated
	 */
	Candidates createCandidates();

	/**
	 * Returns a new object of class '<em>PCMDSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCMDSE Problem</em>'.
	 * @generated
	 */
	PCMDSEProblem createPCMDSEProblem();

	/**
	 * Returns a new object of class '<em>PCM Metamodel Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Metamodel Description</em>'.
	 * @generated
	 */
	PCMMetamodelDescription createPCMMetamodelDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	designdecisionPackage getdesigndecisionPackage();

} //designdecisionFactory
