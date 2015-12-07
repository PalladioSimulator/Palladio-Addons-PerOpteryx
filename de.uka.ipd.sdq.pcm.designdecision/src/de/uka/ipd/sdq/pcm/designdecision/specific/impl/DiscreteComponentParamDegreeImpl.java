/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl;
import genericdesigndecision.universalDoF.UniversalDoF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Component Param Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiscreteComponentParamDegreeImpl extends ADiscreteRangeDegreeImpl implements DiscreteComponentParamDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteComponentParamDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.DISCRETE_COMPONENT_PARAM_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final EStructuralFeature property = this.getPrimaryChangeable().getChangeable();
		final Object value = UniversalDoF.eINSTANCE.getTarget().getAssociatedMetamodel()
				.getProperty(this.getPrimaryChanged(), property);

		final Choice choice = GenericdesigndecisionFactory.eINSTANCE.createChoice();
		choice.setValue(value);
		choice.setDofInstance(this);

		return (choice);
	}

} //DiscreteComponentParamDegreeImpl
