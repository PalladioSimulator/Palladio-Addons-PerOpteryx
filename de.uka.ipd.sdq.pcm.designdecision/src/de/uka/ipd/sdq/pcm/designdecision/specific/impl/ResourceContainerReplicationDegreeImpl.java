/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container Replication Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceContainerReplicationDegreeImpl extends ADiscreteRangeDegreeImpl
		implements ResourceContainerReplicationDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerReplicationDegreeImpl() {
		super();
	}
	
	@Override
	public String getDegreeDescription() {
		String primaryChangeableName = this.getPrimaryChanged().toString();
	    if (this.getPrimaryChanged() instanceof Entity){
	        primaryChangeableName = ((Entity)this.getPrimaryChanged()).getEntityName();
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
		return specificPackage.Literals.RESOURCE_CONTAINER_REPLICATION_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final DiscreteRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createDiscreteRangeChoice();
		choice.setDofInstance(this);

		choice.setChosenValue(1);

		return choice;
	}

} //ResourceContainerReplicationDegreeImpl
