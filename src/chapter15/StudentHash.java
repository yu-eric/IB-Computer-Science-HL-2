package chapter15;

import java.util.HashMap;

public class StudentHash {
	HashMap<String, Integer> students = new HashMap<>();

	/**
	 * Adds the original value to the student's
	 */
	public void add() {
		students.put("Eric Yu", 8329209);
	}

	/**
	 * Checks if the two students are equal
	 * @param obj the object's hashcode to be compared
	 * @return whether the hashcodes are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof StudentHash)) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		return students.get("Eric Yu") == ((StudentHash) obj).students.get("Eric Yu");
	}
}