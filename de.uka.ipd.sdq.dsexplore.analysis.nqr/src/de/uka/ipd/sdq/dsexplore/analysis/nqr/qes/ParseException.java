package de.uka.ipd.sdq.dsexplore.analysis.nqr.qes;

public class ParseException extends Exception {

	private static final long serialVersionUID = -3122819369501155701L;

	public ParseException(String message) {
		super(message);
	}

	public ParseException(Exception cause) {
		super(cause);
	}
	
	public ParseException(String message, Exception cause) {
		super(message, cause);
	}
	
}
