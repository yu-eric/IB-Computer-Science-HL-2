package chapter9;

public class ResonantCircuit {

	private double resonantFrequency = 0;
	private double bandWidth = 0;
	private double gain = 0;

	/**
	 * Gets the Resonant Frequency
	 * @return resonant frequency
	 */
	public double getResonantFrequency() {
		return resonantFrequency;
	}

	/**
	 * Sets the resonant frequency
	 * @param resonantFrequency desired resonant frequency
	 */
	public void setResonantFrequency(double resonantFrequency) {
		this.resonantFrequency = resonantFrequency;
	}

	/**
	 * Gets the band width
	 * @return band width
	 */
	public double getBandWidth() {
		return bandWidth;
	}

	/**
	 * Sets the band width
	 * @param bandWidth desired band width
	 */
	public void setBandWidth(double bandWidth) {
		this.bandWidth = bandWidth;
	}

	/**
	 * Gets the gain
	 * @return gain
	 */
	public double getGain() {
		return gain;
	}

	/**
	 * Sets the gain
	 * @param gain desired gain
	 */
	public void setGain(double gain) {
		this.gain = gain;
	}

	/**
	 * Displays the information about the resonant circuit
	 * @return resonant circuit components
	 */
	public String display() {
		return "Resonant Frequency: " + getResonantFrequency() + "\nBand Width: " + getBandWidth() + "\n Gain: " + getGain();
	}

}
