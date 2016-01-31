/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcmsupport.PCMPhenotype;
import genericdesigndecision.ADSEProblem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSE Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage#getDSEProblem()
 * @model
 * @generated
 */
public interface DSEProblem extends ADSEProblem<PCMPhenotype> {

	public PCMInstance getPcmInstance();
} // DSEProblem
