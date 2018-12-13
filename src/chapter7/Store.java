package chapter7;

import java.util.ArrayList;

/**
 * Represents the customers shopping
 */
public class Store {

	private ArrayList<Customer> customers;

	/**
	 * Creates an instance of the store
	 */
	public Store() {
		customers = new ArrayList<>();
	}

	/**
	 * Adds a customer with their sale to the store
	 * @param name name of customer
	 * @param amount amount spent
	 */
	public void addSale(String name, double amount) {
		Customer customer = new Customer(name, amount);
		customers.add(customer);
	}

	/**
	 * Finds the customer who spent the most
	 * @return the name of the customer who spent the most
	 */
	public String nameOfBestCustomer() {
		if(customers.isEmpty()) {
			return "No customers";
		}

		double maxAmount = customers.get(0).getAmount();
		Customer customer = customers.get(0);

		for(int i = 1; i < customers.size(); i++) {
			if(customers.get(i).getAmount() > maxAmount) {
				customer = customers.get(i);
			}
		}
		return customer.getName();
	}
}
