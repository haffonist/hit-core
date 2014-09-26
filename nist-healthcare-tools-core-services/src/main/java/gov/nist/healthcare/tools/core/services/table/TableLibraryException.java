package gov.nist.healthcare.tools.core.services.table;

public class TableLibraryException extends Exception {
	private static final long serialVersionUID = 1L;

	public TableLibraryException(String message) {
		super(message);
	}

	public TableLibraryException(Exception exception) {
		super(exception);
	}
}