
public class InsufficientQuantityException extends RuntimeException{
	private final String message;

	public InsufficientQuantityException(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
