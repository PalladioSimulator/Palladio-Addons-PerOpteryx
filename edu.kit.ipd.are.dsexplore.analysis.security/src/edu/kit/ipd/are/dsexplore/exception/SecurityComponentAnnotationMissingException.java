/**
 * 
 */
package edu.kit.ipd.are.dsexplore.exception;

/**
 * @author jankeim
 *
 */
public class SecurityComponentAnnotationMissingException extends AnnotationMissingException {

	/**
	 * 
	 */
	public SecurityComponentAnnotationMissingException() {
		super();
	}

	/**
	 * @param message
	 */
	public SecurityComponentAnnotationMissingException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SecurityComponentAnnotationMissingException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SecurityComponentAnnotationMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public SecurityComponentAnnotationMissingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
