/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.PassiveResource;

import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CapacityDegreeImpl extends ADiscreteRangeDegreeImpl implements CapacityDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.CAPACITY_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final DiscreteRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createDiscreteRangeChoice();
		choice.setDofInstance(this);

		final EObject entity = this.getPrimaryChanged();

		final PassiveResource pr = (PassiveResource) entity;
		choice.setChosenValue(Integer.valueOf(pr.getCapacity_PassiveResource().getSpecification()));

		return choice;
	}

	@Override
	public Choice createChoice() {
		return GenericdesigndecisionFactory.eINSTANCE.createDiscreteRangeChoice();
	}

} //CapacityDegreeImpl
