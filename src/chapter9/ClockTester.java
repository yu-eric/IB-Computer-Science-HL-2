package chapter9;

public class ClockTester {

	public static void main(String[] args) {

		Clock clock = new Clock();
		System.out.println(clock.getTime());

		WorldClock california = new WorldClock(-2);
		System.out.println(california.getTime());
	}
}
