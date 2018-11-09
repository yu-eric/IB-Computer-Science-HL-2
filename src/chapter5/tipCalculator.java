package chapter5;

/**
 * This class calculate the total bill cost after a tip, depending on how satisfied the user was with their meal.
 */
public class tipCalculator {

    /**
     * Calculates a 20 percent tip
     * @param bill the cost of the bill pre-tip
     * @return the cost of the bill with a 20 percent tip applied
     */
    public double totallySatisfied(double bill) {
        return bill * 1.2;
    }

    /**
     * Calculates a 15 percent tip
     * @param bill the cost of the bill pre-tip
     * @return the cost of the bill with a 15 percent tip applied
     */
    public double satisfied(double bill) {
        return bill * 1.15;
    }

    /**
     * Calculates a 10 percent tip
     * @param bill the cost of the bill pre-tip
     * @return the cost of the bill with a 10 percent tip applied
     */
    public double dissatisfied(double bill) {
        return bill * 1.1;
    }
}
