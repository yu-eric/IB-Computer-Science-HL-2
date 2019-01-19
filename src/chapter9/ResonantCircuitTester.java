package chapter9;

import java.util.Scanner;

public class ResonantCircuitTester {

	public static void main(String[] args) {

		ResonantCircuit rc = new ResonantCircuit();
		ParallelResonantCircuit prc = new ParallelResonantCircuit();
		SeriesResonantCircuit src = new SeriesResonantCircuit();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the resonant frequency of the circuit: ");
		double rf = in.nextDouble();
		rc.setResonantFrequency(rf);
		prc.setResonantFrequency(rf);
		src.setResonantFrequency(rf);

		System.out.println("Enter the band width of the circuit: ");
		double bw = in.nextDouble();
		rc.setBandWidth(bw);
		prc.setBandWidth(bw);
		src.setBandWidth(bw);

		System.out.println("Enter the gain of the circuit: ");
		double g = in.nextDouble();
		rc.setGain(g);
		prc.setGain(g);
		src.setGain(g);

		System.out.println(prc.display() + "\n");
		System.out.println(src.display());
	}
}
