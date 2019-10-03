/*
 * generated by Xtext 2.14.0
 */
package edu.kit.ipd.are.dsexplore.serializer;

import com.google.inject.Inject;
import edu.kit.ipd.are.dsexplore.services.FcDslGrammarAccess;
import featureSolution.BehaviourInclusion;
import featureSolution.FeatureSolutionPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import placementDescription.Advice;
import placementDescription.ControlFlowPlacementStrategy;
import placementDescription.ExternalCallPlacementStrategy;
import placementDescription.FeatureList;
import placementDescription.FeatureSelection;
import placementDescription.Import;
import placementDescription.InternalActionPlacementStrategy;
import placementDescription.PlacementDescriptionPackage;
import placementDescription.PlacementStrategy;
import placementDescription.PointCut;
import placementDescription.SelectedCV;

@SuppressWarnings("all")
public class FcDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FcDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FeatureSolutionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION:
				sequence_BehaviourInclusion(context, (BehaviourInclusion) semanticObject); 
				return; 
			}
		else if (epackage == PlacementDescriptionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PlacementDescriptionPackage.ADVICE:
				sequence_Advice(context, (Advice) semanticObject); 
				return; 
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY:
				sequence_ControlFlowPlacementStrategy(context, (ControlFlowPlacementStrategy) semanticObject); 
				return; 
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY:
				sequence_ExternalCallPlacementStrategy(context, (ExternalCallPlacementStrategy) semanticObject); 
				return; 
			case PlacementDescriptionPackage.FEATURE_LIST:
				sequence_FeatureList(context, (FeatureList) semanticObject); 
				return; 
			case PlacementDescriptionPackage.FEATURE_SELECTION:
				sequence_FeatureSelection(context, (FeatureSelection) semanticObject); 
				return; 
			case PlacementDescriptionPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY:
				sequence_InternalActionPlacementStrategy(context, (InternalActionPlacementStrategy) semanticObject); 
				return; 
			case PlacementDescriptionPackage.PLACEMENT_STRATEGY:
				sequence_PlacementStrategy_Impl(context, (PlacementStrategy) semanticObject); 
				return; 
			case PlacementDescriptionPackage.POINT_CUT:
				sequence_PointCut(context, (PointCut) semanticObject); 
				return; 
			case PlacementDescriptionPackage.SELECTED_CV:
				sequence_SelectedCV(context, (SelectedCV) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Advice returns Advice
	 *
	 * Constraint:
	 *     (appears=Appearance pointCut=[PointCut|EString]? placementPolicy=PlacementPolicy)
	 */
	protected void sequence_Advice(ISerializationContext context, Advice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourInclusion returns BehaviourInclusion
	 *     InclusionMechanism returns BehaviourInclusion
	 *
	 * Constraint:
	 *     (
	 *         imports+=Import* 
	 *         multiple?='multiple'? 
	 *         name=EString 
	 *         id=EString 
	 *         description=EString 
	 *         (pointCut+=PointCut pointCut+=PointCut*)? 
	 *         featureCompletion=FeatureSelection 
	 *         (advice+=Advice advice+=Advice*)?
	 *     )
	 */
	protected void sequence_BehaviourInclusion(ISerializationContext context, BehaviourInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PlacementStrategy returns ControlFlowPlacementStrategy
	 *     ControlFlowPlacementStrategy returns ControlFlowPlacementStrategy
	 *
	 * Constraint:
	 *     forAllControlFlowsIn=[RepositoryComponent|EString]?
	 */
	protected void sequence_ControlFlowPlacementStrategy(ISerializationContext context, ControlFlowPlacementStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PlacementStrategy returns ExternalCallPlacementStrategy
	 *     ExternalCallPlacementStrategy returns ExternalCallPlacementStrategy
	 *
	 * Constraint:
	 *     matchingSignature=[Signature|EString]?
	 */
	protected void sequence_ExternalCallPlacementStrategy(ISerializationContext context, ExternalCallPlacementStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureList returns FeatureList
	 *
	 * Constraint:
	 *     (features+=SelectedCV features+=SelectedCV*)
	 */
	protected void sequence_FeatureList(ISerializationContext context, FeatureList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureSelection returns FeatureSelection
	 *
	 * Constraint:
	 *     (Completion=[FeatureCompletion|EString] featureLists+=FeatureList featureLists+=FeatureList*)
	 */
	protected void sequence_FeatureSelection(ISerializationContext context, FeatureSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=EString
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlacementDescriptionPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlacementDescriptionPackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PlacementStrategy returns InternalActionPlacementStrategy
	 *     InternalActionPlacementStrategy returns InternalActionPlacementStrategy
	 *
	 * Constraint:
	 *     forAllInternalActionsIn=[RepositoryComponent|EString]?
	 */
	protected void sequence_InternalActionPlacementStrategy(ISerializationContext context, InternalActionPlacementStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PlacementStrategy returns PlacementStrategy
	 *     PlacementStrategy_Impl returns PlacementStrategy
	 *
	 * Constraint:
	 *     {PlacementStrategy}
	 */
	protected void sequence_PlacementStrategy_Impl(ISerializationContext context, PlacementStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PointCut returns PointCut
	 *
	 * Constraint:
	 *     (name=EString placementStrategy=PlacementStrategy?)
	 */
	protected void sequence_PointCut(ISerializationContext context, PointCut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectedCV returns SelectedCV
	 *
	 * Constraint:
	 *     (optional?='optional'? complementumVisnetis=[ComplementumVisnetis|EString])
	 */
	protected void sequence_SelectedCV(ISerializationContext context, SelectedCV semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}