package computers;

import computers.states.ComputerState;

import java.math.BigDecimal;

import static computers.states.ComputerState.*;

public abstract class Computer {

	protected String name;

	protected BigDecimal price;

	protected int RAM;

	protected String CPU;

	protected ComputerState computerState;

	public Computer(String name, BigDecimal price, int RAM, String CPU) {
		this.name = name;
		this.price = price;
		this.RAM = RAM;
		this.CPU = CPU;
		this.computerState = SELLING;
	}

	public void setComputerState(ComputerState computerState) {
		this.computerState = computerState;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
