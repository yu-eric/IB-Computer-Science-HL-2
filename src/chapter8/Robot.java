package chapter8;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class simulates a robot that wanders around an infinite plane and can be commanded to move
 */
public class Robot {

	private int directionCounter = 0;
	String[] direction = {"N", "E", "S", "W"};
	private String currentDirection = direction[0];

	Point position = new Point(0,0);

	/**
	 * Turns the robot left
	 */
	public void turnLeft() {
		if(currentDirection.equals("N")) {
			currentDirection = direction[3];
			directionCounter = 3;
		} else {
			directionCounter--;
			currentDirection = direction[directionCounter];
		}
	}

	/**
	 * Turns the robot right
	 */
	public void turnRight() {
		if(currentDirection.equals("W")) {
			currentDirection = direction[0];
			directionCounter = 0;
		} else {
			directionCounter++;
			currentDirection = direction[directionCounter];
		}
	}

	/**
	 * Moves the robot one unit forward
	 */
	public void move() {
		switch(currentDirection) {
			case "N":
				position.translate(0, 1);
				break;
			case "E":
				position.translate(1, 0);
				break;
			case "S":
				position.translate(0, -1);
				break;
			case "W":
				position.translate(-1, 0);
				break;
		}
	}

	/**
	 * Gets the point the robot is currently at
	 * @return a point containing the robot's position
	 */
	public Point getLocation() {
		return position;
	}

	/**
	 * Gets the direction the robot is facing
	 * @return a compass direction
	 */
	public String getDirection() {
		return currentDirection;
	}
}
