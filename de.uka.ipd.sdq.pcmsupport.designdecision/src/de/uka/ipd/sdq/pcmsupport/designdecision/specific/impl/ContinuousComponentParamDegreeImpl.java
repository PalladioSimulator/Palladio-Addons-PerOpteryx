/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Component Param Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContinuousComponentParamDegreeImpl extends AContinuousRangeDegreeImpl
		implements ContinuousComponentParamDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousComponentParamDegreeImpl() {
		super();
	}

	@Override
	public String getDegreeDescription() {
		String primaryChangeableName = this.getPrimaryChanged().toString();
		if (this.getPrimaryChanged() instanceof Entity) {
			primaryChangeableName = ((Entity) this.getPrimaryChanged()).getEntityName();
		}

		return this.getClass().getSimpleName() + ":" + primaryChangeableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.CONTINUOUS_COMPONENT_PARAM_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final EStructuralFeature property = this.getPrimaryChangeable().getChangeable();
		final Object value = MetamodelDescription.eINSTANCE.getProperty(this.getPrimaryChanged(), property);

		final Choice choice = GenericdesigndecisionFactory.eINSTANCE.createChoice();
		choice.setValue(value);
		choice.setDofInstance(this);

		return (choice);
	}

} //ContinuousComponentParamDegreeImpl
