package de.uka.ipd.sdq.dsexplore.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import de.uka.ipd.sdq.dsexplore.launch.IResultsHandlerLaunchConfigSettings;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;

public class ResultsHandlerController {
	private static Logger logger = Logger.getLogger(ResultsHandlerController.class);

	private static final String IRESTULSTHANDLER_ID = "de.uka.ipd.sdq.dsexplore.currentcandidates";

	private List<IResultsHandler> handlers = new ArrayList<IResultsHandler>();

	public ResultsHandlerController(IExtensionRegistry registry, ILaunchConfiguration configuration) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(IRESTULSTHANDLER_ID);
		try {
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IResultsHandler) {
					IResultsHandler handler = (IResultsHandler) o;
					handler.initialize(configuration);
					handlers.add(handler);
				}
			}
		} catch (CoreException ex) {
			logger.log(Level.WARN, ex.getMessage(), ex);
		}
	}

	public void handleResults(Collection<DSEIndividual> individuals, int iteration) {
		for (IResultsHandler handler: handlers) {
			executeExtension(handler, individuals, iteration);
		}
	}

	private static void executeExtension(final Object o, final Collection<DSEIndividual> individuals, final int iteration) {
		ISafeRunnable runnable = new ISafeRunnable() {
			@Override
			public void handleException(Throwable e) {
				logger.log(Level.WARN, "Exception in client: " + e.getMessage(), e);
			}

			@Override
			public void run() throws Exception {
				((IResultsHandler) o).handleResults(individuals, iteration);
			}
		};
		SafeRunner.run(runnable);
	}

	public static Map<String, IResultsHandlerLaunchConfigSettings> getResultHandlersLaunchConfigSettings(IExtensionRegistry registry, Composite parent, SelectionListener selectionListener, ModifyListener modifyListener, Shell shell) {
		Map<String, IResultsHandlerLaunchConfigSettings> launchConfigOptions = new HashMap<String, IResultsHandlerLaunchConfigSettings>();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(IRESTULSTHANDLER_ID);
		try {
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IResultsHandler) {
					IResultsHandler handler = (IResultsHandler) o;
					// TODO: SafeRunnable alternative that returns values...
					IResultsHandlerLaunchConfigSettings settings = handler.getLaunchSettingsTab(parent, selectionListener, modifyListener, shell);
					launchConfigOptions.put(settings.getLaunchConfigSettingsCaption(), settings);
				}
			}
		} catch (CoreException ex) {
			logger.log(Level.WARN, ex.getMessage(), ex);
		}
		return launchConfigOptions;
	}

	public static boolean resultHandlersAvailable(IExtensionRegistry registry) {
		if (0 < registry.getConfigurationElementsFor(IRESTULSTHANDLER_ID).length) {
			return true;
		}
		return false;
	}
}
