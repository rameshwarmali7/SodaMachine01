
public class NoChangeException extends RuntimeException {
	private final String message;

	public NoChangeException(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
