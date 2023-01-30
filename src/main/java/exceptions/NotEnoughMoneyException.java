package exceptions;

public class NotEnoughMoneyException extends RuntimeException {

	public NotEnoughMoneyException() {
		super("Customer have not enough money to buy this computer!");
	}

}
