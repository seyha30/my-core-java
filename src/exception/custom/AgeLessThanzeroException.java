package exception.custom;

public class AgeLessThanzeroException extends Exception {
	public AgeLessThanzeroException() {

	}

	public AgeLessThanzeroException(String message) {
		super(message);

	}

	public AgeLessThanzeroException(Throwable cause) {
		super(cause);

	}
	public AgeLessThanzeroException(String message, Throwable  cause) {
		super(message,cause);
		
	}

}
