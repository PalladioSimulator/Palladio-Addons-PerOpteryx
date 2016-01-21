/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.pcmsupport.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl;

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
	public String getDegreeDescription() {
		String primaryChangeableName = this.getPrimaryChanged().toString();
		if (this.getPrimaryChanged() instanceof Entity) {
			primaryChangeableName = ((Entity) this.getPrimaryChanged()).getEntityName();
		}

		return this.getClass().getSimpleName() + ":" + primaryChangeableName;
	}

} //StringComponentParamDegreeImpl
