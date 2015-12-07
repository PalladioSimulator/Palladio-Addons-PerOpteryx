/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.universalDoF.UniversalDoF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of Cores Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumberOfCoresDegreeImpl extends ProcessingResourceDegreeImpl implements NumberOfCoresDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfCoresDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.NUMBER_OF_CORES_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final DiscreteRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createDiscreteRangeChoice();
		choice.setDofInstance(this);

		MetamodelDescription pcmdescr = (MetamodelDescription) UniversalDoF.eINSTANCE.getTarget()
				.getAssociatedMetamodel();
		final ProcessingResourceSpecification prd = pcmdescr.getProcessingResourceSpec(this);
		choice.setChosenValue(prd.getNumberOfReplicas());

		return choice;
	}

} //NumberOfCoresDegreeImpl
