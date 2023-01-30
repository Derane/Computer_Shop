import customers.Payable;
import customers.impl.Customer;
import services.ComputerShopService;
import services.impl.ComputerShop;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ComputerShopRunner {

	private static final ComputerShopService computerShop = new ComputerShop();

	public static void main(String[] args) {

		Payable customer = new Customer(new ArrayList<>(), BigDecimal.valueOf(100000));

		computerShop.buyComputerByName(customer, "Lenovo Tab M10 HD (2nd Gen)");
		computerShop.buyComputerByName(customer, "Asus X515EP-BQ656");

		System.out.println(customer);
	}

}
