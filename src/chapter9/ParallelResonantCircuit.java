package chapter9;

public class ParallelResonantCircuit extends ResonantCircuit {

	/**
	 * Displays the information about the parallel resonant circuit
	 * @return resonant circuit components and values
	 */
	public String display() {
		return "Parallel Resonant Circuit\n" + "Resonant Frequency: " + getResonantFrequency() + "\nBand Width: " + getBandWidth() + "\nGain: " + getGain()
				+ "\n\nR = " + getGain() + "\nC = " + getCapacitance()
				+ "\nL = " + getInductance();
	}

	public double getCapacitance() {
		return 1/getBandWidth() * getGain();
	}

	public double getInductance() {
		return 1/(getResonantFrequency() * (1/(getBandWidth() * getGain())));
	}
}
