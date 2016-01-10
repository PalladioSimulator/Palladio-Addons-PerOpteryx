/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.helper.DSEModule;
import de.uka.ipd.sdq.pcm.designdecision.helper.GenotypeReader;
import de.uka.ipd.sdq.pcm.designdecision.helper.Adapter;
import de.uka.ipd.sdq.pcm.designdecision.helper.DSEDecoder;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMPhenotype;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Candidate;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.universalDoF.GDoFRepository;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;
import genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl;
import genericdesigndecision.universalDoF.impl.SpecificDoFImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.solver.models.PCMInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MetamodelDescriptionImpl extends AMetamodelDescriptionImpl implements MetamodelDescription {

	private DSEDecoder decoder;

	private static MetamodelDescription metamodelDescrSingleton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private MetamodelDescriptionImpl() {
		super();
		this.name = Metamodel.PCM;
		this.genomeToCandidateTransformation = designdecisionFactory.eINSTANCE
				.createGenomeToCandidateModelTransformation();
		this.decoder = new DSEDecoder();
		this.dseModule = new DSEModule();
		this.adapter = new Adapter();
		this.genotypeReader = new GenotypeReader();
		
		this.gdof_to_dof.put(UniversalDoF.eINSTANCE.getGDoF(GDoFRepository.ALLOCATION_DOF), new SpecificDoFImpl(MetamodelDescription.PCM_ALLOCATION_DOF));
		this.gdof_to_dof.put(UniversalDoF.eINSTANCE.getGDoF(GDoFRepository.PROCESSING_RATE_DOF), new SpecificDoFImpl(MetamodelDescription.PCM_PROCESSING_RATE_DOF));
		this.gdof_to_dof.put(UniversalDoF.eINSTANCE.getGDoF(GDoFRepository.CAPACITY_DOF), new SpecificDoFImpl(MetamodelDescription.PCM_CAPACITY_DOF));
		this.gdof_to_dof.put(UniversalDoF.eINSTANCE.getGDoF(GDoFRepository.ALTERNATIVE_COMPONENT_DOF), new SpecificDoFImpl(MetamodelDescription.PCM_ALTERNATIVE_COMPONENT_DOF));
	}

	public static MetamodelDescription getMetamodelDescription() {
		if (metamodelDescrSingleton == null) {
			metamodelDescrSingleton = new MetamodelDescriptionImpl();
		}
		return metamodelDescrSingleton;
	}

	@Override
	public Metamodel evaluateMetamodel(EObject model) {
		//TODO currently not needed, because GUI already specifies the metamodel in the configuration object
		throw new UnsupportedOperationException();
	}

	@Override
	public PCMInstance transformEMFtoPCM(PCMResourceSetPartition pcmPartition) {
		return new PCMInstance(pcmPartition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.METAMODEL_DESCRIPTION;
	}

	@Override
	public List<EObject> getPCMRootElements(PCMInstance pcm) {
		return ((MetamodelDescription) this.genomeToCandidateTransformation).getPCMRootElements(pcm);
	}

	@Override
	public List<Choice> transform(PCMInstance pcm, Candidate candidate) {
		return ((MetamodelDescription) this.genomeToCandidateTransformation).transform(pcm, candidate);
	}

	@Override
	public boolean transformChoice(PCMInstance pcm, Choice choice) {
		return ((MetamodelDescription) this.genomeToCandidateTransformation).transformChoice(pcm, choice);
	}

	@Override
	public ProcessingResourceSpecification getProcessingResourceSpec(final ProcessingResourceDegree prd) {
		final ResourceContainer rc = (ResourceContainer) prd.getPrimaryChanged();
		final List<ProcessingResourceSpecification> prsList = rc.getActiveResourceSpecifications_ResourceContainer();
		final ProcessingResourceType prt = prd.getProcessingresourcetype();

		ProcessingResourceSpecification rightPrs = null;
		for (final ProcessingResourceSpecification prs : prsList) {
			if (de.uka.ipd.sdq.dsexplore.helper.EMFHelper
					.checkIdentity(prs.getActiveResourceType_ActiveResourceSpecification(), prt)) {
				rightPrs = prs;
				break;
			}
		}
		return rightPrs;
	}

	@Override
	public PCMPhenotype decode(PCMInstance pcmInstance, DesignDecisionGenotype genotype) {
		return this.decoder.decode(pcmInstance, genotype);
	}

	@Override
	public Collection<Object> getPossibleValues(ADegreeOfFreedom dof, ADSEProblem dseProblem) {
		return this.genomeToCandidateTransformation.valueRuleForCollection(dof.getPrimaryChangeable(),
				dof.getPrimaryChanged(),
				this.getPCMRootElements(((de.uka.ipd.sdq.pcm.designdecision.DSEProblem) dseProblem).getPcmInstance()));
	}

	@Override
	public String getDecisionString(Choice choice) {
		return this.decoder.getDecisionString(choice);
	}

} //MetamodelDescriptionImpl
