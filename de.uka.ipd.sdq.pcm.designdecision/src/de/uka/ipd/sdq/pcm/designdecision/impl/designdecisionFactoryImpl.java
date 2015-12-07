/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.designdecision.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
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
	 * @generated
	 */
	@Override
	public MetamodelDescription createMetamodelDescription() {
		MetamodelDescriptionImpl metamodelDescription = new MetamodelDescriptionImpl();
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
	 * @generated
	 */
	@Override
	public DSEProblem createDSEProblem() {
		DSEProblemImpl dseProblem = new DSEProblemImpl();
		return dseProblem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public DSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, EModelElement model) throws CoreException {
		return new DSEProblemImpl(dseConfig, model);
	}

} // designdecisionFactoryImpl
