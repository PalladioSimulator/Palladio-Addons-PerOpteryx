/**
 * 
 */
package edu.kit.ipd.are.dsexplore.exception;

/**
 * @author jankeim
 *
 */
public class AnnotationMissingException extends RuntimeException {

	private static final long serialVersionUID = 6913350480605365695L;

	/**
	 * 
	 */
	public AnnotationMissingException() {
		super();
	}

	/**
	 * @param message
	 */
	public AnnotationMissingException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AnnotationMissingException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AnnotationMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AnnotationMissingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
