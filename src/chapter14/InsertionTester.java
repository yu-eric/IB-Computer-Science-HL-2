package chapter14;

import java.util.Random;

/**
 * This class is not only a tester for insertion sort, but also measures the running time
 */
public class InsertionTester {
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		Random randNumGenerator = new Random();
		int[] x = new int[5000];
		for (int i=0; i<x.length; i++)
		{
			x[i] = (randNumGenerator.nextInt(10000)+1);
		}
		double currentTime = System.currentTimeMillis();
		is.sort(x);
		double runTime = System.currentTimeMillis() - currentTime;

		System.out.println("The sorted list runtime is: " + runTime + " miliseconds");
	}
}
