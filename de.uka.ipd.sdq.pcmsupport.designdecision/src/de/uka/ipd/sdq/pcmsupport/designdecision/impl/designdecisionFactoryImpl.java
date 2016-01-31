/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.impl;

import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.pcmsupport.designdecision.*;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class designdecisionFactoryImpl extends EFactoryImpl implements designdecisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static designdecisionFactory init() {
		try {
			designdecisionFactory thedesigndecisionFactory = (designdecisionFactory) EPackage.Registry.INSTANCE
					.getEFactory(designdecisionPackage.eNS_URI);
			if (thedesigndecisionFactory != null) {
				return thedesigndecisionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new designdecisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case designdecisionPackage.DSE_PROBLEM:
			return createDSEProblem();
		case designdecisionPackage.METAMODEL_DESCRIPTION:
			return createMetamodelDescription();
		case designdecisionPackage.GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION:
			return createGenomeToCandidateModelTransformation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public MetamodelDescription createMetamodelDescription() {
		MetamodelDescription metamodelDescription = MetamodelDescription.eINSTANCE;
		return metamodelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenomeToCandidateModelTransformation createGenomeToCandidateModelTransformation() {
		GenomeToCandidateModelTransformationImpl genomeToCandidateModelTransformation = new GenomeToCandidateModelTransformationImpl();
		return genomeToCandidateModelTransformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public designdecisionPackage getdesigndecisionPackage() {
		return (designdecisionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static designdecisionPackage getPackage() {
		return designdecisionPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public DSEProblem createDSEProblem() {
		throw new UnsupportedOperationException("This method should not have been called.");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public DSEProblem createDSEProblem(PCMWorkflowConfiguration dseConfig, PCMResourceSetPartition pcmPartition)
			throws CoreException {
		return new DSEProblemImpl(dseConfig, pcmPartition);
	}

} // designdecisionFactoryImpl
