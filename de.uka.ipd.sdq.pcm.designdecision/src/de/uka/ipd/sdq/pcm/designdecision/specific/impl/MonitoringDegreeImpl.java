/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.ContinousRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MonitoringDegreeImpl extends AContinuousRangeDegreeImpl implements MonitoringDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.MONITORING_DEGREE;
	}

	@Override
	public Choice determineInitialChoice() {
		final ContinousRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createContinousRangeChoice();
		choice.setDofInstance(this);

		//MonitoringDegree mnrt = (MonitoringDegree) dd;
		//Intervall interval = (Intervall) (MonitoringDegree)crdobj.getPrimaryChanged();
		//choice.setChosenValue(interval.getIntervall());
		choice.setChosenValue(this.getFrom());

		return choice;
	}

} //MonitoringDegreeImpl
