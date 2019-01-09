package chapter8;

public class CustomerLoyalty {

	double purchaseAmount = 0;

	/**
	 * Adds the item cost to total purchase cost
	 * @param amount the cost of the item
	 */
	public void makePurchase(double amount) {
		purchaseAmount += amount;
	}

	/**
	 * Checks if the shopper has reacher $100 in purchases or more
	 * @return true or false
	 */
	public boolean discountReached() {
		if(purchaseAmount >= 100) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Gets the total amount purchased by the user
	 * @return total purchase amount
	 */
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
}
