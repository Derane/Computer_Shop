package exceptions;

public class NotFoundComputerException extends RuntimeException {

	public NotFoundComputerException() {
		super("Computer with this name not found!");
	}

}
