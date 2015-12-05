/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembled Component Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssembledComponentDegreeImpl extends AClassAsReferenceDegreeImpl implements AssembledComponentDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssembledComponentDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.ASSEMBLED_COMPONENT_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
		choice.setDofInstance(this);
		final AssemblyContext ac = (AssemblyContext) this.getPrimaryChanged();
		final RepositoryComponent rc = ac.getEncapsulatedComponent__AssemblyContext();
		choice.setChosenValue(rc);

		//check if entity is in the domain
		if (!EMFHelper.contains(this.getClassDesignOptions(), choice.getChosenValue())) {
			throw new ChoiceOutOfBoundsException(choice, "Error when determining initial genotype");
		}
		return choice;
	}

} //AssembledComponentDegreeImpl
