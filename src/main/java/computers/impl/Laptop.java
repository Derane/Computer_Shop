package computers.impl;

import computers.Computer;

import java.math.BigDecimal;

public class Laptop extends Computer {

	private final boolean keyboardBacklight;

	private final String monitor;

	public Laptop(String name, BigDecimal price, int RAM, String CPU, boolean keyboardBacklight, String monitor) {
		super(name, price, RAM, CPU);
		this.keyboardBacklight = keyboardBacklight;
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"name='" + name + '\'' +
				", price=" + price +
				", RAM=" + RAM +
				", CPU='" + CPU + '\'' +
				", keyboardBacklight=" + keyboardBacklight +
				", monitor='" + monitor + '\'' +
				'}';
	}
}
