
public class InsufficientAmountException extends RuntimeException {
	private final String message;
	
	public InsufficientAmountException(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
