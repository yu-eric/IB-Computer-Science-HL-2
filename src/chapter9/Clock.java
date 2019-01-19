package chapter9;

import java.time.ZonedDateTime;

public class Clock {
	ZonedDateTime hour = ZonedDateTime.now();

	/**
	 * Gets the current hour in the local timezone
	 * @return the current hour
	 */
	public String getHours() {
		return hour.toString().substring(11, 13);
	}

	/**
	 * Gets the current minute in the local timezone
	 * @return the current minute
	 */
	public String getMinutes() {
		return hour.toString().substring(14, 16);
	}

	/**
	 * Returns the local time in hour:minute format
	 * @return the local time
	 */
	public String getTime() {
		return getHours() + ":" + getMinutes();
	}
}
