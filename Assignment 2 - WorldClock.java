/**
 * @author Jackson Coghill #041089141
 * @see Clock.java
 * @see ClockDemo.java
 * @see WorldClockDemo.java
 * @see AlarmClock.java
 * @see ClocksDemo.java
 * @version 1.0
 * @since Java 1.8
 */
package w23assignment2;
/**
 * WorldClock uses inherited methods from Clock as well as an overridden getTime() method to return a time that is offset from the current time zone.
 * This class would require modification to work in time zones that are + 30 or 45 minutes from the preceding zone (sorry, Newfoundland)
 */
public class WorldClock extends Clock {
	
	
	/**
	 * Offset represents the number of timezones removed from UTC we are calculating from. In this case, we are assuming the user's computer
	 * is based off UTC+00:00 time
	 */
	private int offset;
	
	/**
	 * @param offset is used to calculate the time difference between UTC+00:00 and a separate time zone ahead/behind in whole hours.
	 * Added guard rails to ensure user does not attempt UTC offsets beyond -12 and +14 hrs
	 */
	public WorldClock(int offset) {
		if (offset >= -12 && offset <= 14) {
		this.offset = offset;
		}
		else {
			throw new IllegalArgumentException("Offset must be between limits of -12 and +14 hours");
		}
	}
	
	/**
	 * This is an inherited method being overridden to enable it to return the correct time in a given time zone. Super is not used as we do
	 * not need the original getTime() method. This implementation does rely on the original getHours() and getMinutes() methods, however.
	 */
	@Override
	public String getTime() {

		int offsetHour = Integer.valueOf(getHours()) + offset;
		// if/else if statements used to keep return values within bounds of a 00:00-24:00 day
		if (offsetHour < 0) {
			offsetHour += 24;
		}
		else if (offsetHour > 23) {
			offsetHour -= 24;
		}
		return String.valueOf(offsetHour) + ":" + getMinutes();
	}
	
	//Further code could be implemented to throw errors for offset values outside of realistic limits (less than -12:00 and larger than +14:00)
	
}