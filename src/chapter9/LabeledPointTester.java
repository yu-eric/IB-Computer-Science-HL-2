package chapter9;

public class LabeledPointTester {

	public static void main(String[] args) {

		LabeledPoint point = new LabeledPoint("Single Point");
		point.setLocation(5, 9);
		System.out.println(point.toString());
	}
}
