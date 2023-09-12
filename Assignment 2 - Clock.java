/**
 * @author Jackson Coghill #041089141
 * @see ClockDemo.java
 * @see WorldClock.java
 * @see WorldClockDemo.java
 * @see AlarmClock.java
 * @see ClocksDemo.java
 * @version 1.0
 * @since Java 1.8
 */
package w23assignment2;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 * Clock is the superclass from which the WorldClock and AlarmClock will inherit. It has methods to extract local hours and minutes as a substring
 * from the LocalDateTime object, as well as a method to display the substrings in a 24 hour time format.
*/
public class Clock
{
	/**
	 * @return returns a substring of LocalDateTime corresponding to the local hour value
	 */
	public String getHours() {
		String timeString = LocalDateTime.ofInstant(Instant.now(),
              	 			ZoneId.systemDefault()).toString();
		//hour value extracted from LocalDateTime by utilizing substring
		return timeString.substring(11, 13);
	}
	
	/**
	 * @return returns a substring from LocalDateTime corresponding to the local minute value
	 */
	public String getMinutes() {
		String timeString = LocalDateTime.ofInstant(Instant.now(),
              	 			ZoneId.systemDefault()).toString();
		//minute value extracted from LocalDateTime string by utilizing substring
		return timeString.substring(14, 16);
	}
	
	/**
	 * @return returns the getHours() and getMinutes() substrings in HH:mm formatting
	 */
	public String getTime() {
		return getHours() + ":" + getMinutes();
	}

}
