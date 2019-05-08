package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port;

/**
 * The Exception class for the {@link FCCModule}.
 *
 * @author Dominik Fuchss
 *
 */
public final class FCCWeaverException extends RuntimeException {

	private static final long serialVersionUID = -2804000183074726527L;

	/**
	 * Create Exception by message.
	 *
	 * @param message
	 *            the message
	 */
	public FCCWeaverException(String message) {
		super(message);
	}

}
