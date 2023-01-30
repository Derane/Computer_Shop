package services.impl;

import computers.Computer;
import computers.impl.Desktop;
import computers.impl.Laptop;
import computers.impl.Tablet;
import customers.Payable;
import exceptions.NotFoundComputerException;
import services.ComputerShopService;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static computers.states.ComputerState.READY_FOR_DELIVERY;
import static java.math.BigDecimal.valueOf;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class ComputerShop implements ComputerShopService {

	private final Map<String, Computer> computers;

	public ComputerShop() {
		computers = Stream.of(
						new Tablet("Lenovo Tab M10 HD (2nd Gen)", valueOf(6999),
								3, "MediaTek Helio P22T (2.3 ГГц)", 32, "8mp"),
						new Tablet("Xiaomi Mi Pad 5 Wi-Fi 6/128 GB Cosmic Gray", valueOf(14999),
								6, " Qualcomm Snapdragon 860 (2.96 ГГц)", 128, "8mp"),
						new Desktop("ARTLINE Gaming X55 ", valueOf(39855), 16, "Intel Core i5-10400F",
								"QUBE NEPTUNE", "650 Вт"),
						new Desktop("Expert PC Ultimate ", valueOf(24732), 16, "Core i5-10400F",
								"Miditower", "500 Вт"),
						new Laptop("Apple MacBook Air 13 M2", valueOf(58999), 8, "Apple M2",
								true, "13.6\" (2560x1664) IPS"),
						new Laptop("Asus X515EP-BQ656", valueOf(23499), 12, "Intel Core i3-1115G4",
								false, "15.6\" IPS (1920x1080) Full HD")
				)
				.collect(toMap(Computer::getName, identity()));
	}

	public void buyComputerByName(Payable customer, String computerName) {
		Optional<Computer> maybeComputer = Optional.ofNullable(computers.get(computerName));

		Computer computer = maybeComputer.map(customer::buyComputer)
				.orElseThrow(NotFoundComputerException::new);

		computers.remove(computerName);

		computer.setComputerState(READY_FOR_DELIVERY);
	}

}
