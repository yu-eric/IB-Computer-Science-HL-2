package chapter15;

import java.util.HashMap;

/**
 * Implements a student that has a first name, last name, and student ID
 */
public class StudentHash {

	private int studentID;
	private String firstName;
	private String lastName;

	/**
	 * Initializes the StudentHash object
	 * @param firstName first name
	 * @param lastName last name
	 * @param studentID student ID
	 */
	public StudentHash(String firstName, String lastName, int studentID) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets a student's ID
	 * @return student ID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * Sets a student's ID
	 * @param studentID student ID
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * Gets a student's first name
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets a student's first name
	 * @param firstName first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets a student's last name
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets a student's last name
	 * @param lastName last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Checks whether two student objects are equal
	 * @param a student object
	 * @return whether the students are equal
	 */
	public boolean equals(Object a) {
		if(a instanceof StudentHash) {
			StudentHash other = (StudentHash) a;
			if(lastName.equals(other.getLastName()) && firstName.equals(other.getFirstName())) {
				return studentID == other.getStudentID();
			}
		}
		return false;
	}

	/**
	 * Generates a hashcode
	 * @return hashcode
	 */
	public int hashCode() {
		int prime = 31;
		int result = 1;

		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + studentID;

		return result;
	}
}