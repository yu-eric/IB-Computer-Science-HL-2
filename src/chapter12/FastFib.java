package chapter12;

/**
 * This class compares the recursive runtime of a fibonacci series to the iterative runtime
 */
public class FastFib {

    /**
     * Recursive fibonacci method
     * @param n length of fibonacci list
     * @param fibList list of fibonacci series
     * @return List filled with fibonacci series
     */
    public long fastFibonacci(int n, long[] fibList) {
		if (fibList.length <= n) {
			return fibList[n - 1];
		} else {
			if (n < 3) {
				return 1;
			} else {
				fibList[n - 1] = fastFibonacci(n - 1, fibList) + fastFibonacci(n - 2, fibList);
			}
		}
		return fibList[n - 1];
	}

    /**
     * Iterative fibonacci method
     * @param n Length of fibonacci series
     * @return List of fibonacci
     */
    public long slowFibonacci(int n) {
        if(n < 2) {
            return n;
        } else {
            return slowFibonacci(n - 1) + slowFibonacci(n - 2);
        }
    }
}
