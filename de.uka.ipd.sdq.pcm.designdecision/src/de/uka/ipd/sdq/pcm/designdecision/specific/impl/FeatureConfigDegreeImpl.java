/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.genericDoF.impl.ADegreeOfFreedomImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Config Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FeatureConfigDegreeImpl extends ADegreeOfFreedomImpl implements FeatureConfigDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConfigDegreeImpl() {
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
		return specificPackage.Literals.FEATURE_CONFIG_DEGREE;
	}

} //FeatureConfigDegreeImpl
