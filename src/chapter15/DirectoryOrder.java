package chapter15;

import java.util.Collections;
import java.util.List;

/**
 * This class orders a list in numeric value instead of the default alphabetic value
 */
public class DirectoryOrder {
	/**
	 * Orders a list based on numeric value, then alphabetic
	 * @param s String with number value
	 * @return number that can be compared
	 */
	public int compareInt(String s) {
		String num = s.replaceAll("\\D", "");
		if(num.isEmpty()) {
			return 0;
		} else {
			return Integer.parseInt(num);
		}
	}
}
