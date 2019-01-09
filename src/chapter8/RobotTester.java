package chapter8;

import java.util.Scanner;

/**
 * Tester for the Robot class
 */
public class RobotTester {

	public static void main(String[] args) {

		Robot robot = new Robot();
		Scanner in = new Scanner(System.in);
		System.out.println("Type L to turn left, R to turn right, M to move, or Q to quit.");
		String input = in.nextLine();

		do {

			if(input.equals("L")) {
				robot.turnLeft();
			} else if(input.equals("R")) {
				robot.turnRight();
			} else if(input.equals("M")) {
				robot.move();
			} else if(input.equals("Q")) {
				break;
			}
			else {
				System.out.println("Sorry, input not recognized, please try again.");
			}
			System.out.println("Type L to turn left, R to turn right, M to move, or Q to quit.");
			input = in.nextLine();
		} 	while(!input.equals("Q"));


		System.out.printf("Your robot is facing %s and is at point (%d, %d)", robot.getDirection(), ((int) robot.position.getX()), ((int) robot.position.getY()));
	}
}
