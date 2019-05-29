package chapter15;

import java.util.HashSet;
import java.util.Set;

public class StudentHashTester {
	public static void main(String[] args) {
		Set<StudentHash> hashSet = new HashSet<>();

		System.out.println("Hash Set Size " + hashSet.size());
		hashSet.add(new StudentHash("Eric", "Yu", 42));
		System.out.println("Hash Set Size " + hashSet.size());
		hashSet.add(new StudentHash("Eric", "Yu", 42));
		System.out.println("Hash Set Size " + hashSet.size());
		hashSet.add(new StudentHash("Eric", "Yu", 22));
		System.out.println("Hash Set Size " + hashSet.size());

	}
}
