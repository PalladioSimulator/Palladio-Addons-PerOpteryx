package de.uka.ipd.sdq.dsexplore.export.toometa;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.opt4j.core.Objective;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.IResultsHandler;
import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import options.Option;
import options.OptionRepository;
import options.OptionsFactory;
import peropteryxcandidates.PerOpteryxCandidate;
import peropteryxcandidates.PerOpteryxOption;
import peropteryxcandidates.PeropteryxcandidatesFactory;
import peropteryxcandidates.PredictedQualityValue;
import qualities.QualityType;
import qualities.QualityTypeRepository;
import toometa.resources.ResourceLoader;

public class ResultsHandler implements IResultsHandler {
	private static Logger logger = Logger.getLogger(ResultsHandler.class);

	protected static final String PROP_ENABLED = "peropteryx2toometa_enabled";
	protected static final String PROP_PATH = "peropteryx2toometa_path";

	private boolean enabled;
	private String path;

	private List<List<Option>> optionsPerCandidate;
	private List<PerOpteryxCandidate> candidates;

	@Override
	public void initialize(ILaunchConfiguration configuration) {
		try {
			this.enabled = configuration.getAttribute(PROP_ENABLED, false);
			this.path = configuration.getAttribute(PROP_PATH, "");
		} catch (CoreException e) {
			this.enabled = false;
		}		
	}

	@Override
	public void handleResults(Collection<DSEIndividual> individuals, int iteration) {
		if (!this.enabled) {
			return;
		}
		optionsPerCandidate = new ArrayList<List<Option>>();
		candidates = new ArrayList<PerOpteryxCandidate>();
		OptionRepository candidates = getOptions(individuals);
		setAlternatives(candidates);
		try {
			String filename = getFileName(iteration);
			saveCandidates(candidates, filename);
			logger.log(Level.DEBUG, "Written results to " + filename);
		} catch (IOException e) {
			logger.log(Level.FATAL, "Failed to persist candidates: " + e.getMessage(), e);
		}
	}

	private OptionRepository getOptions(Collection<DSEIndividual> individuals) {
		OptionsFactory factory = OptionsFactory.eINSTANCE;
		OptionRepository optionsRepository = factory.createOptionRepository();
		for (DSEIndividual individual: individuals) {
			addCandidate(individual, optionsRepository);
		}
		for (int i = 0; i < candidates.size(); i++) {
			PerOpteryxCandidate candidate = candidates.get(i);
			for (int j = i; j < candidates.size(); j++) {
				candidate.getAlternativeTo().add(candidates.get(j));
			}
		}
		return optionsRepository;
	}

	private void addCandidate(DSEIndividual individual, OptionRepository repo) {
		PeropteryxcandidatesFactory candidatesFactory = PeropteryxcandidatesFactory.eINSTANCE;
		PerOpteryxCandidate candidate = candidatesFactory.createPerOpteryxCandidate();
		prepareOption(candidate);
		repo.getOptions().add(candidate);
		candidate.setIsModelled(true);
		DSEObjectives objectives = individual.getObjectives();
		ResourceLoader toometaDefaults = new ResourceLoader();
		QualityTypeRepository defaultQualities = toometaDefaults.getDefaultQualityTypes();
		for (Objective objective: objectives.getKeys()) {
			PredictedQualityValue value = candidatesFactory.createPredictedQualityValue();
			Double doubleValue = objectives.get(objective).getDouble();
			value.setQualityValue(doubleValue);
			String peropteryxId = objective.getName().split("_")[0];
			// Mapping is done based on String that originates from dsexplore.launch.DSEConstantsContainer.QualityAttribute
			QualityType quality = defaultQualities.getQualityTypeByPerOpteryxId(peropteryxId);
			if (null != quality) {
				value.setQualityType(quality);
				candidate.getSimulationQualities().add(value);
			} else {
				logger.log(Level.DEBUG, "Unknown objective: " + peropteryxId + "!");
			}
		}
		candidates.add(candidate);
		addOptionsToCandidate(candidate, individual, repo);
	}

	private void addOptionsToCandidate(PerOpteryxCandidate candidate, DSEIndividual individual, OptionRepository repo) {
		List<Option> candidateOptions = new ArrayList<Option>();
		PeropteryxcandidatesFactory factory = PeropteryxcandidatesFactory.eINSTANCE;
		for (int i = 0; i < individual.getGenotype().size(); i++) {
			Choice choice = individual.getGenotype().get(i);
			PerOpteryxOption o = null;
			if (choice instanceof DiscreteRangeChoice) {
				o = factory.createPerOpteryxDiscreteRangeOption();
			} else if (choice instanceof ContinousRangeChoice) {
				o = factory.createPerOpteryxContinuousRangeOption();
			} else if (choice instanceof ClassChoice) {
				o = factory.createPerOpteryxClassOption();
			} else {
				//TODO: throw meaningful exception
			}
			prepareOption(o);
			o.setPrimaryChanged(choice.getDegreeOfFreedomInstance().getPrimaryChanged());
			o.setValue(choice.getValue());
			if (repo.getOptions().contains(o)) {
				int oIndex = repo.getOptions().indexOf(o);
				if (repo.getOptions().get(oIndex) instanceof PerOpteryxOption) {
					o = (PerOpteryxOption) repo.getOptions().get(oIndex);
				}
			}
			repo.getOptions().add(o);
			candidate.getSubOptions().add(o);
			candidateOptions.add(o);
		}
		optionsPerCandidate.add(candidateOptions);
	}

	private static void prepareOption(Option option) {
		option.setDescription("Imported from PerOpteryx");
		option.setTimeStamp(new Date());
	}

	private void setAlternatives(OptionRepository candidates) {
		for (int i = 0; i < optionsPerCandidate.size(); i++) {
			List<Option> options = optionsPerCandidate.get(i);
			for (int j = 0; j < options.size(); j++) {
				Option option = options.get(j);
				for (int k = i + 1; k < optionsPerCandidate.size(); k++) {
					if (j <= optionsPerCandidate.get(k).size() && null != optionsPerCandidate.get(k).get(j)) {
						option.getAlternativeTo().add(optionsPerCandidate.get(k).get(j));
					}
				}
			}
		}
	}

	private String getFileName(int iteration) {
		Date date = new Date();
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
		String stringDate = simpleFormat.format(date);
		stringDate = stringDate.replaceAll(":", "-").replaceAll(" ", "_");
		return this.path + "/peropteryx" + iteration + "_" + stringDate + ".options";
	}

	private void saveCandidates(OptionRepository repo, String fileURI) throws IOException {
		URI myURI = URI.createURI(fileURI);
		if (myURI == null || !myURI.isPlatform()){
			// if this is a device String such as C:\, transform it to the appropriate device URI
			myURI =	URI.createFileURI(fileURI);
		}
		EMFHelper.saveToXMIFile(repo, myURI);
	}

	@Override
	public IResultsHandlerLaunchConfigSettings getLaunchSettingsTab(Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell) {
		return new ResultsHandlerLaunchConfigSettings(parent, selectionListener, modifyListener, shell);
	}
}
