package edu.kit.ipd.are.dsexplore.analysis.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.opt4j.core.Criterion;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import componentSecurity.ComponentSecurity;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Attacker;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Component;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Scenario;

/**
 * Evaluator for Security
 *
 * @author Jan Keim
 *
 */
public class SecurityEvaluator extends AbstractAnalysis implements IAnalysis {

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private final Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();

	/** Attacker */
	private Attacker attacker = new Attacker(0.01, 100, 200);

	public SecurityEvaluator() {
		super(new SecuritySolverQualityAttributeDeclaration());
	}

	@Override
	public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
		final PCMInstance pcm = pheno.getPCMInstance();
		final System system = pcm.getSystem();

		// get attakc entry vector length
		int atk_entry_length = system.getProvidedRoles_InterfaceProvidingEntity().size();

		// create a map with AssemblyContexts as keys,
		// values are AssemblyContexts they are connected to (requiring)
		List<Connector> connectors = system.getConnectors__ComposedStructure();
		Map<AssemblyContext, List<AssemblyContext>> assMap = new HashMap<>();
		for (AssemblyContext assContext : system.getAssemblyContexts__ComposedStructure()) {
			List<AssemblyContext> targets = this.getRequiringAssemblyContexts(assContext, connectors);
			assMap.put(assContext, targets);
		}

		// list of all components
		List<Component> components = this.createComponents(assMap.keySet());
		// get theta matrix
		int[][] theta = this.getTheta(assMap);
		// create scenario and calc the MTTSF
		Scenario scenario = new Scenario(theta, components.toArray(new Component[0]));

		// calculate the results; use mocking if button is set
		final int securityValue;
		securityValue = (int) scenario.calcMTTSF(atk_entry_length, this.attacker);
		logger.debug(securityValue);

