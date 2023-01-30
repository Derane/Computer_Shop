package computers.impl;

import computers.Computer;

import java.math.BigDecimal;

public class Desktop extends Computer {

	private final String computerCase;

	private final String powerSupply;


	public Desktop(String name, BigDecimal price, int RAM, String CPU, String computerCase, String powerSupply) {
		super(name, price, RAM, CPU);
		this.computerCase = computerCase;
		this.powerSupply = powerSupply;
	}

	@Override
	public String toString() {
		return "Desktop{" +
				"name='" + name + '\'' +
				", price=" + price +
				", RAM=" + RAM +
				", CPU='" + CPU + '\'' +
				", computerCase='" + computerCase + '\'' +
				", powerSupply='" + powerSupply + '\'' +
				'}';
	}
}
