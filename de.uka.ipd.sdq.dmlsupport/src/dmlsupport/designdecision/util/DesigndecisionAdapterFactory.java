/**
 */
package dmlsupport.designdecision.util;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder;
import dmlsupport.designdecision.*;

import genericdesigndecision.ADSEProblem;
import genericdesigndecision.universalDoF.AGenomeToCandidateModelTransformation;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.opt4j.core.Phenotype;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.designdecision.DesigndecisionPackage
 * @generated
 */
public class DesigndecisionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DesigndecisionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesigndecisionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DesigndecisionPackage.eINSTANCE;
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
	protected DesigndecisionSwitch<Adapter> modelSwitch =
		new DesigndecisionSwitch<Adapter>() {
			@Override
			public Adapter caseDSEProblem(DSEProblem object) {
				return createDSEProblemAdapter();
			}
			@Override
			public Adapter caseMetamodelDescription(MetamodelDescription object) {
				return createMetamodelDescriptionAdapter();
			}
			@Override
			public <P extends Phenotype> Adapter caseDSEDecoder(DSEDecoder<P> object) {
				return createDSEDecoderAdapter();
			}
			@Override
			public <P extends Phenotype> Adapter caseADSEProblem(ADSEProblem<P> object) {
				return createADSEProblemAdapter();
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
	 * Creates a new adapter for an object of class '{@link dmlsupport.designdecision.DSEProblem <em>DSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmlsupport.designdecision.DSEProblem
	 * @generated
	 */
	public Adapter createDSEProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmlsupport.designdecision.MetamodelDescription <em>Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmlsupport.designdecision.MetamodelDescription
	 * @generated
	 */
	public Adapter createMetamodelDescriptionAdapter() {
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

} //DesigndecisionAdapterFactory
