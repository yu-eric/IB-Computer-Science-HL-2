package chapter15;

import java.util.LinkedList;
import java.util.Scanner;

public class DownsizeMeTester {

	public static void main(String[] args) {
		DownsizeMe dm = new DownsizeMe();
		LinkedList<String> employees = new LinkedList<>();
		employees.add("Bob");
		employees.add("James");
		employees.add("Bill");
		employees.add("Burt");
		employees.add("Karen");
		employees.add("Jonah");

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the nth employee to be removed: ");
		int num = in.nextInt();

		System.out.println("Employees in the list: ");
		for(String n : employees) {
			System.out.print(n + ", ");
		}

		dm.downsize(employees, num);
		System.out.println("After removing the " + num + " employee, here are the ones left: ");
		for(String n : employees) {
			System.out.print(n + ", ");
		}
	}
}
