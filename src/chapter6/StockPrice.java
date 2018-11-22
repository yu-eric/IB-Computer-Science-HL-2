package chapter6;

/**
 * This class checks to see if a stock price has exceeded the target price.
 */
public class StockPrice {
	double targetPrice;

	/**
	 *	Initializes an instance of the StockPrice checker.
	 * @param userPrice The user's inputted price
	 */
	public StockPrice(double userPrice) {
		targetPrice = userPrice;
	}

	/**
	 * Checks to see if the current stock price has exceeded the target price.
	 * @param stockPrice the current stock price
	 * @return whether the stock price has exeeded the target price (true) or not (false)
	 */
	public boolean priceChecker(double stockPrice) {
		while(stockPrice < targetPrice) {return false;}
		return true;
	}
}