		// write out Results
		this.previousSecurityResults.put(pheno.getNumericID(), new SecurityAnalysisResult(securityValue, pcm,
				this.criterionToAspect, (SecuritySolverQualityAttributeDeclaration) this.qualityAttribute));
	}

	private List<AssemblyContext> getRequiringAssemblyContexts(AssemblyContext assContext, List<Connector> connectors) {
		List<AssemblyContext> targets = new ArrayList<>();
		// go through each connector
		for (Connector connector : connectors) {
			// check type of Connector and if connector is connected to the
			// provided AssemblyContext. If so, add it to return list.
			if (connector instanceof AssemblyConnector) {
				AssemblyConnector assConnector = (AssemblyConnector) connector;
				if (assConnector.getRequiringAssemblyContext_AssemblyConnector().equals(assContext)) {
					targets.add(assConnector.getProvidingAssemblyContext_AssemblyConnector());
				}
			}
		}
		return targets;
	}

	private List<Component> createComponents(Set<AssemblyContext> assSet) {
		List<Component> components = new ArrayList<>();
		for (AssemblyContext assContext : assSet) {
			if (this.isTarget(assContext)) {
				continue; // skip, when AssemblyContext is a Target. TODO check!
			}
			EList<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(assContext);
			ComponentSecurity annotatedCompSec = null;
			for (Stereotype stereotype : stereotypes) {
				if (stereotype.getName().equals("SecurityAnnotation")) {
					// TODO made this little shit work for me
					// like the bitch it is
					EStructuralFeature feat = stereotype.getEStructuralFeature("secAnnotation");
					for (StereotypeApplication stApp : StereotypeAPI.getStereotypeApplications(assContext)) {
						if (stApp.toString().contains("SecurityAnnotation")) {
							annotatedCompSec = (ComponentSecurity) stApp.eGet(feat);
						}
					}
				}
			}

			Component.Builder component = new Component.Builder().name(assContext.getEntityName());
			if (annotatedCompSec == null) {
				component.TTDV(200);
				component.PoCoB(0.2);
				logger.error("Could not find an annotation for " + assContext.getEntityName());
			} else {
				component.TTDV(annotatedCompSec.getTTDV());
				component.PoCoB(annotatedCompSec.getPoCoB());
			}
			components.add(component.build());
		}
		return components;
	}

	/**
	 * Calculates the Theta for the given Map of AssemblyContexts with their
	 * List of AssemblyContexts they are connected to
	 *
	 * @param assMap
	 *            ^
	 * @return Theta
	 */
	private int[][] getTheta(Map<AssemblyContext, List<AssemblyContext>> assMap) {
		int theta_size = assMap.keySet().size() + 1;
		int[][] theta = new int[theta_size][theta_size];
		List<AssemblyContext> targets = this.getTargets(assMap.keySet());
		List<AssemblyContext> assList = new ArrayList<>(assMap.keySet());
		for (int i = 0; i < assList.size(); i++) {
			AssemblyContext assContext = assList.get(i);
			for (AssemblyContext reqAssContext : assMap.get(assContext)) {
				int reqIndex = assList.indexOf(reqAssContext);
				theta[i][reqIndex] += 1;
			}
			// set a 1 to the last column if AssemblyContext is a target
			if (targets.contains(assContext)) {
				logger.info("Target is " + assContext.getEntityName());
				theta[i][theta_size - 1] = 1;
			}
		}

		// TODO check
		// go through each row.
		// for each row calculate the sum of the column it corresponds to (i==j)
		// for each value >0 set the value to the prior sum
		for (int i = 0; i < theta.length; i++) {
			int sum = 0;
			for (int[] element : theta) {
				sum += element[i];
			}
			sum = Math.max(1, sum);
			for (int j = 0; j < theta[i].length; j++) {
				if (theta[i][j] > 0) {
					theta[i][j] = sum;
				}
			}
		}
		return theta;
	}

	private List<AssemblyContext> getTargets(Collection<AssemblyContext> assCollection) {
		List<AssemblyContext> targets = new ArrayList<>();
		for (AssemblyContext assContext : assCollection) {
			List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(assContext);
			for (Stereotype stereotype : stereotypes) {
				if (stereotype.getName().equals("SecurityTarget")) {
					targets.add(assContext);
					break;
				}
			}
		}
		return targets;
	}

	private boolean isTarget(AssemblyContext assContext) {
		List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(assContext);
		for (Stereotype stereotype : stereotypes) {
			if (stereotype.getName().equals("SecurityTarget")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Mocking Scenario
	 *
	 * @return Security Value
	 */
	private double calcMttsfForMockingScenario() {
		int[][] theta = new int[6][6];
		theta[0][2] = 1;
		theta[1][3] = 1;
		theta[2][3] = 1;
		theta[3][4] = 2;
		theta[4][5] = 2;

		Component[] components = new Component[5];
		components[0] = new Component.Builder().TTDV(200).PoCoB(0.2).build();
		components[1] = new Component(250, 0.3);
		components[2] = new Component(125, 0.4);
		components[3] = new Component(150, 0.2);
		components[4] = new Component(300, 0.2);

		Attacker a = this.attacker;
		Scenario s = new Scenario(theta, components);
		return s.calcMTTSF(2, a);
	}

	@Override
	public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {
		this.initialiseCriteria(configuration);
		ILaunchConfiguration origConfig = configuration.getOriginalConfig();
		try {
			double lambda = Double.parseDouble(origConfig.getAttribute("attacker_lambda", "0.01"));
			double delta =  Double.parseDouble(origConfig.getAttribute("attacker_delta", "100"));
			double mtoa =  Double.parseDouble(origConfig.getAttribute("attacker_mtoa", "200"));
			this.attacker = new Attacker(lambda, delta, mtoa);
			logger.debug("Initialised with " + this.attacker);
		} catch (NumberFormatException e) {
			// should not happen, as run cannot be started w/ invalid values
			logger.error("ERR! Started evaluating while attacker values are invalid!");
			e.printStackTrace();
		}

	}

	@Override
	public boolean hasStatisticResultsFor() throws CoreException {
		return false;
	}

	@Override
	public IAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion)
			throws CoreException, AnalysisFailedException {
		// It is always the cost value, i.e. objective and constraint always have to refer to the
		// SimpleValue (-> no statistical requirements atm)
		// If more possible aspects are added, the criterion needs to be examined here

		return this.previousSecurityResults.get(pheno.getNumericID());
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return false;
	}

	@Override
	public void setBlackboard(final MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

}
