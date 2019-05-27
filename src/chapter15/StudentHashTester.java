package chapter15;

public class StudentHashTester {
	public static void main(String[] args) {
		StudentHash student1 = new StudentHash();
		StudentHash student2 = new StudentHash();
		student1.add();
		student2.add();

		System.out.println("The two students should be equal: " + student1.equals(student2));
	}
}
