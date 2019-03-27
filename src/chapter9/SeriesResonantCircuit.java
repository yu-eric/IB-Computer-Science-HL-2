package chapter9;

public class SeriesResonantCircuit extends ResonantCircuit {

	/**
	 * Displays the information about the series resonant circuit
	 * @return resonant circuit components and values
	 */
	public String display() {
		return "Series Resonant Circuit\n" + "Resonant Frequency: " + getResonantFrequency() + "\nBand Width: " + getBandWidth() + "\nGain: "
				+ getGain() + "\n\nR = " + getResistance() + "\nL = " + getInductance() + "\nC = "
				+ getCapacitance();
	}

	public double getCapacitance() {
		return 1/(getResonantFrequency() * (getGain() / getBandWidth()));
	}

	public double getResistance() {
		return 1/getGain();
	}

	public double getInductance() {
		return getGain() / getBandWidth();
	}
}
