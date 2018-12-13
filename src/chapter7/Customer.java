package chapter7;

/**
 * Represents a customer and the amount they spent
 */
public class Customer {

	private String name;
	private double amount;

	/**
	 * Creates an instance of the customer
	 * @param name name of the customer
	 * @param amount amount spent by the customer
	 */
	public Customer(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	/**
	 * Returns the name of the customer
	 * @return customer name
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Returns the amount the customer spent
	 * @return amount spent
	 */
	public String getName() {
		return name;
	}
}
