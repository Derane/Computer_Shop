package customers.impl;

import computers.Computer;
import customers.Payable;
import exceptions.NotEnoughMoneyException;

import java.math.BigDecimal;
import java.util.List;

public class Customer implements Payable {

	private final List<Computer> boughtComputers;

	private BigDecimal money;

	public Customer(List<Computer> computers, BigDecimal money) {
		this.boughtComputers = computers;
		this.money = money;
	}

	@Override
	public Computer buyComputer(Computer computer) {
		BigDecimal price = computer.getPrice();

		if (this.money.compareTo(price) >= 0) {
			this.boughtComputers.add(computer);
			this.money = this.money.subtract(price);
			return computer;
		}

		throw new NotEnoughMoneyException();
	}

	@Override
	public String toString() {
		return "Customer{" +
				"computers=" + boughtComputers +
				", money=" + money +
				'}';
	}
}
