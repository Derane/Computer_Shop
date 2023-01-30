import customers.Payable;
import customers.impl.Customer;
import services.ComputerShopService;
import services.impl.ComputerShop;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ComputerShopRunner {

	private final ComputerShopService computerShop;

	public ComputerShopRunner(ComputerShopService computerShop) {
		this.computerShop = computerShop;
	}

	public static void main(String[] args) {
		ComputerShopService computerShopService = new ComputerShop();
		Payable customer = new Customer(new ArrayList<>(), BigDecimal.valueOf(100000));

		computerShopService.buyComputerByName(customer, "Lenovo Tab M10 HD (2nd Gen)");
		computerShopService.buyComputerByName(customer, "Asus X515EP-BQ656");

		System.out.println(customer);
	}

}
