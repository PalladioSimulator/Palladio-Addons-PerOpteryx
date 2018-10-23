/*
 * generated by Xtext 2.14.0
 */
package org.palladiosimulator.qes.serializer;

import com.google.inject.Inject;
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
import org.palladiosimulator.qes.qualityEffectSpecification.Annotation;
import org.palladiosimulator.qes.qualityEffectSpecification.Assembly;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.Entry;
import org.palladiosimulator.qes.qualityEffectSpecification.Identifier;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.palladiosimulator.qes.qualityEffectSpecification.NQA;
import org.palladiosimulator.qes.qualityEffectSpecification.Name;
import org.palladiosimulator.qes.qualityEffectSpecification.NumericValue;
import org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecificationPackage;
import org.palladiosimulator.qes.qualityEffectSpecification.Reasoning;
import org.palladiosimulator.qes.qualityEffectSpecification.Resource;
import org.palladiosimulator.qes.qualityEffectSpecification.Role;
import org.palladiosimulator.qes.qualityEffectSpecification.Rule;
import org.palladiosimulator.qes.qualityEffectSpecification.Type;
import org.palladiosimulator.qes.services.QualityEffectSpecificationGrammarAccess;

@SuppressWarnings("all")
public class QualityEffectSpecificationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QualityEffectSpecificationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QualityEffectSpecificationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QualityEffectSpecificationPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.ASSEMBLY:
				sequence_Assembly(context, (Assembly) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.COMPONENT_SPECIFICATION:
				sequence_ComponentSpecification(context, (ComponentSpecification) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.ENTRY:
				sequence_Entry(context, (Entry) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.IDENTIFIER:
				sequence_Identifier(context, (Identifier) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.NQA:
				sequence_NQA(context, (NQA) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.NAME:
				sequence_Name(context, (Name) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.NUMERIC_VALUE:
				sequence_NumericValue(context, (NumericValue) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.QUALITY_EFFECT_SPECIFICATION:
				sequence_QualityEffectSpecification(context, (QualityEffectSpecification) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.REASONING:
				sequence_Reasoning(context, (Reasoning) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case QualityEffectSpecificationPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Annotation
	 *     Annotation returns Annotation
	 *     RoleProperty returns Annotation
	 *
	 * Constraint:
	 *     (not?='not'? annotation=STRING)
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Assembly
	 *     Assembly returns Assembly
	 *
	 * Constraint:
	 *     (not?='not'? type=AssemblyType component=ComponentSpecification?)
	 */
	protected void sequence_Assembly(ISerializationContext context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentSpecification returns ComponentSpecification
	 *
	 * Constraint:
	 *     (properties+=ComponentProperty properties+=ComponentProperty*)
	 */
	protected void sequence_ComponentSpecification(ISerializationContext context, ComponentSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entry returns Entry
	 *
	 * Constraint:
	 *     (key+=STRING key+=STRING* value=STRING)
	 */
	protected void sequence_Entry(ISerializationContext context, Entry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Identifier
	 *     Identifier returns Identifier
	 *     RoleProperty returns Identifier
	 *     ResourceProperty returns Identifier
	 *
	 * Constraint:
	 *     (not?='not'? id=STRING)
	 */
	protected void sequence_Identifier(ISerializationContext context, Identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (specifications+=QualityEffectSpecification specifications+=QualityEffectSpecification*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransformationSpecification returns NQA
	 *     NQA returns NQA
	 *
	 * Constraint:
	 *     (quality=STRING type=TransformationType element=STRING)
	 */
	protected void sequence_NQA(ISerializationContext context, NQA semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__QUALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__QUALITY));
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__TYPE));
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NQA__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_2_0(), semanticObject.getQuality());
		feeder.accept(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_4_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Name
	 *     Name returns Name
	 *     RoleProperty returns Name
	 *     ResourceProperty returns Name
	 *
	 * Constraint:
	 *     (not?='not'? autonym=STRING)
	 */
	protected void sequence_Name(ISerializationContext context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransformationSpecification returns NumericValue
	 *     NumericValue returns NumericValue
	 *
	 * Constraint:
	 *     (valueType=ID transformationType=TransformationType transformationNumber=NUMBER)
	 */
	protected void sequence_NumericValue(ISerializationContext context, NumericValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__VALUE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__VALUE_TYPE));
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__TRANSFORMATION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__TRANSFORMATION_TYPE));
			if (transientValues.isValueTransient(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__TRANSFORMATION_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QualityEffectSpecificationPackage.Literals.NUMERIC_VALUE__TRANSFORMATION_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumericValueAccess().getValueTypeIDTerminalRuleCall_0_0(), semanticObject.getValueType());
		feeder.accept(grammarAccess.getNumericValueAccess().getTransformationTypeTransformationTypeEnumRuleCall_2_0(), semanticObject.getTransformationType());
		feeder.accept(grammarAccess.getNumericValueAccess().getTransformationNumberNUMBERTerminalRuleCall_3_0(), semanticObject.getTransformationNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     QualityEffectSpecification returns QualityEffectSpecification
	 *
	 * Constraint:
	 *     (
	 *         components+=ComponentSpecification 
	 *         components+=ComponentSpecification* 
	 *         transformations+=TransformationSpecification 
	 *         transformations+=TransformationSpecification*
	 *     )
	 */
	protected void sequence_QualityEffectSpecification(ISerializationContext context, QualityEffectSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransformationSpecification returns Reasoning
	 *     Reasoning returns Reasoning
	 *
	 * Constraint:
	 *     (quality=STRING rules+=Rule rules+=Rule*)
	 */
	protected void sequence_Reasoning(ISerializationContext context, Reasoning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Resource
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (properties+=ResourceProperty properties+=ResourceProperty*)
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Role
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (not?='not'? type=RoleType (properties+=RoleProperty properties+=RoleProperty*)?)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (qualities+=STRING qualities+=STRING* entries+=Entry entries+=Entry*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns Type
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (not?='not'? type=ComponentType)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
