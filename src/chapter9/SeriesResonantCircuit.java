package chapter9;

public class SeriesResonantCircuit extends ResonantCircuit {

	/**
	 * Displays the information about the series resonant circuit
	 * @return resonant circuit components and values
	 */
	public String display() {
		return "Series Resonant Circuit\n" + "Resonant Frequency: " + getResonantFrequency() + "\nBand Width: " + getBandWidth() + "\nGain: "
				+ getGain() + "\n\nR = " + (1/getGain()) + "\nL = " + (getGain() / getBandWidth()) + "\nC = "
				+ (1/(getResonantFrequency() * (getGain() / getBandWidth())));
	}
}
