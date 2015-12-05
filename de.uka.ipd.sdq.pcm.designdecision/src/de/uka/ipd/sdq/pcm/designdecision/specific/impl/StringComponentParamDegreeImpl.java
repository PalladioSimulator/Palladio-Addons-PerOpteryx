/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uka.ipd.sdq.pcm.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Component Param Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringComponentParamDegreeImpl extends AStringSetDegreeImpl implements StringComponentParamDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringComponentParamDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.STRING_COMPONENT_PARAM_DEGREE;
	}

	@Override
	public Choice createRandomChoice() {
		designdecisionFactory factory = designdecisionFactoryImpl.init();
		Choice choice = factory.createChoice();

		//target should be a PCM-related problem here
		DSEProblem target = (DSEProblem) UniversalDoF.eINSTANCE.getTarget();
		AMetamodelDescription descr = target.getAssociatedMetamodel();
		assert (descr.getName().equals(Metamodel.PCM_VALUE));

		Collection<Object> possibleValues = descr.valueRuleForCollection(this.getPrimaryChangeable(),
				this.getPrimaryChanged(), ((MetamodelDescription) descr).getPCMRootElements(target.getPcmInstance()));

		List<Object> list;
		if (possibleValues instanceof List)
			list = (List<Object>) possibleValues;
		else
			list = new ArrayList<Object>(possibleValues);

		int index = this.random.nextInt(list.size());
		Object value = list.get(index);

		choice.setValue(value);
		choice.setDofInstance(this);
		return choice;
	}

	@Override
	public Choice determineInitialChoice() {
		final EStructuralFeature property = this.getPrimaryChangeable().getChangeable();
		final Object value = UniversalDoF.eINSTANCE.getTarget().getAssociatedMetamodel()
				.getProperty(this.getPrimaryChanged(), property);

		final Choice choice = designdecisionFactory.eINSTANCE.createChoice();
		choice.setValue(value);
		choice.setDofInstance(this);

		return (choice);
	}

} //StringComponentParamDegreeImpl
