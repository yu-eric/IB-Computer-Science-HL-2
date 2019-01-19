package chapter9;

public class WorldClock extends Clock{
	int offset;

	/**
	 * Creates a new clock object, but with a timezone offset
	 * @param offset the offset in timezones
	 */
	public WorldClock(int offset) {
		this.offset = offset;
	}

	/**
	 * Offsets the hours by a certain number of timezones
	 * @return the current hour in a different timezone
	 */
	public String getHours() {
		int hours = Integer.parseInt(super.getHours());

		if(hours + offset >= 24) {
			return Integer.toString((hours + 3) - 24);
		} else if (hours - offset < 0) {
			return Integer.toString((hours - offset) + 24);
		} else {
			return Integer.toString(hours + offset);
		}
	}
}
