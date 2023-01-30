package computers.impl;

import computers.Computer;

import java.math.BigDecimal;

public class Tablet extends Computer {

	private final int builtInMemory;

	private final String frontCamera;


	public Tablet(String name, BigDecimal price, int RAM, String CPU, int builtInMemory, String frontCamera) {
		super(name, price, RAM, CPU);
		this.builtInMemory = builtInMemory;
		this.frontCamera = frontCamera;
	}

	@Override
	public String toString() {
		return "Tablet{" +
				"name='" + name + '\'' +
				", price=" + price +
				", RAM=" + RAM +
				", CPU='" + CPU + '\'' +
				", builtInMemory=" + builtInMemory +
				", frontCamera='" + frontCamera + '\'' +
				'}';
	}
}
