/**
 *
 */
package edu.kit.ipd.are.dsexplore.analysis.sec.activator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Jan
 *
 */
public class Activator extends Plugin implements BundleActivator {

	private static Logger logger = Logger.getLogger(Activator.class);
	private static Activator plugin;

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		logger.debug("Hi from start()... meh");
		super.start(context);
		plugin = this;

	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		logger.debug("Hi from stop()");
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
